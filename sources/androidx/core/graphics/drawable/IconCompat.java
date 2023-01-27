package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    static final PorterDuff.Mode f2432j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2433a = -1;

    /* renamed from: b */
    Object f2434b;

    /* renamed from: c */
    public byte[] f2435c = null;

    /* renamed from: d */
    public Parcelable f2436d = null;

    /* renamed from: e */
    public int f2437e = 0;

    /* renamed from: f */
    public int f2438f = 0;

    /* renamed from: g */
    public ColorStateList f2439g = null;

    /* renamed from: h */
    PorterDuff.Mode f2440h = f2432j;

    /* renamed from: i */
    public String f2441i = null;

    public IconCompat() {
    }

    private IconCompat(int i) {
        this.f2433a = i;
    }

    /* renamed from: a */
    static Bitmap m2742a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m2743b(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2437e = i;
            if (resources != null) {
                try {
                    iconCompat.f2434b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2434b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: d */
    private static int m2744d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: f */
    private static String m2745f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: h */
    private static int m2746h(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    /* renamed from: j */
    private static Uri m2747j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: k */
    private InputStream m2748k(Context context) {
        String str;
        StringBuilder sb;
        Uri i = mo2881i();
        String scheme = i.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(i);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(i);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2434b));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(i);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    /* renamed from: p */
    private static String m2749p(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public int mo2878c() {
        if (this.f2433a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2744d((Icon) this.f2434b);
        }
        if (this.f2433a == 2) {
            return this.f2437e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: e */
    public String mo2879e() {
        if (this.f2433a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2745f((Icon) this.f2434b);
        }
        if (this.f2433a == 2) {
            return ((String) this.f2434b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: g */
    public int mo2880g() {
        return (this.f2433a != -1 || Build.VERSION.SDK_INT < 23) ? this.f2433a : m2746h((Icon) this.f2434b);
    }

    /* renamed from: i */
    public Uri mo2881i() {
        if (this.f2433a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2747j((Icon) this.f2434b);
        }
        int i = this.f2433a;
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2434b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: l */
    public void mo2882l() {
        Parcelable parcelable;
        this.f2440h = PorterDuff.Mode.valueOf(this.f2441i);
        switch (this.f2433a) {
            case -1:
                parcelable = this.f2436d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f2436d;
                if (parcelable == null) {
                    byte[] bArr = this.f2435c;
                    this.f2434b = bArr;
                    this.f2433a = 3;
                    this.f2437e = 0;
                    this.f2438f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f2434b = new String(this.f2435c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2434b = this.f2435c;
                return;
            default:
                return;
        }
        this.f2434b = parcelable;
    }

    /* renamed from: m */
    public void mo2883m(boolean z) {
        this.f2441i = this.f2440h.name();
        switch (this.f2433a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2434b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2435c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2435c = ((String) this.f2434b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2435c = (byte[]) this.f2434b;
                return;
            case 4:
            case 6:
                this.f2435c = this.f2434b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f2436d = (Parcelable) this.f2434b;
    }

    @Deprecated
    /* renamed from: n */
    public Icon mo2884n() {
        return mo2885o((Context) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        r4 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r4 = m2742a(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        r4 = android.graphics.drawable.Icon.createWithBitmap(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r0 = r3.f2439g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (r0 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r4.setTintList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r0 = r3.f2440h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if (r0 == f2432j) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r4.setTintMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 >= 26) goto L_0x005f;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo2885o(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = r3.f2433a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x00a7;
                case 0: goto L_0x0008;
                case 1: goto L_0x008e;
                case 2: goto L_0x0083;
                case 3: goto L_0x0076;
                case 4: goto L_0x006d;
                case 5: goto L_0x0057;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r4.<init>(r0)
            throw r4
        L_0x0010:
            if (r4 == 0) goto L_0x003c
            java.io.InputStream r4 = r3.m2748k(r4)
            if (r4 == 0) goto L_0x0021
            int r0 = android.os.Build.VERSION.SDK_INT
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)
            if (r0 < r2) goto L_0x0068
            goto L_0x005f
        L_0x0021:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r3.mo2881i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x003c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r3.mo2881i()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x0057:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L_0x0064
            java.lang.Object r4 = r3.f2434b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L_0x005f:
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r4)
            goto L_0x0096
        L_0x0064:
            java.lang.Object r4 = r3.f2434b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L_0x0068:
            android.graphics.Bitmap r4 = m2742a(r4, r1)
            goto L_0x0092
        L_0x006d:
            java.lang.Object r4 = r3.f2434b
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithContentUri(r4)
            goto L_0x0096
        L_0x0076:
            java.lang.Object r4 = r3.f2434b
            byte[] r4 = (byte[]) r4
            int r0 = r3.f2437e
            int r1 = r3.f2438f
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithData(r4, r0, r1)
            goto L_0x0096
        L_0x0083:
            java.lang.String r4 = r3.mo2879e()
            int r0 = r3.f2437e
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r4, r0)
            goto L_0x0096
        L_0x008e:
            java.lang.Object r4 = r3.f2434b
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L_0x0092:
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithBitmap(r4)
        L_0x0096:
            android.content.res.ColorStateList r0 = r3.f2439g
            if (r0 == 0) goto L_0x009d
            r4.setTintList(r0)
        L_0x009d:
            android.graphics.PorterDuff$Mode r0 = r3.f2440h
            android.graphics.PorterDuff$Mode r1 = f2432j
            if (r0 == r1) goto L_0x00a6
            r4.setTintMode(r0)
        L_0x00a6:
            return r4
        L_0x00a7:
            java.lang.Object r4 = r3.f2434b
            android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo2885o(android.content.Context):android.graphics.drawable.Icon");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f2433a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f2434b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f2433a
            java.lang.String r1 = m2749p(r1)
            r0.append(r1)
            int r1 = r4.f2433a
            switch(r1) {
                case 1: goto L_0x006c;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006c;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008c
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f2434b
            r0.append(r1)
            goto L_0x008c
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f2437e
            r0.append(r1)
            int r1 = r4.f2438f
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f2438f
            goto L_0x0089
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo2879e()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo2878c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008c
        L_0x006c:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f2434b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f2434b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0089:
            r0.append(r1)
        L_0x008c:
            android.content.res.ColorStateList r1 = r4.f2439g
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f2439g
            r0.append(r1)
        L_0x009a:
            android.graphics.PorterDuff$Mode r1 = r4.f2440h
            android.graphics.PorterDuff$Mode r2 = f2432j
            if (r1 == r2) goto L_0x00aa
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f2440h
            r0.append(r1)
        L_0x00aa:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
