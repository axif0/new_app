package p148g.p189d.p190a.p271e.p272a.p274b;

import p148g.p189d.p190a.p271e.p272a.p274b.p275e.C5089a;
import p148g.p189d.p190a.p271e.p272a.p280g.C5164q;

/* renamed from: g.d.a.e.a.b.a */
public class C5085a extends C5164q {
    public C5085a(int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), C5089a.m21465a(i)}));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
