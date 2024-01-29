package net.gotev.uploadservice.schemehandlers;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SchemeHandlerFactory {
    private LinkedHashMap<String, Class<? extends SchemeHandler>> handlers;

    /* loaded from: classes.dex */
    private static class LazyHolder {
        private static final SchemeHandlerFactory INSTANCE = new SchemeHandlerFactory();

        private LazyHolder() {
        }
    }

    public static SchemeHandlerFactory getInstance() {
        return LazyHolder.INSTANCE;
    }

    private SchemeHandlerFactory() {
        LinkedHashMap<String, Class<? extends SchemeHandler>> linkedHashMap = new LinkedHashMap<>();
        this.handlers = linkedHashMap;
        linkedHashMap.put("/", FileSchemeHandler.class);
        this.handlers.put("content://", ContentSchemeHandler.class);
    }

    public SchemeHandler get(String path) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for (Map.Entry<String, Class<? extends SchemeHandler>> handler : this.handlers.entrySet()) {
            if (path.startsWith(handler.getKey())) {
                SchemeHandler schemeHandler = handler.getValue().newInstance();
                schemeHandler.init(path);
                return schemeHandler;
            }
        }
        throw new UnsupportedOperationException("No handlers for " + path);
    }

    public boolean isSupported(String path) {
        for (String scheme : this.handlers.keySet()) {
            if (path.startsWith(scheme)) {
                return true;
            }
        }
        return false;
    }
}
