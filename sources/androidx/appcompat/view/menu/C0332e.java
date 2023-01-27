package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0352n;
import java.util.ArrayList;
import p086f.p087a.C3129g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0332e implements C0350m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f1194f;

    /* renamed from: g */
    LayoutInflater f1195g;

    /* renamed from: h */
    C0335g f1196h;

    /* renamed from: i */
    ExpandedMenuView f1197i;

    /* renamed from: j */
    int f1198j;

    /* renamed from: k */
    int f1199k;

    /* renamed from: l */
    int f1200l;

    /* renamed from: m */
    private C0350m.C0351a f1201m;

    /* renamed from: n */
    C0333a f1202n;

    /* renamed from: o */
    private int f1203o;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0333a extends BaseAdapter {

        /* renamed from: f */
        private int f1204f = -1;

        public C0333a() {
            mo1179a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1179a() {
            C0339i x = C0332e.this.f1196h.mo1268x();
            if (x != null) {
                ArrayList<C0339i> B = C0332e.this.f1196h.mo1196B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f1204f = i;
                        return;
                    }
                }
            }
            this.f1204f = -1;
        }

        /* renamed from: b */
        public C0339i getItem(int i) {
            ArrayList<C0339i> B = C0332e.this.f1196h.mo1196B();
            int i2 = i + C0332e.this.f1198j;
            int i3 = this.f1204f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = C0332e.this.f1196h.mo1196B().size() - C0332e.this.f1198j;
            return this.f1204f < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0332e eVar = C0332e.this;
                view = eVar.f1195g.inflate(eVar.f1200l, viewGroup, false);
            }
            ((C0352n.C0353a) view).mo1034e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1179a();
            super.notifyDataSetChanged();
        }
    }

    public C0332e(int i, int i2) {
        this.f1200l = i;
        this.f1199k = i2;
    }

    public C0332e(Context context, int i) {
        this(i, 0);
        this.f1194f = context;
        this.f1195g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo1174a() {
        if (this.f1202n == null) {
            this.f1202n = new C0333a();
        }
        return this.f1202n;
    }

    /* renamed from: b */
    public void mo1128b(C0335g gVar, boolean z) {
        C0350m.C0351a aVar = this.f1201m;
        if (aVar != null) {
            aVar.mo930b(gVar, z);
        }
    }

    /* renamed from: c */
    public C0352n mo1175c(ViewGroup viewGroup) {
        if (this.f1197i == null) {
            this.f1197i = (ExpandedMenuView) this.f1195g.inflate(C3129g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1202n == null) {
                this.f1202n = new C0333a();
            }
            this.f1197i.setAdapter(this.f1202n);
            this.f1197i.setOnItemClickListener(this);
        }
        return this.f1197i;
    }

    /* renamed from: d */
    public void mo1176d(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1197i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: e */
    public void mo1177e(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1197i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: f */
    public int mo1132f() {
        return this.f1203o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1133g(android.content.Context r3, androidx.appcompat.view.menu.C0335g r4) {
        /*
            r2 = this;
            int r0 = r2.f1199k
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1199k
            r0.<init>(r3, r1)
            r2.f1194f = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f1195g = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f1194f
            if (r0 == 0) goto L_0x0023
            r2.f1194f = r3
            android.view.LayoutInflater r0 = r2.f1195g
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f1196h = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f1202n
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0332e.mo1133g(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: h */
    public void mo1154h(Parcelable parcelable) {
        mo1176d((Bundle) parcelable);
    }

    /* renamed from: j */
    public boolean mo1135j(C0359r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0338h(rVar).mo1272d((IBinder) null);
        C0350m.C0351a aVar = this.f1201m;
        if (aVar == null) {
            return true;
        }
        aVar.mo931c(rVar);
        return true;
    }

    /* renamed from: k */
    public void mo1136k(boolean z) {
        C0333a aVar = this.f1202n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public boolean mo1156l() {
        return false;
    }

    /* renamed from: m */
    public Parcelable mo1157m() {
        if (this.f1197i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1177e(bundle);
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

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1196h.mo1208O(this.f1202n.getItem(i), this, 0);
    }

    /* renamed from: p */
    public void mo1139p(C0350m.C0351a aVar) {
        this.f1201m = aVar;
    }
}
