package com.google.android.datatransport.cct.p034b;

import java.io.IOException;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;

/* renamed from: com.google.android.datatransport.cct.b.q */
public final class C1469q implements C5181c<C1450g> {
    /* renamed from: a */
    public void mo6037a(Object obj, Object obj2) throws C5180b, IOException {
        C1450g gVar = (C1450g) obj;
        C5182d dVar = (C5182d) obj2;
        dVar.mo15296a("eventTimeMs", gVar.mo6061a()).mo15296a("eventUptimeMs", gVar.mo6062d()).mo15296a("timezoneOffsetSeconds", gVar.mo6063e());
        if (gVar.mo6067h() != null) {
            dVar.mo15298e("sourceExtension", gVar.mo6067h());
        }
        if (gVar.mo6069i() != null) {
            dVar.mo15298e("sourceExtensionJsonProto3", gVar.mo6069i());
        }
        if (gVar.mo6065f() != Integer.MIN_VALUE) {
            dVar.mo15297b("eventCode", gVar.mo6065f());
        }
        if (gVar.mo6066g() != null) {
            dVar.mo15298e("networkConnectionInfo", gVar.mo6066g());
        }
    }
}
