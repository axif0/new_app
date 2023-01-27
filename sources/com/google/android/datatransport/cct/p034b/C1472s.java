package com.google.android.datatransport.cct.p034b;

import java.io.IOException;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;

/* renamed from: com.google.android.datatransport.cct.b.s */
public final class C1472s implements C5181c<C1453h> {
    /* renamed from: a */
    public void mo6037a(Object obj, Object obj2) throws C5180b, IOException {
        C1453h hVar = (C1453h) obj;
        C5182d dVar = (C5182d) obj2;
        dVar.mo15296a("requestTimeMs", hVar.mo6084f()).mo15296a("requestUptimeMs", hVar.mo6085g());
        if (hVar.mo6079b() != null) {
            dVar.mo15298e("clientInfo", hVar.mo6079b());
        }
        if (hVar.mo6082e() != null) {
            dVar.mo15298e("logSourceName", hVar.mo6082e());
        } else if (hVar.mo6081d() != Integer.MIN_VALUE) {
            dVar.mo15297b("logSource", hVar.mo6081d());
        } else {
            throw new C5180b("Log request must have either LogSourceName or LogSource");
        }
        if (!hVar.mo6080c().isEmpty()) {
            dVar.mo15298e("logEvent", hVar.mo6080c());
        }
    }
}
