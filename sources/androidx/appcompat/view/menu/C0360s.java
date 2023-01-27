package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p086f.p111h.p115g.p116a.C3305c;

/* renamed from: androidx.appcompat.view.menu.s */
class C0360s extends C0354o implements SubMenu {

    /* renamed from: e */
    private final C3305c f1325e;

    C0360s(Context context, C3305c cVar) {
        super(context, cVar);
        this.f1325e = cVar;
    }

    public void clearHeader() {
        this.f1325e.clearHeader();
    }

    public MenuItem getItem() {
        return mo1144c(this.f1325e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f1325e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1325e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f1325e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1325e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1325e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1325e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1325e.setIcon(drawable);
        return this;
    }
}
