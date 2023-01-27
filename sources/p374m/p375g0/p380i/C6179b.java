package p374m.p375g0.p380i;

/* renamed from: m.g0.i.b */
public enum C6179b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: f */
    public final int f17386f;

    private C6179b(int i) {
        this.f17386f = i;
    }

    /* renamed from: e */
    public static C6179b m25261e(int i) {
        for (C6179b bVar : values()) {
            if (bVar.f17386f == i) {
                return bVar;
            }
        }
        return null;
    }
}
