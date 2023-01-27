package kotlinx.coroutines.p368c1;

import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.c1.s */
final class C6032s {

    /* renamed from: a */
    private Object[] f16990a;

    /* renamed from: b */
    private int f16991b;

    /* renamed from: c */
    private final C5899f f16992c;

    public C6032s(C5899f fVar, int i) {
        C5956g.m24501f(fVar, "context");
        this.f16992c = fVar;
        this.f16990a = new Object[i];
    }

    /* renamed from: a */
    public final void mo17095a(Object obj) {
        Object[] objArr = this.f16990a;
        int i = this.f16991b;
        this.f16991b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: b */
    public final C5899f mo17096b() {
        return this.f16992c;
    }

    /* renamed from: c */
    public final void mo17097c() {
        this.f16991b = 0;
    }

    /* renamed from: d */
    public final Object mo17098d() {
        Object[] objArr = this.f16990a;
        int i = this.f16991b;
        this.f16991b = i + 1;
        return objArr[i];
    }
}
