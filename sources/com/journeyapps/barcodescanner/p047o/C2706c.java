package com.journeyapps.barcodescanner.p047o;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.journeyapps.barcodescanner.C2692l;
import com.journeyapps.barcodescanner.C2693m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p296d.p300r.p301a.C5392a;
import p148g.p189d.p296d.p300r.p301a.p302l.C5409a;
import p148g.p189d.p296d.p300r.p301a.p302l.p303b.C5410a;

/* renamed from: com.journeyapps.barcodescanner.o.c */
public final class C2706c {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f8653n = "c";

    /* renamed from: a */
    private Camera f8654a;

    /* renamed from: b */
    private Camera.CameraInfo f8655b;

    /* renamed from: c */
    private C2695a f8656c;

    /* renamed from: d */
    private C5392a f8657d;

    /* renamed from: e */
    private boolean f8658e;

    /* renamed from: f */
    private String f8659f;

    /* renamed from: g */
    private C2708d f8660g = new C2708d();

    /* renamed from: h */
    private C2713h f8661h;

    /* renamed from: i */
    private C2692l f8662i;

    /* renamed from: j */
    private C2692l f8663j;

    /* renamed from: k */
    private int f8664k = -1;

    /* renamed from: l */
    private Context f8665l;

    /* renamed from: m */
    private final C2707a f8666m;

    /* renamed from: com.journeyapps.barcodescanner.o.c$a */
    private final class C2707a implements Camera.PreviewCallback {

        /* renamed from: a */
        private C2716k f8667a;

        /* renamed from: b */
        private C2692l f8668b;

        public C2707a() {
        }

        /* renamed from: a */
        public void mo9863a(C2716k kVar) {
            this.f8667a = kVar;
        }

        /* renamed from: b */
        public void mo9864b(C2692l lVar) {
            this.f8668b = lVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e;
            C2692l lVar = this.f8668b;
            C2716k kVar = this.f8667a;
            if (lVar == null || kVar == null) {
                Log.d(C2706c.f8653n, "Got preview callback, but no handler or resolution available");
                if (kVar != null) {
                    e = new Exception("No resolution available");
                } else {
                    return;
                }
            } else {
                try {
                    kVar.mo9810b(new C2693m(bArr, lVar.f8612f, lVar.f8613g, camera.getParameters().getPreviewFormat(), C2706c.this.mo9851e()));
                    return;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    Log.e(C2706c.f8653n, "Camera preview failed", e);
                }
            }
            kVar.mo9809a(e);
        }
    }

    public C2706c(Context context) {
        this.f8665l = context;
        this.f8666m = new C2707a();
    }

    /* renamed from: b */
    private int m12018b() {
        int c = this.f8661h.mo9883c();
        int i = 0;
        if (c != 0) {
            if (c == 1) {
                i = 90;
            } else if (c == 2) {
                i = 180;
            } else if (c == 3) {
                i = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f8655b;
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        int i4 = (i2 == 1 ? 360 - ((i3 + i) % 360) : (i3 - i) + 360) % 360;
        String str = f8653n;
        Log.i(str, "Camera Display Orientation: " + i4);
        return i4;
    }

    /* renamed from: f */
    private Camera.Parameters m12019f() {
        Camera.Parameters parameters = this.f8654a.getParameters();
        String str = this.f8659f;
        if (str == null) {
            this.f8659f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: h */
    private static List<C2692l> m12020h(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new C2692l(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new C2692l(next.width, next.height));
        }
        return arrayList;
    }

    /* renamed from: m */
    private void m12021m(int i) {
        this.f8654a.setDisplayOrientation(i);
    }

    /* renamed from: o */
    private void m12022o(boolean z) {
        Camera.Parameters f = m12019f();
        if (f == null) {
            Log.w(f8653n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f8653n;
        Log.i(str, "Initial camera parameters: " + f.flatten());
        if (z) {
            Log.w(f8653n, "In camera config safe mode -- most settings will not be honored");
        }
        C5409a.m22277g(f, this.f8660g.mo9866a(), z);
        if (!z) {
            C5409a.m22281k(f, false);
            if (this.f8660g.mo9873h()) {
                C5409a.m22279i(f);
            }
            if (this.f8660g.mo9870e()) {
                C5409a.m22273c(f);
            }
            if (this.f8660g.mo9872g() && Build.VERSION.SDK_INT >= 15) {
                C5409a.m22282l(f);
                C5409a.m22278h(f);
                C5409a.m22280j(f);
            }
        }
        List<C2692l> h = m12020h(f);
        if (h.size() == 0) {
            this.f8662i = null;
        } else {
            C2692l a = this.f8661h.mo9881a(h, mo9853i());
            this.f8662i = a;
            f.setPreviewSize(a.f8612f, a.f8613g);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C5409a.m22275e(f);
        }
        String str2 = f8653n;
        Log.i(str2, "Final camera parameters: " + f.flatten());
        this.f8654a.setParameters(f);
    }

    /* renamed from: q */
    private void m12023q() {
        try {
            int b = m12018b();
            this.f8664k = b;
            m12021m(b);
        } catch (Exception unused) {
            Log.w(f8653n, "Failed to set rotation.");
        }
        try {
            m12022o(false);
        } catch (Exception unused2) {
            try {
                m12022o(true);
            } catch (Exception unused3) {
                Log.w(f8653n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f8654a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f8663j = this.f8662i;
        } else {
            this.f8663j = new C2692l(previewSize.width, previewSize.height);
        }
        this.f8666m.mo9864b(this.f8663j);
    }

    /* renamed from: c */
    public void mo9849c() {
        Camera camera = this.f8654a;
        if (camera != null) {
            camera.release();
            this.f8654a = null;
        }
    }

    /* renamed from: d */
    public void mo9850d() {
        if (this.f8654a != null) {
            m12023q();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: e */
    public int mo9851e() {
        return this.f8664k;
    }

    /* renamed from: g */
    public C2692l mo9852g() {
        if (this.f8663j == null) {
            return null;
        }
        return mo9853i() ? this.f8663j.mo9817g() : this.f8663j;
    }

    /* renamed from: i */
    public boolean mo9853i() {
        int i = this.f8664k;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: j */
    public boolean mo9854j() {
        String flashMode;
        Camera.Parameters parameters = this.f8654a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* renamed from: k */
    public void mo9855k() {
        Camera b = C5410a.m22286b(this.f8660g.mo9867b());
        this.f8654a = b;
        if (b != null) {
            int a = C5410a.m22285a(this.f8660g.mo9867b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f8655b = cameraInfo;
            Camera.getCameraInfo(a, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: l */
    public void mo9856l(C2716k kVar) {
        Camera camera = this.f8654a;
        if (camera != null && this.f8658e) {
            this.f8666m.mo9863a(kVar);
            camera.setOneShotPreviewCallback(this.f8666m);
        }
    }

    /* renamed from: n */
    public void mo9857n(C2708d dVar) {
        this.f8660g = dVar;
    }

    /* renamed from: p */
    public void mo9858p(C2713h hVar) {
        this.f8661h = hVar;
    }

    /* renamed from: r */
    public void mo9859r(C2710e eVar) throws IOException {
        eVar.mo9875a(this.f8654a);
    }

    /* renamed from: s */
    public void mo9860s(boolean z) {
        if (this.f8654a != null && z != mo9854j()) {
            C2695a aVar = this.f8656c;
            if (aVar != null) {
                aVar.mo9827j();
            }
            Camera.Parameters parameters = this.f8654a.getParameters();
            C5409a.m22281k(parameters, z);
            if (this.f8660g.mo9871f()) {
                C5409a.m22274d(parameters, z);
            }
            this.f8654a.setParameters(parameters);
            C2695a aVar2 = this.f8656c;
            if (aVar2 != null) {
                aVar2.mo9826i();
            }
        }
    }

    /* renamed from: t */
    public void mo9861t() {
        Camera camera = this.f8654a;
        if (camera != null && !this.f8658e) {
            camera.startPreview();
            this.f8658e = true;
            this.f8656c = new C2695a(this.f8654a, this.f8660g);
            C5392a aVar = new C5392a(this.f8665l, this, this.f8660g);
            this.f8657d = aVar;
            aVar.mo15632c();
        }
    }

    /* renamed from: u */
    public void mo9862u() {
        C2695a aVar = this.f8656c;
        if (aVar != null) {
            aVar.mo9827j();
            this.f8656c = null;
        }
        C5392a aVar2 = this.f8657d;
        if (aVar2 != null) {
            aVar2.mo15633d();
            this.f8657d = null;
        }
        Camera camera = this.f8654a;
        if (camera != null && this.f8658e) {
            camera.stopPreview();
            this.f8666m.mo9863a((C2716k) null);
            this.f8658e = false;
        }
    }
}
