package p148g.p189d.p190a.p252d.p256m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: g.d.a.d.m.f */
public class C5012f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f14956a = new Matrix();

    public C5012f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f14956a.set(imageView.getImageMatrix());
        return this.f14956a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
