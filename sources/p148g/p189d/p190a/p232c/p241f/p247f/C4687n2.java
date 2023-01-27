package p148g.p189d.p190a.p232c.p241f.p247f;

import android.util.Log;

/* renamed from: g.d.a.c.f.f.n2 */
final class C4687n2 extends C4558g2<Double> {
    C4687n2(C4721p2 p2Var, String str, Double d, boolean z) {
        super(p2Var, str, d, true, (C4649l2) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Double mo14173e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n = super.mo14174n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(n);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
