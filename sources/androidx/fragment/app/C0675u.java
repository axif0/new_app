package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C0710e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.u */
public abstract class C0675u {

    /* renamed from: a */
    ArrayList<C0676a> f2820a = new ArrayList<>();

    /* renamed from: b */
    int f2821b;

    /* renamed from: c */
    int f2822c;

    /* renamed from: d */
    int f2823d;

    /* renamed from: e */
    int f2824e;

    /* renamed from: f */
    int f2825f;

    /* renamed from: g */
    boolean f2826g;

    /* renamed from: h */
    boolean f2827h = true;

    /* renamed from: i */
    String f2828i;

    /* renamed from: j */
    int f2829j;

    /* renamed from: k */
    CharSequence f2830k;

    /* renamed from: l */
    int f2831l;

    /* renamed from: m */
    CharSequence f2832m;

    /* renamed from: n */
    ArrayList<String> f2833n;

    /* renamed from: o */
    ArrayList<String> f2834o;

    /* renamed from: p */
    boolean f2835p = false;

    /* renamed from: q */
    ArrayList<Runnable> f2836q;

    /* renamed from: androidx.fragment.app.u$a */
    static final class C0676a {

        /* renamed from: a */
        int f2837a;

        /* renamed from: b */
        Fragment f2838b;

        /* renamed from: c */
        int f2839c;

        /* renamed from: d */
        int f2840d;

        /* renamed from: e */
        int f2841e;

        /* renamed from: f */
        int f2842f;

        /* renamed from: g */
        C0710e.C0712b f2843g;

        /* renamed from: h */
        C0710e.C0712b f2844h;

        C0676a() {
        }

        C0676a(int i, Fragment fragment) {
            this.f2837a = i;
            this.f2838b = fragment;
            C0710e.C0712b bVar = C0710e.C0712b.RESUMED;
            this.f2843g = bVar;
            this.f2844h = bVar;
        }

        C0676a(int i, Fragment fragment, C0710e.C0712b bVar) {
            this.f2837a = i;
            this.f2838b = fragment;
            this.f2843g = fragment.f2613U;
            this.f2844h = bVar;
        }
    }

    C0675u(C0648i iVar, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public C0675u mo3561b(int i, Fragment fragment) {
        mo3267o(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: c */
    public C0675u mo3562c(int i, Fragment fragment, String str) {
        mo3267o(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0675u mo3563d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2603K = viewGroup;
        mo3562c(viewGroup.getId(), fragment, str);
        return this;
    }

    /* renamed from: e */
    public C0675u mo3564e(Fragment fragment, String str) {
        mo3267o(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3565f(C0676a aVar) {
        this.f2820a.add(aVar);
        aVar.f2839c = this.f2821b;
        aVar.f2840d = this.f2822c;
        aVar.f2841e = this.f2823d;
        aVar.f2842f = this.f2824e;
    }

    /* renamed from: g */
    public C0675u mo3566g(String str) {
        if (this.f2827h) {
            this.f2826g = true;
            this.f2828i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public C0675u mo3567h(Fragment fragment) {
        mo3565f(new C0676a(7, fragment));
        return this;
    }

    /* renamed from: i */
    public abstract int mo3262i();

    /* renamed from: j */
    public abstract int mo3263j();

    /* renamed from: k */
    public abstract void mo3264k();

    /* renamed from: l */
    public abstract void mo3265l();

    /* renamed from: m */
    public C0675u mo3266m(Fragment fragment) {
        mo3565f(new C0676a(6, fragment));
        return this;
    }

    /* renamed from: n */
    public C0675u mo3568n() {
        if (!this.f2826g) {
            this.f2827h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3267o(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2595C;
            if (str2 == null || str.equals(str2)) {
                fragment.f2595C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2595C + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2593A;
                if (i3 == 0 || i3 == i) {
                    fragment.f2593A = i;
                    fragment.f2594B = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2593A + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo3565f(new C0676a(i2, fragment));
    }

    /* renamed from: p */
    public C0675u mo3268p(Fragment fragment) {
        mo3565f(new C0676a(3, fragment));
        return this;
    }

    /* renamed from: q */
    public C0675u mo3569q(int i, Fragment fragment) {
        mo3570r(i, fragment, (String) null);
        return this;
    }

    /* renamed from: r */
    public C0675u mo3570r(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3267o(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: s */
    public C0675u mo3269s(Fragment fragment, C0710e.C0712b bVar) {
        mo3565f(new C0676a(10, fragment, bVar));
        return this;
    }

    /* renamed from: t */
    public C0675u mo3571t(boolean z) {
        this.f2835p = z;
        return this;
    }
}
