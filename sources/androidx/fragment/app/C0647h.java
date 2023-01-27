package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0742w;
import p086f.p111h.p121l.C3349h;

/* renamed from: androidx.fragment.app.h */
public class C0647h {

    /* renamed from: a */
    private final C0649j<?> f2727a;

    private C0647h(C0649j<?> jVar) {
        this.f2727a = jVar;
    }

    /* renamed from: b */
    public static C0647h m3206b(C0649j<?> jVar) {
        C3349h.m14362d(jVar, "callbacks == null");
        return new C0647h(jVar);
    }

    /* renamed from: a */
    public void mo3351a(Fragment fragment) {
        C0649j<?> jVar = this.f2727a;
        jVar.f2732i.mo3436g(jVar, jVar, fragment);
    }

    /* renamed from: c */
    public void mo3352c() {
        this.f2727a.f2732i.mo3450r();
    }

    /* renamed from: d */
    public void mo3353d(Configuration configuration) {
        this.f2727a.f2732i.mo3452s(configuration);
    }

    /* renamed from: e */
    public boolean mo3354e(MenuItem menuItem) {
        return this.f2727a.f2732i.mo3454t(menuItem);
    }

    /* renamed from: f */
    public void mo3355f() {
        this.f2727a.f2732i.mo3457u();
    }

    /* renamed from: g */
    public boolean mo3356g(Menu menu, MenuInflater menuInflater) {
        return this.f2727a.f2732i.mo3459v(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo3357h() {
        this.f2727a.f2732i.mo3460w();
    }

    /* renamed from: i */
    public void mo3358i() {
        this.f2727a.f2732i.mo3463y();
    }

    /* renamed from: j */
    public void mo3359j(boolean z) {
        this.f2727a.f2732i.mo3465z(z);
    }

    /* renamed from: k */
    public boolean mo3360k(MenuItem menuItem) {
        return this.f2727a.f2732i.mo3395A(menuItem);
    }

    /* renamed from: l */
    public void mo3361l(Menu menu) {
        this.f2727a.f2732i.mo3397B(menu);
    }

    /* renamed from: m */
    public void mo3362m() {
        this.f2727a.f2732i.mo3400D();
    }

    /* renamed from: n */
    public void mo3363n(boolean z) {
        this.f2727a.f2732i.mo3402E(z);
    }

    /* renamed from: o */
    public boolean mo3364o(Menu menu) {
        return this.f2727a.f2732i.mo3404F(menu);
    }

    /* renamed from: p */
    public void mo3365p() {
        this.f2727a.f2732i.mo3407H();
    }

    /* renamed from: q */
    public void mo3366q() {
        this.f2727a.f2732i.mo3408I();
    }

    /* renamed from: r */
    public void mo3367r() {
        this.f2727a.f2732i.mo3411K();
    }

    /* renamed from: s */
    public boolean mo3368s() {
        return this.f2727a.f2732i.mo3417Q(true);
    }

    /* renamed from: t */
    public Fragment mo3369t(String str) {
        return this.f2727a.f2732i.mo3427Y(str);
    }

    /* renamed from: u */
    public C0653m mo3370u() {
        return this.f2727a.f2732i;
    }

    /* renamed from: v */
    public void mo3371v() {
        this.f2727a.f2732i.mo3398B0();
    }

    /* renamed from: w */
    public View mo3372w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2727a.f2732i.mo3437g0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public void mo3373x(Parcelable parcelable) {
        C0649j<?> jVar = this.f2727a;
        if (jVar instanceof C0742w) {
            jVar.f2732i.mo3414N0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: y */
    public Parcelable mo3374y() {
        return this.f2727a.f2732i.mo3416P0();
    }
}
