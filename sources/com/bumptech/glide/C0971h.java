package com.bumptech.glide;

import com.bumptech.glide.load.C0995d;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.C1005l;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p006n.C1012e;
import com.bumptech.glide.load.p006n.C1014f;
import com.bumptech.glide.load.p008o.C1110i;
import com.bumptech.glide.load.p008o.C1138t;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.load.p012p.C1190o;
import com.bumptech.glide.load.p012p.C1191p;
import com.bumptech.glide.load.p014q.p020i.C1314e;
import com.bumptech.glide.load.p014q.p020i.C1315f;
import com.bumptech.glide.p024p.C1350a;
import com.bumptech.glide.p024p.C1352b;
import com.bumptech.glide.p024p.C1353c;
import com.bumptech.glide.p024p.C1354d;
import com.bumptech.glide.p024p.C1355e;
import com.bumptech.glide.p024p.C1357f;
import com.bumptech.glide.p029s.p030l.C1404a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.h */
public class C0971h {

    /* renamed from: a */
    private final C1191p f3861a;

    /* renamed from: b */
    private final C1350a f3862b;

    /* renamed from: c */
    private final C1355e f3863c;

    /* renamed from: d */
    private final C1357f f3864d;

    /* renamed from: e */
    private final C1014f f3865e;

    /* renamed from: f */
    private final C1315f f3866f;

    /* renamed from: g */
    private final C1352b f3867g;

    /* renamed from: h */
    private final C1354d f3868h = new C1354d();

    /* renamed from: i */
    private final C1353c f3869i = new C1353c();

    /* renamed from: j */
    private final C3346e<List<Throwable>> f3870j;

    /* renamed from: com.bumptech.glide.h$a */
    public static class C0972a extends RuntimeException {
        public C0972a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    public static final class C0973b extends C0972a {
        public C0973b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.h$c */
    public static class C0974c extends C0972a {
        public C0974c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public C0974c(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }
    }

    /* renamed from: com.bumptech.glide.h$d */
    public static class C0975d extends C0972a {
        public C0975d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.h$e */
    public static class C0976e extends C0972a {
        public C0976e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C0971h() {
        C3346e<List<Throwable>> e = C1404a.m6997e();
        this.f3870j = e;
        this.f3861a = new C1191p(e);
        this.f3862b = new C1350a();
        this.f3863c = new C1355e();
        this.f3864d = new C1357f();
        this.f3865e = new C1014f();
        this.f3866f = new C1315f();
        this.f3867g = new C1352b();
        mo5080r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C1110i<Data, TResource, Transcode>> m5420f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f3863c.mo5761d(cls, cls2)) {
            for (Class next2 : this.f3866f.mo5673b(next, cls3)) {
                arrayList.add(new C1110i(cls, next, next2, this.f3863c.mo5760b(cls, next), this.f3866f.mo5672a(next, next2), this.f3870j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> C0971h mo5064a(Class<Data> cls, C0995d<Data> dVar) {
        this.f3862b.mo5749a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <TResource> C0971h mo5065b(Class<TResource> cls, C1005l<TResource> lVar) {
        this.f3864d.mo5764a(cls, lVar);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> C0971h mo5066c(Class<Data> cls, Class<TResource> cls2, C1004k<Data, TResource> kVar) {
        mo5068e("legacy_append", cls, cls2, kVar);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> C0971h mo5067d(Class<Model> cls, Class<Data> cls2, C1190o<Model, Data> oVar) {
        this.f3861a.mo5504a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> C0971h mo5068e(String str, Class<Data> cls, Class<TResource> cls2, C1004k<Data, TResource> kVar) {
        this.f3863c.mo5759a(str, kVar, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> mo5069g() {
        List<ImageHeaderParser> b = this.f3867g.mo5753b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new C0973b();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C1138t<Data, TResource, Transcode> mo5070h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1138t<Data, TResource, Transcode> a = this.f3869i.mo5754a(cls, cls2, cls3);
        if (this.f3869i.mo5755c(a)) {
            return null;
        }
        if (a == null) {
            List<C1110i<Data, TResource, Transcode>> f = m5420f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C1138t<>(cls, cls2, cls3, f, this.f3870j);
            }
            this.f3869i.mo5756d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public <Model> List<C1188n<Model, ?>> mo5071i(Model model) {
        List<C1188n<Model, ?>> d = this.f3861a.mo5506d(model);
        if (!d.isEmpty()) {
            return d;
        }
        throw new C0974c(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo5072j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f3868h.mo5757a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f3861a.mo5505c(cls)) {
                for (Class next : this.f3863c.mo5761d(d, cls2)) {
                    if (!this.f3866f.mo5673b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f3868h.mo5758b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public <X> C1005l<X> mo5073k(C1141v<X> vVar) throws C0975d {
        C1005l<X> b = this.f3864d.mo5765b(vVar.mo5421c());
        if (b != null) {
            return b;
        }
        throw new C0975d(vVar.mo5421c());
    }

    /* renamed from: l */
    public <X> C1012e<X> mo5074l(X x) {
        return this.f3865e.mo5184a(x);
    }

    /* renamed from: m */
    public <X> C0995d<X> mo5075m(X x) throws C0976e {
        C0995d<X> b = this.f3862b.mo5750b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new C0976e(x.getClass());
    }

    /* renamed from: n */
    public boolean mo5076n(C1141v<?> vVar) {
        return this.f3864d.mo5765b(vVar.mo5421c()) != null;
    }

    /* renamed from: o */
    public C0971h mo5077o(ImageHeaderParser imageHeaderParser) {
        this.f3867g.mo5752a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public C0971h mo5078p(C1012e.C1013a<?> aVar) {
        this.f3865e.mo5185b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> C0971h mo5079q(Class<TResource> cls, Class<Transcode> cls2, C1314e<TResource, Transcode> eVar) {
        this.f3866f.mo5674c(cls, cls2, eVar);
        return this;
    }

    /* renamed from: r */
    public final C0971h mo5080r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3863c.mo5762e(arrayList);
        return this;
    }
}
