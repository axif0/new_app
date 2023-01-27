package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.aa */
final class C1728aa implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ C1860la f5645a;

    /* renamed from: b */
    private final /* synthetic */ C2003x9 f5646b;

    C1728aa(C2003x9 x9Var, C1860la laVar) {
        this.f5646b = x9Var;
        this.f5645a = laVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        C1770e4 H;
        String str;
        if (!C4602ib.m19620b() || !this.f5646b.mo7437L().mo7415s(C1957u.f6340Q0) || (this.f5646b.mo7447b(this.f5645a.f6014f).mo6882q() && C1765e.m8334b(this.f5645a.f6013B).mo6882q())) {
            C1782f4 U = this.f5646b.mo7442U(this.f5645a);
            if (U != null) {
                return U.mo6960x();
            }
            H = this.f5646b.mo6709i().mo6767H();
            str = "App info was null when attempting to get app instance id";
        } else {
            H = this.f5646b.mo6709i().mo6772M();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        H.mo6885a(str);
        return null;
    }
}
