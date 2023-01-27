package p148g.p189d.p190a.p232c.p236c;

import android.os.Bundle;
import android.util.Log;
import p148g.p189d.p190a.p232c.p251i.C4941i;

/* renamed from: g.d.a.c.c.u */
abstract class C4358u<T> {

    /* renamed from: a */
    final int f13879a;

    /* renamed from: b */
    final C4941i<T> f13880b = new C4941i<>();

    /* renamed from: c */
    final int f13881c;

    /* renamed from: d */
    final Bundle f13882d;

    C4358u(int i, int i2, Bundle bundle) {
        this.f13879a = i;
        this.f13881c = i2;
        this.f13882d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13660a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13663b(C4357t tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(tVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f13880b.mo14884b(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13664c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f13880b.mo14885c(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo13661d();

    public String toString() {
        int i = this.f13881c;
        int i2 = this.f13879a;
        boolean d = mo13661d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
