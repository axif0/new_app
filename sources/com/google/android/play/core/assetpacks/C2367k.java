package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5102g;
import p148g.p189d.p190a.p271e.p272a.p276c.C5129t0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.k */
final class C2367k extends C5102g {

    /* renamed from: g */
    final /* synthetic */ int f7825g;

    /* renamed from: h */
    final /* synthetic */ String f7826h;

    /* renamed from: i */
    final /* synthetic */ String f7827i;

    /* renamed from: j */
    final /* synthetic */ int f7828j;

    /* renamed from: k */
    final /* synthetic */ C5163p f7829k;

    /* renamed from: l */
    final /* synthetic */ C2398r f7830l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2367k(C2398r rVar, C5163p pVar, int i, String str, String str2, int i2, C5163p pVar2) {
        super(pVar);
        this.f7830l = rVar;
        this.f7825g = i;
        this.f7826h = str;
        this.f7827i = str2;
        this.f7828j = i2;
        this.f7829k = pVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9144a() {
        try {
            ((C5129t0) this.f7830l.f7929c.mo15223f()).mo15231w0(this.f7830l.f7927a, C2398r.m11008p(this.f7825g, this.f7826h, this.f7827i, this.f7828j), C2398r.m11012t(), new C2382n(this.f7830l, this.f7829k));
        } catch (RemoteException e) {
            C2398r.f7925f.mo15205e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f7826h, this.f7827i, Integer.valueOf(this.f7828j), Integer.valueOf(this.f7825g));
            this.f7829k.mo15264d(new RuntimeException(e));
        }
    }
}
