package academia.bracu.com.academia.boommenu.p003h;

import academia.bracu.com.academia.boommenu.C0068l;
import academia.bracu.com.academia.boommenu.C0073q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: academia.bracu.com.academia.boommenu.h.c */
final class C0059c extends C0057a {
    public C0059c(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo286b(int i, float f) {
        Drawable n = C0073q.m303n(this, C0068l.piece, (Resources.Theme) null);
        GradientDrawable gradientDrawable = (GradientDrawable) n;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        C0073q.m315z(this, n);
    }

    public void setColor(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }

    public void setColorRes(int i) {
        setColor(C0073q.m294e(getContext(), i));
    }
}
