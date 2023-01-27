package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.fragment.app.c */
public class C0632c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: b0 */
    private Handler f2678b0;

    /* renamed from: c0 */
    private Runnable f2679c0 = new C0633a();

    /* renamed from: d0 */
    private DialogInterface.OnCancelListener f2680d0 = new C0634b();
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public DialogInterface.OnDismissListener f2681e0 = new C0635c();

    /* renamed from: f0 */
    private int f2682f0 = 0;

    /* renamed from: g0 */
    private int f2683g0 = 0;

    /* renamed from: h0 */
    private boolean f2684h0 = true;

    /* renamed from: i0 */
    private boolean f2685i0 = true;

    /* renamed from: j0 */
    private int f2686j0 = -1;

    /* renamed from: k0 */
    private boolean f2687k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Dialog f2688l0;

    /* renamed from: m0 */
    private boolean f2689m0;

    /* renamed from: n0 */
    private boolean f2690n0;

    /* renamed from: o0 */
    private boolean f2691o0;

    /* renamed from: androidx.fragment.app.c$a */
    class C0633a implements Runnable {
        C0633a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C0632c.this.f2681e0.onDismiss(C0632c.this.f2688l0);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    class C0634b implements DialogInterface.OnCancelListener {
        C0634b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (C0632c.this.f2688l0 != null) {
                C0632c cVar = C0632c.this;
                cVar.onCancel(cVar.f2688l0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    class C0635c implements DialogInterface.OnDismissListener {
        C0635c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (C0632c.this.f2688l0 != null) {
                C0632c cVar = C0632c.this;
                cVar.onDismiss(cVar.f2688l0);
            }
        }
    }

    /* renamed from: N1 */
    private void m3153N1(boolean z, boolean z2) {
        if (!this.f2690n0) {
            this.f2690n0 = true;
            this.f2691o0 = false;
            Dialog dialog = this.f2688l0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f2688l0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f2678b0.getLooper()) {
                        onDismiss(this.f2688l0);
                    } else {
                        this.f2678b0.post(this.f2679c0);
                    }
                }
            }
            this.f2689m0 = true;
            if (this.f2686j0 >= 0) {
                mo3156K().mo3401D0(this.f2686j0, 1);
                this.f2686j0 = -1;
                return;
            }
            C0675u i = mo3156K().mo3440i();
            i.mo3268p(this);
            if (z) {
                i.mo3263j();
            } else {
                i.mo3262i();
            }
        }
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        Dialog dialog = this.f2688l0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f2682f0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2683g0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2684h0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2685i0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2686j0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: L1 */
    public void mo3284L1() {
        m3153N1(false, false);
    }

    /* renamed from: M0 */
    public void mo3159M0() {
        super.mo3159M0();
        Dialog dialog = this.f2688l0;
        if (dialog != null) {
            this.f2689m0 = false;
            dialog.show();
        }
    }

    /* renamed from: M1 */
    public void mo3285M1() {
        m3153N1(true, false);
    }

    /* renamed from: N0 */
    public void mo3161N0() {
        super.mo3161N0();
        Dialog dialog = this.f2688l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: O1 */
    public Dialog mo3286O1() {
        return this.f2688l0;
    }

    /* renamed from: P1 */
    public int mo3287P1() {
        return this.f2683g0;
    }

    /* renamed from: Q1 */
    public Dialog mo542Q1(Bundle bundle) {
        return new Dialog(mo3217o1(), mo3287P1());
    }

    /* renamed from: R1 */
    public final Dialog mo3288R1() {
        Dialog O1 = mo3286O1();
        if (O1 != null) {
            return O1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: S1 */
    public void mo3289S1(boolean z) {
        this.f2684h0 = z;
        Dialog dialog = this.f2688l0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: T1 */
    public void mo3290T1(boolean z) {
        this.f2685i0 = z;
    }

    /* renamed from: U1 */
    public void mo974U1(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: V1 */
    public int mo3291V1(C0675u uVar, String str) {
        this.f2690n0 = false;
        this.f2691o0 = true;
        uVar.mo3564e(this, str);
        this.f2689m0 = false;
        int i = uVar.mo3262i();
        this.f2686j0 = i;
        return i;
    }

    /* renamed from: W1 */
    public void mo3292W1(C0653m mVar, String str) {
        this.f2690n0 = false;
        this.f2691o0 = true;
        C0675u i = mVar.mo3440i();
        i.mo3564e(this, str);
        i.mo3262i();
    }

    /* renamed from: j0 */
    public void mo3204j0(Bundle bundle) {
        Bundle bundle2;
        super.mo3204j0(bundle);
        if (this.f2685i0) {
            View V = mo3175V();
            if (this.f2688l0 != null) {
                if (V != null) {
                    if (V.getParent() == null) {
                        this.f2688l0.setContentView(V);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                C0636d o = mo3215o();
                if (o != null) {
                    this.f2688l0.setOwnerActivity(o);
                }
                this.f2688l0.setCancelable(this.f2684h0);
                this.f2688l0.setOnCancelListener(this.f2680d0);
                this.f2688l0.setOnDismissListener(this.f2681e0);
                if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                    this.f2688l0.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (!this.f2691o0) {
            this.f2690n0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2689m0) {
            m3153N1(true, true);
        }
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        this.f2678b0 = new Handler();
        this.f2685i0 = this.f2594B == 0;
        if (bundle != null) {
            this.f2682f0 = bundle.getInt("android:style", 0);
            this.f2683g0 = bundle.getInt("android:theme", 0);
            this.f2684h0 = bundle.getBoolean("android:cancelable", true);
            this.f2685i0 = bundle.getBoolean("android:showsDialog", this.f2685i0);
            this.f2686j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: w0 */
    public void mo3238w0() {
        super.mo3238w0();
        Dialog dialog = this.f2688l0;
        if (dialog != null) {
            this.f2689m0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f2688l0.dismiss();
            if (!this.f2690n0) {
                onDismiss(this.f2688l0);
            }
            this.f2688l0 = null;
        }
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        if (!this.f2691o0 && !this.f2690n0) {
            this.f2690n0 = true;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y0 */
    public LayoutInflater mo3243y0(Bundle bundle) {
        LayoutInflater y0 = super.mo3243y0(bundle);
        if (!this.f2685i0 || this.f2687k0) {
            return y0;
        }
        try {
            this.f2687k0 = true;
            Dialog Q1 = mo542Q1(bundle);
            this.f2688l0 = Q1;
            mo974U1(Q1, this.f2682f0);
            this.f2687k0 = false;
            return y0.cloneInContext(mo3288R1().getContext());
        } catch (Throwable th) {
            this.f2687k0 = false;
            throw th;
        }
    }
}
