package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.widget.C0431g0;

public class ActionMenuView extends C0431g0 implements C0335g.C0337b, C0352n {

    /* renamed from: A */
    C0335g.C0336a f1384A;

    /* renamed from: B */
    private boolean f1385B;

    /* renamed from: C */
    private int f1386C;

    /* renamed from: D */
    private int f1387D;

    /* renamed from: E */
    private int f1388E;

    /* renamed from: F */
    C0371e f1389F;

    /* renamed from: u */
    private C0335g f1390u;

    /* renamed from: v */
    private Context f1391v;

    /* renamed from: w */
    private int f1392w;

    /* renamed from: x */
    private boolean f1393x;

    /* renamed from: y */
    private C0408c f1394y;

    /* renamed from: z */
    private C0350m.C0351a f1395z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0367a {
        /* renamed from: a */
        boolean mo1031a();

        /* renamed from: b */
        boolean mo1032b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0368b implements C0350m.C0351a {
        C0368b() {
        }

        /* renamed from: b */
        public void mo930b(C0335g gVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo931c(C0335g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0369c extends C0431g0.C0432a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f1396c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f1397d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f1398e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f1399f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f1400g;

        /* renamed from: h */
        boolean f1401h;

        public C0369c(int i, int i2) {
            super(i, i2);
            this.f1396c = false;
        }

        public C0369c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0369c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0369c(C0369c cVar) {
            super(cVar);
            this.f1396c = cVar.f1396c;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0370d implements C0335g.C0336a {
        C0370d() {
        }

        /* renamed from: a */
        public boolean mo904a(C0335g gVar, MenuItem menuItem) {
            C0371e eVar = ActionMenuView.this.f1389F;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo906b(C0335g gVar) {
            C0335g.C0336a aVar = ActionMenuView.this.f1384A;
            if (aVar != null) {
                aVar.mo906b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0371e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1387D = (int) (56.0f * f);
        this.f1388E = (int) (f * 4.0f);
        this.f1391v = context;
        this.f1392w = 0;
    }

    /* renamed from: L */
    static int m1648L(View view, int i, int i2, int i3, int i4) {
        C0369c cVar = (C0369c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo1035f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1396c || !z2) {
            z = false;
        }
        cVar.f1399f = z;
        cVar.f1397d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m1649M(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f1387D;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f1388E;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                C0369c cVar = (C0369c) childAt.getLayoutParams();
                cVar.f1401h = z4;
                cVar.f1398e = z4 ? 1 : 0;
                cVar.f1397d = z4;
                cVar.f1399f = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f1400g = z6 && ((ActionMenuItemView) childAt).mo1035f();
                int L = m1648L(childAt, i11, cVar.f1396c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (cVar.f1399f) {
                    i16++;
                }
                if (cVar.f1396c) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    C0369c cVar2 = (C0369c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f1399f) {
                        int i26 = cVar2.f1397d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    C0369c cVar3 = (C0369c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f1397d == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f1400g || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f1388E;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f1397d++;
                        cVar3.f1401h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0369c) getChildAt(0).getLayoutParams()).f1400g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((C0369c) getChildAt(i32).getLayoutParams()).f1400g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0369c cVar4 = (C0369c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1398e = i33;
                        cVar4.f1401h = true;
                        if (i34 == 0 && !cVar4.f1400g) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f1396c) {
                        cVar4.f1398e = i33;
                        cVar4.f1401h = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0369c cVar5 = (C0369c) childAt4.getLayoutParams();
                if (cVar5.f1401h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1397d * i11) + cVar5.f1398e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: B */
    public void mo1569B() {
        C0408c cVar = this.f1394y;
        if (cVar != null) {
            cVar.mo1984B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0369c mo1591m() {
        C0369c cVar = new C0369c(-2, -2);
        cVar.f1698b = 16;
        return cVar;
    }

    /* renamed from: D */
    public C0369c mo1592n(AttributeSet attributeSet) {
        return new C0369c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C0369c mo1593o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo1591m();
        }
        C0369c cVar = layoutParams instanceof C0369c ? new C0369c((C0369c) layoutParams) : new C0369c(layoutParams);
        if (cVar.f1698b <= 0) {
            cVar.f1698b = 16;
        }
        return cVar;
    }

    /* renamed from: F */
    public C0369c mo1573F() {
        C0369c C = mo1591m();
        C.f1396c = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo1574G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0367a)) {
            z = false | ((C0367a) childAt).mo1031a();
        }
        return (i <= 0 || !(childAt2 instanceof C0367a)) ? z : z | ((C0367a) childAt2).mo1032b();
    }

    /* renamed from: H */
    public boolean mo1575H() {
        C0408c cVar = this.f1394y;
        return cVar != null && cVar.mo1986E();
    }

    /* renamed from: I */
    public boolean mo1576I() {
        C0408c cVar = this.f1394y;
        return cVar != null && cVar.mo1988G();
    }

    /* renamed from: J */
    public boolean mo1577J() {
        C0408c cVar = this.f1394y;
        return cVar != null && cVar.mo1989H();
    }

    /* renamed from: K */
    public boolean mo1578K() {
        return this.f1393x;
    }

    /* renamed from: N */
    public C0335g mo1579N() {
        return this.f1390u;
    }

    /* renamed from: O */
    public void mo1580O(C0350m.C0351a aVar, C0335g.C0336a aVar2) {
        this.f1395z = aVar;
        this.f1384A = aVar2;
    }

    /* renamed from: P */
    public boolean mo1581P() {
        C0408c cVar = this.f1394y;
        return cVar != null && cVar.mo1995N();
    }

    /* renamed from: a */
    public boolean mo1053a(C0339i iVar) {
        return this.f1390u.mo1207N(iVar, 0);
    }

    /* renamed from: b */
    public void mo1054b(C0335g gVar) {
        this.f1390u = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0369c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1390u == null) {
            Context context = getContext();
            C0335g gVar = new C0335g(context);
            this.f1390u = gVar;
            gVar.mo1214V(new C0370d());
            C0408c cVar = new C0408c(context);
            this.f1394y = cVar;
            cVar.mo1994M(true);
            C0408c cVar2 = this.f1394y;
            C0350m.C0351a aVar = this.f1395z;
            if (aVar == null) {
                aVar = new C0368b();
            }
            cVar2.mo1139p(aVar);
            this.f1390u.mo1231c(this.f1394y, this.f1391v);
            this.f1394y.mo1992K(this);
        }
        return this.f1390u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1394y.mo1985D();
    }

    public int getPopupTheme() {
        return this.f1392w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0408c cVar = this.f1394y;
        if (cVar != null) {
            cVar.mo1136k(false);
            if (this.f1394y.mo1989H()) {
                this.f1394y.mo1986E();
                this.f1394y.mo1995N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1569B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f1385B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0404a1.m1828b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0369c cVar = (C0369c) childAt.getLayoutParams();
                if (cVar.f1396c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1574G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1574G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0369c cVar2 = (C0369c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1396c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0369c cVar3 = (C0369c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1396c) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0335g gVar;
        boolean z = this.f1385B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1385B = z2;
        if (z != z2) {
            this.f1386C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1385B || (gVar = this.f1390u) == null || size == this.f1386C)) {
            this.f1386C = size;
            gVar.mo1206M(true);
        }
        int childCount = getChildCount();
        if (!this.f1385B || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0369c cVar = (C0369c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1649M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1394y.mo1991J(z);
    }

    public void setOnMenuItemClickListener(C0371e eVar) {
        this.f1389F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1394y.mo1993L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1393x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1392w != i) {
            this.f1392w = i;
            if (i == 0) {
                this.f1391v = getContext();
            } else {
                this.f1391v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0408c cVar) {
        this.f1394y = cVar;
        cVar.mo1992K(this);
    }
}
