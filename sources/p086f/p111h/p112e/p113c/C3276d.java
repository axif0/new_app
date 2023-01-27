package p086f.p111h.p112e.p113c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p111h.C3266d;

/* renamed from: f.h.e.c.d */
final class C3276d {

    /* renamed from: f.h.e.c.d$a */
    static final class C3277a {

        /* renamed from: a */
        final int[] f10508a;

        /* renamed from: b */
        final float[] f10509b;

        C3277a(int i, int i2) {
            this.f10508a = new int[]{i, i2};
            this.f10509b = new float[]{0.0f, 1.0f};
        }

        C3277a(int i, int i2, int i3) {
            this.f10508a = new int[]{i, i2, i3};
            this.f10509b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C3277a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f10508a = new int[size];
            this.f10509b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f10508a[i] = list.get(i).intValue();
                this.f10509b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static C3277a m14119a(C3277a aVar, int i, int i2, boolean z, int i3) {
        C3277a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new C3277a(i, i2);
        return aVar2;
    }

    /* renamed from: b */
    static Shader m14120b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s = C3286g.m14157s(resources, theme2, attributeSet, C3266d.GradientColor);
            float j = C3286g.m14148j(s, xmlPullParser2, "startX", C3266d.GradientColor_android_startX, 0.0f);
            float j2 = C3286g.m14148j(s, xmlPullParser2, "startY", C3266d.GradientColor_android_startY, 0.0f);
            float j3 = C3286g.m14148j(s, xmlPullParser2, "endX", C3266d.GradientColor_android_endX, 0.0f);
            float j4 = C3286g.m14148j(s, xmlPullParser2, "endY", C3266d.GradientColor_android_endY, 0.0f);
            float j5 = C3286g.m14148j(s, xmlPullParser2, "centerX", C3266d.GradientColor_android_centerX, 0.0f);
            float j6 = C3286g.m14148j(s, xmlPullParser2, "centerY", C3266d.GradientColor_android_centerY, 0.0f);
            int k = C3286g.m14149k(s, xmlPullParser2, "type", C3266d.GradientColor_android_type, 0);
            int f = C3286g.m14144f(s, xmlPullParser2, "startColor", C3266d.GradientColor_android_startColor, 0);
            boolean r = C3286g.m14156r(xmlPullParser2, "centerColor");
            int f2 = C3286g.m14144f(s, xmlPullParser2, "centerColor", C3266d.GradientColor_android_centerColor, 0);
            int f3 = C3286g.m14144f(s, xmlPullParser2, "endColor", C3266d.GradientColor_android_endColor, 0);
            int k2 = C3286g.m14149k(s, xmlPullParser2, "tileMode", C3266d.GradientColor_android_tileMode, 0);
            float f4 = j5;
            float j7 = C3286g.m14148j(s, xmlPullParser2, "gradientRadius", C3266d.GradientColor_android_gradientRadius, 0.0f);
            s.recycle();
            C3277a a = m14119a(m14121c(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k == 1) {
                float f5 = f4;
                if (j7 > 0.0f) {
                    int[] iArr = a.f10508a;
                    return new RadialGradient(f5, j6, j7, iArr, a.f10509b, m14122d(k2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j2, j3, j4, a.f10508a, a.f10509b, m14122d(k2));
            } else {
                return new SweepGradient(f4, j6, a.f10508a, a.f10509b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p086f.p111h.p112e.p113c.C3276d.C3277a m14121c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p086f.p111h.C3266d.GradientColorItem
            android.content.res.TypedArray r3 = p086f.p111h.p112e.p113c.C3286g.m14157s(r8, r11, r10, r3)
            int r5 = p086f.p111h.C3266d.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p086f.p111h.C3266d.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = p086f.p111h.C3266d.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p086f.p111h.C3266d.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            f.h.e.c.d$a r8 = new f.h.e.c.d$a
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p112e.p113c.C3276d.m14121c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):f.h.e.c.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m14122d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
