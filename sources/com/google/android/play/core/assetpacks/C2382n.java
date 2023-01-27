package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.n */
final class C2382n extends C2377m<ParcelFileDescriptor> {
    C2382n(C2398r rVar, C5163p<ParcelFileDescriptor> pVar) {
        super(rVar, pVar);
    }

    /* renamed from: J0 */
    public final void mo9184J0(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo9184J0(bundle, bundle2);
        this.f7854a.mo15265e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
