package p148g.p189d.p190a.p232c.p237d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C0575h;
import androidx.fragment.app.C0636d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C1631d;
import com.google.android.gms.common.internal.C1633e;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1686i;
import com.google.android.gms.common.util.C1689l;
import p148g.p189d.p190a.p232c.p235b.C4330a;
import p148g.p189d.p190a.p232c.p235b.C4331b;
import p148g.p189d.p190a.p232c.p241f.p243b.C4413d;

/* renamed from: g.d.a.c.d.e */
public class C4372e extends C4375f {

    /* renamed from: d */
    private static final Object f13910d = new Object();

    /* renamed from: e */
    private static final C4372e f13911e = new C4372e();

    /* renamed from: c */
    private String f13912c;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: g.d.a.c.d.e$a */
    private class C4373a extends C4413d {

        /* renamed from: a */
        private final Context f13913a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4373a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f13913a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int g = C4372e.this.mo13698g(this.f13913a);
            if (C4372e.this.mo13700i(g)) {
                C4372e.this.mo13704o(this.f13913a, g);
            }
        }
    }

    /* renamed from: m */
    public static C4372e m18564m() {
        return f13911e;
    }

    /* renamed from: p */
    static Dialog m18565p(Context context, int i, C1633e eVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C1631d.m7770d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C1631d.m7769c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, eVar);
        }
        String g = C1631d.m7773g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        return builder.create();
    }

    /* renamed from: q */
    static void m18566q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof C0636d) {
            C4382m.m18611X1(dialog, onCancelListener).mo3292W1(((C0636d) activity).mo3317z(), str);
            return;
        }
        C4368c.m18554a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: s */
    private final void m18567s(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo13705r(context);
        } else if (pendingIntent != null) {
            String f = C1631d.m7772f(context, i);
            String e = C1631d.m7771e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0575h.C0580e eVar = new C0575h.C0580e(context);
            eVar.mo2851q(true);
            eVar.mo2841f(true);
            eVar.mo2846k(f);
            C0575h.C0578c cVar = new C0575h.C0578c();
            cVar.mo2835g(e);
            eVar.mo2857w(cVar);
            if (C1686i.m7952c(context)) {
                C1658o.m7848m(C1689l.m7963f());
                eVar.mo2855u(context.getApplicationInfo().icon);
                eVar.mo2853s(2);
                if (C1686i.m7953d(context)) {
                    eVar.mo2838a(C4330a.common_full_open_on_phone, resources.getString(C4331b.common_open_on_phone), pendingIntent);
                } else {
                    eVar.mo2844i(pendingIntent);
                }
            } else {
                eVar.mo2855u(17301642);
                eVar.mo2858x(resources.getString(C4331b.common_google_play_services_notification_ticker));
                eVar.mo2837A(System.currentTimeMillis());
                eVar.mo2844i(pendingIntent);
                eVar.mo2845j(e);
            }
            if (C1689l.m7966i()) {
                C1658o.m7848m(C1689l.m7966i());
                String u = m18568u();
                if (u == null) {
                    u = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(u);
                    String b = C1631d.m7768b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(u, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.mo2842g(u);
            }
            Notification b2 = eVar.mo2839b();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C4379j.f13921d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: u */
    private final String m18568u() {
        String str;
        synchronized (f13910d) {
            str = this.f13912c;
        }
        return str;
    }

    /* renamed from: b */
    public Intent mo13695b(Context context, int i, String str) {
        return super.mo13695b(context, i, str);
    }

    /* renamed from: c */
    public PendingIntent mo13696c(Context context, int i, int i2) {
        return super.mo13696c(context, i, i2);
    }

    /* renamed from: e */
    public final String mo13697e(int i) {
        return super.mo13697e(i);
    }

    /* renamed from: g */
    public int mo13698g(Context context) {
        return super.mo13698g(context);
    }

    /* renamed from: h */
    public int mo13699h(Context context, int i) {
        return super.mo13699h(context, i);
    }

    /* renamed from: i */
    public final boolean mo13700i(int i) {
        return super.mo13700i(i);
    }

    /* renamed from: k */
    public Dialog mo13701k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m18565p(activity, i, C1633e.m7786a(activity, mo13695b(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: l */
    public PendingIntent mo13702l(Context context, C4366b bVar) {
        return bVar.mo13678i() ? bVar.mo13676h() : mo13696c(context, bVar.mo13673d(), 0);
    }

    /* renamed from: n */
    public boolean mo13703n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k = mo13701k(activity, i, i2, onCancelListener);
        if (k == null) {
            return false;
        }
        m18566q(activity, k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: o */
    public void mo13704o(Context context, int i) {
        m18567s(context, i, (String) null, mo13709d(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo13705r(Context context) {
        new C4373a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: t */
    public final boolean mo13706t(Context context, C4366b bVar, int i) {
        PendingIntent l = mo13702l(context, bVar);
        if (l == null) {
            return false;
        }
        m18567s(context, bVar.mo13673d(), (String) null, GoogleApiActivity.m7495a(context, l, i));
        return true;
    }
}
