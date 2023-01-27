package p148g.p189d.p190a.p200b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p203j0.C3900a;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;
import p148g.p189d.p190a.p200b.p231s0.C4289b;

/* renamed from: g.d.a.b.n */
public final class C4109n implements Parcelable {
    public static final Parcelable.Creator<C4109n> CREATOR = new C4110a();

    /* renamed from: A */
    public final int f12938A;

    /* renamed from: B */
    public final long f12939B;

    /* renamed from: C */
    public final int f12940C;

    /* renamed from: D */
    public final String f12941D;

    /* renamed from: E */
    public final int f12942E;

    /* renamed from: F */
    private int f12943F;

    /* renamed from: f */
    public final String f12944f;

    /* renamed from: g */
    public final int f12945g;

    /* renamed from: h */
    public final String f12946h;

    /* renamed from: i */
    public final C4059a f12947i;

    /* renamed from: j */
    public final String f12948j;

    /* renamed from: k */
    public final String f12949k;

    /* renamed from: l */
    public final int f12950l;

    /* renamed from: m */
    public final List<byte[]> f12951m;

    /* renamed from: n */
    public final C3900a f12952n;

    /* renamed from: o */
    public final int f12953o;

    /* renamed from: p */
    public final int f12954p;

    /* renamed from: q */
    public final float f12955q;

    /* renamed from: r */
    public final int f12956r;

    /* renamed from: s */
    public final float f12957s;

    /* renamed from: t */
    public final int f12958t;

    /* renamed from: u */
    public final byte[] f12959u;

    /* renamed from: v */
    public final C4289b f12960v;

    /* renamed from: w */
    public final int f12961w;

    /* renamed from: x */
    public final int f12962x;

    /* renamed from: y */
    public final int f12963y;

    /* renamed from: z */
    public final int f12964z;

    /* renamed from: g.d.a.b.n$a */
    static class C4110a implements Parcelable.Creator<C4109n> {
        C4110a() {
        }

        /* renamed from: a */
        public C4109n createFromParcel(Parcel parcel) {
            return new C4109n(parcel);
        }

        /* renamed from: b */
        public C4109n[] newArray(int i) {
            return new C4109n[i];
        }
    }

    C4109n(Parcel parcel) {
        this.f12944f = parcel.readString();
        this.f12948j = parcel.readString();
        this.f12949k = parcel.readString();
        this.f12946h = parcel.readString();
        this.f12945g = parcel.readInt();
        this.f12950l = parcel.readInt();
        this.f12953o = parcel.readInt();
        this.f12954p = parcel.readInt();
        this.f12955q = parcel.readFloat();
        this.f12956r = parcel.readInt();
        this.f12957s = parcel.readFloat();
        this.f12959u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f12958t = parcel.readInt();
        this.f12960v = (C4289b) parcel.readParcelable(C4289b.class.getClassLoader());
        this.f12961w = parcel.readInt();
        this.f12962x = parcel.readInt();
        this.f12963y = parcel.readInt();
        this.f12964z = parcel.readInt();
        this.f12938A = parcel.readInt();
        this.f12940C = parcel.readInt();
        this.f12941D = parcel.readString();
        this.f12942E = parcel.readInt();
        this.f12939B = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12951m = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f12951m.add(parcel.createByteArray());
        }
        this.f12952n = (C3900a) parcel.readParcelable(C3900a.class.getClassLoader());
        this.f12947i = (C4059a) parcel.readParcelable(C4059a.class.getClassLoader());
    }

    C4109n(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C4289b bVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, C3900a aVar, C4059a aVar2) {
        this.f12944f = str;
        this.f12948j = str2;
        this.f12949k = str3;
        this.f12946h = str4;
        this.f12945g = i;
        this.f12950l = i2;
        this.f12953o = i3;
        this.f12954p = i4;
        this.f12955q = f;
        this.f12956r = i5;
        this.f12957s = f2;
        this.f12959u = bArr;
        this.f12958t = i6;
        this.f12960v = bVar;
        this.f12961w = i7;
        this.f12962x = i8;
        this.f12963y = i9;
        this.f12964z = i10;
        this.f12938A = i11;
        this.f12940C = i12;
        this.f12941D = str5;
        this.f12942E = i13;
        this.f12939B = j;
        this.f12951m = list == null ? Collections.emptyList() : list;
        this.f12952n = aVar;
        this.f12947i = aVar2;
    }

    @TargetApi(16)
    /* renamed from: A */
    private static void m17333A(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    @TargetApi(16)
    /* renamed from: B */
    private static void m17334B(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @TargetApi(16)
    /* renamed from: C */
    private static void m17335C(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    /* renamed from: f */
    public static C4109n m17336f(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C3900a aVar, int i8, String str4, C4059a aVar2) {
        return new C4109n(str, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C4289b) null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    /* renamed from: g */
    public static C4109n m17337g(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, C3900a aVar, int i6, String str4) {
        return m17336f(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str4, (C4059a) null);
    }

    /* renamed from: h */
    public static C4109n m17338h(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, C3900a aVar, int i5, String str4) {
        return m17337g(str, str2, str3, i, i2, i3, i4, -1, list, aVar, i5, str4);
    }

    /* renamed from: i */
    public static C4109n m17339i(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, C3900a aVar) {
        return new C4109n(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C4289b) null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, aVar, (C4059a) null);
    }

    /* renamed from: j */
    public static C4109n m17340j(String str, String str2, long j) {
        return new C4109n(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C4289b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (C3900a) null, (C4059a) null);
    }

    /* renamed from: k */
    public static C4109n m17341k(String str, String str2, String str3, int i, C3900a aVar) {
        return new C4109n(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C4289b) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, aVar, (C4059a) null);
    }

    /* renamed from: l */
    public static C4109n m17342l(String str, String str2, int i, String str3) {
        return m17343m(str, str2, i, str3, (C3900a) null);
    }

    /* renamed from: m */
    public static C4109n m17343m(String str, String str2, int i, String str3, C3900a aVar) {
        return m17345o(str, str2, (String) null, -1, i, str3, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: n */
    public static C4109n m17344n(String str, String str2, String str3, int i, int i2, String str4, int i3, C3900a aVar) {
        return m17345o(str, str2, str3, i, i2, str4, i3, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: o */
    public static C4109n m17345o(String str, String str2, String str3, int i, int i2, String str4, int i3, C3900a aVar, long j, List<byte[]> list) {
        return new C4109n(str, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (C4289b) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, aVar, (C4059a) null);
    }

    /* renamed from: p */
    public static C4109n m17346p(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, C3900a aVar) {
        return m17347s(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (C4289b) null, aVar);
    }

    /* renamed from: s */
    public static C4109n m17347s(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C4289b bVar, C3900a aVar) {
        return new C4109n(str, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, bVar, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, aVar, (C4059a) null);
    }

    @TargetApi(16)
    /* renamed from: y */
    private static void m17348y(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    @TargetApi(24)
    /* renamed from: z */
    private static void m17349z(MediaFormat mediaFormat, C4289b bVar) {
        if (bVar != null) {
            m17334B(mediaFormat, "color-transfer", bVar.f13680h);
            m17334B(mediaFormat, "color-standard", bVar.f13678f);
            m17334B(mediaFormat, "color-range", bVar.f13679g);
            m17348y(mediaFormat, "hdr-static-info", bVar.f13681i);
        }
    }

    /* renamed from: a */
    public C4109n mo13055a(C3900a aVar) {
        String str = this.f12944f;
        return new C4109n(str, this.f12948j, this.f12949k, this.f12946h, this.f12945g, this.f12950l, this.f12953o, this.f12954p, this.f12955q, this.f12956r, this.f12957s, this.f12959u, this.f12958t, this.f12960v, this.f12961w, this.f12962x, this.f12963y, this.f12964z, this.f12938A, this.f12940C, this.f12941D, this.f12942E, this.f12939B, this.f12951m, aVar, this.f12947i);
    }

    /* renamed from: b */
    public C4109n mo13056b(int i, int i2) {
        String str = this.f12944f;
        return new C4109n(str, this.f12948j, this.f12949k, this.f12946h, this.f12945g, this.f12950l, this.f12953o, this.f12954p, this.f12955q, this.f12956r, this.f12957s, this.f12959u, this.f12958t, this.f12960v, this.f12961w, this.f12962x, this.f12963y, i, i2, this.f12940C, this.f12941D, this.f12942E, this.f12939B, this.f12951m, this.f12952n, this.f12947i);
    }

    /* renamed from: c */
    public C4109n mo13057c(int i) {
        String str = this.f12944f;
        return new C4109n(str, this.f12948j, this.f12949k, this.f12946h, this.f12945g, i, this.f12953o, this.f12954p, this.f12955q, this.f12956r, this.f12957s, this.f12959u, this.f12958t, this.f12960v, this.f12961w, this.f12962x, this.f12963y, this.f12964z, this.f12938A, this.f12940C, this.f12941D, this.f12942E, this.f12939B, this.f12951m, this.f12952n, this.f12947i);
    }

    /* renamed from: d */
    public C4109n mo13058d(C4059a aVar) {
        String str = this.f12944f;
        return new C4109n(str, this.f12948j, this.f12949k, this.f12946h, this.f12945g, this.f12950l, this.f12953o, this.f12954p, this.f12955q, this.f12956r, this.f12957s, this.f12959u, this.f12958t, this.f12960v, this.f12961w, this.f12962x, this.f12963y, this.f12964z, this.f12938A, this.f12940C, this.f12941D, this.f12942E, this.f12939B, this.f12951m, this.f12952n, aVar);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C4109n mo13060e(long j) {
        return new C4109n(this.f12944f, this.f12948j, this.f12949k, this.f12946h, this.f12945g, this.f12950l, this.f12953o, this.f12954p, this.f12955q, this.f12956r, this.f12957s, this.f12959u, this.f12958t, this.f12960v, this.f12961w, this.f12962x, this.f12963y, this.f12964z, this.f12938A, this.f12940C, this.f12941D, this.f12942E, j, this.f12951m, this.f12952n, this.f12947i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4109n.class == obj.getClass()) {
            C4109n nVar = (C4109n) obj;
            if (this.f12945g == nVar.f12945g && this.f12950l == nVar.f12950l && this.f12953o == nVar.f12953o && this.f12954p == nVar.f12954p && this.f12955q == nVar.f12955q && this.f12956r == nVar.f12956r && this.f12957s == nVar.f12957s && this.f12958t == nVar.f12958t && this.f12961w == nVar.f12961w && this.f12962x == nVar.f12962x && this.f12963y == nVar.f12963y && this.f12964z == nVar.f12964z && this.f12938A == nVar.f12938A && this.f12939B == nVar.f12939B && this.f12940C == nVar.f12940C && C4284w.m18236b(this.f12944f, nVar.f12944f) && C4284w.m18236b(this.f12941D, nVar.f12941D) && this.f12942E == nVar.f12942E && C4284w.m18236b(this.f12948j, nVar.f12948j) && C4284w.m18236b(this.f12949k, nVar.f12949k) && C4284w.m18236b(this.f12946h, nVar.f12946h) && C4284w.m18236b(this.f12952n, nVar.f12952n) && C4284w.m18236b(this.f12947i, nVar.f12947i) && C4284w.m18236b(this.f12960v, nVar.f12960v) && Arrays.equals(this.f12959u, nVar.f12959u) && this.f12951m.size() == nVar.f12951m.size()) {
                for (int i = 0; i < this.f12951m.size(); i++) {
                    if (!Arrays.equals(this.f12951m.get(i), nVar.f12951m.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f12943F == 0) {
            String str = this.f12944f;
            int i = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12948j;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f12949k;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f12946h;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f12945g) * 31) + this.f12953o) * 31) + this.f12954p) * 31) + this.f12961w) * 31) + this.f12962x) * 31;
            String str5 = this.f12941D;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f12942E) * 31;
            C3900a aVar = this.f12952n;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C4059a aVar2 = this.f12947i;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            this.f12943F = hashCode6 + i;
        }
        return this.f12943F;
    }

    public String toString() {
        return "Format(" + this.f12944f + ", " + this.f12948j + ", " + this.f12949k + ", " + this.f12945g + ", " + this.f12941D + ", [" + this.f12953o + ", " + this.f12954p + ", " + this.f12955q + "], [" + this.f12961w + ", " + this.f12962x + "])";
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: v */
    public final MediaFormat mo13064v() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f12949k);
        m17335C(mediaFormat, "language", this.f12941D);
        m17334B(mediaFormat, "max-input-size", this.f12950l);
        m17334B(mediaFormat, "width", this.f12953o);
        m17334B(mediaFormat, "height", this.f12954p);
        m17333A(mediaFormat, "frame-rate", this.f12955q);
        m17334B(mediaFormat, "rotation-degrees", this.f12956r);
        m17334B(mediaFormat, "channel-count", this.f12961w);
        m17334B(mediaFormat, "sample-rate", this.f12962x);
        for (int i = 0; i < this.f12951m.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(this.f12951m.get(i)));
        }
        m17349z(mediaFormat, this.f12960v);
        return mediaFormat;
    }

    /* renamed from: w */
    public int mo13065w() {
        int i;
        int i2 = this.f12953o;
        if (i2 == -1 || (i = this.f12954p) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12944f);
        parcel.writeString(this.f12948j);
        parcel.writeString(this.f12949k);
        parcel.writeString(this.f12946h);
        parcel.writeInt(this.f12945g);
        parcel.writeInt(this.f12950l);
        parcel.writeInt(this.f12953o);
        parcel.writeInt(this.f12954p);
        parcel.writeFloat(this.f12955q);
        parcel.writeInt(this.f12956r);
        parcel.writeFloat(this.f12957s);
        parcel.writeInt(this.f12959u != null ? 1 : 0);
        byte[] bArr = this.f12959u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f12958t);
        parcel.writeParcelable(this.f12960v, i);
        parcel.writeInt(this.f12961w);
        parcel.writeInt(this.f12962x);
        parcel.writeInt(this.f12963y);
        parcel.writeInt(this.f12964z);
        parcel.writeInt(this.f12938A);
        parcel.writeInt(this.f12940C);
        parcel.writeString(this.f12941D);
        parcel.writeInt(this.f12942E);
        parcel.writeLong(this.f12939B);
        int size = this.f12951m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f12951m.get(i2));
        }
        parcel.writeParcelable(this.f12952n, 0);
        parcel.writeParcelable(this.f12947i, 0);
    }
}
