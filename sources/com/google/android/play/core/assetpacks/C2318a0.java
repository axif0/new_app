package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5128t;
import p148g.p189d.p190a.p271e.p272a.p276c.C5135w0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5141z0;

/* renamed from: com.google.android.play.core.assetpacks.a0 */
final class C2318a0 extends C5135w0 {

    /* renamed from: a */
    private final C5100f f7710a = new C5100f("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f7711b;

    /* renamed from: c */
    private final AssetPackExtractionService f7712c;

    /* renamed from: d */
    private final C2328c0 f7713d;

    C2318a0(Context context, AssetPackExtractionService assetPackExtractionService, C2328c0 c0Var) {
        this.f7711b = context;
        this.f7712c = assetPackExtractionService;
        this.f7713d = c0Var;
    }

    /* renamed from: H */
    public final void mo9096H(Bundle bundle, C5141z0 z0Var) throws RemoteException {
        String[] packagesForUid;
        this.f7710a.mo15203c("updateServiceState AIDL call", new Object[0]);
        if (!C5128t.m21549a(this.f7711b) || (packagesForUid = this.f7711b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
            z0Var.mo15236e(new Bundle());
            this.f7712c.mo9093b();
            return;
        }
        z0Var.mo15238s(this.f7712c.mo9092a(bundle), new Bundle());
    }

    /* renamed from: o0 */
    public final void mo9097o0(C5141z0 z0Var) throws RemoteException {
        this.f7713d.mo9135z();
        z0Var.mo15237h(new Bundle());
    }
}
