package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.C0269c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p086f.p087a.p090l.p091a.C3148d;

/* renamed from: androidx.appcompat.app.b */
public class C0263b implements DrawerLayout.C0616d {

    /* renamed from: a */
    private final C0265b f884a;

    /* renamed from: b */
    private final DrawerLayout f885b;

    /* renamed from: c */
    private C3148d f886c;

    /* renamed from: d */
    private boolean f887d;

    /* renamed from: e */
    boolean f888e;

    /* renamed from: f */
    private final int f889f;

    /* renamed from: g */
    private final int f890g;

    /* renamed from: h */
    View.OnClickListener f891h;

    /* renamed from: i */
    private boolean f892i;

    /* renamed from: androidx.appcompat.app.b$a */
    class C0264a implements View.OnClickListener {
        C0264a() {
        }

        public void onClick(View view) {
            C0263b bVar = C0263b.this;
            if (bVar.f888e) {
                bVar.mo799j();
                return;
            }
            View.OnClickListener onClickListener = bVar.f891h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    public interface C0265b {
        /* renamed from: a */
        void mo801a(Drawable drawable, int i);

        /* renamed from: b */
        boolean mo802b();

        /* renamed from: c */
        Drawable mo803c();

        /* renamed from: d */
        void mo804d(int i);

        /* renamed from: e */
        Context mo805e();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    public interface C0266c {
        /* renamed from: i */
        C0265b mo806i();
    }

    /* renamed from: androidx.appcompat.app.b$d */
    private static class C0267d implements C0265b {

        /* renamed from: a */
        private final Activity f894a;

        /* renamed from: b */
        private C0269c.C0270a f895b;

        C0267d(Activity activity) {
            this.f894a = activity;
        }

        /* renamed from: a */
        public void mo801a(Drawable drawable, int i) {
            ActionBar actionBar = this.f894a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f895b = C0269c.m991c(this.f894a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        /* renamed from: b */
        public boolean mo802b() {
            ActionBar actionBar = this.f894a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        /* renamed from: c */
        public Drawable mo803c() {
            if (Build.VERSION.SDK_INT < 18) {
                return C0269c.m989a(this.f894a);
            }
            TypedArray obtainStyledAttributes = mo805e().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: d */
        public void mo804d(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f894a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f895b = C0269c.m990b(this.f895b, this.f894a, i);
        }

        /* renamed from: e */
        public Context mo805e() {
            ActionBar actionBar = this.f894a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f894a;
        }
    }

    /* renamed from: androidx.appcompat.app.b$e */
    static class C0268e implements C0265b {

        /* renamed from: a */
        final Toolbar f896a;

        /* renamed from: b */
        final Drawable f897b;

        /* renamed from: c */
        final CharSequence f898c;

        C0268e(Toolbar toolbar) {
            this.f896a = toolbar;
            this.f897b = toolbar.getNavigationIcon();
            this.f898c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public void mo801a(Drawable drawable, int i) {
            this.f896a.setNavigationIcon(drawable);
            mo804d(i);
        }

        /* renamed from: b */
        public boolean mo802b() {
            return true;
        }

        /* renamed from: c */
        public Drawable mo803c() {
            return this.f897b;
        }

        /* renamed from: d */
        public void mo804d(int i) {
            if (i == 0) {
                this.f896a.setNavigationContentDescription(this.f898c);
            } else {
                this.f896a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: e */
        public Context mo805e() {
            return this.f896a.getContext();
        }
    }

    C0263b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C3148d dVar, int i, int i2) {
        this.f887d = true;
        this.f888e = true;
        this.f892i = false;
        if (toolbar != null) {
            this.f884a = new C0268e(toolbar);
            toolbar.setNavigationOnClickListener(new C0264a());
        } else if (activity instanceof C0266c) {
            this.f884a = ((C0266c) activity).mo806i();
        } else {
            this.f884a = new C0267d(activity);
        }
        this.f885b = drawerLayout;
        this.f889f = i;
        this.f890g = i2;
        if (dVar == null) {
            this.f886c = new C3148d(this.f884a.mo805e());
        } else {
            this.f886c = dVar;
        }
        mo795e();
    }

    public C0263b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, (C3148d) null, i, i2);
    }

    /* renamed from: h */
    private void m963h(float f) {
        C3148d dVar;
        boolean z;
        if (f == 1.0f) {
            dVar = this.f886c;
            z = true;
        } else {
            if (f == 0.0f) {
                dVar = this.f886c;
                z = false;
            }
            this.f886c.mo10889e(f);
        }
        dVar.mo10891g(z);
        this.f886c.mo10889e(f);
    }

    /* renamed from: a */
    public void mo312a(int i) {
    }

    /* renamed from: b */
    public void mo313b(View view, float f) {
        if (this.f887d) {
            m963h(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m963h(0.0f);
        }
    }

    /* renamed from: c */
    public void mo314c(View view) {
        m963h(1.0f);
        if (this.f888e) {
            mo796f(this.f890g);
        }
    }

    /* renamed from: d */
    public void mo315d(View view) {
        m963h(0.0f);
        if (this.f888e) {
            mo796f(this.f889f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable mo795e() {
        return this.f884a.mo803c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo796f(int i) {
        this.f884a.mo804d(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo797g(Drawable drawable, int i) {
        if (!this.f892i && !this.f884a.mo802b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f892i = true;
        }
        this.f884a.mo801a(drawable, i);
    }

    /* renamed from: i */
    public void mo798i() {
        m963h(this.f885b.mo3038C(8388611) ? 1.0f : 0.0f);
        if (this.f888e) {
            mo797g(this.f886c, this.f885b.mo3038C(8388611) ? this.f890g : this.f889f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo799j() {
        int q = this.f885b.mo3091q(8388611);
        if (this.f885b.mo3041F(8388611) && q != 2) {
            this.f885b.mo3060d(8388611);
        } else if (q != 1) {
            this.f885b.mo3044K(8388611);
        }
    }
}
