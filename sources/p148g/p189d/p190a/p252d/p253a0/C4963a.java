package p148g.p189d.p190a.p252d.p253a0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p086f.p111h.p114f.C3287a;

/* renamed from: g.d.a.d.a0.a */
public class C4963a {

    /* renamed from: i */
    private static final int[] f14795i = new int[3];

    /* renamed from: j */
    private static final float[] f14796j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f14797k = new int[4];

    /* renamed from: l */
    private static final float[] f14798l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f14799a;

    /* renamed from: b */
    private final Paint f14800b;

    /* renamed from: c */
    private final Paint f14801c;

    /* renamed from: d */
    private int f14802d;

    /* renamed from: e */
    private int f14803e;

    /* renamed from: f */
    private int f14804f;

    /* renamed from: g */
    private final Path f14805g;

    /* renamed from: h */
    private Paint f14806h;

    public C4963a() {
        this(-16777216);
    }

    public C4963a(int i) {
        this.f14805g = new Path();
        this.f14806h = new Paint();
        this.f14799a = new Paint();
        mo14902d(i);
        this.f14806h.setColor(0);
        Paint paint = new Paint(4);
        this.f14800b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f14801c = new Paint(this.f14800b);
    }

    /* renamed from: a */
    public void mo14899a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f14805g;
        if (z) {
            int[] iArr = f14797k;
            iArr[0] = 0;
            iArr[1] = this.f14804f;
            iArr[2] = this.f14803e;
            iArr[3] = this.f14802d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f14797k;
            iArr2[0] = 0;
            iArr2[1] = this.f14802d;
            iArr2[2] = this.f14803e;
            iArr2[3] = this.f14804f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f14798l;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f14800b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f14797k, f14798l, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f14806h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f14800b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo14900b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f14795i;
        iArr[0] = this.f14804f;
        iArr[1] = this.f14803e;
        iArr[2] = this.f14802d;
        Paint paint = this.f14801c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, f14795i, f14796j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f14801c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo14901c() {
        return this.f14799a;
    }

    /* renamed from: d */
    public void mo14902d(int i) {
        this.f14802d = C3287a.m14162d(i, 68);
        this.f14803e = C3287a.m14162d(i, 20);
        this.f14804f = C3287a.m14162d(i, 0);
        this.f14799a.setColor(this.f14802d);
    }
}
