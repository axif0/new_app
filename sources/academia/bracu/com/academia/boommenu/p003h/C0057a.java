package academia.bracu.com.academia.boommenu.p003h;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: academia.bracu.com.academia.boommenu.h.a */
public abstract class C0057a extends View {

    /* renamed from: f */
    private boolean f351f = false;

    public C0057a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo280a(RectF rectF) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = (int) rectF.left;
            layoutParams.topMargin = (int) rectF.top;
            layoutParams.width = (int) rectF.right;
            layoutParams.height = (int) rectF.bottom;
            setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f351f = false;
    }

    public void requestLayout() {
        if (!this.f351f) {
            this.f351f = true;
            super.requestLayout();
        }
    }

    public abstract void setColor(int i);

    public abstract void setColorRes(int i);
}
