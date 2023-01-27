package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p008o.C1098f;
import com.bumptech.glide.load.p012p.C1188n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.c */
class C1088c implements C1098f, C1010d.C1011a<Object> {

    /* renamed from: f */
    private final List<C0998g> f4093f;

    /* renamed from: g */
    private final C1100g<?> f4094g;

    /* renamed from: h */
    private final C1098f.C1099a f4095h;

    /* renamed from: i */
    private int f4096i;

    /* renamed from: j */
    private C0998g f4097j;

    /* renamed from: k */
    private List<C1188n<File, ?>> f4098k;

    /* renamed from: l */
    private int f4099l;

    /* renamed from: m */
    private volatile C1188n.C1189a<?> f4100m;

    /* renamed from: n */
    private File f4101n;

    C1088c(C1100g<?> gVar, C1098f.C1099a aVar) {
        this(gVar.mo5333c(), gVar, aVar);
    }

    C1088c(List<C0998g> list, C1100g<?> gVar, C1098f.C1099a aVar) {
        this.f4096i = -1;
        this.f4093f = list;
        this.f4094g = gVar;
        this.f4095h = aVar;
    }

    /* renamed from: b */
    private boolean m5829b() {
        return this.f4099l < this.f4098k.size();
    }

    /* renamed from: a */
    public boolean mo5307a() {
        while (true) {
            boolean z = false;
            if (this.f4098k == null || !m5829b()) {
                int i = this.f4096i + 1;
                this.f4096i = i;
                if (i >= this.f4093f.size()) {
                    return false;
                }
                C0998g gVar = this.f4093f.get(this.f4096i);
                File b = this.f4094g.mo5334d().mo5279b(new C1096d(gVar, this.f4094g.mo5345o()));
                this.f4101n = b;
                if (b != null) {
                    this.f4097j = gVar;
                    this.f4098k = this.f4094g.mo5340j(b);
                    this.f4099l = 0;
                }
            } else {
                this.f4100m = null;
                while (!z && m5829b()) {
                    List<C1188n<File, ?>> list = this.f4098k;
                    int i2 = this.f4099l;
                    this.f4099l = i2 + 1;
                    this.f4100m = list.get(i2).mo5453a(this.f4101n, this.f4094g.mo5349s(), this.f4094g.mo5336f(), this.f4094g.mo5341k());
                    if (this.f4100m != null && this.f4094g.mo5350t(this.f4100m.f4362c.mo5162a())) {
                        this.f4100m.f4362c.mo5172f(this.f4094g.mo5342l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: c */
    public void mo5178c(Exception exc) {
        this.f4095h.mo5329g(this.f4097j, exc, this.f4100m.f4362c, C0992a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C1188n.C1189a<?> aVar = this.f4100m;
        if (aVar != null) {
            aVar.f4362c.cancel();
        }
    }

    /* renamed from: d */
    public void mo5179d(Object obj) {
        this.f4095h.mo5330h(this.f4097j, obj, this.f4100m.f4362c, C0992a.DATA_DISK_CACHE, this.f4097j);
    }
}
