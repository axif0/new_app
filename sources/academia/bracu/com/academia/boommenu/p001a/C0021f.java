package academia.bracu.com.academia.boommenu.p001a;

/* renamed from: academia.bracu.com.academia.boommenu.a.f */
public enum C0021f {
    DEFAULT(0),
    REVERSE(1),
    RANDOM(2),
    Unknown(-1);
    
    private final int value;

    private C0021f(int i) {
        this.value = i;
    }

    public static C0021f getEnum(int i) {
        return (i < 0 || i >= values().length) ? Unknown : values()[i];
    }

    public int getValue() {
        return this.value;
    }
}
