package com.bumptech.glide.load.p008o;

import android.util.Log;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0995d;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p008o.C1098f;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p029s.C1397f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.z */
class C1146z implements C1098f, C1010d.C1011a<Object>, C1098f.C1099a {

    /* renamed from: f */
    private final C1100g<?> f4310f;

    /* renamed from: g */
    private final C1098f.C1099a f4311g;

    /* renamed from: h */
    private int f4312h;

    /* renamed from: i */
    private C1088c f4313i;

    /* renamed from: j */
    private Object f4314j;

    /* renamed from: k */
    private volatile C1188n.C1189a<?> f4315k;

    /* renamed from: l */
    private C1096d f4316l;

    C1146z(C1100g<?> gVar, C1098f.C1099a aVar) {
        this.f4310f = gVar;
        this.f4311g = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m6034b(Object obj) {
        long b = C1397f.m6956b();
        try {
            C0995d<X> p = this.f4310f.mo5346p(obj);
            C1097e eVar = new C1097e(p, obj, this.f4310f.mo5341k());
            this.f4316l = new C1096d(this.f4315k.f4360a, this.f4310f.mo5345o());
            this.f4310f.mo5334d().mo5278a(this.f4316l, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f4316l + ", data: " + obj + ", encoder: " + p + ", duration: " + C1397f.m6955a(b));
            }
            this.f4315k.f4362c.mo5167b();
            this.f4313i = new C1088c(Collections.singletonList(this.f4315k.f4360a), this.f4310f, this);
        } catch (Throwable th) {
            this.f4315k.f4362c.mo5167b();
            throw th;
        }
    }

    /* renamed from: f */
    private boolean m6035f() {
        return this.f4312h < this.f4310f.mo5337g().size();
    }

    /* renamed from: a */
    public boolean mo5307a() {
        Object obj = this.f4314j;
        if (obj != null) {
            this.f4314j = null;
            m6034b(obj);
        }
        C1088c cVar = this.f4313i;
        if (cVar != null && cVar.mo5307a()) {
            return true;
        }
        this.f4313i = null;
        this.f4315k = null;
        boolean z = false;
        while (!z && m6035f()) {
            List<C1188n.C1189a<?>> g = this.f4310f.mo5337g();
            int i = this.f4312h;
            this.f4312h = i + 1;
            this.f4315k = g.get(i);
            if (this.f4315k != null && (this.f4310f.mo5335e().mo5380c(this.f4315k.f4362c.mo5171e()) || this.f4310f.mo5350t(this.f4315k.f4362c.mo5162a()))) {
                this.f4315k.f4362c.mo5172f(this.f4310f.mo5342l(), this);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo5178c(Exception exc) {
        this.f4311g.mo5329g(this.f4316l, exc, this.f4315k.f4362c, this.f4315k.f4362c.mo5171e());
    }

    public void cancel() {
        C1188n.C1189a<?> aVar = this.f4315k;
        if (aVar != null) {
            aVar.f4362c.cancel();
        }
    }

    /* renamed from: d */
    public void mo5179d(Object obj) {
        C1112j e = this.f4310f.mo5335e();
        if (obj == null || !e.mo5380c(this.f4315k.f4362c.mo5171e())) {
            this.f4311g.mo5330h(this.f4315k.f4360a, obj, this.f4315k.f4362c, this.f4315k.f4362c.mo5171e(), this.f4316l);
            return;
        }
        this.f4314j = obj;
        this.f4311g.mo5328e();
    }

    /* renamed from: e */
    public void mo5328e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo5329g(C0998g gVar, Exception exc, C1010d<?> dVar, C0992a aVar) {
        this.f4311g.mo5329g(gVar, exc, dVar, this.f4315k.f4362c.mo5171e());
    }

    /* renamed from: h */
    public void mo5330h(C0998g gVar, Object obj, C1010d<?> dVar, C0992a aVar, C0998g gVar2) {
        this.f4311g.mo5330h(gVar, obj, dVar, this.f4315k.f4362c.mo5171e(), gVar);
    }
}
