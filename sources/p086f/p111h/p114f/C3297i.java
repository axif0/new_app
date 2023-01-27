package p086f.p111h.p114f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p119j.C3312b;

/* renamed from: f.h.f.i */
public class C3297i extends C3298j {
    /* renamed from: b */
    public Typeface mo11449b(Context context, C3271c.C3273b bVar, Resources resources, int i) {
        C3271c.C3274c[] a = bVar.mo11430a();
        int length = a.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            C3271c.C3274c cVar = a[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.mo11432b()).setWeight(cVar.mo11435e());
                if (!cVar.mo11436f()) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(cVar.mo11433c()).setFontVariationSettings(cVar.mo11434d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    /* renamed from: c */
    public Typeface mo11450c(Context context, CancellationSignal cancellationSignal, C3312b.C3318f[] fVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 < length) {
                C3312b.C3318f fVar = fVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fVar.mo11490c(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fVar.mo11491d());
                        if (!fVar.mo11492e()) {
                            i4 = 0;
                        }
                        Font build = weight.setSlant(i4).setTtcIndex(fVar.mo11489b()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                            i3++;
                        }
                    } else if (openFileDescriptor == null) {
                        i3++;
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    break;
                }
                i3++;
            } else if (builder == null) {
                return null;
            } else {
                int i5 = (i & 1) != 0 ? 700 : 400;
                if ((i & 2) != 0) {
                    i2 = 1;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
            }
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo11460d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: e */
    public Typeface mo11452e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C3312b.C3318f mo11461h(C3312b.C3318f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
