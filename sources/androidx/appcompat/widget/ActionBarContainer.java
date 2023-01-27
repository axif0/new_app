package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086f.p087a.C3128f;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f1326f;

    /* renamed from: g */
    private View f1327g;

    /* renamed from: h */
    private View f1328h;

    /* renamed from: i */
    private View f1329i;

    /* renamed from: j */
    Drawable f1330j;

    /* renamed from: k */
    Drawable f1331k;

    /* renamed from: l */
    Drawable f1332l;

    /* renamed from: m */
    boolean f1333m;

    /* renamed from: n */
    boolean f1334n;

    /* renamed from: o */
    private int f1335o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3403t.m14649l0(this, new C0405b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.ActionBar);
        this.f1330j = obtainStyledAttributes.getDrawable(C3132j.ActionBar_background);
        this.f1331k = obtainStyledAttributes.getDrawable(C3132j.ActionBar_backgroundStacked);
        this.f1335o = obtainStyledAttributes.getDimensionPixelSize(C3132j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C3128f.split_action_bar) {
            this.f1333m = true;
            this.f1332l = obtainStyledAttributes.getDrawable(C3132j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1333m ? !(this.f1330j == null && this.f1331k == null) : this.f1332l != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1606a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1607b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1330j;
        if (drawable != null && drawable.isStateful()) {
            this.f1330j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1331k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1331k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1332l;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1332l.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1327g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1330j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1331k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1332l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1328h = findViewById(C3128f.action_bar);
        this.f1329i = findViewById(C3128f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1326f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1327g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1333m) {
            Drawable drawable3 = this.f1332l;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1330j != null) {
                if (this.f1328h.getVisibility() == 0) {
                    drawable2 = this.f1330j;
                    left = this.f1328h.getLeft();
                    top = this.f1328h.getTop();
                    right = this.f1328h.getRight();
                    view = this.f1328h;
                } else {
                    View view3 = this.f1329i;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1330j.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f1330j;
                        left = this.f1329i.getLeft();
                        top = this.f1329i.getTop();
                        right = this.f1329i.getRight();
                        view = this.f1329i;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1334n = z4;
            if (!z4 || (drawable = this.f1331k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1328h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1335o
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1328h
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1327g
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1328h
            boolean r0 = r3.m1607b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1328h
        L_0x0042:
            int r0 = r3.m1606a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1329i
            boolean r0 = r3.m1607b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1329i
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1327g
            int r1 = r3.m1606a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1330j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1330j);
        }
        this.f1330j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1328h;
            if (view != null) {
                this.f1330j.setBounds(view.getLeft(), this.f1328h.getTop(), this.f1328h.getRight(), this.f1328h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1333m ? !(this.f1330j == null && this.f1331k == null) : this.f1332l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1332l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1332l);
        }
        this.f1332l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1333m && (drawable2 = this.f1332l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1333m ? this.f1330j == null && this.f1331k == null : this.f1332l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1331k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1331k);
        }
        this.f1331k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1334n && (drawable2 = this.f1331k) != null) {
                drawable2.setBounds(this.f1327g.getLeft(), this.f1327g.getTop(), this.f1327g.getRight(), this.f1327g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1333m ? !(this.f1330j == null && this.f1331k == null) : this.f1332l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0460n0 n0Var) {
        View view = this.f1327g;
        if (view != null) {
            removeView(view);
        }
        this.f1327g = n0Var;
        if (n0Var != null) {
            addView(n0Var);
            ViewGroup.LayoutParams layoutParams = n0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            n0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1326f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1330j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1331k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1332l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1330j && !this.f1333m) || (drawable == this.f1331k && this.f1334n) || ((drawable == this.f1332l && this.f1333m) || super.verifyDrawable(drawable));
    }
}
