package p148g.p189d.p190a.p232c.p241f.p247f;

import android.util.Log;

/* renamed from: g.d.a.c.f.f.k2 */
final class C4631k2 extends C4558g2<Boolean> {
    C4631k2(C4721p2 p2Var, String str, Boolean bool, boolean z) {
        super(p2Var, str, bool, true, (C4649l2) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo14173e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C4686n1.f14304c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (C4686n1.f14305d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String n = super.mo14174n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(n);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
