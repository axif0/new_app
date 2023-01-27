package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
class C2244b {

    /* renamed from: e */
    private static C2244b f7396e;

    /* renamed from: a */
    private final Object f7397a = new Object();

    /* renamed from: b */
    private final Handler f7398b = new Handler(Looper.getMainLooper(), new C2245a());

    /* renamed from: c */
    private C2247c f7399c;

    /* renamed from: d */
    private C2247c f7400d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    class C2245a implements Handler.Callback {
        C2245a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2244b.this.mo8724d((C2247c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    interface C2246b {
        /* renamed from: a */
        void mo8683a();

        /* renamed from: b */
        void mo8684b(int i);
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    private static class C2247c {

        /* renamed from: a */
        final WeakReference<C2246b> f7402a;

        /* renamed from: b */
        int f7403b;

        /* renamed from: c */
        boolean f7404c;

        C2247c(int i, C2246b bVar) {
            this.f7402a = new WeakReference<>(bVar);
            this.f7403b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8733a(C2246b bVar) {
            return bVar != null && this.f7402a.get() == bVar;
        }
    }

    private C2244b() {
    }

    /* renamed from: a */
    private boolean m10417a(C2247c cVar, int i) {
        C2246b bVar = (C2246b) cVar.f7402a.get();
        if (bVar == null) {
            return false;
        }
        this.f7398b.removeCallbacksAndMessages(cVar);
        bVar.mo8684b(i);
        return true;
    }

    /* renamed from: c */
    static C2244b m10418c() {
        if (f7396e == null) {
            f7396e = new C2244b();
        }
        return f7396e;
    }

    /* renamed from: g */
    private boolean m10419g(C2246b bVar) {
        C2247c cVar = this.f7399c;
        return cVar != null && cVar.mo8733a(bVar);
    }

    /* renamed from: h */
    private boolean m10420h(C2246b bVar) {
        C2247c cVar = this.f7400d;
        return cVar != null && cVar.mo8733a(bVar);
    }

    /* renamed from: m */
    private void m10421m(C2247c cVar) {
        int i = cVar.f7403b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f7398b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f7398b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: o */
    private void m10422o() {
        C2247c cVar = this.f7400d;
        if (cVar != null) {
            this.f7399c = cVar;
            this.f7400d = null;
            C2246b bVar = (C2246b) cVar.f7402a.get();
            if (bVar != null) {
                bVar.mo8683a();
            } else {
                this.f7399c = null;
            }
        }
    }

    /* renamed from: b */
    public void mo8723b(C2246b bVar, int i) {
        C2247c cVar;
        synchronized (this.f7397a) {
            if (m10419g(bVar)) {
                cVar = this.f7399c;
            } else if (m10420h(bVar)) {
                cVar = this.f7400d;
            }
            m10417a(cVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8724d(C2247c cVar) {
        synchronized (this.f7397a) {
            if (this.f7399c == cVar || this.f7400d == cVar) {
                m10417a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo8725e(C2246b bVar) {
        boolean g;
        synchronized (this.f7397a) {
            g = m10419g(bVar);
        }
        return g;
    }

    /* renamed from: f */
    public boolean mo8726f(C2246b bVar) {
        boolean z;
        synchronized (this.f7397a) {
            if (!m10419g(bVar)) {
                if (!m10420h(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    public void mo8727i(C2246b bVar) {
        synchronized (this.f7397a) {
            if (m10419g(bVar)) {
                this.f7399c = null;
                if (this.f7400d != null) {
                    m10422o();
                }
            }
        }
    }

    /* renamed from: j */
    public void mo8728j(C2246b bVar) {
        synchronized (this.f7397a) {
            if (m10419g(bVar)) {
                m10421m(this.f7399c);
            }
        }
    }

    /* renamed from: k */
    public void mo8729k(C2246b bVar) {
        synchronized (this.f7397a) {
            if (m10419g(bVar) && !this.f7399c.f7404c) {
                this.f7399c.f7404c = true;
                this.f7398b.removeCallbacksAndMessages(this.f7399c);
            }
        }
    }

    /* renamed from: l */
    public void mo8730l(C2246b bVar) {
        synchronized (this.f7397a) {
            if (m10419g(bVar) && this.f7399c.f7404c) {
                this.f7399c.f7404c = false;
                m10421m(this.f7399c);
            }
        }
    }

    /* renamed from: n */
    public void mo8731n(int i, C2246b bVar) {
        synchronized (this.f7397a) {
            if (m10419g(bVar)) {
                this.f7399c.f7403b = i;
                this.f7398b.removeCallbacksAndMessages(this.f7399c);
                m10421m(this.f7399c);
                return;
            }
            if (m10420h(bVar)) {
                this.f7400d.f7403b = i;
            } else {
                this.f7400d = new C2247c(i, bVar);
            }
            if (this.f7399c == null || !m10417a(this.f7399c, 4)) {
                this.f7399c = null;
                m10422o();
            }
        }
    }
}
