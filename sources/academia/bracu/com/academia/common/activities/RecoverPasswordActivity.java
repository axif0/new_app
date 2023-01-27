package academia.bracu.com.academia.common.activities;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.app.C0273e;
import androidx.appcompat.widget.Toolbar;
import com.karumi.dexter.C2722R;
import java.util.Objects;

public class RecoverPasswordActivity extends C0273e {
    /* renamed from: S */
    public /* synthetic */ void mo316S(View view) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2722R.layout.activity_recover_password);
        Toolbar toolbar = (Toolbar) findViewById(C2722R.C2724id.toolbar);
        mo835P(toolbar);
        ((C0259a) Objects.requireNonNull(mo829I())).mo782s(true);
        mo829I().mo783t(true);
        toolbar.setNavigationOnClickListener(new C0087i(this));
        toolbar.setTitle((int) C2722R.string.title_recover_password);
    }
}
