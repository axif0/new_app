package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2511e;
import com.google.firebase.components.C2517h;
import com.google.firebase.components.C2526n;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5208g;
import p148g.p189d.p281b.p288k.C5209h;

@Keep
public class FirebaseInstallationsRegistrar implements C2517h {
    static /* synthetic */ C2588g lambda$getComponents$0(C2511e eVar) {
        return new C2585f((C5171c) eVar.mo9362a(C5171c.class), (C5209h) eVar.mo9362a(C5209h.class), (C5197c) eVar.mo9362a(C5197c.class));
    }

    public List<C2508d<?>> getComponents() {
        C2508d.C2510b<C2588g> a = C2508d.m11268a(C2588g.class);
        a.mo9372b(C2526n.m11326f(C5171c.class));
        a.mo9372b(C2526n.m11326f(C5197c.class));
        a.mo9372b(C2526n.m11326f(C5209h.class));
        a.mo9376f(C2591i.m11524b());
        return Arrays.asList(new C2508d[]{a.mo9374d(), C5208g.m21758a("fire-installations", "16.3.3")});
    }
}
