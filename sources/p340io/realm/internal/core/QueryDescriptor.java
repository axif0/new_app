package p340io.realm.internal.core;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p340io.realm.C5793t0;
import p340io.realm.RealmFieldType;
import p340io.realm.internal.Keep;
import p340io.realm.internal.Table;
import p340io.realm.internal.p341s.C5730c;

@Keep
/* renamed from: io.realm.internal.core.QueryDescriptor */
public class QueryDescriptor {
    public static final Set<RealmFieldType> DISTINCT_VALID_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new RealmFieldType[]{RealmFieldType.BOOLEAN, RealmFieldType.INTEGER, RealmFieldType.STRING, RealmFieldType.DATE})));
    public static final Set<RealmFieldType> SORT_VALID_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new RealmFieldType[]{RealmFieldType.BOOLEAN, RealmFieldType.INTEGER, RealmFieldType.FLOAT, RealmFieldType.DOUBLE, RealmFieldType.STRING, RealmFieldType.DATE})));
    private final boolean[] ascendings;
    private final long[][] columnIndices;
    private final Table table;

    private QueryDescriptor(Table table2, long[][] jArr, C5793t0[] t0VarArr) {
        this.table = table2;
        this.columnIndices = jArr;
        if (t0VarArr != null) {
            this.ascendings = new boolean[t0VarArr.length];
            for (int i = 0; i < t0VarArr.length; i++) {
                this.ascendings[i] = t0VarArr[i].mo16794e();
            }
            return;
        }
        this.ascendings = null;
    }

    private static void checkFieldType(C5730c cVar, Set<RealmFieldType> set, String str, String str2) {
        if (!set.contains(cVar.mo16661g())) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s on '%s' field '%s' in '%s'.", new Object[]{str, cVar.mo16661g(), cVar.mo16660f(), str2}));
        }
    }

    private static QueryDescriptor getInstance(C5730c.C5731a aVar, Table table2, String[] strArr, C5793t0[] t0VarArr, Set<RealmFieldType> set, Set<RealmFieldType> set2, String str) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one field name.");
        }
        long[][] jArr = new long[strArr.length][];
        for (int i = 0; i < strArr.length; i++) {
            C5730c c = C5730c.m23952c(aVar, table2, strArr[i], set, (Set<RealmFieldType>) null);
            checkFieldType(c, set2, str, strArr[i]);
            jArr[i] = c.mo16659e();
        }
        return new QueryDescriptor(table2, jArr, t0VarArr);
    }

    public static QueryDescriptor getInstanceForDistinct(C5730c.C5731a aVar, Table table2, String str) {
        return getInstanceForDistinct(aVar, table2, new String[]{str});
    }

    public static QueryDescriptor getInstanceForDistinct(C5730c.C5731a aVar, Table table2, String[] strArr) {
        return getInstance(aVar, table2, strArr, (C5793t0[]) null, C5730c.f16552l, DISTINCT_VALID_FIELD_TYPES, "Distinct is not supported");
    }

    public static QueryDescriptor getInstanceForSort(C5730c.C5731a aVar, Table table2, String str, C5793t0 t0Var) {
        return getInstanceForSort(aVar, table2, new String[]{str}, new C5793t0[]{t0Var});
    }

    public static QueryDescriptor getInstanceForSort(C5730c.C5731a aVar, Table table2, String[] strArr, C5793t0[] t0VarArr) {
        if (t0VarArr == null || t0VarArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        } else if (strArr.length == t0VarArr.length) {
            return getInstance(aVar, table2, strArr, t0VarArr, C5730c.f16551k, SORT_VALID_FIELD_TYPES, "Sort is not supported");
        } else {
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
    }

    private long getTablePtr() {
        return this.table.getNativePtr();
    }

    public static QueryDescriptor getTestInstance(Table table2, long[] jArr) {
        return new QueryDescriptor(table2, new long[][]{jArr}, (C5793t0[]) null);
    }

    @SuppressFBWarnings({"EI_EXPOSE_REP"})
    public boolean[] getAscendings() {
        return this.ascendings;
    }

    @SuppressFBWarnings({"EI_EXPOSE_REP"})
    public long[][] getColumnIndices() {
        return this.columnIndices;
    }
}
