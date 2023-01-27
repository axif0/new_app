package p086f.p144s;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f.s.s */
public class C3549s {

    /* renamed from: a */
    public final Map<String, Object> f11042a = new HashMap();

    /* renamed from: b */
    public View f11043b;

    /* renamed from: c */
    final ArrayList<C3532m> f11044c = new ArrayList<>();

    @Deprecated
    public C3549s() {
    }

    public C3549s(View view) {
        this.f11043b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3549s)) {
            return false;
        }
        C3549s sVar = (C3549s) obj;
        return this.f11043b == sVar.f11043b && this.f11042a.equals(sVar.f11042a);
    }

    public int hashCode() {
        return (this.f11043b.hashCode() * 31) + this.f11042a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f11043b + "\n") + "    values:";
        for (String next : this.f11042a.keySet()) {
            str = str + "    " + next + ": " + this.f11042a.get(next) + "\n";
        }
        return str;
    }
}
