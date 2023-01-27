package p340io.realm.internal.p341s;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import p340io.realm.RealmFieldType;
import p340io.realm.internal.Table;

/* renamed from: io.realm.internal.s.b */
class C5729b extends C5730c {

    /* renamed from: m */
    private final Table f16547m;

    C5729b(Table table, String str, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        super(str, set, set2);
        this.f16547m = table;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16658a(List<String> list) {
        int size = list.size();
        long[] jArr = new long[size];
        Table table = this.f16547m;
        String str = null;
        String str2 = null;
        RealmFieldType realmFieldType = null;
        int i = 0;
        while (i < size) {
            str2 = list.get(i);
            if (str2 == null || str2.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            str = table.mo16549f();
            long i2 = table.mo16551i(str2);
            if (i2 >= 0) {
                realmFieldType = table.mo16553k(i2);
                if (i < size - 1) {
                    mo16664l(str, str2, realmFieldType);
                    table = table.mo16554l(i2);
                }
                jArr[i] = i2;
                i++;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in table '%s'.", new Object[]{str2, str}));
            }
        }
        mo16663j(str, str2, realmFieldType, jArr, new long[size]);
    }
}
