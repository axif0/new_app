package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.C2776t;
import java.io.IOException;
import p385n.C6300s;

/* renamed from: com.squareup.picasso.y */
public abstract class C2793y {

    /* renamed from: com.squareup.picasso.y$a */
    public static final class C2794a {

        /* renamed from: a */
        private final C2776t.C2782e f8956a;

        /* renamed from: b */
        private final Bitmap f8957b;

        /* renamed from: c */
        private final C6300s f8958c;

        /* renamed from: d */
        private final int f8959d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C2794a(Bitmap bitmap, C2776t.C2782e eVar) {
            this(bitmap, (C6300s) null, eVar, 0);
            C2748d0.m12141d(bitmap, "bitmap == null");
        }

        C2794a(Bitmap bitmap, C6300s sVar, C2776t.C2782e eVar, int i) {
            if ((bitmap != null) != (sVar == null ? false : true)) {
                this.f8957b = bitmap;
                this.f8958c = sVar;
                C2748d0.m12141d(eVar, "loadedFrom == null");
                this.f8956a = eVar;
                this.f8959d = i;
                return;
            }
            throw new AssertionError();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C2794a(C6300s sVar, C2776t.C2782e eVar) {
            this((Bitmap) null, sVar, eVar, 0);
            C2748d0.m12141d(sVar, "source == null");
        }

        /* renamed from: a */
        public Bitmap mo10136a() {
            return this.f8957b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo10137b() {
            return this.f8959d;
        }

        /* renamed from: c */
        public C2776t.C2782e mo10138c() {
            return this.f8956a;
        }

        /* renamed from: d */
        public C6300s mo10139d() {
            return this.f8958c;
        }
    }

    /* renamed from: a */
    static void m12267a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C2789w wVar) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = (double) (((float) i3) / ((float) i));
            } else if (i == 0) {
                d = (double) (((float) i4) / ((float) i2));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = wVar.f8917l ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = (int) Math.floor(d);
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    static void m12268b(int i, int i2, BitmapFactory.Options options, C2789w wVar) {
        m12267a(i, i2, options.outWidth, options.outHeight, options, wVar);
    }

    /* renamed from: d */
    static BitmapFactory.Options m12269d(C2789w wVar) {
        boolean c = wVar.mo10120c();
        boolean z = wVar.f8924s != null;
        BitmapFactory.Options options = null;
        if (c || z || wVar.f8923r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c;
            boolean z2 = wVar.f8923r;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = wVar.f8924s;
            }
        }
        return options;
    }

    /* renamed from: g */
    static boolean m12270g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* renamed from: c */
    public abstract boolean mo10008c(C2789w wVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo10089e() {
        return 0;
    }

    /* renamed from: f */
    public abstract C2794a mo10009f(C2789w wVar, int i) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10090h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10091i() {
        return false;
    }
}
