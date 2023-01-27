package p148g.p189d.p190a.p200b.p231s0;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

@TargetApi(17)
/* renamed from: g.d.a.b.s0.c */
public final class C4291c extends Surface {

    /* renamed from: h */
    private static int f13683h;

    /* renamed from: i */
    private static boolean f13684i;

    /* renamed from: f */
    private final C4293b f13685f;

    /* renamed from: g */
    private boolean f13686g;

    /* renamed from: g.d.a.b.s0.c$b */
    private static class C4293b extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

        /* renamed from: f */
        private final int[] f13687f = new int[1];

        /* renamed from: g */
        private EGLDisplay f13688g;

        /* renamed from: h */
        private EGLContext f13689h;

        /* renamed from: i */
        private EGLSurface f13690i;

        /* renamed from: j */
        private Handler f13691j;

        /* renamed from: k */
        private SurfaceTexture f13692k;

        /* renamed from: l */
        private Error f13693l;

        /* renamed from: m */
        private RuntimeException f13694m;

        /* renamed from: n */
        private C4291c f13695n;

        public C4293b() {
            super("dummySurface");
        }

        /* renamed from: b */
        private void m18276b(int i) {
            EGLSurface eGLSurface;
            boolean z = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f13688g = eglGetDisplay;
            C4260a.m18075g(eglGetDisplay != null, "eglGetDisplay failed");
            int[] iArr = new int[2];
            C4260a.m18075g(EGL14.eglInitialize(this.f13688g, iArr, 0, iArr, 1), "eglInitialize failed");
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            C4260a.m18075g(EGL14.eglChooseConfig(this.f13688g, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f13688g, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            this.f13689h = eglCreateContext;
            C4260a.m18075g(eglCreateContext != null, "eglCreateContext failed");
            if (i == 1) {
                eGLSurface = EGL14.EGL_NO_SURFACE;
            } else {
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f13688g, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.f13690i = eglCreatePbufferSurface;
                C4260a.m18075g(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                eGLSurface = this.f13690i;
            }
            C4260a.m18075g(EGL14.eglMakeCurrent(this.f13688g, eGLSurface, eGLSurface, this.f13689h), "eglMakeCurrent failed");
            GLES20.glGenTextures(1, this.f13687f, 0);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13687f[0]);
            this.f13692k = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            SurfaceTexture surfaceTexture2 = this.f13692k;
            if (i != 0) {
                z = true;
            }
            this.f13695n = new C4291c(this, surfaceTexture2, z);
        }

        /* renamed from: d */
        private void m18277d() {
            try {
                if (this.f13692k != null) {
                    this.f13692k.release();
                    GLES20.glDeleteTextures(1, this.f13687f, 0);
                }
            } finally {
                EGLSurface eGLSurface = this.f13690i;
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(this.f13688g, eGLSurface);
                }
                EGLContext eGLContext = this.f13689h;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(this.f13688g, eGLContext);
                }
                this.f13690i = null;
                this.f13689h = null;
                this.f13688g = null;
                this.f13695n = null;
                this.f13692k = null;
            }
        }

        /* renamed from: a */
        public C4291c mo13517a(int i) {
            boolean z;
            start();
            this.f13691j = new Handler(getLooper(), this);
            synchronized (this) {
                z = false;
                this.f13691j.obtainMessage(1, i, 0).sendToTarget();
                while (this.f13695n == null && this.f13694m == null && this.f13693l == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f13694m;
            if (runtimeException == null) {
                Error error = this.f13693l;
                if (error == null) {
                    return this.f13695n;
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: c */
        public void mo13518c() {
            this.f13691j.sendEmptyMessage(3);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    m18276b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.f13694m = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f13693l = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i == 2) {
                this.f13692k.updateTexImage();
                return true;
            } else if (i != 3) {
                return true;
            } else {
                try {
                    m18277d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.f13691j.sendEmptyMessage(2);
        }
    }

    private C4291c(C4293b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f13685f = bVar;
    }

    /* renamed from: a */
    private static void m18272a() {
        if (C4284w.f13659a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    /* renamed from: b */
    private static int m18273b(Context context) {
        String eglQueryString;
        if (C4284w.f13659a < 26 && ("samsung".equals(C4284w.f13661c) || "XT1650".equals(C4284w.f13662d))) {
            return 0;
        }
        if ((C4284w.f13659a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: c */
    public static synchronized boolean m18274c(Context context) {
        boolean z;
        synchronized (C4291c.class) {
            z = true;
            if (!f13684i) {
                f13683h = C4284w.f13659a < 24 ? 0 : m18273b(context);
                f13684i = true;
            }
            if (f13683h == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static C4291c m18275d(Context context, boolean z) {
        m18272a();
        int i = 0;
        C4260a.m18074f(!z || m18274c(context));
        C4293b bVar = new C4293b();
        if (z) {
            i = f13683h;
        }
        return bVar.mo13517a(i);
    }

    public void release() {
        super.release();
        synchronized (this.f13685f) {
            if (!this.f13686g) {
                this.f13685f.mo13518c();
                this.f13686g = true;
            }
        }
    }
}
