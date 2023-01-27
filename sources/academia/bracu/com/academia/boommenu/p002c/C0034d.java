package academia.bracu.com.academia.boommenu.p002c;

/* renamed from: academia.bracu.com.academia.boommenu.c.d */
public enum C0034d {
    Center(0),
    Top(1),
    Bottom(2),
    Left(3),
    Right(4),
    TL(5),
    TR(6),
    BL(7),
    BR(8),
    Unknown(-1);
    
    private final int value;

    private C0034d(int i) {
        this.value = i;
    }

    public static C0034d getEnum(int i) {
        return (i < 0 || i >= values().length) ? Unknown : values()[i];
    }

    public int getValue() {
        return this.value;
    }
}
