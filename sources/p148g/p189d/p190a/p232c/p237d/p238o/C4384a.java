package p148g.p189d.p190a.p232c.p237d.p238o;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: g.d.a.c.d.o.a */
public class C4384a {

    /* renamed from: a */
    private static C4385a f13927a;

    /* renamed from: g.d.a.c.d.o.a$a */
    public interface C4385a {
        /* renamed from: a */
        ScheduledExecutorService mo13712a();
    }

    /* renamed from: a */
    public static synchronized C4385a m18614a() {
        C4385a aVar;
        synchronized (C4384a.class) {
            if (f13927a == null) {
                f13927a = new C4386b();
            }
            aVar = f13927a;
        }
        return aVar;
    }
}
