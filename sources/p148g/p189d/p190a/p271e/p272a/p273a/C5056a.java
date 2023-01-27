package p148g.p189d.p190a.p271e.p272a.p273a;

import android.app.PendingIntent;

/* renamed from: g.d.a.e.a.a.a */
public abstract class C5056a {
    /* renamed from: c */
    public static C5056a m21366c(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new C5081w(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    /* renamed from: f */
    private final boolean m21367f(C5061d dVar) {
        return dVar.mo15172a() && mo15147a() <= mo15150e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract long mo15147a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final PendingIntent mo15148b(C5061d dVar) {
        if (dVar.mo15173b() != 0) {
            if (dVar.mo15173b() == 1) {
                if (mo15152h() != null) {
                    return mo15152h();
                }
                if (m21367f(dVar)) {
                    return mo15155k();
                }
            }
            return null;
        } else if (mo15154j() != null) {
            return mo15154j();
        } else {
            if (m21367f(dVar)) {
                return mo15156l();
            }
            return null;
        }
    }

    /* renamed from: d */
    public abstract int mo15149d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract long mo15150e();

    /* renamed from: g */
    public abstract long mo15151g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract PendingIntent mo15152h();

    /* renamed from: i */
    public abstract Integer mo15153i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract PendingIntent mo15154j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract PendingIntent mo15155k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract PendingIntent mo15156l();

    /* renamed from: m */
    public abstract int mo15157m();

    /* renamed from: n */
    public boolean mo15158n(int i) {
        return mo15148b(C5061d.m21394c(i)) != null;
    }

    /* renamed from: o */
    public boolean mo15159o(C5061d dVar) {
        return mo15148b(dVar) != null;
    }

    /* renamed from: p */
    public abstract String mo15160p();

    /* renamed from: q */
    public abstract long mo15161q();

    /* renamed from: r */
    public abstract int mo15162r();

    /* renamed from: s */
    public abstract int mo15163s();
}
