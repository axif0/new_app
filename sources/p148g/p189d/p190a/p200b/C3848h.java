package p148g.p189d.p190a.p200b;

import java.io.IOException;

/* renamed from: g.d.a.b.h */
public final class C3848h extends Exception {
    private C3848h(int i, String str, Throwable th, int i2) {
        super(str, th);
    }

    /* renamed from: a */
    public static C3848h m16074a(Exception exc, int i) {
        return new C3848h(1, (String) null, exc, i);
    }

    /* renamed from: b */
    public static C3848h m16075b(IOException iOException) {
        return new C3848h(0, (String) null, iOException, -1);
    }

    /* renamed from: c */
    static C3848h m16076c(RuntimeException runtimeException) {
        return new C3848h(2, (String) null, runtimeException, -1);
    }
}
