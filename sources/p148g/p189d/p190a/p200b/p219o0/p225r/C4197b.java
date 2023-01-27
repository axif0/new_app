package p148g.p189d.p190a.p200b.p219o0.p225r;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.o0.r.b */
final class C4197b {

    /* renamed from: a */
    public final String f13384a;

    /* renamed from: b */
    public final String f13385b;

    /* renamed from: c */
    public final boolean f13386c;

    /* renamed from: d */
    public final long f13387d;

    /* renamed from: e */
    public final long f13388e;

    /* renamed from: f */
    public final C4200e f13389f;

    /* renamed from: g */
    public final String f13390g;

    /* renamed from: h */
    private final String[] f13391h;

    /* renamed from: i */
    private final HashMap<String, Integer> f13392i;

    /* renamed from: j */
    private final HashMap<String, Integer> f13393j;

    /* renamed from: k */
    private List<C4197b> f13394k;

    private C4197b(String str, String str2, long j, long j2, C4200e eVar, String[] strArr, String str3) {
        this.f13384a = str;
        this.f13385b = str2;
        this.f13389f = eVar;
        this.f13391h = strArr;
        this.f13386c = str2 != null;
        this.f13387d = j;
        this.f13388e = j2;
        C4260a.m18073e(str3);
        this.f13390g = str3;
        this.f13392i = new HashMap<>();
        this.f13393j = new HashMap<>();
    }

    /* renamed from: b */
    private void m17776b(Map<String, C4200e> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        C4200e d;
        if (i != i2 && (d = C4199d.m17793d(this.f13389f, this.f13391h, map)) != null) {
            C4199d.m17790a(spannableStringBuilder, i, i2, d);
        }
    }

    /* renamed from: c */
    public static C4197b m17777c(String str, long j, long j2, C4200e eVar, String[] strArr, String str2) {
        return new C4197b(str, (String) null, j, j2, eVar, strArr, str2);
    }

    /* renamed from: d */
    public static C4197b m17778d(String str) {
        return new C4197b((String) null, C4199d.m17791b(str), -9223372036854775807L, -9223372036854775807L, (C4200e) null, (String[]) null, BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    private SpannableStringBuilder m17779e(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int length = spannableStringBuilder.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == 10) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == 10) {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }

    /* renamed from: i */
    private void m17780i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f13384a);
        if (z || equals) {
            long j = this.f13387d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f13388e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f13394k != null) {
            for (int i = 0; i < this.f13394k.size(); i++) {
                this.f13394k.get(i).m17780i(treeSet, z || equals);
            }
        }
    }

    /* renamed from: k */
    private static SpannableStringBuilder m17781k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    /* renamed from: m */
    private void m17782m(Map<String, C4200e> map, Map<String, SpannableStringBuilder> map2) {
        for (Map.Entry next : this.f13393j.entrySet()) {
            String str = (String) next.getKey();
            m17776b(map, map2.get(str), this.f13392i.containsKey(str) ? this.f13392i.get(str).intValue() : 0, ((Integer) next.getValue()).intValue());
            for (int i = 0; i < mo13256g(); i++) {
                mo13255f(i).m17782m(map, map2);
            }
        }
    }

    /* renamed from: n */
    private void m17783n(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f13392i.clear();
        this.f13393j.clear();
        String str2 = this.f13390g;
        if (!BuildConfig.FLAVOR.equals(str2)) {
            str = str2;
        }
        if (this.f13386c && z) {
            m17781k(str, map).append(this.f13385b);
        } else if ("br".equals(this.f13384a) && z) {
            m17781k(str, map).append(10);
        } else if (!"metadata".equals(this.f13384a) && mo13259l(j)) {
            boolean equals = "p".equals(this.f13384a);
            for (Map.Entry next : map.entrySet()) {
                this.f13392i.put(next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
            }
            for (int i = 0; i < mo13256g(); i++) {
                mo13255f(i).m17783n(j, z || equals, str, map);
            }
            if (equals) {
                C4199d.m17792c(m17781k(str, map));
            }
            for (Map.Entry next2 : map.entrySet()) {
                this.f13393j.put(next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
            }
        }
    }

    /* renamed from: a */
    public void mo13254a(C4197b bVar) {
        if (this.f13394k == null) {
            this.f13394k = new ArrayList();
        }
        this.f13394k.add(bVar);
    }

    /* renamed from: f */
    public C4197b mo13255f(int i) {
        List<C4197b> list = this.f13394k;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo13256g() {
        List<C4197b> list = this.f13394k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C4152b> mo13257h(long j, Map<String, C4200e> map, Map<String, C4198c> map2) {
        TreeMap treeMap = new TreeMap();
        m17783n(j, false, this.f13390g, treeMap);
        m17782m(map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            C4198c cVar = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            m17779e(spannableStringBuilder);
            arrayList.add(new C4152b(spannableStringBuilder, (Layout.Alignment) null, cVar.f13397c, cVar.f13398d, cVar.f13399e, cVar.f13396b, Integer.MIN_VALUE, cVar.f13400f));
        }
        return arrayList;
    }

    /* renamed from: j */
    public long[] mo13258j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m17780i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public boolean mo13259l(long j) {
        return (this.f13387d == -9223372036854775807L && this.f13388e == -9223372036854775807L) || (this.f13387d <= j && this.f13388e == -9223372036854775807L) || ((this.f13387d == -9223372036854775807L && j < this.f13388e) || (this.f13387d <= j && j < this.f13388e));
    }
}
