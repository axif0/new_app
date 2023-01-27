package academia.bracu.com.academia.boommenu.p001a;

/* renamed from: academia.bracu.com.academia.boommenu.a.b */
public enum C0016b {
    LINE(0),
    PARABOLA_1(1),
    PARABOLA_2(2),
    PARABOLA_3(3),
    PARABOLA_4(4),
    HORIZONTAL_THROW_1(5),
    HORIZONTAL_THROW_2(6),
    RANDOM(7),
    Unknown(-1);
    
    private final int value;

    private C0016b(int i) {
        this.value = i;
    }

    public static C0016b getEnum(int i) {
        return (i < 0 || i >= values().length) ? Unknown : values()[i];
    }

    public int getValue() {
        return this.value;
    }
}
