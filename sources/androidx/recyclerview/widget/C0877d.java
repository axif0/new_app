package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.d */
class C0877d {

    /* renamed from: a */
    final C0879b f3524a;

    /* renamed from: b */
    final C0878a f3525b = new C0878a();

    /* renamed from: c */
    final List<View> f3526c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.d$a */
    static class C0878a {

        /* renamed from: a */
        long f3527a = 0;

        /* renamed from: b */
        C0878a f3528b;

        C0878a() {
        }

        /* renamed from: c */
        private void m4937c() {
            if (this.f3528b == null) {
                this.f3528b = new C0878a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4727a(int i) {
            if (i >= 64) {
                C0878a aVar = this.f3528b;
                if (aVar != null) {
                    aVar.mo4727a(i - 64);
                    return;
                }
                return;
            }
            this.f3527a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4728b(int i) {
            C0878a aVar = this.f3528b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f3527a) : Long.bitCount(this.f3527a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3527a & ((1 << i) - 1)) : aVar.mo4728b(i - 64) + Long.bitCount(this.f3527a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4729d(int i) {
            if (i < 64) {
                return (this.f3527a & (1 << i)) != 0;
            }
            m4937c();
            return this.f3528b.mo4729d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4730e(int i, boolean z) {
            if (i >= 64) {
                m4937c();
                this.f3528b.mo4730e(i - 64, z);
                return;
            }
            boolean z2 = (this.f3527a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f3527a;
            this.f3527a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                mo4733h(i);
            } else {
                mo4727a(i);
            }
            if (z2 || this.f3528b != null) {
                m4937c();
                this.f3528b.mo4730e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo4731f(int i) {
            if (i >= 64) {
                m4937c();
                return this.f3528b.mo4731f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3527a & j) != 0;
            long j2 = this.f3527a & (j ^ -1);
            this.f3527a = j2;
            long j3 = j - 1;
            this.f3527a = (j2 & j3) | Long.rotateRight((j3 ^ -1) & j2, 1);
            C0878a aVar = this.f3528b;
            if (aVar != null) {
                if (aVar.mo4729d(0)) {
                    mo4733h(63);
                }
                this.f3528b.mo4731f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4732g() {
            this.f3527a = 0;
            C0878a aVar = this.f3528b;
            if (aVar != null) {
                aVar.mo4732g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4733h(int i) {
            if (i >= 64) {
                m4937c();
                this.f3528b.mo4733h(i - 64);
                return;
            }
            this.f3527a |= 1 << i;
        }

        public String toString() {
            if (this.f3528b == null) {
                return Long.toBinaryString(this.f3527a);
            }
            return this.f3528b.toString() + "xx" + Long.toBinaryString(this.f3527a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    interface C0879b {
        /* renamed from: a */
        View mo4335a(int i);

        /* renamed from: b */
        void mo4336b(View view);

        /* renamed from: c */
        RecyclerView.C0829d0 mo4337c(View view);

        /* renamed from: d */
        void mo4338d(int i);

        /* renamed from: e */
        void mo4339e(View view);

        /* renamed from: f */
        void mo4340f(View view, int i);

        /* renamed from: g */
        int mo4341g();

        /* renamed from: h */
        void mo4342h(int i);

        /* renamed from: i */
        void mo4343i();

        /* renamed from: j */
        void mo4344j(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: k */
        int mo4345k(View view);
    }

    C0877d(C0879b bVar) {
        this.f3524a = bVar;
    }

    /* renamed from: h */
    private int m4917h(int i) {
        if (i < 0) {
            return -1;
        }
        int g = this.f3524a.mo4341g();
        int i2 = i;
        while (i2 < g) {
            int b = i - (i2 - this.f3525b.mo4728b(i2));
            if (b == 0) {
                while (this.f3525b.mo4729d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m4918l(View view) {
        this.f3526c.add(view);
        this.f3524a.mo4336b(view);
    }

    /* renamed from: t */
    private boolean m4919t(View view) {
        if (!this.f3526c.remove(view)) {
            return false;
        }
        this.f3524a.mo4339e(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4709a(View view, int i, boolean z) {
        int g = i < 0 ? this.f3524a.mo4341g() : m4917h(i);
        this.f3525b.mo4730e(g, z);
        if (z) {
            m4918l(view);
        }
        this.f3524a.mo4340f(view, g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4710b(View view, boolean z) {
        mo4709a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4711c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int g = i < 0 ? this.f3524a.mo4341g() : m4917h(i);
        this.f3525b.mo4730e(g, z);
        if (z) {
            m4918l(view);
        }
        this.f3524a.mo4344j(view, g, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4712d(int i) {
        int h = m4917h(i);
        this.f3525b.mo4731f(h);
        this.f3524a.mo4338d(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo4713e(int i) {
        int size = this.f3526c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3526c.get(i2);
            RecyclerView.C0829d0 c = this.f3524a.mo4337c(view);
            if (c.mo4320m() == i && !c.mo4327t() && !c.mo4330v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo4714f(int i) {
        return this.f3524a.mo4335a(m4917h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4715g() {
        return this.f3524a.mo4341g() - this.f3526c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo4716i(int i) {
        return this.f3524a.mo4335a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4717j() {
        return this.f3524a.mo4341g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4718k(View view) {
        int k = this.f3524a.mo4345k(view);
        if (k >= 0) {
            this.f3525b.mo4733h(k);
            m4918l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4719m(View view) {
        int k = this.f3524a.mo4345k(view);
        if (k != -1 && !this.f3525b.mo4729d(k)) {
            return k - this.f3525b.mo4728b(k);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4720n(View view) {
        return this.f3526c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4721o() {
        this.f3525b.mo4732g();
        for (int size = this.f3526c.size() - 1; size >= 0; size--) {
            this.f3524a.mo4339e(this.f3526c.get(size));
            this.f3526c.remove(size);
        }
        this.f3524a.mo4343i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4722p(View view) {
        int k = this.f3524a.mo4345k(view);
        if (k >= 0) {
            if (this.f3525b.mo4731f(k)) {
                m4919t(view);
            }
            this.f3524a.mo4342h(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4723q(int i) {
        int h = m4917h(i);
        View a = this.f3524a.mo4335a(h);
        if (a != null) {
            if (this.f3525b.mo4731f(h)) {
                m4919t(a);
            }
            this.f3524a.mo4342h(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4724r(View view) {
        int k = this.f3524a.mo4345k(view);
        if (k == -1) {
            m4919t(view);
            return true;
        } else if (!this.f3525b.mo4729d(k)) {
            return false;
        } else {
            this.f3525b.mo4731f(k);
            m4919t(view);
            this.f3524a.mo4342h(k);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4725s(View view) {
        int k = this.f3524a.mo4345k(view);
        if (k < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3525b.mo4729d(k)) {
            this.f3525b.mo4727a(k);
            m4919t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3525b.toString() + ", hidden list:" + this.f3526c.size();
    }
}
