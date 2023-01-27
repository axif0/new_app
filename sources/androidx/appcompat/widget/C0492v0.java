package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0323a;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.widget.Toolbar;
import p086f.p087a.C3123a;
import p086f.p087a.C3127e;
import p086f.p087a.C3128f;
import p086f.p087a.C3130h;
import p086f.p087a.C3132j;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3418x;
import p086f.p111h.p122m.C3423z;

/* renamed from: androidx.appcompat.widget.v0 */
public class C0492v0 implements C0406b0 {

    /* renamed from: a */
    Toolbar f1895a;

    /* renamed from: b */
    private int f1896b;

    /* renamed from: c */
    private View f1897c;

    /* renamed from: d */
    private View f1898d;

    /* renamed from: e */
    private Drawable f1899e;

    /* renamed from: f */
    private Drawable f1900f;

    /* renamed from: g */
    private Drawable f1901g;

    /* renamed from: h */
    private boolean f1902h;

    /* renamed from: i */
    CharSequence f1903i;

    /* renamed from: j */
    private CharSequence f1904j;

    /* renamed from: k */
    private CharSequence f1905k;

    /* renamed from: l */
    Window.Callback f1906l;

    /* renamed from: m */
    boolean f1907m;

    /* renamed from: n */
    private C0408c f1908n;

    /* renamed from: o */
    private int f1909o;

    /* renamed from: p */
    private int f1910p;

    /* renamed from: q */
    private Drawable f1911q;

    /* renamed from: androidx.appcompat.widget.v0$a */
    class C0493a implements View.OnClickListener {

        /* renamed from: f */
        final C0323a f1912f = new C0323a(C0492v0.this.f1895a.getContext(), 0, 16908332, 0, 0, C0492v0.this.f1903i);

        C0493a() {
        }

        public void onClick(View view) {
            C0492v0 v0Var = C0492v0.this;
            Window.Callback callback = v0Var.f1906l;
            if (callback != null && v0Var.f1907m) {
                callback.onMenuItemSelected(0, this.f1912f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v0$b */
    class C0494b extends C3423z {

        /* renamed from: a */
        private boolean f1914a = false;

        /* renamed from: b */
        final /* synthetic */ int f1915b;

        C0494b(int i) {
            this.f1915b = i;
        }

        /* renamed from: a */
        public void mo1944a(View view) {
            this.f1914a = true;
        }

        /* renamed from: b */
        public void mo928b(View view) {
            if (!this.f1914a) {
                C0492v0.this.f1895a.setVisibility(this.f1915b);
            }
        }

        /* renamed from: c */
        public void mo929c(View view) {
            C0492v0.this.f1895a.setVisibility(0);
        }
    }

    public C0492v0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C3130h.abc_action_bar_up_description, C3127e.abc_ic_ab_back_material);
    }

    public C0492v0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1909o = 0;
        this.f1910p = 0;
        this.f1895a = toolbar;
        this.f1903i = toolbar.getTitle();
        this.f1904j = toolbar.getSubtitle();
        this.f1902h = this.f1903i != null;
        this.f1901g = toolbar.getNavigationIcon();
        C0479u0 v = C0479u0.m2148v(toolbar.getContext(), (AttributeSet) null, C3132j.ActionBar, C3123a.actionBarStyle, 0);
        this.f1911q = v.mo2349g(C3132j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p = v.mo2358p(C3132j.ActionBar_title);
            if (!TextUtils.isEmpty(p)) {
                mo2431G(p);
            }
            CharSequence p2 = v.mo2358p(C3132j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p2)) {
                mo2430F(p2);
            }
            Drawable g = v.mo2349g(C3132j.ActionBar_logo);
            if (g != null) {
                mo2428D(g);
            }
            Drawable g2 = v.mo2349g(C3132j.ActionBar_icon);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1901g == null && (drawable = this.f1911q) != null) {
                mo1981y(drawable);
            }
            mo1968p(v.mo2353k(C3132j.ActionBar_displayOptions, 0));
            int n = v.mo2356n(C3132j.ActionBar_customNavigationLayout, 0);
            if (n != 0) {
                mo2426B(LayoutInflater.from(this.f1895a.getContext()).inflate(n, this.f1895a, false));
                mo1968p(this.f1896b | 16);
            }
            int m = v.mo2355m(C3132j.ActionBar_height, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1895a.getLayoutParams();
                layoutParams.height = m;
                this.f1895a.setLayoutParams(layoutParams);
            }
            int e = v.mo2347e(C3132j.ActionBar_contentInsetStart, -1);
            int e2 = v.mo2347e(C3132j.ActionBar_contentInsetEnd, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1895a.mo1825H(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo2356n(C3132j.ActionBar_titleTextStyle, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1895a;
                toolbar2.mo1829L(toolbar2.getContext(), n2);
            }
            int n3 = v.mo2356n(C3132j.ActionBar_subtitleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1895a;
                toolbar3.mo1828K(toolbar3.getContext(), n3);
            }
            int n4 = v.mo2356n(C3132j.ActionBar_popupTheme, 0);
            if (n4 != 0) {
                this.f1895a.setPopupTheme(n4);
            }
        } else {
            this.f1896b = m2208A();
        }
        v.mo2362w();
        mo2427C(i);
        this.f1905k = this.f1895a.getNavigationContentDescription();
        this.f1895a.setNavigationOnClickListener(new C0493a());
    }

    /* renamed from: A */
    private int m2208A() {
        if (this.f1895a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1911q = this.f1895a.getNavigationIcon();
        return 15;
    }

    /* renamed from: H */
    private void m2209H(CharSequence charSequence) {
        this.f1903i = charSequence;
        if ((this.f1896b & 8) != 0) {
            this.f1895a.setTitle(charSequence);
        }
    }

    /* renamed from: I */
    private void m2210I() {
        if ((this.f1896b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1905k)) {
            this.f1895a.setNavigationContentDescription(this.f1910p);
        } else {
            this.f1895a.setNavigationContentDescription(this.f1905k);
        }
    }

    /* renamed from: J */
    private void m2211J() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1896b & 4) != 0) {
            toolbar = this.f1895a;
            drawable = this.f1901g;
            if (drawable == null) {
                drawable = this.f1911q;
            }
        } else {
            toolbar = this.f1895a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: K */
    private void m2212K() {
        Drawable drawable;
        int i = this.f1896b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1900f) == null) {
            drawable = this.f1899e;
        }
        this.f1895a.setLogo(drawable);
    }

    /* renamed from: B */
    public void mo2426B(View view) {
        View view2 = this.f1898d;
        if (!(view2 == null || (this.f1896b & 16) == 0)) {
            this.f1895a.removeView(view2);
        }
        this.f1898d = view;
        if (view != null && (this.f1896b & 16) != 0) {
            this.f1895a.addView(view);
        }
    }

    /* renamed from: C */
    public void mo2427C(int i) {
        if (i != this.f1910p) {
            this.f1910p = i;
            if (TextUtils.isEmpty(this.f1895a.getNavigationContentDescription())) {
                mo1976t(this.f1910p);
            }
        }
    }

    /* renamed from: D */
    public void mo2428D(Drawable drawable) {
        this.f1900f = drawable;
        m2212K();
    }

    /* renamed from: E */
    public void mo2429E(CharSequence charSequence) {
        this.f1905k = charSequence;
        m2210I();
    }

    /* renamed from: F */
    public void mo2430F(CharSequence charSequence) {
        this.f1904j = charSequence;
        if ((this.f1896b & 8) != 0) {
            this.f1895a.setSubtitle(charSequence);
        }
    }

    /* renamed from: G */
    public void mo2431G(CharSequence charSequence) {
        this.f1902h = true;
        m2209H(charSequence);
    }

    /* renamed from: a */
    public void mo1951a(Menu menu, C0350m.C0351a aVar) {
        if (this.f1908n == null) {
            C0408c cVar = new C0408c(this.f1895a.getContext());
            this.f1908n = cVar;
            cVar.mo1142s(C3128f.action_menu_presenter);
        }
        this.f1908n.mo1139p(aVar);
        this.f1895a.mo1826I((C0335g) menu, this.f1908n);
    }

    /* renamed from: b */
    public boolean mo1952b() {
        return this.f1895a.mo1823A();
    }

    /* renamed from: c */
    public Context mo1953c() {
        return this.f1895a.getContext();
    }

    public void collapseActionView() {
        this.f1895a.mo1834e();
    }

    /* renamed from: d */
    public void mo1955d() {
        this.f1907m = true;
    }

    /* renamed from: e */
    public boolean mo1956e() {
        return this.f1895a.mo1915z();
    }

    /* renamed from: f */
    public boolean mo1957f() {
        return this.f1895a.mo1913w();
    }

    /* renamed from: g */
    public boolean mo1958g() {
        return this.f1895a.mo1830O();
    }

    public CharSequence getTitle() {
        return this.f1895a.getTitle();
    }

    /* renamed from: h */
    public boolean mo1960h() {
        return this.f1895a.mo1833d();
    }

    /* renamed from: i */
    public void mo1961i() {
        this.f1895a.mo1835f();
    }

    /* renamed from: j */
    public void mo1962j(C0350m.C0351a aVar, C0335g.C0336a aVar2) {
        this.f1895a.mo1827J(aVar, aVar2);
    }

    /* renamed from: k */
    public void mo1963k(int i) {
        this.f1895a.setVisibility(i);
    }

    /* renamed from: l */
    public void mo1964l(C0460n0 n0Var) {
        Toolbar toolbar;
        View view = this.f1897c;
        if (view != null && view.getParent() == (toolbar = this.f1895a)) {
            toolbar.removeView(this.f1897c);
        }
        this.f1897c = n0Var;
        if (n0Var != null && this.f1909o == 2) {
            this.f1895a.addView(n0Var, 0);
            Toolbar.C0396e eVar = (Toolbar.C0396e) this.f1897c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f883a = 8388691;
            n0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: m */
    public ViewGroup mo1965m() {
        return this.f1895a;
    }

    /* renamed from: n */
    public void mo1966n(boolean z) {
    }

    /* renamed from: o */
    public boolean mo1967o() {
        return this.f1895a.mo1912v();
    }

    /* renamed from: p */
    public void mo1968p(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1896b ^ i;
        this.f1896b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2210I();
                }
                m2211J();
            }
            if ((i2 & 3) != 0) {
                m2212K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1895a.setTitle(this.f1903i);
                    toolbar = this.f1895a;
                    charSequence = this.f1904j;
                } else {
                    charSequence = null;
                    this.f1895a.setTitle((CharSequence) null);
                    toolbar = this.f1895a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1898d) != null) {
                if ((i & 16) != 0) {
                    this.f1895a.addView(view);
                } else {
                    this.f1895a.removeView(view);
                }
            }
        }
    }

    /* renamed from: q */
    public int mo1969q() {
        return this.f1896b;
    }

    /* renamed from: r */
    public Menu mo1970r() {
        return this.f1895a.getMenu();
    }

    /* renamed from: s */
    public void mo1971s(int i) {
        mo2428D(i != 0 ? C3133a.m13388d(mo1953c(), i) : null);
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C3133a.m13388d(mo1953c(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1899e = drawable;
        m2212K();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1906l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1902h) {
            m2209H(charSequence);
        }
    }

    /* renamed from: t */
    public void mo1976t(int i) {
        mo2429E(i == 0 ? null : mo1953c().getString(i));
    }

    /* renamed from: u */
    public int mo1977u() {
        return this.f1909o;
    }

    /* renamed from: v */
    public C3418x mo1978v(int i, long j) {
        C3418x c = C3403t.m14630c(this.f1895a);
        c.mo11730a(i == 0 ? 1.0f : 0.0f);
        c.mo11733d(j);
        c.mo11735f(new C0494b(i));
        return c;
    }

    /* renamed from: w */
    public void mo1979w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: x */
    public void mo1980x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: y */
    public void mo1981y(Drawable drawable) {
        this.f1901g = drawable;
        m2211J();
    }

    /* renamed from: z */
    public void mo1982z(boolean z) {
        this.f1895a.setCollapsible(z);
    }
}
