package p086f.p087a.p094o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p086f.p087a.C3131i;

/* renamed from: f.a.o.d */
public class C3158d extends ContextWrapper {

    /* renamed from: a */
    private int f10021a;

    /* renamed from: b */
    private Resources.Theme f10022b;

    /* renamed from: c */
    private LayoutInflater f10023c;

    /* renamed from: d */
    private Configuration f10024d;

    /* renamed from: e */
    private Resources f10025e;

    public C3158d() {
        super((Context) null);
    }

    public C3158d(Context context, int i) {
        super(context);
        this.f10021a = i;
    }

    public C3158d(Context context, Resources.Theme theme) {
        super(context);
        this.f10022b = theme;
    }

    /* renamed from: b */
    private Resources m13511b() {
        Resources resources;
        if (this.f10025e == null) {
            Configuration configuration = this.f10024d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f10024d);
                this.f10025e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f10025e = resources;
        }
        return this.f10025e;
    }

    /* renamed from: d */
    private void m13512d() {
        boolean z = this.f10022b == null;
        if (z) {
            this.f10022b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10022b.setTo(theme);
            }
        }
        mo10915e(this.f10022b, this.f10021a, z);
    }

    /* renamed from: a */
    public void mo10912a(Configuration configuration) {
        if (this.f10025e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f10024d == null) {
            this.f10024d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo10914c() {
        return this.f10021a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo10915e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m13511b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10023c == null) {
            this.f10023c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10023c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10022b;
        if (theme != null) {
            return theme;
        }
        if (this.f10021a == 0) {
            this.f10021a = C3131i.Theme_AppCompat_Light;
        }
        m13512d();
        return this.f10022b;
    }

    public void setTheme(int i) {
        if (this.f10021a != i) {
            this.f10021a = i;
            m13512d();
        }
    }
}
