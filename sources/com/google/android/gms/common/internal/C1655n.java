package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.n */
public final class C1655n {

    /* renamed from: com.google.android.gms.common.internal.n$a */
    public static final class C1656a {

        /* renamed from: a */
        private final List<String> f5523a;

        /* renamed from: b */
        private final Object f5524b;

        private C1656a(Object obj) {
            C1658o.m7845j(obj);
            this.f5524b = obj;
            this.f5523a = new ArrayList();
        }

        /* renamed from: a */
        public final C1656a mo6552a(String str, Object obj) {
            List<String> list = this.f5523a;
            C1658o.m7845j(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f5524b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f5523a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f5523a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m7832a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    public static int m7833b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C1656a m7834c(Object obj) {
        return new C1656a(obj);
    }
}
