package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.h */
public class C0541h extends View {
    public C0541h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0521b bVar = (ConstraintLayout.C0521b) getLayoutParams();
        bVar.f2061a = i;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0521b bVar = (ConstraintLayout.C0521b) getLayoutParams();
        bVar.f2063b = i;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0521b bVar = (ConstraintLayout.C0521b) getLayoutParams();
        bVar.f2065c = f;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i) {
    }
}
