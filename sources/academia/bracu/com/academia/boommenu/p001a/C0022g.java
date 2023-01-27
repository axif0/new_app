package academia.bracu.com.academia.boommenu.p001a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.a.g */
public class C0022g extends Animation {

    /* renamed from: f */
    private float f140f;

    /* renamed from: g */
    private float f141g;

    /* renamed from: h */
    private float f142h;

    /* renamed from: i */
    private float f143i;

    /* renamed from: j */
    private ArrayList<Float> f144j;

    /* renamed from: k */
    private ArrayList<Float> f145k;

    /* renamed from: l */
    private Camera f146l;

    /* renamed from: m */
    private View f147m;

    public C0022g(float f, float f2, ArrayList<Float> arrayList, ArrayList<Float> arrayList2) {
        this.f142h = f;
        this.f143i = f2;
        this.f144j = arrayList;
        this.f145k = arrayList2;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2;
        Camera camera = this.f146l;
        Matrix matrix = transformation.getMatrix();
        float f3 = 0.0f;
        if (f != 1.0f) {
            float size = ((float) this.f144j.size()) * f;
            int i = (int) size;
            int i2 = i + 1;
            if (i2 >= this.f144j.size()) {
                i2 = this.f144j.size() - 1;
            }
            f3 = this.f144j.get(i).floatValue() + ((this.f144j.get(i2).floatValue() - this.f144j.get(i).floatValue()) * (size - ((float) i)));
            float size2 = f * ((float) this.f145k.size());
            int i3 = (int) size2;
            int i4 = i3 + 1;
            if (i4 >= this.f145k.size()) {
                i4 = this.f145k.size() - 1;
            }
            f2 = this.f145k.get(i3).floatValue() + ((this.f145k.get(i4).floatValue() - this.f145k.get(i3).floatValue()) * (size2 - ((float) i3)));
        } else {
            f2 = 0.0f;
        }
        camera.save();
        camera.rotateX(f3);
        camera.rotateY(f2);
        camera.getMatrix(matrix);
        camera.restore();
        float x = this.f147m.getX() - this.f140f;
        float y = this.f147m.getY() - this.f141g;
        matrix.preTranslate((-x) - this.f142h, (-y) - this.f143i);
        matrix.postTranslate(x + this.f142h, y + this.f143i);
    }

    /* renamed from: b */
    public void mo169b(View view, float f, float f2) {
        this.f147m = view;
        this.f140f = f;
        this.f141g = f2;
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f146l = new Camera();
    }
}
