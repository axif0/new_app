package kotlinx.coroutines;

import p351k.p355t.C5891a;
import p351k.p355t.C5899f;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.t */
public final class C6075t extends C5891a {

    /* renamed from: g */
    public static final C6076a f17035g = new C6076a((C5954e) null);

    /* renamed from: f */
    private final String f17036f;

    /* renamed from: kotlinx.coroutines.t$a */
    public static final class C6076a implements C5899f.C5904c<C6075t> {
        private C6076a() {
        }

        public /* synthetic */ C6076a(C5954e eVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6075t) && C5956g.m24496a(this.f17036f, ((C6075t) obj).f17036f);
        }
        return true;
    }

    /* renamed from: h */
    public final String mo17171h() {
        return this.f17036f;
    }

    public int hashCode() {
        String str = this.f17036f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CoroutineName(" + this.f17036f + ')';
    }
}
