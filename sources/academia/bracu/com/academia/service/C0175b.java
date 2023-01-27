package academia.bracu.com.academia.service;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C2074b;
import com.karumi.dexter.C2722R;

/* renamed from: academia.bracu.com.academia.service.b */
public class C0175b extends C2074b {

    /* renamed from: r0 */
    public static final String f608r0 = C0175b.class.getSimpleName();

    /* renamed from: q0 */
    private C0176c f609q0;

    /* renamed from: c2 */
    public static C0175b m634c2(C0176c cVar) {
        C0175b bVar = new C0175b();
        bVar.m635d2(cVar);
        return bVar;
    }

    /* renamed from: d2 */
    private void m635d2(C0176c cVar) {
        this.f609q0 = cVar;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        view.findViewById(C2722R.C2724id.imv_action_close).setOnClickListener(new C0174a(this));
        ((TextView) view.findViewById(C2722R.C2724id.tv_notification_title)).setText(this.f609q0.mo522c());
        TextView textView = (TextView) view.findViewById(C2722R.C2724id.tv_notification_message);
        textView.setText(this.f609q0.mo520a());
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    /* renamed from: b2 */
    public /* synthetic */ void mo519b2(View view) {
        mo3284L1();
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2722R.layout.bottom_push_notification, viewGroup, false);
    }
}
