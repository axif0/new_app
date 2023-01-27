package p148g.p189d.p190a.p200b.p217n0.p218p;

import android.net.Uri;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.n0.p.a */
public final class C4148a {

    /* renamed from: e */
    public static final C4148a f13163e = new C4148a(new long[0]);

    /* renamed from: a */
    public final int f13164a;

    /* renamed from: b */
    public final long[] f13165b;

    /* renamed from: c */
    public final C4149a[] f13166c;

    /* renamed from: d */
    public final long f13167d;

    /* renamed from: g.d.a.b.n0.p.a$a */
    public static final class C4149a {

        /* renamed from: a */
        public final int f13168a;

        /* renamed from: b */
        public final int[] f13169b;

        /* renamed from: c */
        public final long[] f13170c;

        public C4149a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private C4149a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C4260a.m18069a(iArr.length == uriArr.length);
            this.f13168a = i;
            this.f13169b = iArr;
            this.f13170c = jArr;
        }

        /* renamed from: a */
        public int mo13183a() {
            return mo13184b(-1);
        }

        /* renamed from: b */
        public int mo13184b(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f13169b;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: c */
        public boolean mo13185c() {
            return this.f13168a == -1 || mo13183a() < this.f13168a;
        }
    }

    public C4148a(long... jArr) {
        int length = jArr.length;
        this.f13164a = length;
        this.f13165b = Arrays.copyOf(jArr, length);
        this.f13166c = new C4149a[length];
        for (int i = 0; i < length; i++) {
            this.f13166c[i] = new C4149a();
        }
        this.f13167d = 0;
    }

    /* renamed from: a */
    public int mo13181a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.f13165b;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.f13166c[i].mo13185c())) {
                i++;
            }
        }
        if (i < this.f13165b.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public int mo13182b(long j) {
        int length = this.f13165b.length - 1;
        while (length >= 0) {
            long[] jArr = this.f13165b;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.f13166c[length].mo13185c()) {
            return -1;
        }
        return length;
    }
}
