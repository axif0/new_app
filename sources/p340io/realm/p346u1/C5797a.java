package p340io.realm.p346u1;

import io.reactivex.BackpressureStrategy;
import java.util.IdentityHashMap;
import p340io.realm.C5751j0;
import p340io.realm.C5763l0;
import p340io.realm.C5782q0;

/* renamed from: io.realm.u1.a */
public class C5797a implements C5802b {

    /* renamed from: io.realm.u1.a$a */
    class C5798a extends ThreadLocal<C5801d<C5782q0>> {
        C5798a(C5797a aVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5801d<C5782q0> initialValue() {
            return new C5801d<>((C5798a) null);
        }
    }

    /* renamed from: io.realm.u1.a$b */
    class C5799b extends ThreadLocal<C5801d<C5751j0>> {
        C5799b(C5797a aVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5801d<C5751j0> initialValue() {
            return new C5801d<>((C5798a) null);
        }
    }

    /* renamed from: io.realm.u1.a$c */
    class C5800c extends ThreadLocal<C5801d<C5763l0>> {
        C5800c(C5797a aVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5801d<C5763l0> initialValue() {
            return new C5801d<>((C5798a) null);
        }
    }

    /* renamed from: io.realm.u1.a$d */
    private static class C5801d<K> {
        private C5801d() {
            new IdentityHashMap();
        }

        /* synthetic */ C5801d(C5798a aVar) {
            this();
        }
    }

    static {
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
    }

    public C5797a() {
        new C5798a(this);
        new C5799b(this);
        new C5800c(this);
    }

    public boolean equals(Object obj) {
        return obj instanceof C5797a;
    }

    public int hashCode() {
        return 37;
    }
}
