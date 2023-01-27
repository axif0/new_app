package p148g.p149a.p165b;

import p148g.p149a.p165b.p166d.C3653a;
import p148g.p149a.p165b.p166d.C3654b;
import p148g.p149a.p165b.p166d.C3655c;
import p148g.p149a.p165b.p167e.C3656a;
import p148g.p149a.p165b.p167e.C3657b;
import p148g.p149a.p165b.p167e.C3658c;
import p148g.p149a.p165b.p168f.C3659a;
import p148g.p149a.p165b.p168f.C3660b;
import p148g.p149a.p165b.p168f.C3661c;
import p148g.p149a.p165b.p169g.C3662a;
import p148g.p149a.p165b.p169g.C3663b;
import p148g.p149a.p165b.p169g.C3664c;
import p148g.p149a.p165b.p170h.C3665a;
import p148g.p149a.p165b.p170h.C3666b;
import p148g.p149a.p165b.p171i.C3667a;
import p148g.p149a.p165b.p171i.C3668b;
import p148g.p149a.p165b.p171i.C3669c;
import p148g.p149a.p165b.p172j.C3670a;
import p148g.p149a.p165b.p173k.C3671a;
import p148g.p149a.p165b.p173k.C3672b;
import p148g.p149a.p165b.p173k.C3673c;
import p148g.p149a.p165b.p174l.C3674a;
import p148g.p149a.p165b.p174l.C3675b;
import p148g.p149a.p165b.p174l.C3676c;
import p148g.p149a.p165b.p175m.C3677a;
import p148g.p149a.p165b.p175m.C3678b;
import p148g.p149a.p165b.p175m.C3679c;

/* renamed from: g.a.b.c */
public enum C3652c {
    BackEaseIn(C3653a.class),
    BackEaseOut(C3655c.class),
    BackEaseInOut(C3654b.class),
    BounceEaseIn(C3656a.class),
    BounceEaseOut(C3658c.class),
    BounceEaseInOut(C3657b.class),
    CircEaseIn(C3659a.class),
    CircEaseOut(C3661c.class),
    CircEaseInOut(C3660b.class),
    CubicEaseIn(C3662a.class),
    CubicEaseOut(C3664c.class),
    CubicEaseInOut(C3663b.class),
    ElasticEaseIn(C3665a.class),
    ElasticEaseOut(C3666b.class),
    ExpoEaseIn(C3667a.class),
    ExpoEaseOut(C3669c.class),
    ExpoEaseInOut(C3668b.class),
    QuadEaseIn(C3671a.class),
    QuadEaseOut(C3673c.class),
    QuadEaseInOut(C3672b.class),
    QuintEaseIn(C3674a.class),
    QuintEaseOut(C3676c.class),
    QuintEaseInOut(C3675b.class),
    SineEaseIn(C3677a.class),
    SineEaseOut(C3679c.class),
    SineEaseInOut(C3678b.class),
    Linear(C3670a.class);
    

    /* renamed from: f */
    private Class f11267f;

    private C3652c(Class cls) {
        this.f11267f = cls;
    }

    /* renamed from: e */
    public C3649a mo12194e(float f) {
        try {
            return (C3649a) this.f11267f.getConstructor(new Class[]{Float.TYPE}).newInstance(new Object[]{Float.valueOf(f)});
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
