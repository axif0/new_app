package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1639h;
import com.google.android.gms.common.internal.C1648k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p148g.p189d.p190a.p232c.p237d.C4366b;
import p148g.p189d.p190a.p232c.p237d.C4370d;
import p148g.p189d.p190a.p232c.p237d.C4375f;
import p148g.p189d.p190a.p232c.p241f.p245d.C4423d;

/* renamed from: com.google.android.gms.common.internal.b */
public abstract class C1613b<T extends IInterface> {

    /* renamed from: v */
    private static final C4370d[] f5424v = new C4370d[0];

    /* renamed from: a */
    private C1636f0 f5425a;

    /* renamed from: b */
    private final Context f5426b;

    /* renamed from: c */
    private final C1639h f5427c;

    /* renamed from: d */
    private final C4375f f5428d;

    /* renamed from: e */
    final Handler f5429e;

    /* renamed from: f */
    private final Object f5430f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f5431g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1653m f5432h;

    /* renamed from: i */
    protected C1616c f5433i;

    /* renamed from: j */
    private T f5434j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ArrayList<C1621h<?>> f5435k;

    /* renamed from: l */
    private C1623j f5436l;

    /* renamed from: m */
    private int f5437m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1614a f5438n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1615b f5439o;

    /* renamed from: p */
    private final int f5440p;

    /* renamed from: q */
    private final String f5441q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C4366b f5442r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f5443s;

    /* renamed from: t */
    private volatile C1672z f5444t;

    /* renamed from: u */
    protected AtomicInteger f5445u;

    /* renamed from: com.google.android.gms.common.internal.b$a */
    public interface C1614a {
        /* renamed from: n */
        void mo6481n(int i);

        /* renamed from: w */
        void mo6482w(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b */
    public interface C1615b {
        /* renamed from: r */
        void mo6483r(C4366b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.b$c */
    public interface C1616c {
        /* renamed from: a */
        void mo6399a(C4366b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.b$d */
    protected class C1617d implements C1616c {
        public C1617d() {
        }

        /* renamed from: a */
        public void mo6399a(C4366b bVar) {
            if (bVar.mo13679j()) {
                C1613b bVar2 = C1613b.this;
                bVar2.mo6461d((C1644j) null, bVar2.mo6446A());
            } else if (C1613b.this.f5439o != null) {
                C1613b.this.f5439o.mo6483r(bVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$e */
    public interface C1618e {
        /* renamed from: a */
        void mo6430a();
    }

    /* renamed from: com.google.android.gms.common.internal.b$f */
    private abstract class C1619f extends C1621h<Boolean> {

        /* renamed from: d */
        private final int f5447d;

        /* renamed from: e */
        private final Bundle f5448e;

        protected C1619f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f5447d = i;
            this.f5448e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo6484c(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.b r5 = com.google.android.gms.common.internal.C1613b.this
                r5.m7670P(r0, null)
                return
            L_0x000c:
                int r5 = r4.f5447d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                com.google.android.gms.common.internal.b r5 = com.google.android.gms.common.internal.C1613b.this
                r5.m7670P(r0, null)
                android.os.Bundle r5 = r4.f5448e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                g.d.a.c.d.b r5 = new g.d.a.c.d.b
                int r0 = r4.f5447d
                r5.<init>(r0, r1)
                r4.mo6486f(r5)
                goto L_0x0076
            L_0x0031:
                com.google.android.gms.common.internal.b r5 = com.google.android.gms.common.internal.C1613b.this
                r5.m7670P(r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.b r2 = com.google.android.gms.common.internal.C1613b.this
                java.lang.String r2 = r2.mo6471p()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.b r2 = com.google.android.gms.common.internal.C1613b.this
                java.lang.String r2 = r2.mo6460c()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.mo6487g()
                if (r5 != 0) goto L_0x0076
                com.google.android.gms.common.internal.b r5 = com.google.android.gms.common.internal.C1613b.this
                r5.m7670P(r0, null)
                g.d.a.c.d.b r5 = new g.d.a.c.d.b
                r0 = 8
                r5.<init>(r0, r1)
                r4.mo6486f(r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1613b.C1619f.mo6484c(java.lang.Object):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo6485d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo6486f(C4366b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract boolean mo6487g();
    }

    /* renamed from: com.google.android.gms.common.internal.b$g */
    final class C1620g extends C4423d {
        public C1620g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m7732a(Message message) {
            C1621h hVar = (C1621h) message.obj;
            hVar.mo6485d();
            hVar.mo6490b();
        }

        /* renamed from: b */
        private static boolean m7733b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f5445u
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = m7733b(r8)
                if (r0 == 0) goto L_0x0015
                m7732a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002e
                r4 = 7
                if (r0 == r4) goto L_0x002e
                if (r0 != r1) goto L_0x002a
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                boolean r0 = r0.mo6474t()
                if (r0 == 0) goto L_0x002e
            L_0x002a:
                int r0 = r8.what
                if (r0 != r3) goto L_0x003a
            L_0x002e:
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                boolean r0 = r0.mo6465i()
                if (r0 != 0) goto L_0x003a
                m7732a(r8)
                return
            L_0x003a:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                g.d.a.c.d.b r1 = new g.d.a.c.d.b
                int r8 = r8.arg2
                r1.<init>(r8)
                p148g.p189d.p190a.p232c.p237d.C4366b unused = r0.f5442r = r1
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                boolean r8 = r8.m7686f0()
                if (r8 == 0) goto L_0x0064
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                boolean r8 = r8.f5443s
                if (r8 != 0) goto L_0x0064
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                r8.m7670P(r5, null)
                return
            L_0x0064:
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                g.d.a.c.d.b r8 = r8.f5442r
                if (r8 == 0) goto L_0x0073
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                g.d.a.c.d.b r8 = r8.f5442r
                goto L_0x0078
            L_0x0073:
                g.d.a.c.d.b r8 = new g.d.a.c.d.b
                r8.<init>(r4)
            L_0x0078:
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                com.google.android.gms.common.internal.b$c r0 = r0.f5433i
                r0.mo6399a(r8)
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                r0.mo6450E(r8)
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a8
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                g.d.a.c.d.b r8 = r8.f5442r
                if (r8 == 0) goto L_0x0096
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                g.d.a.c.d.b r8 = r8.f5442r
                goto L_0x009b
            L_0x0096:
                g.d.a.c.d.b r8 = new g.d.a.c.d.b
                r8.<init>(r4)
            L_0x009b:
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                com.google.android.gms.common.internal.b$c r0 = r0.f5433i
                r0.mo6399a(r8)
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                r0.mo6450E(r8)
                return
            L_0x00a8:
                if (r0 != r5) goto L_0x00c7
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00b3
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b3:
                g.d.a.c.d.b r0 = new g.d.a.c.d.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                com.google.android.gms.common.internal.b$c r8 = r8.f5433i
                r8.mo6399a(r0)
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                r8.mo6450E(r0)
                return
            L_0x00c7:
                r1 = 6
                if (r0 != r1) goto L_0x00ef
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                r0.m7670P(r3, null)
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                com.google.android.gms.common.internal.b$a r0 = r0.f5438n
                if (r0 == 0) goto L_0x00e2
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                com.google.android.gms.common.internal.b$a r0 = r0.f5438n
                int r1 = r8.arg2
                r0.mo6481n(r1)
            L_0x00e2:
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                int r8 = r8.arg2
                r0.mo6451F(r8)
                com.google.android.gms.common.internal.b r8 = com.google.android.gms.common.internal.C1613b.this
                boolean unused = r8.m7675U(r3, r2, r6)
                return
            L_0x00ef:
                r1 = 2
                if (r0 != r1) goto L_0x00fe
                com.google.android.gms.common.internal.b r0 = com.google.android.gms.common.internal.C1613b.this
                boolean r0 = r0.mo6459b()
                if (r0 != 0) goto L_0x00fe
                m7732a(r8)
                return
            L_0x00fe:
                boolean r0 = m7733b(r8)
                if (r0 == 0) goto L_0x010c
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.b$h r8 = (com.google.android.gms.common.internal.C1613b.C1621h) r8
                r8.mo6491e()
                return
            L_0x010c:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1613b.C1620g.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$h */
    protected abstract class C1621h<TListener> {

        /* renamed from: a */
        private TListener f5451a;

        /* renamed from: b */
        private boolean f5452b = false;

        public C1621h(TListener tlistener) {
            this.f5451a = tlistener;
        }

        /* renamed from: a */
        public final void mo6489a() {
            synchronized (this) {
                this.f5451a = null;
            }
        }

        /* renamed from: b */
        public final void mo6490b() {
            mo6489a();
            synchronized (C1613b.this.f5435k) {
                C1613b.this.f5435k.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo6484c(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo6485d();

        /* renamed from: e */
        public final void mo6491e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f5451a;
                if (this.f5452b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo6484c(tlistener);
                } catch (RuntimeException e) {
                    mo6485d();
                    throw e;
                }
            } else {
                mo6485d();
            }
            synchronized (this) {
                this.f5452b = true;
            }
            mo6490b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$i */
    public static final class C1622i extends C1648k.C1649a {

        /* renamed from: a */
        private C1613b f5454a;

        /* renamed from: b */
        private final int f5455b;

        public C1622i(C1613b bVar, int i) {
            this.f5454a = bVar;
            this.f5455b = i;
        }

        /* renamed from: I0 */
        public final void mo6492I0(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: Q0 */
        public final void mo6493Q0(int i, IBinder iBinder, Bundle bundle) {
            C1658o.m7846k(this.f5454a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f5454a.mo6452G(i, iBinder, bundle, this.f5455b);
            this.f5454a = null;
        }

        /* renamed from: x0 */
        public final void mo6494x0(int i, IBinder iBinder, C1672z zVar) {
            C1658o.m7846k(this.f5454a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C1658o.m7845j(zVar);
            this.f5454a.m7674T(zVar);
            mo6493Q0(i, iBinder, zVar.f5542f);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$j */
    public final class C1623j implements ServiceConnection {

        /* renamed from: a */
        private final int f5456a;

        public C1623j(int i) {
            this.f5456a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1653m mVar;
            C1613b bVar = C1613b.this;
            if (iBinder == null) {
                bVar.m7677W(16);
                return;
            }
            synchronized (bVar.f5431g) {
                C1613b bVar2 = C1613b.this;
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    mVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C1653m)) ? new C1651l(iBinder) : (C1653m) queryLocalInterface;
                }
                C1653m unused = bVar2.f5432h = mVar;
            }
            C1613b.this.mo6457O(0, (Bundle) null, this.f5456a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C1613b.this.f5431g) {
                C1653m unused = C1613b.this.f5432h = null;
            }
            Handler handler = C1613b.this.f5429e;
            handler.sendMessage(handler.obtainMessage(6, this.f5456a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$k */
    protected final class C1624k extends C1619f {

        /* renamed from: g */
        private final IBinder f5458g;

        public C1624k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f5458g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo6486f(C4366b bVar) {
            if (C1613b.this.f5439o != null) {
                C1613b.this.f5439o.mo6483r(bVar);
            }
            C1613b.this.mo6450E(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final boolean mo6487g() {
            try {
                String interfaceDescriptor = this.f5458g.getInterfaceDescriptor();
                if (!C1613b.this.mo6460c().equals(interfaceDescriptor)) {
                    String c = C1613b.this.mo6460c();
                    StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(c);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface e = C1613b.this.mo6462e(this.f5458g);
                if (e == null || (!C1613b.this.m7675U(2, 4, e) && !C1613b.this.m7675U(3, 4, e))) {
                    return false;
                }
                C4366b unused = C1613b.this.f5442r = null;
                Bundle w = C1613b.this.mo6477w();
                if (C1613b.this.f5438n == null) {
                    return true;
                }
                C1613b.this.f5438n.mo6482w(w);
                return true;
            } catch (RemoteException unused2) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$l */
    protected final class C1625l extends C1619f {
        public C1625l(int i, Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo6486f(C4366b bVar) {
            if (!C1613b.this.mo6474t() || !C1613b.this.m7686f0()) {
                C1613b.this.f5433i.mo6399a(bVar);
                C1613b.this.mo6450E(bVar);
                return;
            }
            C1613b.this.m7677W(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final boolean mo6487g() {
            C1613b.this.f5433i.mo6399a(C4366b.f13896j);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C1613b(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C1613b.C1614a r13, com.google.android.gms.common.internal.C1613b.C1615b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.h r3 = com.google.android.gms.common.internal.C1639h.m7803a(r10)
            g.d.a.c.d.f r4 = p148g.p189d.p190a.p232c.p237d.C4375f.m18582f()
            com.google.android.gms.common.internal.C1658o.m7845j(r13)
            r6 = r13
            com.google.android.gms.common.internal.b$a r6 = (com.google.android.gms.common.internal.C1613b.C1614a) r6
            com.google.android.gms.common.internal.C1658o.m7845j(r14)
            r7 = r14
            com.google.android.gms.common.internal.b$b r7 = (com.google.android.gms.common.internal.C1613b.C1615b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1613b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    protected C1613b(Context context, Looper looper, C1639h hVar, C4375f fVar, int i, C1614a aVar, C1615b bVar, String str) {
        this.f5430f = new Object();
        this.f5431g = new Object();
        this.f5435k = new ArrayList<>();
        this.f5437m = 1;
        this.f5442r = null;
        this.f5443s = false;
        this.f5444t = null;
        this.f5445u = new AtomicInteger(0);
        C1658o.m7846k(context, "Context must not be null");
        this.f5426b = context;
        C1658o.m7846k(looper, "Looper must not be null");
        Looper looper2 = looper;
        C1658o.m7846k(hVar, "Supervisor must not be null");
        this.f5427c = hVar;
        C1658o.m7846k(fVar, "API availability must not be null");
        this.f5428d = fVar;
        this.f5429e = new C1620g(looper);
        this.f5440p = i;
        this.f5438n = aVar;
        this.f5439o = bVar;
        this.f5441q = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m7670P(int i, T t) {
        C1658o.m7836a((i == 4) == (t != null));
        synchronized (this.f5430f) {
            this.f5437m = i;
            this.f5434j = t;
            mo6453H(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f5436l == null || this.f5425a == null)) {
                        String c = this.f5425a.mo6533c();
                        String a = this.f5425a.mo6531a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c);
                        sb.append(" on ");
                        sb.append(a);
                        Log.e("GmsClient", sb.toString());
                        this.f5427c.mo6537b(this.f5425a.mo6533c(), this.f5425a.mo6531a(), this.f5425a.mo6532b(), this.f5436l, m7684d0());
                        this.f5445u.incrementAndGet();
                    }
                    this.f5436l = new C1623j(this.f5445u.get());
                    C1636f0 f0Var = (this.f5437m != 3 || mo6480z() == null) ? new C1636f0(mo6448C(), mo6471p(), false, 129) : new C1636f0(mo6478x().getPackageName(), mo6480z(), true, 129);
                    this.f5425a = f0Var;
                    if (!this.f5427c.mo6513c(new C1639h.C1640a(f0Var.mo6533c(), this.f5425a.mo6531a(), this.f5425a.mo6532b()), this.f5436l, m7684d0())) {
                        String c2 = this.f5425a.mo6533c();
                        String a2 = this.f5425a.mo6531a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c2);
                        sb2.append(" on ");
                        sb2.append(a2);
                        Log.e("GmsClient", sb2.toString());
                        mo6457O(16, (Bundle) null, this.f5445u.get());
                    }
                } else if (i == 4) {
                    mo6449D(t);
                }
            } else if (this.f5436l != null) {
                this.f5427c.mo6537b(this.f5425a.mo6533c(), this.f5425a.mo6531a(), this.f5425a.mo6532b(), this.f5436l, m7684d0());
                this.f5436l = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m7674T(C1672z zVar) {
        this.f5444t = zVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final boolean m7675U(int i, int i2, T t) {
        synchronized (this.f5430f) {
            if (this.f5437m != i) {
                return false;
            }
            m7670P(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final void m7677W(int i) {
        int i2;
        if (m7685e0()) {
            i2 = 5;
            this.f5443s = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f5429e;
        handler.sendMessage(handler.obtainMessage(i2, this.f5445u.get(), 16));
    }

    /* renamed from: d0 */
    private final String m7684d0() {
        String str = this.f5441q;
        return str == null ? this.f5426b.getClass().getName() : str;
    }

    /* renamed from: e0 */
    private final boolean m7685e0() {
        boolean z;
        synchronized (this.f5430f) {
            z = this.f5437m == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final boolean m7686f0() {
        if (this.f5443s || TextUtils.isEmpty(mo6460c()) || TextUtils.isEmpty(mo6480z())) {
            return false;
        }
        try {
            Class.forName(mo6460c());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Set<Scope> mo6446A() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: B */
    public final T mo6447B() throws DeadObjectException {
        T t;
        synchronized (this.f5430f) {
            if (this.f5437m != 5) {
                mo6473s();
                C1658o.m7849n(this.f5434j != null, "Client is connected but service is null");
                t = this.f5434j;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public String mo6448C() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo6449D(T t) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6450E(C4366b bVar) {
        bVar.mo13673d();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo6451F(int i) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6452G(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f5429e;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C1624k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo6453H(int i, T t) {
    }

    /* renamed from: I */
    public boolean mo6454I() {
        return false;
    }

    /* renamed from: J */
    public void mo6455J(int i) {
        Handler handler = this.f5429e;
        handler.sendMessage(handler.obtainMessage(6, this.f5445u.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6456K(C1616c cVar, int i, PendingIntent pendingIntent) {
        C1658o.m7846k(cVar, "Connection progress callbacks cannot be null.");
        this.f5433i = cVar;
        Handler handler = this.f5429e;
        handler.sendMessage(handler.obtainMessage(3, this.f5445u.get(), i, pendingIntent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo6457O(int i, Bundle bundle, int i2) {
        Handler handler = this.f5429e;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C1625l(i, (Bundle) null)));
    }

    /* renamed from: a */
    public void mo6458a(C1618e eVar) {
        eVar.mo6430a();
    }

    /* renamed from: b */
    public boolean mo6459b() {
        boolean z;
        synchronized (this.f5430f) {
            z = this.f5437m == 4;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo6460c();

    /* renamed from: d */
    public void mo6461d(C1644j jVar, Set<Scope> set) {
        Bundle y = mo6479y();
        C1635f fVar = new C1635f(this.f5440p);
        fVar.f5497i = this.f5426b.getPackageName();
        fVar.f5500l = y;
        if (set != null) {
            fVar.f5499k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo6470o()) {
            fVar.f5501m = mo6475u() != null ? mo6475u() : new Account("<<default account>>", "com.google");
            if (jVar != null) {
                fVar.f5498j = jVar.asBinder();
            }
        } else if (mo6454I()) {
            fVar.f5501m = mo6475u();
        }
        fVar.f5502n = f5424v;
        fVar.f5503o = mo6476v();
        try {
            synchronized (this.f5431g) {
                if (this.f5432h != null) {
                    this.f5432h.mo6551e0(new C1622i(this, this.f5445u.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo6455J(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo6452G(8, (IBinder) null, (Bundle) null, this.f5445u.get());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract T mo6462e(IBinder iBinder);

    /* renamed from: f */
    public boolean mo6463f() {
        return true;
    }

    /* renamed from: g */
    public int mo6464g() {
        return C4375f.f13916a;
    }

    /* renamed from: i */
    public boolean mo6465i() {
        boolean z;
        synchronized (this.f5430f) {
            if (this.f5437m != 2) {
                if (this.f5437m != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final C4370d[] mo6466j() {
        C1672z zVar = this.f5444t;
        if (zVar == null) {
            return null;
        }
        return zVar.f5543g;
    }

    /* renamed from: k */
    public String mo6467k() {
        C1636f0 f0Var;
        if (mo6459b() && (f0Var = this.f5425a) != null) {
            return f0Var.mo6531a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: l */
    public void mo6468l(C1616c cVar) {
        C1658o.m7846k(cVar, "Connection progress callbacks cannot be null.");
        this.f5433i = cVar;
        m7670P(2, (IInterface) null);
    }

    /* renamed from: m */
    public void mo6469m() {
        this.f5445u.incrementAndGet();
        synchronized (this.f5435k) {
            int size = this.f5435k.size();
            for (int i = 0; i < size; i++) {
                this.f5435k.get(i).mo6489a();
            }
            this.f5435k.clear();
        }
        synchronized (this.f5431g) {
            this.f5432h = null;
        }
        m7670P(1, (IInterface) null);
    }

    /* renamed from: o */
    public boolean mo6470o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract String mo6471p();

    /* renamed from: r */
    public void mo6472r() {
        int h = this.f5428d.mo13699h(this.f5426b, mo6464g());
        if (h != 0) {
            m7670P(1, (IInterface) null);
            mo6456K(new C1617d(), h, (PendingIntent) null);
            return;
        }
        mo6468l(new C1617d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo6473s() {
        if (!mo6459b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo6474t() {
        return false;
    }

    /* renamed from: u */
    public Account mo6475u() {
        return null;
    }

    /* renamed from: v */
    public C4370d[] mo6476v() {
        return f5424v;
    }

    /* renamed from: w */
    public Bundle mo6477w() {
        return null;
    }

    /* renamed from: x */
    public final Context mo6478x() {
        return this.f5426b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Bundle mo6479y() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo6480z() {
        return null;
    }
}
