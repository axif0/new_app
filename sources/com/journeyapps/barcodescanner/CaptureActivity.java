package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import p148g.p189d.p296d.p300r.p301a.C5404g;
import p148g.p189d.p296d.p300r.p301a.C5405h;

public class CaptureActivity extends Activity {

    /* renamed from: f */
    private C2674d f8510f;

    /* renamed from: g */
    private DecoratedBarcodeView f8511g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DecoratedBarcodeView mo9708a() {
        setContentView(C5405h.zxing_capture);
        return (DecoratedBarcodeView) findViewById(C5404g.zxing_barcode_scanner);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8511g = mo9708a();
        C2674d dVar = new C2674d(this, this.f8511g);
        this.f8510f = dVar;
        dVar.mo9782j(getIntent(), bundle);
        this.f8510f.mo9780f();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f8510f.mo9784l();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f8511g.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f8510f.mo9785m();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f8510f.mo9786n(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f8510f.mo9787o();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f8510f.mo9788p(bundle);
    }
}
