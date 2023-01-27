package p148g.p189d.p296d;

import java.util.List;

/* renamed from: g.d.d.e */
public enum C5373e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(C5384p.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    

    /* renamed from: f */
    private final Class<?> f15543f;

    private C5373e(Class<?> cls) {
        this.f15543f = cls;
    }

    /* renamed from: e */
    public Class<?> mo15595e() {
        return this.f15543f;
    }
}
