package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.C0798j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p112e.p113c.C3286g;
import p086f.p111h.p122m.p123c0.C3369c;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    private Object f3029A;

    /* renamed from: B */
    private boolean f3030B;

    /* renamed from: C */
    private boolean f3031C;

    /* renamed from: D */
    private boolean f3032D;

    /* renamed from: E */
    private boolean f3033E;

    /* renamed from: F */
    private boolean f3034F;

    /* renamed from: G */
    private boolean f3035G;

    /* renamed from: H */
    private boolean f3036H;

    /* renamed from: I */
    private boolean f3037I;

    /* renamed from: J */
    private boolean f3038J;

    /* renamed from: K */
    private boolean f3039K;

    /* renamed from: L */
    private int f3040L;

    /* renamed from: M */
    private int f3041M;

    /* renamed from: N */
    private C0761c f3042N;

    /* renamed from: O */
    private List<Preference> f3043O;

    /* renamed from: P */
    private PreferenceGroup f3044P;

    /* renamed from: Q */
    private boolean f3045Q;

    /* renamed from: R */
    private C0764f f3046R;

    /* renamed from: S */
    private C0765g f3047S;

    /* renamed from: T */
    private final View.OnClickListener f3048T;

    /* renamed from: f */
    private Context f3049f;

    /* renamed from: g */
    private C0798j f3050g;

    /* renamed from: h */
    private C0783e f3051h;

    /* renamed from: i */
    private long f3052i;

    /* renamed from: j */
    private boolean f3053j;

    /* renamed from: k */
    private C0762d f3054k;

    /* renamed from: l */
    private C0763e f3055l;

    /* renamed from: m */
    private int f3056m;

    /* renamed from: n */
    private int f3057n;

    /* renamed from: o */
    private CharSequence f3058o;

    /* renamed from: p */
    private CharSequence f3059p;

    /* renamed from: q */
    private int f3060q;

    /* renamed from: r */
    private Drawable f3061r;

    /* renamed from: s */
    private String f3062s;

    /* renamed from: t */
    private Intent f3063t;

    /* renamed from: u */
    private String f3064u;

    /* renamed from: v */
    private Bundle f3065v;

    /* renamed from: w */
    private boolean f3066w;

    /* renamed from: x */
    private boolean f3067x;

    /* renamed from: y */
    private boolean f3068y;

    /* renamed from: z */
    private String f3069z;

    /* renamed from: androidx.preference.Preference$a */
    class C0758a implements View.OnClickListener {
        C0758a() {
        }

        public void onClick(View view) {
            Preference.this.mo3736i0(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public static class C0759b extends AbsSavedState {
        public static final Parcelable.Creator<C0759b> CREATOR = new C0760a();

        /* renamed from: androidx.preference.Preference$b$a */
        static class C0760a implements Parcelable.Creator<C0759b> {
            C0760a() {
            }

            /* renamed from: a */
            public C0759b createFromParcel(Parcel parcel) {
                return new C0759b(parcel);
            }

            /* renamed from: b */
            public C0759b[] newArray(int i) {
                return new C0759b[i];
            }
        }

        public C0759b(Parcel parcel) {
            super(parcel);
        }

        public C0759b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$c */
    interface C0761c {
        /* renamed from: a */
        void mo3859a(Preference preference);

        /* renamed from: b */
        void mo3860b(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C0762d {
        /* renamed from: a */
        boolean mo391a(Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$e */
    public interface C0763e {
        /* renamed from: a */
        boolean mo3861a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$f */
    private static class C0764f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private final Preference f3071f;

        C0764f(Preference preference) {
            this.f3071f = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence F = this.f3071f.mo3768F();
            if (this.f3071f.mo3803L() && !TextUtils.isEmpty(F)) {
                contextMenu.setHeaderTitle(F);
                contextMenu.add(0, 0, 0, C0811r.copy).setOnMenuItemClickListener(this);
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence F = this.f3071f.mo3768F();
            ((ClipboardManager) this.f3071f.mo3831n().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", F));
            Toast.makeText(this.f3071f.mo3831n(), this.f3071f.mo3831n().getString(C0811r.preference_copied, new Object[]{F}), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$g */
    public interface C0765g<T extends Preference> {
        /* renamed from: a */
        CharSequence mo3765a(T t);
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4.f3056m = r0
            r1 = 0
            r4.f3057n = r1
            r2 = 1
            r4.f3066w = r2
            r4.f3067x = r2
            r4.f3068y = r2
            r4.f3030B = r2
            r4.f3031C = r2
            r4.f3032D = r2
            r4.f3033E = r2
            r4.f3034F = r2
            r4.f3036H = r2
            r4.f3039K = r2
            int r3 = androidx.preference.C0810q.preference
            r4.f3040L = r3
            androidx.preference.Preference$a r3 = new androidx.preference.Preference$a
            r3.<init>()
            r4.f3048T = r3
            r4.f3049f = r5
            int[] r3 = androidx.preference.C0813t.Preference
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r3, r7, r8)
            int r6 = androidx.preference.C0813t.Preference_icon
            int r7 = androidx.preference.C0813t.Preference_android_icon
            int r6 = p086f.p111h.p112e.p113c.C3286g.m14152n(r5, r6, r7, r1)
            r4.f3060q = r6
            int r6 = androidx.preference.C0813t.Preference_key
            int r7 = androidx.preference.C0813t.Preference_android_key
            java.lang.String r6 = p086f.p111h.p112e.p113c.C3286g.m14153o(r5, r6, r7)
            r4.f3062s = r6
            int r6 = androidx.preference.C0813t.Preference_title
            int r7 = androidx.preference.C0813t.Preference_android_title
            java.lang.CharSequence r6 = p086f.p111h.p112e.p113c.C3286g.m14154p(r5, r6, r7)
            r4.f3058o = r6
            int r6 = androidx.preference.C0813t.Preference_summary
            int r7 = androidx.preference.C0813t.Preference_android_summary
            java.lang.CharSequence r6 = p086f.p111h.p112e.p113c.C3286g.m14154p(r5, r6, r7)
            r4.f3059p = r6
            int r6 = androidx.preference.C0813t.Preference_order
            int r7 = androidx.preference.C0813t.Preference_android_order
            int r6 = p086f.p111h.p112e.p113c.C3286g.m14142d(r5, r6, r7, r0)
            r4.f3056m = r6
            int r6 = androidx.preference.C0813t.Preference_fragment
            int r7 = androidx.preference.C0813t.Preference_android_fragment
            java.lang.String r6 = p086f.p111h.p112e.p113c.C3286g.m14153o(r5, r6, r7)
            r4.f3064u = r6
            int r6 = androidx.preference.C0813t.Preference_layout
            int r7 = androidx.preference.C0813t.Preference_android_layout
            int r8 = androidx.preference.C0810q.preference
            int r6 = p086f.p111h.p112e.p113c.C3286g.m14152n(r5, r6, r7, r8)
            r4.f3040L = r6
            int r6 = androidx.preference.C0813t.Preference_widgetLayout
            int r7 = androidx.preference.C0813t.Preference_android_widgetLayout
            int r6 = p086f.p111h.p112e.p113c.C3286g.m14152n(r5, r6, r7, r1)
            r4.f3041M = r6
            int r6 = androidx.preference.C0813t.Preference_enabled
            int r7 = androidx.preference.C0813t.Preference_android_enabled
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r7, r2)
            r4.f3066w = r6
            int r6 = androidx.preference.C0813t.Preference_selectable
            int r7 = androidx.preference.C0813t.Preference_android_selectable
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r7, r2)
            r4.f3067x = r6
            int r6 = androidx.preference.C0813t.Preference_persistent
            int r7 = androidx.preference.C0813t.Preference_android_persistent
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r7, r2)
            r4.f3068y = r6
            int r6 = androidx.preference.C0813t.Preference_dependency
            int r7 = androidx.preference.C0813t.Preference_android_dependency
            java.lang.String r6 = p086f.p111h.p112e.p113c.C3286g.m14153o(r5, r6, r7)
            r4.f3069z = r6
            int r6 = androidx.preference.C0813t.Preference_allowDividerAbove
            boolean r7 = r4.f3067x
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r6, r7)
            r4.f3033E = r6
            int r6 = androidx.preference.C0813t.Preference_allowDividerBelow
            boolean r7 = r4.f3067x
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r6, r7)
            r4.f3034F = r6
            int r6 = androidx.preference.C0813t.Preference_defaultValue
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L_0x00d2
            int r6 = androidx.preference.C0813t.Preference_defaultValue
        L_0x00cb:
            java.lang.Object r6 = r4.mo3755a0(r5, r6)
            r4.f3029A = r6
            goto L_0x00dd
        L_0x00d2:
            int r6 = androidx.preference.C0813t.Preference_android_defaultValue
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L_0x00dd
            int r6 = androidx.preference.C0813t.Preference_android_defaultValue
            goto L_0x00cb
        L_0x00dd:
            int r6 = androidx.preference.C0813t.Preference_shouldDisableView
            int r7 = androidx.preference.C0813t.Preference_android_shouldDisableView
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r7, r2)
            r4.f3039K = r6
            int r6 = androidx.preference.C0813t.Preference_singleLineTitle
            boolean r6 = r5.hasValue(r6)
            r4.f3035G = r6
            if (r6 == 0) goto L_0x00fb
            int r6 = androidx.preference.C0813t.Preference_singleLineTitle
            int r7 = androidx.preference.C0813t.Preference_android_singleLineTitle
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r7, r2)
            r4.f3036H = r6
        L_0x00fb:
            int r6 = androidx.preference.C0813t.Preference_iconSpaceReserved
            int r7 = androidx.preference.C0813t.Preference_android_iconSpaceReserved
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r7, r1)
            r4.f3037I = r6
            int r6 = androidx.preference.C0813t.Preference_isPreferenceVisible
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r6, r2)
            r4.f3032D = r6
            int r6 = androidx.preference.C0813t.Preference_enableCopying
            boolean r6 = p086f.p111h.p112e.p113c.C3286g.m14140b(r5, r6, r6, r1)
            r4.f3038J = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* renamed from: G0 */
    private void m3746G0(SharedPreferences.Editor editor) {
        if (this.f3050g.mo4000r()) {
            editor.apply();
        }
    }

    /* renamed from: H0 */
    private void m3747H0() {
        Preference m;
        String str = this.f3069z;
        if (str != null && (m = mo3829m(str)) != null) {
            m.m3748I0(this);
        }
    }

    /* renamed from: I0 */
    private void m3748I0(Preference preference) {
        List<Preference> list = this.f3043O;
        if (list != null) {
            list.remove(preference);
        }
    }

    /* renamed from: l */
    private void m3749l() {
        Object obj;
        boolean z = true;
        if (mo3793C() != null) {
            mo3820g0(true, this.f3029A);
            return;
        }
        if (!mo3798F0() || !mo3797E().contains(this.f3062s)) {
            obj = this.f3029A;
            if (obj != null) {
                z = false;
            } else {
                return;
            }
        } else {
            obj = null;
        }
        mo3820g0(z, obj);
    }

    /* renamed from: n0 */
    private void m3750n0() {
        if (!TextUtils.isEmpty(this.f3069z)) {
            Preference m = mo3829m(this.f3069z);
            if (m != null) {
                m.m3751o0(this);
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f3069z + "\" not found for preference \"" + this.f3062s + "\" (title: \"" + this.f3058o + "\"");
        }
    }

    /* renamed from: o0 */
    private void m3751o0(Preference preference) {
        if (this.f3043O == null) {
            this.f3043O = new ArrayList();
        }
        this.f3043O.add(preference);
        preference.mo3813Y(this, mo3751E0());
    }

    /* renamed from: r0 */
    private void m3752r0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m3752r0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo3790A(String str) {
        if (!mo3798F0()) {
            return str;
        }
        C0783e C = mo3793C();
        return C != null ? C.mo3924c(this.f3062s, str) : this.f3050g.mo3993j().getString(this.f3062s, str);
    }

    /* renamed from: A0 */
    public void mo3767A0(CharSequence charSequence) {
        if (mo3799G() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f3059p, charSequence)) {
            this.f3059p = charSequence;
            mo3746Q();
        }
    }

    /* renamed from: B */
    public Set<String> mo3791B(Set<String> set) {
        if (!mo3798F0()) {
            return set;
        }
        C0783e C = mo3793C();
        return C != null ? C.mo3925d(this.f3062s, set) : this.f3050g.mo3993j().getStringSet(this.f3062s, set);
    }

    /* renamed from: B0 */
    public final void mo3792B0(C0765g gVar) {
        this.f3047S = gVar;
        mo3746Q();
    }

    /* renamed from: C */
    public C0783e mo3793C() {
        C0783e eVar = this.f3051h;
        if (eVar != null) {
            return eVar;
        }
        C0798j jVar = this.f3050g;
        if (jVar != null) {
            return jVar.mo3991h();
        }
        return null;
    }

    /* renamed from: C0 */
    public void mo3794C0(int i) {
        mo3796D0(this.f3049f.getString(i));
    }

    /* renamed from: D */
    public C0798j mo3795D() {
        return this.f3050g;
    }

    /* renamed from: D0 */
    public void mo3796D0(CharSequence charSequence) {
        if ((charSequence == null && this.f3058o != null) || (charSequence != null && !charSequence.equals(this.f3058o))) {
            this.f3058o = charSequence;
            mo3746Q();
        }
    }

    /* renamed from: E */
    public SharedPreferences mo3797E() {
        if (this.f3050g == null || mo3793C() != null) {
            return null;
        }
        return this.f3050g.mo3993j();
    }

    /* renamed from: E0 */
    public boolean mo3751E0() {
        return !mo3804M();
    }

    /* renamed from: F */
    public CharSequence mo3768F() {
        return mo3799G() != null ? mo3799G().mo3765a(this) : this.f3059p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public boolean mo3798F0() {
        return this.f3050g != null && mo3805N() && mo3802K();
    }

    /* renamed from: G */
    public final C0765g mo3799G() {
        return this.f3047S;
    }

    /* renamed from: H */
    public CharSequence mo3800H() {
        return this.f3058o;
    }

    /* renamed from: J */
    public final int mo3801J() {
        return this.f3041M;
    }

    /* renamed from: K */
    public boolean mo3802K() {
        return !TextUtils.isEmpty(this.f3062s);
    }

    /* renamed from: L */
    public boolean mo3803L() {
        return this.f3038J;
    }

    /* renamed from: M */
    public boolean mo3804M() {
        return this.f3066w && this.f3030B && this.f3031C;
    }

    /* renamed from: N */
    public boolean mo3805N() {
        return this.f3068y;
    }

    /* renamed from: O */
    public boolean mo3806O() {
        return this.f3067x;
    }

    /* renamed from: P */
    public final boolean mo3807P() {
        return this.f3032D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3746Q() {
        C0761c cVar = this.f3042N;
        if (cVar != null) {
            cVar.mo3860b(this);
        }
    }

    /* renamed from: R */
    public void mo3808R(boolean z) {
        List<Preference> list = this.f3043O;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo3813Y(this, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo3809S() {
        C0761c cVar = this.f3042N;
        if (cVar != null) {
            cVar.mo3859a(this);
        }
    }

    /* renamed from: T */
    public void mo3810T() {
        m3750n0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo3811U(C0798j jVar) {
        this.f3050g = jVar;
        if (!this.f3053j) {
            this.f3052i = jVar.mo3987d();
        }
        m3749l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo3812V(C0798j jVar, long j) {
        this.f3052i = j;
        this.f3053j = true;
        try {
            mo3811U(jVar);
        } finally {
            this.f3053j = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3735W(androidx.preference.C0805l r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.f3359a
            android.view.View$OnClickListener r1 = r8.f3048T
            r0.setOnClickListener(r1)
            int r1 = r8.f3057n
            r0.setId(r1)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r1 = r9.mo4005M(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r5 = r8.mo3768F()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0034
            r1.setText(r5)
            r1.setVisibility(r3)
            int r1 = r1.getCurrentTextColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0038
        L_0x0034:
            r1.setVisibility(r4)
        L_0x0037:
            r1 = r2
        L_0x0038:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.mo4005M(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0075
            java.lang.CharSequence r6 = r8.mo3800H()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0072
            r5.setText(r6)
            r5.setVisibility(r3)
            boolean r6 = r8.f3035G
            if (r6 == 0) goto L_0x005c
            boolean r6 = r8.f3036H
            r5.setSingleLine(r6)
        L_0x005c:
            boolean r6 = r8.mo3806O()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.mo3804M()
            if (r6 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            int r1 = r1.intValue()
            r5.setTextColor(r1)
            goto L_0x0075
        L_0x0072:
            r5.setVisibility(r4)
        L_0x0075:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r9.mo4005M(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5 = 4
            if (r1 == 0) goto L_0x00b1
            int r6 = r8.f3060q
            if (r6 != 0) goto L_0x0089
            android.graphics.drawable.Drawable r6 = r8.f3061r
            if (r6 == 0) goto L_0x009e
        L_0x0089:
            android.graphics.drawable.Drawable r6 = r8.f3061r
            if (r6 != 0) goto L_0x0097
            android.content.Context r6 = r8.f3049f
            int r7 = r8.f3060q
            android.graphics.drawable.Drawable r6 = p086f.p087a.p088k.p089a.C3133a.m13388d(r6, r7)
            r8.f3061r = r6
        L_0x0097:
            android.graphics.drawable.Drawable r6 = r8.f3061r
            if (r6 == 0) goto L_0x009e
            r1.setImageDrawable(r6)
        L_0x009e:
            android.graphics.drawable.Drawable r6 = r8.f3061r
            if (r6 == 0) goto L_0x00a6
            r1.setVisibility(r3)
            goto L_0x00b1
        L_0x00a6:
            boolean r6 = r8.f3037I
            if (r6 == 0) goto L_0x00ac
            r6 = 4
            goto L_0x00ae
        L_0x00ac:
            r6 = 8
        L_0x00ae:
            r1.setVisibility(r6)
        L_0x00b1:
            int r1 = androidx.preference.C0809p.icon_frame
            android.view.View r1 = r9.mo4005M(r1)
            if (r1 != 0) goto L_0x00c0
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.mo4005M(r1)
        L_0x00c0:
            if (r1 == 0) goto L_0x00d2
            android.graphics.drawable.Drawable r6 = r8.f3061r
            if (r6 == 0) goto L_0x00ca
            r1.setVisibility(r3)
            goto L_0x00d2
        L_0x00ca:
            boolean r3 = r8.f3037I
            if (r3 == 0) goto L_0x00cf
            r4 = 4
        L_0x00cf:
            r1.setVisibility(r4)
        L_0x00d2:
            boolean r1 = r8.f3039K
            if (r1 == 0) goto L_0x00db
            boolean r1 = r8.mo3804M()
            goto L_0x00dc
        L_0x00db:
            r1 = 1
        L_0x00dc:
            r8.m3752r0(r0, r1)
            boolean r1 = r8.mo3806O()
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r3 = r8.f3033E
            r9.mo4008P(r3)
            boolean r3 = r8.f3034F
            r9.mo4009Q(r3)
            boolean r9 = r8.mo3803L()
            if (r9 == 0) goto L_0x0104
            androidx.preference.Preference$f r3 = r8.f3046R
            if (r3 != 0) goto L_0x0104
            androidx.preference.Preference$f r3 = new androidx.preference.Preference$f
            r3.<init>(r8)
            r8.f3046R = r3
        L_0x0104:
            if (r9 == 0) goto L_0x0109
            androidx.preference.Preference$f r3 = r8.f3046R
            goto L_0x010a
        L_0x0109:
            r3 = r2
        L_0x010a:
            r0.setOnCreateContextMenuListener(r3)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x0117
            if (r1 != 0) goto L_0x0117
            p086f.p111h.p122m.C3403t.m14649l0(r0, r2)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo3735W(androidx.preference.l):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo3744X() {
    }

    /* renamed from: Y */
    public void mo3813Y(Preference preference, boolean z) {
        if (this.f3030B == z) {
            this.f3030B = !z;
            mo3808R(mo3751E0());
            mo3746Q();
        }
    }

    /* renamed from: Z */
    public void mo3814Z() {
        m3747H0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Object mo3755a0(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    /* renamed from: b0 */
    public void mo3815b0(C3369c cVar) {
    }

    /* renamed from: c0 */
    public void mo3816c0(Preference preference, boolean z) {
        if (this.f3031C == z) {
            this.f3031C = !z;
            mo3808R(mo3751E0());
            mo3746Q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        this.f3045Q = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3818e(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f3044P == null) {
            this.f3044P = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        this.f3045Q = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3758f0(Object obj) {
    }

    /* renamed from: g */
    public boolean mo3819g(Object obj) {
        C0762d dVar = this.f3054k;
        return dVar == null || dVar.mo391a(this, obj);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: g0 */
    public void mo3820g0(boolean z, Object obj) {
        mo3758f0(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3821h() {
    }

    /* renamed from: h0 */
    public void mo3822h0() {
        C0798j.C0801c f;
        if (mo3804M() && mo3806O()) {
            mo3744X();
            C0763e eVar = this.f3055l;
            if (eVar == null || !eVar.mo3861a(this)) {
                C0798j D = mo3795D();
                if ((D == null || (f = D.mo3989f()) == null || !f.mo3948i(this)) && this.f3063t != null) {
                    mo3831n().startActivity(this.f3063t);
                }
            }
        }
    }

    /* renamed from: i */
    public int compareTo(Preference preference) {
        int i = this.f3056m;
        int i2 = preference.f3056m;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f3058o;
        CharSequence charSequence2 = preference.f3058o;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f3058o.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo3736i0(View view) {
        mo3822h0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3824j(Bundle bundle) {
        Parcelable parcelable;
        if (mo3802K() && (parcelable = bundle.getParcelable(this.f3062s)) != null) {
            this.f3045Q = false;
            mo3756d0(parcelable);
            if (!this.f3045Q) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public boolean mo3825j0(boolean z) {
        if (!mo3798F0()) {
            return false;
        }
        if (z == mo3850y(!z)) {
            return true;
        }
        C0783e C = mo3793C();
        if (C != null) {
            C.mo3926e(this.f3062s, z);
        } else {
            SharedPreferences.Editor c = this.f3050g.mo3986c();
            c.putBoolean(this.f3062s, z);
            m3746G0(c);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3826k(Bundle bundle) {
        if (mo3802K()) {
            this.f3045Q = false;
            Parcelable e0 = mo3757e0();
            if (!this.f3045Q) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (e0 != null) {
                bundle.putParcelable(this.f3062s, e0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public boolean mo3827k0(int i) {
        if (!mo3798F0()) {
            return false;
        }
        if (i == mo3852z(i ^ -1)) {
            return true;
        }
        C0783e C = mo3793C();
        if (C != null) {
            C.mo3927f(this.f3062s, i);
        } else {
            SharedPreferences.Editor c = this.f3050g.mo3986c();
            c.putInt(this.f3062s, i);
            m3746G0(c);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public boolean mo3828l0(String str) {
        if (!mo3798F0()) {
            return false;
        }
        if (TextUtils.equals(str, mo3790A((String) null))) {
            return true;
        }
        C0783e C = mo3793C();
        if (C != null) {
            C.mo3928g(this.f3062s, str);
        } else {
            SharedPreferences.Editor c = this.f3050g.mo3986c();
            c.putString(this.f3062s, str);
            m3746G0(c);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public <T extends Preference> T mo3829m(String str) {
        C0798j jVar = this.f3050g;
        if (jVar == null) {
            return null;
        }
        return jVar.mo3985a(str);
    }

    /* renamed from: m0 */
    public boolean mo3830m0(Set<String> set) {
        if (!mo3798F0()) {
            return false;
        }
        if (set.equals(mo3791B((Set<String>) null))) {
            return true;
        }
        C0783e C = mo3793C();
        if (C != null) {
            C.mo3929h(this.f3062s, set);
        } else {
            SharedPreferences.Editor c = this.f3050g.mo3986c();
            c.putStringSet(this.f3062s, set);
            m3746G0(c);
        }
        return true;
    }

    /* renamed from: n */
    public Context mo3831n() {
        return this.f3049f;
    }

    /* renamed from: o */
    public Bundle mo3832o() {
        if (this.f3065v == null) {
            this.f3065v = new Bundle();
        }
        return this.f3065v;
    }

    /* renamed from: p0 */
    public void mo3833p0(Bundle bundle) {
        mo3824j(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public StringBuilder mo3834q() {
        StringBuilder sb = new StringBuilder();
        CharSequence H = mo3800H();
        if (!TextUtils.isEmpty(H)) {
            sb.append(H);
            sb.append(' ');
        }
        CharSequence F = mo3768F();
        if (!TextUtils.isEmpty(F)) {
            sb.append(F);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: q0 */
    public void mo3835q0(Bundle bundle) {
        mo3826k(bundle);
    }

    /* renamed from: r */
    public String mo3836r() {
        return this.f3064u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public long mo3837s() {
        return this.f3052i;
    }

    /* renamed from: s0 */
    public void mo3838s0(int i) {
        mo3840t0(C3133a.m13388d(this.f3049f, i));
        this.f3060q = i;
    }

    /* renamed from: t */
    public Intent mo3839t() {
        return this.f3063t;
    }

    /* renamed from: t0 */
    public void mo3840t0(Drawable drawable) {
        if (this.f3061r != drawable) {
            this.f3061r = drawable;
            this.f3060q = 0;
            mo3746Q();
        }
    }

    public String toString() {
        return mo3834q().toString();
    }

    /* renamed from: u */
    public String mo3842u() {
        return this.f3062s;
    }

    /* renamed from: u0 */
    public void mo3843u0(Intent intent) {
        this.f3063t = intent;
    }

    /* renamed from: v */
    public final int mo3844v() {
        return this.f3040L;
    }

    /* renamed from: v0 */
    public void mo3845v0(int i) {
        this.f3040L = i;
    }

    /* renamed from: w */
    public int mo3846w() {
        return this.f3056m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final void mo3847w0(C0761c cVar) {
        this.f3042N = cVar;
    }

    /* renamed from: x */
    public PreferenceGroup mo3848x() {
        return this.f3044P;
    }

    /* renamed from: x0 */
    public void mo3849x0(C0762d dVar) {
        this.f3054k = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo3850y(boolean z) {
        if (!mo3798F0()) {
            return z;
        }
        C0783e C = mo3793C();
        return C != null ? C.mo3922a(this.f3062s, z) : this.f3050g.mo3993j().getBoolean(this.f3062s, z);
    }

    /* renamed from: y0 */
    public void mo3851y0(C0763e eVar) {
        this.f3055l = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo3852z(int i) {
        if (!mo3798F0()) {
            return i;
        }
        C0783e C = mo3793C();
        return C != null ? C.mo3923b(this.f3062s, i) : this.f3050g.mo3993j().getInt(this.f3062s, i);
    }

    /* renamed from: z0 */
    public void mo3853z0(int i) {
        if (i != this.f3056m) {
            this.f3056m = i;
            mo3809S();
        }
    }
}
