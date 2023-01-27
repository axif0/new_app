package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: com.journeyapps.barcodescanner.k */
public class C2690k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f8607a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WindowManager f8608b;

    /* renamed from: c */
    private OrientationEventListener f8609c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2689j f8610d;

    /* renamed from: com.journeyapps.barcodescanner.k$a */
    class C2691a extends OrientationEventListener {
        C2691a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager a = C2690k.this.f8608b;
            C2689j b = C2690k.this.f8610d;
            if (C2690k.this.f8608b != null && b != null && (rotation = a.getDefaultDisplay().getRotation()) != C2690k.this.f8607a) {
                int unused = C2690k.this.f8607a = rotation;
                b.mo9778a(rotation);
            }
        }
    }

    /* renamed from: e */
    public void mo9811e(Context context, C2689j jVar) {
        mo9812f();
        Context applicationContext = context.getApplicationContext();
        this.f8610d = jVar;
        this.f8608b = (WindowManager) applicationContext.getSystemService("window");
        C2691a aVar = new C2691a(applicationContext, 3);
        this.f8609c = aVar;
        aVar.enable();
        this.f8607a = this.f8608b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void mo9812f() {
        OrientationEventListener orientationEventListener = this.f8609c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f8609c = null;
        this.f8608b = null;
        this.f8610d = null;
    }
}
