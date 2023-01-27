package p340io.realm.internal.p341s;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import p340io.realm.RealmFieldType;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.Table;

/* renamed from: io.realm.internal.s.c */
public abstract class C5730c {

    /* renamed from: h */
    private static final Pattern f16548h = Pattern.compile("\\.");

    /* renamed from: i */
    public static final Set<RealmFieldType> f16549i;

    /* renamed from: j */
    public static final Set<RealmFieldType> f16550j;

    /* renamed from: k */
    public static final Set<RealmFieldType> f16551k;

    /* renamed from: l */
    public static final Set<RealmFieldType> f16552l = Collections.emptySet();

    /* renamed from: a */
    private final List<String> f16553a;

    /* renamed from: b */
    private final Set<RealmFieldType> f16554b;

    /* renamed from: c */
    private final Set<RealmFieldType> f16555c;

    /* renamed from: d */
    private String f16556d;

    /* renamed from: e */
    private RealmFieldType f16557e;

    /* renamed from: f */
    private long[] f16558f;

    /* renamed from: g */
    private long[] f16559g;

    /* renamed from: io.realm.internal.s.c$a */
    public interface C5731a {
        /* renamed from: a */
        C5704c mo16665a(String str);

        /* renamed from: b */
        boolean mo16666b();

        /* renamed from: c */
        long mo16667c(String str);
    }

    static {
        HashSet hashSet = new HashSet(3);
        hashSet.add(RealmFieldType.OBJECT);
        hashSet.add(RealmFieldType.LIST);
        hashSet.add(RealmFieldType.LINKING_OBJECTS);
        f16549i = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(RealmFieldType.OBJECT);
        hashSet2.add(RealmFieldType.LIST);
        f16550j = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(RealmFieldType.LIST);
        Collections.unmodifiableSet(hashSet3);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(RealmFieldType.OBJECT);
        f16551k = Collections.unmodifiableSet(hashSet4);
    }

    protected C5730c(String str, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        List<String> i = m23954i(str);
        this.f16553a = i;
        if (i.size() > 0) {
            this.f16554b = set;
            this.f16555c = set2;
            return;
        }
        throw new IllegalArgumentException("Invalid query: Empty field descriptor");
    }

    /* renamed from: b */
    private void m23951b() {
        if (this.f16557e == null) {
            mo16658a(this.f16553a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: io.realm.internal.s.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: io.realm.internal.s.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: io.realm.internal.s.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: io.realm.internal.s.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p340io.realm.internal.p341s.C5730c m23952c(p340io.realm.internal.p341s.C5730c.C5731a r7, p340io.realm.internal.Table r8, java.lang.String r9, java.util.Set<p340io.realm.RealmFieldType> r10, java.util.Set<p340io.realm.RealmFieldType> r11) {
        /*
            if (r7 == 0) goto L_0x001d
            boolean r0 = r7.mo16666b()
            if (r0 != 0) goto L_0x0009
            goto L_0x001d
        L_0x0009:
            io.realm.internal.s.a r0 = new io.realm.internal.s.a
            java.lang.String r3 = r8.mo16549f()
            if (r10 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.util.Set<io.realm.RealmFieldType> r10 = f16549i
        L_0x0014:
            r5 = r10
            r1 = r0
            r2 = r7
            r4 = r9
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0027
        L_0x001d:
            io.realm.internal.s.b r0 = new io.realm.internal.s.b
            if (r10 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            java.util.Set<io.realm.RealmFieldType> r10 = f16550j
        L_0x0024:
            r0.<init>(r8, r9, r10, r11)
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.internal.p341s.C5730c.m23952c(io.realm.internal.s.c$a, io.realm.internal.Table, java.lang.String, java.util.Set, java.util.Set):io.realm.internal.s.c");
    }

    /* renamed from: d */
    public static C5730c m23953d(C5731a aVar, Table table, String str, RealmFieldType... realmFieldTypeArr) {
        return m23952c(aVar, table, str, (Set<RealmFieldType>) null, new HashSet(Arrays.asList(realmFieldTypeArr)));
    }

    /* renamed from: i */
    private List<String> m23954i(String str) {
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            throw new IllegalArgumentException("Invalid query: field name is empty");
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != str.length() - 1) {
            return lastIndexOf > -1 ? Arrays.asList(f16548h.split(str)) : Collections.singletonList(str);
        }
        throw new IllegalArgumentException("Invalid query: field name must not end with a period ('.')");
    }

    /* renamed from: k */
    private void m23955k(String str, String str2, RealmFieldType realmFieldType, Set<RealmFieldType> set) {
        if (!set.contains(realmFieldType)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' in class '%s' is of invalid type '%s'.", new Object[]{str2, str, realmFieldType.toString()}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16658a(List<String> list);

    /* renamed from: e */
    public final long[] mo16659e() {
        m23951b();
        long[] jArr = this.f16558f;
        return Arrays.copyOf(jArr, jArr.length);
    }

    /* renamed from: f */
    public final String mo16660f() {
        m23951b();
        return this.f16556d;
    }

    /* renamed from: g */
    public final RealmFieldType mo16661g() {
        m23951b();
        return this.f16557e;
    }

    /* renamed from: h */
    public final long[] mo16662h() {
        m23951b();
        long[] jArr = this.f16559g;
        return Arrays.copyOf(jArr, jArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo16663j(String str, String str2, RealmFieldType realmFieldType, long[] jArr, long[] jArr2) {
        Set<RealmFieldType> set = this.f16555c;
        if (set != null && set.size() > 0) {
            m23955k(str, str2, realmFieldType, this.f16555c);
        }
        this.f16556d = str2;
        this.f16557e = realmFieldType;
        this.f16558f = jArr;
        this.f16559g = jArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo16664l(String str, String str2, RealmFieldType realmFieldType) {
        m23955k(str, str2, realmFieldType, this.f16554b);
    }
}
