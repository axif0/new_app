package p148g.p189d.p296d.p304s;

import java.util.List;

/* renamed from: g.d.d.s.e */
public final class C5415e {

    /* renamed from: a */
    private final byte[] f15675a;

    /* renamed from: b */
    private int f15676b;

    /* renamed from: c */
    private final String f15677c;

    /* renamed from: d */
    private final List<byte[]> f15678d;

    /* renamed from: e */
    private final String f15679e;

    /* renamed from: f */
    private Object f15680f;

    /* renamed from: g */
    private final int f15681g;

    /* renamed from: h */
    private final int f15682h;

    public C5415e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C5415e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f15675a = bArr;
        this.f15676b = bArr == null ? 0 : bArr.length * 8;
        this.f15677c = str;
        this.f15678d = list;
        this.f15679e = str2;
        this.f15681g = i2;
        this.f15682h = i;
    }

    /* renamed from: a */
    public List<byte[]> mo15684a() {
        return this.f15678d;
    }

    /* renamed from: b */
    public String mo15685b() {
        return this.f15679e;
    }

    /* renamed from: c */
    public int mo15686c() {
        return this.f15676b;
    }

    /* renamed from: d */
    public Object mo15687d() {
        return this.f15680f;
    }

    /* renamed from: e */
    public byte[] mo15688e() {
        return this.f15675a;
    }

    /* renamed from: f */
    public int mo15689f() {
        return this.f15681g;
    }

    /* renamed from: g */
    public int mo15690g() {
        return this.f15682h;
    }

    /* renamed from: h */
    public String mo15691h() {
        return this.f15677c;
    }

    /* renamed from: i */
    public boolean mo15692i() {
        return this.f15681g >= 0 && this.f15682h >= 0;
    }

    /* renamed from: j */
    public void mo15693j(Integer num) {
    }

    /* renamed from: k */
    public void mo15694k(Integer num) {
    }

    /* renamed from: l */
    public void mo15695l(int i) {
        this.f15676b = i;
    }

    /* renamed from: m */
    public void mo15696m(Object obj) {
        this.f15680f = obj;
    }
}
