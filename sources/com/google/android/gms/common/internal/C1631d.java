package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1686i;
import p086f.p102e.C3203g;
import p148g.p189d.p190a.p232c.p235b.C4331b;
import p148g.p189d.p190a.p232c.p237d.C4378i;
import p148g.p189d.p190a.p232c.p237d.C4381l;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C1631d {

    /* renamed from: a */
    private static final C3203g<String, String> f5486a = new C3203g<>();

    /* renamed from: a */
    public static String m7767a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C4389c.m18627a(context).mo13716d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m7768b(Context context) {
        return context.getResources().getString(C4331b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m7769c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C4331b.common_google_play_services_enable_button : C4331b.common_google_play_services_update_button : C4331b.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m7770d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m7767a(context);
        if (i == 1) {
            return resources.getString(C4331b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C4331b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m7775i(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m7775i(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C4331b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m7775i(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m7775i(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m7775i(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C4331b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C4381l.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C1686i.m7953d(context)) {
            return resources.getString(C4331b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C4331b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: e */
    public static String m7771e(Context context, int i) {
        return i == 6 ? m7775i(context, "common_google_play_services_resolution_required_text", m7767a(context)) : m7770d(context, i);
    }

    /* renamed from: f */
    public static String m7772f(Context context, int i) {
        String h = i == 6 ? m7774h(context, "common_google_play_services_resolution_required_title") : m7773g(context, i);
        return h == null ? context.getResources().getString(C4331b.common_google_play_services_notification_ticker) : h;
    }

    /* renamed from: g */
    public static String m7773g(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C4331b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C4331b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C4331b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m7774h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m7774h(context, "common_google_play_services_network_error_title");
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
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m7774h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m7774h(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    /* renamed from: h */
    private static String m7774h(Context context, String str) {
        synchronized (f5486a) {
            String str2 = f5486a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d = C4378i.m18592d(context);
            if (d == null) {
                return null;
            }
            int identifier = d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = d.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            f5486a.put(str, string);
            return string;
        }
    }

    /* renamed from: i */
    private static String m7775i(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = m7774h(context, str);
        if (h == null) {
            h = resources.getString(C4381l.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h, new Object[]{str2});
    }
}
