package p148g.p189d.p190a.p200b.p204k0.p209s;

import java.io.EOFException;
import java.io.IOException;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.s.e */
final class C3986e {

    /* renamed from: i */
    private static final int f12408i = C4284w.m18249o("OggS");

    /* renamed from: a */
    public int f12409a;

    /* renamed from: b */
    public int f12410b;

    /* renamed from: c */
    public long f12411c;

    /* renamed from: d */
    public int f12412d;

    /* renamed from: e */
    public int f12413e;

    /* renamed from: f */
    public int f12414f;

    /* renamed from: g */
    public final int[] f12415g = new int[255];

    /* renamed from: h */
    private final C4274m f12416h = new C4274m(255);

    C3986e() {
    }

    /* renamed from: a */
    public boolean mo12834a(C3916f fVar, boolean z) throws IOException, InterruptedException {
        this.f12416h.mo13450F();
        mo12835b();
        if (!(fVar.mo12722d() == -1 || fVar.mo12722d() - fVar.mo12726h() >= 27) || !fVar.mo12725g(this.f12416h.f13643a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f12416h.mo13481z() == ((long) f12408i)) {
            int x = this.f12416h.mo13479x();
            this.f12409a = x;
            if (x == 0) {
                this.f12410b = this.f12416h.mo13479x();
                this.f12411c = this.f12416h.mo13468m();
                this.f12416h.mo13469n();
                this.f12416h.mo13469n();
                this.f12416h.mo13469n();
                int x2 = this.f12416h.mo13479x();
                this.f12412d = x2;
                this.f12413e = x2 + 27;
                this.f12416h.mo13450F();
                fVar.mo12727i(this.f12416h.f13643a, 0, this.f12412d);
                for (int i = 0; i < this.f12412d; i++) {
                    this.f12415g[i] = this.f12416h.mo13479x();
                    this.f12414f += this.f12415g[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new C4313u("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new C4313u("expected OggS capture pattern at begin of page");
        }
    }

    /* renamed from: b */
    public void mo12835b() {
        this.f12409a = 0;
        this.f12410b = 0;
        this.f12411c = 0;
        this.f12412d = 0;
        this.f12413e = 0;
        this.f12414f = 0;
    }
}
