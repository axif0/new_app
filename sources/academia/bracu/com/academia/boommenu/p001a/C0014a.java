package academia.bracu.com.academia.boommenu.p001a;

import academia.bracu.com.academia.boommenu.C0054e;
import academia.bracu.com.academia.boommenu.p002c.C0027a;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: academia.bracu.com.academia.boommenu.a.a */
public class C0014a {

    /* renamed from: academia.bracu.com.academia.boommenu.a.a$a */
    static /* synthetic */ class C0015a {

        /* renamed from: a */
        static final /* synthetic */ int[] f128a;

        /* renamed from: b */
        static final /* synthetic */ int[] f129b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0087 */
        static {
            /*
                academia.bracu.com.academia.boommenu.a.b[] r0 = academia.bracu.com.academia.boommenu.p001a.C0016b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f129b = r0
                r1 = 1
                academia.bracu.com.academia.boommenu.a.b r2 = academia.bracu.com.academia.boommenu.p001a.C0016b.LINE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f129b     // Catch:{ NoSuchFieldError -> 0x001d }
                academia.bracu.com.academia.boommenu.a.b r3 = academia.bracu.com.academia.boommenu.p001a.C0016b.PARABOLA_1     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x0028 }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.PARABOLA_2     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x0033 }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.PARABOLA_3     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x003e }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.PARABOLA_4     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x0049 }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.HORIZONTAL_THROW_1     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x0054 }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.HORIZONTAL_THROW_2     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x0060 }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.RANDOM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f129b     // Catch:{ NoSuchFieldError -> 0x006c }
                academia.bracu.com.academia.boommenu.a.b r4 = academia.bracu.com.academia.boommenu.p001a.C0016b.Unknown     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                academia.bracu.com.academia.boommenu.a.f[] r3 = academia.bracu.com.academia.boommenu.p001a.C0021f.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f128a = r3
                academia.bracu.com.academia.boommenu.a.f r4 = academia.bracu.com.academia.boommenu.p001a.C0021f.DEFAULT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = f128a     // Catch:{ NoSuchFieldError -> 0x0087 }
                academia.bracu.com.academia.boommenu.a.f r3 = academia.bracu.com.academia.boommenu.p001a.C0021f.REVERSE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f128a     // Catch:{ NoSuchFieldError -> 0x0091 }
                academia.bracu.com.academia.boommenu.a.f r1 = academia.bracu.com.academia.boommenu.p001a.C0021f.RANDOM     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p001a.C0014a.C0015a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static void m96a(ArrayList<Float> arrayList) {
        if (arrayList.get(arrayList.size() - 1).floatValue() != 0.0f) {
            arrayList.add(Float.valueOf(arrayList.get(arrayList.size() - 1).floatValue() * 0.5f));
            arrayList.add(Float.valueOf(arrayList.get(arrayList.size() - 1).floatValue() * 0.5f));
            arrayList.add(Float.valueOf(arrayList.get(arrayList.size() - 1).floatValue() * 0.5f));
            arrayList.add(Float.valueOf(0.0f));
        }
    }

    /* renamed from: b */
    public static ObjectAnimator m97b(Object obj, String str, long j, long j2, TimeInterpolator timeInterpolator, AnimatorListenerAdapter animatorListenerAdapter, float... fArr) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, fArr);
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(j2);
        if (timeInterpolator != null) {
            ofFloat.setInterpolator(timeInterpolator);
        }
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
        return ofFloat;
    }

    /* renamed from: c */
    public static ObjectAnimator m98c(Object obj, String str, long j, long j2, TimeInterpolator timeInterpolator, float... fArr) {
        return m97b(obj, str, j, j2, timeInterpolator, (AnimatorListenerAdapter) null, fArr);
    }

    /* renamed from: d */
    public static ObjectAnimator m99d(Object obj, String str, long j, long j2, TypeEvaluator typeEvaluator, AnimatorListenerAdapter animatorListenerAdapter, int... iArr) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(obj, str, iArr);
        ofInt.setStartDelay(j);
        ofInt.setDuration(j2);
        ofInt.setEvaluator(typeEvaluator);
        if (animatorListenerAdapter != null) {
            ofInt.addListener(animatorListenerAdapter);
        }
        ofInt.start();
        return ofInt;
    }

    /* renamed from: e */
    public static ObjectAnimator m100e(Object obj, String str, long j, long j2, TypeEvaluator typeEvaluator, int... iArr) {
        return m99d(obj, str, j, j2, typeEvaluator, (AnimatorListenerAdapter) null, iArr);
    }

    /* renamed from: f */
    public static void m101f(String str, long j, long j2, float[] fArr, TimeInterpolator timeInterpolator, ArrayList<View> arrayList) {
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            m97b(it.next(), str, j, j2, timeInterpolator, (AnimatorListenerAdapter) null, fArr);
        }
    }

    /* renamed from: g */
    public static void m102g(C0016b bVar, PointF pointF, C0017c cVar, int i, PointF pointF2, PointF pointF3, float[] fArr, float[] fArr2) {
        C0017c cVar2 = cVar;
        int i2 = i;
        PointF pointF4 = pointF2;
        PointF pointF5 = pointF3;
        C0016b bVar2 = Math.abs(pointF4.x - pointF5.x) < 1.0f ? C0016b.LINE : bVar;
        float f = pointF4.x;
        float f2 = pointF4.y;
        float f3 = pointF5.x;
        float f4 = pointF5.y;
        float f5 = 1.0f / ((float) i2);
        float f6 = f3 - f;
        float f7 = 0.0f;
        int i3 = 0;
        switch (C0015a.f129b[bVar2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
                m103h(bVar2, pointF, cVar, i, pointF2, pointF3, fArr, fArr2);
                return;
            case 6:
                float f8 = pointF4.x;
                float f9 = pointF4.y;
                float f10 = pointF5.x;
                float f11 = pointF5.y;
                float f12 = (2.0f * f8) - f10;
                float f13 = f12 - f8;
                float f14 = f8 - f10;
                float f15 = f10 - f12;
                float f16 = (f11 * f13) + (f11 * f14) + (f9 * f15);
                float f17 = f10 * f10;
                float f18 = f16 / (((f13 * f17) + ((f12 * f12) * f14)) + ((f8 * f8) * f15));
                float f19 = ((f11 - f11) / f15) - ((f12 + f10) * f18);
                float f20 = (f11 - (f17 * f18)) - (f10 * f19);
                while (i3 <= i2) {
                    float interpolation = (cVar2.getInterpolation(f7) * f6) + f8;
                    fArr[i3] = interpolation;
                    fArr2[i3] = (f18 * interpolation * interpolation) + (interpolation * f19) + f20;
                    f7 += f5;
                    i3++;
                }
                return;
            case 7:
                float f21 = (2.0f * f3) - f;
                float f22 = f21 - f3;
                float f23 = f - f21;
                float f24 = (f2 * f22) + (f2 * f6) + (f4 * f23);
                float f25 = f * f;
                float f26 = f24 / (((f22 * f25) + ((f21 * f21) * f6)) + ((f3 * f3) * f23));
                float f27 = ((f2 - f2) / f23) - ((f21 + f) * f26);
                float f28 = (f2 - (f25 * f26)) - (f * f27);
                while (i3 <= i2) {
                    float interpolation2 = (cVar2.getInterpolation(f7) * f6) + f;
                    fArr[i3] = interpolation2;
                    fArr2[i3] = (f26 * interpolation2 * interpolation2) + (interpolation2 * f27) + f28;
                    f7 += f5;
                    i3++;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: h */
    public static void m103h(C0016b bVar, PointF pointF, C0017c cVar, int i, PointF pointF2, PointF pointF3, float[] fArr, float[] fArr2) {
        PointF pointF4 = pointF;
        C0017c cVar2 = cVar;
        int i2 = i;
        PointF pointF5 = pointF2;
        PointF pointF6 = pointF3;
        C0016b bVar2 = Math.abs(pointF5.x - pointF6.x) < 1.0f ? C0016b.LINE : bVar;
        float f = pointF5.x;
        float f2 = pointF5.y;
        float f3 = pointF6.x;
        float f4 = pointF6.y;
        float f5 = 1.0f / ((float) i2);
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = 0.0f;
        int i3 = 0;
        switch (C0015a.f129b[bVar2.ordinal()]) {
            case 1:
                break;
            case 2:
                float f9 = f + f3;
                float f10 = f9 / 2.0f;
                float f11 = f3 - f10;
                float f12 = f10 - f;
                float f13 = f - f3;
                float f14 = f * f;
                float min = (((f2 * f11) + (f4 * f12)) + (((Math.min(f2, f4) * 3.0f) / 4.0f) * f13)) / (((f11 * f14) + ((f3 * f3) * f12)) + ((f10 * f10) * f13));
                float f15 = ((f2 - f4) / f13) - (f9 * min);
                float f16 = (f2 - (f14 * min)) - (f * f15);
                while (i3 <= i2) {
                    float interpolation = (cVar2.getInterpolation(f8) * f6) + f;
                    fArr[i3] = interpolation;
                    fArr2[i3] = (min * interpolation * interpolation) + (interpolation * f15) + f16;
                    f8 += f5;
                    i3++;
                }
                return;
            case 3:
                float f17 = f + f3;
                float f18 = f17 / 2.0f;
                float f19 = f3 - f18;
                float f20 = f18 - f;
                float f21 = f - f3;
                float max = (f2 * f19) + (f4 * f20) + (((pointF4.y + Math.max(f2, f4)) / 2.0f) * f21);
                float f22 = f * f;
                float f23 = max / (((f19 * f22) + ((f3 * f3) * f20)) + ((f18 * f18) * f21));
                float f24 = ((f2 - f4) / f21) - (f17 * f23);
                float f25 = (f2 - (f22 * f23)) - (f * f24);
                while (i3 <= i2) {
                    float interpolation2 = (cVar2.getInterpolation(f8) * f6) + f;
                    fArr[i3] = interpolation2;
                    fArr2[i3] = (f23 * interpolation2 * interpolation2) + (interpolation2 * f24) + f25;
                    f8 += f5;
                    i3++;
                }
                return;
            case 4:
                float f26 = f2 + f4;
                float f27 = f26 / 2.0f;
                float f28 = f4 - f27;
                float f29 = f27 - f2;
                float f30 = f2 - f4;
                float f31 = f2 * f2;
                float min2 = (((f * f28) + (f3 * f29)) + ((Math.min(f, f3) / 2.0f) * f30)) / (((f28 * f31) + ((f4 * f4) * f29)) + ((f27 * f27) * f30));
                float f32 = ((f - f3) / f30) - (f26 * min2);
                float f33 = (f - (f31 * min2)) - (f2 * f32);
                while (i3 <= i2) {
                    float interpolation3 = (cVar2.getInterpolation(f8) * f7) + f2;
                    fArr2[i3] = interpolation3;
                    fArr[i3] = (min2 * interpolation3 * interpolation3) + (interpolation3 * f32) + f33;
                    f8 += f5;
                    i3++;
                }
                return;
            case 5:
                float f34 = f2 + f4;
                float f35 = f34 / 2.0f;
                float f36 = f4 - f35;
                float f37 = f35 - f2;
                float f38 = f2 - f4;
                float max2 = (f * f36) + (f3 * f37) + (((pointF4.x + Math.max(f, f3)) / 2.0f) * f38);
                float f39 = f2 * f2;
                float f40 = max2 / (((f36 * f39) + ((f4 * f4) * f37)) + ((f35 * f35) * f38));
                float f41 = ((f - f3) / f38) - (f34 * f40);
                float f42 = (f - (f39 * f40)) - (f2 * f41);
                while (i3 <= i2) {
                    float interpolation4 = (cVar2.getInterpolation(f8) * f7) + f2;
                    fArr2[i3] = interpolation4;
                    fArr[i3] = (f40 * interpolation4 * interpolation4) + (interpolation4 * f41) + f42;
                    f8 += f5;
                    i3++;
                }
                return;
            case 6:
                float f43 = (2.0f * f3) - f;
                float f44 = f43 - f3;
                float f45 = f - f43;
                float f46 = f * f;
                float f47 = (((f2 * f44) + (f2 * f6)) + (f4 * f45)) / (((f44 * f46) + ((f43 * f43) * f6)) + ((f3 * f3) * f45));
                float f48 = ((f2 - f2) / f45) - ((f43 + f) * f47);
                float f49 = (f2 - (f46 * f47)) - (f * f48);
                while (i3 <= i2) {
                    float interpolation5 = (cVar2.getInterpolation(f8) * f6) + f;
                    fArr[i3] = interpolation5;
                    fArr2[i3] = (f47 * interpolation5 * interpolation5) + (interpolation5 * f48) + f49;
                    f8 += f5;
                    i3++;
                }
                return;
            case 7:
                float f50 = pointF5.x;
                float f51 = pointF5.y;
                float f52 = pointF6.x;
                float f53 = pointF6.y;
                float f54 = (2.0f * f50) - f52;
                float f55 = f54 - f50;
                float f56 = f50 - f52;
                float f57 = f52 - f54;
                float f58 = (f53 * f55) + (f53 * f56) + (f51 * f57);
                float f59 = f52 * f52;
                float f60 = f58 / (((f55 * f59) + ((f54 * f54) * f56)) + ((f50 * f50) * f57));
                float f61 = ((f53 - f53) / f57) - ((f54 + f52) * f60);
                float f62 = (f53 - (f59 * f60)) - (f52 * f61);
                while (i3 <= i2) {
                    float interpolation6 = (cVar2.getInterpolation(f8) * f6) + f50;
                    fArr[i3] = interpolation6;
                    fArr2[i3] = (f60 * interpolation6 * interpolation6) + (interpolation6 * f61) + f62;
                    f8 += f5;
                    i3++;
                }
                return;
            case 8:
                m103h(C0016b.values()[new Random().nextInt(C0016b.RANDOM.getValue())], pointF, cVar, i, pointF2, pointF3, fArr, fArr2);
                return;
            case 9:
                throw new RuntimeException("Unknown boom-enum!");
            default:
                return;
        }
        while (i3 <= i2) {
            float interpolation7 = cVar2.getInterpolation(f8);
            fArr[i3] = (interpolation7 * f6) + f;
            fArr2[i3] = (interpolation7 * f7) + f2;
            f8 += f5;
            i3++;
        }
    }

    /* renamed from: i */
    private static float m104i(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: j */
    public static ArrayList<Integer> m105j(C0021f fVar, int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i2 = C0015a.f128a[fVar.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            while (i3 < i) {
                arrayList.add(Integer.valueOf(i3));
                i3++;
            }
        } else if (i2 == 2) {
            while (i3 < i) {
                arrayList.add(Integer.valueOf((i - i3) - 1));
                i3++;
            }
        } else if (i2 == 3) {
            boolean[] zArr = new boolean[i];
            for (int i4 = 0; i4 < i; i4++) {
                zArr[i4] = false;
            }
            Random random = new Random();
            while (i3 < i) {
                int nextInt = random.nextInt(i);
                if (!zArr[nextInt]) {
                    zArr[nextInt] = true;
                    arrayList.add(Integer.valueOf(nextInt));
                    i3++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static C0022g m106k(float[] fArr, float[] fArr2, long j, long j2, C0027a aVar) {
        C0022g gVar = new C0022g((float) (aVar.mo192K() / 2), (float) (aVar.mo191J() / 2), m107l(fArr2, aVar.mo193L()), m108m(fArr, aVar.mo193L()));
        gVar.setStartOffset(j);
        gVar.setDuration(j2);
        return gVar;
    }

    /* renamed from: l */
    private static ArrayList<Float> m107l(float[] fArr, C0054e eVar) {
        ArrayList<Float> arrayList = new ArrayList<>(fArr.length);
        float f = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        int i = eVar.equals(C0054e.Ham) ? 60 : 30;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                double i3 = (double) (m104i((-(fArr[i2] - f)) / ((float) i), -0.7853982f, 0.7853982f) * 180.0f);
                Double.isNaN(i3);
                arrayList.add(Float.valueOf((float) (i3 / 3.141592653589793d)));
            }
            f = fArr[i2];
        }
        m96a(arrayList);
        return arrayList;
    }

    /* renamed from: m */
    private static ArrayList<Float> m108m(float[] fArr, C0054e eVar) {
        ArrayList<Float> arrayList = new ArrayList<>(fArr.length);
        float f = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        int i = eVar.equals(C0054e.Ham) ? 60 : 30;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (i2 != 0) {
                double i3 = (double) (m104i((fArr[i2] - f) / ((float) i), -0.7853982f, 0.7853982f) * 180.0f);
                Double.isNaN(i3);
                arrayList.add(Float.valueOf((float) (i3 / 3.141592653589793d)));
            }
            f = fArr[i2];
        }
        m96a(arrayList);
        return arrayList;
    }

    /* renamed from: n */
    public static void m109n(C0027a aVar, long j, long j2, TimeInterpolator timeInterpolator, float... fArr) {
        aVar.mo239z();
        for (int i = 0; i < aVar.mo238y().size(); i++) {
            m97b(aVar.mo238y().get(i), "rotation", j, j2, timeInterpolator, (AnimatorListenerAdapter) null, fArr);
        }
    }
}
