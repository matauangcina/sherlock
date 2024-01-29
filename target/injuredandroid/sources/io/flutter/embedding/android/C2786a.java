package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import com.google.crypto.tink.shaded.protobuf.Reader;
import io.flutter.embedding.engine.p159i.C2872c;
import io.flutter.plugin.editing.C2934d;
import java.util.ArrayDeque;
import java.util.Deque;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.embedding.android.a */
/* loaded from: classes.dex */
public class C2786a {

    /* renamed from: a */
    private final C2872c f6906a;

    /* renamed from: b */
    private int f6907b;

    /* renamed from: c */
    private C2787a f6908c;

    /* renamed from: io.flutter.embedding.android.a$a */
    /* loaded from: classes.dex */
    private static class C2787a implements C2872c.InterfaceC2873a {

        /* renamed from: a */
        final Deque<KeyEvent> f6909a = new ArrayDeque();

        /* renamed from: b */
        private final View f6910b;

        /* renamed from: c */
        private final C2934d f6911c;

        public C2787a(View view, C2934d c2934d) {
            this.f6910b = view;
            this.f6911c = c2934d;
        }

        /* renamed from: f */
        private KeyEvent m738f(KeyEvent keyEvent) {
            if (this.f6909a.size() == 0) {
                throw new AssertionError("Event response received when no events are in the queue. Received event " + keyEvent);
            } else if (this.f6909a.getFirst() == keyEvent) {
                return this.f6909a.getFirst();
            } else {
                throw new AssertionError("Event response received out of order. Should have seen event " + this.f6909a.getFirst() + " first. Instead, received " + keyEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public boolean m737g(KeyEvent keyEvent) {
            return this.f6909a.size() > 0 && this.f6909a.getFirst() == keyEvent;
        }

        /* renamed from: h */
        private void m736h(KeyEvent keyEvent) {
            if (this.f6911c.m317n().isAcceptingText() && this.f6911c.m316o() != null && this.f6911c.m316o().sendKeyEvent(keyEvent)) {
                m735i();
                return;
            }
            View view = this.f6910b;
            if (view != null) {
                view.getRootView().dispatchKeyEvent(keyEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public KeyEvent m735i() {
            return this.f6909a.removeFirst();
        }

        @Override // io.flutter.embedding.engine.p159i.C2872c.InterfaceC2873a
        /* renamed from: a */
        public void mo471a(KeyEvent keyEvent) {
            m735i();
        }

        @Override // io.flutter.embedding.engine.p159i.C2872c.InterfaceC2873a
        /* renamed from: b */
        public void mo470b(KeyEvent keyEvent) {
            m736h(m738f(keyEvent));
        }

        /* renamed from: e */
        public void m739e(KeyEvent keyEvent) {
            this.f6909a.addLast(keyEvent);
            if (this.f6909a.size() > 1000) {
                C1499b.m4052b("AndroidKeyProcessor", "There are " + this.f6909a.size() + " keyboard events that have not yet received a response. Are responses being sent?");
            }
        }
    }

    public C2786a(View view, C2872c c2872c, C2934d c2934d) {
        this.f6906a = c2872c;
        c2934d.m337A(this);
        C2787a c2787a = new C2787a(view, c2934d);
        this.f6908c = c2787a;
        this.f6906a.m472f(c2787a);
    }

    /* renamed from: a */
    private Character m745a(int i) {
        if (i == 0) {
            return null;
        }
        char c = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i2 = i & Reader.READ_DONE;
            int i3 = this.f6907b;
            if (i3 != 0) {
                i2 = KeyCharacterMap.getDeadChar(i3, i2);
            }
            this.f6907b = i2;
        } else {
            int i4 = this.f6907b;
            if (i4 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                if (deadChar > 0) {
                    c = (char) deadChar;
                }
                this.f6907b = 0;
            }
        }
        return Character.valueOf(c);
    }

    /* renamed from: b */
    public void m744b() {
        this.f6906a.m472f(null);
    }

    /* renamed from: c */
    public boolean m743c(KeyEvent keyEvent) {
        return this.f6908c.m737g(keyEvent);
    }

    /* renamed from: d */
    public boolean m742d(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            if (this.f6908c.m737g(keyEvent)) {
                this.f6908c.m735i();
                return false;
            }
            C2872c.C2874b c2874b = new C2872c.C2874b(keyEvent, m745a(keyEvent.getUnicodeChar()));
            this.f6908c.m739e(keyEvent);
            C2872c c2872c = this.f6906a;
            if (action == 0) {
                c2872c.m475c(c2874b);
            } else {
                c2872c.m474d(c2874b);
            }
            return true;
        }
        return false;
    }
}
