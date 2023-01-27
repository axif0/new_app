package p340io.realm.internal;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p340io.realm.internal.C5714k.C5716b;

/* renamed from: io.realm.internal.k */
public class C5714k<T extends C5716b> {

    /* renamed from: a */
    private List<T> f16513a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean f16514b = false;

    /* renamed from: io.realm.internal.k$a */
    public interface C5715a<T extends C5716b> {
        /* renamed from: a */
        void mo16266a(T t, Object obj);
    }

    /* renamed from: io.realm.internal.k$b */
    public static abstract class C5716b<T, S> {

        /* renamed from: a */
        final WeakReference<T> f16515a;

        /* renamed from: b */
        protected final S f16516b;

        /* renamed from: c */
        boolean f16517c = false;

        public C5716b(T t, S s) {
            this.f16516b = s;
            this.f16515a = new WeakReference<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5716b)) {
                return false;
            }
            C5716b bVar = (C5716b) obj;
            return this.f16516b.equals(bVar.f16516b) && this.f16515a.get() == bVar.f16515a.get();
        }

        public int hashCode() {
            Object obj = this.f16515a.get();
            int i = 0;
            int hashCode = (527 + (obj != null ? obj.hashCode() : 0)) * 31;
            S s = this.f16516b;
            if (s != null) {
                i = s.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: a */
    public void mo16629a(T t) {
        if (!this.f16513a.contains(t)) {
            this.f16513a.add(t);
            t.f16517c = false;
        }
        if (this.f16514b) {
            this.f16514b = false;
        }
    }

    /* renamed from: b */
    public void mo16630b() {
        this.f16514b = true;
        this.f16513a.clear();
    }

    /* renamed from: c */
    public void mo16631c(C5715a<T> aVar) {
        for (T t : this.f16513a) {
            if (!this.f16514b) {
                Object obj = t.f16515a.get();
                if (obj == null) {
                    this.f16513a.remove(t);
                } else if (!t.f16517c) {
                    aVar.mo16266a(t, obj);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean mo16632d() {
        return this.f16513a.isEmpty();
    }

    /* renamed from: e */
    public <S, U> void mo16633e(S s, U u) {
        for (T t : this.f16513a) {
            if (s == t.f16515a.get() && u.equals(t.f16516b)) {
                t.f16517c = true;
                this.f16513a.remove(t);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16634f(Object obj) {
        for (T t : this.f16513a) {
            Object obj2 = t.f16515a.get();
            if (obj2 == null || obj2 == obj) {
                t.f16517c = true;
                this.f16513a.remove(t);
            }
        }
    }

    /* renamed from: g */
    public int mo16635g() {
        return this.f16513a.size();
    }
}
