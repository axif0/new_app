package p148g.p189d.p190a.p200b.p230r0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: g.d.a.b.r0.s */
final class C4280s implements C4261b {
    C4280s() {
    }

    /* renamed from: a */
    public long mo13411a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public long mo13412b() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    public C4266g mo13413c(Looper looper, Handler.Callback callback) {
        return new C4281t(new Handler(looper, callback));
    }
}
