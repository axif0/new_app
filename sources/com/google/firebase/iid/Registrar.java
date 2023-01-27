package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2511e;
import com.google.firebase.components.C2517h;
import com.google.firebase.components.C2526n;
import com.google.firebase.iid.p044h0.C2557a;
import com.google.firebase.installations.C2588g;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p284g.C5194d;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5208g;
import p148g.p189d.p281b.p288k.C5209h;

@Keep
public final class Registrar implements C2517h {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C2538a implements C2557a {
        public C2538a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(C2511e eVar) {
        return new FirebaseInstanceId((C5171c) eVar.mo9362a(C5171c.class), (C5194d) eVar.mo9362a(C5194d.class), (C5209h) eVar.mo9362a(C5209h.class), (C5197c) eVar.mo9362a(C5197c.class), (C2588g) eVar.mo9362a(C2588g.class));
    }

    static final /* synthetic */ C2557a lambda$getComponents$1$Registrar(C2511e eVar) {
        return new C2538a((FirebaseInstanceId) eVar.mo9362a(FirebaseInstanceId.class));
    }

    @Keep
    public final List<C2508d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C2508d.C2510b<FirebaseInstanceId> a = C2508d.m11268a(cls);
        a.mo9372b(C2526n.m11326f(C5171c.class));
        a.mo9372b(C2526n.m11326f(C5194d.class));
        a.mo9372b(C2526n.m11326f(C5209h.class));
        a.mo9372b(C2526n.m11326f(C5197c.class));
        a.mo9372b(C2526n.m11326f(C2588g.class));
        a.mo9376f(C2570u.f8306a);
        a.mo9373c();
        C2508d<FirebaseInstanceId> d = a.mo9374d();
        C2508d.C2510b<C2557a> a2 = C2508d.m11268a(C2557a.class);
        a2.mo9372b(C2526n.m11326f(cls));
        a2.mo9376f(C2571v.f8307a);
        return Arrays.asList(new C2508d[]{d, a2.mo9374d(), C5208g.m21758a("fire-iid", "20.3.0")});
    }
}
