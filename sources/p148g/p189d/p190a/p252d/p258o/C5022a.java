package p148g.p189d.p190a.p252d.p258o;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: g.d.a.d.o.a */
public class C5022a {
    /* renamed from: a */
    public static int m21278a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
