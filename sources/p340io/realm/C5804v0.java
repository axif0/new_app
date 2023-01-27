package p340io.realm;

import java.io.File;
import java.net.URI;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p340io.realm.C5648d0;
import p340io.realm.SyncSession;
import p340io.realm.annotations.RealmModule;
import p340io.realm.internal.C5721o;
import p340io.realm.internal.OsRealmConfig;
import p340io.realm.p346u1.C5802b;

/* renamed from: io.realm.v0 */
public class C5804v0 extends C5672i0 {

    /* renamed from: A */
    private final long f16804A;

    /* renamed from: B */
    private final OsRealmConfig.C5690e f16805B;

    /* renamed from: C */
    private final boolean f16806C;

    /* renamed from: D */
    private final String f16807D;

    /* renamed from: E */
    private final C5656f f16808E;

    /* renamed from: s */
    private final URI f16809s;

    /* renamed from: t */
    private final C5815w0 f16810t;

    /* renamed from: u */
    private final SyncSession.C5624d f16811u;

    /* renamed from: v */
    private final boolean f16812v;

    /* renamed from: w */
    private final boolean f16813w;

    /* renamed from: x */
    private final String f16814x;

    /* renamed from: y */
    private final String f16815y;

    /* renamed from: z */
    private final boolean f16816z;

    /* renamed from: w */
    static C5672i0 m24241w(String str, byte[] bArr, C5721o oVar) {
        return new C5672i0((File) null, (String) null, str, (String) null, bArr, 0, (C5758k0) null, false, OsRealmConfig.C5688c.FULL, oVar, (C5802b) null, (C5648d0.C5649a) null, true, (CompactOnLaunchCallback) null, true);
    }

    /* renamed from: x */
    public static C5672i0 m24242x(String str, byte[] bArr, Object... objArr) {
        HashSet hashSet = new HashSet();
        if (objArr != null && objArr.length > 0) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                if (obj.getClass().isAnnotationPresent(RealmModule.class)) {
                    hashSet.add(obj);
                    i++;
                } else {
                    throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
                }
            }
        } else if (C5648d0.m23428p0() != null) {
            hashSet.add(C5648d0.m23428p0());
        }
        return m24241w(str, bArr, C5672i0.m23548b(hashSet, Collections.emptySet()));
    }

    /* renamed from: A */
    public String mo16809A() {
        return this.f16814x;
    }

    /* renamed from: B */
    public String mo16810B() {
        return this.f16815y;
    }

    /* renamed from: C */
    public URI mo16811C() {
        return this.f16809s;
    }

    /* renamed from: D */
    public C5815w0 mo16812D() {
        return this.f16810t;
    }

    /* renamed from: E */
    public boolean mo16813E() {
        return !this.f16806C;
    }

    /* renamed from: F */
    public boolean mo16814F() {
        return this.f16816z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5804v0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C5804v0 v0Var = (C5804v0) obj;
        if (this.f16812v != v0Var.f16812v || this.f16813w != v0Var.f16813w || this.f16816z != v0Var.f16816z || this.f16804A != v0Var.f16804A || this.f16806C != v0Var.f16806C || !this.f16809s.equals(v0Var.f16809s)) {
            return false;
        }
        this.f16810t.equals(v0Var.f16810t);
        throw null;
    }

    public int hashCode() {
        super.hashCode();
        this.f16809s.hashCode();
        this.f16810t.hashCode();
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo16323t() {
        return true;
    }

    public String toString() {
        return super.toString() + "\n" + "serverUrl: " + this.f16809s + "\n" + "user: " + this.f16810t + "\n" + "errorHandler: " + this.f16811u + "\n" + "deleteRealmOnLogout: " + this.f16812v + "\n" + "syncClientValidateSsl: " + this.f16813w + "\n" + "serverCertificateAssetName: " + this.f16814x + "\n" + "serverCertificateFilePath: " + this.f16815y + "\n" + "waitForInitialData: " + this.f16816z + "\n" + "initialDataTimeoutMillis: " + this.f16804A + "\n" + "sessionStopPolicy: " + this.f16805B + "\n" + "isPartial: " + this.f16806C + "\n" + "syncUrlPrefix: " + this.f16807D + "\n" + "clientResyncMode: " + this.f16808E;
    }

    /* renamed from: y */
    public SyncSession.C5624d mo16815y() {
        return this.f16811u;
    }

    /* renamed from: z */
    public long mo16816z(TimeUnit timeUnit) {
        return timeUnit.convert(this.f16804A, TimeUnit.MILLISECONDS);
    }
}
