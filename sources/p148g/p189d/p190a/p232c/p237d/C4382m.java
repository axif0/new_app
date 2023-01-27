package p148g.p189d.p190a.p232c.p237d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C0632c;
import androidx.fragment.app.C0653m;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: g.d.a.c.d.m */
public class C4382m extends C0632c {

    /* renamed from: p0 */
    private Dialog f13925p0 = null;

    /* renamed from: q0 */
    private DialogInterface.OnCancelListener f13926q0 = null;

    /* renamed from: X1 */
    public static C4382m m18611X1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C4382m mVar = new C4382m();
        C1658o.m7846k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        mVar.f13925p0 = dialog2;
        if (onCancelListener != null) {
            mVar.f13926q0 = onCancelListener;
        }
        return mVar;
    }

    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        if (this.f13925p0 == null) {
            mo3290T1(false);
        }
        return this.f13925p0;
    }

    /* renamed from: W1 */
    public void mo3292W1(C0653m mVar, String str) {
        super.mo3292W1(mVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13926q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
