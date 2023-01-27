package p148g.p189d.p190a.p200b.p203j0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p148g.p189d.p190a.p200b.C3830b;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.j0.a */
public final class C3900a implements Comparator<C3902b>, Parcelable {
    public static final Parcelable.Creator<C3900a> CREATOR = new C3901a();

    /* renamed from: f */
    private final C3902b[] f11841f;

    /* renamed from: g */
    private int f11842g;

    /* renamed from: h */
    public final String f11843h;

    /* renamed from: i */
    public final int f11844i;

    /* renamed from: g.d.a.b.j0.a$a */
    static class C3901a implements Parcelable.Creator<C3900a> {
        C3901a() {
        }

        /* renamed from: a */
        public C3900a createFromParcel(Parcel parcel) {
            return new C3900a(parcel);
        }

        /* renamed from: b */
        public C3900a[] newArray(int i) {
            return new C3900a[i];
        }
    }

    /* renamed from: g.d.a.b.j0.a$b */
    public static final class C3902b implements Parcelable {
        public static final Parcelable.Creator<C3902b> CREATOR = new C3903a();

        /* renamed from: f */
        private int f11845f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final UUID f11846g;

        /* renamed from: h */
        public final String f11847h;

        /* renamed from: i */
        public final byte[] f11848i;

        /* renamed from: j */
        public final boolean f11849j;

        /* renamed from: g.d.a.b.j0.a$b$a */
        static class C3903a implements Parcelable.Creator<C3902b> {
            C3903a() {
            }

            /* renamed from: a */
            public C3902b createFromParcel(Parcel parcel) {
                return new C3902b(parcel);
            }

            /* renamed from: b */
            public C3902b[] newArray(int i) {
                return new C3902b[i];
            }
        }

        C3902b(Parcel parcel) {
            this.f11846g = new UUID(parcel.readLong(), parcel.readLong());
            this.f11847h = parcel.readString();
            this.f11848i = parcel.createByteArray();
            this.f11849j = parcel.readByte() != 0;
        }

        public C3902b(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public C3902b(UUID uuid, String str, byte[] bArr, boolean z) {
            C4260a.m18073e(uuid);
            this.f11846g = uuid;
            C4260a.m18073e(str);
            this.f11847h = str;
            this.f11848i = bArr;
            this.f11849j = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3902b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C3902b bVar = (C3902b) obj;
            return this.f11847h.equals(bVar.f11847h) && C4284w.m18236b(this.f11846g, bVar.f11846g) && Arrays.equals(this.f11848i, bVar.f11848i);
        }

        public int hashCode() {
            if (this.f11845f == 0) {
                this.f11845f = (((this.f11846g.hashCode() * 31) + this.f11847h.hashCode()) * 31) + Arrays.hashCode(this.f11848i);
            }
            return this.f11845f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11846g.getMostSignificantBits());
            parcel.writeLong(this.f11846g.getLeastSignificantBits());
            parcel.writeString(this.f11847h);
            parcel.writeByteArray(this.f11848i);
            parcel.writeByte(this.f11849j ? (byte) 1 : 0);
        }
    }

    C3900a(Parcel parcel) {
        this.f11843h = parcel.readString();
        C3902b[] bVarArr = (C3902b[]) parcel.createTypedArray(C3902b.CREATOR);
        this.f11841f = bVarArr;
        this.f11844i = bVarArr.length;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: g.d.a.b.j0.a$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3900a(java.lang.String r1, boolean r2, p148g.p189d.p190a.p200b.p203j0.C3900a.C3902b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f11843h = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            g.d.a.b.j0.a$b[] r3 = (p148g.p189d.p190a.p200b.p203j0.C3900a.C3902b[]) r3
        L_0x000e:
            java.util.Arrays.sort(r3, r0)
            r0.f11841f = r3
            int r1 = r3.length
            r0.f11844i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p203j0.C3900a.<init>(java.lang.String, boolean, g.d.a.b.j0.a$b[]):void");
    }

    public C3900a(String str, C3902b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C3900a(List<C3902b> list) {
        this((String) null, false, (C3902b[]) list.toArray(new C3902b[list.size()]));
    }

    public C3900a(C3902b... bVarArr) {
        this((String) null, bVarArr);
    }

    /* renamed from: a */
    public int compare(C3902b bVar, C3902b bVar2) {
        return C3830b.f11529b.equals(bVar.f11846g) ? C3830b.f11529b.equals(bVar2.f11846g) ? 0 : 1 : bVar.f11846g.compareTo(bVar2.f11846g);
    }

    /* renamed from: b */
    public C3900a mo12685b(String str) {
        return C4284w.m18236b(this.f11843h, str) ? this : new C3900a(str, false, this.f11841f);
    }

    /* renamed from: c */
    public C3902b mo12686c(int i) {
        return this.f11841f[i];
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3900a.class != obj.getClass()) {
            return false;
        }
        C3900a aVar = (C3900a) obj;
        return C4284w.m18236b(this.f11843h, aVar.f11843h) && Arrays.equals(this.f11841f, aVar.f11841f);
    }

    public int hashCode() {
        if (this.f11842g == 0) {
            String str = this.f11843h;
            this.f11842g = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f11841f);
        }
        return this.f11842g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11843h);
        parcel.writeTypedArray(this.f11841f, 0);
    }
}
