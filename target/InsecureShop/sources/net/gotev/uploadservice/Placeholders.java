package net.gotev.uploadservice;
/* loaded from: classes.dex */
public class Placeholders {
    public static final String ELAPSED_TIME = "[[ELAPSED_TIME]]";
    public static final String PROGRESS = "[[PROGRESS]]";
    public static final String TOTAL_FILES = "[[TOTAL_FILES]]";
    public static final String UPLOADED_FILES = "[[UPLOADED_FILES]]";
    public static final String UPLOAD_RATE = "[[UPLOAD_RATE]]";

    public static String replace(String string, UploadInfo uploadInfo) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        String tmp = string.replace(ELAPSED_TIME, uploadInfo.getElapsedTimeString());
        return tmp.replace(PROGRESS, uploadInfo.getProgressPercent() + "%").replace(UPLOAD_RATE, uploadInfo.getUploadRateString()).replace(UPLOADED_FILES, Integer.toString(uploadInfo.getSuccessfullyUploadedFiles().size())).replace(TOTAL_FILES, Integer.toString(uploadInfo.getTotalFiles()));
    }
}
