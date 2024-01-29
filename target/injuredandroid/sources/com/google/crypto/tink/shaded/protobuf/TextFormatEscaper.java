package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFormatEscaper {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() { // from class: com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.1
            @Override // com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return ByteString.this.byteAt(i);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return ByteString.this.size();
            }
        });
    }

    static String escapeBytes(ByteSequence byteSequence) {
        String str;
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            int byteAt = byteSequence.byteAt(i);
            if (byteAt == 34) {
                str = "\\\"";
            } else if (byteAt == 39) {
                str = "\\'";
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            byteAt = (byteAt & 7) + 48;
                        }
                        sb.append((char) byteAt);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() { // from class: com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.2
            @Override // com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return bArr[i];
            }

            @Override // com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }
        });
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }
}
