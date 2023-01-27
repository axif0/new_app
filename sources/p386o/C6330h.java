package p386o;

/* renamed from: o.h */
public class C6330h extends RuntimeException {
    public C6330h(C6372r<?> rVar) {
        super(m26074a(rVar));
        rVar.mo17994b();
        rVar.mo17996e();
    }

    /* renamed from: a */
    private static String m26074a(C6372r<?> rVar) {
        C6379w.m26209b(rVar, "response == null");
        return "HTTP " + rVar.mo17994b() + " " + rVar.mo17996e();
    }
}
