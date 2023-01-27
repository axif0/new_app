package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import p148g.p189d.p296d.C5378j;

/* renamed from: com.journeyapps.barcodescanner.m */
public class C2693m {

    /* renamed from: a */
    private byte[] f8614a;

    /* renamed from: b */
    private int f8615b;

    /* renamed from: c */
    private int f8616c;

    /* renamed from: d */
    private int f8617d;

    /* renamed from: e */
    private int f8618e;

    /* renamed from: f */
    private Rect f8619f;

    public C2693m(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f8614a = bArr;
        this.f8615b = i;
        this.f8616c = i2;
        this.f8618e = i4;
        this.f8617d = i3;
        if (i * i2 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i + "x" + i2 + " > " + bArr.length);
        }
    }

    /* renamed from: c */
    private Bitmap m11975c(Rect rect, int i) {
        if (mo9824d()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f8614a, this.f8617d, this.f8615b, this.f8616c, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f8618e == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f8618e);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: e */
    public static byte[] m11976e(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m11977f(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m11978g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: h */
    public static byte[] m11979h(int i, byte[] bArr, int i2, int i3) {
        return i != 90 ? i != 180 ? i != 270 ? bArr : m11977f(bArr, i2, i3) : m11976e(bArr, i2, i3) : m11978g(bArr, i2, i3);
    }

    /* renamed from: a */
    public C5378j mo9822a() {
        byte[] h = m11979h(this.f8618e, this.f8614a, this.f8615b, this.f8616c);
        if (mo9824d()) {
            int i = this.f8616c;
            int i2 = this.f8615b;
            Rect rect = this.f8619f;
            return new C5378j(h, i, i2, rect.left, rect.top, rect.width(), this.f8619f.height(), false);
        }
        int i3 = this.f8615b;
        int i4 = this.f8616c;
        Rect rect2 = this.f8619f;
        return new C5378j(h, i3, i4, rect2.left, rect2.top, rect2.width(), this.f8619f.height(), false);
    }

    /* renamed from: b */
    public Bitmap mo9823b(int i) {
        return m11975c(this.f8619f, i);
    }

    /* renamed from: d */
    public boolean mo9824d() {
        return this.f8618e % 180 != 0;
    }

    /* renamed from: i */
    public void mo9825i(Rect rect) {
        this.f8619f = rect;
    }
}
