package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p148g.p189d.p281b.p284g.C5191a;
import p148g.p189d.p281b.p284g.C5192b;
import p148g.p189d.p281b.p284g.C5193c;
import p148g.p189d.p281b.p284g.C5194d;

/* renamed from: com.google.firebase.components.r */
class C2530r implements C5194d, C5193c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C5192b<Object>, Executor>> f8213a = new HashMap();

    /* renamed from: b */
    private Queue<C5191a<?>> f8214b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f8215c;

    C2530r(Executor executor) {
        this.f8215c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<C5192b<Object>, Executor>> m11333d(C5191a<?> aVar) {
        Map map;
        map = this.f8213a.get(aVar.mo15317b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public <T> void mo9401a(Class<T> cls, C5192b<? super T> bVar) {
        mo9402b(cls, this.f8215c, bVar);
    }

    /* renamed from: b */
    public synchronized <T> void mo9402b(Class<T> cls, Executor executor, C5192b<? super T> bVar) {
        C2533u.m11340b(cls);
        C2533u.m11340b(bVar);
        C2533u.m11340b(executor);
        if (!this.f8213a.containsKey(cls)) {
            this.f8213a.put(cls, new ConcurrentHashMap());
        }
        this.f8213a.get(cls).put(bVar, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9403c() {
        Queue<C5191a<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.f8214b != null) {
                Queue<C5191a<?>> queue2 = this.f8214b;
                this.f8214b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C5191a f : queue) {
                mo9404f(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C2529q.m11332a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m11333d(r4).iterator();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9404f(p148g.p189d.p281b.p284g.C5191a<?> r4) {
        /*
            r3 = this;
            com.google.firebase.components.C2533u.m11340b(r4)
            monitor-enter(r3)
            java.util.Queue<g.d.b.g.a<?>> r0 = r3.f8214b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<g.d.b.g.a<?>> r0 = r3.f8214b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m11333d(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C2529q.m11332a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2530r.mo9404f(g.d.b.g.a):void");
    }
}
