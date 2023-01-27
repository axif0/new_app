package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;
import p086f.p111h.p112e.p113c.C3286g;

public class EditTextPreference extends DialogPreference {

    /* renamed from: a0 */
    private String f3014a0;

    /* renamed from: b0 */
    private C0749a f3015b0;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public interface C0749a {
        /* renamed from: a */
        void mo3759a(EditText editText);
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    private static class C0750b extends Preference.C0759b {
        public static final Parcelable.Creator<C0750b> CREATOR = new C0751a();

        /* renamed from: f */
        String f3016f;

        /* renamed from: androidx.preference.EditTextPreference$b$a */
        static class C0751a implements Parcelable.Creator<C0750b> {
            C0751a() {
            }

            /* renamed from: a */
            public C0750b createFromParcel(Parcel parcel) {
                return new C0750b(parcel);
            }

            /* renamed from: b */
            public C0750b[] newArray(int i) {
                return new C0750b[i];
            }
        }

        C0750b(Parcel parcel) {
            super(parcel);
            this.f3016f = parcel.readString();
        }

        C0750b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3016f);
        }
    }

    /* renamed from: androidx.preference.EditTextPreference$c */
    public static final class C0752c implements Preference.C0765g<EditTextPreference> {

        /* renamed from: a */
        private static C0752c f3017a;

        private C0752c() {
        }

        /* renamed from: b */
        public static C0752c m3714b() {
            if (f3017a == null) {
                f3017a = new C0752c();
            }
            return f3017a;
        }

        /* renamed from: c */
        public CharSequence mo3765a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.mo3753Q0()) ? editTextPreference.mo3831n().getString(C0811r.not_set) : editTextPreference.mo3753Q0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.editTextPreferenceStyle, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.EditTextPreference, i, i2);
        int i3 = C0813t.EditTextPreference_useSimpleSummaryProvider;
        if (C3286g.m14140b(obtainStyledAttributes, i3, i3, false)) {
            mo3792B0(C0752c.m3714b());
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: E0 */
    public boolean mo3751E0() {
        return TextUtils.isEmpty(this.f3014a0) || super.mo3751E0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public C0749a mo3752P0() {
        return this.f3015b0;
    }

    /* renamed from: Q0 */
    public String mo3753Q0() {
        return this.f3014a0;
    }

    /* renamed from: R0 */
    public void mo3754R0(String str) {
        boolean E0 = mo3751E0();
        this.f3014a0 = str;
        mo3828l0(str);
        boolean E02 = mo3751E0();
        if (E02 != E0) {
            mo3808R(E02);
        }
        mo3746Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Object mo3755a0(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C0750b.class)) {
            super.mo3756d0(parcelable);
            return;
        }
        C0750b bVar = (C0750b) parcelable;
        super.mo3756d0(bVar.getSuperState());
        mo3754R0(bVar.f3016f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        Parcelable e0 = super.mo3757e0();
        if (mo3805N()) {
            return e0;
        }
        C0750b bVar = new C0750b(e0);
        bVar.f3016f = mo3753Q0();
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3758f0(Object obj) {
        mo3754R0(mo3790A((String) obj));
    }
}
