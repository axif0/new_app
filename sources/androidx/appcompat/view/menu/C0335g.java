package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p115g.p116a.C3303a;
import p086f.p111h.p122m.C3415u;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0335g implements C3303a {

    /* renamed from: A */
    private static final int[] f1212A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1213a;

    /* renamed from: b */
    private final Resources f1214b;

    /* renamed from: c */
    private boolean f1215c;

    /* renamed from: d */
    private boolean f1216d;

    /* renamed from: e */
    private C0336a f1217e;

    /* renamed from: f */
    private ArrayList<C0339i> f1218f;

    /* renamed from: g */
    private ArrayList<C0339i> f1219g;

    /* renamed from: h */
    private boolean f1220h;

    /* renamed from: i */
    private ArrayList<C0339i> f1221i;

    /* renamed from: j */
    private ArrayList<C0339i> f1222j;

    /* renamed from: k */
    private boolean f1223k;

    /* renamed from: l */
    private int f1224l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1225m;

    /* renamed from: n */
    CharSequence f1226n;

    /* renamed from: o */
    Drawable f1227o;

    /* renamed from: p */
    View f1228p;

    /* renamed from: q */
    private boolean f1229q = false;

    /* renamed from: r */
    private boolean f1230r = false;

    /* renamed from: s */
    private boolean f1231s = false;

    /* renamed from: t */
    private boolean f1232t = false;

    /* renamed from: u */
    private boolean f1233u = false;

    /* renamed from: v */
    private ArrayList<C0339i> f1234v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0350m>> f1235w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0339i f1236x;

    /* renamed from: y */
    private boolean f1237y = false;

    /* renamed from: z */
    private boolean f1238z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface C0336a {
        /* renamed from: a */
        boolean mo904a(C0335g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo906b(C0335g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface C0337b {
        /* renamed from: a */
        boolean mo1053a(C0339i iVar);
    }

    public C0335g(Context context) {
        this.f1213a = context;
        this.f1214b = context.getResources();
        this.f1218f = new ArrayList<>();
        this.f1219g = new ArrayList<>();
        this.f1220h = true;
        this.f1221i = new ArrayList<>();
        this.f1222j = new ArrayList<>();
        this.f1223k = true;
        m1422f0(true);
    }

    /* renamed from: D */
    private static int m1419D(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1212A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m1420P(int i, boolean z) {
        if (i >= 0 && i < this.f1218f.size()) {
            this.f1218f.remove(i);
            if (z) {
                mo1206M(true);
            }
        }
    }

    /* renamed from: a0 */
    private void m1421a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = mo1198E();
        if (view != null) {
            this.f1228p = view;
            this.f1226n = null;
            this.f1227o = null;
        } else {
            if (i > 0) {
                this.f1226n = E.getText(i);
            } else if (charSequence != null) {
                this.f1226n = charSequence;
            }
            if (i2 > 0) {
                this.f1227o = C3267a.m14076f(mo1267w(), i2);
            } else if (drawable != null) {
                this.f1227o = drawable;
            }
            this.f1228p = null;
        }
        mo1206M(false);
    }

    /* renamed from: f0 */
    private void m1422f0(boolean z) {
        boolean z2 = true;
        if (!z || this.f1214b.getConfiguration().keyboard == 1 || !C3415u.m14721e(ViewConfiguration.get(this.f1213a), this.f1213a)) {
            z2 = false;
        }
        this.f1216d = z2;
    }

    /* renamed from: g */
    private C0339i m1423g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0339i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m1424i(boolean z) {
        if (!this.f1235w.isEmpty()) {
            mo1245h0();
            Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0350m mVar = (C0350m) next.get();
                if (mVar == null) {
                    this.f1235w.remove(next);
                } else {
                    mVar.mo1136k(z);
                }
            }
            mo1242g0();
        }
    }

    /* renamed from: j */
    private void m1425j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1235w.isEmpty()) {
            Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0350m mVar = (C0350m) next.get();
                if (mVar == null) {
                    this.f1235w.remove(next);
                } else {
                    int f = mVar.mo1132f();
                    if (f > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(f)) != null) {
                        mVar.mo1154h(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m1426k(Bundle bundle) {
        Parcelable m;
        if (!this.f1235w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0350m mVar = (C0350m) next.get();
                if (mVar == null) {
                    this.f1235w.remove(next);
                } else {
                    int f = mVar.mo1132f();
                    if (f > 0 && (m = mVar.mo1157m()) != null) {
                        sparseArray.put(f, m);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: l */
    private boolean m1427l(C0359r rVar, C0350m mVar) {
        boolean z = false;
        if (this.f1235w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo1135j(rVar);
        }
        Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0350m mVar2 = (C0350m) next.get();
            if (mVar2 == null) {
                this.f1235w.remove(next);
            } else if (!z) {
                z = mVar2.mo1135j(rVar);
            }
        }
        return z;
    }

    /* renamed from: p */
    private static int m1428p(ArrayList<C0339i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo1279f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View mo1195A() {
        return this.f1228p;
    }

    /* renamed from: B */
    public ArrayList<C0339i> mo1196B() {
        mo1264t();
        return this.f1222j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo1197C() {
        return this.f1232t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public Resources mo1198E() {
        return this.f1214b;
    }

    /* renamed from: F */
    public C0335g mo1199F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0339i> mo1200G() {
        if (!this.f1220h) {
            return this.f1219g;
        }
        this.f1219g.clear();
        int size = this.f1218f.size();
        for (int i = 0; i < size; i++) {
            C0339i iVar = this.f1218f.get(i);
            if (iVar.isVisible()) {
                this.f1219g.add(iVar);
            }
        }
        this.f1220h = false;
        this.f1223k = true;
        return this.f1219g;
    }

    /* renamed from: H */
    public boolean mo1201H() {
        return this.f1237y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo1202I() {
        return this.f1215c;
    }

    /* renamed from: J */
    public boolean mo1203J() {
        return this.f1216d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo1204K(C0339i iVar) {
        this.f1223k = true;
        mo1206M(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo1205L(C0339i iVar) {
        this.f1220h = true;
        mo1206M(true);
    }

    /* renamed from: M */
    public void mo1206M(boolean z) {
        if (!this.f1229q) {
            if (z) {
                this.f1220h = true;
                this.f1223k = true;
            }
            m1424i(z);
            return;
        }
        this.f1230r = true;
        if (z) {
            this.f1231s = true;
        }
    }

    /* renamed from: N */
    public boolean mo1207N(MenuItem menuItem, int i) {
        return mo1208O(menuItem, (C0350m) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1208O(android.view.MenuItem r7, androidx.appcompat.view.menu.C0350m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C0339i) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo1301k()
            f.h.m.b r2 = r7.mo1069b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo1390a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo1300j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo1238e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo1238e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.mo1267w()
            r9.<init>(r0, r6, r7)
            r7.mo1331x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.C0359r) r7
            if (r4 == 0) goto L_0x0063
            r2.mo1393f(r7)
        L_0x0063:
            boolean r7 = r6.m1427l(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0335g.mo1208O(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: Q */
    public void mo1209Q(C0350m mVar) {
        Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0350m mVar2 = (C0350m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f1235w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void mo1210R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1266v());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0359r) item.getSubMenu()).mo1210R(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: S */
    public void mo1211S(Bundle bundle) {
        m1425j(bundle);
    }

    /* renamed from: T */
    public void mo1212T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0359r) item.getSubMenu()).mo1212T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1266v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void mo1213U(Bundle bundle) {
        m1426k(bundle);
    }

    /* renamed from: V */
    public void mo1214V(C0336a aVar) {
        this.f1217e = aVar;
    }

    /* renamed from: W */
    public C0335g mo1215W(int i) {
        this.f1224l = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo1216X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1218f.size();
        mo1245h0();
        for (int i = 0; i < size; i++) {
            C0339i iVar = this.f1218f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo1303m() && iVar.isCheckable()) {
                iVar.mo1309s(iVar == menuItem);
            }
        }
        mo1242g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0335g mo1217Y(int i) {
        m1421a0(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0335g mo1218Z(Drawable drawable) {
        m1421a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1219a(int i, int i2, int i3, CharSequence charSequence) {
        int D = m1419D(i3);
        C0339i g = m1423g(i, i2, i3, D, charSequence, this.f1224l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1225m;
        if (contextMenuInfo != null) {
            g.mo1329v(contextMenuInfo);
        }
        ArrayList<C0339i> arrayList = this.f1218f;
        arrayList.add(m1428p(arrayList, D), g);
        mo1206M(true);
        return g;
    }

    public MenuItem add(int i) {
        return mo1219a(0, 0, 0, this.f1214b.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1219a(i, i2, i3, this.f1214b.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1219a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1219a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1213a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1214b.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1214b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0339i iVar = (C0339i) mo1219a(i, i2, i3, charSequence);
        C0359r rVar = new C0359r(this.f1213a, this, iVar);
        iVar.mo1331x(rVar);
        return rVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1229b(C0350m mVar) {
        mo1231c(mVar, this.f1213a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0335g mo1230b0(int i) {
        m1421a0(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public void mo1231c(C0350m mVar, Context context) {
        this.f1235w.add(new WeakReference(mVar));
        mVar.mo1133g(context, this);
        this.f1223k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0335g mo1232c0(CharSequence charSequence) {
        m1421a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        C0339i iVar = this.f1236x;
        if (iVar != null) {
            mo1240f(iVar);
        }
        this.f1218f.clear();
        mo1206M(true);
    }

    public void clearHeader() {
        this.f1227o = null;
        this.f1226n = null;
        this.f1228p = null;
        mo1206M(false);
    }

    public void close() {
        mo1238e(true);
    }

    /* renamed from: d */
    public void mo1236d() {
        C0336a aVar = this.f1217e;
        if (aVar != null) {
            aVar.mo906b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0335g mo1237d0(View view) {
        m1421a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: e */
    public final void mo1238e(boolean z) {
        if (!this.f1233u) {
            this.f1233u = true;
            Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0350m mVar = (C0350m) next.get();
                if (mVar == null) {
                    this.f1235w.remove(next);
                } else {
                    mVar.mo1128b(this, z);
                }
            }
            this.f1233u = false;
        }
    }

    /* renamed from: e0 */
    public void mo1239e0(boolean z) {
        this.f1238z = z;
    }

    /* renamed from: f */
    public boolean mo1240f(C0339i iVar) {
        boolean z = false;
        if (!this.f1235w.isEmpty() && this.f1236x == iVar) {
            mo1245h0();
            Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0350m mVar = (C0350m) next.get();
                if (mVar == null) {
                    this.f1235w.remove(next);
                } else {
                    z = mVar.mo1137n(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1242g0();
            if (z) {
                this.f1236x = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0339i iVar = this.f1218f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void mo1242g0() {
        this.f1229q = false;
        if (this.f1230r) {
            this.f1230r = false;
            mo1206M(this.f1231s);
        }
    }

    public MenuItem getItem(int i) {
        return this.f1218f.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1244h(C0335g gVar, MenuItem menuItem) {
        C0336a aVar = this.f1217e;
        return aVar != null && aVar.mo904a(gVar, menuItem);
    }

    /* renamed from: h0 */
    public void mo1245h0() {
        if (!this.f1229q) {
            this.f1229q = true;
            this.f1230r = false;
            this.f1231s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1238z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1218f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1254r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo1248m(C0339i iVar) {
        boolean z = false;
        if (this.f1235w.isEmpty()) {
            return false;
        }
        mo1245h0();
        Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0350m mVar = (C0350m) next.get();
            if (mVar == null) {
                this.f1235w.remove(next);
            } else {
                z = mVar.mo1138o(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo1242g0();
        if (z) {
            this.f1236x = iVar;
        }
        return z;
    }

    /* renamed from: n */
    public int mo1249n(int i) {
        return mo1250o(i, 0);
    }

    /* renamed from: o */
    public int mo1250o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1218f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1207N(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0339i r = mo1254r(i, keyEvent);
        boolean N = r != null ? mo1207N(r, i2) : false;
        if ((i2 & 2) != 0) {
            mo1238e(true);
        }
        return N;
    }

    /* renamed from: q */
    public int mo1253q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1218f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0339i mo1254r(int i, KeyEvent keyEvent) {
        ArrayList<C0339i> arrayList = this.f1234v;
        arrayList.clear();
        mo1257s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = mo1202I();
        for (int i2 = 0; i2 < size; i2++) {
            C0339i iVar = arrayList.get(i2);
            char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (I && alphabeticShortcut == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int n = mo1249n(i);
        if (n >= 0) {
            int size = this.f1218f.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1218f.get(n).getGroupId() != i) {
                    mo1206M(true);
                } else {
                    m1420P(n, false);
                    i2 = i3;
                }
            }
            mo1206M(true);
        }
    }

    public void removeItem(int i) {
        m1420P(mo1253q(i), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1257s(List<C0339i> list, int i, KeyEvent keyEvent) {
        boolean I = mo1202I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1218f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0339i iVar = this.f1218f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0335g) iVar.getSubMenu()).mo1257s(list, i, keyEvent);
                }
                char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1218f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0339i iVar = this.f1218f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo1326t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1237y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1218f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0339i iVar = this.f1218f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1218f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0339i iVar = this.f1218f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo1332y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1206M(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1215c = z;
        mo1206M(false);
    }

    public int size() {
        return this.f1218f.size();
    }

    /* renamed from: t */
    public void mo1264t() {
        ArrayList<C0339i> G = mo1200G();
        if (this.f1223k) {
            Iterator<WeakReference<C0350m>> it = this.f1235w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0350m mVar = (C0350m) next.get();
                if (mVar == null) {
                    this.f1235w.remove(next);
                } else {
                    z |= mVar.mo1156l();
                }
            }
            if (z) {
                this.f1221i.clear();
                this.f1222j.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    C0339i iVar = G.get(i);
                    (iVar.mo1302l() ? this.f1221i : this.f1222j).add(iVar);
                }
            } else {
                this.f1221i.clear();
                this.f1222j.clear();
                this.f1222j.addAll(mo1200G());
            }
            this.f1223k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0339i> mo1265u() {
        mo1264t();
        return this.f1221i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo1266v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context mo1267w() {
        return this.f1213a;
    }

    /* renamed from: x */
    public C0339i mo1268x() {
        return this.f1236x;
    }

    /* renamed from: y */
    public Drawable mo1269y() {
        return this.f1227o;
    }

    /* renamed from: z */
    public CharSequence mo1270z() {
        return this.f1226n;
    }
}
