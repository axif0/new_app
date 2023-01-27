package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0301i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5002h;
import p148g.p189d.p190a.p252d.C5005k;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C2069a extends C0301i {

    /* renamed from: h */
    private BottomSheetBehavior<FrameLayout> f6767h;

    /* renamed from: i */
    private FrameLayout f6768i;

    /* renamed from: j */
    boolean f6769j;

    /* renamed from: k */
    boolean f6770k = true;

    /* renamed from: l */
    private boolean f6771l = true;

    /* renamed from: m */
    private boolean f6772m;

    /* renamed from: n */
    private BottomSheetBehavior.C2065f f6773n = new C2073d();

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    class C2070a implements View.OnClickListener {
        C2070a() {
        }

        public void onClick(View view) {
            C2069a aVar = C2069a.this;
            if (aVar.f6770k && aVar.isShowing() && C2069a.this.mo7687k()) {
                C2069a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    class C2071b extends C3350a {
        C2071b() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            boolean z;
            super.mo2997g(view, cVar);
            if (C2069a.this.f6770k) {
                cVar.mo11618a(1048576);
                z = true;
            } else {
                z = false;
            }
            cVar.mo11630g0(z);
        }

        /* renamed from: j */
        public boolean mo2998j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C2069a aVar = C2069a.this;
                if (aVar.f6770k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo2998j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    class C2072c implements View.OnTouchListener {
        C2072c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    class C2073d extends BottomSheetBehavior.C2065f {
        C2073d() {
        }

        /* renamed from: a */
        public void mo7674a(View view, float f) {
        }

        /* renamed from: b */
        public void mo7675b(View view, int i) {
            if (i == 5) {
                C2069a.this.cancel();
            }
        }
    }

    public C2069a(Context context, int i) {
        super(context, m9489b(context, i));
        mo963d(1);
    }

    /* renamed from: b */
    private static int m9489b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C4965b.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C5005k.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: e */
    private FrameLayout m9490e() {
        if (this.f6768i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C5002h.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f6768i = frameLayout;
            BottomSheetBehavior<FrameLayout> V = BottomSheetBehavior.m9427V((FrameLayout) frameLayout.findViewById(C5000f.design_bottom_sheet));
            this.f6767h = V;
            V.mo7647M(this.f6773n);
            this.f6767h.mo7660j0(this.f6770k);
        }
        return this.f6768i;
    }

    /* renamed from: l */
    private View m9491l(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m9490e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f6768i.findViewById(C5000f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f6768i.findViewById(C5000f.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C5000f.touch_outside).setOnClickListener(new C2070a());
        C3403t.m14643i0(frameLayout, new C2071b());
        frameLayout.setOnTouchListener(new C2072c());
        return this.f6768i;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> f = mo7684f();
        if (!this.f6769j || f.mo7651X() == 5) {
            super.cancel();
        } else {
            f.mo7665o0(5);
        }
    }

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> mo7684f() {
        if (this.f6767h == null) {
            m9490e();
        }
        return this.f6767h;
    }

    /* renamed from: g */
    public boolean mo7685g() {
        return this.f6769j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7686i() {
        this.f6767h.mo7654b0(this.f6773n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo7687k() {
        if (!this.f6772m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f6771l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f6772m = true;
        }
        return this.f6771l;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f6767h;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo7651X() == 5) {
            this.f6767h.mo7665o0(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f6770k != z) {
            this.f6770k = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f6767h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo7660j0(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f6770k) {
            this.f6770k = true;
        }
        this.f6771l = z;
        this.f6772m = true;
    }

    public void setContentView(int i) {
        super.setContentView(m9491l(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(m9491l(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m9491l(0, view, layoutParams));
    }
}
