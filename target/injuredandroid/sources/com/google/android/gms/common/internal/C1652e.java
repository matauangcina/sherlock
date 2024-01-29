package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1699g;
import p000a.p014d.C0079g;
import p054b.p059c.p060a.p061a.p062a.C1143b;
import p054b.p059c.p060a.p061a.p063b.C1150f;
import p054b.p059c.p060a.p061a.p063b.C1153i;
import p054b.p059c.p060a.p061a.p063b.p066m.C1158b;
/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes.dex */
public final class C1652e {

    /* renamed from: a */
    private static final C0079g<String, String> f4798a = new C0079g<>();

    /* renamed from: a */
    public static String m3709a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C1158b.m4754a(context).m4756b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m3708b(Context context) {
        return context.getResources().getString(C1143b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m3707c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C1143b.common_google_play_services_enable_button : C1143b.common_google_play_services_update_button : C1143b.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m3706d(Context context, int i) {
        Resources resources = context.getResources();
        String m3709a = m3709a(context);
        if (i != 1) {
            if (i == 2) {
                return C1699g.m3557c(context) ? resources.getString(C1143b.common_google_play_services_wear_update_text) : resources.getString(C1143b.common_google_play_services_update_text, m3709a);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return m3701i(context, "common_google_play_services_api_unavailable_text", m3709a);
                                    case 17:
                                        return m3701i(context, "common_google_play_services_sign_in_failed_text", m3709a);
                                    case 18:
                                        return resources.getString(C1143b.common_google_play_services_updating_text, m3709a);
                                    default:
                                        return resources.getString(C1153i.common_google_play_services_unknown_issue, m3709a);
                                }
                            }
                            return m3701i(context, "common_google_play_services_restricted_profile_text", m3709a);
                        }
                        return resources.getString(C1143b.common_google_play_services_unsupported_text, m3709a);
                    }
                    return m3701i(context, "common_google_play_services_network_error_text", m3709a);
                }
                return m3701i(context, "common_google_play_services_invalid_account_text", m3709a);
            } else {
                return resources.getString(C1143b.common_google_play_services_enable_text, m3709a);
            }
        }
        return resources.getString(C1143b.common_google_play_services_install_text, m3709a);
    }

    /* renamed from: e */
    public static String m3705e(Context context, int i) {
        return (i == 6 || i == 19) ? m3701i(context, "common_google_play_services_resolution_required_text", m3709a(context)) : m3706d(context, i);
    }

    /* renamed from: f */
    public static String m3704f(Context context, int i) {
        String m3702h = i == 6 ? m3702h(context, "common_google_play_services_resolution_required_title") : m3703g(context, i);
        return m3702h == null ? context.getResources().getString(C1143b.common_google_play_services_notification_ticker) : m3702h;
    }

    /* renamed from: g */
    public static String m3703g(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C1143b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C1143b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C1143b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m3702h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m3702h(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m3702h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m3702h(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    /* renamed from: h */
    private static String m3702h(Context context, String str) {
        synchronized (f4798a) {
            String str2 = f4798a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m4782b = C1150f.m4782b(context);
            if (m4782b == null) {
                return null;
            }
            int identifier = m4782b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = m4782b.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f4798a.put(str, string);
                return string;
            }
            String valueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    /* renamed from: i */
    private static String m3701i(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m3702h = m3702h(context, str);
        if (m3702h == null) {
            m3702h = resources.getString(C1153i.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m3702h, str2);
    }
}
