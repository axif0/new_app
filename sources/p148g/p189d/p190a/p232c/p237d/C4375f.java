package p148g.p189d.p190a.p232c.p237d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1634e0;
import com.google.android.gms.common.util.C1686i;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: g.d.a.c.d.f */
public class C4375f {

    /* renamed from: a */
    public static final int f13916a = C4379j.f13918a;

    /* renamed from: b */
    private static final C4375f f13917b = new C4375f();

    C4375f() {
    }

    /* renamed from: f */
    public static C4375f m18582f() {
        return f13917b;
    }

    /* renamed from: j */
    private static String m18583j(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f13916a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C4389c.m18627a(context).mo13717e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo13708a(Context context) {
        return C4379j.m18593a(context);
    }

    /* renamed from: b */
    public Intent mo13695b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !C1686i.m7953d(context)) ? C1634e0.m7788a("com.google.android.gms", m18583j(context, str)) : C1634e0.m7790c();
        }
        if (i != 3) {
            return null;
        }
        return C1634e0.m7789b("com.google.android.gms");
    }

    /* renamed from: c */
    public PendingIntent mo13696c(Context context, int i, int i2) {
        return mo13709d(context, i, i2, (String) null);
    }

    /* renamed from: d */
    public PendingIntent mo13709d(Context context, int i, int i2, String str) {
        Intent b = mo13695b(context, i, str);
        if (b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b, 134217728);
    }

    /* renamed from: e */
    public String mo13697e(int i) {
        return C4379j.m18594b(i);
    }

    /* renamed from: g */
    public int mo13698g(Context context) {
        return mo13699h(context, f13916a);
    }

    /* renamed from: h */
    public int mo13699h(Context context, int i) {
        int f = C4379j.m18598f(context, i);
        if (C4379j.m18599g(context, f)) {
            return 18;
        }
        return f;
    }

    /* renamed from: i */
    public boolean mo13700i(int i) {
        return C4379j.m18602j(i);
    }
}
