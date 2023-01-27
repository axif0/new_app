package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.karumi.dexter.BuildConfig;
import p086f.p111h.p112e.p113c.C3286g;

public class ListPreference extends DialogPreference {

    /* renamed from: a0 */
    private CharSequence[] f3018a0;

    /* renamed from: b0 */
    private CharSequence[] f3019b0;

    /* renamed from: c0 */
    private String f3020c0;

    /* renamed from: d0 */
    private String f3021d0;

    /* renamed from: e0 */
    private boolean f3022e0;

    /* renamed from: androidx.preference.ListPreference$a */
    private static class C0753a extends Preference.C0759b {
        public static final Parcelable.Creator<C0753a> CREATOR = new C0754a();

        /* renamed from: f */
        String f3023f;

        /* renamed from: androidx.preference.ListPreference$a$a */
        static class C0754a implements Parcelable.Creator<C0753a> {
            C0754a() {
            }

            /* renamed from: a */
            public C0753a createFromParcel(Parcel parcel) {
                return new C0753a(parcel);
            }

            /* renamed from: b */
            public C0753a[] newArray(int i) {
                return new C0753a[i];
            }
        }

        C0753a(Parcel parcel) {
            super(parcel);
            this.f3023f = parcel.readString();
        }

        C0753a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3023f);
        }
    }

    /* renamed from: androidx.preference.ListPreference$b */
    public static final class C0755b implements Preference.C0765g<ListPreference> {

        /* renamed from: a */
        private static C0755b f3024a;

        private C0755b() {
        }

        /* renamed from: b */
        public static C0755b m3733b() {
            if (f3024a == null) {
                f3024a = new C0755b();
            }
            return f3024a;
        }

        /* renamed from: c */
        public CharSequence mo3765a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.mo3771R0()) ? listPreference.mo3831n().getString(C0811r.not_set) : listPreference.mo3771R0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.ListPreference, i, i2);
        this.f3018a0 = C3286g.m14155q(obtainStyledAttributes, C0813t.ListPreference_entries, C0813t.ListPreference_android_entries);
        this.f3019b0 = C3286g.m14155q(obtainStyledAttributes, C0813t.ListPreference_entryValues, C0813t.ListPreference_android_entryValues);
        int i3 = C0813t.ListPreference_useSimpleSummaryProvider;
        if (C3286g.m14140b(obtainStyledAttributes, i3, i3, false)) {
            mo3792B0(C0755b.m3733b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0813t.Preference, i, i2);
        this.f3021d0 = C3286g.m14153o(obtainStyledAttributes2, C0813t.Preference_summary, C0813t.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: U0 */
    private int m3717U0() {
        return mo3769P0(this.f3020c0);
    }

    /* renamed from: A0 */
    public void mo3767A0(CharSequence charSequence) {
        String charSequence2;
        super.mo3767A0(charSequence);
        if (charSequence == null && this.f3021d0 != null) {
            charSequence2 = null;
        } else if (charSequence != null && !charSequence.equals(this.f3021d0)) {
            charSequence2 = charSequence.toString();
        } else {
            return;
        }
        this.f3021d0 = charSequence2;
    }

    /* renamed from: F */
    public CharSequence mo3768F() {
        if (mo3799G() != null) {
            return mo3799G().mo3765a(this);
        }
        Object R0 = mo3771R0();
        CharSequence F = super.mo3768F();
        String str = this.f3021d0;
        if (str == null) {
            return F;
        }
        Object[] objArr = new Object[1];
        if (R0 == null) {
            R0 = BuildConfig.FLAVOR;
        }
        objArr[0] = R0;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, F)) {
            return F;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    /* renamed from: P0 */
    public int mo3769P0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f3019b0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f3019b0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: Q0 */
    public CharSequence[] mo3770Q0() {
        return this.f3018a0;
    }

    /* renamed from: R0 */
    public CharSequence mo3771R0() {
        CharSequence[] charSequenceArr;
        int U0 = m3717U0();
        if (U0 < 0 || (charSequenceArr = this.f3018a0) == null) {
            return null;
        }
        return charSequenceArr[U0];
    }

    /* renamed from: S0 */
    public CharSequence[] mo3772S0() {
        return this.f3019b0;
    }

    /* renamed from: T0 */
    public String mo3773T0() {
        return this.f3020c0;
    }

    /* renamed from: V0 */
    public void mo3774V0(String str) {
        boolean z = !TextUtils.equals(this.f3020c0, str);
        if (z || !this.f3022e0) {
            this.f3020c0 = str;
            this.f3022e0 = true;
            mo3828l0(str);
            if (z) {
                mo3746Q();
            }
        }
    }

    /* renamed from: W0 */
    public void mo3747W0(int i) {
        CharSequence[] charSequenceArr = this.f3019b0;
        if (charSequenceArr != null) {
            mo3774V0(charSequenceArr[i].toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Object mo3755a0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C0753a.class)) {
            super.mo3756d0(parcelable);
            return;
        }
        C0753a aVar = (C0753a) parcelable;
        super.mo3756d0(aVar.getSuperState());
        mo3774V0(aVar.f3023f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        Parcelable e0 = super.mo3757e0();
        if (mo3805N()) {
            return e0;
        }
        C0753a aVar = new C0753a(e0);
        aVar.f3023f = mo3773T0();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3758f0(Object obj) {
        mo3774V0(mo3790A((String) obj));
    }
}
