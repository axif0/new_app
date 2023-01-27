package p148g.p179c.p183b.p187g;

import android.graphics.Path;
import android.graphics.PointF;
import java.text.ParseException;

/* renamed from: g.c.b.g.b */
public class C3724b {

    /* renamed from: a */
    private int f11357a;

    /* renamed from: b */
    private PointF f11358b = new PointF();

    /* renamed from: c */
    private int f11359c;

    /* renamed from: d */
    private int f11360d;

    /* renamed from: e */
    private String f11361e;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r0 = 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m15570a() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.f11360d
            int r1 = r3.f11359c
            if (r0 >= r1) goto L_0x003d
            java.lang.String r1 = r3.f11361e
            char r0 = r1.charAt(r0)
            r1 = 97
            if (r1 > r0) goto L_0x0018
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L_0x0018
            r0 = 2
        L_0x0015:
            r3.f11357a = r0
            return r0
        L_0x0018:
            r1 = 65
            r2 = 1
            if (r1 > r0) goto L_0x0024
            r1 = 90
            if (r0 > r1) goto L_0x0024
            r3.f11357a = r2
            return r2
        L_0x0024:
            r1 = 48
            if (r1 > r0) goto L_0x002c
            r1 = 57
            if (r0 <= r1) goto L_0x003b
        L_0x002c:
            r1 = 46
            if (r0 == r1) goto L_0x003b
            r1 = 45
            if (r0 != r1) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            int r0 = r3.f11360d
            int r0 = r0 + r2
            r3.f11360d = r0
            goto L_0x0000
        L_0x003b:
            r0 = 3
            goto L_0x0015
        L_0x003d:
            r0 = 4
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p179c.p183b.p187g.C3724b.m15570a():int");
    }

    /* renamed from: b */
    private void m15571b(PointF pointF, boolean z) throws ParseException {
        pointF.x = mo12269f(m15573d());
        float g = mo12270g(m15573d());
        pointF.y = g;
        if (z) {
            float f = pointF.x;
            PointF pointF2 = this.f11358b;
            pointF.x = f + pointF2.x;
            pointF.y = g + pointF2.y;
        }
    }

    /* renamed from: c */
    private char m15572c() throws ParseException {
        m15570a();
        int i = this.f11357a;
        if (i == 2 || i == 1) {
            String str = this.f11361e;
            int i2 = this.f11360d;
            this.f11360d = i2 + 1;
            return str.charAt(i2);
        }
        throw new ParseException("Expected command", this.f11360d);
    }

    /* renamed from: d */
    private float m15573d() throws ParseException {
        char charAt;
        m15570a();
        if (this.f11357a == 3) {
            int i = this.f11360d;
            boolean z = false;
            boolean z2 = true;
            while (i < this.f11359c && (('0' <= (charAt = this.f11361e.charAt(i)) && charAt <= '9') || ((charAt == '.' && !z) || (charAt == '-' && z2)))) {
                if (charAt == '.') {
                    z = true;
                }
                i++;
                z2 = false;
            }
            int i2 = this.f11360d;
            if (i != i2) {
                String substring = this.f11361e.substring(i2, i);
                try {
                    float parseFloat = Float.parseFloat(substring);
                    this.f11360d = i;
                    return parseFloat;
                } catch (NumberFormatException unused) {
                    throw new ParseException("Invalid float value '" + substring + "'.", this.f11360d);
                }
            } else {
                throw new ParseException("Expected value", this.f11360d);
            }
        } else {
            throw new ParseException("Expected value", this.f11360d);
        }
    }

    /* renamed from: e */
    public Path mo12276e(String str) throws ParseException {
        float f = Float.NaN;
        this.f11358b.set(Float.NaN, Float.NaN);
        this.f11361e = str;
        this.f11360d = 0;
        this.f11359c = str.length();
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        boolean z = true;
        while (this.f11360d < this.f11359c) {
            char c = m15572c();
            boolean z2 = this.f11357a == 2;
            if (c != 'C') {
                if (c != 'H') {
                    if (c != 'V') {
                        if (c != 'Z') {
                            if (c != 'c') {
                                if (c != 'h') {
                                    if (c != 'v') {
                                        if (c != 'z') {
                                            if (c != 'L') {
                                                if (c != 'M') {
                                                    if (c != 'l') {
                                                        if (c != 'm') {
                                                            f = Float.NaN;
                                                        }
                                                    }
                                                }
                                                boolean z3 = true;
                                                while (m15570a() == 3) {
                                                    m15571b(pointF, z2 && this.f11358b.x != f);
                                                    if (z3) {
                                                        path.moveTo(pointF.x, pointF.y);
                                                        if (z) {
                                                            this.f11358b.set(pointF);
                                                            z3 = false;
                                                            z = false;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    } else {
                                                        path.lineTo(pointF.x, pointF.y);
                                                    }
                                                }
                                                this.f11358b.set(pointF);
                                                f = Float.NaN;
                                            }
                                            if (this.f11358b.x != f) {
                                                while (m15570a() == 3) {
                                                    m15571b(pointF, z2);
                                                    path.lineTo(pointF.x, pointF.y);
                                                }
                                                this.f11358b.set(pointF);
                                                f = Float.NaN;
                                            } else {
                                                throw new ParseException("Relative commands require current point", this.f11360d);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        path.close();
                        f = Float.NaN;
                    }
                    if (this.f11358b.x != f) {
                        while (m15570a() == 3) {
                            float g = mo12270g(m15573d());
                            if (z2) {
                                g += this.f11358b.y;
                            }
                            path.lineTo(this.f11358b.x, g);
                        }
                        this.f11358b.set(pointF);
                        f = Float.NaN;
                    } else {
                        throw new ParseException("Relative commands require current point", this.f11360d);
                    }
                }
                if (this.f11358b.x != f) {
                    while (m15570a() == 3) {
                        float f2 = mo12269f(m15573d());
                        if (z2) {
                            f2 += this.f11358b.x;
                        }
                        path.lineTo(f2, this.f11358b.y);
                    }
                    this.f11358b.set(pointF);
                    f = Float.NaN;
                } else {
                    throw new ParseException("Relative commands require current point", this.f11360d);
                }
            }
            if (this.f11358b.x != f) {
                for (int i = 3; m15570a() == i; i = 3) {
                    m15571b(pointF, z2);
                    m15571b(pointF2, z2);
                    m15571b(pointF3, z2);
                    path.cubicTo(pointF.x, pointF.y, pointF2.x, pointF2.y, pointF3.x, pointF3.y);
                    z2 = z2;
                }
                this.f11358b.set(pointF3);
                f = Float.NaN;
            } else {
                throw new ParseException("Relative commands require current point", this.f11360d);
            }
        }
        return path;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public float mo12269f(float f) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public float mo12270g(float f) {
        throw null;
    }
}
