package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.C2666c;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p300r.p301a.C5403f;
import p148g.p189d.p296d.p300r.p301a.C5408k;

public class ViewfinderView extends View {

    /* renamed from: r */
    protected static final int[] f8518r = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: f */
    protected final Paint f8519f = new Paint(1);

    /* renamed from: g */
    protected Bitmap f8520g;

    /* renamed from: h */
    protected final int f8521h;

    /* renamed from: i */
    protected final int f8522i;

    /* renamed from: j */
    protected final int f8523j;

    /* renamed from: k */
    protected final int f8524k;

    /* renamed from: l */
    protected int f8525l;

    /* renamed from: m */
    protected List<C5383o> f8526m;

    /* renamed from: n */
    protected List<C5383o> f8527n;

    /* renamed from: o */
    protected C2666c f8528o;

    /* renamed from: p */
    protected Rect f8529p;

    /* renamed from: q */
    protected Rect f8530q;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    class C2663a implements C2666c.C2673f {
        C2663a() {
        }

        /* renamed from: a */
        public void mo9736a() {
            ViewfinderView.this.mo9733b();
            ViewfinderView.this.invalidate();
        }

        /* renamed from: b */
        public void mo9737b(Exception exc) {
        }

        /* renamed from: c */
        public void mo9738c() {
        }

        /* renamed from: d */
        public void mo9739d() {
        }
    }

    static {
        Class<ViewfinderView> cls = ViewfinderView.class;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5408k.zxing_finder);
        this.f8521h = obtainStyledAttributes.getColor(C5408k.zxing_finder_zxing_viewfinder_mask, resources.getColor(C5403f.zxing_viewfinder_mask));
        this.f8522i = obtainStyledAttributes.getColor(C5408k.zxing_finder_zxing_result_view, resources.getColor(C5403f.zxing_result_view));
        this.f8523j = obtainStyledAttributes.getColor(C5408k.zxing_finder_zxing_viewfinder_laser, resources.getColor(C5403f.zxing_viewfinder_laser));
        this.f8524k = obtainStyledAttributes.getColor(C5408k.zxing_finder_zxing_possible_result_points, resources.getColor(C5403f.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.f8525l = 0;
        this.f8526m = new ArrayList(5);
        this.f8527n = null;
    }

    /* renamed from: a */
    public void mo9732a(C5383o oVar) {
        List<C5383o> list = this.f8526m;
        list.add(oVar);
        int size = list.size();
        if (size > 20) {
            list.subList(0, size - 10).clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9733b() {
        C2666c cVar = this.f8528o;
        if (cVar != null) {
            Rect framingRect = cVar.getFramingRect();
            Rect previewFramingRect = this.f8528o.getPreviewFramingRect();
            if (framingRect != null && previewFramingRect != null) {
                this.f8529p = framingRect;
                this.f8530q = previewFramingRect;
            }
        }
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Rect rect;
        mo9733b();
        Rect rect2 = this.f8529p;
        if (rect2 != null && (rect = this.f8530q) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.f8519f.setColor(this.f8520g != null ? this.f8522i : this.f8521h);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect2.top, this.f8519f);
            canvas.drawRect(0.0f, (float) rect2.top, (float) rect2.left, (float) (rect2.bottom + 1), this.f8519f);
            float f2 = f;
            canvas.drawRect((float) (rect2.right + 1), (float) rect2.top, f2, (float) (rect2.bottom + 1), this.f8519f);
            canvas.drawRect(0.0f, (float) (rect2.bottom + 1), f2, (float) height, this.f8519f);
            if (this.f8520g != null) {
                this.f8519f.setAlpha(160);
                canvas.drawBitmap(this.f8520g, (Rect) null, rect2, this.f8519f);
                return;
            }
            this.f8519f.setColor(this.f8523j);
            this.f8519f.setAlpha(f8518r[this.f8525l]);
            this.f8525l = (this.f8525l + 1) % f8518r.length;
            int height2 = (rect2.height() / 2) + rect2.top;
            canvas.drawRect((float) (rect2.left + 2), (float) (height2 - 1), (float) (rect2.right - 1), (float) (height2 + 2), this.f8519f);
            float width2 = ((float) rect2.width()) / ((float) rect.width());
            float height3 = ((float) rect2.height()) / ((float) rect.height());
            List<C5383o> list = this.f8526m;
            List<C5383o> list2 = this.f8527n;
            int i = rect2.left;
            int i2 = rect2.top;
            if (list.isEmpty()) {
                this.f8527n = null;
            } else {
                this.f8526m = new ArrayList(5);
                this.f8527n = list;
                this.f8519f.setAlpha(160);
                this.f8519f.setColor(this.f8524k);
                for (C5383o next : list) {
                    canvas.drawCircle((float) (((int) (next.mo15618c() * width2)) + i), (float) (((int) (next.mo15619d() * height3)) + i2), 6.0f, this.f8519f);
                }
            }
            if (list2 != null) {
                this.f8519f.setAlpha(80);
                this.f8519f.setColor(this.f8524k);
                for (C5383o next2 : list2) {
                    canvas.drawCircle((float) (((int) (next2.mo15618c() * width2)) + i), (float) (((int) (next2.mo15619d() * height3)) + i2), 3.0f, this.f8519f);
                }
            }
            postInvalidateDelayed(80, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
        }
    }

    public void setCameraPreview(C2666c cVar) {
        this.f8528o = cVar;
        cVar.mo9752i(new C2663a());
    }
}
