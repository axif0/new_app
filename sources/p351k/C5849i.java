package p351k;

import java.io.Serializable;
import p351k.p361v.p363d.C5956g;

/* renamed from: k.i */
public final class C5849i<A, B> implements Serializable {

    /* renamed from: f */
    private final A f16878f;

    /* renamed from: g */
    private final B f16879g;

    public C5849i(A a, B b) {
        this.f16878f = a;
        this.f16879g = b;
    }

    /* renamed from: a */
    public final A mo16858a() {
        return this.f16878f;
    }

    /* renamed from: b */
    public final B mo16859b() {
        return this.f16879g;
    }

    /* renamed from: c */
    public final A mo16860c() {
        return this.f16878f;
    }

    /* renamed from: d */
    public final B mo16861d() {
        return this.f16879g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5849i)) {
            return false;
        }
        C5849i iVar = (C5849i) obj;
        return C5956g.m24496a(this.f16878f, iVar.f16878f) && C5956g.m24496a(this.f16879g, iVar.f16879g);
    }

    public int hashCode() {
        A a = this.f16878f;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f16879g;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f16878f + ", " + this.f16879g + ')';
    }
}
