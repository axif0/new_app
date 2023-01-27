package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0605f;
import java.lang.reflect.Field;
import p086f.p087a.C3123a;
import p086f.p087a.p090l.p091a.C3147c;
import p086f.p111h.p122m.C3418x;

/* renamed from: androidx.appcompat.widget.d0 */
class C0420d0 extends ListView {

    /* renamed from: f */
    private final Rect f1645f = new Rect();

    /* renamed from: g */
    private int f1646g = 0;

    /* renamed from: h */
    private int f1647h = 0;

    /* renamed from: i */
    private int f1648i = 0;

    /* renamed from: j */
    private int f1649j = 0;

    /* renamed from: k */
    private int f1650k;

    /* renamed from: l */
    private Field f1651l;

    /* renamed from: m */
    private C0421a f1652m;

    /* renamed from: n */
    private boolean f1653n;

    /* renamed from: o */
    private boolean f1654o;

    /* renamed from: p */
    private boolean f1655p;

    /* renamed from: q */
    private C3418x f1656q;

    /* renamed from: r */
    private C0605f f1657r;

    /* renamed from: s */
    C0422b f1658s;

    /* renamed from: androidx.appcompat.widget.d0$a */
    private static class C0421a extends C3147c {

        /* renamed from: g */
        private boolean f1659g = true;

        C0421a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2025c(boolean z) {
            this.f1659g = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1659g) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1659g) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1659g) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1659g) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1659g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    private class C0422b implements Runnable {
        C0422b() {
        }

        /* renamed from: a */
        public void mo2031a() {
            C0420d0 d0Var = C0420d0.this;
            d0Var.f1658s = null;
            d0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2032b() {
            C0420d0.this.post(this);
        }

        public void run() {
            C0420d0 d0Var = C0420d0.this;
            d0Var.f1658s = null;
            d0Var.drawableStateChanged();
        }
    }

    C0420d0(Context context, boolean z) {
        super(context, (AttributeSet) null, C3123a.dropDownListViewStyle);
        this.f1654o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1651l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1906a() {
        this.f1655p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1650k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C3418x xVar = this.f1656q;
        if (xVar != null) {
            xVar.mo11731b();
            this.f1656q = null;
        }
    }

    /* renamed from: b */
    private void m1907b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1908c(Canvas canvas) {
        Drawable selector;
        if (!this.f1645f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1645f);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1909f(int i, View view) {
        Rect rect = this.f1645f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1646g;
        rect.top -= this.f1647h;
        rect.right += this.f1648i;
        rect.bottom += this.f1649j;
        try {
            boolean z = this.f1651l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1651l.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1910g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1909f(i, view);
        if (z2) {
            Rect rect = this.f1645f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0588a.m2768k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1911h(int i, View view, float f, float f2) {
        m1910g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0588a.m2768k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1912i(View view, int i, float f, float f2) {
        View childAt;
        this.f1655p = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1650k;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1650k = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1911h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1913j() {
        return this.f1655p;
    }

    /* renamed from: k */
    private void m1914k() {
        Drawable selector = getSelector();
        if (selector != null && m1913j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0421a aVar = this.f1652m;
        if (aVar != null) {
            aVar.mo2025c(z);
        }
    }

    /* renamed from: d */
    public int mo2012d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1908c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1658s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1914k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2015e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1912i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1907b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1906a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f1657r
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1657r = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f1657r
            r9.mo3011m(r2)
            androidx.core.widget.f r9 = r7.f1657r
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f1657r
            if (r8 == 0) goto L_0x006c
            r8.mo3011m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0420d0.mo2015e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1654o || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1654o || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1654o || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1654o && this.f1653n) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1658s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1658s == null) {
            C0422b bVar = new C0422b();
            this.f1658s = bVar;
            bVar.mo2032b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1914k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1650k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0422b bVar = this.f1658s;
        if (bVar != null) {
            bVar.mo2031a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1653n = z;
    }

    public void setSelector(Drawable drawable) {
        C0421a aVar = drawable != null ? new C0421a(drawable) : null;
        this.f1652m = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1646g = rect.left;
        this.f1647h = rect.top;
        this.f1648i = rect.right;
        this.f1649j = rect.bottom;
    }
}
