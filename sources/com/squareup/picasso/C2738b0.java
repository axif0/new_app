package com.squareup.picasso;

import java.io.PrintWriter;

/* renamed from: com.squareup.picasso.b0 */
public class C2738b0 {

    /* renamed from: a */
    public final int f8752a;

    /* renamed from: b */
    public final int f8753b;

    /* renamed from: c */
    public final long f8754c;

    /* renamed from: d */
    public final long f8755d;

    /* renamed from: e */
    public final long f8756e;

    /* renamed from: f */
    public final long f8757f;

    /* renamed from: g */
    public final long f8758g;

    /* renamed from: h */
    public final long f8759h;

    /* renamed from: i */
    public final long f8760i;

    /* renamed from: j */
    public final long f8761j;

    /* renamed from: k */
    public final int f8762k;

    /* renamed from: l */
    public final int f8763l;

    /* renamed from: m */
    public final int f8764m;

    /* renamed from: n */
    public final long f8765n;

    public C2738b0(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f8752a = i;
        this.f8753b = i2;
        this.f8754c = j;
        this.f8755d = j2;
        this.f8756e = j3;
        this.f8757f = j4;
        this.f8758g = j5;
        this.f8759h = j6;
        this.f8760i = j7;
        this.f8761j = j8;
        this.f8762k = i3;
        this.f8763l = i4;
        this.f8764m = i5;
        this.f8765n = j9;
    }

    /* renamed from: a */
    public void mo10010a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f8752a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f8753b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f8753b) / ((float) this.f8752a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f8754c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f8755d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f8762k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f8756e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f8759h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f8763l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f8757f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f8764m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f8758g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f8760i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f8761j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f8752a + ", size=" + this.f8753b + ", cacheHits=" + this.f8754c + ", cacheMisses=" + this.f8755d + ", downloadCount=" + this.f8762k + ", totalDownloadSize=" + this.f8756e + ", averageDownloadSize=" + this.f8759h + ", totalOriginalBitmapSize=" + this.f8757f + ", totalTransformedBitmapSize=" + this.f8758g + ", averageOriginalBitmapSize=" + this.f8760i + ", averageTransformedBitmapSize=" + this.f8761j + ", originalBitmapCount=" + this.f8763l + ", transformedBitmapCount=" + this.f8764m + ", timeStamp=" + this.f8765n + '}';
    }
}
