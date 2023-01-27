package com.bumptech.glide.load.p012p;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.p.j */
public final class C1178j implements C1176h {

    /* renamed from: b */
    private final Map<String, List<C1177i>> f4344b;

    /* renamed from: c */
    private volatile Map<String, String> f4345c;

    /* renamed from: com.bumptech.glide.load.p.j$a */
    public static final class C1179a {

        /* renamed from: b */
        private static final String f4346b = m6129b();

        /* renamed from: c */
        private static final Map<String, List<C1177i>> f4347c;

        /* renamed from: a */
        private Map<String, List<C1177i>> f4348a = f4347c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f4346b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1180b(f4346b)));
            }
            f4347c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m6129b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C1178j mo5491a() {
            return new C1178j(this.f4348a);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.j$b */
    static final class C1180b implements C1177i {

        /* renamed from: a */
        private final String f4349a;

        C1180b(String str) {
            this.f4349a = str;
        }

        /* renamed from: a */
        public String mo5487a() {
            return this.f4349a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1180b) {
                return this.f4349a.equals(((C1180b) obj).f4349a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4349a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f4349a + '\'' + '}';
        }
    }

    C1178j(Map<String, List<C1177i>> map) {
        this.f4344b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m6126b(List<C1177i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo5487a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m6127c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f4344b.entrySet()) {
            String b = m6126b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo5486a() {
        if (this.f4345c == null) {
            synchronized (this) {
                if (this.f4345c == null) {
                    this.f4345c = Collections.unmodifiableMap(m6127c());
                }
            }
        }
        return this.f4345c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1178j) {
            return this.f4344b.equals(((C1178j) obj).f4344b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4344b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f4344b + '}';
    }
}
