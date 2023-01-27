package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.List;
import p148g.p189d.p296d.C5373e;
import p148g.p189d.p296d.p300r.p301a.C5404g;

public class BarcodeView extends C2666c {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C2660b f8499G = C2660b.NONE;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C2664a f8500H = null;

    /* renamed from: I */
    private C2685h f8501I;

    /* renamed from: J */
    private C2683f f8502J;

    /* renamed from: K */
    private Handler f8503K;

    /* renamed from: L */
    private final Handler.Callback f8504L = new C2659a();

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    class C2659a implements Handler.Callback {
        C2659a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C5404g.zxing_decode_succeeded) {
                C2665b bVar = (C2665b) message.obj;
                if (!(bVar == null || BarcodeView.this.f8500H == null || BarcodeView.this.f8499G == C2660b.NONE)) {
                    BarcodeView.this.f8500H.mo9730a(bVar);
                    if (BarcodeView.this.f8499G == C2660b.SINGLE) {
                        BarcodeView.this.mo9702K();
                    }
                }
                return true;
            } else if (i == C5404g.zxing_decode_failed) {
                return true;
            } else {
                if (i != C5404g.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.f8500H == null || BarcodeView.this.f8499G == C2660b.NONE)) {
                    BarcodeView.this.f8500H.mo9731b(list);
                }
                return true;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$b */
    private enum C2660b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11845H(context, attributeSet);
    }

    /* renamed from: E */
    private C2682e m11844E() {
        if (this.f8502J == null) {
            this.f8502J = mo9700F();
        }
        C2684g gVar = new C2684g();
        HashMap hashMap = new HashMap();
        hashMap.put(C5373e.NEED_RESULT_POINT_CALLBACK, gVar);
        C2682e a = this.f8502J.mo9801a(hashMap);
        gVar.mo9802b(a);
        return a;
    }

    /* renamed from: H */
    private void m11845H(Context context, AttributeSet attributeSet) {
        this.f8502J = new C2688i();
        this.f8503K = new Handler(this.f8504L);
    }

    /* renamed from: I */
    private void m11846I() {
        m11847J();
        if (this.f8499G != C2660b.NONE && mo9762s()) {
            C2685h hVar = new C2685h(getCameraInstance(), m11844E(), this.f8503K);
            this.f8501I = hVar;
            hVar.mo9804i(getPreviewFramingRect());
            this.f8501I.mo9806k();
        }
    }

    /* renamed from: J */
    private void m11847J() {
        C2685h hVar = this.f8501I;
        if (hVar != null) {
            hVar.mo9807l();
            this.f8501I = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public C2683f mo9700F() {
        return new C2688i();
    }

    /* renamed from: G */
    public void mo9701G(C2664a aVar) {
        this.f8499G = C2660b.SINGLE;
        this.f8500H = aVar;
        m11846I();
    }

    /* renamed from: K */
    public void mo9702K() {
        this.f8499G = C2660b.NONE;
        this.f8500H = null;
        m11847J();
    }

    public C2683f getDecoderFactory() {
        return this.f8502J;
    }

    public void setDecoderFactory(C2683f fVar) {
        C2694n.m11984a();
        this.f8502J = fVar;
        C2685h hVar = this.f8501I;
        if (hVar != null) {
            hVar.mo9805j(m11844E());
        }
    }

    /* renamed from: t */
    public void mo9705t() {
        m11847J();
        super.mo9705t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo9706v() {
        super.mo9706v();
        m11846I();
    }
}
