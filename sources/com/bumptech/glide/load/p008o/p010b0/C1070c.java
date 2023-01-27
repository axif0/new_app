package com.bumptech.glide.load.p008o.p010b0;

import com.bumptech.glide.p029s.C1401j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.o.b0.c */
final class C1070c {

    /* renamed from: a */
    private final Map<String, C1071a> f4060a = new HashMap();

    /* renamed from: b */
    private final C1072b f4061b = new C1072b();

    /* renamed from: com.bumptech.glide.load.o.b0.c$a */
    private static class C1071a {

        /* renamed from: a */
        final Lock f4062a = new ReentrantLock();

        /* renamed from: b */
        int f4063b;

        C1071a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.c$b */
    private static class C1072b {

        /* renamed from: a */
        private final Queue<C1071a> f4064a = new ArrayDeque();

        C1072b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1071a mo5284a() {
            C1071a poll;
            synchronized (this.f4064a) {
                poll = this.f4064a.poll();
            }
            return poll == null ? new C1071a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5285b(C1071a aVar) {
            synchronized (this.f4064a) {
                if (this.f4064a.size() < 10) {
                    this.f4064a.offer(aVar);
                }
            }
        }
    }

    C1070c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5282a(String str) {
        C1071a aVar;
        synchronized (this) {
            aVar = this.f4060a.get(str);
            if (aVar == null) {
                aVar = this.f4061b.mo5284a();
                this.f4060a.put(str, aVar);
            }
            aVar.f4063b++;
        }
        aVar.f4062a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5283b(String str) {
        C1071a aVar;
        synchronized (this) {
            C1071a aVar2 = this.f4060a.get(str);
            C1401j.m6972d(aVar2);
            aVar = aVar2;
            if (aVar.f4063b >= 1) {
                int i = aVar.f4063b - 1;
                aVar.f4063b = i;
                if (i == 0) {
                    C1071a remove = this.f4060a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f4061b.mo5285b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f4063b);
            }
        }
        aVar.f4062a.unlock();
    }
}
