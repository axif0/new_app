package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p086f.p087a.p094o.C3157c;
import p086f.p111h.p115g.p116a.C3304b;
import p086f.p111h.p122m.C3353b;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0341j extends C0325c implements MenuItem {

    /* renamed from: d */
    private final C3304b f1275d;

    /* renamed from: e */
    private Method f1276e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0342a extends C3353b {

        /* renamed from: b */
        final ActionProvider f1277b;

        C0342a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1277b = actionProvider;
        }

        /* renamed from: a */
        public boolean mo1390a() {
            return this.f1277b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1391c() {
            return this.f1277b.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo1392e() {
            return this.f1277b.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo1393f(SubMenu subMenu) {
            this.f1277b.onPrepareSubMenu(C0341j.this.mo1145d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0343b extends C0342a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private C3353b.C3355b f1279d;

        C0343b(C0341j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo1394b() {
            return this.f1277b.isVisible();
        }

        /* renamed from: d */
        public View mo1395d(MenuItem menuItem) {
            return this.f1277b.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo1396g() {
            return this.f1277b.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo1397j(C3353b.C3355b bVar) {
            this.f1279d = bVar;
            this.f1277b.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C3353b.C3355b bVar = this.f1279d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0344c extends FrameLayout implements C3157c {

        /* renamed from: f */
        final CollapsibleActionView f1280f;

        C0344c(View view) {
            super(view.getContext());
            this.f1280f = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1399a() {
            return (View) this.f1280f;
        }

        /* renamed from: c */
        public void mo1400c() {
            this.f1280f.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo1401f() {
            this.f1280f.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0345d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1281a;

        C0345d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1281a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1281a.onMenuItemActionCollapse(C0341j.this.mo1144c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1281a.onMenuItemActionExpand(C0341j.this.mo1144c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0346e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private final MenuItem.OnMenuItemClickListener f1283f;

        C0346e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1283f = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1283f.onMenuItemClick(C0341j.this.mo1144c(menuItem));
        }
    }

    public C0341j(Context context, C3304b bVar) {
        super(context);
        if (bVar != null) {
            this.f1275d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1275d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1275d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C3353b b = this.f1275d.mo1069b();
        if (b instanceof C0342a) {
            return ((C0342a) b).f1277b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1275d.getActionView();
        return actionView instanceof C0344c ? ((C0344c) actionView).mo1399a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1275d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1275d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1275d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1275d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1275d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1275d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1275d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1275d.getIntent();
    }

    public int getItemId() {
        return this.f1275d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1275d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1275d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1275d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1275d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo1145d(this.f1275d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1275d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1275d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1275d.getTooltipText();
    }

    /* renamed from: h */
    public void mo1356h(boolean z) {
        try {
            if (this.f1276e == null) {
                this.f1276e = this.f1275d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1276e.invoke(this.f1275d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f1275d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1275d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1275d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1275d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1275d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1275d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C3353b bVar = Build.VERSION.SDK_INT >= 16 ? new C0343b(this, this.f1154a, actionProvider) : new C0342a(this.f1154a, actionProvider);
        C3304b bVar2 = this.f1275d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1068a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1275d.setActionView(i);
        View actionView = this.f1275d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1275d.setActionView((View) new C0344c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0344c(view);
        }
        this.f1275d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1275d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1275d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1275d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1275d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1275d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1275d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1275d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1275d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1275d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1275d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1275d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1275d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1275d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1275d.setOnActionExpandListener(onActionExpandListener != null ? new C0345d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1275d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0346e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1275d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1275d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1275d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1275d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1275d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1275d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1275d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1275d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1275d.setVisible(z);
    }
}
