package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p335h.p336a.C5599b;
import p349j.p350a.C5825a;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
public final class C1498j implements C5599b<C1497i> {

    /* renamed from: a */
    private final C5825a<Context> f5066a;

    /* renamed from: b */
    private final C5825a<C3821a> f5067b;

    /* renamed from: c */
    private final C5825a<C3821a> f5068c;

    public C1498j(C5825a<Context> aVar, C5825a<C3821a> aVar2, C5825a<C3821a> aVar3) {
        this.f5066a = aVar;
        this.f5067b = aVar2;
        this.f5068c = aVar3;
    }

    /* renamed from: a */
    public static C1498j m7273a(C5825a<Context> aVar, C5825a<C3821a> aVar2, C5825a<C3821a> aVar3) {
        return new C1498j(aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public C1497i get() {
        return new C1497i(this.f5066a.get(), this.f5067b.get(), this.f5068c.get());
    }
}
