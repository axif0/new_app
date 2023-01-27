package p086f.p145t.p146a.p147a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0588a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p102e.C3190a;
import p086f.p111h.p112e.p113c.C3270b;
import p086f.p111h.p112e.p113c.C3286g;
import p086f.p111h.p114f.C3289c;

/* renamed from: f.t.a.a.i */
public class C3571i extends C3570h {

    /* renamed from: o */
    static final PorterDuff.Mode f11090o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private C3579h f11091g;

    /* renamed from: h */
    private PorterDuffColorFilter f11092h;

    /* renamed from: i */
    private ColorFilter f11093i;

    /* renamed from: j */
    private boolean f11094j;

    /* renamed from: k */
    private boolean f11095k;

    /* renamed from: l */
    private final float[] f11096l;

    /* renamed from: m */
    private final Matrix f11097m;

    /* renamed from: n */
    private final Rect f11098n;

    /* renamed from: f.t.a.a.i$b */
    private static class C3573b extends C3577f {
        C3573b() {
        }

        C3573b(C3573b bVar) {
            super(bVar);
        }

        /* renamed from: f */
        private void m15311f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11125b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f11124a = C3289c.m14169d(string2);
            }
            this.f11126c = C3286g.m14149k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo12108c() {
            return true;
        }

        /* renamed from: e */
        public void mo12109e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C3286g.m14156r(xmlPullParser, "pathData")) {
                TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3559a.f11065d);
                m15311f(s, xmlPullParser);
                s.recycle();
            }
        }
    }

    /* renamed from: f.t.a.a.i$c */
    private static class C3574c extends C3577f {

        /* renamed from: e */
        private int[] f11099e;

        /* renamed from: f */
        C3270b f11100f;

        /* renamed from: g */
        float f11101g = 0.0f;

        /* renamed from: h */
        C3270b f11102h;

        /* renamed from: i */
        float f11103i = 1.0f;

        /* renamed from: j */
        float f11104j = 1.0f;

        /* renamed from: k */
        float f11105k = 0.0f;

        /* renamed from: l */
        float f11106l = 1.0f;

        /* renamed from: m */
        float f11107m = 0.0f;

        /* renamed from: n */
        Paint.Cap f11108n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f11109o = Paint.Join.MITER;

        /* renamed from: p */
        float f11110p = 4.0f;

        C3574c() {
        }

        C3574c(C3574c cVar) {
            super(cVar);
            this.f11099e = cVar.f11099e;
            this.f11100f = cVar.f11100f;
            this.f11101g = cVar.f11101g;
            this.f11103i = cVar.f11103i;
            this.f11102h = cVar.f11102h;
            this.f11126c = cVar.f11126c;
            this.f11104j = cVar.f11104j;
            this.f11105k = cVar.f11105k;
            this.f11106l = cVar.f11106l;
            this.f11107m = cVar.f11107m;
            this.f11108n = cVar.f11108n;
            this.f11109o = cVar.f11109o;
            this.f11110p = cVar.f11110p;
        }

        /* renamed from: e */
        private Paint.Cap m15314e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m15315f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m15316h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f11099e = null;
            if (C3286g.m14156r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f11125b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f11124a = C3289c.m14169d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f11102h = C3286g.m14147i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f11104j = C3286g.m14148j(typedArray, xmlPullParser, "fillAlpha", 12, this.f11104j);
                this.f11108n = m15314e(C3286g.m14149k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f11108n);
                this.f11109o = m15315f(C3286g.m14149k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f11109o);
                this.f11110p = C3286g.m14148j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f11110p);
                this.f11100f = C3286g.m14147i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f11103i = C3286g.m14148j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f11103i);
                this.f11101g = C3286g.m14148j(typedArray, xmlPullParser, "strokeWidth", 4, this.f11101g);
                this.f11106l = C3286g.m14148j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f11106l);
                this.f11107m = C3286g.m14148j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f11107m);
                this.f11105k = C3286g.m14148j(typedArray, xmlPullParser, "trimPathStart", 5, this.f11105k);
                this.f11126c = C3286g.m14149k(typedArray, xmlPullParser, "fillType", 13, this.f11126c);
            }
        }

        /* renamed from: a */
        public boolean mo12110a() {
            return this.f11102h.mo11426i() || this.f11100f.mo11426i();
        }

        /* renamed from: b */
        public boolean mo12111b(int[] iArr) {
            return this.f11100f.mo11427j(iArr) | this.f11102h.mo11427j(iArr);
        }

        /* renamed from: g */
        public void mo12112g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3559a.f11064c);
            m15316h(s, xmlPullParser, theme);
            s.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f11104j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f11102h.mo11423e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f11103i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f11100f.mo11423e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f11101g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f11106l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f11107m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f11105k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f11104j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f11102h.mo11428k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f11103i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f11100f.mo11428k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f11101g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f11106l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f11107m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f11105k = f;
        }
    }

    /* renamed from: f.t.a.a.i$d */
    private static class C3575d extends C3576e {

        /* renamed from: a */
        final Matrix f11111a = new Matrix();

        /* renamed from: b */
        final ArrayList<C3576e> f11112b = new ArrayList<>();

        /* renamed from: c */
        float f11113c = 0.0f;

        /* renamed from: d */
        private float f11114d = 0.0f;

        /* renamed from: e */
        private float f11115e = 0.0f;

        /* renamed from: f */
        private float f11116f = 1.0f;

        /* renamed from: g */
        private float f11117g = 1.0f;

        /* renamed from: h */
        private float f11118h = 0.0f;

        /* renamed from: i */
        private float f11119i = 0.0f;

        /* renamed from: j */
        final Matrix f11120j = new Matrix();

        /* renamed from: k */
        int f11121k;

        /* renamed from: l */
        private int[] f11122l;

        /* renamed from: m */
        private String f11123m = null;

        public C3575d() {
            super();
        }

        public C3575d(C3575d dVar, C3190a<String, Object> aVar) {
            super();
            C3577f fVar;
            this.f11113c = dVar.f11113c;
            this.f11114d = dVar.f11114d;
            this.f11115e = dVar.f11115e;
            this.f11116f = dVar.f11116f;
            this.f11117g = dVar.f11117g;
            this.f11118h = dVar.f11118h;
            this.f11119i = dVar.f11119i;
            this.f11122l = dVar.f11122l;
            String str = dVar.f11123m;
            this.f11123m = str;
            this.f11121k = dVar.f11121k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f11120j.set(dVar.f11120j);
            ArrayList<C3576e> arrayList = dVar.f11112b;
            for (int i = 0; i < arrayList.size(); i++) {
                C3576e eVar = arrayList.get(i);
                if (eVar instanceof C3575d) {
                    this.f11112b.add(new C3575d((C3575d) eVar, aVar));
                } else {
                    if (eVar instanceof C3574c) {
                        fVar = new C3574c((C3574c) eVar);
                    } else if (eVar instanceof C3573b) {
                        fVar = new C3573b((C3573b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f11112b.add(fVar);
                    String str2 = fVar.f11125b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m15320d() {
            this.f11120j.reset();
            this.f11120j.postTranslate(-this.f11114d, -this.f11115e);
            this.f11120j.postScale(this.f11116f, this.f11117g);
            this.f11120j.postRotate(this.f11113c, 0.0f, 0.0f);
            this.f11120j.postTranslate(this.f11118h + this.f11114d, this.f11119i + this.f11115e);
        }

        /* renamed from: e */
        private void m15321e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f11122l = null;
            this.f11113c = C3286g.m14148j(typedArray, xmlPullParser, "rotation", 5, this.f11113c);
            this.f11114d = typedArray.getFloat(1, this.f11114d);
            this.f11115e = typedArray.getFloat(2, this.f11115e);
            this.f11116f = C3286g.m14148j(typedArray, xmlPullParser, "scaleX", 3, this.f11116f);
            this.f11117g = C3286g.m14148j(typedArray, xmlPullParser, "scaleY", 4, this.f11117g);
            this.f11118h = C3286g.m14148j(typedArray, xmlPullParser, "translateX", 6, this.f11118h);
            this.f11119i = C3286g.m14148j(typedArray, xmlPullParser, "translateY", 7, this.f11119i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f11123m = string;
            }
            m15320d();
        }

        /* renamed from: a */
        public boolean mo12110a() {
            for (int i = 0; i < this.f11112b.size(); i++) {
                if (this.f11112b.get(i).mo12110a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo12111b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f11112b.size(); i++) {
                z |= this.f11112b.get(i).mo12111b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo12129c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3559a.f11063b);
            m15321e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.f11123m;
        }

        public Matrix getLocalMatrix() {
            return this.f11120j;
        }

        public float getPivotX() {
            return this.f11114d;
        }

        public float getPivotY() {
            return this.f11115e;
        }

        public float getRotation() {
            return this.f11113c;
        }

        public float getScaleX() {
            return this.f11116f;
        }

        public float getScaleY() {
            return this.f11117g;
        }

        public float getTranslateX() {
            return this.f11118h;
        }

        public float getTranslateY() {
            return this.f11119i;
        }

        public void setPivotX(float f) {
            if (f != this.f11114d) {
                this.f11114d = f;
                m15320d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f11115e) {
                this.f11115e = f;
                m15320d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f11113c) {
                this.f11113c = f;
                m15320d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f11116f) {
                this.f11116f = f;
                m15320d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f11117g) {
                this.f11117g = f;
                m15320d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f11118h) {
                this.f11118h = f;
                m15320d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f11119i) {
                this.f11119i = f;
                m15320d();
            }
        }
    }

    /* renamed from: f.t.a.a.i$e */
    private static abstract class C3576e {
        private C3576e() {
        }

        /* renamed from: a */
        public boolean mo12110a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo12111b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: f.t.a.a.i$f */
    private static abstract class C3577f extends C3576e {

        /* renamed from: a */
        protected C3289c.C3291b[] f11124a = null;

        /* renamed from: b */
        String f11125b;

        /* renamed from: c */
        int f11126c = 0;

        /* renamed from: d */
        int f11127d;

        public C3577f() {
            super();
        }

        public C3577f(C3577f fVar) {
            super();
            this.f11125b = fVar.f11125b;
            this.f11127d = fVar.f11127d;
            this.f11124a = C3289c.m14171f(fVar.f11124a);
        }

        /* renamed from: c */
        public boolean mo12108c() {
            return false;
        }

        /* renamed from: d */
        public void mo12146d(Path path) {
            path.reset();
            C3289c.C3291b[] bVarArr = this.f11124a;
            if (bVarArr != null) {
                C3289c.C3291b.m14179e(bVarArr, path);
            }
        }

        public C3289c.C3291b[] getPathData() {
            return this.f11124a;
        }

        public String getPathName() {
            return this.f11125b;
        }

        public void setPathData(C3289c.C3291b[] bVarArr) {
            if (!C3289c.m14167b(this.f11124a, bVarArr)) {
                this.f11124a = C3289c.m14171f(bVarArr);
            } else {
                C3289c.m14175j(this.f11124a, bVarArr);
            }
        }
    }

    /* renamed from: f.t.a.a.i$g */
    private static class C3578g {

        /* renamed from: q */
        private static final Matrix f11128q = new Matrix();

        /* renamed from: a */
        private final Path f11129a;

        /* renamed from: b */
        private final Path f11130b;

        /* renamed from: c */
        private final Matrix f11131c;

        /* renamed from: d */
        Paint f11132d;

        /* renamed from: e */
        Paint f11133e;

        /* renamed from: f */
        private PathMeasure f11134f;

        /* renamed from: g */
        private int f11135g;

        /* renamed from: h */
        final C3575d f11136h;

        /* renamed from: i */
        float f11137i;

        /* renamed from: j */
        float f11138j;

        /* renamed from: k */
        float f11139k;

        /* renamed from: l */
        float f11140l;

        /* renamed from: m */
        int f11141m;

        /* renamed from: n */
        String f11142n;

        /* renamed from: o */
        Boolean f11143o;

        /* renamed from: p */
        final C3190a<String, Object> f11144p;

        public C3578g() {
            this.f11131c = new Matrix();
            this.f11137i = 0.0f;
            this.f11138j = 0.0f;
            this.f11139k = 0.0f;
            this.f11140l = 0.0f;
            this.f11141m = 255;
            this.f11142n = null;
            this.f11143o = null;
            this.f11144p = new C3190a<>();
            this.f11136h = new C3575d();
            this.f11129a = new Path();
            this.f11130b = new Path();
        }

        public C3578g(C3578g gVar) {
            this.f11131c = new Matrix();
            this.f11137i = 0.0f;
            this.f11138j = 0.0f;
            this.f11139k = 0.0f;
            this.f11140l = 0.0f;
            this.f11141m = 255;
            this.f11142n = null;
            this.f11143o = null;
            C3190a<String, Object> aVar = new C3190a<>();
            this.f11144p = aVar;
            this.f11136h = new C3575d(gVar.f11136h, aVar);
            this.f11129a = new Path(gVar.f11129a);
            this.f11130b = new Path(gVar.f11130b);
            this.f11137i = gVar.f11137i;
            this.f11138j = gVar.f11138j;
            this.f11139k = gVar.f11139k;
            this.f11140l = gVar.f11140l;
            this.f11135g = gVar.f11135g;
            this.f11141m = gVar.f11141m;
            this.f11142n = gVar.f11142n;
            String str = gVar.f11142n;
            if (str != null) {
                this.f11144p.put(str, this);
            }
            this.f11143o = gVar.f11143o;
        }

        /* renamed from: a */
        private static float m15329a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m15330c(C3575d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f11111a.set(matrix);
            dVar.f11111a.preConcat(dVar.f11120j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f11112b.size(); i3++) {
                C3576e eVar = dVar.f11112b.get(i3);
                if (eVar instanceof C3575d) {
                    m15330c((C3575d) eVar, dVar.f11111a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C3577f) {
                    m15331d(dVar, (C3577f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m15331d(C3575d dVar, C3577f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f11139k;
            float f2 = ((float) i2) / this.f11140l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f11111a;
            this.f11131c.set(matrix);
            this.f11131c.postScale(f, f2);
            float e = m15332e(matrix);
            if (e != 0.0f) {
                fVar.mo12146d(this.f11129a);
                Path path = this.f11129a;
                this.f11130b.reset();
                if (fVar.mo12108c()) {
                    this.f11130b.setFillType(fVar.f11126c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f11130b.addPath(path, this.f11131c);
                    canvas.clipPath(this.f11130b);
                    return;
                }
                C3574c cVar = (C3574c) fVar;
                if (!(cVar.f11105k == 0.0f && cVar.f11106l == 1.0f)) {
                    float f3 = cVar.f11105k;
                    float f4 = cVar.f11107m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f11106l + f4) % 1.0f;
                    if (this.f11134f == null) {
                        this.f11134f = new PathMeasure();
                    }
                    this.f11134f.setPath(this.f11129a, false);
                    float length = this.f11134f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f11134f.getSegment(f7, length, path, true);
                        this.f11134f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f11134f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f11130b.addPath(path, this.f11131c);
                if (cVar.f11102h.mo11429l()) {
                    C3270b bVar = cVar.f11102h;
                    if (this.f11133e == null) {
                        Paint paint = new Paint(1);
                        this.f11133e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f11133e;
                    if (bVar.mo11425h()) {
                        Shader f9 = bVar.mo11424f();
                        f9.setLocalMatrix(this.f11131c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f11104j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C3571i.m15301a(bVar.mo11423e(), cVar.f11104j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f11130b.setFillType(cVar.f11126c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f11130b, paint2);
                }
                if (cVar.f11100f.mo11429l()) {
                    C3270b bVar2 = cVar.f11100f;
                    if (this.f11132d == null) {
                        Paint paint3 = new Paint(1);
                        this.f11132d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f11132d;
                    Paint.Join join = cVar.f11109o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f11108n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f11110p);
                    if (bVar2.mo11425h()) {
                        Shader f10 = bVar2.mo11424f();
                        f10.setLocalMatrix(this.f11131c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f11103i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C3571i.m15301a(bVar2.mo11423e(), cVar.f11103i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f11101g * min * e);
                    canvas.drawPath(this.f11130b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m15332e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m15329a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo12150b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m15330c(this.f11136h, f11128q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo12151f() {
            if (this.f11143o == null) {
                this.f11143o = Boolean.valueOf(this.f11136h.mo12110a());
            }
            return this.f11143o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo12152g(int[] iArr) {
            return this.f11136h.mo12111b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11141m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f11141m = i;
        }
    }

    /* renamed from: f.t.a.a.i$h */
    private static class C3579h extends Drawable.ConstantState {

        /* renamed from: a */
        int f11145a;

        /* renamed from: b */
        C3578g f11146b;

        /* renamed from: c */
        ColorStateList f11147c;

        /* renamed from: d */
        PorterDuff.Mode f11148d;

        /* renamed from: e */
        boolean f11149e;

        /* renamed from: f */
        Bitmap f11150f;

        /* renamed from: g */
        ColorStateList f11151g;

        /* renamed from: h */
        PorterDuff.Mode f11152h;

        /* renamed from: i */
        int f11153i;

        /* renamed from: j */
        boolean f11154j;

        /* renamed from: k */
        boolean f11155k;

        /* renamed from: l */
        Paint f11156l;

        public C3579h() {
            this.f11147c = null;
            this.f11148d = C3571i.f11090o;
            this.f11146b = new C3578g();
        }

        public C3579h(C3579h hVar) {
            this.f11147c = null;
            this.f11148d = C3571i.f11090o;
            if (hVar != null) {
                this.f11145a = hVar.f11145a;
                C3578g gVar = new C3578g(hVar.f11146b);
                this.f11146b = gVar;
                if (hVar.f11146b.f11133e != null) {
                    gVar.f11133e = new Paint(hVar.f11146b.f11133e);
                }
                if (hVar.f11146b.f11132d != null) {
                    this.f11146b.f11132d = new Paint(hVar.f11146b.f11132d);
                }
                this.f11147c = hVar.f11147c;
                this.f11148d = hVar.f11148d;
                this.f11149e = hVar.f11149e;
            }
        }

        /* renamed from: a */
        public boolean mo12157a(int i, int i2) {
            return i == this.f11150f.getWidth() && i2 == this.f11150f.getHeight();
        }

        /* renamed from: b */
        public boolean mo12158b() {
            return !this.f11155k && this.f11151g == this.f11147c && this.f11152h == this.f11148d && this.f11154j == this.f11149e && this.f11153i == this.f11146b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo12159c(int i, int i2) {
            if (this.f11150f == null || !mo12157a(i, i2)) {
                this.f11150f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f11155k = true;
            }
        }

        /* renamed from: d */
        public void mo12160d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f11150f, (Rect) null, rect, mo12161e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo12161e(ColorFilter colorFilter) {
            if (!mo12162f() && colorFilter == null) {
                return null;
            }
            if (this.f11156l == null) {
                Paint paint = new Paint();
                this.f11156l = paint;
                paint.setFilterBitmap(true);
            }
            this.f11156l.setAlpha(this.f11146b.getRootAlpha());
            this.f11156l.setColorFilter(colorFilter);
            return this.f11156l;
        }

        /* renamed from: f */
        public boolean mo12162f() {
            return this.f11146b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo12163g() {
            return this.f11146b.mo12151f();
        }

        public int getChangingConfigurations() {
            return this.f11145a;
        }

        /* renamed from: h */
        public boolean mo12165h(int[] iArr) {
            boolean g = this.f11146b.mo12152g(iArr);
            this.f11155k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo12166i() {
            this.f11151g = this.f11147c;
            this.f11152h = this.f11148d;
            this.f11153i = this.f11146b.getRootAlpha();
            this.f11154j = this.f11149e;
            this.f11155k = false;
        }

        /* renamed from: j */
        public void mo12167j(int i, int i2) {
            this.f11150f.eraseColor(0);
            this.f11146b.mo12150b(new Canvas(this.f11150f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C3571i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3571i(this);
        }
    }

    /* renamed from: f.t.a.a.i$i */
    private static class C3580i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f11157a;

        public C3580i(Drawable.ConstantState constantState) {
            this.f11157a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f11157a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f11157a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C3571i iVar = new C3571i();
            iVar.f11089f = (VectorDrawable) this.f11157a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C3571i iVar = new C3571i();
            iVar.f11089f = (VectorDrawable) this.f11157a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3571i iVar = new C3571i();
            iVar.f11089f = (VectorDrawable) this.f11157a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C3571i() {
        this.f11095k = true;
        this.f11096l = new float[9];
        this.f11097m = new Matrix();
        this.f11098n = new Rect();
        this.f11091g = new C3579h();
    }

    C3571i(C3579h hVar) {
        this.f11095k = true;
        this.f11096l = new float[9];
        this.f11097m = new Matrix();
        this.f11098n = new Rect();
        this.f11091g = hVar;
        this.f11092h = mo12098j(this.f11092h, hVar.f11147c, hVar.f11148d);
    }

    /* renamed from: a */
    static int m15301a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p086f.p145t.p146a.p147a.C3571i m15302b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            f.t.a.a.i r0 = new f.t.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = p086f.p111h.p112e.p113c.C3279f.m14126a(r6, r7, r8)
            r0.f11089f = r6
            f.t.a.a.i$i r6 = new f.t.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f11089f
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            f.t.a.a.i r6 = m15303c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p145t.p146a.p147a.C3571i.m15302b(android.content.res.Resources, int, android.content.res.Resources$Theme):f.t.a.a.i");
    }

    /* renamed from: c */
    public static C3571i m15303c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3571i iVar = new C3571i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: f.t.a.a.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: f.t.a.a.i$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: f.t.a.a.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: f.t.a.a.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: f.t.a.a.i$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15304e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            f.t.a.a.i$h r0 = r10.f11091g
            f.t.a.a.i$g r1 = r0.f11146b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            f.t.a.a.i$d r3 = r1.f11136h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            f.t.a.a.i$d r7 = (p086f.p145t.p146a.p147a.C3571i.C3575d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            f.t.a.a.i$c r3 = new f.t.a.a.i$c
            r3.<init>()
            r3.mo12112g(r11, r13, r14, r12)
            java.util.ArrayList<f.t.a.a.i$e> r6 = r7.f11112b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            f.e.a<java.lang.String, java.lang.Object> r6 = r1.f11144p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            f.t.a.a.i$b r3 = new f.t.a.a.i$b
            r3.<init>()
            r3.mo12109e(r11, r13, r14, r12)
            java.util.ArrayList<f.t.a.a.i$e> r7 = r7.f11112b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            f.e.a<java.lang.String, java.lang.Object> r7 = r1.f11144p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f11145a
            int r3 = r3.f11127d
        L_0x0081:
            r3 = r3 | r7
            r0.f11145a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            f.t.a.a.i$d r3 = new f.t.a.a.i$d
            r3.<init>()
            r3.mo12129c(r11, r13, r14, r12)
            java.util.ArrayList<f.t.a.a.i$e> r7 = r7.f11112b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            f.e.a<java.lang.String, java.lang.Object> r7 = r1.f11144p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f11145a
            int r3 = r3.f11121k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            goto L_0x00d0
        L_0x00cf:
            throw r11
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p145t.p146a.p147a.C3571i.m15304e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: f */
    private boolean m15305f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0588a.m2763f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m15306g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m15307i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C3579h hVar = this.f11091g;
        C3578g gVar = hVar.f11146b;
        hVar.f11148d = m15306g(C3286g.m14149k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g = C3286g.m14145g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g != null) {
            hVar.f11147c = g;
        }
        hVar.f11149e = C3286g.m14143e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f11149e);
        gVar.f11139k = C3286g.m14148j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f11139k);
        float j = C3286g.m14148j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f11140l);
        gVar.f11140l = j;
        if (gVar.f11139k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > 0.0f) {
            gVar.f11137i = typedArray.getDimension(3, gVar.f11137i);
            float dimension = typedArray.getDimension(2, gVar.f11138j);
            gVar.f11138j = dimension;
            if (gVar.f11137i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C3286g.m14148j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f11142n = string;
                    gVar.f11144p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f11089f;
        if (drawable == null) {
            return false;
        }
        C0588a.m2759b(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo12083d(String str) {
        return this.f11091g.f11146b.f11144p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f11098n);
        if (this.f11098n.width() > 0 && this.f11098n.height() > 0) {
            ColorFilter colorFilter = this.f11093i;
            if (colorFilter == null) {
                colorFilter = this.f11092h;
            }
            canvas.getMatrix(this.f11097m);
            this.f11097m.getValues(this.f11096l);
            float abs = Math.abs(this.f11096l[0]);
            float abs2 = Math.abs(this.f11096l[4]);
            float abs3 = Math.abs(this.f11096l[1]);
            float abs4 = Math.abs(this.f11096l[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f11098n.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f11098n.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f11098n;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m15305f()) {
                    canvas.translate((float) this.f11098n.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f11098n.offsetTo(0, 0);
                this.f11091g.mo12159c(min, min2);
                if (!this.f11095k) {
                    this.f11091g.mo12167j(min, min2);
                } else if (!this.f11091g.mo12158b()) {
                    this.f11091g.mo12167j(min, min2);
                    this.f11091g.mo12166i();
                }
                this.f11091g.mo12160d(canvas, colorFilter, this.f11098n);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f11089f;
        return drawable != null ? C0588a.m2761d(drawable) : this.f11091g.f11146b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11091g.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f11089f;
        return drawable != null ? C0588a.m2762e(drawable) : this.f11093i;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f11089f != null && Build.VERSION.SDK_INT >= 24) {
            return new C3580i(this.f11089f.getConstantState());
        }
        this.f11091g.f11145a = getChangingConfigurations();
        return this.f11091g;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11091g.f11146b.f11138j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11091g.f11146b.f11137i;
    }

    public int getOpacity() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12092h(boolean z) {
        this.f11095k = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2764g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3579h hVar = this.f11091g;
        hVar.f11146b = new C3578g();
        TypedArray s = C3286g.m14157s(resources, theme, attributeSet, C3559a.f11062a);
        m15307i(s, xmlPullParser, theme);
        s.recycle();
        hVar.f11145a = getChangingConfigurations();
        hVar.f11155k = true;
        m15304e(resources, xmlPullParser, attributeSet, theme);
        this.f11092h = mo12098j(this.f11092h, hVar.f11147c, hVar.f11148d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f11089f;
        return drawable != null ? C0588a.m2765h(drawable) : this.f11091g.f11149e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f11091g.f11147c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f11091g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f11089f
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            f.t.a.a.i$h r0 = r1.f11091g
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo12163g()
            if (r0 != 0) goto L_0x0028
            f.t.a.a.i$h r0 = r1.f11091g
            android.content.res.ColorStateList r0 = r0.f11147c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p145t.p146a.p147a.C3571i.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo12098j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11094j && super.mutate() == this) {
            this.f11091g = new C3579h(this.f11091g);
            this.f11094j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C3579h hVar = this.f11091g;
        ColorStateList colorStateList = hVar.f11147c;
        if (!(colorStateList == null || (mode = hVar.f11148d) == null)) {
            this.f11092h = mo12098j(this.f11092h, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo12163g() || !hVar.mo12165h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f11091g.f11146b.getRootAlpha() != i) {
            this.f11091g.f11146b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2767j(drawable, z);
        } else {
            this.f11091g.f11149e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f11093i = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2771n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2772o(drawable, colorStateList);
            return;
        }
        C3579h hVar = this.f11091g;
        if (hVar.f11147c != colorStateList) {
            hVar.f11147c = colorStateList;
            this.f11092h = mo12098j(this.f11092h, colorStateList, hVar.f11148d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            C0588a.m2773p(drawable, mode);
            return;
        }
        C3579h hVar = this.f11091g;
        if (hVar.f11148d != mode) {
            hVar.f11148d = mode;
            this.f11092h = mo12098j(this.f11092h, hVar.f11147c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11089f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11089f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
