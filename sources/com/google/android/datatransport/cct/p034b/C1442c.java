package com.google.android.datatransport.cct.p034b;

import java.io.IOException;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;

/* renamed from: com.google.android.datatransport.cct.b.c */
public final class C1442c implements C5181c<C1443d> {
    /* renamed from: a */
    public void mo6037a(Object obj, Object obj2) throws C5180b, IOException {
        C1443d dVar = (C1443d) obj;
        C5182d dVar2 = (C5182d) obj2;
        if (dVar.mo6047i() != Integer.MIN_VALUE) {
            dVar2.mo15297b("sdkVersion", dVar.mo6047i());
        }
        if (dVar.mo6043f() != null) {
            dVar2.mo15298e("model", dVar.mo6043f());
        }
        if (dVar.mo6040d() != null) {
            dVar2.mo15298e("hardware", dVar.mo6040d());
        }
        if (dVar.mo6038b() != null) {
            dVar2.mo15298e("device", dVar.mo6038b());
        }
        if (dVar.mo6045h() != null) {
            dVar2.mo15298e("product", dVar.mo6045h());
        }
        if (dVar.mo6044g() != null) {
            dVar2.mo15298e("osBuild", dVar.mo6044g());
        }
        if (dVar.mo6041e() != null) {
            dVar2.mo15298e("manufacturer", dVar.mo6041e());
        }
        if (dVar.mo6039c() != null) {
            dVar2.mo15298e("fingerprint", dVar.mo6039c());
        }
    }
}
