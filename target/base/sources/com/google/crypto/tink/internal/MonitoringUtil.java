package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import com.google.crypto.tink.proto.KeyStatusType;
import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes.dex */
public final class MonitoringUtil {
    public static final MonitoringClient.Logger DO_NOTHING_LOGGER = new DoNothingLogger(null);
    private static final String TYPE_URL_PREFIX = "type.googleapis.com/google.crypto.";

    /* loaded from: classes.dex */
    private static class DoNothingLogger implements MonitoringClient.Logger {
        private DoNothingLogger() {
        }

        /* synthetic */ DoNothingLogger(C10041 x0) {
            this();
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void log(int keyId, long numBytesAsInput) {
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void logFailure() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.MonitoringUtil$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10041 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private static KeyStatus parseStatus(KeyStatusType in) {
        switch (C10041.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[in.ordinal()]) {
            case 1:
                return KeyStatus.ENABLED;
            case 2:
                return KeyStatus.DISABLED;
            case 3:
                return KeyStatus.DESTROYED;
            default:
                throw new IllegalStateException("Unknown key status");
        }
    }

    private static String parseKeyTypeUrl(String keyTypeUrl) {
        if (!keyTypeUrl.startsWith(TYPE_URL_PREFIX)) {
            return keyTypeUrl;
        }
        return keyTypeUrl.substring(TYPE_URL_PREFIX.length());
    }

    public static <P> MonitoringKeysetInfo getMonitoringKeysetInfo(PrimitiveSet<P> primitiveSet) {
        MonitoringKeysetInfo.Builder builder = MonitoringKeysetInfo.newBuilder();
        builder.setAnnotations(primitiveSet.getAnnotations());
        for (List<PrimitiveSet.Entry<P>> entries : primitiveSet.getAll()) {
            for (PrimitiveSet.Entry<P> entry : entries) {
                builder.addEntry(parseStatus(entry.getStatus()), entry.getKeyId(), parseKeyTypeUrl(entry.getKeyType()), entry.getOutputPrefixType().name());
            }
        }
        PrimitiveSet.Entry<P> primary = primitiveSet.getPrimary();
        if (primary != null) {
            builder.setPrimaryKeyId(primitiveSet.getPrimary().getKeyId());
        }
        try {
            return builder.build();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    private MonitoringUtil() {
    }
}
