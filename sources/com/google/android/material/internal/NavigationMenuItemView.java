package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.widget.C0431g0;
import androidx.appcompat.widget.C0496w0;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0608i;
import p086f.p087a.C3123a;
import p086f.p111h.p112e.p113c.C3279f;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C4999e;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5002h;

public class NavigationMenuItemView extends C2176e implements C0352n.C0353a {

    /* renamed from: K */
    private static final int[] f7168K = {16842912};

    /* renamed from: A */
    private int f7169A;

    /* renamed from: B */
    private boolean f7170B;

    /* renamed from: C */
    boolean f7171C;

    /* renamed from: D */
    private final CheckedTextView f7172D;

    /* renamed from: E */
    private FrameLayout f7173E;

    /* renamed from: F */
    private C0339i f7174F;

    /* renamed from: G */
    private ColorStateList f7175G;

    /* renamed from: H */
    private boolean f7176H;

    /* renamed from: I */
    private Drawable f7177I;

    /* renamed from: J */
    private final C3350a f7178J;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C2170a extends C3350a {
        C2170a() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11617Z(NavigationMenuItemView.this.f7171C);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7178J = new C2170a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C5002h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C4998d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C5000f.design_menu_item_text);
        this.f7172D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C3403t.m14643i0(this.f7172D, this.f7178J);
    }

    /* renamed from: B */
    private void m10132B() {
        int i;
        C0431g0.C0432a aVar;
        if (m10134E()) {
            this.f7172D.setVisibility(8);
            FrameLayout frameLayout = this.f7173E;
            if (frameLayout != null) {
                aVar = (C0431g0.C0432a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f7172D.setVisibility(0);
            FrameLayout frameLayout2 = this.f7173E;
            if (frameLayout2 != null) {
                aVar = (C0431g0.C0432a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f7173E.setLayoutParams(aVar);
    }

    /* renamed from: C */
    private StateListDrawable m10133C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C3123a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f7168K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: E */
    private boolean m10134E() {
        return this.f7174F.getTitle() == null && this.f7174F.getIcon() == null && this.f7174F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7173E == null) {
                this.f7173E = (FrameLayout) ((ViewStub) findViewById(C5000f.design_menu_item_action_area_stub)).inflate();
            }
            this.f7173E.removeAllViews();
            this.f7173E.addView(view);
        }
    }

    /* renamed from: D */
    public void mo8476D() {
        FrameLayout frameLayout = this.f7173E;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f7172D.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: d */
    public boolean mo1033d() {
        return false;
    }

    /* renamed from: e */
    public void mo1034e(C0339i iVar, int i) {
        this.f7174F = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C3403t.m14649l0(this, m10133C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0496w0.m2250a(this, iVar.getTooltipText());
        m10132B();
    }

    public C0339i getItemData() {
        return this.f7174F;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0339i iVar = this.f7174F;
        if (iVar != null && iVar.isCheckable() && this.f7174F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f7168K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f7171C != z) {
            this.f7171C = z;
            this.f7178J.mo4826l(this.f7172D, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f7172D.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7176H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0588a.m2775r(drawable).mutate();
                C0588a.m2772o(drawable, this.f7175G);
            }
            int i = this.f7169A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f7170B) {
            if (this.f7177I == null) {
                Drawable a = C3279f.m14126a(getResources(), C4999e.navigation_empty_icon, getContext().getTheme());
                this.f7177I = a;
                if (a != null) {
                    int i2 = this.f7169A;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f7177I;
        }
        C0608i.m2898l(this.f7172D, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f7172D.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f7169A = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f7175G = colorStateList;
        this.f7176H = colorStateList != null;
        C0339i iVar = this.f7174F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f7172D.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f7170B = z;
    }

    public void setTextAppearance(int i) {
        C0608i.m2903q(this.f7172D, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7172D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7172D.setText(charSequence);
    }
}
