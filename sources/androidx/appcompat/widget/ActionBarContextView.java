package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086f.p087a.C3123a;
import p086f.p087a.C3128f;
import p086f.p087a.C3129g;
import p086f.p087a.C3132j;
import p086f.p087a.p094o.C3155b;
import p086f.p111h.p122m.C3403t;

public class ActionBarContextView extends C0401a {

    /* renamed from: n */
    private CharSequence f1336n;

    /* renamed from: o */
    private CharSequence f1337o;

    /* renamed from: p */
    private View f1338p;

    /* renamed from: q */
    private View f1339q;

    /* renamed from: r */
    private LinearLayout f1340r;

    /* renamed from: s */
    private TextView f1341s;

    /* renamed from: t */
    private TextView f1342t;

    /* renamed from: u */
    private int f1343u;

    /* renamed from: v */
    private int f1344v;

    /* renamed from: w */
    private boolean f1345w;

    /* renamed from: x */
    private int f1346x;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0361a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C3155b f1347f;

        C0361a(C3155b bVar) {
            this.f1347f = bVar;
        }

        public void onClick(View view) {
            this.f1347f.mo1016c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0479u0 v = C0479u0.m2148v(context, attributeSet, C3132j.ActionMode, i, 0);
        C3403t.m14649l0(this, v.mo2349g(C3132j.ActionMode_background));
        this.f1343u = v.mo2356n(C3132j.ActionMode_titleTextStyle, 0);
        this.f1344v = v.mo2356n(C3132j.ActionMode_subtitleTextStyle, 0);
        this.f1600j = v.mo2355m(C3132j.ActionMode_height, 0);
        this.f1346x = v.mo2356n(C3132j.ActionMode_closeItemLayout, C3129g.abc_action_mode_close_item_material);
        v.mo2362w();
    }

    /* renamed from: i */
    private void m1608i() {
        if (this.f1340r == null) {
            LayoutInflater.from(getContext()).inflate(C3129g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1340r = linearLayout;
            this.f1341s = (TextView) linearLayout.findViewById(C3128f.action_bar_title);
            this.f1342t = (TextView) this.f1340r.findViewById(C3128f.action_bar_subtitle);
            if (this.f1343u != 0) {
                this.f1341s.setTextAppearance(getContext(), this.f1343u);
            }
            if (this.f1344v != 0) {
                this.f1342t.setTextAppearance(getContext(), this.f1344v);
            }
        }
        this.f1341s.setText(this.f1336n);
        this.f1342t.setText(this.f1337o);
        boolean z = !TextUtils.isEmpty(this.f1336n);
        boolean z2 = !TextUtils.isEmpty(this.f1337o);
        int i = 0;
        this.f1342t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1340r;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1340r.getParent() == null) {
            addView(this.f1340r);
        }
    }

    /* renamed from: g */
    public void mo1486g() {
        if (this.f1338p == null) {
            mo1495k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1337o;
    }

    public CharSequence getTitle() {
        return this.f1336n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1493h(p086f.p087a.p094o.C3155b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1338p
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1346x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1338p = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f1338p
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1338p
            int r1 = p086f.p087a.C3128f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo1018e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0335g) r4
            androidx.appcompat.widget.c r0 = r3.f1599i
            if (r0 == 0) goto L_0x003f
            r0.mo1984B()
        L_0x003f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1599i = r0
            r1 = 1
            r0.mo1994M(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1599i
            android.content.Context r2 = r3.f1597g
            r4.mo1231c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1599i
            androidx.appcompat.view.menu.n r4 = r4.mo1141r(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1598h = r4
            r1 = 0
            p086f.p111h.p122m.C3403t.m14649l0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1598h
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo1493h(f.a.o.b):void");
    }

    /* renamed from: j */
    public boolean mo1494j() {
        return this.f1345w;
    }

    /* renamed from: k */
    public void mo1495k() {
        removeAllViews();
        this.f1339q = null;
        this.f1598h = null;
    }

    /* renamed from: l */
    public boolean mo1496l() {
        C0408c cVar = this.f1599i;
        if (cVar != null) {
            return cVar.mo1995N();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0408c cVar = this.f1599i;
        if (cVar != null) {
            cVar.mo1986E();
            this.f1599i.mo1987F();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1336n);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0404a1.m1828b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1338p;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1338p.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0401a.m1810d(paddingRight, i5, b);
            paddingRight = C0401a.m1810d(d + mo1939e(this.f1338p, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1340r;
        if (!(linearLayout == null || this.f1339q != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1939e(this.f1340r, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f1339q;
        if (view2 != null) {
            mo1939e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1598h;
        if (actionMenuView != null) {
            mo1939e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1600j;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1338p;
            if (view != null) {
                int c = mo1938c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1338p.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1598h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1938c(this.f1598h, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1340r;
            if (linearLayout != null && this.f1339q == null) {
                if (this.f1345w) {
                    this.f1340r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1340r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1340r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1938c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1339q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1339q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1600j <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f1600j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1339q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1339q = view;
        if (!(view == null || (linearLayout = this.f1340r) == null)) {
            removeView(linearLayout);
            this.f1340r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1337o = charSequence;
        m1608i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1336n = charSequence;
        m1608i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1345w) {
            requestLayout();
        }
        this.f1345w = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
