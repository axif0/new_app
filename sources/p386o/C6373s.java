package p386o;

import com.karumi.dexter.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p374m.C6103b0;
import p374m.C6117d0;
import p374m.C6120e;
import p374m.C6257t;
import p374m.C6265x;
import p386o.C6304a;
import p386o.C6312c;
import p386o.C6322f;

/* renamed from: o.s */
public final class C6373s {

    /* renamed from: a */
    private final Map<Method, C6376t<?>> f17977a = new ConcurrentHashMap();

    /* renamed from: b */
    final C6120e.C6121a f17978b;

    /* renamed from: c */
    final C6257t f17979c;

    /* renamed from: d */
    final List<C6322f.C6323a> f17980d;

    /* renamed from: e */
    final List<C6312c.C6313a> f17981e;

    /* renamed from: f */
    final boolean f17982f;

    /* renamed from: o.s$a */
    class C6374a implements InvocationHandler {

        /* renamed from: a */
        private final C6364o f17983a = C6364o.m26142f();

        /* renamed from: b */
        private final Object[] f17984b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f17985c;

        C6374a(Class cls) {
            this.f17985c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f17983a.mo17982h(method)) {
                return this.f17983a.mo17981g(method, this.f17985c, obj, objArr);
            }
            C6376t<?> d = C6373s.this.mo18000d(method);
            if (objArr == null) {
                objArr = this.f17984b;
            }
            return d.mo17957a(objArr);
        }
    }

    /* renamed from: o.s$b */
    public static final class C6375b {

        /* renamed from: a */
        private final C6364o f17987a;

        /* renamed from: b */
        private C6120e.C6121a f17988b;

        /* renamed from: c */
        private C6257t f17989c;

        /* renamed from: d */
        private final List<C6322f.C6323a> f17990d;

        /* renamed from: e */
        private final List<C6312c.C6313a> f17991e;

        /* renamed from: f */
        private Executor f17992f;

        /* renamed from: g */
        private boolean f17993g;

        public C6375b() {
            this(C6364o.m26142f());
        }

        C6375b(C6364o oVar) {
            this.f17990d = new ArrayList();
            this.f17991e = new ArrayList();
            this.f17987a = oVar;
        }

        /* renamed from: a */
        public C6375b mo18008a(C6322f.C6323a aVar) {
            List<C6322f.C6323a> list = this.f17990d;
            C6379w.m26209b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C6375b mo18009b(String str) {
            C6379w.m26209b(str, "baseUrl == null");
            mo18010c(C6257t.m25651l(str));
            return this;
        }

        /* renamed from: c */
        public C6375b mo18010c(C6257t tVar) {
            C6379w.m26209b(tVar, "baseUrl == null");
            List<String> r = tVar.mo17713r();
            if (BuildConfig.FLAVOR.equals(r.get(r.size() - 1))) {
                this.f17989c = tVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
        }

        /* renamed from: d */
        public C6373s mo18011d() {
            if (this.f17989c != null) {
                C6120e.C6121a aVar = this.f17988b;
                if (aVar == null) {
                    aVar = new C6265x();
                }
                C6120e.C6121a aVar2 = aVar;
                Executor executor = this.f17992f;
                if (executor == null) {
                    executor = this.f17987a.mo17978b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f17991e);
                arrayList.addAll(this.f17987a.mo17977a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f17990d.size() + 1 + this.f17987a.mo17980d());
                arrayList2.add(new C6304a());
                arrayList2.addAll(this.f17990d);
                arrayList2.addAll(this.f17987a.mo17979c());
                return new C6373s(aVar2, this.f17989c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f17993g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: e */
        public C6375b mo18012e(C6120e.C6121a aVar) {
            C6379w.m26209b(aVar, "factory == null");
            this.f17988b = aVar;
            return this;
        }

        /* renamed from: f */
        public C6375b mo18013f(C6265x xVar) {
            C6379w.m26209b(xVar, "client == null");
            mo18012e(xVar);
            return this;
        }
    }

    C6373s(C6120e.C6121a aVar, C6257t tVar, List<C6322f.C6323a> list, List<C6312c.C6313a> list2, Executor executor, boolean z) {
        this.f17978b = aVar;
        this.f17979c = tVar;
        this.f17980d = list;
        this.f17981e = list2;
        this.f17982f = z;
    }

    /* renamed from: c */
    private void m26189c(Class<?> cls) {
        C6364o f = C6364o.m26142f();
        for (Method method : cls.getDeclaredMethods()) {
            if (!f.mo17982h(method) && !Modifier.isStatic(method.getModifiers())) {
                mo18000d(method);
            }
        }
    }

    /* renamed from: a */
    public C6312c<?, ?> mo17998a(Type type, Annotation[] annotationArr) {
        return mo18001e((C6312c.C6313a) null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T mo17999b(Class<T> cls) {
        C6379w.m26228u(cls);
        if (this.f17982f) {
            m26189c(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6374a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6376t<?> mo18000d(Method method) {
        C6376t<?> tVar;
        C6376t<?> tVar2 = this.f17977a.get(method);
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (this.f17977a) {
            tVar = this.f17977a.get(method);
            if (tVar == null) {
                tVar = C6376t.m26205b(this, method);
                this.f17977a.put(method, tVar);
            }
        }
        return tVar;
    }

    /* renamed from: e */
    public C6312c<?, ?> mo18001e(C6312c.C6313a aVar, Type type, Annotation[] annotationArr) {
        C6379w.m26209b(type, "returnType == null");
        C6379w.m26209b(annotationArr, "annotations == null");
        int indexOf = this.f17981e.indexOf(aVar) + 1;
        int size = this.f17981e.size();
        for (int i = indexOf; i < size; i++) {
            C6312c<?, ?> a = this.f17981e.get(i).mo17947a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f17981e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f17981e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f17981e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> C6322f<T, C6103b0> mo18002f(C6322f.C6323a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C6379w.m26209b(type, "type == null");
        C6379w.m26209b(annotationArr, "parameterAnnotations == null");
        C6379w.m26209b(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f17980d.indexOf(aVar) + 1;
        int size = this.f17980d.size();
        for (int i = indexOf; i < size; i++) {
            C6322f<?, C6103b0> c = this.f17980d.get(i).mo17931c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f17980d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f17980d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f17980d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public <T> C6322f<C6117d0, T> mo18003g(C6322f.C6323a aVar, Type type, Annotation[] annotationArr) {
        C6379w.m26209b(type, "type == null");
        C6379w.m26209b(annotationArr, "annotations == null");
        int indexOf = this.f17980d.indexOf(aVar) + 1;
        int size = this.f17980d.size();
        for (int i = indexOf; i < size; i++) {
            C6322f<C6117d0, ?> d = this.f17980d.get(i).mo17932d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f17980d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f17980d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f17980d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> C6322f<T, C6103b0> mo18004h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo18002f((C6322f.C6323a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: i */
    public <T> C6322f<C6117d0, T> mo18005i(Type type, Annotation[] annotationArr) {
        return mo18003g((C6322f.C6323a) null, type, annotationArr);
    }

    /* renamed from: j */
    public <T> C6322f<T, String> mo18006j(Type type, Annotation[] annotationArr) {
        C6379w.m26209b(type, "type == null");
        C6379w.m26209b(annotationArr, "annotations == null");
        int size = this.f17980d.size();
        for (int i = 0; i < size; i++) {
            C6322f<?, String> e = this.f17980d.get(i).mo17952e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C6304a.C6308d.f17830a;
    }
}
