package p340io.realm;

import p340io.realm.internal.Util;

/* renamed from: io.realm.v */
public class C5803v extends RuntimeException {

    /* renamed from: f */
    private final C5765m f16799f;

    /* renamed from: g */
    private final String f16800g;

    /* renamed from: h */
    private final int f16801h;

    /* renamed from: i */
    private final String f16802i;

    /* renamed from: j */
    private final Throwable f16803j;

    public C5803v(C5765m mVar, String str) {
        this(mVar, mVar.mo16734h(), mVar.mo16735j(), str, (Throwable) null);
    }

    public C5803v(C5765m mVar, String str, int i, String str2, Throwable th) {
        this.f16799f = mVar;
        this.f16800g = str;
        this.f16801h = i;
        this.f16802i = str2;
        this.f16803j = th;
    }

    public C5803v(String str, int i, String str2) {
        this(C5765m.UNKNOWN, str, i, str2, (Throwable) null);
    }

    /* renamed from: a */
    public C5765m mo16804a() {
        return this.f16799f;
    }

    /* renamed from: b */
    public int mo16805b() {
        return this.f16801h;
    }

    /* renamed from: c */
    public String mo16806c() {
        return this.f16800g;
    }

    /* renamed from: d */
    public Throwable mo16807d() {
        return this.f16803j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo16804a().name());
        sb.append("(");
        sb.append(mo16806c());
        sb.append(":");
        sb.append(mo16805b());
        sb.append(')');
        if (this.f16802i != null) {
            sb.append(": ");
            sb.append(this.f16802i);
        }
        if (this.f16803j != null) {
            sb.append(10);
            sb.append(Util.m23790c(this.f16803j));
        }
        return sb.toString();
    }
}
