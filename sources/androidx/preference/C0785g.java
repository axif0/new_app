package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0632c;
import androidx.fragment.app.C0653m;
import androidx.fragment.app.C0675u;
import androidx.fragment.app.Fragment;
import androidx.preference.C0798j;
import androidx.preference.DialogPreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.preference.g */
public abstract class C0785g extends Fragment implements C0798j.C0801c, C0798j.C0799a, C0798j.C0800b, DialogPreference.C0747a {

    /* renamed from: b0 */
    private final C0788c f3132b0 = new C0788c();

    /* renamed from: c0 */
    private C0798j f3133c0;

    /* renamed from: d0 */
    RecyclerView f3134d0;

    /* renamed from: e0 */
    private boolean f3135e0;

    /* renamed from: f0 */
    private boolean f3136f0;

    /* renamed from: g0 */
    private int f3137g0 = C0810q.preference_list_fragment;

    /* renamed from: h0 */
    private Runnable f3138h0;

    /* renamed from: i0 */
    private Handler f3139i0 = new C0786a();

    /* renamed from: j0 */
    private final Runnable f3140j0 = new C0787b();

    /* renamed from: androidx.preference.g$a */
    class C0786a extends Handler {
        C0786a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C0785g.this.mo3933J1();
            }
        }
    }

    /* renamed from: androidx.preference.g$b */
    class C0787b implements Runnable {
        C0787b() {
        }

        public void run() {
            RecyclerView recyclerView = C0785g.this.f3134d0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: androidx.preference.g$c */
    private class C0788c extends RecyclerView.C0842n {

        /* renamed from: a */
        private Drawable f3143a;

        /* renamed from: b */
        private int f3144b;

        /* renamed from: c */
        private boolean f3145c = true;

        C0788c() {
        }

        /* renamed from: m */
        private boolean m3971m(View view, RecyclerView recyclerView) {
            RecyclerView.C0829d0 f0 = recyclerView.mo4167f0(view);
            boolean z = false;
            if (!((f0 instanceof C0805l) && ((C0805l) f0).mo4007O())) {
                return false;
            }
            boolean z2 = this.f3145c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.C0829d0 f02 = recyclerView.mo4167f0(recyclerView.getChildAt(indexOfChild + 1));
            if ((f02 instanceof C0805l) && ((C0805l) f02).mo4006N()) {
                z = true;
            }
            return z;
        }

        /* renamed from: e */
        public void mo3951e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0823a0 a0Var) {
            if (m3971m(view, recyclerView)) {
                rect.bottom = this.f3144b;
            }
        }

        /* renamed from: i */
        public void mo3952i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0823a0 a0Var) {
            if (this.f3143a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (m3971m(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.f3143a.setBounds(0, y, width, this.f3144b + y);
                        this.f3143a.draw(canvas);
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo3953j(boolean z) {
            this.f3145c = z;
        }

        /* renamed from: k */
        public void mo3954k(Drawable drawable) {
            this.f3144b = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.f3143a = drawable;
            C0785g.this.f3134d0.mo4262t0();
        }

        /* renamed from: l */
        public void mo3955l(int i) {
            this.f3144b = i;
            C0785g.this.f3134d0.mo4262t0();
        }
    }

    /* renamed from: androidx.preference.g$d */
    public interface C0789d {
        /* renamed from: a */
        boolean mo3956a(C0785g gVar, Preference preference);
    }

    /* renamed from: androidx.preference.g$e */
    public interface C0790e {
        /* renamed from: a */
        boolean mo3957a(C0785g gVar, Preference preference);
    }

    /* renamed from: androidx.preference.g$f */
    public interface C0791f {
        /* renamed from: a */
        boolean mo3958a(C0785g gVar, PreferenceScreen preferenceScreen);
    }

    /* renamed from: T1 */
    private void m3943T1() {
        if (!this.f3139i0.hasMessages(1)) {
            this.f3139i0.obtainMessage(1).sendToTarget();
        }
    }

    /* renamed from: U1 */
    private void m3944U1() {
        if (this.f3133c0 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    /* renamed from: Z1 */
    private void m3945Z1() {
        mo3935L1().setAdapter((RecyclerView.C0832g) null);
        PreferenceScreen M1 = mo3936M1();
        if (M1 != null) {
            M1.mo3814Z();
        }
        mo3941S1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public void mo3933J1() {
        PreferenceScreen M1 = mo3936M1();
        if (M1 != null) {
            mo3935L1().setAdapter(mo3938O1(M1));
            M1.mo3810T();
        }
        mo3937N1();
    }

    /* renamed from: K1 */
    public Fragment mo3934K1() {
        return null;
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        PreferenceScreen M1 = mo3936M1();
        if (M1 != null) {
            Bundle bundle2 = new Bundle();
            M1.mo3835q0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* renamed from: L1 */
    public final RecyclerView mo3935L1() {
        return this.f3134d0;
    }

    /* renamed from: M0 */
    public void mo3159M0() {
        super.mo3159M0();
        this.f3133c0.mo3997o(this);
        this.f3133c0.mo3995m(this);
    }

    /* renamed from: M1 */
    public PreferenceScreen mo3936M1() {
        return this.f3133c0.mo3992i();
    }

    /* renamed from: N0 */
    public void mo3161N0() {
        super.mo3161N0();
        this.f3133c0.mo3997o((C0798j.C0801c) null);
        this.f3133c0.mo3995m((C0798j.C0799a) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N1 */
    public void mo3937N1() {
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen M1;
        super.mo341O0(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (M1 = mo3936M1()) == null)) {
            M1.mo3833p0(bundle2);
        }
        if (this.f3135e0) {
            mo3933J1();
            Runnable runnable = this.f3138h0;
            if (runnable != null) {
                runnable.run();
                this.f3138h0 = null;
            }
        }
        this.f3136f0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public RecyclerView.C0832g mo3938O1(PreferenceScreen preferenceScreen) {
        return new C0792h(preferenceScreen);
    }

    /* renamed from: P1 */
    public RecyclerView.C0843o mo3939P1() {
        return new LinearLayoutManager(mo3242y());
    }

    /* renamed from: Q1 */
    public abstract void mo371Q1(Bundle bundle, String str);

    /* renamed from: R1 */
    public RecyclerView mo3940R1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (mo3242y().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C0809p.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C0810q.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(mo3939P1());
        recyclerView2.setAccessibilityDelegateCompat(new C0803k(recyclerView2));
        return recyclerView2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public void mo3941S1() {
    }

    /* renamed from: V1 */
    public void mo3942V1(Drawable drawable) {
        this.f3132b0.mo3954k(drawable);
    }

    /* renamed from: W1 */
    public void mo3943W1(int i) {
        this.f3132b0.mo3955l(i);
    }

    /* renamed from: X1 */
    public void mo3944X1(PreferenceScreen preferenceScreen) {
        if (this.f3133c0.mo3998p(preferenceScreen) && preferenceScreen != null) {
            mo3941S1();
            this.f3135e0 = true;
            if (this.f3136f0) {
                m3943T1();
            }
        }
    }

    /* renamed from: Y1 */
    public void mo3945Y1(int i, String str) {
        m3944U1();
        PreferenceScreen k = this.f3133c0.mo3994k(mo3242y(), i, (PreferenceScreen) null);
        Object obj = k;
        if (str != null) {
            Object L0 = k.mo3866L0(str);
            boolean z = L0 instanceof PreferenceScreen;
            obj = L0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        mo3944X1((PreferenceScreen) obj);
    }

    /* renamed from: e */
    public <T extends Preference> T mo3745e(CharSequence charSequence) {
        C0798j jVar = this.f3133c0;
        if (jVar == null) {
            return null;
        }
        return jVar.mo3985a(charSequence);
    }

    /* renamed from: g */
    public void mo3946g(Preference preference) {
        C0632c cVar;
        boolean a = mo3934K1() instanceof C0789d ? ((C0789d) mo3934K1()).mo3956a(this, preference) : false;
        if (!a && (mo3215o() instanceof C0789d)) {
            a = ((C0789d) mo3215o()).mo3956a(this, preference);
        }
        if (!a && mo3156K().mo3426X("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                cVar = C0777a.m3903f2(preference.mo3842u());
            } else if (preference instanceof ListPreference) {
                cVar = C0779c.m3914f2(preference.mo3842u());
            } else if (preference instanceof MultiSelectListPreference) {
                cVar = C0781d.m3920f2(preference.mo3842u());
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            cVar.mo3137C1(this, 0);
            cVar.mo3292W1(mo3156K(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    /* renamed from: h */
    public void mo3947h(PreferenceScreen preferenceScreen) {
        if (!(mo3934K1() instanceof C0791f ? ((C0791f) mo3934K1()).mo3958a(this, preferenceScreen) : false) && (mo3215o() instanceof C0791f)) {
            ((C0791f) mo3215o()).mo3958a(this, preferenceScreen);
        }
    }

    /* renamed from: i */
    public boolean mo3948i(Preference preference) {
        if (preference.mo3836r() == null) {
            return false;
        }
        boolean a = mo3934K1() instanceof C0790e ? ((C0790e) mo3934K1()).mo3957a(this, preference) : false;
        if (!a && (mo3215o() instanceof C0790e)) {
            a = ((C0790e) mo3215o()).mo3957a(this, preference);
        }
        if (a) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        C0653m z = mo3214n1().mo3317z();
        Bundle o = preference.mo3832o();
        Fragment a2 = z.mo3433e0().mo3375a(mo3214n1().getClassLoader(), preference.mo3836r());
        a2.mo3233u1(o);
        a2.mo3137C1(this, 0);
        C0675u i = z.mo3440i();
        i.mo3569q(((View) mo3175V().getParent()).getId(), a2);
        i.mo3566g((String) null);
        i.mo3262i();
        return true;
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        TypedValue typedValue = new TypedValue();
        mo3215o().getTheme().resolveAttribute(C0806m.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C0812s.PreferenceThemeOverlay;
        }
        mo3215o().getTheme().applyStyle(i, false);
        C0798j jVar = new C0798j(mo3242y());
        this.f3133c0 = jVar;
        jVar.mo3996n(this);
        mo371Q1(bundle, mo3237w() != null ? mo3237w().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = mo3242y().obtainStyledAttributes((AttributeSet) null, C0813t.PreferenceFragmentCompat, C0806m.preferenceFragmentCompatStyle, 0);
        this.f3137g0 = obtainStyledAttributes.getResourceId(C0813t.PreferenceFragmentCompat_android_layout, this.f3137g0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0813t.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0813t.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(C0813t.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(mo3242y());
        View inflate = cloneInContext.inflate(this.f3137g0, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView R1 = mo3940R1(cloneInContext, viewGroup2, bundle);
            if (R1 != null) {
                this.f3134d0 = R1;
                R1.mo4191h(this.f3132b0);
                mo3942V1(drawable);
                if (dimensionPixelSize != -1) {
                    mo3943W1(dimensionPixelSize);
                }
                this.f3132b0.mo3953j(z);
                if (this.f3134d0.getParent() == null) {
                    viewGroup2.addView(this.f3134d0);
                }
                this.f3139i0.post(this.f3140j0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    /* renamed from: w0 */
    public void mo3238w0() {
        this.f3139i0.removeCallbacks(this.f3140j0);
        this.f3139i0.removeMessages(1);
        if (this.f3135e0) {
            m3945Z1();
        }
        this.f3134d0 = null;
        super.mo3238w0();
    }
}
