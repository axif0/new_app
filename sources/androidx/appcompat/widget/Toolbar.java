package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0359r;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import p086f.p087a.C3123a;
import p086f.p087a.C3132j;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p087a.p094o.C3157c;
import p086f.p087a.p094o.C3162g;
import p086f.p111h.p122m.C3386d;
import p086f.p111h.p122m.C3390g;
import p086f.p111h.p122m.C3403t;
import p086f.p126j.p127a.C3430a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1541A;

    /* renamed from: B */
    private int f1542B;

    /* renamed from: C */
    private CharSequence f1543C;

    /* renamed from: D */
    private CharSequence f1544D;

    /* renamed from: E */
    private ColorStateList f1545E;

    /* renamed from: F */
    private ColorStateList f1546F;

    /* renamed from: G */
    private boolean f1547G;

    /* renamed from: H */
    private boolean f1548H;

    /* renamed from: I */
    private final ArrayList<View> f1549I;

    /* renamed from: J */
    private final ArrayList<View> f1550J;

    /* renamed from: K */
    private final int[] f1551K;

    /* renamed from: L */
    C0397f f1552L;

    /* renamed from: M */
    private final ActionMenuView.C0371e f1553M;

    /* renamed from: N */
    private C0492v0 f1554N;

    /* renamed from: O */
    private C0408c f1555O;

    /* renamed from: P */
    private C0395d f1556P;

    /* renamed from: Q */
    private C0350m.C0351a f1557Q;

    /* renamed from: R */
    private C0335g.C0336a f1558R;

    /* renamed from: S */
    private boolean f1559S;

    /* renamed from: T */
    private final Runnable f1560T;

    /* renamed from: f */
    private ActionMenuView f1561f;

    /* renamed from: g */
    private TextView f1562g;

    /* renamed from: h */
    private TextView f1563h;

    /* renamed from: i */
    private ImageButton f1564i;

    /* renamed from: j */
    private ImageView f1565j;

    /* renamed from: k */
    private Drawable f1566k;

    /* renamed from: l */
    private CharSequence f1567l;

    /* renamed from: m */
    ImageButton f1568m;

    /* renamed from: n */
    View f1569n;

    /* renamed from: o */
    private Context f1570o;

    /* renamed from: p */
    private int f1571p;

    /* renamed from: q */
    private int f1572q;

    /* renamed from: r */
    private int f1573r;

    /* renamed from: s */
    int f1574s;

    /* renamed from: t */
    private int f1575t;

    /* renamed from: u */
    private int f1576u;

    /* renamed from: v */
    private int f1577v;

    /* renamed from: w */
    private int f1578w;

    /* renamed from: x */
    private int f1579x;

    /* renamed from: y */
    private C0458m0 f1580y;

    /* renamed from: z */
    private int f1581z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0392a implements ActionMenuView.C0371e {
        C0392a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0397f fVar = Toolbar.this.f1552L;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0393b implements Runnable {
        C0393b() {
        }

        public void run() {
            Toolbar.this.mo1830O();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0394c implements View.OnClickListener {
        C0394c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1834e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0395d implements C0350m {

        /* renamed from: f */
        C0335g f1585f;

        /* renamed from: g */
        C0339i f1586g;

        C0395d() {
        }

        /* renamed from: b */
        public void mo1128b(C0335g gVar, boolean z) {
        }

        /* renamed from: f */
        public int mo1132f() {
            return 0;
        }

        /* renamed from: g */
        public void mo1133g(Context context, C0335g gVar) {
            C0339i iVar;
            C0335g gVar2 = this.f1585f;
            if (!(gVar2 == null || (iVar = this.f1586g) == null)) {
                gVar2.mo1240f(iVar);
            }
            this.f1585f = gVar;
        }

        /* renamed from: h */
        public void mo1154h(Parcelable parcelable) {
        }

        /* renamed from: j */
        public boolean mo1135j(C0359r rVar) {
            return false;
        }

        /* renamed from: k */
        public void mo1136k(boolean z) {
            if (this.f1586g != null) {
                C0335g gVar = this.f1585f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1585f.getItem(i) == this.f1586g) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1137n(this.f1585f, this.f1586g);
                }
            }
        }

        /* renamed from: l */
        public boolean mo1156l() {
            return false;
        }

        /* renamed from: m */
        public Parcelable mo1157m() {
            return null;
        }

        /* renamed from: n */
        public boolean mo1137n(C0335g gVar, C0339i iVar) {
            View view = Toolbar.this.f1569n;
            if (view instanceof C3157c) {
                ((C3157c) view).mo1401f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1569n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1568m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1569n = null;
            toolbar3.mo1831a();
            this.f1586g = null;
            Toolbar.this.requestLayout();
            iVar.mo1308r(false);
            return true;
        }

        /* renamed from: o */
        public boolean mo1138o(C0335g gVar, C0339i iVar) {
            Toolbar.this.mo1836g();
            ViewParent parent = Toolbar.this.f1568m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1568m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1568m);
            }
            Toolbar.this.f1569n = iVar.getActionView();
            this.f1586g = iVar;
            ViewParent parent2 = Toolbar.this.f1569n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1569n);
                }
                C0396e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f883a = 8388611 | (toolbar4.f1574s & 112);
                m.f1588b = 2;
                toolbar4.f1569n.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1569n);
            }
            Toolbar.this.mo1824G();
            Toolbar.this.requestLayout();
            iVar.mo1308r(true);
            View view = Toolbar.this.f1569n;
            if (view instanceof C3157c) {
                ((C3157c) view).mo1400c();
            }
            return true;
        }

        /* renamed from: p */
        public void mo1139p(C0350m.C0351a aVar) {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0396e extends C0259a.C0260a {

        /* renamed from: b */
        int f1588b = 0;

        public C0396e(int i, int i2) {
            super(i, i2);
            this.f883a = 8388627;
        }

        public C0396e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0396e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0396e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1918a(marginLayoutParams);
        }

        public C0396e(C0259a.C0260a aVar) {
            super(aVar);
        }

        public C0396e(C0396e eVar) {
            super((C0259a.C0260a) eVar);
            this.f1588b = eVar.f1588b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1918a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0397f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0398g extends C3430a {
        public static final Parcelable.Creator<C0398g> CREATOR = new C0399a();

        /* renamed from: h */
        int f1589h;

        /* renamed from: i */
        boolean f1590i;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        class C0399a implements Parcelable.ClassLoaderCreator<C0398g> {
            C0399a() {
            }

            /* renamed from: a */
            public C0398g createFromParcel(Parcel parcel) {
                return new C0398g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0398g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0398g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0398g[] newArray(int i) {
                return new C0398g[i];
            }
        }

        public C0398g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1589h = parcel.readInt();
            this.f1590i = parcel.readInt() != 0;
        }

        public C0398g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1589h);
            parcel.writeInt(this.f1590i ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1542B = 8388627;
        this.f1549I = new ArrayList<>();
        this.f1550J = new ArrayList<>();
        this.f1551K = new int[2];
        this.f1553M = new C0392a();
        this.f1560T = new C0393b();
        C0479u0 v = C0479u0.m2148v(getContext(), attributeSet, C3132j.Toolbar, i, 0);
        C3403t.m14639g0(this, context, C3132j.Toolbar, attributeSet, v.mo2360r(), i, 0);
        this.f1572q = v.mo2356n(C3132j.Toolbar_titleTextAppearance, 0);
        this.f1573r = v.mo2356n(C3132j.Toolbar_subtitleTextAppearance, 0);
        this.f1542B = v.mo2354l(C3132j.Toolbar_android_gravity, this.f1542B);
        this.f1574s = v.mo2354l(C3132j.Toolbar_buttonGravity, 48);
        int e = v.mo2347e(C3132j.Toolbar_titleMargin, 0);
        e = v.mo2361s(C3132j.Toolbar_titleMargins) ? v.mo2347e(C3132j.Toolbar_titleMargins, e) : e;
        this.f1579x = e;
        this.f1578w = e;
        this.f1577v = e;
        this.f1576u = e;
        int e2 = v.mo2347e(C3132j.Toolbar_titleMarginStart, -1);
        if (e2 >= 0) {
            this.f1576u = e2;
        }
        int e3 = v.mo2347e(C3132j.Toolbar_titleMarginEnd, -1);
        if (e3 >= 0) {
            this.f1577v = e3;
        }
        int e4 = v.mo2347e(C3132j.Toolbar_titleMarginTop, -1);
        if (e4 >= 0) {
            this.f1578w = e4;
        }
        int e5 = v.mo2347e(C3132j.Toolbar_titleMarginBottom, -1);
        if (e5 >= 0) {
            this.f1579x = e5;
        }
        this.f1575t = v.mo2348f(C3132j.Toolbar_maxButtonHeight, -1);
        int e6 = v.mo2347e(C3132j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int e7 = v.mo2347e(C3132j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int f = v.mo2348f(C3132j.Toolbar_contentInsetLeft, 0);
        int f2 = v.mo2348f(C3132j.Toolbar_contentInsetRight, 0);
        m1759h();
        this.f1580y.mo2265e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f1580y.mo2267g(e6, e7);
        }
        this.f1581z = v.mo2347e(C3132j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1541A = v.mo2347e(C3132j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1566k = v.mo2349g(C3132j.Toolbar_collapseIcon);
        this.f1567l = v.mo2358p(C3132j.Toolbar_collapseContentDescription);
        CharSequence p = v.mo2358p(C3132j.Toolbar_title);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo2358p(C3132j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1570o = getContext();
        setPopupTheme(v.mo2356n(C3132j.Toolbar_popupTheme, 0));
        Drawable g = v.mo2349g(C3132j.Toolbar_navigationIcon);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo2358p(C3132j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo2349g(C3132j.Toolbar_logo);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo2358p(C3132j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        if (v.mo2361s(C3132j.Toolbar_titleTextColor)) {
            setTitleTextColor(v.mo2345c(C3132j.Toolbar_titleTextColor));
        }
        if (v.mo2361s(C3132j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(v.mo2345c(C3132j.Toolbar_subtitleTextColor));
        }
        if (v.mo2361s(C3132j.Toolbar_menu)) {
            mo1914x(v.mo2356n(C3132j.Toolbar_menu, 0));
        }
        v.mo2362w();
    }

    /* renamed from: B */
    private int m1750B(View view, int i, int[] iArr, int i2) {
        C0396e eVar = (C0396e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m1765q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: C */
    private int m1751C(View view, int i, int[] iArr, int i2) {
        C0396e eVar = (C0396e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m1765q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: D */
    private int m1752D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m1753E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m1754F() {
        removeCallbacks(this.f1560T);
        post(this.f1560T);
    }

    /* renamed from: M */
    private boolean m1755M() {
        if (!this.f1559S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1756N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private boolean m1756N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1757b(List<View> list, int i) {
        boolean z = C3403t.m14674y(this) == 1;
        int childCount = getChildCount();
        int b = C3386d.m14544b(i, C3403t.m14674y(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0396e eVar = (C0396e) childAt.getLayoutParams();
                if (eVar.f1588b == 0 && m1756N(childAt) && m1764p(eVar.f883a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0396e eVar2 = (C0396e) childAt2.getLayoutParams();
            if (eVar2.f1588b == 0 && m1756N(childAt2) && m1764p(eVar2.f883a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1758c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0396e m = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0396e) layoutParams;
        m.f1588b = 1;
        if (!z || this.f1569n == null) {
            addView(view, m);
            return;
        }
        view.setLayoutParams(m);
        this.f1550J.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C3162g(getContext());
    }

    /* renamed from: h */
    private void m1759h() {
        if (this.f1580y == null) {
            this.f1580y = new C0458m0();
        }
    }

    /* renamed from: i */
    private void m1760i() {
        if (this.f1565j == null) {
            this.f1565j = new C0459n(getContext());
        }
    }

    /* renamed from: j */
    private void m1761j() {
        m1762k();
        if (this.f1561f.mo1579N() == null) {
            C0335g gVar = (C0335g) this.f1561f.getMenu();
            if (this.f1556P == null) {
                this.f1556P = new C0395d();
            }
            this.f1561f.setExpandedActionViewsExclusive(true);
            gVar.mo1231c(this.f1556P, this.f1570o);
        }
    }

    /* renamed from: k */
    private void m1762k() {
        if (this.f1561f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1561f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1571p);
            this.f1561f.setOnMenuItemClickListener(this.f1553M);
            this.f1561f.mo1580O(this.f1557Q, this.f1558R);
            C0396e m = generateDefaultLayoutParams();
            m.f883a = 8388613 | (this.f1574s & 112);
            this.f1561f.setLayoutParams(m);
            m1758c(this.f1561f, false);
        }
    }

    /* renamed from: l */
    private void m1763l() {
        if (this.f1564i == null) {
            this.f1564i = new C0455l(getContext(), (AttributeSet) null, C3123a.toolbarNavigationButtonStyle);
            C0396e m = generateDefaultLayoutParams();
            m.f883a = 8388611 | (this.f1574s & 112);
            this.f1564i.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m1764p(int i) {
        int y = C3403t.m14674y(this);
        int b = C3386d.m14544b(i, y) & 7;
        return (b == 1 || b == 3 || b == 5) ? b : y == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m1765q(View view, int i) {
        C0396e eVar = (C0396e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m1766r(eVar.f883a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m1766r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1542B & 112;
    }

    /* renamed from: s */
    private int m1767s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C3390g.m14555b(marginLayoutParams) + C3390g.m14554a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m1768t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m1769u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0396e eVar = (C0396e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m1770y(View view) {
        return view.getParent() == this || this.f1550J.contains(view);
    }

    /* renamed from: A */
    public boolean mo1823A() {
        ActionMenuView actionMenuView = this.f1561f;
        return actionMenuView != null && actionMenuView.mo1577J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo1824G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0396e) childAt.getLayoutParams()).f1588b == 2 || childAt == this.f1561f)) {
                removeViewAt(childCount);
                this.f1550J.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void mo1825H(int i, int i2) {
        m1759h();
        this.f1580y.mo2267g(i, i2);
    }

    /* renamed from: I */
    public void mo1826I(C0335g gVar, C0408c cVar) {
        if (gVar != null || this.f1561f != null) {
            m1762k();
            C0335g N = this.f1561f.mo1579N();
            if (N != gVar) {
                if (N != null) {
                    N.mo1209Q(this.f1555O);
                    N.mo1209Q(this.f1556P);
                }
                if (this.f1556P == null) {
                    this.f1556P = new C0395d();
                }
                cVar.mo1991J(true);
                if (gVar != null) {
                    gVar.mo1231c(cVar, this.f1570o);
                    gVar.mo1231c(this.f1556P, this.f1570o);
                } else {
                    cVar.mo1133g(this.f1570o, (C0335g) null);
                    this.f1556P.mo1133g(this.f1570o, (C0335g) null);
                    cVar.mo1136k(true);
                    this.f1556P.mo1136k(true);
                }
                this.f1561f.setPopupTheme(this.f1571p);
                this.f1561f.setPresenter(cVar);
                this.f1555O = cVar;
            }
        }
    }

    /* renamed from: J */
    public void mo1827J(C0350m.C0351a aVar, C0335g.C0336a aVar2) {
        this.f1557Q = aVar;
        this.f1558R = aVar2;
        ActionMenuView actionMenuView = this.f1561f;
        if (actionMenuView != null) {
            actionMenuView.mo1580O(aVar, aVar2);
        }
    }

    /* renamed from: K */
    public void mo1828K(Context context, int i) {
        this.f1573r = i;
        TextView textView = this.f1563h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: L */
    public void mo1829L(Context context, int i) {
        this.f1572q = i;
        TextView textView = this.f1562g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public boolean mo1830O() {
        ActionMenuView actionMenuView = this.f1561f;
        return actionMenuView != null && actionMenuView.mo1581P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1831a() {
        for (int size = this.f1550J.size() - 1; size >= 0; size--) {
            addView(this.f1550J.get(size));
        }
        this.f1550J.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0396e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1561f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1833d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1561f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1578K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1833d():boolean");
    }

    /* renamed from: e */
    public void mo1834e() {
        C0395d dVar = this.f1556P;
        C0339i iVar = dVar == null ? null : dVar.f1586g;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1835f() {
        ActionMenuView actionMenuView = this.f1561f;
        if (actionMenuView != null) {
            actionMenuView.mo1569B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1836g() {
        if (this.f1568m == null) {
            C0455l lVar = new C0455l(getContext(), (AttributeSet) null, C3123a.toolbarNavigationButtonStyle);
            this.f1568m = lVar;
            lVar.setImageDrawable(this.f1566k);
            this.f1568m.setContentDescription(this.f1567l);
            C0396e m = generateDefaultLayoutParams();
            m.f883a = 8388611 | (this.f1574s & 112);
            m.f1588b = 2;
            this.f1568m.setLayoutParams(m);
            this.f1568m.setOnClickListener(new C0394c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1568m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1568m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0458m0 m0Var = this.f1580y;
        if (m0Var != null) {
            return m0Var.mo2261a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1541A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0458m0 m0Var = this.f1580y;
        if (m0Var != null) {
            return m0Var.mo2262b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0458m0 m0Var = this.f1580y;
        if (m0Var != null) {
            return m0Var.mo2263c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0458m0 m0Var = this.f1580y;
        if (m0Var != null) {
            return m0Var.mo2264d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1581z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1579N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1561f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1579N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1541A
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C3403t.m14674y(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C3403t.m14674y(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1581z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1565j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1565j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1761j();
        return this.f1561f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1564i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1564i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0408c getOuterActionMenuPresenter() {
        return this.f1555O;
    }

    public Drawable getOverflowIcon() {
        m1761j();
        return this.f1561f.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1570o;
    }

    public int getPopupTheme() {
        return this.f1571p;
    }

    public CharSequence getSubtitle() {
        return this.f1544D;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1563h;
    }

    public CharSequence getTitle() {
        return this.f1543C;
    }

    public int getTitleMarginBottom() {
        return this.f1579x;
    }

    public int getTitleMarginEnd() {
        return this.f1577v;
    }

    public int getTitleMarginStart() {
        return this.f1576u;
    }

    public int getTitleMarginTop() {
        return this.f1578w;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1562g;
    }

    public C0406b0 getWrapper() {
        if (this.f1554N == null) {
            this.f1554N = new C0492v0(this, true);
        }
        return this.f1554N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0396e generateDefaultLayoutParams() {
        return new C0396e(-2, -2);
    }

    /* renamed from: n */
    public C0396e generateLayoutParams(AttributeSet attributeSet) {
        return new C0396e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0396e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0396e ? new C0396e((C0396e) layoutParams) : layoutParams instanceof C0259a.C0260a ? new C0396e((C0259a.C0260a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0396e((ViewGroup.MarginLayoutParams) layoutParams) : new C0396e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1560T);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1548H = false;
        }
        if (!this.f1548H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1548H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1548H = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0299 A[LOOP:0: B:106:0x0297->B:107:0x0299, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02bb A[LOOP:1: B:109:0x02b9->B:110:0x02bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f4 A[LOOP:2: B:117:0x02f2->B:118:0x02f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p086f.p111h.p122m.C3403t.m14674y(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1551K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p086f.p111h.p122m.C3403t.m14676z(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1564i
            boolean r13 = r0.m1756N(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f1564i
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m1751C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m1750B(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f1568m
            boolean r15 = r0.m1756N(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f1568m
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m1751C(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m1750B(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1561f
            boolean r15 = r0.m1756N(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1561f
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m1750B(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m1751C(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1569n
            boolean r13 = r0.m1756N(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f1569n
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m1751C(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m1750B(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f1565j
            boolean r13 = r0.m1756N(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f1565j
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m1751C(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m1750B(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f1562g
            boolean r13 = r0.m1756N(r13)
            android.widget.TextView r14 = r0.f1563h
            boolean r14 = r0.m1756N(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f1562g
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0396e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1562g
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f1563h
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0396e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1563h
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x028a
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f1562g
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f1563h
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f1563h
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f1562g
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0396e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0396e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f1562g
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f1563h
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f1542B
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1578w
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1579x
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1579x
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1578w
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021f
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f1576u
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f1562g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0396e) r1
            android.widget.TextView r2 = r0.f1562g
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1562g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1562g
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1577v
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0213
            android.widget.TextView r1 = r0.f1563h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0396e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1563h
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f1563h
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1563h
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f1577v
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0214
        L_0x0213:
            r3 = r10
        L_0x0214:
            if (r17 == 0) goto L_0x021b
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x021b:
            r2 = r24
            goto L_0x011e
        L_0x021f:
            if (r17 == 0) goto L_0x0225
            int r7 = r0.f1576u
            r1 = 0
            goto L_0x0227
        L_0x0225:
            r1 = 0
            r7 = 0
        L_0x0227:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025c
            android.widget.TextView r3 = r0.f1562g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0396e) r3
            android.widget.TextView r4 = r0.f1562g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1562g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1562g
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1577v
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025d
        L_0x025c:
            r4 = r2
        L_0x025d:
            if (r14 == 0) goto L_0x0283
            android.widget.TextView r3 = r0.f1563h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0396e) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f1563h
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f1563h
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f1563h
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.f1577v
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x0284
        L_0x0283:
            r5 = r2
        L_0x0284:
            if (r17 == 0) goto L_0x028a
            int r2 = java.lang.Math.max(r4, r5)
        L_0x028a:
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            r4 = 3
            r0.m1757b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            int r3 = r3.size()
            r7 = 0
        L_0x0297:
            if (r7 >= r3) goto L_0x02aa
            java.util.ArrayList<android.view.View> r4 = r0.f1549I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m1750B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0297
        L_0x02aa:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            r4 = 5
            r0.m1757b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            int r3 = r3.size()
            r7 = 0
        L_0x02b9:
            if (r7 >= r3) goto L_0x02ca
            java.util.ArrayList<android.view.View> r4 = r0.f1549I
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1751C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b9
        L_0x02ca:
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            r4 = 1
            r0.m1757b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            int r3 = r0.m1769u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e5
            goto L_0x02ec
        L_0x02e5:
            if (r3 <= r10) goto L_0x02eb
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02ec
        L_0x02eb:
            r2 = r6
        L_0x02ec:
            java.util.ArrayList<android.view.View> r3 = r0.f1549I
            int r3 = r3.size()
        L_0x02f2:
            if (r1 >= r3) goto L_0x0303
            java.util.ArrayList<android.view.View> r4 = r0.f1549I
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m1750B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f2
        L_0x0303:
            java.util.ArrayList<android.view.View> r1 = r0.f1549I
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1551K;
        int i10 = 0;
        if (C0404a1.m1828b(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m1756N(this.f1564i)) {
            m1753E(this.f1564i, i, 0, i2, 0, this.f1575t);
            i5 = this.f1564i.getMeasuredWidth() + m1767s(this.f1564i);
            i4 = Math.max(0, this.f1564i.getMeasuredHeight() + m1768t(this.f1564i));
            i3 = View.combineMeasuredStates(0, this.f1564i.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1756N(this.f1568m)) {
            m1753E(this.f1568m, i, 0, i2, 0, this.f1575t);
            i5 = this.f1568m.getMeasuredWidth() + m1767s(this.f1568m);
            i4 = Math.max(i4, this.f1568m.getMeasuredHeight() + m1768t(this.f1568m));
            i3 = View.combineMeasuredStates(i3, this.f1568m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m1756N(this.f1561f)) {
            m1753E(this.f1561f, i, max, i2, 0, this.f1575t);
            i6 = this.f1561f.getMeasuredWidth() + m1767s(this.f1561f);
            i4 = Math.max(i4, this.f1561f.getMeasuredHeight() + m1768t(this.f1561f));
            i3 = View.combineMeasuredStates(i3, this.f1561f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1756N(this.f1569n)) {
            max2 += m1752D(this.f1569n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1569n.getMeasuredHeight() + m1768t(this.f1569n));
            i3 = View.combineMeasuredStates(i3, this.f1569n.getMeasuredState());
        }
        if (m1756N(this.f1565j)) {
            max2 += m1752D(this.f1565j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1565j.getMeasuredHeight() + m1768t(this.f1565j));
            i3 = View.combineMeasuredStates(i3, this.f1565j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0396e) childAt.getLayoutParams()).f1588b == 0 && m1756N(childAt)) {
                max2 += m1752D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1768t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1578w + this.f1579x;
        int i13 = this.f1576u + this.f1577v;
        if (m1756N(this.f1562g)) {
            m1752D(this.f1562g, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1562g.getMeasuredWidth() + m1767s(this.f1562g);
            i7 = this.f1562g.getMeasuredHeight() + m1768t(this.f1562g);
            i9 = View.combineMeasuredStates(i3, this.f1562g.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1756N(this.f1563h)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m1752D(this.f1563h, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1563h.getMeasuredHeight() + m1768t(this.f1563h);
            i9 = View.combineMeasuredStates(i9, this.f1563h.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1755M()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0398g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0398g gVar = (C0398g) parcelable;
        super.onRestoreInstanceState(gVar.mo11760a());
        ActionMenuView actionMenuView = this.f1561f;
        C0335g N = actionMenuView != null ? actionMenuView.mo1579N() : null;
        int i = gVar.f1589h;
        if (!(i == 0 || this.f1556P == null || N == null || (findItem = N.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f1590i) {
            m1754F();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1759h();
        C0458m0 m0Var = this.f1580y;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        m0Var.mo2266f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0339i iVar;
        C0398g gVar = new C0398g(super.onSaveInstanceState());
        C0395d dVar = this.f1556P;
        if (!(dVar == null || (iVar = dVar.f1586g) == null)) {
            gVar.f1589h = iVar.getItemId();
        }
        gVar.f1590i = mo1823A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1547G = false;
        }
        if (!this.f1547G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1547G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1547G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1836g();
        }
        ImageButton imageButton = this.f1568m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C3133a.m13388d(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1836g();
            this.f1568m.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1568m;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1566k);
        }
    }

    public void setCollapsible(boolean z) {
        this.f1559S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1541A) {
            this.f1541A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1581z) {
            this.f1581z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C3133a.m13388d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1760i();
            if (!m1770y(this.f1565j)) {
                m1758c(this.f1565j, true);
            }
        } else {
            ImageView imageView = this.f1565j;
            if (imageView != null && m1770y(imageView)) {
                removeView(this.f1565j);
                this.f1550J.remove(this.f1565j);
            }
        }
        ImageView imageView2 = this.f1565j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1760i();
        }
        ImageView imageView = this.f1565j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1763l();
        }
        ImageButton imageButton = this.f1564i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C3133a.m13388d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1763l();
            if (!m1770y(this.f1564i)) {
                m1758c(this.f1564i, true);
            }
        } else {
            ImageButton imageButton = this.f1564i;
            if (imageButton != null && m1770y(imageButton)) {
                removeView(this.f1564i);
                this.f1550J.remove(this.f1564i);
            }
        }
        ImageButton imageButton2 = this.f1564i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1763l();
        this.f1564i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0397f fVar) {
        this.f1552L = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1761j();
        this.f1561f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1571p != i) {
            this.f1571p = i;
            if (i == 0) {
                this.f1570o = getContext();
            } else {
                this.f1570o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1563h == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1563h = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1563h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1573r;
                if (i != 0) {
                    this.f1563h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1546F;
                if (colorStateList != null) {
                    this.f1563h.setTextColor(colorStateList);
                }
            }
            if (!m1770y(this.f1563h)) {
                m1758c(this.f1563h, true);
            }
        } else {
            TextView textView = this.f1563h;
            if (textView != null && m1770y(textView)) {
                removeView(this.f1563h);
                this.f1550J.remove(this.f1563h);
            }
        }
        TextView textView2 = this.f1563h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1544D = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1546F = colorStateList;
        TextView textView = this.f1563h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1562g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1562g = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1562g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1572q;
                if (i != 0) {
                    this.f1562g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1545E;
                if (colorStateList != null) {
                    this.f1562g.setTextColor(colorStateList);
                }
            }
            if (!m1770y(this.f1562g)) {
                m1758c(this.f1562g, true);
            }
        } else {
            TextView textView = this.f1562g;
            if (textView != null && m1770y(textView)) {
                removeView(this.f1562g);
                this.f1550J.remove(this.f1562g);
            }
        }
        TextView textView2 = this.f1562g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1543C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1579x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1577v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1576u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1578w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1545E = colorStateList;
        TextView textView = this.f1562g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: v */
    public boolean mo1912v() {
        C0395d dVar = this.f1556P;
        return (dVar == null || dVar.f1586g == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1913w() {
        ActionMenuView actionMenuView = this.f1561f;
        return actionMenuView != null && actionMenuView.mo1575H();
    }

    /* renamed from: x */
    public void mo1914x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean mo1915z() {
        ActionMenuView actionMenuView = this.f1561f;
        return actionMenuView != null && actionMenuView.mo1576I();
    }
}
