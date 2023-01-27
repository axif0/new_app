package com.bumptech.glide.load.p014q.p015d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.q.d.x */
public final class C1272x {

    /* renamed from: a */
    private static final Paint f4491a = new Paint(6);

    /* renamed from: b */
    private static final Paint f4492b;

    /* renamed from: c */
    private static final Set<String> f4493c;

    /* renamed from: d */
    private static final Lock f4494d;

    /* renamed from: com.bumptech.glide.load.q.d.x$a */
    private static final class C1273a implements Lock {
        C1273a() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        new Paint(7);
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f4493c = hashSet;
        f4494d = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C1273a();
        Paint paint = new Paint(7);
        f4492b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m6402a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f4494d.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f4491a);
            m6405d(canvas);
        } finally {
            f4494d.unlock();
        }
    }

    /* renamed from: b */
    public static Bitmap m6403b(C1047e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap c = eVar.mo5248c(i, i2, m6409h(bitmap));
        m6413l(bitmap, c);
        m6402a(bitmap, c, matrix);
        return c;
    }

    /* renamed from: c */
    public static Bitmap m6404c(C1047e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m6406e(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    private static void m6405d(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: e */
    public static Bitmap m6406e(C1047e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap c = eVar.mo5248c((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m6409h(bitmap));
        m6413l(bitmap, c);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + c.getWidth() + "x" + c.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m6402a(bitmap, c, matrix);
        return c;
    }

    /* renamed from: f */
    public static Lock m6407f() {
        return f4494d;
    }

    /* renamed from: g */
    public static int m6408g(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    private static Bitmap.Config m6409h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: i */
    static void m6410i(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    /* renamed from: j */
    public static boolean m6411j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: k */
    public static Bitmap m6412k(C1047e eVar, Bitmap bitmap, int i) {
        if (!m6411j(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m6410i(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap c = eVar.mo5248c(Math.round(rectF.width()), Math.round(rectF.height()), m6409h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        c.setHasAlpha(bitmap.hasAlpha());
        m6402a(bitmap, c, matrix);
        return c;
    }

    /* renamed from: l */
    public static void m6413l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
