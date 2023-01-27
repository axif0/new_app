package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0710e;
import androidx.viewpager.widget.C0954a;

/* renamed from: androidx.fragment.app.q */
public abstract class C0669q extends C0954a {

    /* renamed from: b */
    private final C0653m f2796b;

    /* renamed from: c */
    private final int f2797c;

    /* renamed from: d */
    private C0675u f2798d;

    /* renamed from: e */
    private Fragment f2799e;

    /* renamed from: f */
    private boolean f2800f;

    @Deprecated
    public C0669q(C0653m mVar) {
        this(mVar, 0);
    }

    public C0669q(C0653m mVar, int i) {
        this.f2798d = null;
        this.f2799e = null;
        this.f2796b = mVar;
        this.f2797c = i;
    }

    /* renamed from: u */
    private static String m3402u(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    /* renamed from: a */
    public void mo509a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2798d == null) {
            this.f2798d = this.f2796b.mo3440i();
        }
        this.f2798d.mo3266m(fragment);
        if (fragment.equals(this.f2799e)) {
            this.f2799e = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo3509c(ViewGroup viewGroup) {
        C0675u uVar = this.f2798d;
        if (uVar != null) {
            if (!this.f2800f) {
                try {
                    this.f2800f = true;
                    uVar.mo3265l();
                    this.f2800f = false;
                } catch (Throwable th) {
                    this.f2800f = false;
                    throw th;
                }
            }
            this.f2798d = null;
        }
    }

    /* renamed from: h */
    public Object mo511h(ViewGroup viewGroup, int i) {
        if (this.f2798d == null) {
            this.f2798d = this.f2796b.mo3440i();
        }
        long t = mo3515t(i);
        Fragment X = this.f2796b.mo3426X(m3402u(viewGroup.getId(), t));
        if (X != null) {
            this.f2798d.mo3567h(X);
        } else {
            X = mo3514s(i);
            this.f2798d.mo3562c(viewGroup.getId(), X, m3402u(viewGroup.getId(), t));
        }
        if (X != this.f2799e) {
            X.mo3241x1(false);
            if (this.f2797c == 1) {
                this.f2798d.mo3269s(X, C0710e.C0712b.STARTED);
            } else {
                X.mo3139D1(false);
            }
        }
        return X;
    }

    /* renamed from: i */
    public boolean mo512i(View view, Object obj) {
        return ((Fragment) obj).mo3175V() == view;
    }

    /* renamed from: k */
    public void mo3510k(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: l */
    public Parcelable mo3511l() {
        return null;
    }

    /* renamed from: n */
    public void mo3512n(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2799e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.mo3241x1(false);
                if (this.f2797c == 1) {
                    if (this.f2798d == null) {
                        this.f2798d = this.f2796b.mo3440i();
                    }
                    this.f2798d.mo3269s(this.f2799e, C0710e.C0712b.STARTED);
                } else {
                    this.f2799e.mo3139D1(false);
                }
            }
            fragment.mo3241x1(true);
            if (this.f2797c == 1) {
                if (this.f2798d == null) {
                    this.f2798d = this.f2796b.mo3440i();
                }
                this.f2798d.mo3269s(fragment, C0710e.C0712b.RESUMED);
            } else {
                fragment.mo3139D1(true);
            }
            this.f2799e = fragment;
        }
    }

    /* renamed from: q */
    public void mo3513q(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: s */
    public abstract Fragment mo3514s(int i);

    /* renamed from: t */
    public long mo3515t(int i) {
        return (long) i;
    }
}
