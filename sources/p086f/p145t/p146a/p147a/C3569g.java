package p086f.p145t.p146a.p147a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p086f.p111h.p112e.p113c.C3286g;
import p086f.p111h.p114f.C3289c;

/* renamed from: f.t.a.a.g */
public class C3569g implements Interpolator {

    /* renamed from: a */
    private float[] f11087a;

    /* renamed from: b */
    private float[] f11088b;

    public C3569g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C3569g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3559a.f11073l);
        m15300d(s, xmlPullParser);
        s.recycle();
    }

    /* renamed from: a */
    private void m15297a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m15298b(path);
    }

    /* renamed from: b */
    private void m15298b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f11087a = new float[min];
            this.f11088b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f11087a[i2] = fArr[0];
                this.f11088b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f11087a[0])) <= 1.0E-5d && ((double) Math.abs(this.f11088b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f11087a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f11088b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f11087a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f11087a[0]);
            sb.append(",");
            sb.append(this.f11088b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f11087a[i6]);
            sb.append(",");
            sb.append(this.f11088b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m15299c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m15298b(path);
    }

    /* renamed from: d */
    private void m15300d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C3286g.m14156r(xmlPullParser, "pathData")) {
            String m = C3286g.m14151m(typedArray, xmlPullParser, "pathData", 4);
            Path e = C3289c.m14170e(m);
            if (e != null) {
                m15298b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m);
        } else if (!C3286g.m14156r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C3286g.m14156r(xmlPullParser, "controlY1")) {
            float j = C3286g.m14148j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j2 = C3286g.m14148j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r = C3286g.m14156r(xmlPullParser, "controlX2");
            if (r != C3286g.m14156r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!r) {
                m15299c(j, j2);
            } else {
                m15297a(j, j2, C3286g.m14148j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C3286g.m14148j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f11087a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f11087a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f11087a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f11088b[i];
        }
        float[] fArr2 = this.f11088b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
