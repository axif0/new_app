package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.C0588a;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p115g.p116a.C3304b;
import p086f.p111h.p122m.C3353b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0323a implements C3304b {

    /* renamed from: a */
    private final int f1126a;

    /* renamed from: b */
    private final int f1127b;

    /* renamed from: c */
    private final int f1128c;

    /* renamed from: d */
    private CharSequence f1129d;

    /* renamed from: e */
    private CharSequence f1130e;

    /* renamed from: f */
    private Intent f1131f;

    /* renamed from: g */
    private char f1132g;

    /* renamed from: h */
    private int f1133h = 4096;

    /* renamed from: i */
    private char f1134i;

    /* renamed from: j */
    private int f1135j = 4096;

    /* renamed from: k */
    private Drawable f1136k;

    /* renamed from: l */
    private Context f1137l;

    /* renamed from: m */
    private CharSequence f1138m;

    /* renamed from: n */
    private CharSequence f1139n;

    /* renamed from: o */
    private ColorStateList f1140o = null;

    /* renamed from: p */
    private PorterDuff.Mode f1141p = null;

    /* renamed from: q */
    private boolean f1142q = false;

    /* renamed from: r */
    private boolean f1143r = false;

    /* renamed from: s */
    private int f1144s = 16;

    public C0323a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1137l = context;
        this.f1126a = i2;
        this.f1127b = i;
        this.f1128c = i4;
        this.f1129d = charSequence;
    }

    /* renamed from: c */
    private void m1341c() {
        if (this.f1136k == null) {
            return;
        }
        if (this.f1142q || this.f1143r) {
            Drawable r = C0588a.m2775r(this.f1136k);
            this.f1136k = r;
            Drawable mutate = r.mutate();
            this.f1136k = mutate;
            if (this.f1142q) {
                C0588a.m2772o(mutate, this.f1140o);
            }
            if (this.f1143r) {
                C0588a.m2773p(this.f1136k, this.f1141p);
            }
        }
    }

    /* renamed from: a */
    public C3304b mo1068a(C3353b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C3353b mo1069b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C3304b mo1071d(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C3304b mo1072e(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C3304b mo1074f(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1135j;
    }

    public char getAlphabeticShortcut() {
        return this.f1134i;
    }

    public CharSequence getContentDescription() {
        return this.f1138m;
    }

    public int getGroupId() {
        return this.f1127b;
    }

    public Drawable getIcon() {
        return this.f1136k;
    }

    public ColorStateList getIconTintList() {
        return this.f1140o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1141p;
    }

    public Intent getIntent() {
        return this.f1131f;
    }

    public int getItemId() {
        return this.f1126a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1133h;
    }

    public char getNumericShortcut() {
        return this.f1132g;
    }

    public int getOrder() {
        return this.f1128c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1129d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1130e;
        return charSequence != null ? charSequence : this.f1129d;
    }

    public CharSequence getTooltipText() {
        return this.f1139n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1144s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1144s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1144s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1144s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        mo1071d(i);
        throw null;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo1072e(view);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1134i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1134i = Character.toLowerCase(c);
        this.f1135j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1144s = z | (this.f1144s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1144s = (z ? 2 : 0) | (this.f1144s & -3);
        return this;
    }

    public C3304b setContentDescription(CharSequence charSequence) {
        this.f1138m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1144s = (z ? 16 : 0) | (this.f1144s & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1136k = C3267a.m14076f(this.f1137l, i);
        m1341c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1136k = drawable;
        m1341c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1140o = colorStateList;
        this.f1142q = true;
        m1341c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1141p = mode;
        this.f1143r = true;
        m1341c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1131f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1132g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1132g = c;
        this.f1133h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1132g = c;
        this.f1134i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1132g = c;
        this.f1133h = KeyEvent.normalizeMetaState(i);
        this.f1134i = Character.toLowerCase(c2);
        this.f1135j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        mo1074f(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1129d = this.f1137l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1129d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1130e = charSequence;
        return this;
    }

    public C3304b setTooltipText(CharSequence charSequence) {
        this.f1139n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1144s & 8;
        if (z) {
            i = 0;
        }
        this.f1144s = i2 | i;
        return this;
    }
}
