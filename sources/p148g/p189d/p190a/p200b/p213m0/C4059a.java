package p148g.p189d.p190a.p200b.p213m0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: g.d.a.b.m0.a */
public final class C4059a implements Parcelable {
    public static final Parcelable.Creator<C4059a> CREATOR = new C4060a();

    /* renamed from: f */
    private final C4061b[] f12844f;

    /* renamed from: g.d.a.b.m0.a$a */
    static class C4060a implements Parcelable.Creator<C4059a> {
        C4060a() {
        }

        /* renamed from: a */
        public C4059a createFromParcel(Parcel parcel) {
            return new C4059a(parcel);
        }

        /* renamed from: b */
        public C4059a[] newArray(int i) {
            return new C4059a[0];
        }
    }

    /* renamed from: g.d.a.b.m0.a$b */
    public interface C4061b extends Parcelable {
    }

    C4059a(Parcel parcel) {
        this.f12844f = new C4061b[parcel.readInt()];
        int i = 0;
        while (true) {
            C4061b[] bVarArr = this.f12844f;
            if (i < bVarArr.length) {
                bVarArr[i] = (C4061b) parcel.readParcelable(C4061b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C4059a(List<? extends C4061b> list) {
        if (list != null) {
            C4061b[] bVarArr = new C4061b[list.size()];
            this.f12844f = bVarArr;
            list.toArray(bVarArr);
            return;
        }
        this.f12844f = new C4061b[0];
    }

    public C4059a(C4061b... bVarArr) {
        this.f12844f = bVarArr == null ? new C4061b[0] : bVarArr;
    }

    /* renamed from: a */
    public C4061b mo12941a(int i) {
        return this.f12844f[i];
    }

    /* renamed from: b */
    public int mo12942b() {
        return this.f12844f.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4059a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12844f, ((C4059a) obj).f12844f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12844f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12844f.length);
        for (C4061b writeParcelable : this.f12844f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
