package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
final class C1782f4 {

    /* renamed from: A */
    private long f5784A;

    /* renamed from: B */
    private long f5785B;

    /* renamed from: C */
    private long f5786C;

    /* renamed from: D */
    private String f5787D;

    /* renamed from: E */
    private boolean f5788E;

    /* renamed from: F */
    private long f5789F;

    /* renamed from: G */
    private long f5790G;

    /* renamed from: a */
    private final C1807h5 f5791a;

    /* renamed from: b */
    private final String f5792b;

    /* renamed from: c */
    private String f5793c;

    /* renamed from: d */
    private String f5794d;

    /* renamed from: e */
    private String f5795e;

    /* renamed from: f */
    private String f5796f;

    /* renamed from: g */
    private long f5797g;

    /* renamed from: h */
    private long f5798h;

    /* renamed from: i */
    private long f5799i;

    /* renamed from: j */
    private String f5800j;

    /* renamed from: k */
    private long f5801k;

    /* renamed from: l */
    private String f5802l;

    /* renamed from: m */
    private long f5803m;

    /* renamed from: n */
    private long f5804n;

    /* renamed from: o */
    private boolean f5805o;

    /* renamed from: p */
    private long f5806p;

    /* renamed from: q */
    private boolean f5807q;

    /* renamed from: r */
    private boolean f5808r;

    /* renamed from: s */
    private String f5809s;

    /* renamed from: t */
    private Boolean f5810t;

    /* renamed from: u */
    private long f5811u;

    /* renamed from: v */
    private List<String> f5812v;

    /* renamed from: w */
    private String f5813w;

    /* renamed from: x */
    private long f5814x;

    /* renamed from: y */
    private long f5815y;

    /* renamed from: z */
    private long f5816z;

    C1782f4(C1807h5 h5Var, String str) {
        C1658o.m7845j(h5Var);
        C1658o.m7841f(str);
        this.f5791a = h5Var;
        this.f5792b = str;
        h5Var.mo6706e().mo6700b();
    }

    /* renamed from: A */
    public final String mo6898A() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5794d;
    }

    /* renamed from: B */
    public final void mo6899B(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5804n != j;
        this.f5804n = j;
    }

    /* renamed from: C */
    public final void mo6900C(String str) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8442B0(this.f5795e, str);
        this.f5795e = str;
    }

    /* renamed from: D */
    public final String mo6901D() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5809s;
    }

    /* renamed from: E */
    public final void mo6902E(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5811u != j;
        this.f5811u = j;
    }

    /* renamed from: F */
    public final void mo6903F(String str) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8442B0(this.f5796f, str);
        this.f5796f = str;
    }

    /* renamed from: G */
    public final String mo6904G() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5813w;
    }

    /* renamed from: H */
    public final void mo6905H(long j) {
        boolean z = true;
        C1658o.m7836a(j >= 0);
        this.f5791a.mo6706e().mo6700b();
        boolean z2 = this.f5788E;
        if (this.f5797g == j) {
            z = false;
        }
        this.f5788E = z | z2;
        this.f5797g = j;
    }

    /* renamed from: I */
    public final void mo6906I(String str) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8442B0(this.f5800j, str);
        this.f5800j = str;
    }

    /* renamed from: J */
    public final String mo6907J() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5795e;
    }

    /* renamed from: K */
    public final void mo6908K(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5789F != j;
        this.f5789F = j;
    }

    /* renamed from: L */
    public final void mo6909L(String str) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8442B0(this.f5802l, str);
        this.f5802l = str;
    }

    /* renamed from: M */
    public final String mo6910M() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5796f;
    }

    /* renamed from: N */
    public final void mo6911N(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5790G != j;
        this.f5790G = j;
    }

    /* renamed from: O */
    public final void mo6912O(String str) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8442B0(this.f5787D, str);
        this.f5787D = str;
    }

    /* renamed from: P */
    public final long mo6913P() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5798h;
    }

    /* renamed from: Q */
    public final void mo6914Q(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5814x != j;
        this.f5814x = j;
    }

    /* renamed from: R */
    public final long mo6915R() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5799i;
    }

    /* renamed from: S */
    public final void mo6916S(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5815y != j;
        this.f5815y = j;
    }

    /* renamed from: T */
    public final String mo6917T() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5800j;
    }

    /* renamed from: U */
    public final void mo6918U(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5816z != j;
        this.f5816z = j;
    }

    /* renamed from: V */
    public final long mo6919V() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5801k;
    }

    /* renamed from: W */
    public final void mo6920W(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5784A != j;
        this.f5784A = j;
    }

    /* renamed from: X */
    public final String mo6921X() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5802l;
    }

    /* renamed from: Y */
    public final void mo6922Y(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5786C != j;
        this.f5786C = j;
    }

    /* renamed from: Z */
    public final long mo6923Z() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5803m;
    }

    /* renamed from: a */
    public final void mo6924a(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5798h != j;
        this.f5798h = j;
    }

    /* renamed from: a0 */
    public final void mo6925a0(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5785B != j;
        this.f5785B = j;
    }

    /* renamed from: b */
    public final void mo6926b(Boolean bool) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8458b0(this.f5810t, bool);
        this.f5810t = bool;
    }

    /* renamed from: b0 */
    public final long mo6927b0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5804n;
    }

    /* renamed from: c */
    public final void mo6928c(String str) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= !C1788fa.m8442B0(this.f5793c, str);
        this.f5793c = str;
    }

    /* renamed from: c0 */
    public final void mo6929c0(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5806p != j;
        this.f5806p = j;
    }

    /* renamed from: d */
    public final void mo6930d(List<String> list) {
        this.f5791a.mo6706e().mo6700b();
        if (!C1788fa.m8463n0(this.f5812v, list)) {
            this.f5788E = true;
            this.f5812v = list != null ? new ArrayList(list) : null;
        }
    }

    /* renamed from: d0 */
    public final long mo6931d0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5811u;
    }

    /* renamed from: e */
    public final void mo6932e(boolean z) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5805o != z;
        this.f5805o = z;
    }

    /* renamed from: e0 */
    public final boolean mo6933e0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5805o;
    }

    /* renamed from: f */
    public final boolean mo6934f() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5788E;
    }

    /* renamed from: f0 */
    public final long mo6935f0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5797g;
    }

    /* renamed from: g */
    public final long mo6936g() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5786C;
    }

    /* renamed from: g0 */
    public final long mo6937g0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5789F;
    }

    /* renamed from: h */
    public final long mo6938h() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5785B;
    }

    /* renamed from: h0 */
    public final long mo6939h0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5790G;
    }

    /* renamed from: i */
    public final String mo6940i() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5787D;
    }

    /* renamed from: i0 */
    public final void mo6941i0() {
        this.f5791a.mo6706e().mo6700b();
        long j = this.f5797g + 1;
        if (j > 2147483647L) {
            this.f5791a.mo6709i().mo6767H().mo6886b("Bundle index overflow. appId", C1746c4.m8178w(this.f5792b));
            j = 0;
        }
        this.f5788E = true;
        this.f5797g = j;
    }

    /* renamed from: j */
    public final String mo6942j() {
        this.f5791a.mo6706e().mo6700b();
        String str = this.f5787D;
        mo6912O((String) null);
        return str;
    }

    /* renamed from: j0 */
    public final long mo6943j0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5814x;
    }

    /* renamed from: k */
    public final long mo6944k() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5806p;
    }

    /* renamed from: k0 */
    public final long mo6945k0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5815y;
    }

    /* renamed from: l */
    public final boolean mo6946l() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5807q;
    }

    /* renamed from: l0 */
    public final long mo6947l0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5816z;
    }

    /* renamed from: m */
    public final boolean mo6948m() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5808r;
    }

    /* renamed from: m0 */
    public final long mo6949m0() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5784A;
    }

    /* renamed from: n */
    public final Boolean mo6950n() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5810t;
    }

    /* renamed from: o */
    public final List<String> mo6951o() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5812v;
    }

    /* renamed from: p */
    public final void mo6952p() {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E = false;
    }

    /* renamed from: q */
    public final void mo6953q(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5799i != j;
        this.f5799i = j;
    }

    /* renamed from: r */
    public final void mo6954r(String str) {
        this.f5791a.mo6706e().mo6700b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5788E |= !C1788fa.m8442B0(this.f5794d, str);
        this.f5794d = str;
    }

    /* renamed from: s */
    public final void mo6955s(boolean z) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5807q != z;
        this.f5807q = z;
    }

    /* renamed from: t */
    public final String mo6956t() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5792b;
    }

    /* renamed from: u */
    public final void mo6957u(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5801k != j;
        this.f5801k = j;
    }

    /* renamed from: v */
    public final void mo6958v(String str) {
        this.f5791a.mo6706e().mo6700b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5788E |= !C1788fa.m8442B0(this.f5809s, str);
        this.f5809s = str;
    }

    /* renamed from: w */
    public final void mo6959w(boolean z) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5808r != z;
        this.f5808r = z;
    }

    /* renamed from: x */
    public final String mo6960x() {
        this.f5791a.mo6706e().mo6700b();
        return this.f5793c;
    }

    /* renamed from: y */
    public final void mo6961y(long j) {
        this.f5791a.mo6706e().mo6700b();
        this.f5788E |= this.f5803m != j;
        this.f5803m = j;
    }

    /* renamed from: z */
    public final void mo6962z(String str) {
        this.f5791a.mo6706e().mo6700b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f5788E |= !C1788fa.m8442B0(this.f5813w, str);
        this.f5813w = str;
    }
}
