package p148g.p189d.p190a.p271e.p272a.p276c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.c.p */
public final class C5120p<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f15147l = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f15148a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5100f f15149b;

    /* renamed from: c */
    private final String f15150c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<C5102g> f15151d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15152e;

    /* renamed from: f */
    private final Intent f15153f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5112l<T> f15154g;

    /* renamed from: h */
    private final WeakReference<C5110k> f15155h;

    /* renamed from: i */
    private final IBinder.DeathRecipient f15156i = new C5104h(this);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ServiceConnection f15157j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public T f15158k;

    public C5120p(Context context, C5100f fVar, String str, Intent intent, C5112l<T> lVar) {
        this.f15148a = context;
        this.f15149b = fVar;
        this.f15150c = str;
        this.f15153f = intent;
        this.f15154g = lVar;
        this.f15155h = new WeakReference<>((Object) null);
    }

    /* renamed from: e */
    static /* synthetic */ void m21512e(C5120p pVar, C5102g gVar) {
        if (pVar.f15158k == null && !pVar.f15152e) {
            pVar.f15149b.mo15206f("Initiate binding to the service.", new Object[0]);
            pVar.f15151d.add(gVar);
            C5118o oVar = new C5118o(pVar);
            pVar.f15157j = oVar;
            pVar.f15152e = true;
            if (!pVar.f15148a.bindService(pVar.f15153f, oVar, 1)) {
                pVar.f15149b.mo15206f("Failed to bind to the service.", new Object[0]);
                pVar.f15152e = false;
                for (C5102g b : pVar.f15151d) {
                    C5163p<?> b2 = b.mo15208b();
                    if (b2 != null) {
                        b2.mo15264d(new C5122q());
                    }
                }
                pVar.f15151d.clear();
            }
        } else if (pVar.f15152e) {
            pVar.f15149b.mo15206f("Waiting to bind to the service.", new Object[0]);
            pVar.f15151d.add(gVar);
        } else {
            gVar.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m21514h(C5102g gVar) {
        Handler handler;
        synchronized (f15147l) {
            if (!f15147l.containsKey(this.f15150c)) {
                HandlerThread handlerThread = new HandlerThread(this.f15150c, 10);
                handlerThread.start();
                f15147l.put(this.f15150c, new Handler(handlerThread.getLooper()));
            }
            handler = f15147l.get(this.f15150c);
        }
        handler.post(gVar);
    }

    /* renamed from: n */
    static /* synthetic */ void m21519n(C5120p pVar) {
        pVar.f15149b.mo15206f("linkToDeath", new Object[0]);
        try {
            pVar.f15158k.asBinder().linkToDeath(pVar.f15156i, 0);
        } catch (RemoteException e) {
            pVar.f15149b.mo15204d(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m21521p(C5120p pVar) {
        pVar.f15149b.mo15206f("unlinkToDeath", new Object[0]);
        pVar.f15158k.asBinder().unlinkToDeath(pVar.f15156i, 0);
    }

    /* renamed from: b */
    public final void mo15221b() {
        m21514h(new C5108j(this));
    }

    /* renamed from: c */
    public final void mo15222c(C5102g gVar) {
        m21514h(new C5106i(this, gVar.mo15208b(), gVar));
    }

    /* renamed from: f */
    public final T mo15223f() {
        return this.f15158k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo15224k() {
        this.f15149b.mo15206f("reportBinderDeath", new Object[0]);
        C5110k kVar = (C5110k) this.f15155h.get();
        if (kVar == null) {
            this.f15149b.mo15206f("%s : Binder has died.", this.f15150c);
            for (C5102g b : this.f15151d) {
                C5163p<?> b2 = b.mo15208b();
                if (b2 != null) {
                    b2.mo15264d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f15150c).concat(" : Binder has died.")));
                }
            }
            this.f15151d.clear();
            return;
        }
        this.f15149b.mo15206f("calling onBinderDied", new Object[0]);
        kVar.mo15214d();
    }
}
