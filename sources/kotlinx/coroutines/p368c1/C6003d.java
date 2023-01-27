package kotlinx.coroutines.p368c1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p351k.C5850j;
import p351k.C5853k;
import p351k.C5856n;
import p351k.p361v.C5924a;
import p351k.p361v.p362c.C5937l;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5957h;

/* renamed from: kotlinx.coroutines.c1.d */
public final class C6003d {

    /* renamed from: a */
    private static final int f16953a = m24582d(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f16954b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C5937l<Throwable, Throwable>> f16955c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.c1.d$a */
    public static final class C6004a extends C5957h implements C5937l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f16956f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6004a(Constructor constructor) {
            super(1);
            this.f16956f = constructor;
        }

        /* renamed from: d */
        public final Throwable mo16990c(Throwable th) {
            Object obj;
            C5956g.m24501f(th, "e");
            try {
                C5850j.C5851a aVar = C5850j.f16880f;
                Object newInstance = this.f16956f.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C5850j.m24363a(obj);
                    if (C5850j.m24365c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C5856n("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C5850j.C5851a aVar2 = C5850j.f16880f;
                obj = C5853k.m24367a(th2);
                C5850j.m24363a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.c1.d$b */
    public static final class C6005b extends C5957h implements C5937l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f16957f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6005b(Constructor constructor) {
            super(1);
            this.f16957f = constructor;
        }

        /* renamed from: d */
        public final Throwable mo16990c(Throwable th) {
            Object obj;
            C5956g.m24501f(th, "e");
            try {
                C5850j.C5851a aVar = C5850j.f16880f;
                Object newInstance = this.f16957f.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    C5850j.m24363a(obj);
                    if (C5850j.m24365c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C5856n("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C5850j.C5851a aVar2 = C5850j.f16880f;
                obj = C5853k.m24367a(th2);
                C5850j.m24363a(obj);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.c1.d$c */
    public static final class C6006c extends C5957h implements C5937l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f16958f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6006c(Constructor constructor) {
            super(1);
            this.f16958f = constructor;
        }

        /* renamed from: d */
        public final Throwable mo16990c(Throwable th) {
            Throwable th2;
            C5956g.m24501f(th, "e");
            try {
                C5850j.C5851a aVar = C5850j.f16880f;
                Object newInstance = this.f16958f.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    C5850j.m24363a(th3);
                    th2 = th3;
                    boolean c = C5850j.m24365c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new C5856n("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                C5850j.C5851a aVar2 = C5850j.f16880f;
                Object a = C5853k.m24367a(th5);
                C5850j.m24363a(a);
                th2 = a;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.c1.d$d */
    public static final class C6007d extends C5957h implements C5937l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f16959f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6007d(Constructor constructor) {
            super(1);
            this.f16959f = constructor;
        }

        /* renamed from: d */
        public final Throwable mo16990c(Throwable th) {
            Throwable th2;
            C5956g.m24501f(th, "e");
            try {
                C5850j.C5851a aVar = C5850j.f16880f;
                Object newInstance = this.f16959f.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    C5850j.m24363a(th3);
                    th2 = th3;
                    boolean c = C5850j.m24365c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new C5856n("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                C5850j.C5851a aVar2 = C5850j.f16880f;
                Object a = C5853k.m24367a(th5);
                C5850j.m24363a(a);
                th2 = a;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.c1.d$e */
    public static final class C6008e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            C5956g.m24497b(constructor, "it");
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            C5956g.m24497b(constructor2, "it");
            return C5888b.m24422a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.c1.d$f */
    static final class C6009f extends C5957h implements C5937l {

        /* renamed from: f */
        public static final C6009f f16960f = new C6009f();

        C6009f() {
            super(1);
        }

        /* renamed from: d */
        public final Void mo16990c(Throwable th) {
            C5956g.m24501f(th, "it");
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.c1.d$g */
    static final class C6010g extends C5957h implements C5937l {

        /* renamed from: f */
        public static final C6010g f16961f = new C6010g();

        C6010g() {
            super(1);
        }

        /* renamed from: d */
        public final Void mo16990c(Throwable th) {
            C5956g.m24501f(th, "it");
            return null;
        }
    }

    /* renamed from: a */
    private static final C5937l<Throwable, Throwable> m24579a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C6007d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C5956g.m24496a(cls2, Throwable.class)) {
                return new C6005b(constructor);
            }
            if (C5956g.m24496a(cls2, cls)) {
                return new C6006c(constructor);
            }
        } else if (length == 2 && C5956g.m24496a(parameterTypes[0], cls) && C5956g.m24496a(parameterTypes[1], Throwable.class)) {
            return new C6004a(constructor);
        }
        return null;
    }

    /* renamed from: b */
    private static final int m24580b(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r6.getDeclaredFields();
            C5956g.m24497b(declaredFields, "declaredFields");
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (Field field : declaredFields) {
                C5956g.m24497b(field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m24581c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m24580b(cls, i);
    }

    /* renamed from: d */
    private static final int m24582d(Class<?> cls, int i) {
        Integer num;
        C5924a.m24480b(cls);
        try {
            C5850j.C5851a aVar = C5850j.f16880f;
            num = Integer.valueOf(m24581c(cls, 0, 1, (Object) null));
            C5850j.m24363a(num);
        } catch (Throwable th) {
            C5850j.C5851a aVar2 = C5850j.f16880f;
            num = C5853k.m24367a(th);
            C5850j.m24363a(num);
        }
        Integer valueOf = Integer.valueOf(i);
        if (C5850j.m24365c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: e */
    public static final <E extends java.lang.Throwable> E m24583e(E r9) {
        /*
            java.lang.String r0 = "exception"
            p351k.p361v.p363d.C5956g.m24501f(r9, r0)
            boolean r0 = r9 instanceof kotlinx.coroutines.C6063o
            r1 = 0
            if (r0 == 0) goto L_0x002b
            k.j$a r0 = p351k.C5850j.f16880f     // Catch:{ all -> 0x0016 }
            kotlinx.coroutines.o r9 = (kotlinx.coroutines.C6063o) r9     // Catch:{ all -> 0x0016 }
            java.lang.Throwable r9 = r9.mo17144a()     // Catch:{ all -> 0x0016 }
            p351k.C5850j.m24363a(r9)     // Catch:{ all -> 0x0016 }
            goto L_0x0020
        L_0x0016:
            r9 = move-exception
            k.j$a r0 = p351k.C5850j.f16880f
            java.lang.Object r9 = p351k.C5853k.m24367a(r9)
            p351k.C5850j.m24363a(r9)
        L_0x0020:
            boolean r0 = p351k.C5850j.m24365c(r9)
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r9
        L_0x0028:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x002b:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f16954b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, k.v.c.l<java.lang.Throwable, java.lang.Throwable>> r2 = f16955c     // Catch:{ all -> 0x0128 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x0128 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0128 }
            k.v.c.l r2 = (p351k.p361v.p362c.C5937l) r2     // Catch:{ all -> 0x0128 }
            r0.unlock()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r9 = r2.mo16990c(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x004c:
            int r0 = f16953a
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = m24582d(r2, r3)
            if (r0 == r2) goto L_0x00a1
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f16954b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x006a
            int r4 = r0.getReadHoldCount()
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            r5 = 0
        L_0x006c:
            if (r5 >= r4) goto L_0x0074
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x006c
        L_0x0074:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, k.v.c.l<java.lang.Throwable, java.lang.Throwable>> r5 = f16955c     // Catch:{ all -> 0x0094 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0094 }
            kotlinx.coroutines.c1.d$f r6 = kotlinx.coroutines.p368c1.C6003d.C6009f.f16960f     // Catch:{ all -> 0x0094 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0094 }
            k.q r9 = p351k.C5859q.f16886a     // Catch:{ all -> 0x0094 }
        L_0x0088:
            if (r3 >= r4) goto L_0x0090
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0088
        L_0x0090:
            r0.unlock()
            return r1
        L_0x0094:
            r9 = move-exception
        L_0x0095:
            if (r3 >= r4) goto L_0x009d
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0095
        L_0x009d:
            r0.unlock()
            throw r9
        L_0x00a1:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            java.lang.String r2 = "exception.javaClass.constructors"
            p351k.p361v.p363d.C5956g.m24497b(r0, r2)
            kotlinx.coroutines.c1.d$e r2 = new kotlinx.coroutines.c1.d$e
            r2.<init>()
            java.util.List r0 = p351k.p353r.C5865e.m24382h(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00bc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00d3
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.String r4 = "constructor"
            p351k.p361v.p363d.C5956g.m24497b(r2, r4)
            k.v.c.l r2 = m24579a(r2)
            if (r2 == 0) goto L_0x00bc
        L_0x00d3:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f16954b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00e4
            int r5 = r0.getReadHoldCount()
            goto L_0x00e5
        L_0x00e4:
            r5 = 0
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            if (r6 >= r5) goto L_0x00ee
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x00e6
        L_0x00ee:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, k.v.c.l<java.lang.Throwable, java.lang.Throwable>> r6 = f16955c     // Catch:{ all -> 0x011b }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00ff
            r8 = r2
            goto L_0x0101
        L_0x00ff:
            kotlinx.coroutines.c1.d$g r8 = kotlinx.coroutines.p368c1.C6003d.C6010g.f16961f     // Catch:{ all -> 0x011b }
        L_0x0101:
            r6.put(r7, r8)     // Catch:{ all -> 0x011b }
            k.q r6 = p351k.C5859q.f16886a     // Catch:{ all -> 0x011b }
        L_0x0106:
            if (r3 >= r5) goto L_0x010e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0106
        L_0x010e:
            r0.unlock()
            if (r2 == 0) goto L_0x011a
            java.lang.Object r9 = r2.mo16990c(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x011a:
            return r1
        L_0x011b:
            r9 = move-exception
        L_0x011c:
            if (r3 >= r5) goto L_0x0124
            r4.lock()
            int r3 = r3 + 1
            goto L_0x011c
        L_0x0124:
            r0.unlock()
            throw r9
        L_0x0128:
            r9 = move-exception
            r0.unlock()
            goto L_0x012e
        L_0x012d:
            throw r9
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p368c1.C6003d.m24583e(java.lang.Throwable):java.lang.Throwable");
    }
}
