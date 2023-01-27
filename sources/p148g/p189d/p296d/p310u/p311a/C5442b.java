package p148g.p189d.p296d.p310u.p311a;

/* renamed from: g.d.d.u.a.b */
public final class C5442b {

    /* renamed from: a */
    private final String f15768a;

    /* renamed from: b */
    private final String f15769b;

    /* renamed from: c */
    private final byte[] f15770c;

    /* renamed from: d */
    private final Integer f15771d;

    /* renamed from: e */
    private final String f15772e;

    /* renamed from: f */
    private final String f15773f;

    C5442b() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null);
    }

    C5442b(String str, String str2, byte[] bArr, Integer num, String str3, String str4) {
        this.f15768a = str;
        this.f15769b = str2;
        this.f15770c = bArr;
        this.f15771d = num;
        this.f15772e = str3;
        this.f15773f = str4;
    }

    /* renamed from: a */
    public String mo15748a() {
        return this.f15768a;
    }

    public String toString() {
        byte[] bArr = this.f15770c;
        int length = bArr == null ? 0 : bArr.length;
        return "Format: " + this.f15769b + 10 + "Contents: " + this.f15768a + 10 + "Raw bytes: (" + length + " bytes)\nOrientation: " + this.f15771d + 10 + "EC level: " + this.f15772e + 10 + "Barcode image: " + this.f15773f + 10;
    }
}
