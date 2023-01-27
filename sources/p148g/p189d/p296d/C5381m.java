package p148g.p189d.p296d;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: g.d.d.m */
public final class C5381m {

    /* renamed from: a */
    private final String f15558a;

    /* renamed from: b */
    private final byte[] f15559b;

    /* renamed from: c */
    private C5383o[] f15560c;

    /* renamed from: d */
    private final C5369a f15561d;

    /* renamed from: e */
    private Map<C5382n, Object> f15562e;

    public C5381m(String str, byte[] bArr, int i, C5383o[] oVarArr, C5369a aVar, long j) {
        this.f15558a = str;
        this.f15559b = bArr;
        this.f15560c = oVarArr;
        this.f15561d = aVar;
        this.f15562e = null;
    }

    public C5381m(String str, byte[] bArr, C5383o[] oVarArr, C5369a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5381m(String str, byte[] bArr, C5383o[] oVarArr, C5369a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j);
    }

    /* renamed from: a */
    public void mo15609a(C5383o[] oVarArr) {
        C5383o[] oVarArr2 = this.f15560c;
        if (oVarArr2 == null) {
            this.f15560c = oVarArr;
        } else if (oVarArr != null && oVarArr.length > 0) {
            C5383o[] oVarArr3 = new C5383o[(oVarArr2.length + oVarArr.length)];
            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
            this.f15560c = oVarArr3;
        }
    }

    /* renamed from: b */
    public C5369a mo15610b() {
        return this.f15561d;
    }

    /* renamed from: c */
    public byte[] mo15611c() {
        return this.f15559b;
    }

    /* renamed from: d */
    public Map<C5382n, Object> mo15612d() {
        return this.f15562e;
    }

    /* renamed from: e */
    public C5383o[] mo15613e() {
        return this.f15560c;
    }

    /* renamed from: f */
    public String mo15614f() {
        return this.f15558a;
    }

    /* renamed from: g */
    public void mo15615g(Map<C5382n, Object> map) {
        if (map != null) {
            Map<C5382n, Object> map2 = this.f15562e;
            if (map2 == null) {
                this.f15562e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo15616h(C5382n nVar, Object obj) {
        if (this.f15562e == null) {
            this.f15562e = new EnumMap(C5382n.class);
        }
        this.f15562e.put(nVar, obj);
    }

    public String toString() {
        return this.f15558a;
    }
}
