package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0675u;
import androidx.lifecycle.C0710e;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C0630b implements Parcelable {
    public static final Parcelable.Creator<C0630b> CREATOR = new C0631a();

    /* renamed from: f */
    final int[] f2664f;

    /* renamed from: g */
    final ArrayList<String> f2665g;

    /* renamed from: h */
    final int[] f2666h;

    /* renamed from: i */
    final int[] f2667i;

    /* renamed from: j */
    final int f2668j;

    /* renamed from: k */
    final String f2669k;

    /* renamed from: l */
    final int f2670l;

    /* renamed from: m */
    final int f2671m;

    /* renamed from: n */
    final CharSequence f2672n;

    /* renamed from: o */
    final int f2673o;

    /* renamed from: p */
    final CharSequence f2674p;

    /* renamed from: q */
    final ArrayList<String> f2675q;

    /* renamed from: r */
    final ArrayList<String> f2676r;

    /* renamed from: s */
    final boolean f2677s;

    /* renamed from: androidx.fragment.app.b$a */
    static class C0631a implements Parcelable.Creator<C0630b> {
        C0631a() {
        }

        /* renamed from: a */
        public C0630b createFromParcel(Parcel parcel) {
            return new C0630b(parcel);
        }

        /* renamed from: b */
        public C0630b[] newArray(int i) {
            return new C0630b[i];
        }
    }

    public C0630b(Parcel parcel) {
        this.f2664f = parcel.createIntArray();
        this.f2665g = parcel.createStringArrayList();
        this.f2666h = parcel.createIntArray();
        this.f2667i = parcel.createIntArray();
        this.f2668j = parcel.readInt();
        this.f2669k = parcel.readString();
        this.f2670l = parcel.readInt();
        this.f2671m = parcel.readInt();
        this.f2672n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2673o = parcel.readInt();
        this.f2674p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2675q = parcel.createStringArrayList();
        this.f2676r = parcel.createStringArrayList();
        this.f2677s = parcel.readInt() != 0;
    }

    public C0630b(C0628a aVar) {
        int size = aVar.f2820a.size();
        this.f2664f = new int[(size * 5)];
        if (aVar.f2826g) {
            this.f2665g = new ArrayList<>(size);
            this.f2666h = new int[size];
            this.f2667i = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0675u.C0676a aVar2 = aVar.f2820a.get(i);
                int i3 = i2 + 1;
                this.f2664f[i2] = aVar2.f2837a;
                ArrayList<String> arrayList = this.f2665g;
                Fragment fragment = aVar2.f2838b;
                arrayList.add(fragment != null ? fragment.f2623j : null);
                int[] iArr = this.f2664f;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2839c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2840d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2841e;
                iArr[i6] = aVar2.f2842f;
                this.f2666h[i] = aVar2.f2843g.ordinal();
                this.f2667i[i] = aVar2.f2844h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f2668j = aVar.f2825f;
            this.f2669k = aVar.f2828i;
            this.f2670l = aVar.f2663t;
            this.f2671m = aVar.f2829j;
            this.f2672n = aVar.f2830k;
            this.f2673o = aVar.f2831l;
            this.f2674p = aVar.f2832m;
            this.f2675q = aVar.f2833n;
            this.f2676r = aVar.f2834o;
            this.f2677s = aVar.f2835p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0628a mo3277a(C0653m mVar) {
        C0628a aVar = new C0628a(mVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f2664f.length) {
            C0675u.C0676a aVar2 = new C0675u.C0676a();
            int i3 = i + 1;
            aVar2.f2837a = this.f2664f[i];
            if (C0653m.m3287p0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f2664f[i3]);
            }
            String str = this.f2665g.get(i2);
            aVar2.f2838b = str != null ? mVar.mo3423V(str) : null;
            aVar2.f2843g = C0710e.C0712b.values()[this.f2666h[i2]];
            aVar2.f2844h = C0710e.C0712b.values()[this.f2667i[i2]];
            int[] iArr = this.f2664f;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f2839c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2840d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2841e = i9;
            int i10 = iArr[i8];
            aVar2.f2842f = i10;
            aVar.f2821b = i5;
            aVar.f2822c = i7;
            aVar.f2823d = i9;
            aVar.f2824e = i10;
            aVar.mo3565f(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f2825f = this.f2668j;
        aVar.f2828i = this.f2669k;
        aVar.f2663t = this.f2670l;
        aVar.f2826g = true;
        aVar.f2829j = this.f2671m;
        aVar.f2830k = this.f2672n;
        aVar.f2831l = this.f2673o;
        aVar.f2832m = this.f2674p;
        aVar.f2833n = this.f2675q;
        aVar.f2834o = this.f2676r;
        aVar.f2835p = this.f2677s;
        aVar.mo3271u(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2664f);
        parcel.writeStringList(this.f2665g);
        parcel.writeIntArray(this.f2666h);
        parcel.writeIntArray(this.f2667i);
        parcel.writeInt(this.f2668j);
        parcel.writeString(this.f2669k);
        parcel.writeInt(this.f2670l);
        parcel.writeInt(this.f2671m);
        TextUtils.writeToParcel(this.f2672n, parcel, 0);
        parcel.writeInt(this.f2673o);
        TextUtils.writeToParcel(this.f2674p, parcel, 0);
        parcel.writeStringList(this.f2675q);
        parcel.writeStringList(this.f2676r);
        parcel.writeInt(this.f2677s ? 1 : 0);
    }
}
