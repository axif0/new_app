package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0352n;
import androidx.appcompat.view.menu.C0359r;
import androidx.recyclerview.widget.C0916o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p086f.p111h.p122m.C3356b0;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5002h;

/* renamed from: com.google.android.material.internal.h */
public class C2179h implements C0350m {

    /* renamed from: A */
    final View.OnClickListener f7246A = new C2180a();

    /* renamed from: f */
    private NavigationMenuView f7247f;

    /* renamed from: g */
    LinearLayout f7248g;

    /* renamed from: h */
    private C0350m.C0351a f7249h;

    /* renamed from: i */
    C0335g f7250i;

    /* renamed from: j */
    private int f7251j;

    /* renamed from: k */
    C2182c f7252k;

    /* renamed from: l */
    LayoutInflater f7253l;

    /* renamed from: m */
    int f7254m;

    /* renamed from: n */
    boolean f7255n;

    /* renamed from: o */
    ColorStateList f7256o;

    /* renamed from: p */
    ColorStateList f7257p;

    /* renamed from: q */
    Drawable f7258q;

    /* renamed from: r */
    int f7259r;

    /* renamed from: s */
    int f7260s;

    /* renamed from: t */
    int f7261t;

    /* renamed from: u */
    boolean f7262u;

    /* renamed from: v */
    boolean f7263v = true;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f7264w;

    /* renamed from: x */
    private int f7265x;

    /* renamed from: y */
    int f7266y;

    /* renamed from: z */
    private int f7267z = -1;

    /* renamed from: com.google.android.material.internal.h$a */
    class C2180a implements View.OnClickListener {
        C2180a() {
        }

        public void onClick(View view) {
            boolean z = true;
            C2179h.this.mo8549L(true);
            C0339i itemData = ((NavigationMenuItemView) view).getItemData();
            C2179h hVar = C2179h.this;
            boolean O = hVar.f7250i.mo1208O(itemData, hVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                C2179h.this.f7252k.mo8572K(itemData);
            }
            C2179h.this.mo8549L(false);
            if (z) {
                C2179h.this.mo1136k(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    private static class C2181b extends C2191l {
        public C2181b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.h$c */
    private class C2182c extends RecyclerView.C0832g<C2191l> {

        /* renamed from: h */
        private final ArrayList<C2184e> f7269h = new ArrayList<>();

        /* renamed from: i */
        private C0339i f7270i;

        /* renamed from: j */
        private boolean f7271j;

        C2182c() {
            m10245I();
        }

        /* renamed from: B */
        private void m10244B(int i, int i2) {
            while (i < i2) {
                ((C2186g) this.f7269h.get(i)).f7276b = true;
                i++;
            }
        }

        /* renamed from: I */
        private void m10245I() {
            if (!this.f7271j) {
                this.f7271j = true;
                this.f7269h.clear();
                this.f7269h.add(new C2183d());
                int i = -1;
                int size = C2179h.this.f7250i.mo1200G().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0339i iVar = C2179h.this.f7250i.mo1200G().get(i3);
                    if (iVar.isChecked()) {
                        mo8572K(iVar);
                    }
                    if (iVar.isCheckable()) {
                        iVar.mo1326t(false);
                    }
                    if (iVar.hasSubMenu()) {
                        SubMenu subMenu = iVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f7269h.add(new C2185f(C2179h.this.f7266y, 0));
                            }
                            this.f7269h.add(new C2186g(iVar));
                            int size2 = this.f7269h.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0339i iVar2 = (C0339i) subMenu.getItem(i4);
                                if (iVar2.isVisible()) {
                                    if (!z2 && iVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (iVar2.isCheckable()) {
                                        iVar2.mo1326t(false);
                                    }
                                    if (iVar.isChecked()) {
                                        mo8572K(iVar);
                                    }
                                    this.f7269h.add(new C2186g(iVar2));
                                }
                            }
                            if (z2) {
                                m10244B(size2, this.f7269h.size());
                            }
                        }
                    } else {
                        int groupId = iVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f7269h.size();
                            z = iVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<C2184e> arrayList = this.f7269h;
                                int i5 = C2179h.this.f7266y;
                                arrayList.add(new C2185f(i5, i5));
                            }
                        } else if (!z && iVar.getIcon() != null) {
                            m10244B(i2, this.f7269h.size());
                            z = true;
                        }
                        C2186g gVar = new C2186g(iVar);
                        gVar.f7276b = z;
                        this.f7269h.add(gVar);
                        i = groupId;
                    }
                }
                this.f7271j = false;
            }
        }

        /* renamed from: C */
        public Bundle mo8565C() {
            Bundle bundle = new Bundle();
            C0339i iVar = this.f7270i;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f7269h.size();
            for (int i = 0; i < size; i++) {
                C2184e eVar = this.f7269h.get(i);
                if (eVar instanceof C2186g) {
                    C0339i a = ((C2186g) eVar).mo8577a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        C2193j jVar = new C2193j();
                        actionView.saveHierarchyState(jVar);
                        sparseArray.put(a.getItemId(), jVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: D */
        public C0339i mo8566D() {
            return this.f7270i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo8567E() {
            int i = C2179h.this.f7248g.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C2179h.this.f7252k.mo3963e(); i2++) {
                if (C2179h.this.f7252k.mo3965g(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: F */
        public void mo3966q(C2191l lVar, int i) {
            int g = mo3965g(i);
            if (g == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f3359a;
                navigationMenuItemView.setIconTintList(C2179h.this.f7257p);
                C2179h hVar = C2179h.this;
                if (hVar.f7255n) {
                    navigationMenuItemView.setTextAppearance(hVar.f7254m);
                }
                ColorStateList colorStateList = C2179h.this.f7256o;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C2179h.this.f7258q;
                C3403t.m14649l0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C2186g gVar = (C2186g) this.f7269h.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f7276b);
                navigationMenuItemView.setHorizontalPadding(C2179h.this.f7259r);
                navigationMenuItemView.setIconPadding(C2179h.this.f7260s);
                C2179h hVar2 = C2179h.this;
                if (hVar2.f7262u) {
                    navigationMenuItemView.setIconSize(hVar2.f7261t);
                }
                navigationMenuItemView.setMaxLines(C2179h.this.f7264w);
                navigationMenuItemView.mo1034e(gVar.mo8577a(), 0);
            } else if (g == 1) {
                ((TextView) lVar.f3359a).setText(((C2186g) this.f7269h.get(i)).mo8577a().getTitle());
            } else if (g == 2) {
                C2185f fVar = (C2185f) this.f7269h.get(i);
                lVar.f3359a.setPadding(0, fVar.mo8576b(), 0, fVar.mo8575a());
            }
        }

        /* renamed from: G */
        public C2191l mo3967s(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C2179h hVar = C2179h.this;
                return new C2188i(hVar.f7253l, viewGroup, hVar.f7246A);
            } else if (i == 1) {
                return new C2190k(C2179h.this.f7253l, viewGroup);
            } else {
                if (i == 2) {
                    return new C2189j(C2179h.this.f7253l, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C2181b(C2179h.this.f7248g);
            }
        }

        /* renamed from: H */
        public void mo4372x(C2191l lVar) {
            if (lVar instanceof C2188i) {
                ((NavigationMenuItemView) lVar.f3359a).mo8476D();
            }
        }

        /* renamed from: J */
        public void mo8571J(Bundle bundle) {
            C0339i a;
            View actionView;
            C2193j jVar;
            C0339i a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f7271j = true;
                int size = this.f7269h.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C2184e eVar = this.f7269h.get(i2);
                    if ((eVar instanceof C2186g) && (a2 = ((C2186g) eVar).mo8577a()) != null && a2.getItemId() == i) {
                        mo8572K(a2);
                        break;
                    }
                    i2++;
                }
                this.f7271j = false;
                m10245I();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f7269h.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C2184e eVar2 = this.f7269h.get(i3);
                    if (!(!(eVar2 instanceof C2186g) || (a = ((C2186g) eVar2).mo8577a()) == null || (actionView = a.getActionView()) == null || (jVar = (C2193j) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(jVar);
                    }
                }
            }
        }

        /* renamed from: K */
        public void mo8572K(C0339i iVar) {
            if (this.f7270i != iVar && iVar.isCheckable()) {
                C0339i iVar2 = this.f7270i;
                if (iVar2 != null) {
                    iVar2.setChecked(false);
                }
                this.f7270i = iVar;
                iVar.setChecked(true);
            }
        }

        /* renamed from: L */
        public void mo8573L(boolean z) {
            this.f7271j = z;
        }

        /* renamed from: M */
        public void mo8574M() {
            m10245I();
            mo4360j();
        }

        /* renamed from: e */
        public int mo3963e() {
            return this.f7269h.size();
        }

        /* renamed from: f */
        public long mo3964f(int i) {
            return (long) i;
        }

        /* renamed from: g */
        public int mo3965g(int i) {
            C2184e eVar = this.f7269h.get(i);
            if (eVar instanceof C2185f) {
                return 2;
            }
            if (eVar instanceof C2183d) {
                return 3;
            }
            if (eVar instanceof C2186g) {
                return ((C2186g) eVar).mo8577a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* renamed from: com.google.android.material.internal.h$d */
    private static class C2183d implements C2184e {
        C2183d() {
        }
    }

    /* renamed from: com.google.android.material.internal.h$e */
    private interface C2184e {
    }

    /* renamed from: com.google.android.material.internal.h$f */
    private static class C2185f implements C2184e {

        /* renamed from: a */
        private final int f7273a;

        /* renamed from: b */
        private final int f7274b;

        public C2185f(int i, int i2) {
            this.f7273a = i;
            this.f7274b = i2;
        }

        /* renamed from: a */
        public int mo8575a() {
            return this.f7274b;
        }

        /* renamed from: b */
        public int mo8576b() {
            return this.f7273a;
        }
    }

    /* renamed from: com.google.android.material.internal.h$g */
    private static class C2186g implements C2184e {

        /* renamed from: a */
        private final C0339i f7275a;

        /* renamed from: b */
        boolean f7276b;

        C2186g(C0339i iVar) {
            this.f7275a = iVar;
        }

        /* renamed from: a */
        public C0339i mo8577a() {
            return this.f7275a;
        }
    }

    /* renamed from: com.google.android.material.internal.h$h */
    private class C2187h extends C0916o {
        C2187h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11625d0(C3369c.C3371b.m14525a(C2179h.this.f7252k.mo8567E(), 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.h$i */
    private static class C2188i extends C2191l {
        public C2188i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C5002h.design_navigation_item, viewGroup, false));
            this.f3359a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.h$j */
    private static class C2189j extends C2191l {
        public C2189j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C5002h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.h$k */
    private static class C2190k extends C2191l {
        public C2190k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C5002h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.h$l */
    private static abstract class C2191l extends RecyclerView.C0829d0 {
        public C2191l(View view) {
            super(view);
        }
    }

    /* renamed from: M */
    private void m10205M() {
        int i = (this.f7248g.getChildCount() != 0 || !this.f7263v) ? 0 : this.f7265x;
        NavigationMenuView navigationMenuView = this.f7247f;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void mo8538A(C0339i iVar) {
        this.f7252k.mo8572K(iVar);
    }

    /* renamed from: B */
    public void mo8539B(int i) {
        this.f7251j = i;
    }

    /* renamed from: C */
    public void mo8540C(Drawable drawable) {
        this.f7258q = drawable;
        mo1136k(false);
    }

    /* renamed from: D */
    public void mo8541D(int i) {
        this.f7259r = i;
        mo1136k(false);
    }

    /* renamed from: E */
    public void mo8542E(int i) {
        this.f7260s = i;
        mo1136k(false);
    }

    /* renamed from: F */
    public void mo8543F(int i) {
        if (this.f7261t != i) {
            this.f7261t = i;
            this.f7262u = true;
            mo1136k(false);
        }
    }

    /* renamed from: G */
    public void mo8544G(ColorStateList colorStateList) {
        this.f7257p = colorStateList;
        mo1136k(false);
    }

    /* renamed from: H */
    public void mo8545H(int i) {
        this.f7264w = i;
        mo1136k(false);
    }

    /* renamed from: I */
    public void mo8546I(int i) {
        this.f7254m = i;
        this.f7255n = true;
        mo1136k(false);
    }

    /* renamed from: J */
    public void mo8547J(ColorStateList colorStateList) {
        this.f7256o = colorStateList;
        mo1136k(false);
    }

    /* renamed from: K */
    public void mo8548K(int i) {
        this.f7267z = i;
        NavigationMenuView navigationMenuView = this.f7247f;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: L */
    public void mo8549L(boolean z) {
        C2182c cVar = this.f7252k;
        if (cVar != null) {
            cVar.mo8573L(z);
        }
    }

    /* renamed from: b */
    public void mo1128b(C0335g gVar, boolean z) {
        C0350m.C0351a aVar = this.f7249h;
        if (aVar != null) {
            aVar.mo930b(gVar, z);
        }
    }

    /* renamed from: c */
    public void mo8550c(View view) {
        this.f7248g.addView(view);
        NavigationMenuView navigationMenuView = this.f7247f;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: d */
    public void mo8551d(C3356b0 b0Var) {
        int h = b0Var.mo11565h();
        if (this.f7265x != h) {
            this.f7265x = h;
            m10205M();
        }
        NavigationMenuView navigationMenuView = this.f7247f;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, b0Var.mo11561e());
        C3403t.m14638g(this.f7248g, b0Var);
    }

    /* renamed from: e */
    public C0339i mo8552e() {
        return this.f7252k.mo8566D();
    }

    /* renamed from: f */
    public int mo1132f() {
        return this.f7251j;
    }

    /* renamed from: g */
    public void mo1133g(Context context, C0335g gVar) {
        this.f7253l = LayoutInflater.from(context);
        this.f7250i = gVar;
        this.f7266y = context.getResources().getDimensionPixelOffset(C4998d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: h */
    public void mo1154h(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f7247f.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f7252k.mo8571J(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f7248g.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: i */
    public int mo8553i() {
        return this.f7248g.getChildCount();
    }

    /* renamed from: j */
    public boolean mo1135j(C0359r rVar) {
        return false;
    }

    /* renamed from: k */
    public void mo1136k(boolean z) {
        C2182c cVar = this.f7252k;
        if (cVar != null) {
            cVar.mo8574M();
        }
    }

    /* renamed from: l */
    public boolean mo1156l() {
        return false;
    }

    /* renamed from: m */
    public Parcelable mo1157m() {
        Bundle bundle = new Bundle();
        if (this.f7247f != null) {
            SparseArray sparseArray = new SparseArray();
            this.f7247f.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C2182c cVar = this.f7252k;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.mo8565C());
        }
        if (this.f7248g != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f7248g.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: n */
    public boolean mo1137n(C0335g gVar, C0339i iVar) {
        return false;
    }

    /* renamed from: o */
    public boolean mo1138o(C0335g gVar, C0339i iVar) {
        return false;
    }

    /* renamed from: p */
    public void mo1139p(C0350m.C0351a aVar) {
        this.f7249h = aVar;
    }

    /* renamed from: q */
    public View mo8554q(int i) {
        return this.f7248g.getChildAt(i);
    }

    /* renamed from: r */
    public Drawable mo8555r() {
        return this.f7258q;
    }

    /* renamed from: s */
    public int mo8556s() {
        return this.f7259r;
    }

    /* renamed from: t */
    public int mo8557t() {
        return this.f7260s;
    }

    /* renamed from: u */
    public int mo8558u() {
        return this.f7264w;
    }

    /* renamed from: v */
    public ColorStateList mo8559v() {
        return this.f7256o;
    }

    /* renamed from: w */
    public ColorStateList mo8560w() {
        return this.f7257p;
    }

    /* renamed from: x */
    public C0352n mo8561x(ViewGroup viewGroup) {
        if (this.f7247f == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f7253l.inflate(C5002h.design_navigation_menu, viewGroup, false);
            this.f7247f = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C2187h(this.f7247f));
            if (this.f7252k == null) {
                this.f7252k = new C2182c();
            }
            int i = this.f7267z;
            if (i != -1) {
                this.f7247f.setOverScrollMode(i);
            }
            this.f7248g = (LinearLayout) this.f7253l.inflate(C5002h.design_navigation_item_header, this.f7247f, false);
            this.f7247f.setAdapter(this.f7252k);
        }
        return this.f7247f;
    }

    /* renamed from: y */
    public View mo8562y(int i) {
        View inflate = this.f7253l.inflate(i, this.f7248g, false);
        mo8550c(inflate);
        return inflate;
    }

    /* renamed from: z */
    public void mo8563z(boolean z) {
        if (this.f7263v != z) {
            this.f7263v = z;
            m10205M();
        }
    }
}
