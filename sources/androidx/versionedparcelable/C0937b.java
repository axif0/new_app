package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import p086f.p102e.C3190a;

/* renamed from: androidx.versionedparcelable.b */
class C0937b extends C0936a {

    /* renamed from: d */
    private final SparseIntArray f3712d;

    /* renamed from: e */
    private final Parcel f3713e;

    /* renamed from: f */
    private final int f3714f;

    /* renamed from: g */
    private final int f3715g;

    /* renamed from: h */
    private final String f3716h;

    /* renamed from: i */
    private int f3717i;

    /* renamed from: j */
    private int f3718j;

    /* renamed from: k */
    private int f3719k;

    C0937b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C3190a(), new C3190a(), new C3190a());
    }

    private C0937b(Parcel parcel, int i, int i2, String str, C3190a<String, Method> aVar, C3190a<String, Method> aVar2, C3190a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3712d = new SparseIntArray();
        this.f3717i = -1;
        this.f3718j = 0;
        this.f3719k = -1;
        this.f3713e = parcel;
        this.f3714f = i;
        this.f3715g = i2;
        this.f3718j = i;
        this.f3716h = str;
    }

    /* renamed from: A */
    public void mo4890A(byte[] bArr) {
        if (bArr != null) {
            this.f3713e.writeInt(bArr.length);
            this.f3713e.writeByteArray(bArr);
            return;
        }
        this.f3713e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4892C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3713e, 0);
    }

    /* renamed from: E */
    public void mo4894E(int i) {
        this.f3713e.writeInt(i);
    }

    /* renamed from: G */
    public void mo4896G(Parcelable parcelable) {
        this.f3713e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo4898I(String str) {
        this.f3713e.writeString(str);
    }

    /* renamed from: a */
    public void mo4903a() {
        int i = this.f3717i;
        if (i >= 0) {
            int i2 = this.f3712d.get(i);
            int dataPosition = this.f3713e.dataPosition();
            this.f3713e.setDataPosition(i2);
            this.f3713e.writeInt(dataPosition - i2);
            this.f3713e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0936a mo4904b() {
        Parcel parcel = this.f3713e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3718j;
        if (i == this.f3714f) {
            i = this.f3715g;
        }
        int i2 = i;
        return new C0937b(parcel, dataPosition, i2, this.f3716h + "  ", this.f3709a, this.f3710b, this.f3711c);
    }

    /* renamed from: g */
    public boolean mo4906g() {
        return this.f3713e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo4908i() {
        int readInt = this.f3713e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3713e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo4910k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3713e);
    }

    /* renamed from: m */
    public boolean mo4912m(int i) {
        while (this.f3718j < this.f3715g) {
            int i2 = this.f3719k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f3713e.setDataPosition(this.f3718j);
            int readInt = this.f3713e.readInt();
            this.f3719k = this.f3713e.readInt();
            this.f3718j += readInt;
        }
        return this.f3719k == i;
    }

    /* renamed from: o */
    public int mo4914o() {
        return this.f3713e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo4916q() {
        return this.f3713e.readParcelable(C0937b.class.getClassLoader());
    }

    /* renamed from: s */
    public String mo4918s() {
        return this.f3713e.readString();
    }

    /* renamed from: w */
    public void mo4922w(int i) {
        mo4903a();
        this.f3717i = i;
        this.f3712d.put(i, this.f3713e.dataPosition());
        mo4894E(0);
        mo4894E(i);
    }

    /* renamed from: y */
    public void mo4924y(boolean z) {
        this.f3713e.writeInt(z ? 1 : 0);
    }
}
