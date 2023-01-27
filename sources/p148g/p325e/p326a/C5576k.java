package p148g.p325e.p326a;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p148g.p325e.p327b.C5588a;
import p148g.p325e.p327b.C5590c;

/* renamed from: g.e.a.k */
public class C5576k implements Cloneable {

    /* renamed from: p */
    private static final C5579l f16090p = new C5556f();

    /* renamed from: q */
    private static final C5579l f16091q = new C5554d();

    /* renamed from: r */
    private static Class[] f16092r;

    /* renamed from: s */
    private static Class[] f16093s;

    /* renamed from: t */
    private static Class[] f16094t;

    /* renamed from: u */
    private static final HashMap<Class, HashMap<String, Method>> f16095u = new HashMap<>();

    /* renamed from: v */
    private static final HashMap<Class, HashMap<String, Method>> f16096v = new HashMap<>();

    /* renamed from: f */
    String f16097f;

    /* renamed from: g */
    protected C5590c f16098g;

    /* renamed from: h */
    Method f16099h;

    /* renamed from: i */
    private Method f16100i;

    /* renamed from: j */
    Class f16101j;

    /* renamed from: k */
    C5559h f16102k;

    /* renamed from: l */
    final ReentrantReadWriteLock f16103l;

    /* renamed from: m */
    final Object[] f16104m;

    /* renamed from: n */
    private C5579l f16105n;

    /* renamed from: o */
    private Object f16106o;

    /* renamed from: g.e.a.k$b */
    static class C5578b extends C5576k {

        /* renamed from: w */
        private C5588a f16107w;

        /* renamed from: x */
        C5555e f16108x;

        /* renamed from: y */
        float f16109y;

        public C5578b(C5590c cVar, float... fArr) {
            super(cVar);
            mo16041q(fArr);
            if (cVar instanceof C5588a) {
                this.f16107w = (C5588a) this.f16098g;
            }
        }

        public C5578b(String str, float... fArr) {
            super(str);
            mo16041q(fArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16033b(float f) {
            this.f16109y = this.f16108x.mo15981f(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object mo16036d() {
            return Float.valueOf(this.f16109y);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo16039n(Object obj) {
            String str;
            C5588a aVar = this.f16107w;
            if (aVar != null) {
                aVar.mo16006e(obj, this.f16109y);
                return;
            }
            C5590c cVar = this.f16098g;
            if (cVar != null) {
                cVar.mo16065c(obj, Float.valueOf(this.f16109y));
                return;
            } else if (this.f16099h != null) {
                try {
                    this.f16104m[0] = Float.valueOf(this.f16109y);
                    this.f16099h.invoke(obj, this.f16104m);
                    return;
                } catch (InvocationTargetException e) {
                    str = e.toString();
                } catch (IllegalAccessException e2) {
                    str = e2.toString();
                }
            } else {
                return;
            }
            Log.e("PropertyValuesHolder", str);
        }

        /* renamed from: q */
        public void mo16041q(float... fArr) {
            C5576k.super.mo16041q(fArr);
            this.f16108x = (C5555e) this.f16102k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo16045u(Class cls) {
            if (this.f16098g == null) {
                C5576k.super.mo16045u(cls);
            }
        }

        /* renamed from: y */
        public C5578b clone() {
            C5578b bVar = (C5578b) C5576k.super.clone();
            bVar.f16108x = (C5555e) bVar.f16102k;
            return bVar;
        }
    }

    static {
        Class<Integer> cls = Integer.class;
        Class<Double> cls2 = Double.class;
        Class<Float> cls3 = Float.class;
        Class cls4 = Integer.TYPE;
        f16092r = new Class[]{Float.TYPE, cls3, Double.TYPE, cls4, cls2, cls};
        Class cls5 = Double.TYPE;
        f16093s = new Class[]{cls4, cls, Float.TYPE, cls5, cls3, cls2};
        f16094t = new Class[]{cls5, cls2, Float.TYPE, Integer.TYPE, cls3, cls};
    }

    private C5576k(C5590c cVar) {
        this.f16099h = null;
        this.f16100i = null;
        this.f16102k = null;
        this.f16103l = new ReentrantReadWriteLock();
        this.f16104m = new Object[1];
        this.f16098g = cVar;
        if (cVar != null) {
            this.f16097f = cVar.mo16068b();
        }
    }

    private C5576k(String str) {
        this.f16099h = null;
        this.f16100i = null;
        this.f16102k = null;
        this.f16103l = new ReentrantReadWriteLock();
        this.f16104m = new Object[1];
        this.f16097f = str;
    }

    /* renamed from: e */
    static String m23042e(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char upperCase = Character.toUpperCase(str2.charAt(0));
        String substring = str2.substring(1);
        return str + upperCase + substring;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:21|22|23|25|26|34|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0073 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method m23043f(java.lang.Class r9, java.lang.String r10, java.lang.Class r11) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f16097f
            java.lang.String r10 = m23042e(r10, r0)
            java.lang.String r0 = "PropertyValuesHolder"
            r1 = 0
            r2 = 1
            if (r11 != 0) goto L_0x0034
            java.lang.reflect.Method r9 = r9.getMethod(r10, r1)     // Catch:{ NoSuchMethodException -> 0x0012 }
            goto L_0x00a1
        L_0x0012:
            r11 = move-exception
            java.lang.reflect.Method r1 = r9.getDeclaredMethod(r10, r1)     // Catch:{ NoSuchMethodException -> 0x001c }
            r1.setAccessible(r2)     // Catch:{ NoSuchMethodException -> 0x001c }
            goto L_0x00a0
        L_0x001c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Couldn't find no-arg method for property "
            r9.append(r10)
            java.lang.String r10 = r8.f16097f
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r11)
            goto L_0x0099
        L_0x0034:
            java.lang.Class[] r11 = new java.lang.Class[r2]
            java.lang.Class r3 = r8.f16101j
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0044
            java.lang.Class[] r3 = f16092r
            goto L_0x0064
        L_0x0044:
            java.lang.Class r3 = r8.f16101j
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0051
            java.lang.Class[] r3 = f16093s
            goto L_0x0064
        L_0x0051:
            java.lang.Class r3 = r8.f16101j
            java.lang.Class<java.lang.Double> r5 = java.lang.Double.class
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x005e
            java.lang.Class[] r3 = f16094t
            goto L_0x0064
        L_0x005e:
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class r5 = r8.f16101j
            r3[r4] = r5
        L_0x0064:
            int r5 = r3.length
            r6 = 0
        L_0x0066:
            if (r6 >= r5) goto L_0x0080
            r7 = r3[r6]
            r11[r4] = r7
            java.lang.reflect.Method r1 = r9.getMethod(r10, r11)     // Catch:{ NoSuchMethodException -> 0x0073 }
            r8.f16101j = r7     // Catch:{ NoSuchMethodException -> 0x0073 }
            return r1
        L_0x0073:
            java.lang.reflect.Method r1 = r9.getDeclaredMethod(r10, r11)     // Catch:{ NoSuchMethodException -> 0x007d }
            r1.setAccessible(r2)     // Catch:{ NoSuchMethodException -> 0x007d }
            r8.f16101j = r7     // Catch:{ NoSuchMethodException -> 0x007d }
            return r1
        L_0x007d:
            int r6 = r6 + 1
            goto L_0x0066
        L_0x0080:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Couldn't find setter/getter for property "
            r9.append(r10)
            java.lang.String r10 = r8.f16097f
            r9.append(r10)
            java.lang.String r10 = " with value type "
            r9.append(r10)
            java.lang.Class r10 = r8.f16101j
            r9.append(r10)
        L_0x0099:
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r0, r9)
        L_0x00a0:
            r9 = r1
        L_0x00a1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p325e.p326a.C5576k.m23043f(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: k */
    public static C5576k m23044k(C5590c<?, Float> cVar, float... fArr) {
        return new C5578b((C5590c) cVar, fArr);
    }

    /* renamed from: l */
    public static C5576k m23045l(String str, float... fArr) {
        return new C5578b(str, fArr);
    }

    /* renamed from: t */
    private void m23046t(Class cls) {
        this.f16100i = m23047x(cls, f16096v, "get", (Class) null);
    }

    /* renamed from: x */
    private Method m23047x(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.f16103l.writeLock().lock();
            HashMap hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? (Method) hashMap2.get(this.f16097f) : null;
            if (method == null) {
                method = m23043f(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f16097f, method);
            }
            return method;
        } finally {
            this.f16103l.writeLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16033b(float f) {
        this.f16106o = this.f16102k.mo15978b(f);
    }

    /* renamed from: c */
    public C5576k clone() {
        try {
            C5576k kVar = (C5576k) super.clone();
            kVar.f16097f = this.f16097f;
            kVar.f16098g = this.f16098g;
            kVar.f16102k = this.f16102k.mo15977a();
            kVar.f16105n = this.f16105n;
            return kVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo16036d() {
        return this.f16106o;
    }

    /* renamed from: g */
    public String mo16037g() {
        return this.f16097f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo16038i() {
        if (this.f16105n == null) {
            Class<Float> cls = this.f16101j;
            this.f16105n = cls == Integer.class ? f16090p : cls == Float.class ? f16091q : null;
        }
        C5579l lVar = this.f16105n;
        if (lVar != null) {
            this.f16102k.mo15993d(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo16039n(Object obj) {
        String str;
        C5590c cVar = this.f16098g;
        if (cVar != null) {
            cVar.mo16065c(obj, mo16036d());
        }
        if (this.f16099h != null) {
            try {
                this.f16104m[0] = mo16036d();
                this.f16099h.invoke(obj, this.f16104m);
                return;
            } catch (InvocationTargetException e) {
                str = e.toString();
            } catch (IllegalAccessException e2) {
                str = e2.toString();
            }
        } else {
            return;
        }
        Log.e("PropertyValuesHolder", str);
    }

    /* renamed from: p */
    public void mo16040p(C5579l lVar) {
        this.f16105n = lVar;
        this.f16102k.mo15993d(lVar);
    }

    /* renamed from: q */
    public void mo16041q(float... fArr) {
        this.f16101j = Float.TYPE;
        this.f16102k = C5559h.m22972c(fArr);
    }

    /* renamed from: r */
    public void mo16042r(C5590c cVar) {
        this.f16098g = cVar;
    }

    /* renamed from: s */
    public void mo16043s(String str) {
        this.f16097f = str;
    }

    public String toString() {
        return this.f16097f + ": " + this.f16102k.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo16045u(Class cls) {
        this.f16099h = m23047x(cls, f16095u, "set", this.f16101j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo16046v(Object obj) {
        String str;
        C5590c cVar = this.f16098g;
        if (cVar != null) {
            try {
                cVar.mo16005a(obj);
                Iterator<C5557g> it = this.f16102k.f16070d.iterator();
                while (it.hasNext()) {
                    C5557g next = it.next();
                    if (!next.mo15988f()) {
                        next.mo15990l(this.f16098g.mo16005a(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f16098g.mo16068b() + ") on target object " + obj + ". Trying reflection instead");
                this.f16098g = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f16099h == null) {
            mo16045u(cls);
        }
        Iterator<C5557g> it2 = this.f16102k.f16070d.iterator();
        while (it2.hasNext()) {
            C5557g next2 = it2.next();
            if (!next2.mo15988f()) {
                if (this.f16100i == null) {
                    m23046t(cls);
                }
                try {
                    next2.mo15990l(this.f16100i.invoke(obj, new Object[0]));
                } catch (InvocationTargetException e) {
                    str = e.toString();
                } catch (IllegalAccessException e2) {
                    str = e2.toString();
                }
            }
        }
        return;
        Log.e("PropertyValuesHolder", str);
    }
}
