package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.p037t.C1663a;
import com.google.android.gms.common.stats.C1673a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p148g.p189d.p190a.p232c.p237d.C4379j;
import p148g.p189d.p190a.p232c.p241f.p247f.C4571gf;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
public final class C1750c8 extends C1783f5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1990w8 f5702c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1961u3 f5703d;

    /* renamed from: e */
    private volatile Boolean f5704e;

    /* renamed from: f */
    private final C1837k f5705f;

    /* renamed from: g */
    private final C1919q9 f5706g;

    /* renamed from: h */
    private final List<Runnable> f5707h = new ArrayList();

    /* renamed from: i */
    private final C1837k f5708i;

    protected C1750c8(C1807h5 h5Var) {
        super(h5Var);
        this.f5706g = new C1919q9(h5Var.mo6708g());
        this.f5702c = new C1990w8(this);
        this.f5705f = new C1738b8(this, h5Var);
        this.f5708i = new C1858l8(this, h5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m8202D(ComponentName componentName) {
        mo6700b();
        if (this.f5703d != null) {
            this.f5703d = null;
            mo6709i().mo6772M().mo6886b("Disconnected from device MeasurementService", componentName);
            mo6700b();
            mo6796Z();
        }
    }

    /* renamed from: Q */
    private final void m8204Q(Runnable runnable) throws IllegalStateException {
        mo6700b();
        if (mo6792V()) {
            runnable.run();
        } else if (((long) this.f5707h.size()) >= 1000) {
            mo6709i().mo6764E().mo6885a("Discarding data. Max runnable queue size reached");
        } else {
            this.f5707h.add(runnable);
            this.f5708i.mo7165c(60000);
            mo6796Z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m8205e0() {
        mo6700b();
        this.f5706g.mo7314a();
        this.f5705f.mo7165c(C1957u.f6325J.mo7323a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m8206f0() {
        /*
            r5 = this;
            r5.mo6700b()
            r5.mo6965w()
            java.lang.Boolean r0 = r5.f5704e
            if (r0 != 0) goto L_0x00fb
            r5.mo6700b()
            r5.mo6965w()
            com.google.android.gms.measurement.internal.p4 r0 = r5.mo6711k()
            java.lang.Boolean r0 = r0.mo7280G()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00f5
        L_0x0023:
            com.google.android.gms.measurement.internal.v3 r2 = r5.mo6856q()
            int r2 = r2.mo7375H()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = 1
            goto L_0x00d1
        L_0x0031:
            com.google.android.gms.measurement.internal.c4 r2 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6772M()
            java.lang.String r4 = "Checking service availability"
            r2.mo6885a(r4)
            com.google.android.gms.measurement.internal.fa r2 = r5.mo6707f()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.mo7004t(r4)
            if (r2 == 0) goto L_0x00c2
            if (r2 == r1) goto L_0x00b2
            r4 = 2
            if (r2 == r4) goto L_0x0092
            r0 = 3
            if (r2 == r0) goto L_0x0083
            r0 = 9
            if (r2 == r0) goto L_0x0078
            r0 = 18
            if (r2 == r0) goto L_0x006d
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6767H()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.mo6886b(r2, r1)
            goto L_0x0090
        L_0x006d:
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6767H()
            java.lang.String r2 = "Service updating"
            goto L_0x00cc
        L_0x0078:
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6767H()
            java.lang.String r1 = "Service invalid"
            goto L_0x008d
        L_0x0083:
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6767H()
            java.lang.String r1 = "Service disabled"
        L_0x008d:
            r0.mo6885a(r1)
        L_0x0090:
            r0 = 0
            goto L_0x00c0
        L_0x0092:
            com.google.android.gms.measurement.internal.c4 r2 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6771L()
            java.lang.String r4 = "Service container out of date"
            r2.mo6885a(r4)
            com.google.android.gms.measurement.internal.fa r2 = r5.mo6707f()
            int r2 = r2.mo6981K0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00ac
            goto L_0x00bf
        L_0x00ac:
            if (r0 != 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            r0 = 0
            goto L_0x00d1
        L_0x00b2:
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6772M()
            java.lang.String r2 = "Service missing"
            r0.mo6885a(r2)
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            r1 = 0
            goto L_0x00d1
        L_0x00c2:
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6772M()
            java.lang.String r2 = "Service available"
        L_0x00cc:
            r0.mo6885a(r2)
            goto L_0x002e
        L_0x00d1:
            if (r1 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.wa r2 = r5.mo6712l()
            boolean r2 = r2.mo7410Q()
            if (r2 == 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.c4 r0 = r5.mo6709i()
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.mo6885a(r2)
            goto L_0x00ec
        L_0x00eb:
            r3 = r0
        L_0x00ec:
            if (r3 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.p4 r0 = r5.mo6711k()
            r0.mo7289v(r1)
        L_0x00f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f5704e = r0
        L_0x00fb:
            java.lang.Boolean r0 = r5.f5704e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1750c8.m8206f0():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m8207g0() {
        mo6700b();
        if (mo6792V()) {
            mo6709i().mo6772M().mo6885a("Inactivity, disconnecting from the service");
            mo6798b0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m8208h0() {
        mo6700b();
        mo6709i().mo6772M().mo6886b("Processing queued up service tasks", Integer.valueOf(this.f5707h.size()));
        for (Runnable run : this.f5707h) {
            try {
                run.run();
            } catch (Exception e) {
                mo6709i().mo6764E().mo6886b("Task exception while flushing queue", e);
            }
        }
        this.f5707h.clear();
        this.f5708i.mo7167e();
    }

    /* renamed from: i0 */
    private final C1860la m8209i0(boolean z) {
        return mo6856q().mo7369B(z ? mo6709i().mo6773N() : null);
    }

    /* renamed from: E */
    public final void mo6777E(Bundle bundle) {
        mo6700b();
        mo6965w();
        m8204Q(new C1870m8(this, bundle, m8209i0(false)));
    }

    /* renamed from: F */
    public final void mo6778F(C4571gf gfVar) {
        mo6700b();
        mo6965w();
        m8204Q(new C1810h8(this, m8209i0(false), gfVar));
    }

    /* renamed from: G */
    public final void mo6779G(C4571gf gfVar, C1933s sVar, String str) {
        mo6700b();
        mo6965w();
        if (mo6707f().mo7004t(C4379j.f13918a) != 0) {
            mo6709i().mo6767H().mo6885a("Not bundling data. Service unavailable or out of date");
            mo6707f().mo6992U(gfVar, new byte[0]);
            return;
        }
        m8204Q(new C1894o8(this, sVar, str, gfVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo6780H(C4571gf gfVar, String str, String str2) {
        mo6700b();
        mo6965w();
        m8204Q(new C1966u8(this, str, str2, m8209i0(false), gfVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo6781I(C4571gf gfVar, String str, String str2, boolean z) {
        mo6700b();
        mo6965w();
        m8204Q(new C1774e8(this, str, str2, z, m8209i0(false), gfVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo6782J(C1933s sVar, String str) {
        C1658o.m7845j(sVar);
        mo6700b();
        mo6965w();
        m8204Q(new C1906p8(this, true, mo6859t().mo7471E(sVar), sVar, m8209i0(true), str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo6783K(C1961u3 u3Var) {
        mo6700b();
        C1658o.m7845j(u3Var);
        this.f5703d = u3Var;
        m8205e0();
        m8208h0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo6784L(C1961u3 u3Var, C1663a aVar, C1860la laVar) {
        int i;
        C1770e4 E;
        String str;
        mo6700b();
        mo6965w();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<C1663a> C = mo6859t().mo7470C(100);
            if (C != null) {
                arrayList.addAll(C);
                i = C.size();
            } else {
                i = 0;
            }
            if (aVar != null && i < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C1663a aVar2 = (C1663a) obj;
                if (aVar2 instanceof C1933s) {
                    try {
                        u3Var.mo7137a0((C1933s) aVar2, laVar);
                    } catch (RemoteException e) {
                        e = e;
                        E = mo6709i().mo6764E();
                        str = "Failed to send event to the service";
                    }
                } else if (aVar2 instanceof C1776ea) {
                    try {
                        u3Var.mo7132T((C1776ea) aVar2, laVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        E = mo6709i().mo6764E();
                        str = "Failed to send user property to the service";
                    }
                } else if (aVar2 instanceof C1968ua) {
                    try {
                        u3Var.mo7124C((C1968ua) aVar2, laVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        E = mo6709i().mo6764E();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    mo6709i().mo6764E().mo6885a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
        return;
        E.mo6886b(str, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo6785M(C1965u7 u7Var) {
        mo6700b();
        mo6965w();
        m8204Q(new C1834j8(this, u7Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo6786O(C1776ea eaVar) {
        mo6700b();
        mo6965w();
        m8204Q(new C1762d8(this, mo6859t().mo7472F(eaVar), eaVar, m8209i0(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo6787P(C1968ua uaVar) {
        C1658o.m7845j(uaVar);
        mo6700b();
        mo6965w();
        m8204Q(new C1942s8(this, true, mo6859t().mo7473G(uaVar), new C1968ua(uaVar), m8209i0(true), uaVar));
    }

    /* renamed from: R */
    public final void mo6788R(AtomicReference<String> atomicReference) {
        mo6700b();
        mo6965w();
        m8204Q(new C1822i8(this, atomicReference, m8209i0(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo6789S(AtomicReference<List<C1968ua>> atomicReference, String str, String str2, String str3) {
        mo6700b();
        mo6965w();
        m8204Q(new C1930r8(this, atomicReference, str, str2, str3, m8209i0(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo6790T(AtomicReference<List<C1776ea>> atomicReference, String str, String str2, String str3, boolean z) {
        mo6700b();
        mo6965w();
        m8204Q(new C1954t8(this, atomicReference, str, str2, str3, z, m8209i0(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo6791U(boolean z) {
        if (C4602ib.m19620b() && mo6712l().mo7415s(C1957u.f6338P0)) {
            mo6700b();
            mo6965w();
            if (z) {
                mo6859t().mo7474H();
            }
            if (mo6800d0()) {
                m8204Q(new C1918q8(this, m8209i0(false)));
            }
        }
    }

    /* renamed from: V */
    public final boolean mo6792V() {
        mo6700b();
        mo6965w();
        return this.f5703d != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo6793W() {
        mo6700b();
        mo6965w();
        m8204Q(new C1882n8(this, m8209i0(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo6794X() {
        mo6700b();
        mo6965w();
        C1860la i0 = m8209i0(false);
        mo6859t().mo7474H();
        m8204Q(new C1786f8(this, i0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo6795Y() {
        mo6700b();
        mo6965w();
        C1860la i0 = m8209i0(true);
        mo6859t().mo7475I();
        m8204Q(new C1846k8(this, i0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final void mo6796Z() {
        mo6700b();
        mo6965w();
        if (!mo6792V()) {
            if (m8206f0()) {
                this.f5702c.mo7392d();
            } else if (!mo6712l().mo7410Q()) {
                List<ResolveInfo> queryIntentServices = mo6710j().getPackageManager().queryIntentServices(new Intent().setClassName(mo6710j(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(mo6710j(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f5702c.mo7391b(intent);
                    return;
                }
                mo6709i().mo6764E().mo6885a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final Boolean mo6797a0() {
        return this.f5704e;
    }

    /* renamed from: b0 */
    public final void mo6798b0() {
        mo6700b();
        mo6965w();
        this.f5702c.mo7390a();
        try {
            C1673a.m7920b().mo6579c(mo6710j(), this.f5702c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5703d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final boolean mo6799c0() {
        mo6700b();
        mo6965w();
        return !m8206f0() || mo6707f().mo6981K0() >= 200900;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean mo6800d0() {
        mo6700b();
        mo6965w();
        if (!mo6712l().mo7415s(C1957u.f6340Q0)) {
            return false;
        }
        return !m8206f0() || mo6707f().mo6981K0() >= C1957u.f6342R0.mo7323a(null).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo6801z() {
        return false;
    }
}
