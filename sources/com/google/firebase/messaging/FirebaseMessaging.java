package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1658o;
import com.google.firebase.iid.C2569t;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C2588g;
import p148g.p189d.p190a.p191a.C3732g;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p285h.C5197c;
import p148g.p189d.p281b.p288k.C5209h;

public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: d */
    static C3732g f8417d;

    /* renamed from: a */
    private final Context f8418a;

    /* renamed from: b */
    private final FirebaseInstanceId f8419b;

    /* renamed from: c */
    private final C4940h<C2655y> f8420c;

    FirebaseMessaging(C5171c cVar, FirebaseInstanceId firebaseInstanceId, C5209h hVar, C5197c cVar2, C2588g gVar, C3732g gVar2) {
        f8417d = gVar2;
        this.f8419b = firebaseInstanceId;
        Context g = cVar.mo15275g();
        this.f8418a = g;
        C4940h<C2655y> d = C2655y.m11816d(cVar, firebaseInstanceId, new C2569t(g), hVar, cVar2, gVar, this.f8418a, C2633h.m11715d());
        this.f8420c = d;
        d.mo14866d(C2633h.m11716e(), new C2634i(this));
    }

    /* renamed from: a */
    public static C3732g m11659a() {
        return f8417d;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C5171c cVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) cVar.mo15274f(cls);
            C1658o.m7846k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: b */
    public boolean mo9566b() {
        return this.f8419b.mo9421t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo9567c(C2655y yVar) {
        if (mo9566b()) {
            yVar.mo9643o();
        }
    }
}
