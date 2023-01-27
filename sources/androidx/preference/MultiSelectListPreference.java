package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p086f.p111h.p112e.p113c.C3286g;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: a0 */
    private CharSequence[] f3025a0;

    /* renamed from: b0 */
    private CharSequence[] f3026b0;

    /* renamed from: c0 */
    private Set<String> f3027c0;

    /* renamed from: androidx.preference.MultiSelectListPreference$a */
    private static class C0756a extends Preference.C0759b {
        public static final Parcelable.Creator<C0756a> CREATOR = new C0757a();

        /* renamed from: f */
        Set<String> f3028f;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a */
        static class C0757a implements Parcelable.Creator<C0756a> {
            C0757a() {
            }

            /* renamed from: a */
            public C0756a createFromParcel(Parcel parcel) {
                return new C0756a(parcel);
            }

            /* renamed from: b */
            public C0756a[] newArray(int i) {
                return new C0756a[i];
            }
        }

        C0756a(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f3028f = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f3028f, strArr);
        }

        C0756a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3028f.size());
            Set<String> set = this.f3028f;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.dialogPreferenceStyle, 16842897));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3027c0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.MultiSelectListPreference, i, i2);
        this.f3025a0 = C3286g.m14155q(obtainStyledAttributes, C0813t.MultiSelectListPreference_entries, C0813t.MultiSelectListPreference_android_entries);
        this.f3026b0 = C3286g.m14155q(obtainStyledAttributes, C0813t.MultiSelectListPreference_entryValues, C0813t.MultiSelectListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: P0 */
    public CharSequence[] mo3781P0() {
        return this.f3025a0;
    }

    /* renamed from: Q0 */
    public CharSequence[] mo3782Q0() {
        return this.f3026b0;
    }

    /* renamed from: R0 */
    public Set<String> mo3783R0() {
        return this.f3027c0;
    }

    /* renamed from: S0 */
    public void mo3784S0(Set<String> set) {
        this.f3027c0.clear();
        this.f3027c0.addAll(set);
        mo3830m0(set);
        mo3746Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Object mo3755a0(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C0756a.class)) {
            super.mo3756d0(parcelable);
            return;
        }
        C0756a aVar = (C0756a) parcelable;
        super.mo3756d0(aVar.getSuperState());
        mo3784S0(aVar.f3028f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        Parcelable e0 = super.mo3757e0();
        if (mo3805N()) {
            return e0;
        }
        C0756a aVar = new C0756a(e0);
        aVar.f3028f = mo3783R0();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3758f0(Object obj) {
        mo3784S0(mo3791B((Set) obj));
    }
}
