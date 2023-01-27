package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1547a.C1551d;
import com.google.android.gms.common.internal.C1613b;
import com.google.android.gms.common.internal.C1627c;
import com.google.android.gms.common.internal.C1644j;
import com.google.android.gms.common.internal.C1658o;
import java.util.Set;
import p148g.p189d.p190a.p232c.p237d.C4370d;

/* renamed from: com.google.android.gms.common.api.a */
public final class C1547a<O extends C1551d> {

    /* renamed from: a */
    private final C1548a<?, O> f5315a;

    /* renamed from: b */
    private final String f5316b;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C1548a<T extends C1555f, O> extends C1554e<T, O> {
        /* renamed from: a */
        public abstract T mo6325a(Context context, Looper looper, C1627c cVar, O o, C1562f fVar, C1563g gVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C1549b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C1550c<C extends C1549b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C1551d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C1552a extends C1551d {
            /* renamed from: k */
            Account mo6326k();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C1553b extends C1551d {
            /* renamed from: a */
            GoogleSignInAccount mo6327a();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C1554e<T extends C1549b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C1555f extends C1549b {
        /* renamed from: a */
        void mo6328a(C1613b.C1618e eVar);

        /* renamed from: b */
        boolean mo6329b();

        /* renamed from: d */
        void mo6330d(C1644j jVar, Set<Scope> set);

        /* renamed from: f */
        boolean mo6331f();

        /* renamed from: g */
        int mo6332g();

        /* renamed from: i */
        boolean mo6333i();

        /* renamed from: j */
        C4370d[] mo6334j();

        /* renamed from: k */
        String mo6335k();

        /* renamed from: l */
        void mo6336l(C1613b.C1616c cVar);

        /* renamed from: m */
        void mo6337m();

        /* renamed from: o */
        boolean mo6338o();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C1556g<C extends C1555f> extends C1550c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C1557h<T extends IInterface> extends C1549b {
        /* renamed from: c */
        String mo6339c();

        /* renamed from: e */
        T mo6340e(IBinder iBinder);

        /* renamed from: p */
        String mo6341p();

        /* renamed from: q */
        void mo6342q(int i, T t);
    }

    public <C extends C1555f> C1547a(String str, C1548a<C, O> aVar, C1556g<C> gVar) {
        C1658o.m7846k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C1658o.m7846k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f5316b = str;
        this.f5315a = aVar;
    }

    /* renamed from: a */
    public final String mo6323a() {
        return this.f5316b;
    }

    /* renamed from: b */
    public final C1548a<?, O> mo6324b() {
        C1658o.m7849n(this.f5315a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f5315a;
    }
}
