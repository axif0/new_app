package com.google.android.datatransport.cct.p034b;

import java.io.IOException;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;

/* renamed from: com.google.android.datatransport.cct.b.v */
public final class C1478v implements C5181c<C1457j> {
    /* renamed from: a */
    public void mo6037a(Object obj, Object obj2) throws C5180b, IOException {
        C1457j jVar = (C1457j) obj;
        C5182d dVar = (C5182d) obj2;
        if (jVar.mo6100b() != null) {
            dVar.mo15298e("mobileSubtype", jVar.mo6100b().name());
        }
        if (jVar.mo6101c() != null) {
            dVar.mo15298e("networkType", jVar.mo6101c().name());
        }
    }
}
