package p340io.codetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p337i.p338a.p339a.C5602a;

/* renamed from: io.codetail.widget.RevealFrameLayout */
public class RevealFrameLayout extends FrameLayout implements C5602a {

    /* renamed from: f */
    private Path f16187f;

    /* renamed from: g */
    private final Rect f16188g;

    /* renamed from: h */
    private C5602a.C5606d f16189h;

    /* renamed from: i */
    private boolean f16190i;

    /* renamed from: j */
    private float f16191j;

    public RevealFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RevealFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16188g = new Rect();
        this.f16187f = new Path();
    }

    /* renamed from: a */
    public void mo16127a() {
        this.f16190i = true;
    }

    /* renamed from: b */
    public void mo16128b(C5602a.C5606d dVar) {
        dVar.mo16132a().getHitRect(this.f16188g);
        this.f16189h = dVar;
    }

    /* renamed from: c */
    public void mo16129c() {
        this.f16190i = false;
        invalidate(this.f16188g);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.f16190i || view != this.f16189h.mo16132a()) {
            return super.drawChild(canvas, view, j);
        }
        int save = canvas.save();
        this.f16187f.reset();
        Path path = this.f16187f;
        C5602a.C5606d dVar = this.f16189h;
        path.addCircle((float) dVar.f16179a, (float) dVar.f16180b, this.f16191j, Path.Direction.CW);
        canvas.clipPath(this.f16187f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public float getRevealRadius() {
        return this.f16191j;
    }

    public void setRevealRadius(float f) {
        this.f16191j = f;
        invalidate(this.f16188g);
    }
}
