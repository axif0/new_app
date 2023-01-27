package p148g.p189d.p190a.p252d.p270z;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p086f.p111h.p114f.C3287a;

/* renamed from: g.d.a.d.z.b */
public class C5055b {

    /* renamed from: a */
    public static final boolean f15051a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f15052b = {16842919};

    /* renamed from: c */
    private static final int[] f15053c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f15054d = {16842908};

    /* renamed from: e */
    private static final int[] f15055e = {16843623};

    /* renamed from: f */
    private static final int[] f15056f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f15057g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f15058h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f15059i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f15060j = {16842913};

    /* renamed from: k */
    private static final int[] f15061k = {16842910, 16842919};

    /* renamed from: l */
    static final String f15062l = C5055b.class.getSimpleName();

    private C5055b() {
    }

    /* renamed from: a */
    public static ColorStateList m21361a(ColorStateList colorStateList) {
        if (f15051a) {
            return new ColorStateList(new int[][]{f15060j, StateSet.NOTHING}, new int[]{m21363c(colorStateList, f15056f), m21363c(colorStateList, f15052b)});
        }
        int[] iArr = f15056f;
        int[] iArr2 = f15057g;
        int[] iArr3 = f15058h;
        int[] iArr4 = f15059i;
        int[] iArr5 = f15052b;
        int[] iArr6 = f15053c;
        int[] iArr7 = f15054d;
        int[] iArr8 = f15055e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f15060j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m21363c(colorStateList, iArr), m21363c(colorStateList, iArr2), m21363c(colorStateList, iArr3), m21363c(colorStateList, iArr4), 0, m21363c(colorStateList, iArr5), m21363c(colorStateList, iArr6), m21363c(colorStateList, iArr7), m21363c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m21362b(int i) {
        return C3287a.m14162d(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m21363c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f15051a ? m21362b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m21364d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f15061k, 0)) != 0) {
            Log.w(f15062l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m21365e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
