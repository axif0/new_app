package com.squareup.picasso;

import com.squareup.picasso.C2748d0;
import com.squareup.picasso.C2776t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.v */
class C2787v extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.v$a */
    private static final class C2788a extends FutureTask<C2739c> implements Comparable<C2788a> {

        /* renamed from: f */
        private final C2739c f8904f;

        C2788a(C2739c cVar) {
            super(cVar, (Object) null);
            this.f8904f = cVar;
        }

        /* renamed from: e */
        public int compareTo(C2788a aVar) {
            C2776t.C2783f r = this.f8904f.mo10023r();
            C2776t.C2783f r2 = aVar.f8904f.mo10023r();
            return r == r2 ? this.f8904f.f8770f - aVar.f8904f.f8770f : r2.ordinal() - r.ordinal();
        }
    }

    C2787v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C2748d0.C2751c());
    }

    /* renamed from: b */
    private void m12245b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r4 = 2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10114a(android.net.NetworkInfo r4) {
        /*
            r3 = this;
            r0 = 3
            if (r4 == 0) goto L_0x0034
            boolean r1 = r4.isConnectedOrConnecting()
            if (r1 != 0) goto L_0x000a
            goto L_0x0034
        L_0x000a:
            int r1 = r4.getType()
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r2) goto L_0x001e
            r4 = 6
            if (r1 == r4) goto L_0x001e
            r4 = 9
            if (r1 == r4) goto L_0x001e
        L_0x001a:
            r3.m12245b(r0)
            goto L_0x0033
        L_0x001e:
            r4 = 4
        L_0x001f:
            r3.m12245b(r4)
            goto L_0x0033
        L_0x0023:
            int r4 = r4.getSubtype()
            switch(r4) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r4) {
                case 12: goto L_0x002e;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x001a;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x001a
        L_0x002e:
            r4 = 2
            goto L_0x001f
        L_0x0030:
            r3.m12245b(r2)
        L_0x0033:
            return
        L_0x0034:
            r3.m12245b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C2787v.mo10114a(android.net.NetworkInfo):void");
    }

    public Future<?> submit(Runnable runnable) {
        C2788a aVar = new C2788a((C2739c) runnable);
        execute(aVar);
        return aVar;
    }
}
