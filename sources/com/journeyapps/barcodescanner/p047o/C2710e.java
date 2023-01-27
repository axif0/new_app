package com.journeyapps.barcodescanner.p047o;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: com.journeyapps.barcodescanner.o.e */
public class C2710e {

    /* renamed from: a */
    private SurfaceHolder f8683a;

    /* renamed from: b */
    private SurfaceTexture f8684b;

    public C2710e(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f8684b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public C2710e(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f8683a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    /* renamed from: a */
    public void mo9875a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f8683a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else if (Build.VERSION.SDK_INT >= 11) {
            camera.setPreviewTexture(this.f8684b);
        } else {
            throw new IllegalStateException("SurfaceTexture not supported.");
        }
    }
}
