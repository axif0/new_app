package p148g.p189d.p190a.p200b.p231s0;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

@TargetApi(16)
/* renamed from: g.d.a.b.s0.f */
public final class C4299f {

    /* renamed from: a */
    private final WindowManager f13738a;

    /* renamed from: b */
    private final C4301b f13739b;

    /* renamed from: c */
    private final C4300a f13740c;

    /* renamed from: d */
    private long f13741d;

    /* renamed from: e */
    private long f13742e;

    /* renamed from: f */
    private long f13743f;

    /* renamed from: g */
    private long f13744g;

    /* renamed from: h */
    private long f13745h;

    /* renamed from: i */
    private boolean f13746i;

    /* renamed from: j */
    private long f13747j;

    /* renamed from: k */
    private long f13748k;

    /* renamed from: l */
    private long f13749l;

    @TargetApi(17)
    /* renamed from: g.d.a.b.s0.f$a */
    private final class C4300a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f13750a;

        public C4300a(DisplayManager displayManager) {
            this.f13750a = displayManager;
        }

        /* renamed from: a */
        public void mo13537a() {
            this.f13750a.registerDisplayListener(this, (Handler) null);
        }

        /* renamed from: b */
        public void mo13538b() {
            this.f13750a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                C4299f.this.m18339h();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: g.d.a.b.s0.f$b */
    private static final class C4301b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: k */
        private static final C4301b f13752k = new C4301b();

        /* renamed from: f */
        public volatile long f13753f = -9223372036854775807L;

        /* renamed from: g */
        private final Handler f13754g;

        /* renamed from: h */
        private final HandlerThread f13755h;

        /* renamed from: i */
        private Choreographer f13756i;

        /* renamed from: j */
        private int f13757j;

        private C4301b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f13755h = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.f13755h.getLooper(), this);
            this.f13754g = handler;
            handler.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m18345b() {
            int i = this.f13757j + 1;
            this.f13757j = i;
            if (i == 1) {
                this.f13756i.postFrameCallback(this);
            }
        }

        /* renamed from: c */
        private void m18346c() {
            this.f13756i = Choreographer.getInstance();
        }

        /* renamed from: d */
        public static C4301b m18347d() {
            return f13752k;
        }

        /* renamed from: f */
        private void m18348f() {
            int i = this.f13757j - 1;
            this.f13757j = i;
            if (i == 0) {
                this.f13756i.removeFrameCallback(this);
                this.f13753f = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void mo13542a() {
            this.f13754g.sendEmptyMessage(1);
        }

        public void doFrame(long j) {
            this.f13753f = j;
            this.f13756i.postFrameCallbackDelayed(this, 500);
        }

        /* renamed from: e */
        public void mo13544e() {
            this.f13754g.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m18346c();
                return true;
            } else if (i == 1) {
                m18345b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m18348f();
                return true;
            }
        }
    }

    public C4299f(Context context) {
        C4300a aVar = null;
        WindowManager windowManager = context == null ? null : (WindowManager) context.getSystemService("window");
        this.f13738a = windowManager;
        if (windowManager != null) {
            this.f13740c = C4284w.f13659a >= 17 ? m18338g(context) : aVar;
            this.f13739b = C4301b.m18347d();
        } else {
            this.f13740c = null;
            this.f13739b = null;
        }
        this.f13741d = -9223372036854775807L;
        this.f13742e = -9223372036854775807L;
    }

    /* renamed from: c */
    private static long m18336c(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* renamed from: f */
    private boolean m18337f(long j, long j2) {
        return Math.abs((j2 - this.f13747j) - (j - this.f13748k)) > 20000000;
    }

    @TargetApi(17)
    /* renamed from: g */
    private C4300a m18338g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C4300a(displayManager);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m18339h() {
        Display defaultDisplay = this.f13738a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f13741d = j;
            this.f13742e = (j * 80) / 100;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (m18337f(r0, r13) != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo13534b(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f13746i
            if (r2 == 0) goto L_0x0041
            long r2 = r10.f13743f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.f13749l
            r4 = 1
            long r2 = r2 + r4
            r10.f13749l = r2
            long r2 = r10.f13745h
            r10.f13744g = r2
        L_0x0019:
            long r2 = r10.f13749l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.f13748k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.f13744g
            long r2 = r2 + r4
            boolean r4 = r10.m18337f(r2, r13)
            if (r4 == 0) goto L_0x0033
        L_0x0030:
            r10.f13746i = r6
            goto L_0x0041
        L_0x0033:
            long r4 = r10.f13747j
            long r4 = r4 + r2
            long r6 = r10.f13748k
            long r4 = r4 - r6
            goto L_0x0043
        L_0x003a:
            boolean r2 = r10.m18337f(r0, r13)
            if (r2 == 0) goto L_0x0041
            goto L_0x0030
        L_0x0041:
            r4 = r13
            r2 = r0
        L_0x0043:
            boolean r6 = r10.f13746i
            if (r6 != 0) goto L_0x0052
            r10.f13748k = r0
            r10.f13747j = r13
            r13 = 0
            r10.f13749l = r13
            r13 = 1
            r10.f13746i = r13
        L_0x0052:
            r10.f13743f = r11
            r10.f13745h = r2
            g.d.a.b.s0.f$b r11 = r10.f13739b
            if (r11 == 0) goto L_0x0077
            long r12 = r10.f13741d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            long r6 = r11.f13753f
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006d
            return r4
        L_0x006d:
            long r8 = r10.f13741d
            long r11 = m18336c(r4, r6, r8)
            long r13 = r10.f13742e
            long r11 = r11 - r13
            return r11
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p231s0.C4299f.mo13534b(long, long):long");
    }

    /* renamed from: d */
    public void mo13535d() {
        if (this.f13738a != null) {
            C4300a aVar = this.f13740c;
            if (aVar != null) {
                aVar.mo13538b();
            }
            this.f13739b.mo13544e();
        }
    }

    /* renamed from: e */
    public void mo13536e() {
        this.f13746i = false;
        if (this.f13738a != null) {
            this.f13739b.mo13542a();
            C4300a aVar = this.f13740c;
            if (aVar != null) {
                aVar.mo13537a();
            }
            m18339h();
        }
    }
}
