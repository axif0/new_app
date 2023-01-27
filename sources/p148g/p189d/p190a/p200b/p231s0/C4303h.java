package p148g.p189d.p190a.p200b.p231s0;

import android.os.Handler;
import android.view.Surface;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p202i0.C3894d;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.s0.h */
public interface C4303h {

    /* renamed from: g.d.a.b.s0.h$a */
    public static final class C4304a {

        /* renamed from: a */
        private final Handler f13758a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C4303h f13759b;

        /* renamed from: g.d.a.b.s0.h$a$a */
        class C4305a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C3894d f13760f;

            C4305a(C3894d dVar) {
                this.f13760f = dVar;
            }

            public void run() {
                C4304a.this.f13759b.mo12510g(this.f13760f);
            }
        }

        /* renamed from: g.d.a.b.s0.h$a$b */
        class C4306b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f13762f;

            /* renamed from: g */
            final /* synthetic */ long f13763g;

            /* renamed from: h */
            final /* synthetic */ long f13764h;

            C4306b(String str, long j, long j2) {
                this.f13762f = str;
                this.f13763g = j;
                this.f13764h = j2;
            }

            public void run() {
                C4304a.this.f13759b.mo12508e(this.f13762f, this.f13763g, this.f13764h);
            }
        }

        /* renamed from: g.d.a.b.s0.h$a$c */
        class C4307c implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C4109n f13766f;

            C4307c(C4109n nVar) {
                this.f13766f = nVar;
            }

            public void run() {
                C4304a.this.f13759b.mo12509f(this.f13766f);
            }
        }

        /* renamed from: g.d.a.b.s0.h$a$d */
        class C4308d implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f13768f;

            /* renamed from: g */
            final /* synthetic */ long f13769g;

            C4308d(int i, long j) {
                this.f13768f = i;
                this.f13769g = j;
            }

            public void run() {
                C4304a.this.f13759b.mo12517o(this.f13768f, this.f13769g);
            }
        }

        /* renamed from: g.d.a.b.s0.h$a$e */
        class C4309e implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f13771f;

            /* renamed from: g */
            final /* synthetic */ int f13772g;

            /* renamed from: h */
            final /* synthetic */ int f13773h;

            /* renamed from: i */
            final /* synthetic */ float f13774i;

            C4309e(int i, int i2, int i3, float f) {
                this.f13771f = i;
                this.f13772g = i2;
                this.f13773h = i3;
                this.f13774i = f;
            }

            public void run() {
                C4304a.this.f13759b.mo12504a(this.f13771f, this.f13772g, this.f13773h, this.f13774i);
            }
        }

        /* renamed from: g.d.a.b.s0.h$a$f */
        class C4310f implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Surface f13776f;

            C4310f(Surface surface) {
                this.f13776f = surface;
            }

            public void run() {
                C4304a.this.f13759b.mo12513j(this.f13776f);
            }
        }

        /* renamed from: g.d.a.b.s0.h$a$g */
        class C4311g implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C3894d f13778f;

            C4311g(C3894d dVar) {
                this.f13778f = dVar;
            }

            public void run() {
                this.f13778f.mo12669a();
                C4304a.this.f13759b.mo12514l(this.f13778f);
            }
        }

        public C4304a(Handler handler, C4303h hVar) {
            Handler handler2;
            if (hVar != null) {
                C4260a.m18073e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f13758a = handler2;
            this.f13759b = hVar;
        }

        /* renamed from: b */
        public void mo13546b(String str, long j, long j2) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4306b(str, j, j2));
            }
        }

        /* renamed from: c */
        public void mo13547c(C3894d dVar) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4311g(dVar));
            }
        }

        /* renamed from: d */
        public void mo13548d(int i, long j) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4308d(i, j));
            }
        }

        /* renamed from: e */
        public void mo13549e(C3894d dVar) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4305a(dVar));
            }
        }

        /* renamed from: f */
        public void mo13550f(C4109n nVar) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4307c(nVar));
            }
        }

        /* renamed from: g */
        public void mo13551g(Surface surface) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4310f(surface));
            }
        }

        /* renamed from: h */
        public void mo13552h(int i, int i2, int i3, float f) {
            if (this.f13759b != null) {
                this.f13758a.post(new C4309e(i, i2, i3, f));
            }
        }
    }

    /* renamed from: a */
    void mo12504a(int i, int i2, int i3, float f);

    /* renamed from: e */
    void mo12508e(String str, long j, long j2);

    /* renamed from: f */
    void mo12509f(C4109n nVar);

    /* renamed from: g */
    void mo12510g(C3894d dVar);

    /* renamed from: j */
    void mo12513j(Surface surface);

    /* renamed from: l */
    void mo12514l(C3894d dVar);

    /* renamed from: o */
    void mo12517o(int i, long j);
}
