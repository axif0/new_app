package com.bumptech.glide.load.p008o.p009a0;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p029s.C1402k;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.o.a0.n */
public class C1061n implements C1059l {

    /* renamed from: d */
    private static final Bitmap.Config[] f4048d;

    /* renamed from: e */
    private static final Bitmap.Config[] f4049e;

    /* renamed from: f */
    private static final Bitmap.Config[] f4050f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f4051g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f4052h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C1064c f4053a = new C1064c();

    /* renamed from: b */
    private final C1050h<C1063b, Bitmap> f4054b = new C1050h<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f4055c = new HashMap();

    /* renamed from: com.bumptech.glide.load.o.a0.n$a */
    static /* synthetic */ class C1062a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4056a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4056a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4056a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4056a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4056a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p008o.p009a0.C1061n.C1062a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.n$b */
    static final class C1063b implements C1060m {

        /* renamed from: a */
        private final C1064c f4057a;

        /* renamed from: b */
        int f4058b;

        /* renamed from: c */
        private Bitmap.Config f4059c;

        public C1063b(C1064c cVar) {
            this.f4057a = cVar;
        }

        /* renamed from: a */
        public void mo5236a() {
            this.f4057a.mo5245c(this);
        }

        /* renamed from: b */
        public void mo5272b(int i, Bitmap.Config config) {
            this.f4058b = i;
            this.f4059c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1063b)) {
                return false;
            }
            C1063b bVar = (C1063b) obj;
            return this.f4058b == bVar.f4058b && C1402k.m6976c(this.f4059c, bVar.f4059c);
        }

        public int hashCode() {
            int i = this.f4058b * 31;
            Bitmap.Config config = this.f4059c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1061n.m5768i(this.f4058b, this.f4059c);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.n$c */
    static class C1064c extends C1046d<C1063b> {
        C1064c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1063b mo5241a() {
            return new C1063b(this);
        }

        /* renamed from: e */
        public C1063b mo5277e(int i, Bitmap.Config config) {
            C1063b bVar = (C1063b) mo5244b();
            bVar.mo5272b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f4048d = configArr;
        f4049e = configArr;
    }

    /* renamed from: g */
    private void m5766g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = m5770k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo5234f(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    private C1063b m5767h(int i, Bitmap.Config config) {
        C1063b e = this.f4053a.mo5277e(i, config);
        Bitmap.Config[] j = m5769j(config);
        int length = j.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = j[i2];
            Integer ceilingKey = m5770k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f4053a.mo5245c(e);
                return this.f4053a.mo5277e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: i */
    static String m5768i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: j */
    private static Bitmap.Config[] m5769j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f4049e;
        }
        int i = C1062a.f4056a[config.ordinal()];
        if (i == 1) {
            return f4048d;
        }
        if (i == 2) {
            return f4050f;
        }
        if (i == 3) {
            return f4051g;
        }
        if (i == 4) {
            return f4052h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: k */
    private NavigableMap<Integer, Integer> m5770k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f4055c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4055c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public String mo5229a(int i, int i2, Bitmap.Config config) {
        return m5768i(C1402k.m6979f(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo5230b(Bitmap bitmap) {
        return C1402k.m6980g(bitmap);
    }

    /* renamed from: c */
    public Bitmap mo5231c(int i, int i2, Bitmap.Config config) {
        C1063b h = m5767h(C1402k.m6979f(i, i2, config), config);
        Bitmap a = this.f4054b.mo5253a(h);
        if (a != null) {
            m5766g(Integer.valueOf(h.f4058b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: d */
    public void mo5232d(Bitmap bitmap) {
        C1063b e = this.f4053a.mo5277e(C1402k.m6980g(bitmap), bitmap.getConfig());
        this.f4054b.mo5254d(e, bitmap);
        NavigableMap<Integer, Integer> k = m5770k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e.f4058b));
        Integer valueOf = Integer.valueOf(e.f4058b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: e */
    public Bitmap mo5233e() {
        Bitmap f = this.f4054b.mo5255f();
        if (f != null) {
            m5766g(Integer.valueOf(C1402k.m6980g(f)), f);
        }
        return f;
    }

    /* renamed from: f */
    public String mo5234f(Bitmap bitmap) {
        return m5768i(C1402k.m6980g(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f4054b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f4055c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f4055c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), BuildConfig.FLAVOR);
        }
        sb.append(")}");
        return sb.toString();
    }
}
