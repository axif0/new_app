package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0335g;

/* renamed from: androidx.appcompat.view.menu.r */
public class C0359r extends C0335g implements SubMenu {

    /* renamed from: B */
    private C0335g f1323B;

    /* renamed from: C */
    private C0339i f1324C;

    public C0359r(Context context, C0335g gVar, C0339i iVar) {
        super(context);
        this.f1323B = gVar;
        this.f1324C = iVar;
    }

    /* renamed from: F */
    public C0335g mo1199F() {
        return this.f1323B.mo1199F();
    }

    /* renamed from: H */
    public boolean mo1201H() {
        return this.f1323B.mo1201H();
    }

    /* renamed from: I */
    public boolean mo1202I() {
        return this.f1323B.mo1202I();
    }

    /* renamed from: J */
    public boolean mo1203J() {
        return this.f1323B.mo1203J();
    }

    /* renamed from: V */
    public void mo1214V(C0335g.C0336a aVar) {
        this.f1323B.mo1214V(aVar);
    }

    /* renamed from: f */
    public boolean mo1240f(C0339i iVar) {
        return this.f1323B.mo1240f(iVar);
    }

    public MenuItem getItem() {
        return this.f1324C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1244h(C0335g gVar, MenuItem menuItem) {
        return super.mo1244h(gVar, menuItem) || this.f1323B.mo1244h(gVar, menuItem);
    }

    /* renamed from: i0 */
    public Menu mo1451i0() {
        return this.f1323B;
    }

    /* renamed from: m */
    public boolean mo1248m(C0339i iVar) {
        return this.f1323B.mo1248m(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1323B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo1217Y(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo1218Z(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo1230b0(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo1232c0(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo1237d0(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1324C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1324C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1323B.setQwertyMode(z);
    }

    /* renamed from: v */
    public String mo1266v() {
        C0339i iVar = this.f1324C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1266v() + ":" + itemId;
    }
}
