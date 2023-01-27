package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.C1562f;
import com.google.android.gms.common.api.C1563g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1613b;
import java.util.Set;
import p148g.p189d.p190a.p232c.p237d.C4372e;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C1637g<T extends IInterface> extends C1613b<T> implements C1547a.C1555f {

    /* renamed from: w */
    private final Set<Scope> f5508w;

    /* renamed from: x */
    private final Account f5509x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C1637g(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C1627c r13, com.google.android.gms.common.api.C1562f r14, com.google.android.gms.common.api.C1563g r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.h r3 = com.google.android.gms.common.internal.C1639h.m7803a(r10)
            g.d.a.c.d.e r4 = p148g.p189d.p190a.p232c.p237d.C4372e.m18564m()
            com.google.android.gms.common.internal.C1658o.m7845j(r14)
            r7 = r14
            com.google.android.gms.common.api.f r7 = (com.google.android.gms.common.api.C1562f) r7
            com.google.android.gms.common.internal.C1658o.m7845j(r15)
            r8 = r15
            com.google.android.gms.common.api.g r8 = (com.google.android.gms.common.api.C1563g) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1637g.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c, com.google.android.gms.common.api.f, com.google.android.gms.common.api.g):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C1637g(Context context, Looper looper, C1639h hVar, C4372e eVar, int i, C1627c cVar, C1562f fVar, C1563g gVar) {
        super(context, looper, hVar, eVar, i, m7794h0(fVar), m7795i0(gVar), cVar.mo6503e());
        this.f5509x = cVar.mo6499a();
        Set<Scope> c = cVar.mo6501c();
        m7796j0(c);
        this.f5508w = c;
    }

    /* renamed from: h0 */
    private static C1613b.C1614a m7794h0(C1562f fVar) {
        if (fVar == null) {
            return null;
        }
        return new C1668v(fVar);
    }

    /* renamed from: i0 */
    private static C1613b.C1615b m7795i0(C1563g gVar) {
        if (gVar == null) {
            return null;
        }
        return new C1669w(gVar);
    }

    /* renamed from: j0 */
    private final Set<Scope> m7796j0(Set<Scope> set) {
        mo6534g0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Set<Scope> mo6446A() {
        return this.f5508w;
    }

    /* renamed from: g */
    public int mo6464g() {
        return super.mo6464g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public Set<Scope> mo6534g0(Set<Scope> set) {
        return set;
    }

    /* renamed from: u */
    public final Account mo6475u() {
        return this.f5509x;
    }
}
