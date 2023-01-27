package com.google.android.datatransport.cct.p034b;

import java.io.IOException;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;

/* renamed from: com.google.android.datatransport.cct.b.n */
public final class C1465n implements C5181c<C1447f> {
    /* renamed from: a */
    public void mo6037a(Object obj, Object obj2) throws C5180b, IOException {
        C1447f fVar = (C1447f) obj;
        C5182d dVar = (C5182d) obj2;
        if (fVar.mo6054c() != null) {
            dVar.mo15298e("clientType", fVar.mo6054c().name());
        }
        if (fVar.mo6053b() != null) {
            dVar.mo15298e("androidClientInfo", fVar.mo6053b());
        }
    }
}
