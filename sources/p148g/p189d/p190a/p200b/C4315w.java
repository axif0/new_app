package p148g.p189d.p190a.p200b;

import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.w */
public final class C4315w {

    /* renamed from: d */
    public static final C4315w f13800d = new C4315w(1.0f, 1.0f);

    /* renamed from: a */
    public final float f13801a;

    /* renamed from: b */
    public final float f13802b;

    /* renamed from: c */
    private final int f13803c;

    public C4315w(float f, float f2) {
        boolean z = true;
        C4260a.m18069a(f > 0.0f);
        C4260a.m18069a(f2 <= 0.0f ? false : z);
        this.f13801a = f;
        this.f13802b = f2;
        this.f13803c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long mo13587a(long j) {
        return j * ((long) this.f13803c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4315w.class != obj.getClass()) {
            return false;
        }
        C4315w wVar = (C4315w) obj;
        return this.f13801a == wVar.f13801a && this.f13802b == wVar.f13802b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f13801a)) * 31) + Float.floatToRawIntBits(this.f13802b);
    }
}
