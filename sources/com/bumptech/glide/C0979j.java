package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p008o.C1112j;
import com.bumptech.glide.load.p014q.p019h.C1297c;
import com.bumptech.glide.p022n.C1326c;
import com.bumptech.glide.p022n.C1328d;
import com.bumptech.glide.p022n.C1333h;
import com.bumptech.glide.p022n.C1334i;
import com.bumptech.glide.p022n.C1341m;
import com.bumptech.glide.p022n.C1342n;
import com.bumptech.glide.p022n.C1345p;
import com.bumptech.glide.p025q.C1361c;
import com.bumptech.glide.p025q.C1364e;
import com.bumptech.glide.p025q.C1365f;
import com.bumptech.glide.p025q.p026j.C1377h;
import com.bumptech.glide.p029s.C1402k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.j */
public class C0979j implements ComponentCallbacks2, C1334i {

    /* renamed from: r */
    private static final C1365f f3886r;

    /* renamed from: f */
    protected final C0963b f3887f;

    /* renamed from: g */
    protected final Context f3888g;

    /* renamed from: h */
    final C1333h f3889h;

    /* renamed from: i */
    private final C1342n f3890i;

    /* renamed from: j */
    private final C1341m f3891j;

    /* renamed from: k */
    private final C1345p f3892k;

    /* renamed from: l */
    private final Runnable f3893l;

    /* renamed from: m */
    private final Handler f3894m;

    /* renamed from: n */
    private final C1326c f3895n;

    /* renamed from: o */
    private final CopyOnWriteArrayList<C1364e<Object>> f3896o;

    /* renamed from: p */
    private C1365f f3897p;

    /* renamed from: q */
    private boolean f3898q;

    /* renamed from: com.bumptech.glide.j$a */
    class C0980a implements Runnable {
        C0980a() {
        }

        public void run() {
            C0979j jVar = C0979j.this;
            jVar.f3889h.mo5695a(jVar);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    private class C0981b implements C1326c.C1327a {

        /* renamed from: a */
        private final C1342n f3900a;

        C0981b(C1342n nVar) {
            this.f3900a = nVar;
        }

        /* renamed from: a */
        public void mo5116a(boolean z) {
            if (z) {
                synchronized (C0979j.this) {
                    this.f3900a.mo5728e();
                }
            }
        }
    }

    static {
        C1365f p0 = C1365f.m6820p0(Bitmap.class);
        p0.mo5780R();
        f3886r = p0;
        C1365f p02 = C1365f.m6820p0(C1297c.class);
        p02.mo5780R();
        C1365f fVar = p02;
        C1365f fVar2 = (C1365f) ((C1365f) C1365f.m6821q0(C1112j.f4195b).mo5787b0(C0969f.LOW)).mo5798j0(true);
    }

    public C0979j(C0963b bVar, C1333h hVar, C1341m mVar, Context context) {
        this(bVar, hVar, mVar, new C1342n(), bVar.mo5040g(), context);
    }

    C0979j(C0963b bVar, C1333h hVar, C1341m mVar, C1342n nVar, C1328d dVar, Context context) {
        this.f3892k = new C1345p();
        this.f3893l = new C0980a();
        this.f3894m = new Handler(Looper.getMainLooper());
        this.f3887f = bVar;
        this.f3889h = hVar;
        this.f3891j = mVar;
        this.f3890i = nVar;
        this.f3888g = context;
        this.f3895n = dVar.mo5700a(context.getApplicationContext(), new C0981b(nVar));
        if (C1402k.m6988o()) {
            this.f3894m.post(this.f3893l);
        } else {
            hVar.mo5695a(this);
        }
        hVar.mo5695a(this.f3895n);
        this.f3896o = new CopyOnWriteArrayList<>(bVar.mo5042i().mo5057c());
        mo5112x(bVar.mo5042i().mo5058d());
        bVar.mo5045o(this);
    }

    /* renamed from: A */
    private void m5458A(C1377h<?> hVar) {
        boolean z = mo5114z(hVar);
        C1361c g = hVar.mo5842g();
        if (!z && !this.f3887f.mo5049p(hVar) && g != null) {
            hVar.mo5844j((C1361c) null);
            g.clear();
        }
    }

    /* renamed from: a */
    public synchronized void mo5093a() {
        mo5111w();
        this.f3892k.mo5093a();
    }

    /* renamed from: e */
    public synchronized void mo5094e() {
        mo5110v();
        this.f3892k.mo5094e();
    }

    /* renamed from: k */
    public synchronized void mo5095k() {
        this.f3892k.mo5095k();
        for (C1377h<?> o : this.f3892k.mo5740m()) {
            mo5099o(o);
        }
        this.f3892k.mo5739l();
        this.f3890i.mo5725b();
        this.f3889h.mo5696b(this);
        this.f3889h.mo5696b(this.f3895n);
        this.f3894m.removeCallbacks(this.f3893l);
        this.f3887f.mo5051s(this);
    }

    /* renamed from: l */
    public <ResourceType> C0977i<ResourceType> mo5096l(Class<ResourceType> cls) {
        return new C0977i<>(this.f3887f, this, cls, this.f3888g);
    }

    /* renamed from: m */
    public C0977i<Bitmap> mo5097m() {
        return mo5096l(Bitmap.class).mo5085b(f3886r);
    }

    /* renamed from: n */
    public C0977i<Drawable> mo5098n() {
        return mo5096l(Drawable.class);
    }

    /* renamed from: o */
    public void mo5099o(C1377h<?> hVar) {
        if (hVar != null) {
            m5458A(hVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f3898q) {
            mo5109u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public List<C1364e<Object>> mo5103p() {
        return this.f3896o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized C1365f mo5104q() {
        return this.f3897p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <T> C0982k<?, T> mo5105r(Class<T> cls) {
        return this.f3887f.mo5042i().mo5059e(cls);
    }

    /* renamed from: s */
    public C0977i<Drawable> mo5106s(String str) {
        C0977i<Drawable> n = mo5098n();
        n.mo5084E0(str);
        return n;
    }

    /* renamed from: t */
    public synchronized void mo5107t() {
        this.f3890i.mo5726c();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3890i + ", treeNode=" + this.f3891j + "}";
    }

    /* renamed from: u */
    public synchronized void mo5109u() {
        mo5107t();
        for (C0979j t : this.f3891j.mo5703a()) {
            t.mo5107t();
        }
    }

    /* renamed from: v */
    public synchronized void mo5110v() {
        this.f3890i.mo5727d();
    }

    /* renamed from: w */
    public synchronized void mo5111w() {
        this.f3890i.mo5729f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public synchronized void mo5112x(C1365f fVar) {
        C1365f fVar2 = (C1365f) fVar.clone();
        fVar2.mo5788c();
        this.f3897p = fVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized void mo5113y(C1377h<?> hVar, C1361c cVar) {
        this.f3892k.mo5741n(hVar);
        this.f3890i.mo5730g(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public synchronized boolean mo5114z(C1377h<?> hVar) {
        C1361c g = hVar.mo5842g();
        if (g == null) {
            return true;
        }
        if (!this.f3890i.mo5724a(g)) {
            return false;
        }
        this.f3892k.mo5742o(hVar);
        hVar.mo5844j((C1361c) null);
        return true;
    }
}
