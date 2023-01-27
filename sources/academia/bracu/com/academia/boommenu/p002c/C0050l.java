package academia.bracu.com.academia.boommenu.p002c;

import academia.bracu.com.academia.boommenu.C0054e;
import academia.bracu.com.academia.boommenu.C0071o;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.c.l */
public class C0050l extends C0027a {

    /* renamed from: academia.bracu.com.academia.boommenu.c.l$b */
    public static class C0052b extends C0033c<C0052b> {
        /* renamed from: l */
        public C0050l mo244a(Context context) {
            C0050l lVar = new C0050l(this, context);
            mo254k(lVar);
            return lVar;
        }

        /* renamed from: m */
        public int mo271m() {
            int i = this.f331t0 * 2;
            Rect rect = this.f274I;
            return rect != null ? Math.max(i, (rect.bottom - this.f312k) - this.f314l) : i;
        }

        /* renamed from: n */
        public int mo272n() {
            int i = this.f331t0 * 2;
            return this.f274I != null ? Math.max(i, this.f311j0) : i;
        }
    }

    private C0050l(C0052b bVar, Context context) {
        super(context);
        this.f222g = context;
        this.f252v = C0054e.TextOutsideCircle;
        m250X(bVar);
    }

    /* renamed from: X */
    private void m250X(C0052b bVar) {
        LayoutInflater.from(this.f222g).inflate(C0071o.bmb_text_outside_circle_button, this, true);
        m251Y(bVar);
        mo228s();
        mo225p(this.f244r ? this.f236n + this.f172B : this.f174C);
        mo220k();
        mo227r(this.f205R0);
        mo224o();
        int i = this.f179E0;
        this.f220f = new PointF((float) i, (float) i);
    }

    /* renamed from: Y */
    private void m251Y(C0052b bVar) {
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
        return this.f179E0 * 2;
    }

    /* renamed from: K */
    public int mo192K() {
        return this.f179E0 * 2;
    }

    /* renamed from: L */
    public C0054e mo193L() {
        return C0054e.TextOutsideCircle;
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
        this.f209T0.setPivotX((float) (this.f179E0 - this.f217c0.left));
        this.f209T0.setPivotY((float) (this.f179E0 - this.f217c0.top));
    }
}
