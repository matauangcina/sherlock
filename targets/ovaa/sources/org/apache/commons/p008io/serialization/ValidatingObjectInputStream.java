package org.apache.commons.p008io.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* renamed from: org.apache.commons.io.serialization.ValidatingObjectInputStream */
/* loaded from: classes.dex */
public class ValidatingObjectInputStream extends ObjectInputStream {
    private final List<ClassNameMatcher> acceptMatchers;
    private final List<ClassNameMatcher> rejectMatchers;

    public ValidatingObjectInputStream(InputStream input) throws IOException {
        super(input);
        this.acceptMatchers = new ArrayList();
        this.rejectMatchers = new ArrayList();
    }

    private void validateClassName(String name) throws InvalidClassException {
        for (ClassNameMatcher m : this.rejectMatchers) {
            if (m.matches(name)) {
                invalidClassNameFound(name);
            }
        }
        boolean ok = false;
        Iterator<ClassNameMatcher> it = this.acceptMatchers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ClassNameMatcher m2 = it.next();
            if (m2.matches(name)) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            invalidClassNameFound(name);
        }
    }

    protected void invalidClassNameFound(String className) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + className);
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass osc) throws IOException, ClassNotFoundException {
        validateClassName(osc.getName());
        return super.resolveClass(osc);
    }

    public ValidatingObjectInputStream accept(Class<?>... classes) {
        for (Class<?> c : classes) {
            this.acceptMatchers.add(new FullClassNameMatcher(c.getName()));
        }
        return this;
    }

    public ValidatingObjectInputStream reject(Class<?>... classes) {
        for (Class<?> c : classes) {
            this.rejectMatchers.add(new FullClassNameMatcher(c.getName()));
        }
        return this;
    }

    public ValidatingObjectInputStream accept(String... patterns) {
        for (String pattern : patterns) {
            this.acceptMatchers.add(new WildcardClassNameMatcher(pattern));
        }
        return this;
    }

    public ValidatingObjectInputStream reject(String... patterns) {
        for (String pattern : patterns) {
            this.rejectMatchers.add(new WildcardClassNameMatcher(pattern));
        }
        return this;
    }

    public ValidatingObjectInputStream accept(Pattern pattern) {
        this.acceptMatchers.add(new RegexpClassNameMatcher(pattern));
        return this;
    }

    public ValidatingObjectInputStream reject(Pattern pattern) {
        this.rejectMatchers.add(new RegexpClassNameMatcher(pattern));
        return this;
    }

    public ValidatingObjectInputStream accept(ClassNameMatcher m) {
        this.acceptMatchers.add(m);
        return this;
    }

    public ValidatingObjectInputStream reject(ClassNameMatcher m) {
        this.rejectMatchers.add(m);
        return this;
    }
}
