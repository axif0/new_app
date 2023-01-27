package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p008o.C1098f;
import com.bumptech.glide.load.p012p.C1188n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.w */
class C1142w implements C1098f, C1010d.C1011a<Object> {

    /* renamed from: f */
    private final C1098f.C1099a f4289f;

    /* renamed from: g */
    private final C1100g<?> f4290g;

    /* renamed from: h */
    private int f4291h;

    /* renamed from: i */
    private int f4292i = -1;

    /* renamed from: j */
    private C0998g f4293j;

    /* renamed from: k */
    private List<C1188n<File, ?>> f4294k;

    /* renamed from: l */
    private int f4295l;

    /* renamed from: m */
    private volatile C1188n.C1189a<?> f4296m;

    /* renamed from: n */
    private File f4297n;

    /* renamed from: o */
    private C1143x f4298o;

    C1142w(C1100g<?> gVar, C1098f.C1099a aVar) {
        this.f4290g = gVar;
        this.f4289f = aVar;
    }

    /* renamed from: b */
    private boolean m6027b() {
        return this.f4295l < this.f4294k.size();
    }

    /* renamed from: a */
    public boolean mo5307a() {
        List<C0998g> c = this.f4290g.mo5333c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f4290g.mo5343m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f4294k == null || !m6027b()) {
                    int i = this.f4292i + 1;
                    this.f4292i = i;
                    if (i >= m.size()) {
                        int i2 = this.f4291h + 1;
                        this.f4291h = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f4292i = 0;
                    }
                    C0998g gVar = c.get(this.f4291h);
                    Class cls = m.get(this.f4292i);
                    C0998g gVar2 = gVar;
                    this.f4298o = new C1143x(this.f4290g.mo5332b(), gVar2, this.f4290g.mo5345o(), this.f4290g.mo5349s(), this.f4290g.mo5336f(), this.f4290g.mo5348r(cls), cls, this.f4290g.mo5341k());
                    File b = this.f4290g.mo5334d().mo5279b(this.f4298o);
                    this.f4297n = b;
                    if (b != null) {
                        this.f4293j = gVar;
                        this.f4294k = this.f4290g.mo5340j(b);
                        this.f4295l = 0;
                    }
                } else {
                    this.f4296m = null;
                    while (!z && m6027b()) {
                        List<C1188n<File, ?>> list = this.f4294k;
                        int i3 = this.f4295l;
                        this.f4295l = i3 + 1;
                        this.f4296m = list.get(i3).mo5453a(this.f4297n, this.f4290g.mo5349s(), this.f4290g.mo5336f(), this.f4290g.mo5341k());
                        if (this.f4296m != null && this.f4290g.mo5350t(this.f4296m.f4362c.mo5162a())) {
                            this.f4296m.f4362c.mo5172f(this.f4290g.mo5342l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f4290g.mo5347q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f4290g.mo5339i() + " to " + this.f4290g.mo5347q());
        }
    }

    /* renamed from: c */
    public void mo5178c(Exception exc) {
        this.f4289f.mo5329g(this.f4298o, exc, this.f4296m.f4362c, C0992a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C1188n.C1189a<?> aVar = this.f4296m;
        if (aVar != null) {
            aVar.f4362c.cancel();
        }
    }

    /* renamed from: d */
    public void mo5179d(Object obj) {
        this.f4289f.mo5330h(this.f4293j, obj, this.f4296m.f4362c, C0992a.RESOURCE_DISK_CACHE, this.f4298o);
    }
}
