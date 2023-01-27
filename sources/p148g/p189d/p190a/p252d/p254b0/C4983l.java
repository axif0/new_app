package p148g.p189d.p190a.p252d.p254b0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: g.d.a.d.b0.l */
public class C4983l {

    /* renamed from: a */
    private final C4986m[] f14885a = new C4986m[4];

    /* renamed from: b */
    private final Matrix[] f14886b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f14887c = new Matrix[4];

    /* renamed from: d */
    private final PointF f14888d = new PointF();

    /* renamed from: e */
    private final Path f14889e = new Path();

    /* renamed from: f */
    private final Path f14890f = new Path();

    /* renamed from: g */
    private final C4986m f14891g = new C4986m();

    /* renamed from: h */
    private final float[] f14892h = new float[2];

    /* renamed from: i */
    private final float[] f14893i = new float[2];

    /* renamed from: j */
    private boolean f14894j = true;

    /* renamed from: g.d.a.d.b0.l$a */
    public interface C4984a {
        /* renamed from: a */
        void mo14952a(C4986m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo14953b(C4986m mVar, Matrix matrix, int i);
    }

    /* renamed from: g.d.a.d.b0.l$b */
    static final class C4985b {

        /* renamed from: a */
        public final C4979k f14895a;

        /* renamed from: b */
        public final Path f14896b;

        /* renamed from: c */
        public final RectF f14897c;

        /* renamed from: d */
        public final C4984a f14898d;

        /* renamed from: e */
        public final float f14899e;

        C4985b(C4979k kVar, float f, RectF rectF, C4984a aVar, Path path) {
            this.f14898d = aVar;
            this.f14895a = kVar;
            this.f14899e = f;
            this.f14897c = rectF;
            this.f14896b = path;
        }
    }

    public C4983l() {
        for (int i = 0; i < 4; i++) {
            this.f14885a[i] = new C4986m();
            this.f14886b[i] = new Matrix();
            this.f14887c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m21128a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m21129b(C4985b bVar, int i) {
        this.f14892h[0] = this.f14885a[i].mo15001k();
        this.f14892h[1] = this.f14885a[i].mo15002l();
        this.f14886b[i].mapPoints(this.f14892h);
        Path path = bVar.f14896b;
        float[] fArr = this.f14892h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f14885a[i].mo14996d(this.f14886b[i], bVar.f14896b);
        C4984a aVar = bVar.f14898d;
        if (aVar != null) {
            aVar.mo14953b(this.f14885a[i], this.f14886b[i], i);
        }
    }

    /* renamed from: c */
    private void m21130c(C4985b bVar, int i) {
        Path path;
        Matrix matrix;
        C4986m mVar;
        int i2 = (i + 1) % 4;
        this.f14892h[0] = this.f14885a[i].mo14999i();
        this.f14892h[1] = this.f14885a[i].mo15000j();
        this.f14886b[i].mapPoints(this.f14892h);
        this.f14893i[0] = this.f14885a[i2].mo15001k();
        this.f14893i[1] = this.f14885a[i2].mo15002l();
        this.f14886b[i2].mapPoints(this.f14893i);
        float[] fArr = this.f14892h;
        float f = fArr[0];
        float[] fArr2 = this.f14893i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m21134i(bVar.f14897c, i);
        this.f14891g.mo15004n(0.0f, 0.0f);
        C4971f j = m21135j(i, bVar.f14895a);
        j.mo7637c(max, i3, bVar.f14899e, this.f14891g);
        Path path2 = new Path();
        this.f14891g.mo14996d(this.f14887c[i], path2);
        if (!this.f14894j || Build.VERSION.SDK_INT < 19 || (!j.mo14910b() && !m21136k(path2, i) && !m21136k(path2, i2))) {
            mVar = this.f14891g;
            matrix = this.f14887c[i];
            path = bVar.f14896b;
        } else {
            path2.op(path2, this.f14890f, Path.Op.DIFFERENCE);
            this.f14892h[0] = this.f14891g.mo15001k();
            this.f14892h[1] = this.f14891g.mo15002l();
            this.f14887c[i].mapPoints(this.f14892h);
            Path path3 = this.f14889e;
            float[] fArr3 = this.f14892h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f14891g;
            matrix = this.f14887c[i];
            path = this.f14889e;
        }
        mVar.mo14996d(matrix, path);
        C4984a aVar = bVar.f14898d;
        if (aVar != null) {
            aVar.mo14952a(this.f14891g, this.f14887c[i], i);
        }
    }

    /* renamed from: f */
    private void m21131f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        float f3;
        if (i == 1) {
            f3 = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f3 = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: g */
    private C4968c m21132g(int i, C4979k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo14970t() : kVar.mo14968r() : kVar.mo14961j() : kVar.mo14963l();
    }

    /* renamed from: h */
    private C4969d m21133h(int i, C4979k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo14969s() : kVar.mo14967q() : kVar.mo14960i() : kVar.mo14962k();
    }

    /* renamed from: i */
    private float m21134i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f14892h;
        C4986m[] mVarArr = this.f14885a;
        fArr[0] = mVarArr[i].f14902c;
        fArr[1] = mVarArr[i].f14903d;
        this.f14886b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f14892h[0];
        } else {
            centerX = rectF.centerY();
            f = this.f14892h[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    private C4971f m21135j(int i, C4979k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.mo14965o() : kVar.mo14966p() : kVar.mo14964n() : kVar.mo14959h();
    }

    /* renamed from: k */
    private boolean m21136k(Path path, int i) {
        Path path2 = new Path();
        this.f14885a[i].mo14996d(this.f14886b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: l */
    private void m21137l(C4985b bVar, int i) {
        m21133h(i, bVar.f14895a).mo14909b(this.f14885a[i], 90.0f, bVar.f14899e, bVar.f14897c, m21132g(i, bVar.f14895a));
        float a = m21128a(i);
        this.f14886b[i].reset();
        m21131f(i, bVar.f14897c, this.f14888d);
        Matrix matrix = this.f14886b[i];
        PointF pointF = this.f14888d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f14886b[i].preRotate(a);
    }

    /* renamed from: m */
    private void m21138m(int i) {
        this.f14892h[0] = this.f14885a[i].mo14999i();
        this.f14892h[1] = this.f14885a[i].mo15000j();
        this.f14886b[i].mapPoints(this.f14892h);
        float a = m21128a(i);
        this.f14887c[i].reset();
        Matrix matrix = this.f14887c[i];
        float[] fArr = this.f14892h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f14887c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo14993d(C4979k kVar, float f, RectF rectF, Path path) {
        mo14994e(kVar, f, rectF, (C4984a) null, path);
    }

    /* renamed from: e */
    public void mo14994e(C4979k kVar, float f, RectF rectF, C4984a aVar, Path path) {
        path.rewind();
        this.f14889e.rewind();
        this.f14890f.rewind();
        this.f14890f.addRect(rectF, Path.Direction.CW);
        C4985b bVar = new C4985b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m21137l(bVar, i);
            m21138m(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m21129b(bVar, i2);
            m21130c(bVar, i2);
        }
        path.close();
        this.f14889e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f14889e.isEmpty()) {
            path.op(this.f14889e, Path.Op.UNION);
        }
    }
}
