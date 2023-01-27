package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.firebase.messaging.C2625b;
import java.util.Map;

/* renamed from: com.google.firebase.messaging.q */
public final class C2645q extends C1663a {
    public static final Parcelable.Creator<C2645q> CREATOR = new C2648r();

    /* renamed from: f */
    Bundle f8454f;

    /* renamed from: g */
    private Map<String, String> f8455g;

    /* renamed from: h */
    private C2647b f8456h;

    /* renamed from: com.google.firebase.messaging.q$b */
    public static class C2647b {

        /* renamed from: a */
        private final String f8457a;

        /* renamed from: b */
        private final String f8458b;

        private C2647b(C2644p pVar) {
            this.f8457a = pVar.mo9611p("gcm.n.title");
            pVar.mo9603h("gcm.n.title");
            m11788b(pVar, "gcm.n.title");
            this.f8458b = pVar.mo9611p("gcm.n.body");
            pVar.mo9603h("gcm.n.body");
            m11788b(pVar, "gcm.n.body");
            pVar.mo9611p("gcm.n.icon");
            pVar.mo9610o();
            pVar.mo9611p("gcm.n.tag");
            pVar.mo9611p("gcm.n.color");
            pVar.mo9611p("gcm.n.click_action");
            pVar.mo9611p("gcm.n.android_channel_id");
            pVar.mo9601f();
            pVar.mo9611p("gcm.n.image");
            pVar.mo9611p("gcm.n.ticker");
            pVar.mo9598b("gcm.n.notification_priority");
            pVar.mo9598b("gcm.n.visibility");
            pVar.mo9598b("gcm.n.notification_count");
            pVar.mo9597a("gcm.n.sticky");
            pVar.mo9597a("gcm.n.local_only");
            pVar.mo9597a("gcm.n.default_sound");
            pVar.mo9597a("gcm.n.default_vibrate_timings");
            pVar.mo9597a("gcm.n.default_light_settings");
            pVar.mo9605j("gcm.n.event_time");
            pVar.mo9600e();
            pVar.mo9612q();
        }

        /* renamed from: b */
        private static String[] m11788b(C2644p pVar, String str) {
            Object[] g = pVar.mo9602g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String mo9619a() {
            return this.f8458b;
        }

        /* renamed from: c */
        public String mo9620c() {
            return this.f8457a;
        }
    }

    public C2645q(Bundle bundle) {
        this.f8454f = bundle;
    }

    /* renamed from: d */
    public final Map<String, String> mo9616d() {
        if (this.f8455g == null) {
            this.f8455g = C2625b.C2626a.m11695a(this.f8454f);
        }
        return this.f8455g;
    }

    /* renamed from: f */
    public final C2647b mo9617f() {
        if (this.f8456h == null && C2644p.m11762t(this.f8454f)) {
            this.f8456h = new C2647b(new C2644p(this.f8454f));
        }
        return this.f8456h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C2648r.m11791c(this, parcel, i);
    }
}
