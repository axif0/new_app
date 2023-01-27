package p148g.p189d.p190a.p200b.p219o0.p227t;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4155e;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.o0.t.i */
final class C4216i implements C4155e {

    /* renamed from: f */
    private final List<C4208e> f13484f;

    /* renamed from: g */
    private final int f13485g;

    /* renamed from: h */
    private final long[] f13486h;

    /* renamed from: i */
    private final long[] f13487i;

    public C4216i(List<C4208e> list) {
        this.f13484f = list;
        int size = list.size();
        this.f13485g = size;
        this.f13486h = new long[(size * 2)];
        for (int i = 0; i < this.f13485g; i++) {
            C4208e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f13486h;
            jArr[i2] = eVar.f13455r;
            jArr[i2 + 1] = eVar.f13456s;
        }
        long[] jArr2 = this.f13486h;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13487i = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: e */
    public int mo13194e(long j) {
        int c = C4284w.m18237c(this.f13487i, j, false, false);
        if (c < this.f13487i.length) {
            return c;
        }
        return -1;
    }

    /* renamed from: g */
    public long mo13195g(int i) {
        boolean z = true;
        C4260a.m18069a(i >= 0);
        if (i >= this.f13487i.length) {
            z = false;
        }
        C4260a.m18069a(z);
        return this.f13487i[i];
    }

    /* renamed from: h */
    public List<C4152b> mo13196h(long j) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        C4208e eVar = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.f13485g; i++) {
            long[] jArr = this.f13486h;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C4208e eVar2 = this.f13484f.get(i);
                if (!eVar2.mo13309e()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(eVar.f13179f).append("\n");
                    } else {
                        append = spannableStringBuilder.append("\n");
                    }
                    append.append(eVar2.f13179f);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C4208e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: i */
    public int mo13197i() {
        return this.f13487i.length;
    }
}
