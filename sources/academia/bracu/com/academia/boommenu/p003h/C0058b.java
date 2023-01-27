package academia.bracu.com.academia.boommenu.p003h;

import academia.bracu.com.academia.boommenu.C0068l;
import academia.bracu.com.academia.boommenu.C0073q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: academia.bracu.com.academia.boommenu.h.b */
final class C0058b extends C0057a {
    public C0058b(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo285b(int i, float f) {
        Drawable mutate = C0073q.m303n(this, f < 0.0f ? C0068l.piece_dot : C0068l.piece, (Resources.Theme) null).mutate();
        GradientDrawable gradientDrawable = (GradientDrawable) mutate;
        gradientDrawable.setColor(i);
        if (f >= 0.0f) {
            gradientDrawable.setCornerRadius(f);
        }
        C0073q.m315z(this, mutate);
    }

    public void setColor(int i) {
        ((GradientDrawable) getBackground()).setColor(i);
    }

    public void setColorRes(int i) {
        setColor(C0073q.m294e(getContext(), i));
    }
}
