package academia.bracu.com.academia.boommenu.p001a;

import android.animation.TypeEvaluator;

/* renamed from: academia.bracu.com.academia.boommenu.a.e */
public class C0020e implements TypeEvaluator {

    /* renamed from: a */
    private static final C0020e f139a = new C0020e();

    /* renamed from: a */
    public static C0020e m122a() {
        return f139a;
    }

    /* renamed from: b */
    private float m123b(float f) {
        if (((double) f) <= 0.5d) {
            return 0.0f;
        }
        float f2 = (f - 0.5f) * 2.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        int i = (intValue >> 24) & 255;
        int i2 = (intValue >> 16) & 255;
        int i3 = (intValue >> 8) & 255;
        int i4 = intValue & 255;
        int intValue2 = ((Integer) obj2).intValue();
        float b = m123b(f);
        return Integer.valueOf(((i + ((int) (((float) (((intValue2 >> 24) & 255) - i)) * b))) << 24) | ((i2 + ((int) (((float) (((intValue2 >> 16) & 255) - i2)) * b))) << 16) | ((i3 + ((int) (((float) (((intValue2 >> 8) & 255) - i3)) * b))) << 8) | (i4 + ((int) (b * ((float) ((intValue2 & 255) - i4))))));
    }
}
