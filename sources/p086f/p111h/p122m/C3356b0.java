package p086f.p111h.p122m;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;
import p086f.p111h.p114f.C3288b;
import p086f.p111h.p121l.C3344c;
import p086f.p111h.p121l.C3349h;

/* renamed from: f.h.m.b0 */
public class C3356b0 {

    /* renamed from: b */
    public static final C3356b0 f10648b = new C3357a().mo11573a().mo11557a().mo11558b().mo11559c();

    /* renamed from: a */
    private final C3365i f10649a;

    /* renamed from: f.h.m.b0$a */
    public static final class C3357a {

        /* renamed from: a */
        private final C3360d f10650a;

        public C3357a() {
            int i = Build.VERSION.SDK_INT;
            this.f10650a = i >= 29 ? new C3359c() : i >= 20 ? new C3358b() : new C3360d();
        }

        public C3357a(C3356b0 b0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f10650a = i >= 29 ? new C3359c(b0Var) : i >= 20 ? new C3358b(b0Var) : new C3360d(b0Var);
        }

        /* renamed from: a */
        public C3356b0 mo11573a() {
            return this.f10650a.mo11576a();
        }

        /* renamed from: b */
        public C3357a mo11574b(C3288b bVar) {
            this.f10650a.mo11578b(bVar);
            return this;
        }

        /* renamed from: c */
        public C3357a mo11575c(C3288b bVar) {
            this.f10650a.mo11577c(bVar);
            return this;
        }
    }

    /* renamed from: f.h.m.b0$b */
    private static class C3358b extends C3360d {

        /* renamed from: c */
        private static Field f10651c = null;

        /* renamed from: d */
        private static boolean f10652d = false;

        /* renamed from: e */
        private static Constructor<WindowInsets> f10653e = null;

        /* renamed from: f */
        private static boolean f10654f = false;

        /* renamed from: b */
        private WindowInsets f10655b;

        C3358b() {
            this.f10655b = m14406d();
        }

        C3358b(C3356b0 b0Var) {
            this.f10655b = b0Var.mo11572o();
        }

        /* renamed from: d */
        private static WindowInsets m14406d() {
            if (!f10652d) {
                try {
                    f10651c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f10652d = true;
            }
            Field field = f10651c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f10654f) {
                try {
                    f10653e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f10654f = true;
            }
            Constructor<WindowInsets> constructor = f10653e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3356b0 mo11576a() {
            return C3356b0.m14388p(this.f10655b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11577c(C3288b bVar) {
            WindowInsets windowInsets = this.f10655b;
            if (windowInsets != null) {
                this.f10655b = windowInsets.replaceSystemWindowInsets(bVar.f10518a, bVar.f10519b, bVar.f10520c, bVar.f10521d);
            }
        }
    }

    /* renamed from: f.h.m.b0$c */
    private static class C3359c extends C3360d {

        /* renamed from: b */
        final WindowInsets.Builder f10656b;

        C3359c() {
            this.f10656b = new WindowInsets.Builder();
        }

        C3359c(C3356b0 b0Var) {
            WindowInsets.Builder builder;
            WindowInsets o = b0Var.mo11572o();
            if (o == null) {
                builder = new WindowInsets.Builder();
            }
            this.f10656b = builder;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3356b0 mo11576a() {
            return C3356b0.m14388p(this.f10656b.build());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11578b(C3288b bVar) {
            this.f10656b.setStableInsets(bVar.mo11444c());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11577c(C3288b bVar) {
            this.f10656b.setSystemWindowInsets(bVar.mo11444c());
        }
    }

    /* renamed from: f.h.m.b0$d */
    private static class C3360d {

        /* renamed from: a */
        private final C3356b0 f10657a;

        C3360d() {
            this(new C3356b0((C3356b0) null));
        }

        C3360d(C3356b0 b0Var) {
            this.f10657a = b0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3356b0 mo11576a() {
            return this.f10657a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11578b(C3288b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11577c(C3288b bVar) {
        }
    }

    /* renamed from: f.h.m.b0$e */
    private static class C3361e extends C3365i {

        /* renamed from: b */
        final WindowInsets f10658b;

        /* renamed from: c */
        private C3288b f10659c;

        C3361e(C3356b0 b0Var, WindowInsets windowInsets) {
            super(b0Var);
            this.f10659c = null;
            this.f10658b = windowInsets;
        }

        C3361e(C3356b0 b0Var, C3361e eVar) {
            this(b0Var, new WindowInsets(eVar.f10658b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final C3288b mo11579g() {
            if (this.f10659c == null) {
                this.f10659c = C3288b.m14163a(this.f10658b.getSystemWindowInsetLeft(), this.f10658b.getSystemWindowInsetTop(), this.f10658b.getSystemWindowInsetRight(), this.f10658b.getSystemWindowInsetBottom());
            }
            return this.f10659c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3356b0 mo11580h(int i, int i2, int i3, int i4) {
            C3357a aVar = new C3357a(C3356b0.m14388p(this.f10658b));
            aVar.mo11575c(C3356b0.m14387l(mo11579g(), i, i2, i3, i4));
            aVar.mo11574b(C3356b0.m14387l(mo11584f(), i, i2, i3, i4));
            return aVar.mo11573a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo11581j() {
            return this.f10658b.isRound();
        }
    }

    /* renamed from: f.h.m.b0$f */
    private static class C3362f extends C3361e {

        /* renamed from: d */
        private C3288b f10660d = null;

        C3362f(C3356b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        C3362f(C3356b0 b0Var, C3362f fVar) {
            super(b0Var, (C3361e) fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3356b0 mo11582b() {
            return C3356b0.m14388p(this.f10658b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3356b0 mo11583c() {
            return C3356b0.m14388p(this.f10658b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final C3288b mo11584f() {
            if (this.f10660d == null) {
                this.f10660d = C3288b.m14163a(this.f10658b.getStableInsetLeft(), this.f10658b.getStableInsetTop(), this.f10658b.getStableInsetRight(), this.f10658b.getStableInsetBottom());
            }
            return this.f10660d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo11585i() {
            return this.f10658b.isConsumed();
        }
    }

    /* renamed from: f.h.m.b0$g */
    private static class C3363g extends C3362f {
        C3363g(C3356b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        C3363g(C3356b0 b0Var, C3363g gVar) {
            super(b0Var, (C3362f) gVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3356b0 mo11586a() {
            return C3356b0.m14388p(this.f10658b.consumeDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3366c mo11587d() {
            return C3366c.m14436a(this.f10658b.getDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3363g)) {
                return false;
            }
            return Objects.equals(this.f10658b, ((C3363g) obj).f10658b);
        }

        public int hashCode() {
            return this.f10658b.hashCode();
        }
    }

    /* renamed from: f.h.m.b0$h */
    private static class C3364h extends C3363g {

        /* renamed from: e */
        private C3288b f10661e = null;

        C3364h(C3356b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        C3364h(C3356b0 b0Var, C3364h hVar) {
            super(b0Var, (C3363g) hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3288b mo11590e() {
            if (this.f10661e == null) {
                this.f10661e = C3288b.m14164b(this.f10658b.getMandatorySystemGestureInsets());
            }
            return this.f10661e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3356b0 mo11580h(int i, int i2, int i3, int i4) {
            return C3356b0.m14388p(this.f10658b.inset(i, i2, i3, i4));
        }
    }

    /* renamed from: f.h.m.b0$i */
    private static class C3365i {

        /* renamed from: a */
        final C3356b0 f10662a;

        C3365i(C3356b0 b0Var) {
            this.f10662a = b0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3356b0 mo11586a() {
            return this.f10662a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3356b0 mo11582b() {
            return this.f10662a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3356b0 mo11583c() {
            return this.f10662a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3366c mo11587d() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3288b mo11590e() {
            return mo11579g();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3365i)) {
                return false;
            }
            C3365i iVar = (C3365i) obj;
            return mo11581j() == iVar.mo11581j() && mo11585i() == iVar.mo11585i() && C3344c.m14350a(mo11579g(), iVar.mo11579g()) && C3344c.m14350a(mo11584f(), iVar.mo11584f()) && C3344c.m14350a(mo11587d(), iVar.mo11587d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3288b mo11584f() {
            return C3288b.f10517e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3288b mo11579g() {
            return C3288b.f10517e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3356b0 mo11580h(int i, int i2, int i3, int i4) {
            return C3356b0.f10648b;
        }

        public int hashCode() {
            return C3344c.m14351b(Boolean.valueOf(mo11581j()), Boolean.valueOf(mo11585i()), mo11579g(), mo11584f(), mo11587d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo11585i() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo11581j() {
            return false;
        }
    }

    private C3356b0(WindowInsets windowInsets) {
        C3365i eVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            eVar = new C3364h(this, windowInsets);
        } else if (i >= 28) {
            eVar = new C3363g(this, windowInsets);
        } else if (i >= 21) {
            eVar = new C3362f(this, windowInsets);
        } else if (i >= 20) {
            eVar = new C3361e(this, windowInsets);
        } else {
            this.f10649a = new C3365i(this);
            return;
        }
        this.f10649a = eVar;
    }

    public C3356b0(C3356b0 b0Var) {
        C3365i iVar;
        C3365i eVar;
        if (b0Var != null) {
            C3365i iVar2 = b0Var.f10649a;
            if (Build.VERSION.SDK_INT >= 29 && (iVar2 instanceof C3364h)) {
                eVar = new C3364h(this, (C3364h) iVar2);
            } else if (Build.VERSION.SDK_INT >= 28 && (iVar2 instanceof C3363g)) {
                eVar = new C3363g(this, (C3363g) iVar2);
            } else if (Build.VERSION.SDK_INT >= 21 && (iVar2 instanceof C3362f)) {
                eVar = new C3362f(this, (C3362f) iVar2);
            } else if (Build.VERSION.SDK_INT < 20 || !(iVar2 instanceof C3361e)) {
                iVar = new C3365i(this);
            } else {
                eVar = new C3361e(this, (C3361e) iVar2);
            }
            this.f10649a = eVar;
            return;
        }
        iVar = new C3365i(this);
        this.f10649a = iVar;
    }

    /* renamed from: l */
    static C3288b m14387l(C3288b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f10518a - i);
        int max2 = Math.max(0, bVar.f10519b - i2);
        int max3 = Math.max(0, bVar.f10520c - i3);
        int max4 = Math.max(0, bVar.f10521d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : C3288b.m14163a(max, max2, max3, max4);
    }

    /* renamed from: p */
    public static C3356b0 m14388p(WindowInsets windowInsets) {
        C3349h.m14361c(windowInsets);
        return new C3356b0(windowInsets);
    }

    /* renamed from: a */
    public C3356b0 mo11557a() {
        return this.f10649a.mo11586a();
    }

    /* renamed from: b */
    public C3356b0 mo11558b() {
        return this.f10649a.mo11582b();
    }

    /* renamed from: c */
    public C3356b0 mo11559c() {
        return this.f10649a.mo11583c();
    }

    /* renamed from: d */
    public C3288b mo11560d() {
        return this.f10649a.mo11590e();
    }

    /* renamed from: e */
    public int mo11561e() {
        return mo11567i().f10521d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3356b0)) {
            return false;
        }
        return C3344c.m14350a(this.f10649a, ((C3356b0) obj).f10649a);
    }

    /* renamed from: f */
    public int mo11563f() {
        return mo11567i().f10518a;
    }

    /* renamed from: g */
    public int mo11564g() {
        return mo11567i().f10520c;
    }

    /* renamed from: h */
    public int mo11565h() {
        return mo11567i().f10519b;
    }

    public int hashCode() {
        C3365i iVar = this.f10649a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    /* renamed from: i */
    public C3288b mo11567i() {
        return this.f10649a.mo11579g();
    }

    /* renamed from: j */
    public boolean mo11568j() {
        return !mo11567i().equals(C3288b.f10517e);
    }

    /* renamed from: k */
    public C3356b0 mo11569k(int i, int i2, int i3, int i4) {
        return this.f10649a.mo11580h(i, i2, i3, i4);
    }

    /* renamed from: m */
    public boolean mo11570m() {
        return this.f10649a.mo11585i();
    }

    @Deprecated
    /* renamed from: n */
    public C3356b0 mo11571n(int i, int i2, int i3, int i4) {
        C3357a aVar = new C3357a(this);
        aVar.mo11575c(C3288b.m14163a(i, i2, i3, i4));
        return aVar.mo11573a();
    }

    /* renamed from: o */
    public WindowInsets mo11572o() {
        C3365i iVar = this.f10649a;
        if (iVar instanceof C3361e) {
            return ((C3361e) iVar).f10658b;
        }
        return null;
    }
}
