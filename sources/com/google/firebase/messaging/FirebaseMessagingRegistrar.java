package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C1438a;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2511e;
import com.google.firebase.components.C2517h;
import com.google.firebase.components.C2526n;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C2588g;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.C3728c;
import p148g.p189d.p190a.p191a.C3730e;
import p148g.p189d.p190a.p191a.C3731f;
import p148g.p189d.p190a.p191a.C3732g;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5208g;
import p148g.p189d.p281b.p288k.C5209h;

@Keep
public class FirebaseMessagingRegistrar implements C2517h {

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    private static class C2621b<T> implements C3731f<T> {
        private C2621b() {
        }

        /* renamed from: a */
        public void mo9568a(C3728c<T> cVar) {
        }
    }

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$c */
    public static class C2622c implements C3732g {
        /* renamed from: a */
        public <T> C3731f<T> mo9569a(String str, Class<T> cls, C3727b bVar, C3730e<T, byte[]> eVar) {
            return new C2621b();
        }
    }

    static C3732g determineFactory(C3732g gVar) {
        return (gVar == null || !C1438a.f4925g.mo6022a().contains(C3727b.m15581b("json"))) ? new C2622c() : gVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(C2511e eVar) {
        return new FirebaseMessaging((C5171c) eVar.mo9362a(C5171c.class), (FirebaseInstanceId) eVar.mo9362a(FirebaseInstanceId.class), (C5209h) eVar.mo9362a(C5209h.class), (C5197c) eVar.mo9362a(C5197c.class), (C2588g) eVar.mo9362a(C2588g.class), determineFactory((C3732g) eVar.mo9362a(C3732g.class)));
    }

    @Keep
    public List<C2508d<?>> getComponents() {
        C2508d.C2510b<FirebaseMessaging> a = C2508d.m11268a(FirebaseMessaging.class);
        a.mo9372b(C2526n.m11326f(C5171c.class));
        a.mo9372b(C2526n.m11326f(FirebaseInstanceId.class));
        a.mo9372b(C2526n.m11326f(C5209h.class));
        a.mo9372b(C2526n.m11326f(C5197c.class));
        a.mo9372b(C2526n.m11325e(C3732g.class));
        a.mo9372b(C2526n.m11326f(C2588g.class));
        a.mo9376f(C2635j.f8443a);
        a.mo9373c();
        return Arrays.asList(new C2508d[]{a.mo9374d(), C5208g.m21758a("fire-fcm", "20.1.7_1p")});
    }
}
