package p386o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p386o.C6312c;
import p386o.C6322f;

/* renamed from: o.o */
class C6364o {

    /* renamed from: a */
    private static final C6364o f17921a = m26141e();

    /* renamed from: o.o$a */
    static class C6365a extends C6364o {

        /* renamed from: o.o$a$a */
        static class C6366a implements Executor {

            /* renamed from: a */
            private final Handler f17922a = new Handler(Looper.getMainLooper());

            C6366a() {
            }

            public void execute(Runnable runnable) {
                this.f17922a.post(runnable);
            }
        }

        C6365a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<? extends C6312c.C6313a> mo17977a(Executor executor) {
            if (executor != null) {
                C6324g gVar = new C6324g(executor);
                if (Build.VERSION.SDK_INT < 24) {
                    return Collections.singletonList(gVar);
                }
                return Arrays.asList(new C6312c.C6313a[]{C6315e.f17833a, gVar});
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public Executor mo17978b() {
            return new C6366a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public List<? extends C6322f.C6323a> mo17979c() {
            return Build.VERSION.SDK_INT >= 24 ? Collections.singletonList(C6349m.f17885a) : Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo17980d() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        /* access modifiers changed from: package-private */
        @IgnoreJRERequirement
        /* renamed from: h */
        public boolean mo17982h(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* renamed from: o.o$b */
    static class C6367b extends C6364o {
        C6367b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<? extends C6312c.C6313a> mo17977a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(C6315e.f17833a);
            arrayList.add(new C6324g(executor));
            return Collections.unmodifiableList(arrayList);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public List<? extends C6322f.C6323a> mo17979c() {
            return Collections.singletonList(C6349m.f17885a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo17980d() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Object mo17981g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo17982h(Method method) {
            return method.isDefault();
        }
    }

    C6364o() {
    }

    /* renamed from: e */
    private static C6364o m26141e() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C6365a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C6367b();
        } catch (ClassNotFoundException unused2) {
            return new C6364o();
        }
    }

    /* renamed from: f */
    static C6364o m26142f() {
        return f17921a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends C6312c.C6313a> mo17977a(Executor executor) {
        return Collections.singletonList(new C6324g(executor));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Executor mo17978b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<? extends C6322f.C6323a> mo17979c() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo17980d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo17981g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo17982h(Method method) {
        return false;
    }
}
