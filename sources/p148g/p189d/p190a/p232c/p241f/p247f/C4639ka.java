package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.ka */
public enum C4639ka {
    DOUBLE(C4695na.DOUBLE, 1),
    FLOAT(C4695na.FLOAT, 5),
    INT64(C4695na.LONG, 0),
    UINT64(C4695na.LONG, 0),
    INT32(C4695na.INT, 0),
    FIXED64(C4695na.LONG, 1),
    FIXED32(C4695na.INT, 5),
    BOOL(C4695na.BOOLEAN, 0),
    STRING(C4695na.STRING, 2),
    GROUP(C4695na.MESSAGE, 3),
    MESSAGE(C4695na.MESSAGE, 2),
    BYTES(C4695na.BYTE_STRING, 2),
    UINT32(C4695na.INT, 0),
    ENUM(C4695na.ENUM, 0),
    SFIXED32(C4695na.INT, 5),
    SFIXED64(C4695na.LONG, 1),
    SINT32(C4695na.INT, 0),
    SINT64(C4695na.LONG, 0);
    

    /* renamed from: f */
    private final C4695na f14236f;

    /* renamed from: g */
    private final int f14237g;

    private C4639ka(C4695na naVar, int i) {
        this.f14236f = naVar;
        this.f14237g = i;
    }

    /* renamed from: e */
    public final C4695na mo14359e() {
        return this.f14236f;
    }

    /* renamed from: g */
    public final int mo14360g() {
        return this.f14237g;
    }
}
