package p340io.realm.internal.p341s;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import p340io.realm.RealmFieldType;
import p340io.realm.internal.C5704c;
import p340io.realm.internal.p341s.C5730c;

/* renamed from: io.realm.internal.s.a */
class C5728a extends C5730c {

    /* renamed from: m */
    private final C5730c.C5731a f16545m;

    /* renamed from: n */
    private final String f16546n;

    C5728a(C5730c.C5731a aVar, String str, String str2, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        super(str2, set, set2);
        this.f16546n = str;
        this.f16545m = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16658a(List<String> list) {
        int size = list.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        String str = null;
        RealmFieldType realmFieldType = null;
        String str2 = this.f16546n;
        int i = 0;
        while (i < size) {
            str = list.get(i);
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            C5704c a = this.f16545m.mo16665a(str2);
            if (a != null) {
                C5704c.C5706b e = a.mo16620e(str);
                if (e != null) {
                    RealmFieldType realmFieldType2 = e.f16502b;
                    if (i < size - 1) {
                        mo16664l(str2, str, realmFieldType2);
                        str2 = e.f16503c;
                    }
                    jArr[i] = e.f16501a;
                    jArr2[i] = realmFieldType2 != RealmFieldType.LINKING_OBJECTS ? 0 : this.f16545m.mo16667c(e.f16503c);
                    i++;
                    realmFieldType = realmFieldType2;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in class '%s'.", new Object[]{str, str2}));
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: class '%s' not found in this schema.", new Object[]{str2}));
            }
        }
        mo16663j(str2, str, realmFieldType, jArr, jArr2);
    }
}
