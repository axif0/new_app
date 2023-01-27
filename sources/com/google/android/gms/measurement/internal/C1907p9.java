package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p148g.p189d.p190a.p232c.p241f.p247f.C4680mc;
import p148g.p189d.p190a.p232c.p241f.p247f.C4697nc;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
final class C1907p9 {

    /* renamed from: a */
    private long f6172a;

    /* renamed from: b */
    private long f6173b;

    /* renamed from: c */
    private final C1837k f6174c = new C1895o9(this, this.f6175d.f5634a);

    /* renamed from: d */
    private final /* synthetic */ C1835j9 f6175d;

    public C1907p9(C1835j9 j9Var) {
        this.f6175d = j9Var;
        long a = j9Var.mo6708g().mo6585a();
        this.f6172a = a;
        this.f6173b = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m8794h() {
        this.f6175d.mo6700b();
        mo7300d(false, false, this.f6175d.mo6708g().mo6585a());
        this.f6175d.mo6854o().mo6686v(this.f6175d.mo6708g().mo6585a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7298a() {
        this.f6174c.mo7167e();
        this.f6172a = 0;
        this.f6173b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7299b(long j) {
        this.f6175d.mo6700b();
        this.f6174c.mo7167e();
        this.f6172a = j;
        this.f6173b = j;
    }

    /* renamed from: d */
    public final boolean mo7300d(boolean z, boolean z2, long j) {
        this.f6175d.mo6700b();
        this.f6175d.mo6965w();
        if (!C4680mc.m19971b() || !this.f6175d.mo6712l().mo7415s(C1957u.f6391s0) || this.f6175d.f5634a.mo7044p()) {
            this.f6175d.mo6711k().f6150u.mo7344b(this.f6175d.mo6708g().mo6587c());
        }
        long j2 = j - this.f6172a;
        if (z || j2 >= 1000) {
            if (this.f6175d.mo6712l().mo7415s(C1957u.f6347U) && !z2) {
                j2 = (!C4697nc.m20007b() || !this.f6175d.mo6712l().mo7415s(C1957u.f6350W)) ? mo7301e() : mo7303g(j);
            }
            this.f6175d.mo6709i().mo6772M().mo6886b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C1953t7.m8858O(this.f6175d.mo6858s().mo7347D(!this.f6175d.mo6712l().mo7403H().booleanValue()), bundle, true);
            if (this.f6175d.mo6712l().mo7415s(C1957u.f6347U) && !this.f6175d.mo6712l().mo7415s(C1957u.f6349V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f6175d.mo6712l().mo7415s(C1957u.f6349V) || !z2) {
                this.f6175d.mo6855p().mo7195X("auto", "_e", bundle);
            }
            this.f6172a = j;
            this.f6174c.mo7167e();
            this.f6174c.mo7165c(3600000);
            return true;
        }
        this.f6175d.mo6709i().mo6772M().mo6886b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo7301e() {
        long a = this.f6175d.mo6708g().mo6585a();
        long j = a - this.f6173b;
        this.f6173b = a;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo7302f(long j) {
        this.f6174c.mo7167e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final long mo7303g(long j) {
        long j2 = j - this.f6173b;
        this.f6173b = j;
        return j2;
    }
}
