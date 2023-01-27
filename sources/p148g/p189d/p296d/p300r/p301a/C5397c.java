package p148g.p189d.p296d.p300r.p301a;

import android.content.Intent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p148g.p189d.p296d.C5369a;

/* renamed from: g.d.d.r.a.c */
public final class C5397c {

    /* renamed from: a */
    private static final Pattern f15614a = Pattern.compile(",");

    /* renamed from: b */
    static final Set<C5369a> f15615b = EnumSet.of(C5369a.UPC_A, new C5369a[]{C5369a.UPC_E, C5369a.EAN_13, C5369a.EAN_8, C5369a.RSS_14, C5369a.RSS_EXPANDED});

    /* renamed from: c */
    static final Set<C5369a> f15616c = EnumSet.of(C5369a.CODE_39, C5369a.CODE_93, C5369a.CODE_128, C5369a.ITF, C5369a.CODABAR);

    /* renamed from: d */
    private static final Set<C5369a> f15617d;

    /* renamed from: e */
    static final Set<C5369a> f15618e = EnumSet.of(C5369a.QR_CODE);

    /* renamed from: f */
    static final Set<C5369a> f15619f = EnumSet.of(C5369a.DATA_MATRIX);

    /* renamed from: g */
    static final Set<C5369a> f15620g = EnumSet.of(C5369a.AZTEC);

    /* renamed from: h */
    static final Set<C5369a> f15621h = EnumSet.of(C5369a.PDF_417);

    /* renamed from: i */
    private static final Map<String, Set<C5369a>> f15622i;

    static {
        EnumSet<C5369a> copyOf = EnumSet.copyOf(f15615b);
        f15617d = copyOf;
        copyOf.addAll(f15616c);
        HashMap hashMap = new HashMap();
        f15622i = hashMap;
        hashMap.put("ONE_D_MODE", f15617d);
        f15622i.put("PRODUCT_MODE", f15615b);
        f15622i.put("QR_CODE_MODE", f15618e);
        f15622i.put("DATA_MATRIX_MODE", f15619f);
        f15622i.put("AZTEC_MODE", f15620g);
        f15622i.put("PDF417_MODE", f15621h);
    }

    /* renamed from: a */
    public static Set<C5369a> m22259a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m22260b(stringExtra != null ? Arrays.asList(f15614a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: b */
    private static Set<C5369a> m22260b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(C5369a.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(C5369a.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f15622i.get(str);
        }
        return null;
    }
}
