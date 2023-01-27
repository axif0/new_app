package academia.bracu.com.academia.boommenu.p002c;

import academia.bracu.com.academia.boommenu.C0054e;
import academia.bracu.com.academia.boommenu.C0071o;
import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.c.k */
public class C0047k extends C0027a {

    /* renamed from: academia.bracu.com.academia.boommenu.c.k$b */
    public static class C0049b extends C0033c<C0049b> {
        /* renamed from: l */
        public C0047k mo244a(Context context) {
            C0047k kVar = new C0047k(this, context);
            mo254k(kVar);
            return kVar;
        }

        /* renamed from: m */
        public C0049b mo267m(int i) {
            this.f337w0 = i;
            return this;
        }

        /* renamed from: n */
        public int mo268n() {
            return this.f331t0;
        }

        /* renamed from: o */
        public C0049b mo269o(boolean z) {
            this.f339x0 = z;
            return this;
        }
    }

    private C0047k(C0049b bVar, Context context) {
        super(context);
        this.f222g = context;
        this.f252v = C0054e.TextInsideCircle;
        m232X(bVar);
    }

    /* renamed from: X */
    private void m232X(C0049b bVar) {
        LayoutInflater.from(this.f222g).inflate(C0071o.bmb_text_inside_circle_button, this, true);
        m233Y(bVar);
        mo225p(this.f244r ? this.f236n + this.f172B : this.f174C);
        mo220k();
        mo227r(this.f234m);
        mo224o();
        int i = this.f236n;
        int i2 = this.f172B;
        this.f220f = new PointF((float) (i + i2 + this.f260z), (float) (i + i2 + this.f170A));
    }

    /* renamed from: Y */
    private void m233Y(C0049b bVar) {
        super.mo219j(bVar);
    }

    /* renamed from: A */
    public void mo182A() {
    }

    /* renamed from: B */
    public void mo183B() {
        if (this.f230k && this.f232l) {
            mo184C();
            mo186E();
            this.f230k = false;
        }
    }

    /* renamed from: F */
    public void mo187F() {
        if (!this.f230k) {
            mo188G();
            mo190I();
            this.f230k = true;
        }
    }

    /* renamed from: J */
    public int mo191J() {
        return (this.f236n * 2) + (this.f172B * 2) + (this.f170A * 2);
    }

    /* renamed from: K */
    public int mo192K() {
        return (this.f236n * 2) + (this.f172B * 2) + (this.f260z * 2);
    }

    /* renamed from: L */
    public C0054e mo193L() {
        return C0054e.TextInsideCircle;
    }

    /* renamed from: c */
    public int mo206c() {
        return this.f236n * 2;
    }

    /* renamed from: d */
    public int mo207d() {
        return this.f236n * 2;
    }

    /* renamed from: g */
    public ArrayList<View> mo210g() {
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(this.f207S0);
        arrayList.add(this.f209T0);
        return arrayList;
    }

    /* renamed from: y */
    public ArrayList<View> mo238y() {
        ArrayList<View> arrayList = new ArrayList<>();
        if (this.f246s) {
            arrayList.add(this.f207S0);
        }
        if (this.f248t) {
            arrayList.add(this.f209T0);
        }
        return arrayList;
    }

    /* renamed from: z */
    public void mo239z() {
        this.f207S0.setPivotX((float) (this.f236n - this.f192L.left));
        this.f207S0.setPivotY((float) (this.f236n - this.f192L.top));
        this.f209T0.setPivotX((float) (this.f236n - this.f217c0.left));
        this.f209T0.setPivotY((float) (this.f236n - this.f217c0.top));
    }
}
