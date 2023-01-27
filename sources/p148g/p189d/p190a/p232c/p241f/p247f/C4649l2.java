package p148g.p189d.p190a.p232c.p241f.p247f;

import android.util.Log;

/* renamed from: g.d.a.c.f.f.l2 */
final class C4649l2 extends C4558g2<Long> {
    C4649l2(C4721p2 p2Var, String str, Long l, boolean z) {
        super(p2Var, str, l, true, (C4649l2) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Long mo14173e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String n = super.mo14174n();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(n);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
