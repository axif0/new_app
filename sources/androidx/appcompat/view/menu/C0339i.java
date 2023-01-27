package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0352n;
import androidx.core.graphics.drawable.C0588a;
import com.karumi.dexter.BuildConfig;
import p086f.p087a.C3130h;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p115g.p116a.C3304b;
import p086f.p111h.p122m.C3353b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0339i implements C3304b {

    /* renamed from: A */
    private View f1243A;

    /* renamed from: B */
    private C3353b f1244B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1245C;

    /* renamed from: D */
    private boolean f1246D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1247E;

    /* renamed from: a */
    private final int f1248a;

    /* renamed from: b */
    private final int f1249b;

    /* renamed from: c */
    private final int f1250c;

    /* renamed from: d */
    private final int f1251d;

    /* renamed from: e */
    private CharSequence f1252e;

    /* renamed from: f */
    private CharSequence f1253f;

    /* renamed from: g */
    private Intent f1254g;

    /* renamed from: h */
    private char f1255h;

    /* renamed from: i */
    private int f1256i = 4096;

    /* renamed from: j */
    private char f1257j;

    /* renamed from: k */
    private int f1258k = 4096;

    /* renamed from: l */
    private Drawable f1259l;

    /* renamed from: m */
    private int f1260m = 0;

    /* renamed from: n */
    C0335g f1261n;

    /* renamed from: o */
    private C0359r f1262o;

    /* renamed from: p */
    private Runnable f1263p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1264q;

    /* renamed from: r */
    private CharSequence f1265r;

    /* renamed from: s */
    private CharSequence f1266s;

    /* renamed from: t */
    private ColorStateList f1267t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1268u = null;

    /* renamed from: v */
    private boolean f1269v = false;

    /* renamed from: w */
    private boolean f1270w = false;

    /* renamed from: x */
    private boolean f1271x = false;

    /* renamed from: y */
    private int f1272y = 16;

    /* renamed from: z */
    private int f1273z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0340a implements C3353b.C3355b {
        C0340a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0339i iVar = C0339i.this;
            iVar.f1261n.mo1205L(iVar);
        }
    }

    C0339i(C0335g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1261n = gVar;
        this.f1248a = i2;
        this.f1249b = i;
        this.f1250c = i3;
        this.f1251d = i4;
        this.f1252e = charSequence;
        this.f1273z = i5;
    }

    /* renamed from: d */
    private static void m1486d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1487e(Drawable drawable) {
        if (drawable != null && this.f1271x && (this.f1269v || this.f1270w)) {
            drawable = C0588a.m2775r(drawable).mutate();
            if (this.f1269v) {
                C0588a.m2772o(drawable, this.f1267t);
            }
            if (this.f1270w) {
                C0588a.m2773p(drawable, this.f1268u);
            }
            this.f1271x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1276A() {
        return this.f1261n.mo1203J() && mo1280g() != 0;
    }

    /* renamed from: B */
    public boolean mo1277B() {
        return (this.f1273z & 4) == 4;
    }

    /* renamed from: a */
    public C3304b mo1068a(C3353b bVar) {
        C3353b bVar2 = this.f1244B;
        if (bVar2 != null) {
            bVar2.mo11555h();
        }
        this.f1243A = null;
        this.f1244B = bVar;
        this.f1261n.mo1206M(true);
        C3353b bVar3 = this.f1244B;
        if (bVar3 != null) {
            bVar3.mo1397j(new C0340a());
        }
        return this;
    }

    /* renamed from: b */
    public C3353b mo1069b() {
        return this.f1244B;
    }

    /* renamed from: c */
    public void mo1278c() {
        this.f1261n.mo1204K(this);
    }

    public boolean collapseActionView() {
        if ((this.f1273z & 8) == 0) {
            return false;
        }
        if (this.f1243A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1245C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1261n.mo1240f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo1300j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1245C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1261n.mo1248m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1279f() {
        return this.f1251d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo1280g() {
        return this.f1261n.mo1202I() ? this.f1257j : this.f1255h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1243A;
        if (view != null) {
            return view;
        }
        C3353b bVar = this.f1244B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo1395d(this);
        this.f1243A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f1258k;
    }

    public char getAlphabeticShortcut() {
        return this.f1257j;
    }

    public CharSequence getContentDescription() {
        return this.f1265r;
    }

    public int getGroupId() {
        return this.f1249b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1259l;
        if (drawable != null) {
            return m1487e(drawable);
        }
        if (this.f1260m == 0) {
            return null;
        }
        Drawable d = C3133a.m13388d(this.f1261n.mo1267w(), this.f1260m);
        this.f1260m = 0;
        this.f1259l = d;
        return m1487e(d);
    }

    public ColorStateList getIconTintList() {
        return this.f1267t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1268u;
    }

    public Intent getIntent() {
        return this.f1254g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1248a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1247E;
    }

    public int getNumericModifiers() {
        return this.f1256i;
    }

    public char getNumericShortcut() {
        return this.f1255h;
    }

    public int getOrder() {
        return this.f1250c;
    }

    public SubMenu getSubMenu() {
        return this.f1262o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1252e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1253f;
        if (charSequence == null) {
            charSequence = this.f1252e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1266s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo1293h() {
        int i;
        char g = mo1280g();
        if (g == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f1261n.mo1267w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1261n.mo1267w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C3130h.abc_prepend_shortcut_label));
        }
        int i2 = this.f1261n.mo1202I() ? this.f1258k : this.f1256i;
        m1486d(sb, i2, 65536, resources.getString(C3130h.abc_menu_meta_shortcut_label));
        m1486d(sb, i2, 4096, resources.getString(C3130h.abc_menu_ctrl_shortcut_label));
        m1486d(sb, i2, 2, resources.getString(C3130h.abc_menu_alt_shortcut_label));
        m1486d(sb, i2, 1, resources.getString(C3130h.abc_menu_shift_shortcut_label));
        m1486d(sb, i2, 4, resources.getString(C3130h.abc_menu_sym_shortcut_label));
        m1486d(sb, i2, 8, resources.getString(C3130h.abc_menu_function_shortcut_label));
        if (g == 8) {
            i = C3130h.abc_menu_delete_shortcut_label;
        } else if (g == 10) {
            i = C3130h.abc_menu_enter_shortcut_label;
        } else if (g != ' ') {
            sb.append(g);
            return sb.toString();
        } else {
            i = C3130h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f1262o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo1295i(C0352n.C0353a aVar) {
        return (aVar == null || !aVar.mo1033d()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f1246D;
    }

    public boolean isCheckable() {
        return (this.f1272y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1272y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1272y & 16) != 0;
    }

    public boolean isVisible() {
        C3353b bVar = this.f1244B;
        return (bVar == null || !bVar.mo1396g()) ? (this.f1272y & 8) == 0 : (this.f1272y & 8) == 0 && this.f1244B.mo1394b();
    }

    /* renamed from: j */
    public boolean mo1300j() {
        C3353b bVar;
        if ((this.f1273z & 8) == 0) {
            return false;
        }
        if (this.f1243A == null && (bVar = this.f1244B) != null) {
            this.f1243A = bVar.mo1395d(this);
        }
        return this.f1243A != null;
    }

    /* renamed from: k */
    public boolean mo1301k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1264q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0335g gVar = this.f1261n;
        if (gVar.mo1244h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1263p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1254g != null) {
            try {
                this.f1261n.mo1267w().startActivity(this.f1254g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C3353b bVar = this.f1244B;
        return bVar != null && bVar.mo1392e();
    }

    /* renamed from: l */
    public boolean mo1302l() {
        return (this.f1272y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo1303m() {
        return (this.f1272y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo1304n() {
        return (this.f1273z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo1305o() {
        return (this.f1273z & 2) == 2;
    }

    /* renamed from: p */
    public C3304b mo1306p(int i) {
        Context w = this.f1261n.mo1267w();
        mo1307q(LayoutInflater.from(w).inflate(i, new LinearLayout(w), false));
        return this;
    }

    /* renamed from: q */
    public C3304b mo1307q(View view) {
        int i;
        this.f1243A = view;
        this.f1244B = null;
        if (view != null && view.getId() == -1 && (i = this.f1248a) > 0) {
            view.setId(i);
        }
        this.f1261n.mo1204K(this);
        return this;
    }

    /* renamed from: r */
    public void mo1308r(boolean z) {
        this.f1246D = z;
        this.f1261n.mo1206M(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1309s(boolean z) {
        int i = this.f1272y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f1272y = i2;
        if (i != i2) {
            this.f1261n.mo1206M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        mo1306p(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo1307q(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1257j == c) {
            return this;
        }
        this.f1257j = Character.toLowerCase(c);
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1257j == c && this.f1258k == i) {
            return this;
        }
        this.f1257j = Character.toLowerCase(c);
        this.f1258k = KeyEvent.normalizeMetaState(i);
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1272y;
        boolean z2 = z | (i & true);
        this.f1272y = z2 ? 1 : 0;
        if (i != z2) {
            this.f1261n.mo1206M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1272y & 4) != 0) {
            this.f1261n.mo1216X(this);
        } else {
            mo1309s(z);
        }
        return this;
    }

    public C3304b setContentDescription(CharSequence charSequence) {
        this.f1265r = charSequence;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1272y = z ? this.f1272y | 16 : this.f1272y & -17;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1259l = null;
        this.f1260m = i;
        this.f1271x = true;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1260m = 0;
        this.f1259l = drawable;
        this.f1271x = true;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1267t = colorStateList;
        this.f1269v = true;
        this.f1271x = true;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1268u = mode;
        this.f1270w = true;
        this.f1271x = true;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1254g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1255h == c) {
            return this;
        }
        this.f1255h = c;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1255h == c && this.f1256i == i) {
            return this;
        }
        this.f1255h = c;
        this.f1256i = KeyEvent.normalizeMetaState(i);
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1245C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1264q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1255h = c;
        this.f1257j = Character.toLowerCase(c2);
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1255h = c;
        this.f1256i = KeyEvent.normalizeMetaState(i);
        this.f1257j = Character.toLowerCase(c2);
        this.f1258k = KeyEvent.normalizeMetaState(i2);
        this.f1261n.mo1206M(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1273z = i;
            this.f1261n.mo1204K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        mo1330w(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f1261n.mo1267w().getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1252e = charSequence;
        this.f1261n.mo1206M(false);
        C0359r rVar = this.f1262o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1253f = charSequence;
        this.f1261n.mo1206M(false);
        return this;
    }

    public C3304b setTooltipText(CharSequence charSequence) {
        this.f1266s = charSequence;
        this.f1261n.mo1206M(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1332y(z)) {
            this.f1261n.mo1205L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1326t(boolean z) {
        this.f1272y = (z ? 4 : 0) | (this.f1272y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1252e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1328u(boolean z) {
        this.f1272y = z ? this.f1272y | 32 : this.f1272y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1329v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1247E = contextMenuInfo;
    }

    /* renamed from: w */
    public C3304b mo1330w(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1331x(C0359r rVar) {
        this.f1262o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo1332y(boolean z) {
        int i = this.f1272y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f1272y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean mo1333z() {
        return this.f1261n.mo1197C();
    }
}
