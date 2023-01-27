package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p037t.C1663a;

public abstract class StatsEvent extends C1663a implements ReflectedParcelable {
    /* renamed from: d */
    public abstract int mo6572d();

    /* renamed from: f */
    public abstract long mo6573f();

    /* renamed from: h */
    public abstract long mo6574h();

    /* renamed from: i */
    public abstract String mo6575i();

    public String toString() {
        long f = mo6573f();
        int d = mo6572d();
        long h = mo6574h();
        String i = mo6575i();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 53);
        sb.append(f);
        sb.append("\t");
        sb.append(d);
        sb.append("\t");
        sb.append(h);
        sb.append(i);
        return sb.toString();
    }
}
