package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.journeyapps.barcodescanner.p047o.C2708d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p148g.p189d.p296d.C5369a;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.C5376h;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p300r.p301a.C5397c;
import p148g.p189d.p296d.p300r.p301a.C5398d;
import p148g.p189d.p296d.p300r.p301a.C5404g;
import p148g.p189d.p296d.p300r.p301a.C5405h;
import p148g.p189d.p296d.p300r.p301a.C5408k;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: f */
    private BarcodeView f8512f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ViewfinderView f8513g;

    /* renamed from: h */
    private TextView f8514h;

    /* renamed from: i */
    private C2661a f8515i;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface C2661a {
        /* renamed from: a */
        void mo9728a();

        /* renamed from: b */
        void mo9729b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    private class C2662b implements C2664a {

        /* renamed from: a */
        private C2664a f8516a;

        public C2662b(C2664a aVar) {
            this.f8516a = aVar;
        }

        /* renamed from: a */
        public void mo9730a(C2665b bVar) {
            this.f8516a.mo9730a(bVar);
        }

        /* renamed from: b */
        public void mo9731b(List<C5383o> list) {
            for (C5383o a : list) {
                DecoratedBarcodeView.this.f8513g.mo9732a(a);
            }
            this.f8516a.mo9731b(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11855c(attributeSet);
    }

    /* renamed from: c */
    private void m11855c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5408k.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(C5408k.zxing_view_zxing_scanner_layout, C5405h.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(C5404g.zxing_barcode_surface);
        this.f8512f = barcodeView;
        if (barcodeView != null) {
            barcodeView.mo9760q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(C5404g.zxing_viewfinder_view);
            this.f8513g = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f8512f);
                this.f8514h = (TextView) findViewById(C5404g.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* renamed from: b */
    public void mo9716b(C2664a aVar) {
        this.f8512f.mo9701G(new C2662b(aVar));
    }

    /* renamed from: d */
    public void mo9717d(Intent intent) {
        int intExtra;
        Set<C5369a> a = C5397c.m22259a(intent);
        Map<C5373e, Object> a2 = C5398d.m22261a(intent);
        C2708d dVar = new C2708d();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            dVar.mo9874i(intExtra);
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new C5376h().mo15607f(a2);
        this.f8512f.setCameraSettings(dVar);
        this.f8512f.setDecoderFactory(new C2688i(a, a2, stringExtra2));
    }

    /* renamed from: e */
    public void mo9718e() {
        this.f8512f.mo9705t();
    }

    /* renamed from: f */
    public void mo9719f() {
        this.f8512f.mo9769w();
    }

    /* renamed from: g */
    public void mo9720g() {
        this.f8512f.setTorch(false);
        C2661a aVar = this.f8515i;
        if (aVar != null) {
            aVar.mo9728a();
        }
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C5404g.zxing_barcode_surface);
    }

    public TextView getStatusView() {
        return this.f8514h;
    }

    public ViewfinderView getViewFinder() {
        return this.f8513g;
    }

    /* renamed from: h */
    public void mo9724h() {
        this.f8512f.setTorch(true);
        C2661a aVar = this.f8515i;
        if (aVar != null) {
            aVar.mo9729b();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            mo9724h();
            return true;
        } else if (i == 25) {
            mo9720g();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setStatusText(String str) {
        TextView textView = this.f8514h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(C2661a aVar) {
        this.f8515i = aVar;
    }
}
