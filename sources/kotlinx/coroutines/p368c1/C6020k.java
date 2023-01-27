package kotlinx.coroutines.p368c1;

import java.util.ArrayDeque;
import kotlinx.coroutines.C6080v;
import p351k.C5849i;
import p351k.C5850j;
import p351k.C5853k;
import p351k.C5855m;
import p351k.C5856n;
import p351k.p355t.C5895d;
import p351k.p355t.p357i.p358a.C5913d;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.c1.k */
public final class C6020k {

    /* renamed from: a */
    private static final String f16978a;

    static {
        Object obj;
        Object obj2;
        try {
            C5850j.C5851a aVar = C5850j.f16880f;
            Class<?> cls = Class.forName("k.t.i.a.a");
            C5956g.m24497b(cls, "Class.forName(baseContinuationImplClass)");
            obj = cls.getCanonicalName();
            C5850j.m24363a(obj);
        } catch (Throwable th) {
            C5850j.C5851a aVar2 = C5850j.f16880f;
            obj = C5853k.m24367a(th);
            C5850j.m24363a(obj);
        }
        if (C5850j.m24364b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f16978a = (String) obj;
        try {
            C5850j.C5851a aVar3 = C5850j.f16880f;
            Class<?> cls2 = Class.forName("kotlinx.coroutines.c1.k");
            C5956g.m24497b(cls2, "Class.forName(stackTraceRecoveryClass)");
            obj2 = cls2.getCanonicalName();
            C5850j.m24363a(obj2);
        } catch (Throwable th2) {
            C5850j.C5851a aVar4 = C5850j.f16880f;
            obj2 = C5853k.m24367a(th2);
            C5850j.m24363a(obj2);
        }
        if (C5850j.m24364b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    /* renamed from: a */
    public static final StackTraceElement m24633a(String str) {
        C5956g.m24501f(str, "message");
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* renamed from: b */
    private static final <E extends Throwable> C5849i<E, StackTraceElement[]> m24634b(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C5956g.m24496a(cause.getClass(), e.getClass())) {
            return C5855m.m24370a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        C5956g.m24497b(stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            C5956g.m24497b(stackTraceElement, "it");
            if (m24639g(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        return z ? C5855m.m24370a(cause, stackTrace) : C5855m.m24370a(e, new StackTraceElement[0]);
    }

    /* renamed from: c */
    private static final <E extends Throwable> E m24635c(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m24633a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        C5956g.m24497b(stackTrace, "causeTrace");
        String str = f16978a;
        C5956g.m24497b(str, "baseContinuationImplClassName");
        int f = m24638f(stackTrace, str);
        int i = 0;
        if (f == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new C5856n("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + f)];
        for (int i2 = 0; i2 < f; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[f + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[EDGE_INSN: B:12:0x0022->B:11:0x0022 ?: BREAK  
    EDGE_INSN: B:13:0x0022->B:11:0x0022 ?: BREAK  , RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: d */
    private static final java.util.ArrayDeque<java.lang.StackTraceElement> m24636d(p351k.p355t.p357i.p358a.C5913d r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.mo16976e()
            if (r1 == 0) goto L_0x000e
        L_0x000b:
            r0.add(r1)
        L_0x000e:
            boolean r1 = r2 instanceof p351k.p355t.p357i.p358a.C5913d
            if (r1 != 0) goto L_0x0013
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0022
            k.t.i.a.d r2 = r2.mo16975a()
            if (r2 == 0) goto L_0x0022
            java.lang.StackTraceElement r1 = r2.mo16976e()
            if (r1 == 0) goto L_0x000e
            goto L_0x000b
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p368c1.C6020k.m24636d(k.t.i.a.d):java.util.ArrayDeque");
    }

    /* renamed from: e */
    private static final boolean m24637e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C5956g.m24496a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C5956g.m24496a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C5956g.m24496a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: f */
    private static final int m24638f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C5956g.m24496a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static final boolean m24639g(StackTraceElement stackTraceElement) {
        C5956g.m24501f(stackTraceElement, "$this$isArtificial");
        String className = stackTraceElement.getClassName();
        C5956g.m24497b(className, "className");
        return C5838l.m24338d(className, "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: h */
    private static final void m24640h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m24639g(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                C5956g.m24497b(last, "result.last");
                if (m24637e(stackTraceElement, last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private static final <E extends Throwable> E m24641i(E e, C5913d dVar) {
        C5849i b = m24634b(e);
        E e2 = (Throwable) b.mo16858a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b.mo16859b();
        E e3 = C6003d.m24583e(e2);
        if (e3 == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> d = m24636d(dVar);
        if (d.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m24640h(stackTraceElementArr, d);
        }
        m24635c(e2, e3, d);
        return e3;
    }

    /* renamed from: j */
    public static final <E extends Throwable> E m24642j(E e, C5895d<?> dVar) {
        C5956g.m24501f(e, "exception");
        C5956g.m24501f(dVar, "continuation");
        return (!C6080v.m24815c() || !(dVar instanceof C5913d)) ? e : m24641i(e, (C5913d) dVar);
    }
}
