package p148g.p189d.p190a.p200b.p201h0;

import android.os.Handler;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.p202i0.C3894d;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.h0.e */
public interface C3858e {

    /* renamed from: g.d.a.b.h0.e$a */
    public static final class C3859a {

        /* renamed from: a */
        private final Handler f11610a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C3858e f11611b;

        /* renamed from: g.d.a.b.h0.e$a$a */
        class C3860a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C3894d f11612f;

            C3860a(C3894d dVar) {
                this.f11612f = dVar;
            }

            public void run() {
                C3859a.this.f11611b.mo12507d(this.f11612f);
            }
        }

        /* renamed from: g.d.a.b.h0.e$a$b */
        class C3861b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f11614f;

            /* renamed from: g */
            final /* synthetic */ long f11615g;

            /* renamed from: h */
            final /* synthetic */ long f11616h;

            C3861b(String str, long j, long j2) {
                this.f11614f = str;
                this.f11615g = j;
                this.f11616h = j2;
            }

            public void run() {
                C3859a.this.f11611b.mo12515m(this.f11614f, this.f11615g, this.f11616h);
            }
        }

        /* renamed from: g.d.a.b.h0.e$a$c */
        class C3862c implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C4109n f11618f;

            C3862c(C4109n nVar) {
                this.f11618f = nVar;
            }

            public void run() {
                C3859a.this.f11611b.mo12511h(this.f11618f);
            }
        }

        /* renamed from: g.d.a.b.h0.e$a$d */
        class C3863d implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f11620f;

            /* renamed from: g */
            final /* synthetic */ long f11621g;

            /* renamed from: h */
            final /* synthetic */ long f11622h;

            C3863d(int i, long j, long j2) {
                this.f11620f = i;
                this.f11621g = j;
                this.f11622h = j2;
            }

            public void run() {
                C3859a.this.f11611b.mo12512i(this.f11620f, this.f11621g, this.f11622h);
            }
        }

        /* renamed from: g.d.a.b.h0.e$a$e */
        class C3864e implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C3894d f11624f;

            C3864e(C3894d dVar) {
                this.f11624f = dVar;
            }

            public void run() {
                this.f11624f.mo12669a();
                C3859a.this.f11611b.mo12506c(this.f11624f);
            }
        }

        /* renamed from: g.d.a.b.h0.e$a$f */
        class C3865f implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f11626f;

            C3865f(int i) {
                this.f11626f = i;
            }

            public void run() {
                C3859a.this.f11611b.mo12505b(this.f11626f);
            }
        }

        public C3859a(Handler handler, C3858e eVar) {
            Handler handler2;
            if (eVar != null) {
                C4260a.m18073e(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f11610a = handler2;
            this.f11611b = eVar;
        }

        /* renamed from: b */
        public void mo12587b(int i) {
            if (this.f11611b != null) {
                this.f11610a.post(new C3865f(i));
            }
        }

        /* renamed from: c */
        public void mo12588c(int i, long j, long j2) {
            if (this.f11611b != null) {
                this.f11610a.post(new C3863d(i, j, j2));
            }
        }

        /* renamed from: d */
        public void mo12589d(String str, long j, long j2) {
            if (this.f11611b != null) {
                this.f11610a.post(new C3861b(str, j, j2));
            }
        }

        /* renamed from: e */
        public void mo12590e(C3894d dVar) {
            if (this.f11611b != null) {
                this.f11610a.post(new C3864e(dVar));
            }
        }

        /* renamed from: f */
        public void mo12591f(C3894d dVar) {
            if (this.f11611b != null) {
                this.f11610a.post(new C3860a(dVar));
            }
        }

        /* renamed from: g */
        public void mo12592g(C4109n nVar) {
            if (this.f11611b != null) {
                this.f11610a.post(new C3862c(nVar));
            }
        }
    }

    /* renamed from: b */
    void mo12505b(int i);

    /* renamed from: c */
    void mo12506c(C3894d dVar);

    /* renamed from: d */
    void mo12507d(C3894d dVar);

    /* renamed from: h */
    void mo12511h(C4109n nVar);

    /* renamed from: i */
    void mo12512i(int i, long j, long j2);

    /* renamed from: m */
    void mo12515m(String str, long j, long j2);
}
