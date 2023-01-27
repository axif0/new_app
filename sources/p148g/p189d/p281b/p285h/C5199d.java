package p148g.p189d.p281b.p285h;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: g.d.b.h.d */
class C5199d {

    /* renamed from: b */
    private static C5199d f15251b;

    /* renamed from: a */
    private final SharedPreferences f15252a;

    private C5199d(Context context) {
        this.f15252a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* renamed from: a */
    static synchronized C5199d m21738a(Context context) {
        C5199d dVar;
        synchronized (C5199d.class) {
            if (f15251b == null) {
                f15251b = new C5199d(context);
            }
            dVar = f15251b;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo15321b(long j) {
        return mo15322c("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo15322c(String str, long j) {
        if (!this.f15252a.contains(str)) {
            this.f15252a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f15252a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f15252a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
