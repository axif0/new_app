package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.IOException;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6115d;
import p374m.C6117d0;
import p385n.C6300s;

/* renamed from: com.squareup.picasso.r */
class C2772r extends C2793y {

    /* renamed from: a */
    private final C2761j f8850a;

    /* renamed from: b */
    private final C2734a0 f8851b;

    /* renamed from: com.squareup.picasso.r$a */
    static class C2773a extends IOException {
        C2773a(String str) {
            super(str);
        }
    }

    /* renamed from: com.squareup.picasso.r$b */
    static final class C2774b extends IOException {

        /* renamed from: f */
        final int f8852f;

        /* renamed from: g */
        final int f8853g;

        C2774b(int i, int i2) {
            super("HTTP " + i);
            this.f8852f = i;
            this.f8853g = i2;
        }
    }

    C2772r(C2761j jVar, C2734a0 a0Var) {
        this.f8850a = jVar;
        this.f8851b = a0Var;
    }

    /* renamed from: j */
    private static C6099a0 m12216j(C2789w wVar, int i) {
        C6115d dVar;
        if (i == 0) {
            dVar = null;
        } else if (C2771q.m12213e(i)) {
            dVar = C6115d.f17147n;
        } else {
            C6115d.C6116a aVar = new C6115d.C6116a();
            if (!C2771q.m12214g(i)) {
                aVar.mo17306c();
            }
            if (!C2771q.m12215h(i)) {
                aVar.mo17307d();
            }
            dVar = aVar.mo17304a();
        }
        C6099a0.C6100a aVar2 = new C6099a0.C6100a();
        aVar2.mo17230h(wVar.f8909d.toString());
        if (dVar != null) {
            aVar2.mo17224b(dVar);
        }
        return aVar2.mo17223a();
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        String scheme = wVar.f8909d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo10089e() {
        return 2;
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        C6113c0 a = this.f8850a.mo10074a(m12216j(wVar, i));
        C6117d0 a2 = a.mo17266a();
        if (a.mo17276u()) {
            C2776t.C2782e eVar = a.mo17269j() == null ? C2776t.C2782e.NETWORK : C2776t.C2782e.DISK;
            if (eVar == C2776t.C2782e.DISK && a2.mo17253j() == 0) {
                a2.close();
                throw new C2773a("Received response with 0 content-length header.");
            }
            if (eVar == C2776t.C2782e.NETWORK && a2.mo17253j() > 0) {
                this.f8851b.mo10000f(a2.mo17253j());
            }
            return new C2793y.C2794a((C6300s) a2.mo17255r(), eVar);
        }
        a2.close();
        throw new C2774b(a.mo17270m(), wVar.f8908c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10090h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10091i() {
        return true;
    }
}
