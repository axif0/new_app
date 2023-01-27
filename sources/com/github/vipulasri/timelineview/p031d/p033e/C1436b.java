package com.github.vipulasri.timelineview.p031d.p033e;

import android.os.Parcel;
import android.os.Parcelable;
import p351k.C5859q;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5959j;
import p351k.p361v.p363d.C5965p;
import p351k.p364w.C5967a;

/* renamed from: com.github.vipulasri.timelineview.d.e.b */
public final class C1436b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1437a();

    /* renamed from: f */
    private C5941p<? super C1435a, ? super C1435a, C5859q> f4906f;

    /* renamed from: g */
    private int f4907g;

    /* renamed from: h */
    private int f4908h;

    /* renamed from: i */
    private boolean f4909i;

    /* renamed from: j */
    private int f4910j;

    /* renamed from: k */
    private int f4911k;

    /* renamed from: l */
    private int f4912l;

    /* renamed from: m */
    private int f4913m;

    /* renamed from: n */
    private int f4914n;

    /* renamed from: o */
    private int f4915o;

    /* renamed from: p */
    private int f4916p;

    /* renamed from: q */
    private int f4917q;

    /* renamed from: r */
    private int f4918r;

    /* renamed from: s */
    private int f4919s;

    /* renamed from: t */
    private int f4920t;

    /* renamed from: com.github.vipulasri.timelineview.d.e.b$a */
    public static class C1437a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C5956g.m24500e(parcel, "in");
            return new C1436b(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new C1436b[i];
        }
    }

    static {
        C5965p.m24522c(new C5959j(C1436b.class, "orientation", "getOrientation()Lcom/github/vipulasri/timelineview/sample/model/Orientation;", 0));
    }

    public C1436b(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f4907g = i;
        this.f4908h = i2;
        this.f4909i = z;
        this.f4910j = i3;
        this.f4911k = i4;
        this.f4912l = i5;
        this.f4913m = i6;
        this.f4914n = i7;
        this.f4915o = i8;
        this.f4916p = i9;
        this.f4917q = i10;
        this.f4918r = i11;
        this.f4919s = i12;
        this.f4920t = i13;
        C5967a aVar = C5967a.f16930a;
        C1435a aVar2 = C1435a.VERTICAL;
    }

    /* renamed from: a */
    public final int mo6015a() {
        return this.f4908h;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "TimelineAttributes(markerSize=" + this.f4907g + ", markerColor=" + this.f4908h + ", markerInCenter=" + this.f4909i + ", " + "markerTopPadding=" + this.f4911k + ", markerBottomPadding=" + this.f4913m + ", linePadding=" + this.f4914n + ", " + "lineWidth=" + this.f4915o + ", startLineColor=" + this.f4916p + ", endLineColor=" + this.f4917q + ", lineStyle=" + this.f4918r + ", " + "lineDashWidth=" + this.f4919s + ", lineDashGap=" + this.f4920t + ", onOrientationChanged=" + this.f4906f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C5956g.m24500e(parcel, "parcel");
        parcel.writeInt(this.f4907g);
        parcel.writeInt(this.f4908h);
        parcel.writeInt(this.f4909i ? 1 : 0);
        parcel.writeInt(this.f4910j);
        parcel.writeInt(this.f4911k);
        parcel.writeInt(this.f4912l);
        parcel.writeInt(this.f4913m);
        parcel.writeInt(this.f4914n);
        parcel.writeInt(this.f4915o);
        parcel.writeInt(this.f4916p);
        parcel.writeInt(this.f4917q);
        parcel.writeInt(this.f4918r);
        parcel.writeInt(this.f4919s);
        parcel.writeInt(this.f4920t);
    }
}
