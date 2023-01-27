package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.common.internal.C1658o;
import java.io.IOException;
import p148g.p189d.p281b.p282f.C5180b;
import p148g.p189d.p281b.p282f.C5181c;
import p148g.p189d.p281b.p282f.C5182d;

/* renamed from: com.google.firebase.messaging.l */
final class C2637l {

    /* renamed from: a */
    private final String f8445a;

    /* renamed from: b */
    private final Intent f8446b;

    /* renamed from: com.google.firebase.messaging.l$a */
    static class C2638a implements C5181c<C2637l> {
        C2638a() {
        }

        /* renamed from: b */
        public void mo6037a(C2637l lVar, C5182d dVar) throws C5180b, IOException {
            Intent b = lVar.mo9588b();
            dVar.mo15297b("ttl", C2643o.m11750q(b));
            dVar.mo15298e("event", lVar.mo9587a());
            dVar.mo15298e("instanceId", C2643o.m11738e());
            dVar.mo15297b("priority", C2643o.m11747n(b));
            dVar.mo15298e("packageName", C2643o.m11746m());
            dVar.mo15298e("sdkPlatform", "ANDROID");
            dVar.mo15298e("messageType", C2643o.m11744k(b));
            String g = C2643o.m11740g(b);
            if (g != null) {
                dVar.mo15298e("messageId", g);
            }
            String p = C2643o.m11749p(b);
            if (p != null) {
                dVar.mo15298e("topic", p);
            }
            String b2 = C2643o.m11735b(b);
            if (b2 != null) {
                dVar.mo15298e("collapseKey", b2);
            }
            if (C2643o.m11741h(b) != null) {
                dVar.mo15298e("analyticsLabel", C2643o.m11741h(b));
            }
            if (C2643o.m11737d(b) != null) {
                dVar.mo15298e("composerLabel", C2643o.m11737d(b));
            }
            String o = C2643o.m11748o();
            if (o != null) {
                dVar.mo15298e("projectNumber", o);
            }
        }
    }

    /* renamed from: com.google.firebase.messaging.l$b */
    static final class C2639b {

        /* renamed from: a */
        private final C2637l f8447a;

        C2639b(C2637l lVar) {
            C1658o.m7845j(lVar);
            this.f8447a = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C2637l mo9590a() {
            return this.f8447a;
        }
    }

    /* renamed from: com.google.firebase.messaging.l$c */
    static final class C2640c implements C5181c<C2639b> {
        C2640c() {
        }

        /* renamed from: b */
        public final void mo6037a(C2639b bVar, C5182d dVar) throws C5180b, IOException {
            dVar.mo15298e("messaging_client_event", bVar.mo9590a());
        }
    }

    C2637l(String str, Intent intent) {
        C1658o.m7842g(str, "evenType must be non-null");
        this.f8445a = str;
        C1658o.m7846k(intent, "intent must be non-null");
        this.f8446b = intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo9587a() {
        return this.f8445a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Intent mo9588b() {
        return this.f8446b;
    }
}
