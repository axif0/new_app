package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C0632c;

/* renamed from: androidx.appcompat.app.j */
public class C0303j extends C0632c {
    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        return new C0301i(mo3242y(), mo3287P1());
    }

    /* renamed from: U1 */
    public void mo974U1(Dialog dialog, int i) {
        if (dialog instanceof C0301i) {
            C0301i iVar = (C0301i) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            iVar.mo963d(1);
            return;
        }
        super.mo974U1(dialog, i);
    }
}
