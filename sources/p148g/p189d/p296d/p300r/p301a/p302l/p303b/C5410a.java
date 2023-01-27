package p148g.p189d.p296d.p300r.p301a.p302l.p303b;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: g.d.d.r.a.l.b.a */
public final class C5410a {

    /* renamed from: a */
    private static final String f15633a = "g.d.d.r.a.l.b.a";

    /* renamed from: a */
    public static int m22285a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f15633a, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        return i < numberOfCameras ? i : z ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m22286b(int i) {
        int a = m22285a(i);
        if (a == -1) {
            return null;
        }
        return Camera.open(a);
    }
}
