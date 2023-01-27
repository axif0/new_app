package p048d.p049a.p050a.p051a.p078s;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: d.a.a.a.s.m */
public class C3100m extends RecyclerView.C0842n {

    /* renamed from: a */
    private final Drawable f9875a;

    public C3100m(Drawable drawable) {
        this.f9875a = drawable;
    }

    /* renamed from: i */
    public void mo3952i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0823a0 a0Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.C0848p) childAt.getLayoutParams()).bottomMargin;
            this.f9875a.setBounds(paddingLeft, bottom, width, this.f9875a.getIntrinsicHeight() + bottom);
            this.f9875a.draw(canvas);
        }
    }
}
