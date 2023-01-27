package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5154g;

/* renamed from: com.google.android.play.core.assetpacks.j0 */
final class C2363j0 {

    /* renamed from: a */
    private final C5099e0<C2371k3> f7817a;

    C2363j0(C5099e0<C2371k3> e0Var) {
        this.f7817a = e0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo9159a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C5154g.m21616e(this.f7817a.mo15202d().mo9166w(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C2411u0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C2411u0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C2411u0("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
