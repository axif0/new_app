package p148g.p189d.p296d.p300r.p301a.p302l;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.journeyapps.barcodescanner.p047o.C2708d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: g.d.d.r.a.l.a */
public final class C5409a {
    static {
        Pattern.compile(";");
    }

    @TargetApi(15)
    /* renamed from: a */
    private static List<Camera.Area> m22271a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    /* renamed from: b */
    private static String m22272b(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: c */
    public static void m22273c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String b = m22272b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (b != null) {
            parameters.setSceneMode(b);
        }
    }

    /* renamed from: d */
    public static void m22274d(Camera.Parameters parameters, boolean z) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (!(minExposureCompensation == 0 && maxExposureCompensation == 0)) {
            float f = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f = 1.5f;
                }
                int round = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f2;
                    Log.i("CameraConfiguration", str);
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f2);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: e */
    public static void m22275e(Camera.Parameters parameters) {
        m22276f(parameters, 10, 20);
    }

    /* renamed from: f */
    public static void m22276f(Camera.Parameters parameters, int i, int i2) {
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m22284n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                int i3 = next[0];
                int i4 = next[1];
                if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr == null) {
                str = "No suitable FPS range?";
            } else {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    str = "FPS range already set to " + Arrays.toString(iArr);
                } else {
                    Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    return;
                }
            }
            Log.i("CameraConfiguration", str);
        }
    }

    /* renamed from: g */
    public static void m22277g(Camera.Parameters parameters, C2708d.C2709a aVar, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String b = (z || aVar == C2708d.C2709a.AUTO) ? m22272b("focus mode", supportedFocusModes, "auto") : aVar == C2708d.C2709a.CONTINUOUS ? m22272b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : aVar == C2708d.C2709a.INFINITY ? m22272b("focus mode", supportedFocusModes, "infinity") : aVar == C2708d.C2709a.MACRO ? m22272b("focus mode", supportedFocusModes, "macro") : null;
        if (!z && b == null) {
            b = m22272b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (b == null) {
            return;
        }
        if (b.equals(parameters.getFocusMode())) {
            Log.i("CameraConfiguration", "Focus mode already set to " + b);
            return;
        }
        parameters.setFocusMode(b);
    }

    @TargetApi(15)
    /* renamed from: h */
    public static void m22278h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i("CameraConfiguration", "Old focus areas: " + m22283m(parameters.getFocusAreas()));
            List<Camera.Area> a = m22271a(400);
            Log.i("CameraConfiguration", "Setting focus area to : " + m22283m(a));
            parameters.setFocusAreas(a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support focus areas");
    }

    /* renamed from: i */
    public static void m22279i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String b = m22272b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (b != null) {
            parameters.setColorEffect(b);
        }
    }

    @TargetApi(15)
    /* renamed from: j */
    public static void m22280j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> a = m22271a(400);
            Log.i("CameraConfiguration", "Setting metering area to : " + m22283m(a));
            parameters.setMeteringAreas(a);
            return;
        }
        Log.i("CameraConfiguration", "Device does not support metering areas");
    }

    /* renamed from: k */
    public static void m22281k(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String b = z ? m22272b("flash mode", supportedFlashModes, "torch", "on") : m22272b("flash mode", supportedFlashModes, "off");
        if (b == null) {
            return;
        }
        if (b.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to " + b);
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to " + b);
        parameters.setFlashMode(b);
    }

    @TargetApi(15)
    /* renamed from: l */
    public static void m22282l(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else if (parameters.getVideoStabilization()) {
            str = "Video stabilization already enabled";
        } else {
            Log.i("CameraConfiguration", "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
            return;
        }
        Log.i("CameraConfiguration", str);
    }

    @TargetApi(15)
    /* renamed from: m */
    private static String m22283m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(':');
            sb.append(next.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: n */
    private static String m22284n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
