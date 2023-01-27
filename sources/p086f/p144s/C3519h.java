package p086f.p144s;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: f.s.h */
class C3519h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f10949a;

    /* renamed from: b */
    private final PathMeasure f10950b;

    /* renamed from: c */
    private final float f10951c;

    /* renamed from: d */
    private final float[] f10952d = new float[2];

    /* renamed from: e */
    private final PointF f10953e = new PointF();

    /* renamed from: f */
    private float f10954f;

    C3519h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f10949a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f10950b = pathMeasure;
        this.f10951c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f10954f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f10954f = f.floatValue();
        this.f10950b.getPosTan(this.f10951c * f.floatValue(), this.f10952d, (float[]) null);
        PointF pointF = this.f10953e;
        float[] fArr = this.f10952d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f10949a.set(t, pointF);
    }
}
