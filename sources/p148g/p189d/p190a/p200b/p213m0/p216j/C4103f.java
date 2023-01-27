package p148g.p189d.p190a.p200b.p213m0.p216j;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.m0.j.f */
public final class C4103f extends C4096b {
    public static final Parcelable.Creator<C4103f> CREATOR = new C4104a();

    /* renamed from: f */
    public final List<C4106c> f12922f;

    /* renamed from: g.d.a.b.m0.j.f$a */
    static class C4104a implements Parcelable.Creator<C4103f> {
        C4104a() {
        }

        /* renamed from: a */
        public C4103f createFromParcel(Parcel parcel) {
            return new C4103f(parcel, (C4104a) null);
        }

        /* renamed from: b */
        public C4103f[] newArray(int i) {
            return new C4103f[i];
        }
    }

    /* renamed from: g.d.a.b.m0.j.f$b */
    public static final class C4105b {

        /* renamed from: a */
        public final int f12923a;

        /* renamed from: b */
        public final long f12924b;

        private C4105b(int i, long j) {
            this.f12923a = i;
            this.f12924b = j;
        }

        /* synthetic */ C4105b(int i, long j, C4104a aVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C4105b m17321c(Parcel parcel) {
            return new C4105b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m17322d(Parcel parcel) {
            parcel.writeInt(this.f12923a);
            parcel.writeLong(this.f12924b);
        }
    }

    /* renamed from: g.d.a.b.m0.j.f$c */
    public static final class C4106c {

        /* renamed from: a */
        public final long f12925a;

        /* renamed from: b */
        public final boolean f12926b;

        /* renamed from: c */
        public final boolean f12927c;

        /* renamed from: d */
        public final boolean f12928d;

        /* renamed from: e */
        public final long f12929e;

        /* renamed from: f */
        public final List<C4105b> f12930f;

        /* renamed from: g */
        public final boolean f12931g;

        /* renamed from: h */
        public final long f12932h;

        /* renamed from: i */
        public final int f12933i;

        /* renamed from: j */
        public final int f12934j;

        /* renamed from: k */
        public final int f12935k;

        private C4106c(long j, boolean z, boolean z2, boolean z3, List<C4105b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f12925a = j;
            this.f12926b = z;
            this.f12927c = z2;
            this.f12928d = z3;
            this.f12930f = Collections.unmodifiableList(list);
            this.f12929e = j2;
            this.f12931g = z4;
            this.f12932h = j3;
            this.f12933i = i;
            this.f12934j = i2;
            this.f12935k = i3;
        }

        private C4106c(Parcel parcel) {
            this.f12925a = parcel.readLong();
            boolean z = false;
            this.f12926b = parcel.readByte() == 1;
            this.f12927c = parcel.readByte() == 1;
            this.f12928d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C4105b.m17321c(parcel));
            }
            this.f12930f = Collections.unmodifiableList(arrayList);
            this.f12929e = parcel.readLong();
            this.f12931g = parcel.readByte() == 1 ? true : z;
            this.f12932h = parcel.readLong();
            this.f12933i = parcel.readInt();
            this.f12934j = parcel.readInt();
            this.f12935k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static C4106c m17326d(Parcel parcel) {
            return new C4106c(parcel);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static C4106c m17327e(C4274m mVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long z5 = mVar.mo13481z();
            boolean z6 = (mVar.mo13479x() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z6) {
                int x = mVar.mo13479x();
                boolean z7 = (x & 128) != 0;
                boolean z8 = (x & 64) != 0;
                boolean z9 = (x & 32) != 0;
                long z10 = z8 ? mVar.mo13481z() : -9223372036854775807L;
                if (!z8) {
                    int x2 = mVar.mo13479x();
                    ArrayList arrayList3 = new ArrayList(x2);
                    for (int i4 = 0; i4 < x2; i4++) {
                        arrayList3.add(new C4105b(mVar.mo13479x(), mVar.mo13481z(), (C4104a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long x3 = (long) mVar.mo13479x();
                    boolean z11 = (128 & x3) != 0;
                    j3 = ((((x3 & 1) << 32) | mVar.mo13481z()) * 1000) / 90;
                    z4 = z11;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int D = mVar.mo13448D();
                int x4 = mVar.mo13479x();
                z = z8;
                i = mVar.mo13479x();
                j = j3;
                arrayList = arrayList2;
                long j4 = z10;
                i3 = D;
                i2 = x4;
                j2 = j4;
                boolean z12 = z7;
                z2 = z4;
                z3 = z12;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            return new C4106c(z5, z6, z3, z, arrayList, j2, z2, j, i3, i2, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m17328f(Parcel parcel) {
            parcel.writeLong(this.f12925a);
            parcel.writeByte(this.f12926b ? (byte) 1 : 0);
            parcel.writeByte(this.f12927c ? (byte) 1 : 0);
            parcel.writeByte(this.f12928d ? (byte) 1 : 0);
            int size = this.f12930f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f12930f.get(i).m17322d(parcel);
            }
            parcel.writeLong(this.f12929e);
            parcel.writeByte(this.f12931g ? (byte) 1 : 0);
            parcel.writeLong(this.f12932h);
            parcel.writeInt(this.f12933i);
            parcel.writeInt(this.f12934j);
            parcel.writeInt(this.f12935k);
        }
    }

    private C4103f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C4106c.m17326d(parcel));
        }
        this.f12922f = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ C4103f(Parcel parcel, C4104a aVar) {
        this(parcel);
    }

    private C4103f(List<C4106c> list) {
        this.f12922f = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    static C4103f m17316a(C4274m mVar) {
        int x = mVar.mo13479x();
        ArrayList arrayList = new ArrayList(x);
        for (int i = 0; i < x; i++) {
            arrayList.add(C4106c.m17327e(mVar));
        }
        return new C4103f((List<C4106c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f12922f.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f12922f.get(i2).m17328f(parcel);
        }
    }
}
