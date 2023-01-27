package p386o;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import p374m.C6103b0;
import p374m.C6255s;
import p374m.C6262w;

/* renamed from: o.n */
abstract class C6351n<T> {

    /* renamed from: o.n$a */
    class C6352a extends C6351n<Iterable<T>> {
        C6352a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17969a(C6368p pVar, Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a : iterable) {
                    C6351n.this.mo17969a(pVar, a);
                }
            }
        }
    }

    /* renamed from: o.n$b */
    class C6353b extends C6351n<Object> {
        C6353b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C6351n.this.mo17969a(pVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: o.n$c */
    static final class C6354c<T> extends C6351n<T> {

        /* renamed from: a */
        private final String f17889a;

        /* renamed from: b */
        private final C6322f<T, String> f17890b;

        /* renamed from: c */
        private final boolean f17891c;

        C6354c(String str, C6322f<T, String> fVar, boolean z) {
            C6379w.m26209b(str, "name == null");
            this.f17889a = str;
            this.f17890b = fVar;
            this.f17891c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, T t) throws IOException {
            String a;
            if (t != null && (a = this.f17890b.mo17933a(t)) != null) {
                pVar.mo17984a(this.f17889a, a, this.f17891c);
            }
        }
    }

    /* renamed from: o.n$d */
    static final class C6355d<T> extends C6351n<Map<String, T>> {

        /* renamed from: a */
        private final Method f17892a;

        /* renamed from: b */
        private final int f17893b;

        /* renamed from: c */
        private final C6322f<T, String> f17894c;

        /* renamed from: d */
        private final boolean f17895d;

        C6355d(Method method, int i, C6322f<T, String> fVar, boolean z) {
            this.f17892a = method;
            this.f17893b = i;
            this.f17894c = fVar;
            this.f17895d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17969a(C6368p pVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f17894c.mo17933a(value);
                            if (a != null) {
                                pVar.mo17984a(str, a, this.f17895d);
                            } else {
                                Method method = this.f17892a;
                                int i = this.f17893b;
                                throw C6379w.m26223p(method, i, "Field map value '" + value + "' converted to null by " + this.f17894c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f17892a;
                            int i2 = this.f17893b;
                            throw C6379w.m26223p(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C6379w.m26223p(this.f17892a, this.f17893b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6379w.m26223p(this.f17892a, this.f17893b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: o.n$e */
    static final class C6356e<T> extends C6351n<T> {

        /* renamed from: a */
        private final String f17896a;

        /* renamed from: b */
        private final C6322f<T, String> f17897b;

        C6356e(String str, C6322f<T, String> fVar) {
            C6379w.m26209b(str, "name == null");
            this.f17896a = str;
            this.f17897b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, T t) throws IOException {
            String a;
            if (t != null && (a = this.f17897b.mo17933a(t)) != null) {
                pVar.mo17985b(this.f17896a, a);
            }
        }
    }

    /* renamed from: o.n$f */
    static final class C6357f<T> extends C6351n<T> {

        /* renamed from: a */
        private final Method f17898a;

        /* renamed from: b */
        private final int f17899b;

        /* renamed from: c */
        private final C6255s f17900c;

        /* renamed from: d */
        private final C6322f<T, C6103b0> f17901d;

        C6357f(Method method, int i, C6255s sVar, C6322f<T, C6103b0> fVar) {
            this.f17898a = method;
            this.f17899b = i;
            this.f17900c = sVar;
            this.f17901d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, T t) {
            if (t != null) {
                try {
                    pVar.mo17986c(this.f17900c, this.f17901d.mo17933a(t));
                } catch (IOException e) {
                    Method method = this.f17898a;
                    int i = this.f17899b;
                    throw C6379w.m26223p(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: o.n$g */
    static final class C6358g<T> extends C6351n<Map<String, T>> {

        /* renamed from: a */
        private final Method f17902a;

        /* renamed from: b */
        private final int f17903b;

        /* renamed from: c */
        private final C6322f<T, C6103b0> f17904c;

        /* renamed from: d */
        private final String f17905d;

        C6358g(Method method, int i, C6322f<T, C6103b0> fVar, String str) {
            this.f17902a = method;
            this.f17903b = i;
            this.f17904c = fVar;
            this.f17905d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17969a(C6368p pVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            pVar.mo17986c(C6255s.m25631g("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f17905d), this.f17904c.mo17933a(value));
                        } else {
                            Method method = this.f17902a;
                            int i = this.f17903b;
                            throw C6379w.m26223p(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C6379w.m26223p(this.f17902a, this.f17903b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6379w.m26223p(this.f17902a, this.f17903b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: o.n$h */
    static final class C6359h<T> extends C6351n<T> {

        /* renamed from: a */
        private final Method f17906a;

        /* renamed from: b */
        private final int f17907b;

        /* renamed from: c */
        private final String f17908c;

        /* renamed from: d */
        private final C6322f<T, String> f17909d;

        /* renamed from: e */
        private final boolean f17910e;

        C6359h(Method method, int i, String str, C6322f<T, String> fVar, boolean z) {
            this.f17906a = method;
            this.f17907b = i;
            C6379w.m26209b(str, "name == null");
            this.f17908c = str;
            this.f17909d = fVar;
            this.f17910e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, T t) throws IOException {
            if (t != null) {
                pVar.mo17988e(this.f17908c, this.f17909d.mo17933a(t), this.f17910e);
                return;
            }
            Method method = this.f17906a;
            int i = this.f17907b;
            throw C6379w.m26223p(method, i, "Path parameter \"" + this.f17908c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: o.n$i */
    static final class C6360i<T> extends C6351n<T> {

        /* renamed from: a */
        private final String f17911a;

        /* renamed from: b */
        private final C6322f<T, String> f17912b;

        /* renamed from: c */
        private final boolean f17913c;

        C6360i(String str, C6322f<T, String> fVar, boolean z) {
            C6379w.m26209b(str, "name == null");
            this.f17911a = str;
            this.f17912b = fVar;
            this.f17913c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, T t) throws IOException {
            String a;
            if (t != null && (a = this.f17912b.mo17933a(t)) != null) {
                pVar.mo17989f(this.f17911a, a, this.f17913c);
            }
        }
    }

    /* renamed from: o.n$j */
    static final class C6361j<T> extends C6351n<Map<String, T>> {

        /* renamed from: a */
        private final Method f17914a;

        /* renamed from: b */
        private final int f17915b;

        /* renamed from: c */
        private final C6322f<T, String> f17916c;

        /* renamed from: d */
        private final boolean f17917d;

        C6361j(Method method, int i, C6322f<T, String> fVar, boolean z) {
            this.f17914a = method;
            this.f17915b = i;
            this.f17916c = fVar;
            this.f17917d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17969a(C6368p pVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f17916c.mo17933a(value);
                            if (a != null) {
                                pVar.mo17989f(str, a, this.f17917d);
                            } else {
                                Method method = this.f17914a;
                                int i = this.f17915b;
                                throw C6379w.m26223p(method, i, "Query map value '" + value + "' converted to null by " + this.f17916c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f17914a;
                            int i2 = this.f17915b;
                            throw C6379w.m26223p(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C6379w.m26223p(this.f17914a, this.f17915b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C6379w.m26223p(this.f17914a, this.f17915b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: o.n$k */
    static final class C6362k<T> extends C6351n<T> {

        /* renamed from: a */
        private final C6322f<T, String> f17918a;

        /* renamed from: b */
        private final boolean f17919b;

        C6362k(C6322f<T, String> fVar, boolean z) {
            this.f17918a = fVar;
            this.f17919b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17969a(C6368p pVar, T t) throws IOException {
            if (t != null) {
                pVar.mo17989f(this.f17918a.mo17933a(t), (String) null, this.f17919b);
            }
        }
    }

    /* renamed from: o.n$l */
    static final class C6363l extends C6351n<C6262w.C6264b> {

        /* renamed from: a */
        static final C6363l f17920a = new C6363l();

        private C6363l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17969a(C6368p pVar, C6262w.C6264b bVar) {
            if (bVar != null) {
                pVar.mo17987d(bVar);
            }
        }
    }

    C6351n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo17969a(C6368p pVar, T t) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6351n<Object> mo17970b() {
        return new C6353b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C6351n<Iterable<T>> mo17971c() {
        return new C6352a();
    }
}
