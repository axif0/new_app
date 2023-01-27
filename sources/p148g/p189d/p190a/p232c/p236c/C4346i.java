package p148g.p189d.p190a.p232c.p236c;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p038q.C1694a;
import java.util.concurrent.ScheduledExecutorService;
import p148g.p189d.p190a.p232c.p241f.p244c.C4414a;
import p148g.p189d.p190a.p232c.p241f.p244c.C4419f;
import p148g.p189d.p190a.p232c.p251i.C4940h;

/* renamed from: g.d.a.c.c.i */
public final class C4346i {

    /* renamed from: e */
    private static C4346i f13858e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f13859a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f13860b;

    /* renamed from: c */
    private C4347j f13861c = new C4347j(this);

    /* renamed from: d */
    private int f13862d = 1;

    private C4346i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f13860b = scheduledExecutorService;
        this.f13859a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m18518a() {
        int i;
        i = this.f13862d;
        this.f13862d = i + 1;
        return i;
    }

    /* renamed from: c */
    public static synchronized C4346i m18520c(Context context) {
        C4346i iVar;
        synchronized (C4346i.class) {
            if (f13858e == null) {
                f13858e = new C4346i(context, C4414a.m18660a().mo13744b(1, new C1694a("MessengerIpcClient"), C4419f.f13951b));
            }
            iVar = f13858e;
        }
        return iVar;
    }

    /* renamed from: e */
    private final synchronized <T> C4940h<T> m18521e(C4358u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f13861c.mo13649e(uVar)) {
            C4347j jVar = new C4347j(this);
            this.f13861c = jVar;
            jVar.mo13649e(uVar);
        }
        return uVar.f13880b.mo14883a();
    }

    /* renamed from: d */
    public final C4940h<Void> mo13643d(int i, Bundle bundle) {
        return m18521e(new C4355r(m18518a(), 2, bundle));
    }

    /* renamed from: f */
    public final C4940h<Bundle> mo13644f(int i, Bundle bundle) {
        return m18521e(new C4360w(m18518a(), 1, bundle));
    }
}
