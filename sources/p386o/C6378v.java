package p386o;

import java.lang.annotation.Annotation;

/* renamed from: o.v */
final class C6378v implements C6377u {

    /* renamed from: a */
    private static final C6377u f17994a = new C6378v();

    C6378v() {
    }

    /* renamed from: a */
    static Annotation[] m26207a(Annotation[] annotationArr) {
        if (C6379w.m26220m(annotationArr, C6377u.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f17994a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C6377u.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C6377u;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C6377u.class.getName() + "()";
    }
}
