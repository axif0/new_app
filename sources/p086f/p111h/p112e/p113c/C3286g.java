package p086f.p111h.p112e.p113c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: f.h.e.c.g */
public class C3286g {
    /* renamed from: a */
    public static int m14139a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: b */
    public static boolean m14140b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: c */
    public static Drawable m14141c(TypedArray typedArray, int i, int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* renamed from: d */
    public static int m14142d(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: e */
    public static boolean m14143e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m14156r(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: f */
    public static int m14144f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m14156r(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: g */
    public static ColorStateList m14145g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m14156r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C3269a.m14085c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m14146h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* renamed from: h */
    private static ColorStateList m14146h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static C3270b m14147i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m14156r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C3270b.m14090b(typedValue.data);
            }
            C3270b g = C3270b.m14093g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C3270b.m14090b(i2);
    }

    /* renamed from: j */
    public static float m14148j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m14156r(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: k */
    public static int m14149k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m14156r(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: l */
    public static int m14150l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m14156r(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: m */
    public static String m14151m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m14156r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: n */
    public static int m14152n(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: o */
    public static String m14153o(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: p */
    public static CharSequence m14154p(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: q */
    public static CharSequence[] m14155q(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: r */
    public static boolean m14156r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: s */
    public static TypedArray m14157s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: t */
    public static TypedValue m14158t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m14156r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
