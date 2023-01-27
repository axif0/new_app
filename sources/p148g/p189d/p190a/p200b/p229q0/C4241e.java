package p148g.p189d.p190a.p200b.p229q0;

import android.net.Uri;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.q0.e */
public final class C4241e {

    /* renamed from: a */
    public final Uri f13539a;

    /* renamed from: b */
    public final byte[] f13540b;

    /* renamed from: c */
    public final long f13541c;

    /* renamed from: d */
    public final long f13542d;

    /* renamed from: e */
    public final long f13543e;

    /* renamed from: f */
    public final String f13544f;

    /* renamed from: g */
    public final int f13545g;

    public C4241e(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public C4241e(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C4241e(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C4260a.m18069a(j >= 0);
        C4260a.m18069a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C4260a.m18069a(z);
        this.f13539a = uri;
        this.f13540b = bArr;
        this.f13541c = j;
        this.f13542d = j2;
        this.f13543e = j3;
        this.f13544f = str;
        this.f13545g = i;
    }

    /* renamed from: a */
    public boolean mo13374a(int i) {
        return (this.f13545g & i) == i;
    }

    public String toString() {
        return "DataSpec[" + this.f13539a + ", " + Arrays.toString(this.f13540b) + ", " + this.f13541c + ", " + this.f13542d + ", " + this.f13543e + ", " + this.f13544f + ", " + this.f13545g + "]";
    }
}
