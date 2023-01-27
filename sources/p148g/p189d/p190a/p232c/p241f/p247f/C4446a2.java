package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import p086f.p111h.p112e.C3268b;

/* renamed from: g.d.a.c.f.f.a2 */
final class C4446a2 implements C4819v1 {

    /* renamed from: c */
    private static C4446a2 f13971c;

    /* renamed from: a */
    private final Context f13972a;

    /* renamed from: b */
    private final ContentObserver f13973b;

    private C4446a2() {
        this.f13972a = null;
        this.f13973b = null;
    }

    private C4446a2(Context context) {
        this.f13972a = context;
        this.f13973b = new C4483c2(this, (Handler) null);
        context.getContentResolver().registerContentObserver(C4686n1.f14302a, true, this.f13973b);
    }

    /* renamed from: a */
    static C4446a2 m18695a(Context context) {
        C4446a2 a2Var;
        synchronized (C4446a2.class) {
            if (f13971c == null) {
                f13971c = C3268b.m14082b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4446a2(context) : new C4446a2();
            }
            a2Var = f13971c;
        }
        return a2Var;
    }

    /* renamed from: b */
    static synchronized void m18696b() {
        synchronized (C4446a2.class) {
            if (!(f13971c == null || f13971c.f13972a == null || f13971c.f13973b == null)) {
                f13971c.f13972a.getContentResolver().unregisterContentObserver(f13971c.f13973b);
            }
            f13971c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String mo13773e(String str) {
        if (this.f13972a == null) {
            return null;
        }
        try {
            return (String) C4869y1.m20619a(new C4890z1(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo13772c(String str) {
        return C4686n1.m19994a(this.f13972a.getContentResolver(), str, (String) null);
    }
}
