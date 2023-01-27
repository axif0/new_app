package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C1547a;
import p148g.p189d.p190a.p232c.p237d.C4375f;

/* renamed from: com.google.android.gms.common.internal.i */
public class C1642i {

    /* renamed from: a */
    private final SparseIntArray f5516a = new SparseIntArray();

    /* renamed from: b */
    private C4375f f5517b;

    public C1642i(C4375f fVar) {
        C1658o.m7845j(fVar);
        this.f5517b = fVar;
    }

    /* renamed from: a */
    public void mo6546a() {
        this.f5516a.clear();
    }

    /* renamed from: b */
    public int mo6547b(Context context, C1547a.C1555f fVar) {
        C1658o.m7845j(context);
        C1658o.m7845j(fVar);
        int i = 0;
        if (!fVar.mo6331f()) {
            return 0;
        }
        int g = fVar.mo6332g();
        int i2 = this.f5516a.get(g, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f5516a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f5516a.keyAt(i3);
            if (keyAt > g && this.f5516a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f5517b.mo13699h(context, g);
        }
        this.f5516a.put(g, i);
        return i;
    }
}
