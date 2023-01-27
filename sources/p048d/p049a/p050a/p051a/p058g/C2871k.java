package p048d.p049a.p050a.p051a.p058g;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.g.k */
public class C2871k extends Dialog {

    /* renamed from: f */
    private final Context f9286f;

    /* renamed from: g */
    private final C2872a f9287g;

    /* renamed from: h */
    private Dialog f9288h;

    /* renamed from: i */
    private final String f9289i;

    /* renamed from: j */
    private final String f9290j;

    /* renamed from: k */
    private final String f9291k;

    /* renamed from: l */
    private boolean f9292l;

    /* renamed from: d.a.a.a.g.k$a */
    public interface C2872a {
        /* renamed from: a */
        void mo430a(Dialog dialog);

        /* renamed from: b */
        void mo431b(Dialog dialog);
    }

    public C2871k(Context context, String str, String str2, String str3, boolean z, C2872a aVar) {
        super(context);
        this.f9286f = context;
        this.f9289i = str;
        this.f9290j = str2;
        this.f9291k = str3;
        this.f9292l = z;
        this.f9287g = aVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo10197a(View view) {
        this.f9287g.mo431b(this.f9288h);
    }

    /* renamed from: b */
    public /* synthetic */ void mo10198b(View view) {
        this.f9287g.mo430a(this.f9288h);
    }

    /* renamed from: c */
    public void mo10199c() {
        try {
            Dialog dialog = new Dialog(this.f9286f, 16973835);
            this.f9288h = dialog;
            dialog.setContentView(C2722R.layout.dialog_ask_user_consent);
            this.f9288h.setCanceledOnTouchOutside(false);
            this.f9288h.setCancelable(false);
            LinearLayout linearLayout = (LinearLayout) this.f9288h.findViewById(C2722R.C2724id.ll_cancel_layout);
            TextView textView = (TextView) this.f9288h.findViewById(C2722R.C2724id.tv_warning_title);
            TextView textView2 = (TextView) this.f9288h.findViewById(C2722R.C2724id.tv_warning_message);
            TextView textView3 = (TextView) this.f9288h.findViewById(C2722R.C2724id.tv_action_ok);
            if (!this.f9289i.isEmpty()) {
                textView.setText(this.f9289i);
            } else {
                textView.setVisibility(8);
            }
            if (this.f9292l) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
            textView3.setText(this.f9291k);
            textView2.setText(this.f9290j);
            textView3.setOnClickListener(new C2862b(this));
            this.f9288h.findViewById(C2722R.C2724id.tv_action_cancel).setOnClickListener(new C2861a(this));
            Window window = this.f9288h.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            this.f9288h.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
