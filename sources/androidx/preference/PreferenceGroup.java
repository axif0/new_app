package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p086f.p102e.C3203g;
import p086f.p111h.p112e.p113c.C3286g;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: U */
    final C3203g<String, Long> f3072U;

    /* renamed from: V */
    private List<Preference> f3073V;

    /* renamed from: W */
    private boolean f3074W;

    /* renamed from: X */
    private int f3075X;

    /* renamed from: Y */
    private boolean f3076Y;

    /* renamed from: Z */
    private int f3077Z;

    /* renamed from: a0 */
    private C0766a f3078a0;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    public interface C0766a {
        /* renamed from: a */
        void mo3876a();
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    static class C0767b extends Preference.C0759b {
        public static final Parcelable.Creator<C0767b> CREATOR = new C0768a();

        /* renamed from: f */
        int f3079f;

        /* renamed from: androidx.preference.PreferenceGroup$b$a */
        static class C0768a implements Parcelable.Creator<C0767b> {
            C0768a() {
            }

            /* renamed from: a */
            public C0767b createFromParcel(Parcel parcel) {
                return new C0767b(parcel);
            }

            /* renamed from: b */
            public C0767b[] newArray(int i) {
                return new C0767b[i];
            }
        }

        C0767b(Parcel parcel) {
            super(parcel);
            this.f3079f = parcel.readInt();
        }

        C0767b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f3079f = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3079f);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3072U = new C3203g<>();
        new Handler();
        this.f3074W = true;
        this.f3075X = 0;
        this.f3076Y = false;
        this.f3077Z = Integer.MAX_VALUE;
        this.f3078a0 = null;
        this.f3073V = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.PreferenceGroup, i, i2);
        int i3 = C0813t.PreferenceGroup_orderingFromXml;
        this.f3074W = C3286g.m14140b(obtainStyledAttributes, i3, i3, true);
        if (obtainStyledAttributes.hasValue(C0813t.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = C0813t.PreferenceGroup_initialExpandedChildrenCount;
            mo3873S0(C3286g.m14142d(obtainStyledAttributes, i4, i4, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J0 */
    public void mo3864J0(Preference preference) {
        mo3865K0(preference);
    }

    /* renamed from: K0 */
    public boolean mo3865K0(Preference preference) {
        long j;
        if (this.f3073V.contains(preference)) {
            return true;
        }
        if (preference.mo3842u() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.mo3848x() != null) {
                preferenceGroup = preferenceGroup.mo3848x();
            }
            String u = preference.mo3842u();
            if (preferenceGroup.mo3866L0(u) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + u + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.mo3846w() == Integer.MAX_VALUE) {
            if (this.f3074W) {
                int i = this.f3075X;
                this.f3075X = i + 1;
                preference.mo3853z0(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).mo3874T0(this.f3074W);
            }
        }
        int binarySearch = Collections.binarySearch(this.f3073V, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * -1) - 1;
        }
        if (!mo3872R0(preference)) {
            return false;
        }
        synchronized (this) {
            this.f3073V.add(binarySearch, preference);
        }
        C0798j D = mo3795D();
        String u2 = preference.mo3842u();
        if (u2 == null || !this.f3072U.containsKey(u2)) {
            j = D.mo3987d();
        } else {
            j = this.f3072U.get(u2).longValue();
            this.f3072U.remove(u2);
        }
        preference.mo3812V(D, j);
        preference.mo3818e(this);
        if (this.f3076Y) {
            preference.mo3810T();
        }
        mo3809S();
        return true;
    }

    /* renamed from: L0 */
    public <T extends Preference> T mo3866L0(CharSequence charSequence) {
        T L0;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(mo3842u(), charSequence)) {
            return this;
        } else {
            int P0 = mo3870P0();
            for (int i = 0; i < P0; i++) {
                T O0 = mo3869O0(i);
                if (TextUtils.equals(O0.mo3842u(), charSequence)) {
                    return O0;
                }
                if ((O0 instanceof PreferenceGroup) && (L0 = ((PreferenceGroup) O0).mo3866L0(charSequence)) != null) {
                    return L0;
                }
            }
            return null;
        }
    }

    /* renamed from: M0 */
    public int mo3867M0() {
        return this.f3077Z;
    }

    /* renamed from: N0 */
    public C0766a mo3868N0() {
        return this.f3078a0;
    }

    /* renamed from: O0 */
    public Preference mo3869O0(int i) {
        return this.f3073V.get(i);
    }

    /* renamed from: P0 */
    public int mo3870P0() {
        return this.f3073V.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public boolean mo3871Q0() {
        return true;
    }

    /* renamed from: R */
    public void mo3808R(boolean z) {
        super.mo3808R(z);
        int P0 = mo3870P0();
        for (int i = 0; i < P0; i++) {
            mo3869O0(i).mo3816c0(this, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public boolean mo3872R0(Preference preference) {
        preference.mo3816c0(this, mo3751E0());
        return true;
    }

    /* renamed from: S0 */
    public void mo3873S0(int i) {
        if (i != Integer.MAX_VALUE && !mo3802K()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f3077Z = i;
    }

    /* renamed from: T */
    public void mo3810T() {
        super.mo3810T();
        this.f3076Y = true;
        int P0 = mo3870P0();
        for (int i = 0; i < P0; i++) {
            mo3869O0(i).mo3810T();
        }
    }

    /* renamed from: T0 */
    public void mo3874T0(boolean z) {
        this.f3074W = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3875U0() {
        synchronized (this) {
            Collections.sort(this.f3073V);
        }
    }

    /* renamed from: Z */
    public void mo3814Z() {
        super.mo3814Z();
        this.f3076Y = false;
        int P0 = mo3870P0();
        for (int i = 0; i < P0; i++) {
            mo3869O0(i).mo3814Z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C0767b.class)) {
            super.mo3756d0(parcelable);
            return;
        }
        C0767b bVar = (C0767b) parcelable;
        this.f3077Z = bVar.f3079f;
        super.mo3756d0(bVar.getSuperState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        return new C0767b(super.mo3757e0(), this.f3077Z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo3824j(Bundle bundle) {
        super.mo3824j(bundle);
        int P0 = mo3870P0();
        for (int i = 0; i < P0; i++) {
            mo3869O0(i).mo3824j(bundle);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3826k(Bundle bundle) {
        super.mo3826k(bundle);
        int P0 = mo3870P0();
        for (int i = 0; i < P0; i++) {
            mo3869O0(i).mo3826k(bundle);
        }
    }
}
