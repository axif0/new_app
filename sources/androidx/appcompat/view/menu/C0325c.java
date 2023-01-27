package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p086f.p102e.C3203g;
import p086f.p111h.p115g.p116a.C3304b;
import p086f.p111h.p115g.p116a.C3305c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0325c {

    /* renamed from: a */
    final Context f1154a;

    /* renamed from: b */
    private C3203g<C3304b, MenuItem> f1155b;

    /* renamed from: c */
    private C3203g<C3305c, SubMenu> f1156c;

    C0325c(Context context) {
        this.f1154a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo1144c(MenuItem menuItem) {
        if (!(menuItem instanceof C3304b)) {
            return menuItem;
        }
        C3304b bVar = (C3304b) menuItem;
        if (this.f1155b == null) {
            this.f1155b = new C3203g<>();
        }
        MenuItem menuItem2 = this.f1155b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0341j jVar = new C0341j(this.f1154a, bVar);
        this.f1155b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo1145d(SubMenu subMenu) {
        if (!(subMenu instanceof C3305c)) {
            return subMenu;
        }
        C3305c cVar = (C3305c) subMenu;
        if (this.f1156c == null) {
            this.f1156c = new C3203g<>();
        }
        SubMenu subMenu2 = this.f1156c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0360s sVar = new C0360s(this.f1154a, cVar);
        this.f1156c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo1146e() {
        C3203g<C3304b, MenuItem> gVar = this.f1155b;
        if (gVar != null) {
            gVar.clear();
        }
        C3203g<C3305c, SubMenu> gVar2 = this.f1156c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo1147f(int i) {
        if (this.f1155b != null) {
            int i2 = 0;
            while (i2 < this.f1155b.size()) {
                if (this.f1155b.mo11139i(i2).getGroupId() == i) {
                    this.f1155b.mo5868k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo1148g(int i) {
        if (this.f1155b != null) {
            for (int i2 = 0; i2 < this.f1155b.size(); i2++) {
                if (this.f1155b.mo11139i(i2).getItemId() == i) {
                    this.f1155b.mo5868k(i2);
                    return;
                }
            }
        }
    }
}
