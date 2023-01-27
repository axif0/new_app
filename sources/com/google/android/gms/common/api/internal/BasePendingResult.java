package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C1564h;
import com.google.android.gms.common.api.C1566i;
import com.google.android.gms.common.api.C1606j;
import com.google.android.gms.common.api.C1607k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1658o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p148g.p189d.p190a.p232c.p241f.p243b.C4413d;

@KeepName
public abstract class BasePendingResult<R extends C1606j> extends C1564h<R> {

    /* renamed from: a */
    private final Object f5323a = new Object();

    /* renamed from: b */
    private final C1567a<R> f5324b = new C1567a<>(Looper.getMainLooper());

    /* renamed from: c */
    private final CountDownLatch f5325c = new CountDownLatch(1);

    /* renamed from: d */
    private final ArrayList<C1564h.C1565a> f5326d = new ArrayList<>();

    /* renamed from: e */
    private C1607k<? super R> f5327e;

    /* renamed from: f */
    private final AtomicReference<C1571a0> f5328f = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public R f5329g;

    /* renamed from: h */
    private Status f5330h;

    /* renamed from: i */
    private volatile boolean f5331i;

    /* renamed from: j */
    private boolean f5332j;

    /* renamed from: k */
    private boolean f5333k;
    @KeepName
    private C1568b mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C1567a<R extends C1606j> extends C4413d {
        public C1567a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo6358a(C1607k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C1607k kVar = (C1607k) pair.first;
                C1606j jVar = (C1606j) pair.second;
                try {
                    kVar.mo6438a(jVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m7537g(jVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo6357h(Status.f5309k);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C1568b {
        private C1568b() {
        }

        /* synthetic */ C1568b(BasePendingResult basePendingResult, C1586g0 g0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m7537g(BasePendingResult.this.f5329g);
            super.finalize();
        }
    }

    static {
        new C1586g0();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference((Object) null);
    }

    /* renamed from: b */
    private final R m7534b() {
        R r;
        synchronized (this.f5323a) {
            C1658o.m7849n(!this.f5331i, "Result has already been consumed.");
            C1658o.m7849n(mo6355c(), "Result is not ready.");
            r = this.f5329g;
            this.f5329g = null;
            this.f5327e = null;
            this.f5331i = true;
        }
        C1571a0 andSet = this.f5328f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo6375a(this);
        }
        return r;
    }

    /* renamed from: f */
    private final void m7536f(R r) {
        this.f5329g = r;
        this.f5325c.countDown();
        this.f5330h = this.f5329g.mo6314c();
        if (this.f5332j) {
            this.f5327e = null;
        } else if (this.f5327e != null) {
            this.f5324b.removeMessages(2);
            this.f5324b.mo6358a(this.f5327e, m7534b());
        } else if (this.f5329g instanceof C1566i) {
            this.mResultGuardian = new C1568b(this, (C1586g0) null);
        }
        ArrayList<C1564h.C1565a> arrayList = this.f5326d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1564h.C1565a aVar = arrayList.get(i);
            i++;
            aVar.mo6352a(this.f5330h);
        }
        this.f5326d.clear();
    }

    /* renamed from: g */
    public static void m7537g(C1606j jVar) {
        if (jVar instanceof C1566i) {
            try {
                ((C1566i) jVar).mo6353a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo6354a(Status status);

    /* renamed from: c */
    public final boolean mo6355c() {
        return this.f5325c.getCount() == 0;
    }

    /* renamed from: d */
    public final void mo6356d(R r) {
        synchronized (this.f5323a) {
            if (this.f5333k || this.f5332j) {
                m7537g(r);
                return;
            }
            mo6355c();
            boolean z = true;
            C1658o.m7849n(!mo6355c(), "Results have already been set");
            if (this.f5331i) {
                z = false;
            }
            C1658o.m7849n(z, "Result has already been consumed");
            m7536f(r);
        }
    }

    /* renamed from: h */
    public final void mo6357h(Status status) {
        synchronized (this.f5323a) {
            if (!mo6355c()) {
                mo6356d(mo6354a(status));
                this.f5333k = true;
            }
        }
    }
}
