package p148g.p189d.p190a.p200b.p213m0.p216j;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.m0.j.d */
public final class C4098d extends C4096b {
    public static final Parcelable.Creator<C4098d> CREATOR = new C4099a();

    /* renamed from: f */
    public final long f12906f;

    /* renamed from: g */
    public final boolean f12907g;

    /* renamed from: h */
    public final boolean f12908h;

    /* renamed from: i */
    public final boolean f12909i;

    /* renamed from: j */
    public final boolean f12910j;

    /* renamed from: k */
    public final long f12911k;

    /* renamed from: l */
    public final long f12912l;

    /* renamed from: m */
    public final List<C4100b> f12913m;

    /* renamed from: n */
    public final boolean f12914n;

    /* renamed from: o */
    public final long f12915o;

    /* renamed from: p */
    public final int f12916p;

    /* renamed from: q */
    public final int f12917q;

    /* renamed from: r */
    public final int f12918r;

    /* renamed from: g.d.a.b.m0.j.d$a */
    static class C4099a implements Parcelable.Creator<C4098d> {
        C4099a() {
        }

        /* renamed from: a */
        public C4098d createFromParcel(Parcel parcel) {
            return new C4098d(parcel, (C4099a) null);
        }

        /* renamed from: b */
        public C4098d[] newArray(int i) {
            return new C4098d[i];
        }
    }

    /* renamed from: g.d.a.b.m0.j.d$b */
    public static final class C4100b {

        /* renamed from: a */
        public final int f12919a;

        /* renamed from: b */
        public final long f12920b;

        /* renamed from: c */
        public final long f12921c;

        private C4100b(int i, long j, long j2) {
            this.f12919a = i;
            this.f12920b = j;
            this.f12921c = j2;
        }

        /* synthetic */ C4100b(int i, long j, long j2, C4099a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C4100b m17312a(Parcel parcel) {
            return new C4100b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void mo13039b(Parcel parcel) {
            parcel.writeInt(this.f12919a);
            parcel.writeLong(this.f12920b);
            parcel.writeLong(this.f12921c);
        }
    }

    private C4098d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C4100b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f12906f = j;
        this.f12907g = z;
        this.f12908h = z2;
        this.f12909i = z3;
        this.f12910j = z4;
        this.f12911k = j2;
        this.f12912l = j3;
        this.f12913m = Collections.unmodifiableList(list);
        this.f12914n = z5;
        this.f12915o = j4;
        this.f12916p = i;
        this.f12917q = i2;
        this.f12918r = i3;
    }

    private C4098d(Parcel parcel) {
        this.f12906f = parcel.readLong();
        boolean z = false;
        this.f12907g = parcel.readByte() == 1;
        this.f12908h = parcel.readByte() == 1;
        this.f12909i = parcel.readByte() == 1;
        this.f12910j = parcel.readByte() == 1;
        this.f12911k = parcel.readLong();
        this.f12912l = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C4100b.m17312a(parcel));
        }
        this.f12913m = Collections.unmodifiableList(arrayList);
        this.f12914n = parcel.readByte() == 1 ? true : z;
        this.f12915o = parcel.readLong();
        this.f12916p = parcel.readInt();
        this.f12917q = parcel.readInt();
        this.f12918r = parcel.readInt();
    }

    /* synthetic */ C4098d(Parcel parcel, C4099a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C4098d m17309a(C4274m mVar, long j, C4282u uVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        C4282u uVar2 = uVar;
        long z6 = mVar.mo13481z();
        boolean z7 = (mVar.mo13479x() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z7) {
            int x = mVar.mo13479x();
            boolean z8 = (x & 128) != 0;
            boolean z9 = (x & 64) != 0;
            boolean z10 = (x & 32) != 0;
            boolean z11 = (x & 16) != 0;
            long b = (!z9 || z11) ? -9223372036854775807L : C4107g.m17330b(mVar, j);
            if (!z9) {
                int x2 = mVar.mo13479x();
                ArrayList arrayList = new ArrayList(x2);
                for (int i4 = 0; i4 < x2; i4++) {
                    int x3 = mVar.mo13479x();
                    long b2 = !z11 ? C4107g.m17330b(mVar, j) : -9223372036854775807L;
                    arrayList.add(new C4100b(x3, b2, uVar2.mo13498b(b2), (C4099a) null));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long x4 = (long) mVar.mo13479x();
                boolean z12 = (128 & x4) != 0;
                j4 = ((((x4 & 1) << 32) | mVar.mo13481z()) * 1000) / 90;
                z5 = z12;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = mVar.mo13448D();
            z = z9;
            i2 = mVar.mo13479x();
            i = mVar.mo13479x();
            list = emptyList;
            long j5 = b;
            z2 = z5;
            j2 = j4;
            z3 = z11;
            z4 = z8;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new C4098d(z6, z7, z4, z, z3, j3, uVar2.mo13498b(j3), list, z2, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12906f);
        parcel.writeByte(this.f12907g ? (byte) 1 : 0);
        parcel.writeByte(this.f12908h ? (byte) 1 : 0);
        parcel.writeByte(this.f12909i ? (byte) 1 : 0);
        parcel.writeByte(this.f12910j ? (byte) 1 : 0);
        parcel.writeLong(this.f12911k);
        parcel.writeLong(this.f12912l);
        int size = this.f12913m.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f12913m.get(i2).mo13039b(parcel);
        }
        parcel.writeByte(this.f12914n ? (byte) 1 : 0);
        parcel.writeLong(this.f12915o);
        parcel.writeInt(this.f12916p);
        parcel.writeInt(this.f12917q);
        parcel.writeInt(this.f12918r);
    }
}
