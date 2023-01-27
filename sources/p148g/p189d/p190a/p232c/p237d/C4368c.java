package p148g.p189d.p190a.p232c.p237d;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1658o;

/* renamed from: g.d.a.c.d.c */
public class C4368c extends DialogFragment {

    /* renamed from: f */
    private Dialog f13901f = null;

    /* renamed from: g */
    private DialogInterface.OnCancelListener f13902g = null;

    /* renamed from: a */
    public static C4368c m18554a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C4368c cVar = new C4368c();
        C1658o.m7846k(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f13901f = dialog2;
        if (onCancelListener != null) {
            cVar.f13902g = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13902g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f13901f == null) {
            setShowsDialog(false);
        }
        return this.f13901f;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
