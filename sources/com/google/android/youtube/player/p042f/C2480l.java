package com.google.android.youtube.player.p042f;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.youtube.player.p042f.C2476j;
import com.google.android.youtube.player.p042f.C2485n;
import com.google.android.youtube.player.p042f.C2492o;

/* renamed from: com.google.android.youtube.player.f.l */
public final class C2480l extends C2485n<C2476j> implements C2465e {

    /* renamed from: k */
    private final String f8125k;

    /* renamed from: l */
    private final String f8126l;

    /* renamed from: m */
    private final String f8127m;

    /* renamed from: n */
    private boolean f8128n;

    public C2480l(Context context, String str, String str2, String str3, C2492o.C2493a aVar, C2492o.C2494b bVar) {
        super(context, aVar, bVar);
        C2463c.m11153a(str);
        this.f8125k = str;
        C2463c.m11155c(str2, "callingPackage cannot be null or empty");
        this.f8126l = str2;
        C2463c.m11155c(str3, "callingAppVersion cannot be null or empty");
        this.f8127m = str3;
    }

    /* renamed from: y */
    private final void m11176y() {
        mo9345u();
        if (this.f8128n) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo9331b(IBinder iBinder) {
        return C2476j.C2477a.m11173n(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo9332h(C2468g gVar, C2485n.C2490e eVar) throws RemoteException {
        gVar.mo9319m0(eVar, 1202, this.f8126l, this.f8127m, this.f8125k, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo9333j() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo9334m() {
        return "com.google.android.youtube.api.service.START";
    }

    /* renamed from: t */
    public final void mo9335t() {
        if (!this.f8128n) {
            mo9336x(true);
        }
        super.mo9335t();
    }

    /* renamed from: v */
    public final C2473i mo9315v(C2471h hVar) {
        m11176y();
        try {
            return ((C2476j) mo9346w()).mo9328v(hVar);
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: x */
    public final void mo9336x(boolean z) {
        if (mo9342q()) {
            try {
                ((C2476j) mo9346w()).mo9329x(z);
            } catch (RemoteException unused) {
            }
            this.f8128n = true;
        }
    }
}
