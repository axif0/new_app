package p048d.p049a.p050a.p051a.p078s;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import p086f.p145t.p146a.p147a.C3571i;

/* renamed from: d.a.a.a.s.p */
public class C3106p {
    /* renamed from: a */
    private static Drawable m13342a(Context context, int i) {
        return C3571i.m15302b(context.getResources(), i, context.getTheme());
    }

    /* renamed from: b */
    public static Drawable m13343b(Context context, int i, int i2) {
        Drawable a = m13342a(context, i);
        a.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        return a;
    }
}
