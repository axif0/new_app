package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0418c0;
import androidx.appcompat.widget.C0441i;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0608i;
import com.google.android.material.internal.C2171a;
import com.google.android.material.internal.C2174c;
import com.google.android.material.internal.CheckableImageButton;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p120k.C3326a;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3390g;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p126j.p127a.C3430a;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4995c;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5004j;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.p254b0.C4972g;
import p148g.p189d.p190a.p252d.p254b0.C4979k;
import p148g.p189d.p190a.p252d.p256m.C5007a;
import p148g.p189d.p190a.p252d.p262r.C5035a;

public class TextInputLayout extends LinearLayout {

    /* renamed from: N0 */
    private static final int f7498N0 = C5005k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private final TextView f7499A;

    /* renamed from: A0 */
    private int f7500A0;

    /* renamed from: B */
    private CharSequence f7501B;

    /* renamed from: B0 */
    private ColorStateList f7502B0;

    /* renamed from: C */
    private final TextView f7503C;

    /* renamed from: C0 */
    private int f7504C0;

    /* renamed from: D */
    private boolean f7505D;

    /* renamed from: D0 */
    private int f7506D0;

    /* renamed from: E */
    private CharSequence f7507E;

    /* renamed from: E0 */
    private int f7508E0;

    /* renamed from: F */
    private boolean f7509F;

    /* renamed from: F0 */
    private int f7510F0;

    /* renamed from: G */
    private C4972g f7511G;

    /* renamed from: G0 */
    private int f7512G0;

    /* renamed from: H */
    private C4972g f7513H;

    /* renamed from: H0 */
    private boolean f7514H0;

    /* renamed from: I */
    private C4979k f7515I;

    /* renamed from: I0 */
    final C2171a f7516I0;

    /* renamed from: J */
    private final int f7517J;

    /* renamed from: J0 */
    private boolean f7518J0;

    /* renamed from: K */
    private int f7519K;

    /* renamed from: K0 */
    private ValueAnimator f7520K0;

    /* renamed from: L */
    private final int f7521L;

    /* renamed from: L0 */
    private boolean f7522L0;

    /* renamed from: M */
    private int f7523M;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public boolean f7524M0;

    /* renamed from: N */
    private int f7525N;

    /* renamed from: O */
    private int f7526O;

    /* renamed from: P */
    private int f7527P;

    /* renamed from: Q */
    private int f7528Q;

    /* renamed from: R */
    private final Rect f7529R;

    /* renamed from: S */
    private final Rect f7530S;

    /* renamed from: T */
    private final RectF f7531T;

    /* renamed from: U */
    private Typeface f7532U;

    /* renamed from: V */
    private final CheckableImageButton f7533V;

    /* renamed from: W */
    private ColorStateList f7534W;

    /* renamed from: a0 */
    private boolean f7535a0;

    /* renamed from: b0 */
    private PorterDuff.Mode f7536b0;

    /* renamed from: c0 */
    private boolean f7537c0;

    /* renamed from: d0 */
    private Drawable f7538d0;

    /* renamed from: e0 */
    private int f7539e0;

    /* renamed from: f */
    private final FrameLayout f7540f;

    /* renamed from: f0 */
    private View.OnLongClickListener f7541f0;

    /* renamed from: g */
    private final LinearLayout f7542g;

    /* renamed from: g0 */
    private final LinkedHashSet<C2267f> f7543g0;

    /* renamed from: h */
    private final LinearLayout f7544h;

    /* renamed from: h0 */
    private int f7545h0;

    /* renamed from: i */
    private final FrameLayout f7546i;

    /* renamed from: i0 */
    private final SparseArray<C2295e> f7547i0;

    /* renamed from: j */
    EditText f7548j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final CheckableImageButton f7549j0;

    /* renamed from: k */
    private CharSequence f7550k;

    /* renamed from: k0 */
    private final LinkedHashSet<C2268g> f7551k0;

    /* renamed from: l */
    private final C2296f f7552l;

    /* renamed from: l0 */
    private ColorStateList f7553l0;

    /* renamed from: m */
    boolean f7554m;

    /* renamed from: m0 */
    private boolean f7555m0;

    /* renamed from: n */
    private int f7556n;

    /* renamed from: n0 */
    private PorterDuff.Mode f7557n0;

    /* renamed from: o */
    private boolean f7558o;

    /* renamed from: o0 */
    private boolean f7559o0;

    /* renamed from: p */
    private TextView f7560p;

    /* renamed from: p0 */
    private Drawable f7561p0;

    /* renamed from: q */
    private int f7562q;

    /* renamed from: q0 */
    private int f7563q0;

    /* renamed from: r */
    private int f7564r;

    /* renamed from: r0 */
    private Drawable f7565r0;

    /* renamed from: s */
    private CharSequence f7566s;

    /* renamed from: s0 */
    private View.OnLongClickListener f7567s0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f7568t;

    /* renamed from: t0 */
    private View.OnLongClickListener f7569t0;

    /* renamed from: u */
    private TextView f7570u;

    /* renamed from: u0 */
    private final CheckableImageButton f7571u0;

    /* renamed from: v */
    private ColorStateList f7572v;

    /* renamed from: v0 */
    private ColorStateList f7573v0;

    /* renamed from: w */
    private int f7574w;

    /* renamed from: w0 */
    private ColorStateList f7575w0;

    /* renamed from: x */
    private ColorStateList f7576x;

    /* renamed from: x0 */
    private ColorStateList f7577x0;

    /* renamed from: y */
    private ColorStateList f7578y;

    /* renamed from: y0 */
    private int f7579y0;

    /* renamed from: z */
    private CharSequence f7580z;

    /* renamed from: z0 */
    private int f7581z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C2262a implements TextWatcher {
        C2262a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo8913o0(!textInputLayout.f7524M0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f7554m) {
                textInputLayout2.mo8863g0(editable.length());
            }
            if (TextInputLayout.this.f7568t) {
                TextInputLayout.this.m10590s0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C2263b implements Runnable {
        C2263b() {
        }

        public void run() {
            TextInputLayout.this.f7549j0.performClick();
            TextInputLayout.this.f7549j0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C2264c implements Runnable {
        C2264c() {
        }

        public void run() {
            TextInputLayout.this.f7548j.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C2265d implements ValueAnimator.AnimatorUpdateListener {
        C2265d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f7516I0.mo8505V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C2266e extends C3350a {

        /* renamed from: d */
        private final TextInputLayout f7586d;

        public C2266e(TextInputLayout textInputLayout) {
            this.f7586d = textInputLayout;
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            EditText editText = this.f7586d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f7586d.getHint();
            CharSequence helperText = this.f7586d.getHelperText();
            CharSequence error = this.f7586d.getError();
            int counterMaxLength = this.f7586d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f7586d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : BuildConfig.FLAVOR;
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : BuildConfig.FLAVOR);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = BuildConfig.FLAVOR;
            }
            sb3.append(helperText);
            String sb4 = sb3.toString();
            if (z) {
                cVar.mo11595A0(text);
            } else if (!TextUtils.isEmpty(sb4)) {
                cVar.mo11595A0(sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.mo11640m0(sb4);
                } else {
                    if (z) {
                        sb4 = text + ", " + sb4;
                    }
                    cVar.mo11595A0(sb4);
                }
                cVar.mo11660x0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo11644o0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo11634i0(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C2267f {
        /* renamed from: a */
        void mo9004a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C2268g {
        /* renamed from: a */
        void mo9005a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    static class C2269h extends C3430a {
        public static final Parcelable.Creator<C2269h> CREATOR = new C2270a();

        /* renamed from: h */
        CharSequence f7587h;

        /* renamed from: i */
        boolean f7588i;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        static class C2270a implements Parcelable.ClassLoaderCreator<C2269h> {
            C2270a() {
            }

            /* renamed from: a */
            public C2269h createFromParcel(Parcel parcel) {
                return new C2269h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C2269h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2269h(parcel, classLoader);
            }

            /* renamed from: c */
            public C2269h[] newArray(int i) {
                return new C2269h[i];
            }
        }

        C2269h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7587h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7588i = parcel.readInt() != 1 ? false : true;
        }

        C2269h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f7587h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f7587h, parcel, i);
            parcel.writeInt(this.f7588i ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r1 = f7498N0
            r2 = r21
            android.content.Context r1 = com.google.android.material.theme.p040a.C2306a.m10749c(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.f7552l = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7529R = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7530S = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f7531T = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7543g0 = r1
            r9 = 0
            r0.f7545h0 = r9
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.f7547i0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7551k0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f7516I0 = r1
            android.content.Context r10 = r20.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f7540f = r1
            r1.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = r0.f7540f
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.f7542g = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.f7542g
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r12 = -2
            r13 = -1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.f7540f
            android.widget.LinearLayout r2 = r0.f7542g
            r1.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.f7544h = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.f7544h
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.f7540f
            android.widget.LinearLayout r2 = r0.f7544h
            r1.addView(r2)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f7546i = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r13)
            r1.setLayoutParams(r2)
            com.google.android.material.internal.a r1 = r0.f7516I0
            android.animation.TimeInterpolator r2 = p148g.p189d.p190a.p252d.p256m.C5007a.f14947a
            r1.mo8509a0(r2)
            com.google.android.material.internal.a r1 = r0.f7516I0
            android.animation.TimeInterpolator r2 = p148g.p189d.p190a.p252d.p256m.C5007a.f14947a
            r1.mo8506X(r2)
            com.google.android.material.internal.a r1 = r0.f7516I0
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo8498L(r2)
            int[] r3 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout
            int r5 = f7498N0
            r1 = 5
            int[] r6 = new int[r1]
            int r1 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterTextAppearance
            r6[r9] = r1
            int r1 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterOverflowTextAppearance
            r6[r11] = r1
            int r1 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorTextAppearance
            r14 = 2
            r6[r14] = r1
            int r1 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_helperTextTextAppearance
            r15 = 3
            r6[r15] = r1
            int r1 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintTextAppearance
            r2 = 4
            r6[r2] = r1
            r1 = r10
            r2 = r22
            r4 = r23
            androidx.appcompat.widget.u0 r1 = com.google.android.material.internal.C2205o.m10306i(r1, r2, r3, r4, r5, r6)
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintEnabled
            boolean r2 = r1.mo2343a(r2, r11)
            r0.f7505D = r2
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.mo2358p(r2)
            r0.setHint(r2)
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.mo2343a(r2, r11)
            r0.f7518J0 = r2
            int r2 = f7498N0
            g.d.a.d.b0.k$b r2 = p148g.p189d.p190a.p252d.p254b0.C4979k.m21076e(r10, r7, r8, r2)
            g.d.a.d.b0.k r2 = r2.mo14980m()
            r0.f7515I = r2
            android.content.res.Resources r2 = r10.getResources()
            int r3 = p148g.p189d.p190a.p252d.C4998d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f7517J = r2
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.mo2347e(r2, r9)
            r0.f7521L = r2
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r10.getResources()
            int r4 = p148g.p189d.p190a.p252d.C4998d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo2348f(r2, r3)
            r0.f7525N = r2
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r10.getResources()
            int r4 = p148g.p189d.p190a.p252d.C4998d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo2348f(r2, r3)
            r0.f7526O = r2
            int r2 = r0.f7525N
            r0.f7523M = r2
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo2346d(r2, r3)
            int r4 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.mo2346d(r4, r3)
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.mo2346d(r5, r3)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.mo2346d(r6, r3)
            g.d.a.d.b0.k r6 = r0.f7515I
            g.d.a.d.b0.k$b r6 = r6.mo14972v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x017c
            r6.mo14992z(r2)
        L_0x017c:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0183
            r6.mo14978D(r4)
        L_0x0183:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x018a
            r6.mo14988v(r5)
        L_0x018a:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0191
            r6.mo14984r(r3)
        L_0x0191:
            g.d.a.d.b0.k r2 = r6.mo14980m()
            r0.f7515I = r2
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r2)
            if (r2 == 0) goto L_0x01f1
            int r3 = r2.getDefaultColor()
            r0.f7504C0 = r3
            r0.f7528Q = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01cf
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.f7506D0 = r3
            int[] r3 = new int[r14]
            r3 = {16842908, 16842910} // fill-array
            int r3 = r2.getColorForState(r3, r13)
            r0.f7508E0 = r3
            int[] r3 = new int[r14]
            r3 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r3, r13)
            goto L_0x01ee
        L_0x01cf:
            int r2 = r0.f7504C0
            r0.f7508E0 = r2
            int r2 = p148g.p189d.p190a.p252d.C4995c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p086f.p087a.p088k.p089a.C3133a.m13387c(r10, r2)
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.f7506D0 = r3
            int[] r3 = new int[r11]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r3[r9] = r4
            int r2 = r2.getColorForState(r3, r13)
        L_0x01ee:
            r0.f7510F0 = r2
            goto L_0x01fb
        L_0x01f1:
            r0.f7528Q = r9
            r0.f7504C0 = r9
            r0.f7506D0 = r9
            r0.f7508E0 = r9
            r0.f7510F0 = r9
        L_0x01fb:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_android_textColorHint
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x020d
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.f7577x0 = r2
            r0.f7575w0 = r2
        L_0x020d:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r2)
            int r3 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxStrokeColor
            int r3 = r1.mo2344b(r3, r9)
            r0.f7500A0 = r3
            int r3 = p148g.p189d.p190a.p252d.C4995c.mtrl_textinput_default_box_stroke_color
            int r3 = p086f.p111h.p112e.C3267a.m14074d(r10, r3)
            r0.f7579y0 = r3
            int r3 = p148g.p189d.p190a.p252d.C4995c.mtrl_textinput_disabled_color
            int r3 = p086f.p111h.p112e.C3267a.m14074d(r10, r3)
            r0.f7512G0 = r3
            int r3 = p148g.p189d.p190a.p252d.C4995c.mtrl_textinput_hovered_box_stroke_color
            int r3 = p086f.p111h.p112e.C3267a.m14074d(r10, r3)
            r0.f7581z0 = r3
            if (r2 == 0) goto L_0x0238
            r0.setBoxStrokeColorStateList(r2)
        L_0x0238:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxStrokeErrorColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x0249
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r2 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0249:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintTextAppearance
            int r2 = r1.mo2356n(r2, r13)
            if (r2 == r13) goto L_0x025a
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintTextAppearance
            int r2 = r1.mo2356n(r2, r9)
            r0.setHintTextAppearance(r2)
        L_0x025a:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorTextAppearance
            int r2 = r1.mo2356n(r2, r9)
            int r3 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorContentDescription
            java.lang.CharSequence r3 = r1.mo2358p(r3)
            int r4 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorEnabled
            boolean r4 = r1.mo2343a(r4, r9)
            android.content.Context r5 = r20.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r6 = p148g.p189d.p190a.p252d.C5002h.design_text_input_end_icon
            android.widget.LinearLayout r7 = r0.f7544h
            android.view.View r5 = r5.inflate(r6, r7, r9)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.f7571u0 = r5
            r6 = 8
            r5.setVisibility(r6)
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorIconDrawable
            boolean r5 = r1.mo2361s(r5)
            if (r5 == 0) goto L_0x0296
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r5 = r1.mo2349g(r5)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r5)
        L_0x0296:
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorIconTint
            boolean r5 = r1.mo2361s(r5)
            if (r5 == 0) goto L_0x02a7
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r5 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r5)
            r0.setErrorIconTintList(r5)
        L_0x02a7:
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorIconTintMode
            boolean r5 = r1.mo2361s(r5)
            r7 = 0
            if (r5 == 0) goto L_0x02bd
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorIconTintMode
            int r5 = r1.mo2353k(r5, r13)
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.C2206p.m10311e(r5, r7)
            r0.setErrorIconTintMode(r5)
        L_0x02bd:
            com.google.android.material.internal.CheckableImageButton r5 = r0.f7571u0
            android.content.res.Resources r8 = r20.getResources()
            int r12 = p148g.p189d.p190a.p252d.C5004j.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r12)
            r5.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r5 = r0.f7571u0
            p086f.p111h.p122m.C3403t.m14663s0(r5, r14)
            com.google.android.material.internal.CheckableImageButton r5 = r0.f7571u0
            r5.setClickable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.f7571u0
            r5.setPressable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.f7571u0
            r5.setFocusable(r9)
            int r5 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_helperTextTextAppearance
            int r5 = r1.mo2356n(r5, r9)
            int r8 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_helperTextEnabled
            boolean r8 = r1.mo2343a(r8, r9)
            int r12 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_helperText
            java.lang.CharSequence r12 = r1.mo2358p(r12)
            int r15 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_placeholderTextAppearance
            int r15 = r1.mo2356n(r15, r9)
            int r14 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_placeholderText
            java.lang.CharSequence r14 = r1.mo2358p(r14)
            int r11 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_prefixTextAppearance
            int r11 = r1.mo2356n(r11, r9)
            int r7 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_prefixText
            java.lang.CharSequence r7 = r1.mo2358p(r7)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_suffixTextAppearance
            int r6 = r1.mo2356n(r6, r9)
            int r13 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_suffixText
            java.lang.CharSequence r13 = r1.mo2358p(r13)
            r16 = r6
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterEnabled
            boolean r6 = r1.mo2343a(r6, r9)
            int r9 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterMaxLength
            r17 = r6
            r6 = -1
            int r9 = r1.mo2353k(r9, r6)
            r0.setCounterMaxLength(r9)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterTextAppearance
            r9 = 0
            int r6 = r1.mo2356n(r6, r9)
            r0.f7564r = r6
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterOverflowTextAppearance
            int r6 = r1.mo2356n(r6, r9)
            r0.f7562q = r6
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r18 = r13
            int r13 = p148g.p189d.p190a.p252d.C5002h.design_text_input_start_icon
            r19 = r11
            android.widget.LinearLayout r11 = r0.f7542g
            android.view.View r6 = r6.inflate(r13, r11, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f7533V = r6
            r9 = 8
            r6.setVisibility(r9)
            r6 = 0
            r0.setStartIconOnClickListener(r6)
            r0.setStartIconOnLongClickListener(r6)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconDrawable
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x038b
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r6 = r1.mo2349g(r6)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconContentDescription
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x0381
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r6 = r1.mo2358p(r6)
            r0.setStartIconContentDescription((java.lang.CharSequence) r6)
        L_0x0381:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconCheckable
            r9 = 1
            boolean r6 = r1.mo2343a(r6, r9)
            r0.setStartIconCheckable(r6)
        L_0x038b:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconTint
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x039c
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconTint
            android.content.res.ColorStateList r6 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r6)
            r0.setStartIconTintList(r6)
        L_0x039c:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconTintMode
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x03b3
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_startIconTintMode
            r9 = -1
            int r6 = r1.mo2353k(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C2206p.m10311e(r6, r9)
            r0.setStartIconTintMode(r6)
        L_0x03b3:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_boxBackgroundMode
            r9 = 0
            int r6 = r1.mo2353k(r6, r9)
            r0.setBoxBackgroundMode(r6)
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r11 = p148g.p189d.p190a.p252d.C5002h.design_text_input_end_icon
            android.widget.FrameLayout r13 = r0.f7546i
            android.view.View r6 = r6.inflate(r11, r13, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f7549j0 = r6
            android.widget.FrameLayout r9 = r0.f7546i
            r9.addView(r6)
            com.google.android.material.internal.CheckableImageButton r6 = r0.f7549j0
            r9 = 8
            r6.setVisibility(r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.f7547i0
            com.google.android.material.textfield.b r9 = new com.google.android.material.textfield.b
            r9.<init>(r0)
            r11 = -1
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.f7547i0
            com.google.android.material.textfield.h r9 = new com.google.android.material.textfield.h
            r9.<init>(r0)
            r11 = 0
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.f7547i0
            com.google.android.material.textfield.i r9 = new com.google.android.material.textfield.i
            r9.<init>(r0)
            r11 = 1
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.f7547i0
            com.google.android.material.textfield.a r9 = new com.google.android.material.textfield.a
            r9.<init>(r0)
            r11 = 2
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.f7547i0
            com.google.android.material.textfield.d r9 = new com.google.android.material.textfield.d
            r9.<init>(r0)
            r11 = 3
            r6.append(r11, r9)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconMode
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x0453
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconMode
            r9 = 0
            int r6 = r1.mo2353k(r6, r9)
            r0.setEndIconMode(r6)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconDrawable
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x0437
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r6 = r1.mo2349g(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
        L_0x0437:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconContentDescription
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x0448
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r6 = r1.mo2358p(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
        L_0x0448:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconCheckable
            r9 = 1
            boolean r6 = r1.mo2343a(r6, r9)
            r0.setEndIconCheckable(r6)
            goto L_0x049f
        L_0x0453:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x049f
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleEnabled
            r9 = 0
            boolean r6 = r1.mo2343a(r6, r9)
            r0.setEndIconMode(r6)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r6 = r1.mo2349g(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r6 = r1.mo2358p(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleTint
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x0488
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r6 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r6)
            r0.setEndIconTintList(r6)
        L_0x0488:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleTintMode
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x049f
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleTintMode
            r9 = -1
            int r6 = r1.mo2353k(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C2206p.m10311e(r6, r9)
            r0.setEndIconTintMode(r6)
        L_0x049f:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.mo2361s(r6)
            if (r6 != 0) goto L_0x04cf
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconTint
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x04b8
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconTint
            android.content.res.ColorStateList r6 = p148g.p189d.p190a.p252d.p269y.C5046c.m21336b(r10, r1, r6)
            r0.setEndIconTintList(r6)
        L_0x04b8:
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconTintMode
            boolean r6 = r1.mo2361s(r6)
            if (r6 == 0) goto L_0x04cf
            int r6 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_endIconTintMode
            r9 = -1
            int r6 = r1.mo2353k(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C2206p.m10311e(r6, r9)
            r0.setEndIconTintMode(r6)
        L_0x04cf:
            androidx.appcompat.widget.AppCompatTextView r6 = new androidx.appcompat.widget.AppCompatTextView
            r6.<init>(r10)
            r0.f7499A = r6
            int r9 = p148g.p189d.p190a.p252d.C5000f.textinput_prefix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.f7499A
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r9.<init>(r11, r11)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.f7499A
            r9 = 1
            p086f.p111h.p122m.C3403t.m14647k0(r6, r9)
            android.widget.LinearLayout r6 = r0.f7542g
            com.google.android.material.internal.CheckableImageButton r9 = r0.f7533V
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f7542g
            android.widget.TextView r9 = r0.f7499A
            r6.addView(r9)
            androidx.appcompat.widget.AppCompatTextView r6 = new androidx.appcompat.widget.AppCompatTextView
            r6.<init>(r10)
            r0.f7503C = r6
            int r9 = p148g.p189d.p190a.p252d.C5000f.textinput_suffix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.f7503C
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r10 = 80
            r11 = -2
            r9.<init>(r11, r11, r10)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.f7503C
            r9 = 1
            p086f.p111h.p122m.C3403t.m14647k0(r6, r9)
            android.widget.LinearLayout r6 = r0.f7544h
            android.widget.TextView r9 = r0.f7503C
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f7544h
            com.google.android.material.internal.CheckableImageButton r9 = r0.f7571u0
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f7544h
            android.widget.FrameLayout r9 = r0.f7546i
            r6.addView(r9)
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r12)
            r0.setHelperTextTextAppearance(r5)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r2)
            r0.setErrorContentDescription(r3)
            int r2 = r0.f7564r
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f7562q
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r14)
            r0.setPlaceholderTextAppearance(r15)
            r0.setPrefixText(r7)
            r2 = r19
            r0.setPrefixTextAppearance(r2)
            r2 = r18
            r0.setSuffixText(r2)
            r2 = r16
            r0.setSuffixTextAppearance(r2)
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x0573
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setErrorTextColor(r2)
        L_0x0573:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_helperTextTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x0584
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setHelperTextColor(r2)
        L_0x0584:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x0595
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setHintTextColor(r2)
        L_0x0595:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x05a6
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setCounterTextColor(r2)
        L_0x05a6:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x05b7
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05b7:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_placeholderTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x05c8
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05c8:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_prefixTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x05d9
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05d9:
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_suffixTextColor
            boolean r2 = r1.mo2361s(r2)
            if (r2 == 0) goto L_0x05ea
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r2 = r1.mo2345c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05ea:
            r2 = r17
            r0.setCounterEnabled(r2)
            int r2 = p148g.p189d.p190a.p252d.C5006l.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.mo2343a(r2, r3)
            r0.setEnabled(r2)
            r1.mo2362w()
            r1 = 2
            p086f.p111h.p122m.C3403t.m14663s0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A */
    private void m10539A() {
        Iterator it = this.f7543g0.iterator();
        while (it.hasNext()) {
            ((C2267f) it.next()).mo9004a(this);
        }
    }

    /* renamed from: B */
    private void m10540B(int i) {
        Iterator it = this.f7551k0.iterator();
        while (it.hasNext()) {
            ((C2268g) it.next()).mo9005a(this, i);
        }
    }

    /* renamed from: C */
    private void m10541C(Canvas canvas) {
        C4972g gVar = this.f7513H;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f7523M;
            this.f7513H.draw(canvas);
        }
    }

    /* renamed from: D */
    private void m10542D(Canvas canvas) {
        if (this.f7505D) {
            this.f7516I0.mo8512j(canvas);
        }
    }

    /* renamed from: E */
    private void m10543E(boolean z) {
        ValueAnimator valueAnimator = this.f7520K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7520K0.cancel();
        }
        if (!z || !this.f7518J0) {
            this.f7516I0.mo8505V(0.0f);
        } else {
            mo8911h(0.0f);
        }
        if (m10602z() && ((C2282c) this.f7511G).mo9024l0()) {
            m10599x();
        }
        this.f7514H0 = true;
        m10547I();
        m10594u0();
        m10600x0();
    }

    /* renamed from: F */
    private int m10544F(int i, boolean z) {
        int compoundPaddingLeft = i + this.f7548j.getCompoundPaddingLeft();
        return (this.f7580z == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f7499A.getMeasuredWidth()) + this.f7499A.getPaddingLeft();
    }

    /* renamed from: G */
    private int m10545G(int i, boolean z) {
        int compoundPaddingRight = i - this.f7548j.getCompoundPaddingRight();
        return (this.f7580z == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f7499A.getMeasuredWidth() - this.f7499A.getPaddingRight());
    }

    /* renamed from: H */
    private boolean m10546H() {
        return this.f7545h0 != 0;
    }

    /* renamed from: I */
    private void m10547I() {
        TextView textView = this.f7570u;
        if (textView != null && this.f7568t) {
            textView.setText((CharSequence) null);
            this.f7570u.setVisibility(4);
        }
    }

    /* renamed from: K */
    private boolean m10548K() {
        return this.f7571u0.getVisibility() == 0;
    }

    /* renamed from: O */
    private boolean m10549O() {
        return this.f7519K == 1 && (Build.VERSION.SDK_INT < 16 || this.f7548j.getMinLines() <= 1);
    }

    /* renamed from: Q */
    private void m10550Q() {
        m10582o();
        m10554U();
        mo8997y0();
        if (this.f7519K != 0) {
            m10581n0();
        }
    }

    /* renamed from: R */
    private void m10551R() {
        if (m10602z()) {
            RectF rectF = this.f7531T;
            this.f7516I0.mo8513m(rectF, this.f7548j.getWidth(), this.f7548j.getGravity());
            m10575k(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((C2282c) this.f7511G).mo9027r0(rectF);
        }
    }

    /* renamed from: S */
    private static void m10552S(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m10552S((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: T */
    private void m10553T() {
        TextView textView = this.f7570u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: U */
    private void m10554U() {
        if (m10562b0()) {
            C3403t.m14649l0(this.f7548j, this.f7511G);
        }
    }

    /* renamed from: V */
    private static void m10555V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean J = C3403t.m14609J(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (J || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(J);
        checkableImageButton.setPressable(J);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C3403t.m14663s0(checkableImageButton, i);
    }

    /* renamed from: W */
    private static void m10556W(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m10555V(checkableImageButton, onLongClickListener);
    }

    /* renamed from: X */
    private static void m10557X(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m10555V(checkableImageButton, onLongClickListener);
    }

    /* renamed from: Z */
    private boolean m10558Z() {
        return (this.f7571u0.getVisibility() == 0 || ((m10546H() && mo8850J()) || this.f7501B != null)) && this.f7544h.getMeasuredWidth() > 0;
    }

    /* renamed from: a0 */
    private boolean m10560a0() {
        return !(getStartIconDrawable() == null && this.f7580z == null) && this.f7542g.getMeasuredWidth() > 0;
    }

    /* renamed from: b0 */
    private boolean m10562b0() {
        EditText editText = this.f7548j;
        return (editText == null || this.f7511G == null || editText.getBackground() != null || this.f7519K == 0) ? false : true;
    }

    /* renamed from: c0 */
    private void m10564c0() {
        TextView textView = this.f7570u;
        if (textView != null && this.f7568t) {
            textView.setText(this.f7566s);
            this.f7570u.setVisibility(0);
            this.f7570u.bringToFront();
        }
    }

    /* renamed from: d0 */
    private void m10566d0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m10576l();
            return;
        }
        Drawable mutate = C0588a.m2775r(getEndIconDrawable()).mutate();
        C0588a.m2771n(mutate, this.f7552l.mo9056o());
        this.f7549j0.setImageDrawable(mutate);
    }

    /* renamed from: e0 */
    private void m10567e0(Rect rect) {
        C4972g gVar = this.f7513H;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f7526O, rect.right, i);
        }
    }

    /* renamed from: f0 */
    private void m10568f0() {
        if (this.f7560p != null) {
            EditText editText = this.f7548j;
            mo8863g0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: g */
    private void m10569g() {
        TextView textView = this.f7570u;
        if (textView != null) {
            this.f7540f.addView(textView);
            this.f7570u.setVisibility(0);
        }
    }

    private C2295e getEndIconDelegate() {
        C2295e eVar = this.f7547i0.get(this.f7545h0);
        return eVar != null ? eVar : this.f7547i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f7571u0.getVisibility() == 0) {
            return this.f7571u0;
        }
        if (!m10546H() || !mo8850J()) {
            return null;
        }
        return this.f7549j0;
    }

    /* renamed from: h0 */
    private static void m10570h0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C5004j.character_counter_overflowed_content_description : C5004j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: i */
    private void m10571i() {
        C4972g gVar = this.f7511G;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f7515I);
            if (m10595v()) {
                this.f7511G.mo14933e0((float) this.f7523M, this.f7527P);
            }
            int p = m10583p();
            this.f7528Q = p;
            this.f7511G.mo14926X(ColorStateList.valueOf(p));
            if (this.f7545h0 == 3) {
                this.f7548j.getBackground().invalidateSelf();
            }
            m10573j();
            invalidate();
        }
    }

    /* renamed from: i0 */
    private void m10572i0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f7560p;
        if (textView != null) {
            mo8855Y(textView, this.f7558o ? this.f7562q : this.f7564r);
            if (!this.f7558o && (colorStateList2 = this.f7576x) != null) {
                this.f7560p.setTextColor(colorStateList2);
            }
            if (this.f7558o && (colorStateList = this.f7578y) != null) {
                this.f7560p.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: j */
    private void m10573j() {
        if (this.f7513H != null) {
            if (m10597w()) {
                this.f7513H.mo14926X(ColorStateList.valueOf(this.f7527P));
            }
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10574j0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f7548j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m10560a0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f7542g
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7548j
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f7538d0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f7539e0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f7538d0 = r6
            r10.f7539e0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f7548j
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0608i.m2887a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f7538d0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f7548j
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0608i.m2898l(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f7538d0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f7548j
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0608i.m2887a(r0)
            android.widget.EditText r6 = r10.f7548j
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0608i.m2898l(r6, r2, r7, r8, r0)
            r10.f7538d0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.m10558Z()
            if (r6 == 0) goto L_0x00d5
            android.widget.TextView r2 = r10.f7503C
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7548j
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p086f.p111h.p122m.C3390g.m14555b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f7548j
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0608i.m2887a(r6)
            android.graphics.drawable.Drawable r7 = r10.f7561p0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f7563q0
            if (r8 == r2) goto L_0x00ad
            r10.f7563q0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f7548j
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f7561p0
            r3 = r6[r3]
            androidx.core.widget.C0608i.m2898l(r0, r1, r2, r4, r3)
            goto L_0x00f6
        L_0x00ad:
            android.graphics.drawable.Drawable r7 = r10.f7561p0
            if (r7 != 0) goto L_0x00bd
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f7561p0 = r7
            r10.f7563q0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bd:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f7561p0
            if (r2 == r7) goto L_0x00d3
            r0 = r6[r4]
            r10.f7565r0 = r0
            android.widget.EditText r0 = r10.f7548j
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.C0608i.m2898l(r0, r1, r2, r7, r3)
            goto L_0x00f6
        L_0x00d3:
            r5 = r0
            goto L_0x00f6
        L_0x00d5:
            android.graphics.drawable.Drawable r6 = r10.f7561p0
            if (r6 == 0) goto L_0x00f7
            android.widget.EditText r6 = r10.f7548j
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0608i.m2887a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f7561p0
            if (r4 != r7) goto L_0x00f3
            android.widget.EditText r0 = r10.f7548j
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f7565r0
            r3 = r6[r3]
            androidx.core.widget.C0608i.m2898l(r0, r1, r4, r7, r3)
            goto L_0x00f4
        L_0x00f3:
            r5 = r0
        L_0x00f4:
            r10.f7561p0 = r2
        L_0x00f6:
            r0 = r5
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m10574j0():boolean");
    }

    /* renamed from: k */
    private void m10575k(RectF rectF) {
        float f = rectF.left;
        int i = this.f7517J;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: l */
    private void m10576l() {
        m10578m(this.f7549j0, this.f7555m0, this.f7553l0, this.f7559o0, this.f7557n0);
    }

    /* renamed from: l0 */
    private boolean m10577l0() {
        int max;
        if (this.f7548j == null || this.f7548j.getMeasuredHeight() >= (max = Math.max(this.f7544h.getMeasuredHeight(), this.f7542g.getMeasuredHeight()))) {
            return false;
        }
        this.f7548j.setMinimumHeight(max);
        return true;
    }

    /* renamed from: m */
    private void m10578m(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0588a.m2775r(drawable).mutate();
            if (z) {
                C0588a.m2772o(drawable, colorStateList);
            }
            if (z2) {
                C0588a.m2773p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: m0 */
    private void m10579m0(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C0588a.m2775r(drawable).mutate();
            C0588a.m2772o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: n */
    private void m10580n() {
        m10578m(this.f7533V, this.f7535a0, this.f7534W, this.f7537c0, this.f7536b0);
    }

    /* renamed from: n0 */
    private void m10581n0() {
        if (this.f7519K != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7540f.getLayoutParams();
            int u = m10593u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.f7540f.requestLayout();
            }
        }
    }

    /* renamed from: o */
    private void m10582o() {
        int i = this.f7519K;
        if (i == 0) {
            this.f7511G = null;
        } else if (i == 1) {
            this.f7511G = new C4972g(this.f7515I);
            this.f7513H = new C4972g();
            return;
        } else if (i == 2) {
            this.f7511G = (!this.f7505D || (this.f7511G instanceof C2282c)) ? new C4972g(this.f7515I) : new C2282c(this.f7515I);
        } else {
            throw new IllegalArgumentException(this.f7519K + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f7513H = null;
    }

    /* renamed from: p */
    private int m10583p() {
        return this.f7519K == 1 ? C5035a.m21307e(C5035a.m21306d(this, C4965b.colorSurface, 0), this.f7528Q) : this.f7528Q;
    }

    /* renamed from: p0 */
    private void m10584p0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2171a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f7548j;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f7548j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f7552l.mo9053k();
        ColorStateList colorStateList2 = this.f7575w0;
        if (colorStateList2 != null) {
            this.f7516I0.mo8497K(colorStateList2);
            this.f7516I0.mo8502R(this.f7575w0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f7575w0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f7512G0) : this.f7512G0;
            this.f7516I0.mo8497K(ColorStateList.valueOf(colorForState));
            this.f7516I0.mo8502R(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.f7516I0.mo8497K(this.f7552l.mo9057p());
        } else {
            if (this.f7558o && (textView = this.f7560p) != null) {
                aVar = this.f7516I0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f7577x0) != null) {
                aVar = this.f7516I0;
            }
            aVar.mo8497K(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || k))) {
            if (z2 || this.f7514H0) {
                m10601y(z);
            }
        } else if (z2 || !this.f7514H0) {
            m10543E(z);
        }
    }

    /* renamed from: q */
    private Rect m10585q(Rect rect) {
        int i;
        int i2;
        if (this.f7548j != null) {
            Rect rect2 = this.f7530S;
            boolean z = C3403t.m14674y(this) == 1;
            rect2.bottom = rect.bottom;
            int i3 = this.f7519K;
            if (i3 == 1) {
                rect2.left = m10544F(rect.left, z);
                i = rect.top + this.f7521L;
            } else if (i3 != 2) {
                rect2.left = m10544F(rect.left, z);
                i = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f7548j.getPaddingLeft();
                rect2.top = rect.top - m10593u();
                i2 = rect.right - this.f7548j.getPaddingRight();
                rect2.right = i2;
                return rect2;
            }
            rect2.top = i;
            i2 = m10545G(rect.right, z);
            rect2.right = i2;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: q0 */
    private void m10586q0() {
        EditText editText;
        if (this.f7570u != null && (editText = this.f7548j) != null) {
            this.f7570u.setGravity(editText.getGravity());
            this.f7570u.setPadding(this.f7548j.getCompoundPaddingLeft(), this.f7548j.getCompoundPaddingTop(), this.f7548j.getCompoundPaddingRight(), this.f7548j.getCompoundPaddingBottom());
        }
    }

    /* renamed from: r */
    private int m10587r(Rect rect, Rect rect2, float f) {
        return m10549O() ? (int) (((float) rect2.top) + f) : rect.bottom - this.f7548j.getCompoundPaddingBottom();
    }

    /* renamed from: r0 */
    private void m10588r0() {
        EditText editText = this.f7548j;
        m10590s0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: s */
    private int m10589s(Rect rect, float f) {
        return m10549O() ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f7548j.getCompoundPaddingTop();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m10590s0(int i) {
        if (i != 0 || this.f7514H0) {
            m10547I();
        } else {
            m10564c0();
        }
    }

    private void setEditText(EditText editText) {
        if (this.f7548j == null) {
            if (this.f7545h0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f7548j = editText;
            m10550Q();
            setTextInputAccessibilityDelegate(new C2266e(this));
            this.f7516I0.mo8510b0(this.f7548j.getTypeface());
            this.f7516I0.mo8504T(this.f7548j.getTextSize());
            int gravity = this.f7548j.getGravity();
            this.f7516I0.mo8498L((gravity & -113) | 48);
            this.f7516I0.mo8503S(gravity);
            this.f7548j.addTextChangedListener(new C2262a());
            if (this.f7575w0 == null) {
                this.f7575w0 = this.f7548j.getHintTextColors();
            }
            if (this.f7505D) {
                if (TextUtils.isEmpty(this.f7507E)) {
                    CharSequence hint = this.f7548j.getHint();
                    this.f7550k = hint;
                    setHint(hint);
                    this.f7548j.setHint((CharSequence) null);
                }
                this.f7509F = true;
            }
            if (this.f7560p != null) {
                mo8863g0(this.f7548j.getText().length());
            }
            mo8912k0();
            this.f7552l.mo9051e();
            this.f7542g.bringToFront();
            this.f7544h.bringToFront();
            this.f7546i.bringToFront();
            this.f7571u0.bringToFront();
            m10539A();
            m10592t0();
            m10598w0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m10584p0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f7571u0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f7546i;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m10598w0();
        if (!m10546H()) {
            m10574j0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f7507E)) {
            this.f7507E = charSequence;
            this.f7516I0.mo8508Z(charSequence);
            if (!this.f7514H0) {
                m10551R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f7568t != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f7570u = appCompatTextView;
                appCompatTextView.setId(C5000f.textinput_placeholder);
                C3403t.m14647k0(this.f7570u, 1);
                setPlaceholderTextAppearance(this.f7574w);
                setPlaceholderTextColor(this.f7572v);
                m10569g();
            } else {
                m10553T();
                this.f7570u = null;
            }
            this.f7568t = z;
        }
    }

    /* renamed from: t */
    private Rect m10591t(Rect rect) {
        if (this.f7548j != null) {
            Rect rect2 = this.f7530S;
            float u = this.f7516I0.mo8517u();
            rect2.left = rect.left + this.f7548j.getCompoundPaddingLeft();
            rect2.top = m10589s(rect, u);
            rect2.right = rect.right - this.f7548j.getCompoundPaddingRight();
            rect2.bottom = m10587r(rect, rect2, u);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    private void m10592t0() {
        if (this.f7548j != null) {
            C3403t.m14669v0(this.f7499A, mo8854P() ? 0 : C3403t.m14603D(this.f7548j), this.f7548j.getCompoundPaddingTop(), 0, this.f7548j.getCompoundPaddingBottom());
        }
    }

    /* renamed from: u */
    private int m10593u() {
        float o;
        if (!this.f7505D) {
            return 0;
        }
        int i = this.f7519K;
        if (i == 0 || i == 1) {
            o = this.f7516I0.mo8515o();
        } else if (i != 2) {
            return 0;
        } else {
            o = this.f7516I0.mo8515o() / 2.0f;
        }
        return (int) o;
    }

    /* renamed from: u0 */
    private void m10594u0() {
        this.f7499A.setVisibility((this.f7580z == null || mo8852M()) ? 8 : 0);
        m10574j0();
    }

    /* renamed from: v */
    private boolean m10595v() {
        return this.f7519K == 2 && m10597w();
    }

    /* renamed from: v0 */
    private void m10596v0(boolean z, boolean z2) {
        int defaultColor = this.f7502B0.getDefaultColor();
        int colorForState = this.f7502B0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f7502B0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f7527P = colorForState2;
        } else if (z2) {
            this.f7527P = colorForState;
        } else {
            this.f7527P = defaultColor;
        }
    }

    /* renamed from: w */
    private boolean m10597w() {
        return this.f7523M > -1 && this.f7527P != 0;
    }

    /* renamed from: w0 */
    private void m10598w0() {
        if (this.f7548j != null) {
            C3403t.m14669v0(this.f7503C, 0, this.f7548j.getPaddingTop(), (mo8850J() || m10548K()) ? 0 : C3403t.m14602C(this.f7548j), this.f7548j.getPaddingBottom());
        }
    }

    /* renamed from: x */
    private void m10599x() {
        if (m10602z()) {
            ((C2282c) this.f7511G).mo9025o0();
        }
    }

    /* renamed from: x0 */
    private void m10600x0() {
        int visibility = this.f7503C.getVisibility();
        int i = 0;
        boolean z = this.f7501B != null && !mo8852M();
        TextView textView = this.f7503C;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f7503C.getVisibility()) {
            getEndIconDelegate().mo9014c(z);
        }
        m10574j0();
    }

    /* renamed from: y */
    private void m10601y(boolean z) {
        ValueAnimator valueAnimator = this.f7520K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7520K0.cancel();
        }
        if (!z || !this.f7518J0) {
            this.f7516I0.mo8505V(1.0f);
        } else {
            mo8911h(1.0f);
        }
        this.f7514H0 = false;
        if (m10602z()) {
            m10551R();
        }
        m10588r0();
        m10594u0();
        m10600x0();
    }

    /* renamed from: z */
    private boolean m10602z() {
        return this.f7505D && !TextUtils.isEmpty(this.f7507E) && (this.f7511G instanceof C2282c);
    }

    /* renamed from: J */
    public boolean mo8850J() {
        return this.f7546i.getVisibility() == 0 && this.f7549j0.getVisibility() == 0;
    }

    /* renamed from: L */
    public boolean mo8851L() {
        return this.f7552l.mo9064x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo8852M() {
        return this.f7514H0;
    }

    /* renamed from: N */
    public boolean mo8853N() {
        return this.f7509F;
    }

    /* renamed from: P */
    public boolean mo8854P() {
        return this.f7533V.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo8855Y(TextView textView, int i) {
        boolean z = true;
        try {
            C0608i.m2903q(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0608i.m2903q(textView, C5005k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C3267a.m14074d(getContext(), C4995c.design_error));
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f7540f.addView(view, layoutParams2);
            this.f7540f.setLayoutParams(layoutParams);
            m10581n0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f7550k == null || (editText = this.f7548j) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f7509F;
        this.f7509F = false;
        CharSequence hint = editText.getHint();
        this.f7548j.setHint(this.f7550k);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f7548j.setHint(hint);
            this.f7509F = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f7524M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f7524M0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m10542D(canvas);
        m10541C(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f7522L0) {
            boolean z = true;
            this.f7522L0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C2171a aVar = this.f7516I0;
            boolean Y = aVar != null ? aVar.mo8507Y(drawableState) | false : false;
            if (this.f7548j != null) {
                if (!C3403t.m14614O(this) || !isEnabled()) {
                    z = false;
                }
                mo8913o0(z);
            }
            mo8912k0();
            mo8997y0();
            if (Y) {
                invalidate();
            }
            this.f7522L0 = false;
        }
    }

    /* renamed from: e */
    public void mo8861e(C2267f fVar) {
        this.f7543g0.add(fVar);
        if (this.f7548j != null) {
            fVar.mo9004a(this);
        }
    }

    /* renamed from: f */
    public void mo8862f(C2268g gVar) {
        this.f7551k0.add(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo8863g0(int i) {
        boolean z = this.f7558o;
        int i2 = this.f7556n;
        if (i2 == -1) {
            this.f7560p.setText(String.valueOf(i));
            this.f7560p.setContentDescription((CharSequence) null);
            this.f7558o = false;
        } else {
            this.f7558o = i > i2;
            m10570h0(getContext(), this.f7560p, i, this.f7556n, this.f7558o);
            if (z != this.f7558o) {
                m10572i0();
            }
            this.f7560p.setText(C3326a.m14300c().mo11504j(getContext().getString(C5004j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f7556n)})));
        }
        if (this.f7548j != null && z != this.f7558o) {
            mo8913o0(false);
            mo8997y0();
            mo8912k0();
        }
    }

    public int getBaseline() {
        EditText editText = this.f7548j;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m10593u() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C4972g getBoxBackground() {
        int i = this.f7519K;
        if (i == 1 || i == 2) {
            return this.f7511G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f7528Q;
    }

    public int getBoxBackgroundMode() {
        return this.f7519K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f7511G.mo14945s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f7511G.mo14946t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f7511G.mo14917H();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f7511G.mo14916G();
    }

    public int getBoxStrokeColor() {
        return this.f7500A0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f7502B0;
    }

    public int getBoxStrokeWidth() {
        return this.f7525N;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f7526O;
    }

    public int getCounterMaxLength() {
        return this.f7556n;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f7554m || !this.f7558o || (textView = this.f7560p) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f7576x;
    }

    public ColorStateList getCounterTextColor() {
        return this.f7576x;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f7575w0;
    }

    public EditText getEditText() {
        return this.f7548j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f7549j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f7549j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f7545h0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f7549j0;
    }

    public CharSequence getError() {
        if (this.f7552l.mo9063w()) {
            return this.f7552l.mo9055n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f7552l.mo9054m();
    }

    public int getErrorCurrentTextColors() {
        return this.f7552l.mo9056o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f7571u0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f7552l.mo9056o();
    }

    public CharSequence getHelperText() {
        if (this.f7552l.mo9064x()) {
            return this.f7552l.mo9058q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f7552l.mo9059r();
    }

    public CharSequence getHint() {
        if (this.f7505D) {
            return this.f7507E;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f7516I0.mo8515o();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f7516I0.mo8516r();
    }

    public ColorStateList getHintTextColor() {
        return this.f7577x0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f7549j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f7549j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f7568t) {
            return this.f7566s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f7574w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f7572v;
    }

    public CharSequence getPrefixText() {
        return this.f7580z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f7499A.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f7499A;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7533V.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f7533V.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f7501B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f7503C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f7503C;
    }

    public Typeface getTypeface() {
        return this.f7532U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8911h(float f) {
        if (this.f7516I0.mo8518v() != f) {
            if (this.f7520K0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f7520K0 = valueAnimator;
                valueAnimator.setInterpolator(C5007a.f14948b);
                this.f7520K0.setDuration(167);
                this.f7520K0.addUpdateListener(new C2265d());
            }
            this.f7520K0.setFloatValues(new float[]{this.f7516I0.mo8518v(), f});
            this.f7520K0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo8912k0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f7548j;
        if (editText != null && this.f7519K == 0 && (background = editText.getBackground()) != null) {
            if (C0418c0.m1901a(background)) {
                background = background.mutate();
            }
            if (this.f7552l.mo9053k()) {
                currentTextColor = this.f7552l.mo9056o();
            } else if (!this.f7558o || (textView = this.f7560p) == null) {
                C0588a.m2760c(background);
                this.f7548j.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C0441i.m2010e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo8913o0(boolean z) {
        m10584p0(z, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f7548j;
        if (editText != null) {
            Rect rect = this.f7529R;
            C2174c.m10197a(this, editText, rect);
            m10567e0(rect);
            if (this.f7505D) {
                this.f7516I0.mo8504T(this.f7548j.getTextSize());
                int gravity = this.f7548j.getGravity();
                this.f7516I0.mo8498L((gravity & -113) | 48);
                this.f7516I0.mo8503S(gravity);
                this.f7516I0.mo8495H(m10585q(rect));
                this.f7516I0.mo8501P(m10591t(rect));
                this.f7516I0.mo8493E();
                if (m10602z() && !this.f7514H0) {
                    m10551R();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean l0 = m10577l0();
        boolean j0 = m10574j0();
        if (l0 || j0) {
            this.f7548j.post(new C2264c());
        }
        m10586q0();
        m10592t0();
        m10598w0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2269h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2269h hVar = (C2269h) parcelable;
        super.onRestoreInstanceState(hVar.mo11760a());
        setError(hVar.f7587h);
        if (hVar.f7588i) {
            this.f7549j0.post(new C2263b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C2269h hVar = new C2269h(super.onSaveInstanceState());
        if (this.f7552l.mo9053k()) {
            hVar.f7587h = getError();
        }
        hVar.f7588i = m10546H() && this.f7549j0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f7528Q != i) {
            this.f7528Q = i;
            this.f7504C0 = i;
            this.f7508E0 = i;
            this.f7510F0 = i;
            m10571i();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C3267a.m14074d(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f7504C0 = defaultColor;
        this.f7528Q = defaultColor;
        this.f7506D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7508E0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7510F0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m10571i();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f7519K) {
            this.f7519K = i;
            if (this.f7548j != null) {
                m10550Q();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f7500A0 != i) {
            this.f7500A0 = i;
            mo8997y0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f7579y0 = colorStateList.getDefaultColor();
            this.f7512G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f7581z0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f7500A0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mo8997y0();
        }
        this.f7500A0 = defaultColor;
        mo8997y0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f7502B0 != colorStateList) {
            this.f7502B0 = colorStateList;
            mo8997y0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f7525N = i;
        mo8997y0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f7526O = i;
        mo8997y0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f7554m != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f7560p = appCompatTextView;
                appCompatTextView.setId(C5000f.textinput_counter);
                Typeface typeface = this.f7532U;
                if (typeface != null) {
                    this.f7560p.setTypeface(typeface);
                }
                this.f7560p.setMaxLines(1);
                this.f7552l.mo9050d(this.f7560p, 2);
                C3390g.m14557d((ViewGroup.MarginLayoutParams) this.f7560p.getLayoutParams(), getResources().getDimensionPixelOffset(C4998d.mtrl_textinput_counter_margin_start));
                m10572i0();
                m10568f0();
            } else {
                this.f7552l.mo9065y(this.f7560p, 2);
                this.f7560p = null;
            }
            this.f7554m = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f7556n != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f7556n = i;
            if (this.f7554m) {
                m10568f0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f7562q != i) {
            this.f7562q = i;
            m10572i0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f7578y != colorStateList) {
            this.f7578y = colorStateList;
            m10572i0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f7564r != i) {
            this.f7564r = i;
            m10572i0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f7576x != colorStateList) {
            this.f7576x = colorStateList;
            m10572i0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f7575w0 = colorStateList;
        this.f7577x0 = colorStateList;
        if (this.f7548j != null) {
            mo8913o0(false);
        }
    }

    public void setEnabled(boolean z) {
        m10552S(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f7549j0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f7549j0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f7549j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f7549j0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f7545h0;
        this.f7545h0 = i;
        m10540B(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo9028b(this.f7519K)) {
            getEndIconDelegate().mo9013a();
            m10576l();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f7519K + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m10556W(this.f7549j0, onClickListener, this.f7567s0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7567s0 = onLongClickListener;
        m10557X(this.f7549j0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f7553l0 != colorStateList) {
            this.f7553l0 = colorStateList;
            this.f7555m0 = true;
            m10576l();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f7557n0 != mode) {
            this.f7557n0 = mode;
            this.f7559o0 = true;
            m10576l();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo8850J() != z) {
            this.f7549j0.setVisibility(z ? 0 : 8);
            m10598w0();
            m10574j0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f7552l.mo9063w()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f7552l.mo9048L(charSequence);
        } else {
            this.f7552l.mo9060s();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f7552l.mo9040A(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f7552l.mo9041B(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f7571u0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f7552l.mo9063w());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m10556W(this.f7571u0, onClickListener, this.f7569t0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7569t0 = onLongClickListener;
        m10557X(this.f7571u0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f7573v0 = colorStateList;
        Drawable drawable = this.f7571u0.getDrawable();
        if (drawable != null) {
            drawable = C0588a.m2775r(drawable).mutate();
            C0588a.m2772o(drawable, colorStateList);
        }
        if (this.f7571u0.getDrawable() != drawable) {
            this.f7571u0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7571u0.getDrawable();
        if (drawable != null) {
            drawable = C0588a.m2775r(drawable).mutate();
            C0588a.m2773p(drawable, mode);
        }
        if (this.f7571u0.getDrawable() != drawable) {
            this.f7571u0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f7552l.mo9042C(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f7552l.mo9043D(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo8851L()) {
                setHelperTextEnabled(true);
            }
            this.f7552l.mo9049M(charSequence);
        } else if (mo8851L()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f7552l.mo9046G(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f7552l.mo9045F(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f7552l.mo9044E(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f7505D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f7518J0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f7505D) {
            this.f7505D = z;
            if (!z) {
                this.f7509F = false;
                if (!TextUtils.isEmpty(this.f7507E) && TextUtils.isEmpty(this.f7548j.getHint())) {
                    this.f7548j.setHint(this.f7507E);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f7548j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f7507E)) {
                        setHint(hint);
                    }
                    this.f7548j.setHint((CharSequence) null);
                }
                this.f7509F = true;
            }
            if (this.f7548j != null) {
                m10581n0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f7516I0.mo8496I(i);
        this.f7577x0 = this.f7516I0.mo8514n();
        if (this.f7548j != null) {
            mo8913o0(false);
            m10581n0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7577x0 != colorStateList) {
            if (this.f7575w0 == null) {
                this.f7516I0.mo8497K(colorStateList);
            }
            this.f7577x0 = colorStateList;
            if (this.f7548j != null) {
                mo8913o0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7549j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7549j0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f7545h0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f7553l0 = colorStateList;
        this.f7555m0 = true;
        m10576l();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f7557n0 = mode;
        this.f7559o0 = true;
        m10576l();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f7568t || !TextUtils.isEmpty(charSequence)) {
            if (!this.f7568t) {
                setPlaceholderTextEnabled(true);
            }
            this.f7566s = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m10588r0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f7574w = i;
        TextView textView = this.f7570u;
        if (textView != null) {
            C0608i.m2903q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f7572v != colorStateList) {
            this.f7572v = colorStateList;
            TextView textView = this.f7570u;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f7580z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7499A.setText(charSequence);
        m10594u0();
    }

    public void setPrefixTextAppearance(int i) {
        C0608i.m2903q(this.f7499A, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f7499A.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f7533V.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f7533V.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C3133a.m13388d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7533V.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m10580n();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m10556W(this.f7533V, onClickListener, this.f7541f0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7541f0 = onLongClickListener;
        m10557X(this.f7533V, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f7534W != colorStateList) {
            this.f7534W = colorStateList;
            this.f7535a0 = true;
            m10580n();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f7536b0 != mode) {
            this.f7536b0 = mode;
            this.f7537c0 = true;
            m10580n();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo8854P() != z) {
            this.f7533V.setVisibility(z ? 0 : 8);
            m10592t0();
            m10574j0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f7501B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7503C.setText(charSequence);
        m10600x0();
    }

    public void setSuffixTextAppearance(int i) {
        C0608i.m2903q(this.f7503C, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f7503C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2266e eVar) {
        EditText editText = this.f7548j;
        if (editText != null) {
            C3403t.m14643i0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7532U) {
            this.f7532U = typeface;
            this.f7516I0.mo8510b0(typeface);
            this.f7552l.mo9047I(typeface);
            TextView textView = this.f7560p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f7548j;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8997y0() {
        /*
            r6 = this;
            g.d.a.d.b0.g r0 = r6.f7511G
            if (r0 == 0) goto L_0x00e7
            int r0 = r6.f7519K
            if (r0 != 0) goto L_0x000a
            goto L_0x00e7
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f7548j
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f7548j
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f7512G0
        L_0x003c:
            r6.f7527P = r4
            goto L_0x0075
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.f7552l
            boolean r4 = r4.mo9053k()
            if (r4 == 0) goto L_0x0056
            android.content.res.ColorStateList r4 = r6.f7502B0
            if (r4 == 0) goto L_0x004f
        L_0x004b:
            r6.m10596v0(r0, r3)
            goto L_0x0075
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.f7552l
            int r4 = r4.mo9056o()
            goto L_0x003c
        L_0x0056:
            boolean r4 = r6.f7558o
            if (r4 == 0) goto L_0x0068
            android.widget.TextView r4 = r6.f7560p
            if (r4 == 0) goto L_0x0068
            android.content.res.ColorStateList r5 = r6.f7502B0
            if (r5 == 0) goto L_0x0063
            goto L_0x004b
        L_0x0063:
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            int r4 = r6.f7500A0
            goto L_0x003c
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            int r4 = r6.f7581z0
            goto L_0x003c
        L_0x0072:
            int r4 = r6.f7579y0
            goto L_0x003c
        L_0x0075:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.f7552l
            boolean r4 = r4.mo9063w()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.f7552l
            boolean r4 = r4.mo9053k()
            if (r4 == 0) goto L_0x008c
            r1 = 1
        L_0x008c:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f7571u0
            android.content.res.ColorStateList r4 = r6.f7573v0
            r6.m10579m0(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f7533V
            android.content.res.ColorStateList r4 = r6.f7534W
            r6.m10579m0(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.f7549j0
            android.content.res.ColorStateList r4 = r6.f7553l0
            r6.m10579m0(r1, r4)
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo9029d()
            if (r1 == 0) goto L_0x00b7
            com.google.android.material.textfield.f r1 = r6.f7552l
            boolean r1 = r1.mo9053k()
            r6.m10566d0(r1)
        L_0x00b7:
            if (r0 == 0) goto L_0x00c2
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c2
            int r1 = r6.f7526O
            goto L_0x00c4
        L_0x00c2:
            int r1 = r6.f7525N
        L_0x00c4:
            r6.f7523M = r1
            int r1 = r6.f7519K
            if (r1 != r2) goto L_0x00e4
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00d5
            int r0 = r6.f7506D0
        L_0x00d2:
            r6.f7528Q = r0
            goto L_0x00e4
        L_0x00d5:
            if (r3 == 0) goto L_0x00dc
            if (r0 != 0) goto L_0x00dc
            int r0 = r6.f7510F0
            goto L_0x00d2
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            int r0 = r6.f7508E0
            goto L_0x00d2
        L_0x00e1:
            int r0 = r6.f7504C0
            goto L_0x00d2
        L_0x00e4:
            r6.m10571i()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo8997y0():void");
    }
}
