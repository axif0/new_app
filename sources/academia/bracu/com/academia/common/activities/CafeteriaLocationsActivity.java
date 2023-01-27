package academia.bracu.com.academia.common.activities;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.app.C0273e;
import androidx.appcompat.widget.Toolbar;
import com.karumi.dexter.C2722R;
import java.util.Objects;

public class CafeteriaLocationsActivity extends C0273e {
    /* renamed from: S */
    public /* synthetic */ void mo293S(View view) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2722R.layout.activity_cafeteria_locations);
        Toolbar toolbar = (Toolbar) findViewById(C2722R.C2724id.toolbar);
        mo835P(toolbar);
        ((C0259a) Objects.requireNonNull(mo829I())).mo782s(true);
        mo829I().mo783t(true);
        toolbar.setNavigationOnClickListener(new C0079a(this));
        toolbar.setTitle((CharSequence) getString(C2722R.string.cafeteria_location));
        ((TextView) findViewById(C2722R.C2724id.cafe_location1)).setText(Html.fromHtml(getString(C2722R.string.cafe_location1)));
        ((TextView) findViewById(C2722R.C2724id.cafe_location2)).setText(Html.fromHtml(getString(C2722R.string.cafe_location2)));
        ((TextView) findViewById(C2722R.C2724id.cafe_location3)).setText(Html.fromHtml(getString(C2722R.string.cafe_location3)));
    }
}
