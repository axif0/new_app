package p148g.p189d.p296d.p300r.p301a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.journeyapps.barcodescanner.p047o.C2706c;
import com.journeyapps.barcodescanner.p047o.C2708d;

/* renamed from: g.d.d.r.a.a */
public final class C5392a implements SensorEventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2706c f15603a;

    /* renamed from: b */
    private C2708d f15604b;

    /* renamed from: c */
    private Sensor f15605c;

    /* renamed from: d */
    private Context f15606d;

    /* renamed from: e */
    private Handler f15607e = new Handler();

    /* renamed from: g.d.d.r.a.a$a */
    class C5393a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f15608f;

        C5393a(boolean z) {
            this.f15608f = z;
        }

        public void run() {
            C5392a.this.f15603a.mo9860s(this.f15608f);
        }
    }

    public C5392a(Context context, C2706c cVar, C2708d dVar) {
        this.f15606d = context;
        this.f15603a = cVar;
        this.f15604b = dVar;
    }

    /* renamed from: b */
    private void m22252b(boolean z) {
        this.f15607e.post(new C5393a(z));
    }

    /* renamed from: c */
    public void mo15632c() {
        if (this.f15604b.mo9869d()) {
            SensorManager sensorManager = (SensorManager) this.f15606d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f15605c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: d */
    public void mo15633d() {
        if (this.f15605c != null) {
            ((SensorManager) this.f15606d.getSystemService("sensor")).unregisterListener(this);
            this.f15605c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f15603a == null) {
            return;
        }
        if (f <= 45.0f) {
            m22252b(true);
        } else if (f >= 450.0f) {
            m22252b(false);
        }
    }
}
