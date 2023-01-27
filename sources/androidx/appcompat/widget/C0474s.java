package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p086f.p087a.C3123a;

/* renamed from: androidx.appcompat.widget.s */
public class C0474s extends RatingBar {

    /* renamed from: f */
    private final C0470q f1850f;

    public C0474s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.ratingBarStyle);
    }

    public C0474s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0470q qVar = new C0470q(this);
        this.f1850f = qVar;
        qVar.mo2320c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1850f.mo2319b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
