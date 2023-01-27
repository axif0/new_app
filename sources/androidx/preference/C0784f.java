package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.C0271d;
import androidx.fragment.app.C0632c;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;

/* renamed from: androidx.preference.f */
public abstract class C0784f extends C0632c implements DialogInterface.OnClickListener {

    /* renamed from: p0 */
    private DialogPreference f3124p0;

    /* renamed from: q0 */
    private CharSequence f3125q0;

    /* renamed from: r0 */
    private CharSequence f3126r0;

    /* renamed from: s0 */
    private CharSequence f3127s0;

    /* renamed from: t0 */
    private CharSequence f3128t0;

    /* renamed from: u0 */
    private int f3129u0;

    /* renamed from: v0 */
    private BitmapDrawable f3130v0;

    /* renamed from: w0 */
    private int f3131w0;

    /* renamed from: d2 */
    private void m3933d2(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f3125q0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f3126r0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f3127s0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f3128t0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f3129u0);
        BitmapDrawable bitmapDrawable = this.f3130v0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        C0636d o = mo3215o();
        this.f3131w0 = -2;
        C0271d.C0272a aVar = new C0271d.C0272a(o);
        aVar.mo825n(this.f3125q0);
        aVar.mo816e(this.f3130v0);
        aVar.mo821j(this.f3126r0, this);
        aVar.mo819h(this.f3127s0, this);
        View a2 = mo3931a2(o);
        if (a2 != null) {
            mo3917Z1(a2);
            aVar.mo826o(a2);
        } else {
            aVar.mo817f(this.f3128t0);
        }
        mo3919c2(aVar);
        C0271d a = aVar.mo812a();
        if (mo3916Y1()) {
            m3933d2(a);
        }
        return a;
    }

    /* renamed from: X1 */
    public DialogPreference mo3930X1() {
        if (this.f3124p0 == null) {
            this.f3124p0 = (DialogPreference) ((DialogPreference.C0747a) mo3173U()).mo3745e(mo3237w().getString("key"));
        }
        return this.f3124p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public boolean mo3916Y1() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public void mo3917Z1(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f3128t0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public View mo3931a2(Context context) {
        int i = this.f3129u0;
        if (i == 0) {
            return null;
        }
        return mo3143F().inflate(i, (ViewGroup) null);
    }

    /* renamed from: b2 */
    public abstract void mo3918b2(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public void mo3919c2(C0271d.C0272a aVar) {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3131w0 = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo3918b2(this.f3131w0 == -1);
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.mo362p0(bundle);
        Fragment U = mo3173U();
        if (U instanceof DialogPreference.C0747a) {
            DialogPreference.C0747a aVar = (DialogPreference.C0747a) U;
            String string = mo3237w().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.mo3745e(string);
                this.f3124p0 = dialogPreference;
                this.f3125q0 = dialogPreference.mo3741M0();
                this.f3126r0 = this.f3124p0.mo3743O0();
                this.f3127s0 = this.f3124p0.mo3742N0();
                this.f3128t0 = this.f3124p0.mo3740L0();
                this.f3129u0 = this.f3124p0.mo3739K0();
                Drawable J0 = this.f3124p0.mo3738J0();
                if (J0 == null || (J0 instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) J0;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(J0.getIntrinsicWidth(), J0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    J0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    J0.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(mo3158M(), createBitmap);
                }
                this.f3130v0 = bitmapDrawable;
                return;
            }
            this.f3125q0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f3126r0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f3127s0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f3128t0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f3129u0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f3130v0 = new BitmapDrawable(mo3158M(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }
}
