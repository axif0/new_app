package p148g.p149a.p150a.p151a;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p148g.p325e.p326a.C5544a;

/* renamed from: g.a.a.a.c */
public class C3583c {

    /* renamed from: a */
    private C3581a f11224a;

    /* renamed from: b */
    private long f11225b;

    /* renamed from: c */
    private long f11226c;

    /* renamed from: d */
    private Interpolator f11227d;

    /* renamed from: e */
    private List<C5544a.C5545a> f11228e;

    /* renamed from: f */
    private View f11229f;

    /* renamed from: g.a.a.a.c$b */
    public static final class C3585b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public List<C5544a.C5545a> f11230a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C3581a f11231b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f11232c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f11233d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Interpolator f11234e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public View f11235f;

        private C3585b(C3582b bVar) {
            this.f11230a = new ArrayList();
            this.f11232c = 1000;
            this.f11233d = 0;
            this.f11231b = bVar.mo12185e();
        }

        /* renamed from: g */
        public C3585b mo12186g(long j) {
            this.f11232c = j;
            return this;
        }

        /* renamed from: h */
        public C3586c mo12187h(View view) {
            this.f11235f = view;
            return new C3586c(new C3583c(this).m15358b(), this.f11235f);
        }

        /* renamed from: i */
        public C3585b mo12188i(C5544a.C5545a aVar) {
            this.f11230a.add(aVar);
            return this;
        }
    }

    /* renamed from: g.a.a.a.c$c */
    public static final class C3586c {

        /* renamed from: a */
        private View f11236a;

        private C3586c(C3581a aVar, View view) {
            this.f11236a = view;
        }
    }

    private C3583c(C3585b bVar) {
        this.f11224a = bVar.f11231b;
        this.f11225b = bVar.f11232c;
        this.f11226c = bVar.f11233d;
        this.f11227d = bVar.f11234e;
        this.f11228e = bVar.f11230a;
        this.f11229f = bVar.f11235f;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C3581a m15358b() {
        C3581a aVar = this.f11224a;
        aVar.mo12181g(this.f11225b);
        aVar.mo12182h(this.f11227d);
        aVar.mo12183i(this.f11226c);
        if (this.f11228e.size() > 0) {
            for (C5544a.C5545a a : this.f11228e) {
                this.f11224a.mo12175a(a);
            }
        }
        this.f11224a.mo12176b(this.f11229f);
        return this.f11224a;
    }

    /* renamed from: c */
    public static C3585b m15359c(C3582b bVar) {
        return new C3585b(bVar);
    }
}
