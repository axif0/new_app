package p086f.p087a.p094o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p086f.p111h.p122m.C3418x;
import p086f.p111h.p122m.C3422y;
import p086f.p111h.p122m.C3423z;

/* renamed from: f.a.o.h */
public class C3165h {

    /* renamed from: a */
    final ArrayList<C3418x> f10079a = new ArrayList<>();

    /* renamed from: b */
    private long f10080b = -1;

    /* renamed from: c */
    private Interpolator f10081c;

    /* renamed from: d */
    C3422y f10082d;

    /* renamed from: e */
    private boolean f10083e;

    /* renamed from: f */
    private final C3423z f10084f = new C3166a();

    /* renamed from: f.a.o.h$a */
    class C3166a extends C3423z {

        /* renamed from: a */
        private boolean f10085a = false;

        /* renamed from: b */
        private int f10086b = 0;

        C3166a() {
        }

        /* renamed from: b */
        public void mo928b(View view) {
            int i = this.f10086b + 1;
            this.f10086b = i;
            if (i == C3165h.this.f10079a.size()) {
                C3422y yVar = C3165h.this.f10082d;
                if (yVar != null) {
                    yVar.mo928b((View) null);
                }
                mo10956d();
            }
        }

        /* renamed from: c */
        public void mo929c(View view) {
            if (!this.f10085a) {
                this.f10085a = true;
                C3422y yVar = C3165h.this.f10082d;
                if (yVar != null) {
                    yVar.mo929c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo10956d() {
            this.f10086b = 0;
            this.f10085a = false;
            C3165h.this.mo10949b();
        }
    }

    /* renamed from: a */
    public void mo10948a() {
        if (this.f10083e) {
            Iterator<C3418x> it = this.f10079a.iterator();
            while (it.hasNext()) {
                it.next().mo11731b();
            }
            this.f10083e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10949b() {
        this.f10083e = false;
    }

    /* renamed from: c */
    public C3165h mo10950c(C3418x xVar) {
        if (!this.f10083e) {
            this.f10079a.add(xVar);
        }
        return this;
    }

    /* renamed from: d */
    public C3165h mo10951d(C3418x xVar, C3418x xVar2) {
        this.f10079a.add(xVar);
        xVar2.mo11736h(xVar.mo11732c());
        this.f10079a.add(xVar2);
        return this;
    }

    /* renamed from: e */
    public C3165h mo10952e(long j) {
        if (!this.f10083e) {
            this.f10080b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C3165h mo10953f(Interpolator interpolator) {
        if (!this.f10083e) {
            this.f10081c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C3165h mo10954g(C3422y yVar) {
        if (!this.f10083e) {
            this.f10082d = yVar;
        }
        return this;
    }

    /* renamed from: h */
    public void mo10955h() {
        if (!this.f10083e) {
            Iterator<C3418x> it = this.f10079a.iterator();
            while (it.hasNext()) {
                C3418x next = it.next();
                long j = this.f10080b;
                if (j >= 0) {
                    next.mo11733d(j);
                }
                Interpolator interpolator = this.f10081c;
                if (interpolator != null) {
                    next.mo11734e(interpolator);
                }
                if (this.f10082d != null) {
                    next.mo11735f(this.f10084f);
                }
                next.mo11738j();
            }
            this.f10083e = true;
        }
    }
}
