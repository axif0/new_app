package p148g.p189d.p190a.p200b.p204k0;

import java.lang.reflect.Constructor;
import p148g.p189d.p190a.p200b.p204k0.p205o.C3930b;
import p148g.p189d.p190a.p200b.p204k0.p206p.C3940d;
import p148g.p189d.p190a.p200b.p204k0.p207q.C3948b;
import p148g.p189d.p190a.p200b.p204k0.p208r.C3966e;
import p148g.p189d.p190a.p200b.p204k0.p208r.C3970g;
import p148g.p189d.p190a.p200b.p204k0.p209s.C3984c;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4001a;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4003c;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4022q;
import p148g.p189d.p190a.p200b.p204k0.p210t.C4028v;
import p148g.p189d.p190a.p200b.p204k0.p211u.C4036a;

/* renamed from: g.d.a.b.k0.c */
public final class C3913c implements C3918h {

    /* renamed from: g */
    private static final Constructor<? extends C3915e> f11884g;

    /* renamed from: a */
    private int f11885a;

    /* renamed from: b */
    private int f11886b;

    /* renamed from: c */
    private int f11887c;

    /* renamed from: d */
    private int f11888d;

    /* renamed from: e */
    private int f11889e = 1;

    /* renamed from: f */
    private int f11890f;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C3915e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f11884g = constructor;
    }

    /* renamed from: a */
    public synchronized C3915e[] mo12733a() {
        C3915e[] eVarArr;
        eVarArr = new C3915e[(f11884g == null ? 11 : 12)];
        eVarArr[0] = new C3940d(this.f11885a);
        eVarArr[1] = new C3966e(this.f11887c);
        eVarArr[2] = new C3970g(this.f11886b);
        eVarArr[3] = new C3948b(this.f11888d);
        eVarArr[4] = new C4003c();
        eVarArr[5] = new C4001a();
        eVarArr[6] = new C4028v(this.f11889e, this.f11890f);
        eVarArr[7] = new C3930b();
        eVarArr[8] = new C3984c();
        eVarArr[9] = new C4022q();
        eVarArr[10] = new C4036a();
        if (f11884g != null) {
            try {
                eVarArr[11] = (C3915e) f11884g.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return eVarArr;
    }
}
