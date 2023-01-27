package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: U */
    protected boolean f3106U;

    /* renamed from: V */
    private CharSequence f3107V;

    /* renamed from: W */
    private CharSequence f3108W;

    /* renamed from: X */
    private boolean f3109X;

    /* renamed from: Y */
    private boolean f3110Y;

    /* renamed from: androidx.preference.TwoStatePreference$a */
    static class C0775a extends Preference.C0759b {
        public static final Parcelable.Creator<C0775a> CREATOR = new C0776a();

        /* renamed from: f */
        boolean f3111f;

        /* renamed from: androidx.preference.TwoStatePreference$a$a */
        static class C0776a implements Parcelable.Creator<C0775a> {
            C0776a() {
            }

            /* renamed from: a */
            public C0775a createFromParcel(Parcel parcel) {
                return new C0775a(parcel);
            }

            /* renamed from: b */
            public C0775a[] newArray(int i) {
                return new C0775a[i];
            }
        }

        C0775a(Parcel parcel) {
            super(parcel);
            this.f3111f = parcel.readInt() != 1 ? false : true;
        }

        C0775a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3111f ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: E0 */
    public boolean mo3751E0() {
        return (this.f3110Y ? this.f3106U : !this.f3106U) || super.mo3751E0();
    }

    /* renamed from: J0 */
    public boolean mo3903J0() {
        return this.f3106U;
    }

    /* renamed from: K0 */
    public void mo3904K0(boolean z) {
        boolean z2 = this.f3106U != z;
        if (z2 || !this.f3109X) {
            this.f3106U = z;
            this.f3109X = true;
            mo3825j0(z);
            if (z2) {
                mo3808R(mo3751E0());
                mo3746Q();
            }
        }
    }

    /* renamed from: L0 */
    public void mo3905L0(boolean z) {
        this.f3110Y = z;
    }

    /* renamed from: M0 */
    public void mo3906M0(CharSequence charSequence) {
        this.f3108W = charSequence;
        if (!mo3903J0()) {
            mo3746Q();
        }
    }

    /* renamed from: N0 */
    public void mo3907N0(CharSequence charSequence) {
        this.f3107V = charSequence;
        if (mo3903J0()) {
            mo3746Q();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3908O0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f3106U
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f3107V
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f3107V
        L_0x0017:
            r5.setText(r0)
            r0 = 0
            goto L_0x002b
        L_0x001c:
            boolean r1 = r4.f3106U
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r1 = r4.f3108W
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r0 = r4.f3108W
            goto L_0x0017
        L_0x002b:
            if (r0 == 0) goto L_0x003b
            java.lang.CharSequence r1 = r4.mo3768F()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003b
            r5.setText(r1)
            r0 = 0
        L_0x003b:
            r1 = 8
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 8
        L_0x0042:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004b
            r5.setVisibility(r2)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo3908O0(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo3909P0(C0805l lVar) {
        mo3908O0(lVar.mo4005M(16908304));
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo3744X() {
        super.mo3744X();
        boolean z = !mo3903J0();
        if (mo3819g(Boolean.valueOf(z))) {
            mo3904K0(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Object mo3755a0(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C0775a.class)) {
            super.mo3756d0(parcelable);
            return;
        }
        C0775a aVar = (C0775a) parcelable;
        super.mo3756d0(aVar.getSuperState());
        mo3904K0(aVar.f3111f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        Parcelable e0 = super.mo3757e0();
        if (mo3805N()) {
            return e0;
        }
        C0775a aVar = new C0775a(e0);
        aVar.f3111f = mo3903J0();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3758f0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        mo3904K0(mo3850y(((Boolean) obj).booleanValue()));
    }
}
