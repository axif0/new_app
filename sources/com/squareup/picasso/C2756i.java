package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.karumi.dexter.BuildConfig;
import com.squareup.picasso.C2772r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.i */
class C2756i {

    /* renamed from: a */
    final C2759b f8803a;

    /* renamed from: b */
    final Context f8804b;

    /* renamed from: c */
    final ExecutorService f8805c;

    /* renamed from: d */
    final C2761j f8806d;

    /* renamed from: e */
    final Map<String, C2739c> f8807e = new LinkedHashMap();

    /* renamed from: f */
    final Map<Object, C2732a> f8808f = new WeakHashMap();

    /* renamed from: g */
    final Map<Object, C2732a> f8809g = new WeakHashMap();

    /* renamed from: h */
    final Set<Object> f8810h = new LinkedHashSet();

    /* renamed from: i */
    final Handler f8811i = new C2757a(this.f8803a.getLooper(), this);

    /* renamed from: j */
    final Handler f8812j;

    /* renamed from: k */
    final C2747d f8813k;

    /* renamed from: l */
    final C2734a0 f8814l;

    /* renamed from: m */
    final List<C2739c> f8815m;

    /* renamed from: n */
    final C2760c f8816n;

    /* renamed from: o */
    final boolean f8817o;

    /* renamed from: p */
    boolean f8818p;

    /* renamed from: com.squareup.picasso.i$a */
    private static class C2757a extends Handler {

        /* renamed from: a */
        private final C2756i f8819a;

        /* renamed from: com.squareup.picasso.i$a$a */
        class C2758a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Message f8820f;

            C2758a(C2757a aVar, Message message) {
                this.f8820f = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f8820f.what);
            }
        }

        C2757a(Looper looper, C2756i iVar) {
            super(looper);
            this.f8819a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.f8819a.mo10068v((C2732a) message.obj);
                    return;
                case 2:
                    this.f8819a.mo10061o((C2732a) message.obj);
                    return;
                case 4:
                    this.f8819a.mo10062p((C2739c) message.obj);
                    return;
                case 5:
                    this.f8819a.mo10067u((C2739c) message.obj);
                    return;
                case 6:
                    this.f8819a.mo10063q((C2739c) message.obj, false);
                    return;
                case 7:
                    this.f8819a.mo10060n();
                    return;
                case 9:
                    this.f8819a.mo10064r((NetworkInfo) message.obj);
                    return;
                case 10:
                    C2756i iVar = this.f8819a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    iVar.mo10059m(z);
                    return;
                case 11:
                    this.f8819a.mo10065s(message.obj);
                    return;
                case 12:
                    this.f8819a.mo10066t(message.obj);
                    return;
                default:
                    C2776t.f8856p.post(new C2758a(this, message));
                    return;
            }
        }
    }

    /* renamed from: com.squareup.picasso.i$b */
    static class C2759b extends HandlerThread {
        C2759b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: com.squareup.picasso.i$c */
    static class C2760c extends BroadcastReceiver {

        /* renamed from: a */
        private final C2756i f8821a;

        C2760c(C2756i iVar) {
            this.f8821a = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10072a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f8821a.f8817o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f8821a.f8804b.registerReceiver(this, intentFilter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f8821a.mo10052b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f8821a.mo10056f(((ConnectivityManager) C2748d0.m12151n(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    C2756i(Context context, ExecutorService executorService, Handler handler, C2761j jVar, C2747d dVar, C2734a0 a0Var) {
        C2759b bVar = new C2759b();
        this.f8803a = bVar;
        bVar.start();
        C2748d0.m12145h(this.f8803a.getLooper());
        this.f8804b = context;
        this.f8805c = executorService;
        this.f8806d = jVar;
        this.f8812j = handler;
        this.f8813k = dVar;
        this.f8814l = a0Var;
        this.f8815m = new ArrayList(4);
        this.f8818p = C2748d0.m12153p(this.f8804b);
        this.f8817o = C2748d0.m12152o(context, "android.permission.ACCESS_NETWORK_STATE");
        C2760c cVar = new C2760c(this);
        this.f8816n = cVar;
        cVar.mo10072a();
    }

    /* renamed from: a */
    private void m12167a(C2739c cVar) {
        if (!cVar.mo10027u()) {
            Bitmap bitmap = cVar.f8782r;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f8815m.add(cVar);
            if (!this.f8811i.hasMessages(7)) {
                this.f8811i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    /* renamed from: i */
    private void m12168i() {
        if (!this.f8808f.isEmpty()) {
            Iterator<C2732a> it = this.f8808f.values().iterator();
            while (it.hasNext()) {
                C2732a next = it.next();
                it.remove();
                if (next.mo9988g().f8871n) {
                    C2748d0.m12156s("Dispatcher", "replaying", next.mo9990i().mo10121d());
                }
                mo10069w(next, false);
            }
        }
    }

    /* renamed from: j */
    private void m12169j(List<C2739c> list) {
        if (list != null && !list.isEmpty() && list.get(0).mo10022q().f8871n) {
            StringBuilder sb = new StringBuilder();
            for (C2739c next : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C2748d0.m12147j(next));
            }
            C2748d0.m12156s("Dispatcher", "delivered", sb.toString());
        }
    }

    /* renamed from: k */
    private void m12170k(C2732a aVar) {
        Object k = aVar.mo9992k();
        if (k != null) {
            aVar.f8729k = true;
            this.f8808f.put(k, aVar);
        }
    }

    /* renamed from: l */
    private void m12171l(C2739c cVar) {
        C2732a h = cVar.mo10015h();
        if (h != null) {
            m12170k(h);
        }
        List<C2732a> i = cVar.mo10016i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                m12170k(i.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10052b(boolean z) {
        Handler handler = this.f8811i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10053c(C2732a aVar) {
        Handler handler = this.f8811i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10054d(C2739c cVar) {
        Handler handler = this.f8811i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10055e(C2739c cVar) {
        Handler handler = this.f8811i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10056f(NetworkInfo networkInfo) {
        Handler handler = this.f8811i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo10057g(C2739c cVar) {
        Handler handler = this.f8811i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10058h(C2732a aVar) {
        Handler handler = this.f8811i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo10059m(boolean z) {
        this.f8818p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo10060n() {
        ArrayList arrayList = new ArrayList(this.f8815m);
        this.f8815m.clear();
        Handler handler = this.f8812j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m12169j(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo10061o(C2732a aVar) {
        String d = aVar.mo9985d();
        C2739c cVar = this.f8807e.get(d);
        if (cVar != null) {
            cVar.mo10014f(aVar);
            if (cVar.mo10013c()) {
                this.f8807e.remove(d);
                if (aVar.mo9988g().f8871n) {
                    C2748d0.m12156s("Dispatcher", "canceled", aVar.mo9990i().mo10121d());
                }
            }
        }
        if (this.f8810h.contains(aVar.mo9991j())) {
            this.f8809g.remove(aVar.mo9992k());
            if (aVar.mo9988g().f8871n) {
                C2748d0.m12157t("Dispatcher", "canceled", aVar.mo9990i().mo10121d(), "because paused request got canceled");
            }
        }
        C2732a remove = this.f8808f.remove(aVar.mo9992k());
        if (remove != null && remove.mo9988g().f8871n) {
            C2748d0.m12157t("Dispatcher", "canceled", remove.mo9990i().mo10121d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo10062p(C2739c cVar) {
        if (C2770p.m12212g(cVar.mo10021p())) {
            this.f8813k.mo10040c(cVar.mo10019n(), cVar.mo10025s());
        }
        this.f8807e.remove(cVar.mo10019n());
        m12167a(cVar);
        if (cVar.mo10022q().f8871n) {
            C2748d0.m12157t("Dispatcher", "batched", C2748d0.m12147j(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo10063q(C2739c cVar, boolean z) {
        if (cVar.mo10022q().f8871n) {
            String j = C2748d0.m12147j(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : BuildConfig.FLAVOR);
            C2748d0.m12157t("Dispatcher", "batched", j, sb.toString());
        }
        this.f8807e.remove(cVar.mo10019n());
        m12167a(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10064r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f8805c;
        if (executorService instanceof C2787v) {
            ((C2787v) executorService).mo10114a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            m12168i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo10065s(Object obj) {
        if (this.f8810h.add(obj)) {
            Iterator<C2739c> it = this.f8807e.values().iterator();
            while (it.hasNext()) {
                C2739c next = it.next();
                boolean z = next.mo10022q().f8871n;
                C2732a h = next.mo10015h();
                List<C2732a> i = next.mo10016i();
                boolean z2 = i != null && !i.isEmpty();
                if (h != null || z2) {
                    if (h != null && h.mo9991j().equals(obj)) {
                        next.mo10014f(h);
                        this.f8809g.put(h.mo9992k(), h);
                        if (z) {
                            C2748d0.m12157t("Dispatcher", "paused", h.f8720b.mo10121d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = i.size() - 1; size >= 0; size--) {
                            C2732a aVar = i.get(size);
                            if (aVar.mo9991j().equals(obj)) {
                                next.mo10014f(aVar);
                                this.f8809g.put(aVar.mo9992k(), aVar);
                                if (z) {
                                    C2748d0.m12157t("Dispatcher", "paused", aVar.f8720b.mo10121d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.mo10013c()) {
                        it.remove();
                        if (z) {
                            C2748d0.m12157t("Dispatcher", "canceled", C2748d0.m12147j(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo10066t(Object obj) {
        if (this.f8810h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<C2732a> it = this.f8809g.values().iterator();
            while (it.hasNext()) {
                C2732a next = it.next();
                if (next.mo9991j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f8812j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: u */
    public void mo10067u(C2739c cVar) {
        if (!cVar.mo10027u()) {
            boolean z = false;
            if (this.f8805c.isShutdown()) {
                mo10063q(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f8817o) {
                networkInfo = ((ConnectivityManager) C2748d0.m12151n(this.f8804b, "connectivity")).getActiveNetworkInfo();
            }
            if (cVar.mo10028w(this.f8818p, networkInfo)) {
                if (cVar.mo10022q().f8871n) {
                    C2748d0.m12156s("Dispatcher", "retrying", C2748d0.m12147j(cVar));
                }
                if (cVar.mo10018k() instanceof C2772r.C2773a) {
                    cVar.f8778n |= C2771q.NO_CACHE.f8849f;
                }
                cVar.f8783s = this.f8805c.submit(cVar);
                return;
            }
            if (this.f8817o && cVar.mo10029x()) {
                z = true;
            }
            mo10063q(cVar, z);
            if (z) {
                m12171l(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10068v(C2732a aVar) {
        mo10069w(aVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo10069w(C2732a aVar, boolean z) {
        if (this.f8810h.contains(aVar.mo9991j())) {
            this.f8809g.put(aVar.mo9992k(), aVar);
            if (aVar.mo9988g().f8871n) {
                String d = aVar.f8720b.mo10121d();
                C2748d0.m12157t("Dispatcher", "paused", d, "because tag '" + aVar.mo9991j() + "' is paused");
                return;
            }
            return;
        }
        C2739c cVar = this.f8807e.get(aVar.mo9985d());
        if (cVar != null) {
            cVar.mo10012b(aVar);
        } else if (!this.f8805c.isShutdown()) {
            C2739c g = C2739c.m12108g(aVar.mo9988g(), this, this.f8813k, this.f8814l, aVar);
            g.f8783s = this.f8805c.submit(g);
            this.f8807e.put(aVar.mo9985d(), g);
            if (z) {
                this.f8808f.remove(aVar.mo9992k());
            }
            if (aVar.mo9988g().f8871n) {
                C2748d0.m12156s("Dispatcher", "enqueued", aVar.f8720b.mo10121d());
            }
        } else if (aVar.mo9988g().f8871n) {
            C2748d0.m12157t("Dispatcher", "ignored", aVar.f8720b.mo10121d(), "because shut down");
        }
    }
}
