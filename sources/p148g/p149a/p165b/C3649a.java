package p148g.p149a.p165b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p148g.p325e.p326a.C5579l;

/* renamed from: g.a.b.a */
public abstract class C3649a implements C5579l<Number> {

    /* renamed from: a */
    protected float f11237a;

    /* renamed from: b */
    private ArrayList<C3650a> f11238b;

    /* renamed from: g.a.b.a$a */
    public interface C3650a {
        /* renamed from: a */
        void mo12193a(float f, float f2, float f3, float f4, float f5);
    }

    /* renamed from: a */
    public void mo12189a(C3650a... aVarArr) {
        Collections.addAll(this.f11238b, aVarArr);
    }

    /* renamed from: b */
    public abstract Float mo12190b(float f, float f2, float f3, float f4);

    /* renamed from: c */
    public final Float evaluate(float f, Number number, Number number2) {
        float f2 = this.f11237a * f;
        float floatValue = number.floatValue();
        float floatValue2 = number2.floatValue() - number.floatValue();
        float f3 = this.f11237a;
        float floatValue3 = mo12190b(f2, floatValue, floatValue2, f3).floatValue();
        Iterator<C3650a> it = this.f11238b.iterator();
        while (it.hasNext()) {
            it.next().mo12193a(f2, floatValue3, floatValue, floatValue2, f3);
        }
        return Float.valueOf(floatValue3);
    }
}
