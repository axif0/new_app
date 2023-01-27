package p148g.p189d.p289c.p291y;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p148g.p189d.p289c.C5229h;
import p148g.p189d.p289c.C5234m;
import p148g.p189d.p289c.p291y.p294o.C5366b;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.c */
public final class C5258c {

    /* renamed from: a */
    private final Map<Type, C5229h<?>> f15318a;

    /* renamed from: b */
    private final C5366b f15319b = C5366b.m22155a();

    /* renamed from: g.d.c.y.c$a */
    class C5259a implements C5286i<T> {
        C5259a(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: g.d.c.y.c$b */
    class C5260b implements C5286i<T> {
        C5260b(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new TreeMap();
        }
    }

    /* renamed from: g.d.c.y.c$c */
    class C5261c implements C5286i<T> {
        C5261c(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: g.d.c.y.c$d */
    class C5262d implements C5286i<T> {
        C5262d(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new C5278h();
        }
    }

    /* renamed from: g.d.c.y.c$e */
    class C5263e implements C5286i<T> {

        /* renamed from: a */
        private final C5292m f15320a = C5292m.m21948b();

        /* renamed from: b */
        final /* synthetic */ Class f15321b;

        /* renamed from: c */
        final /* synthetic */ Type f15322c;

        C5263e(C5258c cVar, Class cls, Type type) {
            this.f15321b = cls;
            this.f15322c = type;
        }

        /* renamed from: a */
        public T mo15431a() {
            try {
                return this.f15320a.mo15489c(this.f15321b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f15322c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: g.d.c.y.c$f */
    class C5264f implements C5286i<T> {

        /* renamed from: a */
        final /* synthetic */ C5229h f15323a;

        /* renamed from: b */
        final /* synthetic */ Type f15324b;

        C5264f(C5258c cVar, C5229h hVar, Type type) {
            this.f15323a = hVar;
            this.f15324b = type;
        }

        /* renamed from: a */
        public T mo15431a() {
            return this.f15323a.mo15369a(this.f15324b);
        }
    }

    /* renamed from: g.d.c.y.c$g */
    class C5265g implements C5286i<T> {

        /* renamed from: a */
        final /* synthetic */ C5229h f15325a;

        /* renamed from: b */
        final /* synthetic */ Type f15326b;

        C5265g(C5258c cVar, C5229h hVar, Type type) {
            this.f15325a = hVar;
            this.f15326b = type;
        }

        /* renamed from: a */
        public T mo15431a() {
            return this.f15325a.mo15369a(this.f15326b);
        }
    }

    /* renamed from: g.d.c.y.c$h */
    class C5266h implements C5286i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f15327a;

        C5266h(C5258c cVar, Constructor constructor) {
            this.f15327a = constructor;
        }

        /* renamed from: a */
        public T mo15431a() {
            try {
                return this.f15327a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f15327a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f15327a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: g.d.c.y.c$i */
    class C5267i implements C5286i<T> {
        C5267i(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new TreeSet();
        }
    }

    /* renamed from: g.d.c.y.c$j */
    class C5268j implements C5286i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f15328a;

        C5268j(C5258c cVar, Type type) {
            this.f15328a = type;
        }

        /* renamed from: a */
        public T mo15431a() {
            Type type = this.f15328a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C5234m("Invalid EnumSet type: " + this.f15328a.toString());
            }
            throw new C5234m("Invalid EnumSet type: " + this.f15328a.toString());
        }
    }

    /* renamed from: g.d.c.y.c$k */
    class C5269k implements C5286i<T> {
        C5269k(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: g.d.c.y.c$l */
    class C5270l implements C5286i<T> {
        C5270l(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: g.d.c.y.c$m */
    class C5271m implements C5286i<T> {
        C5271m(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new ArrayList();
        }
    }

    /* renamed from: g.d.c.y.c$n */
    class C5272n implements C5286i<T> {
        C5272n(C5258c cVar) {
        }

        /* renamed from: a */
        public T mo15431a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C5258c(Map<Type, C5229h<?>> map) {
        this.f15318a = map;
    }

    /* renamed from: b */
    private <T> C5286i<T> m21883b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f15319b.mo15576b(declaredConstructor);
            }
            return new C5266h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> C5286i<T> m21884c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C5267i(this) : EnumSet.class.isAssignableFrom(cls) ? new C5268j(this, type) : Set.class.isAssignableFrom(cls) ? new C5269k(this) : Queue.class.isAssignableFrom(cls) ? new C5270l(this) : new C5271m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C5272n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new C5259a(this) : SortedMap.class.isAssignableFrom(cls) ? new C5260b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C5368a.m22162b(((ParameterizedType) type).getActualTypeArguments()[0]).mo15578c())) ? new C5262d(this) : new C5261c(this);
        }
        return null;
    }

    /* renamed from: d */
    private <T> C5286i<T> m21885d(Type type, Class<? super T> cls) {
        return new C5263e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C5286i<T> mo15429a(C5368a<T> aVar) {
        Type e = aVar.mo15579e();
        Class<? super T> c = aVar.mo15578c();
        C5229h hVar = this.f15318a.get(e);
        if (hVar != null) {
            return new C5264f(this, hVar, e);
        }
        C5229h hVar2 = this.f15318a.get(c);
        if (hVar2 != null) {
            return new C5265g(this, hVar2, e);
        }
        C5286i<T> b = m21883b(c);
        if (b != null) {
            return b;
        }
        C5286i<T> c2 = m21884c(e, c);
        return c2 != null ? c2 : m21885d(e, c);
    }

    public String toString() {
        return this.f15318a.toString();
    }
}
