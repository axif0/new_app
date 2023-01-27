package com.journeyapps.barcodescanner.p047o;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C2692l;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.o.h */
public class C2713h {

    /* renamed from: a */
    private C2692l f8691a;

    /* renamed from: b */
    private int f8692b;

    /* renamed from: c */
    private C2717l f8693c = new C2714i();

    public C2713h(int i, C2692l lVar) {
        this.f8692b = i;
        this.f8691a = lVar;
    }

    /* renamed from: a */
    public C2692l mo9881a(List<C2692l> list, boolean z) {
        return this.f8693c.mo9887b(list, mo9882b(z));
    }

    /* renamed from: b */
    public C2692l mo9882b(boolean z) {
        C2692l lVar = this.f8691a;
        if (lVar == null) {
            return null;
        }
        return z ? lVar.mo9817g() : lVar;
    }

    /* renamed from: c */
    public int mo9883c() {
        return this.f8692b;
    }

    /* renamed from: d */
    public Rect mo9884d(C2692l lVar) {
        return this.f8693c.mo9880d(lVar, this.f8691a);
    }

    /* renamed from: e */
    public void mo9885e(C2717l lVar) {
        this.f8693c = lVar;
    }
}
