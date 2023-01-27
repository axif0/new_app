package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.C1572b;
import com.google.android.gms.common.internal.C1644j;
import java.util.Collections;
import p148g.p189d.p190a.p232c.p237d.C4366b;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C1597r implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4366b f5404f;

    /* renamed from: g */
    private final /* synthetic */ C1572b.C1575c f5405g;

    C1597r(C1572b.C1575c cVar, C4366b bVar) {
        this.f5405g = cVar;
        this.f5404f = bVar;
    }

    public final void run() {
        if (this.f5404f.mo13679j()) {
            boolean unused = this.f5405g.f5375e = true;
            if (this.f5405g.f5371a.mo6338o()) {
                this.f5405g.m7611g();
                return;
            }
            try {
                this.f5405g.f5371a.mo6330d((C1644j) null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((C1572b.C1573a) C1572b.this.f5351m.get(this.f5405g.f5372b)).mo6351r(new C4366b(10));
            }
        } else {
            ((C1572b.C1573a) C1572b.this.f5351m.get(this.f5405g.f5372b)).mo6351r(this.f5404f);
        }
    }
}
