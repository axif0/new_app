package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0324b;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.C0348l;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.view.menu.C0355p;
import androidx.appcompat.view.menu.C0359r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0588a;
import java.util.ArrayList;
import p086f.p087a.C3123a;
import p086f.p087a.C3129g;
import p086f.p087a.p094o.C3154a;
import p086f.p111h.p122m.C3353b;

/* renamed from: androidx.appcompat.widget.c */
class C0408c extends C0324b implements C3353b.C3354a {

    /* renamed from: A */
    private int f1609A;

    /* renamed from: B */
    private final SparseBooleanArray f1610B = new SparseBooleanArray();

    /* renamed from: C */
    C0414e f1611C;

    /* renamed from: D */
    C0409a f1612D;

    /* renamed from: E */
    C0411c f1613E;

    /* renamed from: F */
    private C0410b f1614F;

    /* renamed from: G */
    final C0415f f1615G = new C0415f();

    /* renamed from: H */
    int f1616H;

    /* renamed from: o */
    C0412d f1617o;

    /* renamed from: p */
    private Drawable f1618p;

    /* renamed from: q */
    private boolean f1619q;

    /* renamed from: r */
    private boolean f1620r;

    /* renamed from: s */
    private boolean f1621s;

    /* renamed from: t */
    private int f1622t;

    /* renamed from: u */
    private int f1623u;

    /* renamed from: v */
    private int f1624v;

    /* renamed from: w */
    private boolean f1625w;

    /* renamed from: x */
    private boolean f1626x;

    /* renamed from: y */
    private boolean f1627y;

    /* renamed from: z */
    private boolean f1628z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class C0409a extends C0348l {
        public C0409a(Context context, C0359r rVar, View view) {
            super(context, rVar, view, false, C3123a.actionOverflowMenuStyle);
            if (!((C0339i) rVar.getItem()).mo1302l()) {
                View view2 = C0408c.this.f1617o;
                mo1412f(view2 == null ? (View) C0408c.this.f1152m : view2);
            }
            mo1416j(C0408c.this.f1615G);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1411e() {
            C0408c cVar = C0408c.this;
            cVar.f1612D = null;
            cVar.f1616H = 0;
            super.mo1411e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0410b extends ActionMenuItemView.C0322b {
        C0410b() {
        }

        /* renamed from: a */
        public C0355p mo1052a() {
            C0409a aVar = C0408c.this.f1612D;
            if (aVar != null) {
                return aVar.mo1409c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class C0411c implements Runnable {

        /* renamed from: f */
        private C0414e f1631f;

        public C0411c(C0414e eVar) {
            this.f1631f = eVar;
        }

        public void run() {
            if (C0408c.this.f1147h != null) {
                C0408c.this.f1147h.mo1236d();
            }
            View view = (View) C0408c.this.f1152m;
            if (!(view == null || view.getWindowToken() == null || !this.f1631f.mo1418m())) {
                C0408c.this.f1611C = this.f1631f;
            }
            C0408c.this.f1613E = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class C0412d extends C0459n implements ActionMenuView.C0367a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0413a extends C0427f0 {
            C0413a(View view, C0408c cVar) {
                super(view);
            }

            /* renamed from: b */
            public C0355p mo1050b() {
                C0414e eVar = C0408c.this.f1611C;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1409c();
            }

            /* renamed from: c */
            public boolean mo1051c() {
                C0408c.this.mo1995N();
                return true;
            }

            /* renamed from: d */
            public boolean mo1999d() {
                C0408c cVar = C0408c.this;
                if (cVar.f1613E != null) {
                    return false;
                }
                cVar.mo1986E();
                return true;
            }
        }

        public C0412d(Context context) {
            super(context, (AttributeSet) null, C3123a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0496w0.m2250a(this, getContentDescription());
            setOnTouchListener(new C0413a(this, C0408c.this));
        }

        /* renamed from: a */
        public boolean mo1031a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1032b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0408c.this.mo1995N();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0588a.m2769l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class C0414e extends C0348l {
        public C0414e(Context context, C0335g gVar, View view, boolean z) {
            super(context, gVar, view, z, C3123a.actionOverflowMenuStyle);
            mo1414h(8388613);
            mo1416j(C0408c.this.f1615G);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1411e() {
            if (C0408c.this.f1147h != null) {
                C0408c.this.f1147h.close();
            }
            C0408c.this.f1611C = null;
            super.mo1411e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0415f implements C0350m.C0351a {
        C0415f() {
        }

        /* renamed from: b */
        public void mo930b(C0335g gVar, boolean z) {
            if (gVar instanceof C0359r) {
                gVar.mo1199F().mo1238e(false);
            }
            C0350m.C0351a i = C0408c.this.mo1134i();
            if (i != null) {
                i.mo930b(gVar, z);
            }
        }

        /* renamed from: c */
        public boolean mo931c(C0335g gVar) {
            if (gVar == C0408c.this.f1147h) {
                return false;
            }
            C0408c.this.f1616H = ((C0359r) gVar).getItem().getItemId();
            C0350m.C0351a i = C0408c.this.mo1134i();
            if (i != null) {
                return i.mo931c(gVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    private static class C0416g implements Parcelable {
        public static final Parcelable.Creator<C0416g> CREATOR = new C0417a();

        /* renamed from: f */
        public int f1637f;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        class C0417a implements Parcelable.Creator<C0416g> {
            C0417a() {
            }

            /* renamed from: a */
            public C0416g createFromParcel(Parcel parcel) {
                return new C0416g(parcel);
            }

            /* renamed from: b */
            public C0416g[] newArray(int i) {
                return new C0416g[i];
            }
        }

        C0416g() {
        }

        C0416g(Parcel parcel) {
            this.f1637f = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1637f);
        }
    }

    public C0408c(Context context) {
        super(context, C3129g.abc_action_menu_layout, C3129g.abc_action_menu_item_layout);
    }

    /* renamed from: C */
    private View m1858C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1152m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0352n.C0353a) && ((C0352n.C0353a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1984B() {
        return mo1986E() | mo1987F();
    }

    /* renamed from: D */
    public Drawable mo1985D() {
        C0412d dVar = this.f1617o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1619q) {
            return this.f1618p;
        }
        return null;
    }

    /* renamed from: E */
    public boolean mo1986E() {
        C0352n nVar;
        C0411c cVar = this.f1613E;
        if (cVar == null || (nVar = this.f1152m) == null) {
            C0414e eVar = this.f1611C;
            if (eVar == null) {
                return false;
            }
            eVar.mo1408b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f1613E = null;
        return true;
    }

    /* renamed from: F */
    public boolean mo1987F() {
        C0409a aVar = this.f1612D;
        if (aVar == null) {
            return false;
        }
        aVar.mo1408b();
        return true;
    }

    /* renamed from: G */
    public boolean mo1988G() {
        return this.f1613E != null || mo1989H();
    }

    /* renamed from: H */
    public boolean mo1989H() {
        C0414e eVar = this.f1611C;
        return eVar != null && eVar.mo1410d();
    }

    /* renamed from: I */
    public void mo1990I(Configuration configuration) {
        if (!this.f1625w) {
            this.f1624v = C3154a.m13480b(this.f1146g).mo10904d();
        }
        C0335g gVar = this.f1147h;
        if (gVar != null) {
            gVar.mo1206M(true);
        }
    }

    /* renamed from: J */
    public void mo1991J(boolean z) {
        this.f1628z = z;
    }

    /* renamed from: K */
    public void mo1992K(ActionMenuView actionMenuView) {
        this.f1152m = actionMenuView;
        actionMenuView.mo1054b(this.f1147h);
    }

    /* renamed from: L */
    public void mo1993L(Drawable drawable) {
        C0412d dVar = this.f1617o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1619q = true;
        this.f1618p = drawable;
    }

    /* renamed from: M */
    public void mo1994M(boolean z) {
        this.f1620r = z;
        this.f1621s = true;
    }

    /* renamed from: N */
    public boolean mo1995N() {
        C0335g gVar;
        if (!this.f1620r || mo1989H() || (gVar = this.f1147h) == null || this.f1152m == null || this.f1613E != null || gVar.mo1196B().isEmpty()) {
            return false;
        }
        C0411c cVar = new C0411c(new C0414e(this.f1146g, this.f1147h, this.f1617o, true));
        this.f1613E = cVar;
        ((View) this.f1152m).post(cVar);
        return true;
    }

    /* renamed from: b */
    public void mo1128b(C0335g gVar, boolean z) {
        mo1984B();
        super.mo1128b(gVar, z);
    }

    /* renamed from: c */
    public void mo1129c(C0339i iVar, C0352n.C0353a aVar) {
        aVar.mo1034e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1152m);
        if (this.f1614F == null) {
            this.f1614F = new C0410b();
        }
        actionMenuItemView.setPopupCallback(this.f1614F);
    }

    /* renamed from: e */
    public boolean mo1131e(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1617o) {
            return false;
        }
        return super.mo1131e(viewGroup, i);
    }

    /* renamed from: g */
    public void mo1133g(Context context, C0335g gVar) {
        super.mo1133g(context, gVar);
        Resources resources = context.getResources();
        C3154a b = C3154a.m13480b(context);
        if (!this.f1621s) {
            this.f1620r = b.mo10908h();
        }
        if (!this.f1627y) {
            this.f1622t = b.mo10903c();
        }
        if (!this.f1625w) {
            this.f1624v = b.mo10904d();
        }
        int i = this.f1622t;
        if (this.f1620r) {
            if (this.f1617o == null) {
                C0412d dVar = new C0412d(this.f1145f);
                this.f1617o = dVar;
                if (this.f1619q) {
                    dVar.setImageDrawable(this.f1618p);
                    this.f1618p = null;
                    this.f1619q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1617o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1617o.getMeasuredWidth();
        } else {
            this.f1617o = null;
        }
        this.f1623u = i;
        this.f1609A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: h */
    public void mo1154h(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0416g) && (i = ((C0416g) parcelable).f1637f) > 0 && (findItem = this.f1147h.findItem(i)) != null) {
            mo1135j((C0359r) findItem.getSubMenu());
        }
    }

    /* renamed from: j */
    public boolean mo1135j(C0359r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0359r rVar2 = rVar;
        while (rVar2.mo1451i0() != this.f1147h) {
            rVar2 = (C0359r) rVar2.mo1451i0();
        }
        View C = m1858C(rVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f1616H = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0409a aVar = new C0409a(this.f1146g, rVar, C);
        this.f1612D = aVar;
        aVar.mo1413g(z);
        this.f1612D.mo1417k();
        super.mo1135j(rVar);
        return true;
    }

    /* renamed from: k */
    public void mo1136k(boolean z) {
        C0352n nVar;
        super.mo1136k(z);
        ((View) this.f1152m).requestLayout();
        C0335g gVar = this.f1147h;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0339i> u = gVar.mo1265u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                C3353b b = u.get(i).mo1069b();
                if (b != null) {
                    b.mo11556i(this);
                }
            }
        }
        C0335g gVar2 = this.f1147h;
        ArrayList<C0339i> B = gVar2 != null ? gVar2.mo1196B() : null;
        if (this.f1620r && B != null) {
            int size2 = B.size();
            if (size2 == 1) {
                z2 = !B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0412d dVar = this.f1617o;
        if (z2) {
            if (dVar == null) {
                this.f1617o = new C0412d(this.f1145f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1617o.getParent();
            if (viewGroup != this.f1152m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1617o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1152m;
                actionMenuView.addView(this.f1617o, actionMenuView.mo1573F());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f1152m)) {
            ((ViewGroup) nVar).removeView(this.f1617o);
        }
        ((ActionMenuView) this.f1152m).setOverflowReserved(this.f1620r);
    }

    /* renamed from: l */
    public boolean mo1156l() {
        int i;
        ArrayList<C0339i> arrayList;
        int i2;
        int i3;
        int i4;
        C0408c cVar = this;
        C0335g gVar = cVar.f1147h;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo1200G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f1624v;
        int i7 = cVar.f1623u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1152m;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0339i iVar = arrayList.get(i10);
            if (iVar.mo1305o()) {
                i8++;
            } else if (iVar.mo1304n()) {
                i9++;
            } else {
                z = true;
            }
            if (cVar.f1628z && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f1620r && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.f1610B;
        sparseBooleanArray.clear();
        if (cVar.f1626x) {
            int i12 = cVar.f1609A;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0339i iVar2 = arrayList.get(i13);
            if (iVar2.mo1305o()) {
                View q = cVar.mo1140q(iVar2, view, viewGroup);
                if (cVar.f1626x) {
                    i2 -= ActionMenuView.m1648L(q, i3, i2, makeMeasureSpec, i5);
                } else {
                    q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = q.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo1328u(true);
                i4 = i;
            } else if (iVar2.mo1304n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!cVar.f1626x || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View q2 = cVar.mo1140q(iVar2, (View) null, viewGroup);
                    if (cVar.f1626x) {
                        int L = ActionMenuView.m1648L(q2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = q2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.f1626x ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0339i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo1302l()) {
                                i11++;
                            }
                            iVar3.mo1328u(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo1328u(z3);
            } else {
                i4 = i;
                iVar2.mo1328u(false);
                i13++;
                view = null;
                cVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            cVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: m */
    public Parcelable mo1157m() {
        C0416g gVar = new C0416g();
        gVar.f1637f = this.f1616H;
        return gVar;
    }

    /* renamed from: q */
    public View mo1140q(C0339i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo1300j()) {
            actionView = super.mo1140q(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1593o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: r */
    public C0352n mo1141r(ViewGroup viewGroup) {
        C0352n nVar = this.f1152m;
        C0352n r = super.mo1141r(viewGroup);
        if (nVar != r) {
            ((ActionMenuView) r).setPresenter(this);
        }
        return r;
    }

    /* renamed from: t */
    public boolean mo1143t(int i, C0339i iVar) {
        return iVar.mo1302l();
    }
}
