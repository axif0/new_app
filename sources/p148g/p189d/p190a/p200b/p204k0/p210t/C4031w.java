package p148g.p189d.p190a.p200b.p204k0.p210t;

import android.util.SparseArray;
import com.karumi.dexter.BuildConfig;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3917g;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4282u;

/* renamed from: g.d.a.b.k0.t.w */
public interface C4031w {

    /* renamed from: g.d.a.b.k0.t.w$a */
    public static final class C4032a {

        /* renamed from: a */
        public final String f12711a;

        /* renamed from: b */
        public final byte[] f12712b;

        public C4032a(String str, int i, byte[] bArr) {
            this.f12711a = str;
            this.f12712b = bArr;
        }
    }

    /* renamed from: g.d.a.b.k0.t.w$b */
    public static final class C4033b {

        /* renamed from: a */
        public final int f12713a;

        /* renamed from: b */
        public final String f12714b;

        /* renamed from: c */
        public final List<C4032a> f12715c;

        /* renamed from: d */
        public final byte[] f12716d;

        public C4033b(int i, String str, List<C4032a> list, byte[] bArr) {
            this.f12713a = i;
            this.f12714b = str;
            this.f12715c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f12716d = bArr;
        }
    }

    /* renamed from: g.d.a.b.k0.t.w$c */
    public interface C4034c {
        /* renamed from: a */
        SparseArray<C4031w> mo12852a();

        /* renamed from: b */
        C4031w mo12853b(int i, C4033b bVar);
    }

    /* renamed from: g.d.a.b.k0.t.w$d */
    public static final class C4035d {

        /* renamed from: a */
        private final String f12717a;

        /* renamed from: b */
        private final int f12718b;

        /* renamed from: c */
        private final int f12719c;

        /* renamed from: d */
        private int f12720d;

        /* renamed from: e */
        private String f12721e;

        public C4035d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C4035d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = BuildConfig.FLAVOR;
            }
            this.f12717a = str;
            this.f12718b = i2;
            this.f12719c = i3;
            this.f12720d = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        private void m17034d() {
            if (this.f12720d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void mo12886a() {
            int i = this.f12720d;
            this.f12720d = i == Integer.MIN_VALUE ? this.f12718b : i + this.f12719c;
            this.f12721e = this.f12717a + this.f12720d;
        }

        /* renamed from: b */
        public String mo12887b() {
            m17034d();
            return this.f12721e;
        }

        /* renamed from: c */
        public int mo12888c() {
            m17034d();
            return this.f12720d;
        }
    }

    /* renamed from: a */
    void mo12877a();

    /* renamed from: b */
    void mo12878b(C4282u uVar, C3917g gVar, C4035d dVar);

    /* renamed from: c */
    void mo12879c(C4274m mVar, boolean z) throws C4313u;
}
