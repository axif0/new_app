package com.bumptech.glide.load.p008o;

import com.bumptech.glide.C0967d;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.C0971h;
import com.bumptech.glide.load.C0995d;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1005l;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p008o.C1101h;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p010b0.C1066a;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p014q.C1234c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.g */
final class C1100g<Transcode> {

    /* renamed from: a */
    private final List<C1188n.C1189a<?>> f4118a = new ArrayList();

    /* renamed from: b */
    private final List<C0998g> f4119b = new ArrayList();

    /* renamed from: c */
    private C0967d f4120c;

    /* renamed from: d */
    private Object f4121d;

    /* renamed from: e */
    private int f4122e;

    /* renamed from: f */
    private int f4123f;

    /* renamed from: g */
    private Class<?> f4124g;

    /* renamed from: h */
    private C1101h.C1106e f4125h;

    /* renamed from: i */
    private C1002i f4126i;

    /* renamed from: j */
    private Map<Class<?>, C1006m<?>> f4127j;

    /* renamed from: k */
    private Class<Transcode> f4128k;

    /* renamed from: l */
    private boolean f4129l;

    /* renamed from: m */
    private boolean f4130m;

    /* renamed from: n */
    private C0998g f4131n;

    /* renamed from: o */
    private C0969f f4132o;

    /* renamed from: p */
    private C1112j f4133p;

    /* renamed from: q */
    private boolean f4134q;

    /* renamed from: r */
    private boolean f4135r;

    C1100g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5331a() {
        this.f4120c = null;
        this.f4121d = null;
        this.f4131n = null;
        this.f4124g = null;
        this.f4128k = null;
        this.f4126i = null;
        this.f4132o = null;
        this.f4127j = null;
        this.f4133p = null;
        this.f4118a.clear();
        this.f4129l = false;
        this.f4119b.clear();
        this.f4130m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1042b mo5332b() {
        return this.f4120c.mo5056b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C0998g> mo5333c() {
        if (!this.f4130m) {
            this.f4130m = true;
            this.f4119b.clear();
            List<C1188n.C1189a<?>> g = mo5337g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C1188n.C1189a aVar = g.get(i);
                if (!this.f4119b.contains(aVar.f4360a)) {
                    this.f4119b.add(aVar.f4360a);
                }
                for (int i2 = 0; i2 < aVar.f4361b.size(); i2++) {
                    if (!this.f4119b.contains(aVar.f4361b.get(i2))) {
                        this.f4119b.add(aVar.f4361b.get(i2));
                    }
                }
            }
        }
        return this.f4119b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1066a mo5334d() {
        return this.f4125h.mo5371a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1112j mo5335e() {
        return this.f4133p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo5336f() {
        return this.f4123f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C1188n.C1189a<?>> mo5337g() {
        if (!this.f4129l) {
            this.f4129l = true;
            this.f4118a.clear();
            List i = this.f4120c.mo5062h().mo5071i(this.f4121d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1188n.C1189a a = ((C1188n) i.get(i2)).mo5453a(this.f4121d, this.f4122e, this.f4123f, this.f4126i);
                if (a != null) {
                    this.f4118a.add(a);
                }
            }
        }
        return this.f4118a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C1138t<Data, ?, Transcode> mo5338h(Class<Data> cls) {
        return this.f4120c.mo5062h().mo5070h(cls, this.f4124g, this.f4128k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo5339i() {
        return this.f4121d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C1188n<File, ?>> mo5340j(File file) throws C0971h.C0974c {
        return this.f4120c.mo5062h().mo5071i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1002i mo5341k() {
        return this.f4126i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0969f mo5342l() {
        return this.f4132o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo5343m() {
        return this.f4120c.mo5062h().mo5072j(this.f4121d.getClass(), this.f4124g, this.f4128k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> C1005l<Z> mo5344n(C1141v<Z> vVar) {
        return this.f4120c.mo5062h().mo5073k(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0998g mo5345o() {
        return this.f4131n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> C0995d<X> mo5346p(X x) throws C0971h.C0976e {
        return this.f4120c.mo5062h().mo5075m(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo5347q() {
        return this.f4128k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> C1006m<Z> mo5348r(Class<Z> cls) {
        C1006m<Z> mVar = this.f4127j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, C1006m<?>>> it = this.f4127j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (C1006m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f4127j.isEmpty() || !this.f4134q) {
            return C1234c.m6260c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo5349s() {
        return this.f4122e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5350t(Class<?> cls) {
        return mo5338h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <R> void mo5351u(C0967d dVar, Object obj, C0998g gVar, int i, int i2, C1112j jVar, Class<?> cls, Class<R> cls2, C0969f fVar, C1002i iVar, Map<Class<?>, C1006m<?>> map, boolean z, boolean z2, C1101h.C1106e eVar) {
        this.f4120c = dVar;
        this.f4121d = obj;
        this.f4131n = gVar;
        this.f4122e = i;
        this.f4123f = i2;
        this.f4133p = jVar;
        this.f4124g = cls;
        this.f4125h = eVar;
        this.f4128k = cls2;
        this.f4132o = fVar;
        this.f4126i = iVar;
        this.f4127j = map;
        this.f4134q = z;
        this.f4135r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo5352v(C1141v<?> vVar) {
        return this.f4120c.mo5062h().mo5076n(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo5353w() {
        return this.f4135r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo5354x(C0998g gVar) {
        List<C1188n.C1189a<?>> g = mo5337g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f4360a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
