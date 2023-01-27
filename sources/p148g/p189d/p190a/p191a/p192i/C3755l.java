package p148g.p189d.p190a.p191a.p192i;

import android.util.Base64;
import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p191a.C3729d;
import p148g.p189d.p190a.p191a.p192i.C3740c;

/* renamed from: g.d.a.a.i.l */
public abstract class C3755l {

    /* renamed from: g.d.a.a.i.l$a */
    public static abstract class C3756a {
        /* renamed from: a */
        public abstract C3755l mo12324a();

        /* renamed from: b */
        public abstract C3756a mo12325b(String str);

        /* renamed from: c */
        public abstract C3756a mo12326c(byte[] bArr);

        /* renamed from: d */
        public abstract C3756a mo12327d(C3729d dVar);
    }

    /* renamed from: a */
    public static C3756a m15675a() {
        C3740c.C3742b bVar = new C3740c.C3742b();
        bVar.mo12327d(C3729d.DEFAULT);
        return bVar;
    }

    /* renamed from: b */
    public abstract String mo12319b();

    /* renamed from: c */
    public abstract byte[] mo12320c();

    /* renamed from: d */
    public abstract C3729d mo12321d();

    /* renamed from: e */
    public C3755l mo12348e(C3729d dVar) {
        C3756a a = m15675a();
        a.mo12325b(mo12319b());
        a.mo12327d(dVar);
        a.mo12326c(mo12320c());
        return a.mo12324a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo12319b();
        objArr[1] = mo12321d();
        objArr[2] = mo12320c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(mo12320c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
