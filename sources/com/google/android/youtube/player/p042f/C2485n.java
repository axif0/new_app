package com.google.android.youtube.player.p042f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.youtube.player.C2452a;
import com.google.android.youtube.player.C2453b;
import com.google.android.youtube.player.p042f.C2466f;
import com.google.android.youtube.player.p042f.C2468g;
import com.google.android.youtube.player.p042f.C2492o;
import java.util.ArrayList;

/* renamed from: com.google.android.youtube.player.f.n */
public abstract class C2485n<T extends IInterface> implements C2492o {

    /* renamed from: a */
    private final Context f8144a;

    /* renamed from: b */
    final Handler f8145b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public T f8146c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C2492o.C2493a> f8147d;

    /* renamed from: e */
    private final ArrayList<C2492o.C2493a> f8148e = new ArrayList<>();

    /* renamed from: f */
    private boolean f8149f = false;

    /* renamed from: g */
    private ArrayList<C2492o.C2494b> f8150g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ArrayList<C2488c<?>> f8151h = new ArrayList<>();

    /* renamed from: i */
    private ServiceConnection f8152i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8153j = false;

    /* renamed from: com.google.android.youtube.player.f.n$a */
    static /* synthetic */ class C2486a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8154a;

        static {
            int[] iArr = new int[C2453b.values().length];
            f8154a = iArr;
            try {
                iArr[C2453b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.f.n$b */
    final class C2487b extends Handler {
        C2487b() {
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                C2485n.this.mo9340g((C2453b) message.obj);
            } else if (i == 4) {
                synchronized (C2485n.this.f8147d) {
                    if (C2485n.this.f8153j && C2485n.this.mo9342q() && C2485n.this.f8147d.contains(message.obj)) {
                        ((C2492o.C2493a) message.obj).mo9298d();
                    }
                }
            } else if (i != 2 || C2485n.this.mo9342q()) {
                int i2 = message.what;
                if (i2 == 2 || i2 == 1) {
                    ((C2488c) message.obj).mo9348a();
                }
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.f.n$c */
    protected abstract class C2488c<TListener> {

        /* renamed from: a */
        private TListener f8156a;

        public C2488c(C2485n nVar, TListener tlistener) {
            this.f8156a = tlistener;
            synchronized (nVar.f8151h) {
                nVar.f8151h.add(this);
            }
        }

        /* renamed from: a */
        public final void mo9348a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f8156a;
            }
            mo9349b(tlistener);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo9349b(TListener tlistener);

        /* renamed from: c */
        public final void mo9350c() {
            synchronized (this) {
                this.f8156a = null;
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.f.n$d */
    protected final class C2489d extends C2488c<Boolean> {

        /* renamed from: b */
        public final C2453b f8157b;

        /* renamed from: c */
        public final IBinder f8158c;

        public C2489d(String str, IBinder iBinder) {
            super(C2485n.this, Boolean.TRUE);
            this.f8157b = C2485n.m11196i(str);
            this.f8158c = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final /* synthetic */ void mo9349b(Object obj) {
            if (((Boolean) obj) == null) {
                return;
            }
            if (C2486a.f8154a[this.f8157b.ordinal()] != 1) {
                C2485n.this.mo9340g(this.f8157b);
                return;
            }
            try {
                if (C2485n.this.mo9333j().equals(this.f8158c.getInterfaceDescriptor())) {
                    IInterface unused = C2485n.this.f8146c = C2485n.this.mo9331b(this.f8158c);
                    if (C2485n.this.f8146c != null) {
                        C2485n.this.mo9343r();
                        return;
                    }
                }
            } catch (RemoteException unused2) {
            }
            C2485n.this.m11195f();
            C2485n.this.mo9340g(C2453b.INTERNAL_ERROR);
        }
    }

    /* renamed from: com.google.android.youtube.player.f.n$e */
    protected final class C2490e extends C2466f.C2467a {
        protected C2490e() {
        }

        /* renamed from: d0 */
        public final void mo9316d0(String str, IBinder iBinder) {
            C2485n nVar = C2485n.this;
            Handler handler = nVar.f8145b;
            handler.sendMessage(handler.obtainMessage(1, new C2489d(str, iBinder)));
        }
    }

    /* renamed from: com.google.android.youtube.player.f.n$f */
    final class C2491f implements ServiceConnection {
        C2491f() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2485n.this.mo9341k(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            IInterface unused = C2485n.this.f8146c = null;
            C2485n.this.mo9344s();
        }
    }

    protected C2485n(Context context, C2492o.C2493a aVar, C2492o.C2494b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C2463c.m11153a(context);
            this.f8144a = context;
            ArrayList<C2492o.C2493a> arrayList = new ArrayList<>();
            this.f8147d = arrayList;
            C2463c.m11153a(aVar);
            arrayList.add(aVar);
            ArrayList<C2492o.C2494b> arrayList2 = new ArrayList<>();
            this.f8150g = arrayList2;
            C2463c.m11153a(bVar);
            arrayList2.add(bVar);
            this.f8145b = new C2487b();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11195f() {
        ServiceConnection serviceConnection = this.f8152i;
        if (serviceConnection != null) {
            try {
                this.f8144a.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f8146c = null;
        this.f8152i = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static C2453b m11196i(String str) {
        try {
            return C2453b.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return C2453b.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return C2453b.UNKNOWN_ERROR;
        }
    }

    /* renamed from: a */
    public final void mo9339a() {
        this.f8153j = true;
        C2453b b = C2452a.m11125b(this.f8144a);
        if (b != C2453b.SUCCESS) {
            Handler handler = this.f8145b;
            handler.sendMessage(handler.obtainMessage(3, b));
            return;
        }
        Intent intent = new Intent(mo9334m()).setPackage(C2497r.m11230c(this.f8144a));
        if (this.f8152i != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            m11195f();
        }
        C2491f fVar = new C2491f();
        this.f8152i = fVar;
        if (!this.f8144a.bindService(intent, fVar, 129)) {
            Handler handler2 = this.f8145b;
            handler2.sendMessage(handler2.obtainMessage(3, C2453b.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo9331b(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo9340g(C2453b bVar) {
        this.f8145b.removeMessages(4);
        synchronized (this.f8150g) {
            ArrayList<C2492o.C2494b> arrayList = this.f8150g;
            int i = 0;
            int size = arrayList.size();
            while (i < size) {
                if (this.f8153j) {
                    if (this.f8150g.contains(arrayList.get(i))) {
                        arrayList.get(i).mo9297a(bVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo9332h(C2468g gVar, C2490e eVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract String mo9333j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9341k(IBinder iBinder) {
        try {
            mo9332h(C2468g.C2469a.m11162n(iBinder), new C2490e());
        } catch (RemoteException unused) {
            Log.w("YouTubeClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo9334m();

    /* renamed from: q */
    public final boolean mo9342q() {
        return this.f8146c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo9343r() {
        synchronized (this.f8147d) {
            boolean z = true;
            C2463c.m11156d(!this.f8149f);
            this.f8145b.removeMessages(4);
            this.f8149f = true;
            if (this.f8148e.size() != 0) {
                z = false;
            }
            C2463c.m11156d(z);
            ArrayList<C2492o.C2493a> arrayList = this.f8147d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f8153j && mo9342q(); i++) {
                if (!this.f8148e.contains(arrayList.get(i))) {
                    arrayList.get(i).mo9298d();
                }
            }
            this.f8148e.clear();
            this.f8149f = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo9344s() {
        this.f8145b.removeMessages(4);
        synchronized (this.f8147d) {
            this.f8149f = true;
            ArrayList<C2492o.C2493a> arrayList = this.f8147d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f8153j; i++) {
                if (this.f8147d.contains(arrayList.get(i))) {
                    arrayList.get(i).mo9299o();
                }
            }
            this.f8149f = false;
        }
    }

    /* renamed from: t */
    public void mo9335t() {
        mo9344s();
        this.f8153j = false;
        synchronized (this.f8151h) {
            int size = this.f8151h.size();
            for (int i = 0; i < size; i++) {
                this.f8151h.get(i).mo9350c();
            }
            this.f8151h.clear();
        }
        m11195f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo9345u() {
        if (!mo9342q()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final T mo9346w() {
        mo9345u();
        return this.f8146c;
    }
}
