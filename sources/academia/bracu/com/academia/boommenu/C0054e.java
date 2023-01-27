package academia.bracu.com.academia.boommenu;

/* renamed from: academia.bracu.com.academia.boommenu.e */
public enum C0054e {
    SimpleCircle(0),
    TextInsideCircle(1),
    TextOutsideCircle(2),
    Ham(3),
    Unknown(-1);
    
    private final int value;

    private C0054e(int i) {
        this.value = i;
    }

    public static C0054e getEnum(int i) {
        return (i < 0 || i > values().length) ? Unknown : values()[i];
    }

    public int getValue() {
        return this.value;
    }
}
