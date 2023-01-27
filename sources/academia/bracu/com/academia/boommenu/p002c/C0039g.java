package academia.bracu.com.academia.boommenu.p002c;

import academia.bracu.com.academia.boommenu.C0054e;
import academia.bracu.com.academia.boommenu.C0071o;
import academia.bracu.com.academia.boommenu.C0073q;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.c.g */
public class C0039g extends C0027a {

    /* renamed from: academia.bracu.com.academia.boommenu.c.g$b */
    public static class C0041b extends C0033c<C0041b> {
        public C0041b() {
            this.f332u = new Rect(0, 0, C0073q.m291b(60.0f), C0073q.m291b(60.0f));
            this.f274I = new Rect(C0073q.m291b(70.0f), C0073q.m291b(10.0f), C0073q.m291b(280.0f), C0073q.m291b(40.0f));
            this.f278M = 8388627;
            this.f280O = 15;
        }

        /* renamed from: l */
        public C0039g mo244a(Context context) {
            C0039g gVar = new C0039g(this, context);
            mo254k(gVar);
            return gVar;
        }

        /* renamed from: m */
        public int mo261m() {
            return this.f335v0;
        }

        /* renamed from: n */
        public int mo262n() {
            return this.f333u0;
        }
    }

    private C0039g(C0041b bVar, Context context) {
        super(context);
        this.f222g = context;
        this.f252v = C0054e.Ham;
        m197X(bVar);
    }

    /* renamed from: X */
    private void m197X(C0041b bVar) {
        LayoutInflater.from(this.f222g).inflate(C0071o.bmb_ham_button, this, true);
        m198Y(bVar);
        mo225p(bVar.f318n);
        mo222m();
        mo227r(this.f234m);
        mo226q(this.f234m);
        mo224o();
        int i = this.f172B;
        this.f220f = new PointF((((float) this.f238o) / 2.0f) + ((float) i) + ((float) this.f260z), (((float) this.f240p) / 2.0f) + ((float) i) + ((float) this.f170A));
    }

    /* renamed from: Y */
    private void m198Y(C0041b bVar) {
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
            mo185D();
            this.f230k = false;
        }
    }

    /* renamed from: F */
    public void mo187F() {
        if (!this.f230k) {
            mo188G();
            mo190I();
            mo189H();
            this.f230k = true;
        }
    }

    /* renamed from: J */
    public int mo191J() {
        return this.f240p + (this.f172B * 2) + (this.f170A * 2);
    }

    /* renamed from: K */
    public int mo192K() {
        return this.f238o + (this.f172B * 2) + (this.f260z * 2);
    }

    /* renamed from: L */
    public C0054e mo193L() {
        return C0054e.Ham;
    }

    /* renamed from: c */
    public int mo206c() {
        return this.f240p;
    }

    /* renamed from: d */
    public int mo207d() {
        return this.f238o;
    }

    /* renamed from: g */
    public ArrayList<View> mo210g() {
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(this.f207S0);
        arrayList.add(this.f209T0);
        TextView textView = this.f211U0;
        if (textView != null) {
            arrayList.add(textView);
        }
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
    }
}
