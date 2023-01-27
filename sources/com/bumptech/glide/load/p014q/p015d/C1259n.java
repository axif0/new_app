package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p008o.p009a0.C1048f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.q.d.n */
final class C1259n {

    /* renamed from: a */
    private static final C1047e f4465a = new C1260a();

    /* renamed from: com.bumptech.glide.load.q.d.n$a */
    class C1260a extends C1048f {
        C1260a() {
        }

        /* renamed from: d */
        public void mo5249d(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static C1141v<Bitmap> m6361a(C1047e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m6362b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f4465a;
        }
        return C1239e.m6273f(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m6362b(C1047e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock f = C1272x.m6407f();
            f.lock();
            Bitmap c = eVar.mo5248c(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(c);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return c;
            } finally {
                f.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
