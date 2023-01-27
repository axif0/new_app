package p340io.realm;

/* renamed from: io.realm.h */
public enum C5668h {
    DISCONNECTED(0),
    CONNECTING(1),
    CONNECTED(2);
    

    /* renamed from: f */
    final int f16341f;

    private C5668h(int i) {
        this.f16341f = i;
    }

    /* renamed from: e */
    static C5668h m23534e(long j) {
        for (C5668h hVar : values()) {
            if (((long) hVar.f16341f) == j) {
                return hVar;
            }
        }
        throw new IllegalArgumentException("Unknown connection state code: " + j);
    }
}
