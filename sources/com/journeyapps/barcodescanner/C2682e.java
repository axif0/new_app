package com.journeyapps.barcodescanner;

import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p296d.C5371c;
import p148g.p189d.p296d.C5375g;
import p148g.p189d.p296d.C5376h;
import p148g.p189d.p296d.C5379k;
import p148g.p189d.p296d.C5381m;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.C5384p;
import p148g.p189d.p296d.p304s.C5420j;

/* renamed from: com.journeyapps.barcodescanner.e */
public class C2682e implements C5384p {

    /* renamed from: a */
    private C5379k f8588a;

    /* renamed from: b */
    private List<C5383o> f8589b = new ArrayList();

    public C2682e(C5379k kVar) {
        this.f8588a = kVar;
    }

    /* renamed from: a */
    public void mo9796a(C5383o oVar) {
        this.f8589b.add(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5381m mo9797b(C5371c cVar) {
        C5381m mVar;
        this.f8589b.clear();
        try {
            mVar = this.f8588a instanceof C5376h ? ((C5376h) this.f8588a).mo15606e(cVar) : this.f8588a.mo15605c(cVar);
        } catch (Exception unused) {
            mVar = null;
        } catch (Throwable th) {
            this.f8588a.mo15604b();
            throw th;
        }
        this.f8588a.mo15604b();
        return mVar;
    }

    /* renamed from: c */
    public C5381m mo9798c(C5375g gVar) {
        return mo9797b(mo9800e(gVar));
    }

    /* renamed from: d */
    public List<C5383o> mo9799d() {
        return new ArrayList(this.f8589b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C5371c mo9800e(C5375g gVar) {
        return new C5371c(new C5420j(gVar));
    }
}
