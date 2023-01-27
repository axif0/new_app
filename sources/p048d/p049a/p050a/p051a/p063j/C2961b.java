package p048d.p049a.p050a.p051a.p063j;

import academia.bracu.com.academia.common.activities.CommonHomeActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.j.b */
public abstract class C2961b extends Fragment {

    /* renamed from: b0 */
    private ProgressDialog f9502b0;

    /* renamed from: c0 */
    private Context f9503c0;

    static {
        Class<C2961b> cls = C2961b.class;
    }

    /* renamed from: J1 */
    public void mo10294J1() {
        ProgressDialog progressDialog = this.f9502b0;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f9502b0.dismiss();
        }
    }

    /* renamed from: K1 */
    public void mo10295K1(C0636d dVar) {
        Intent intent = new Intent(this.f9503c0, CommonHomeActivity.class);
        intent.putExtra("common_nav_menu_id", C2722R.C2724id.nav_common_user_access);
        intent.setFlags(603979776);
        dVar.startActivity(intent);
        dVar.finish();
    }

    /* renamed from: L1 */
    public void mo10296L1(String str) {
        if (this.f9502b0 == null) {
            ProgressDialog progressDialog = new ProgressDialog(this.f9503c0);
            this.f9502b0 = progressDialog;
            progressDialog.setIndeterminate(true);
        }
        this.f9502b0.setMessage(str);
        this.f9502b0.setCancelable(false);
        this.f9502b0.setCanceledOnTouchOutside(false);
        this.f9502b0.show();
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        this.f9503c0 = context;
    }
}
