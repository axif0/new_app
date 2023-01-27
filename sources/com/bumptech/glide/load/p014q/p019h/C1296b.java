package com.bumptech.glide.load.p014q.p019h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.p021m.C1318a;

/* renamed from: com.bumptech.glide.load.q.h.b */
public final class C1296b implements C1318a.C1319a {

    /* renamed from: a */
    private final C1047e f4517a;

    /* renamed from: b */
    private final C1042b f4518b;

    public C1296b(C1047e eVar, C1042b bVar) {
        this.f4517a = eVar;
        this.f4518b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo5618a(int i, int i2, Bitmap.Config config) {
        return this.f4517a.mo5250e(i, i2, config);
    }

    /* renamed from: b */
    public void mo5619b(byte[] bArr) {
        C1042b bVar = this.f4518b;
        if (bVar != null) {
            bVar.mo5227d(bArr);
        }
    }

    /* renamed from: c */
    public byte[] mo5620c(int i) {
        C1042b bVar = this.f4518b;
        return bVar == null ? new byte[i] : (byte[]) bVar.mo5228e(i, byte[].class);
    }

    /* renamed from: d */
    public void mo5621d(int[] iArr) {
        C1042b bVar = this.f4518b;
        if (bVar != null) {
            bVar.mo5227d(iArr);
        }
    }

    /* renamed from: e */
    public int[] mo5622e(int i) {
        C1042b bVar = this.f4518b;
        return bVar == null ? new int[i] : (int[]) bVar.mo5228e(i, int[].class);
    }

    /* renamed from: f */
    public void mo5623f(Bitmap bitmap) {
        this.f4517a.mo5249d(bitmap);
    }
}
