package academia.bracu.com.academia.boommenu.p002c;

import academia.bracu.com.academia.boommenu.C0054e;
import academia.bracu.com.academia.boommenu.C0071o;
import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.c.j */
public class C0044j extends C0027a {

    /* renamed from: academia.bracu.com.academia.boommenu.c.j$b */
    public static class C0046b extends C0032b<C0046b> {
        /* renamed from: l */
        public C0044j mo244a(Context context) {
            C0044j jVar = new C0044j(this, context);
            mo254k(jVar);
            return jVar;
        }

        /* renamed from: m */
        public int mo265m() {
            return this.f331t0;
        }
    }

    private C0044j(C0046b bVar, Context context) {
        super(context);
        this.f222g = context;
        this.f252v = C0054e.SimpleCircle;
        m216X(bVar);
    }

    /* renamed from: X */
    private void m216X(C0046b bVar) {
        LayoutInflater.from(this.f222g).inflate(C0071o.bmb_simple_circle_button, this, true);
        m217Y(bVar);
        mo225p(this.f244r ? this.f236n + this.f172B : this.f174C);
        mo220k();
        mo224o();
        int i = this.f236n;
        int i2 = this.f172B;
        this.f220f = new PointF((float) (i + i2 + this.f260z), (float) (i + i2 + this.f170A));
    }

    /* renamed from: Y */
    private void m217Y(C0046b bVar) {
        super.mo219j(bVar);
    }

    /* renamed from: A */
    public void mo182A() {
    }

    /* renamed from: B */
    public void mo183B() {
        if (this.f230k && this.f232l) {
            mo184C();
            this.f230k = false;
        }
    }

    /* renamed from: F */
    public void mo187F() {
        if (!this.f230k) {
            mo188G();
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
        return C0054e.SimpleCircle;
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
        return arrayList;
    }

    /* renamed from: y */
    public ArrayList<View> mo238y() {
        ArrayList<View> arrayList = new ArrayList<>();
        if (this.f246s) {
            arrayList.add(this.f207S0);
        }
        return arrayList;
    }

    /* renamed from: z */
    public void mo239z() {
        this.f207S0.setPivotX((float) (this.f236n - this.f192L.left));
        this.f207S0.setPivotY((float) (this.f236n - this.f192L.top));
    }
}
