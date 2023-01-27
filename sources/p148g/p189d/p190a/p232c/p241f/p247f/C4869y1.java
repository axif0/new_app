package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Binder;

/* renamed from: g.d.a.c.f.f.y1 */
public final /* synthetic */ class C4869y1 {
    /* renamed from: a */
    public static <V> V m20619a(C4852x1<V> x1Var) {
        long clearCallingIdentity;
        try {
            return x1Var.mo14665a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = x1Var.mo14665a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
