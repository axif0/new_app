package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p086f.p111h.p118i.C3309b;

/* renamed from: androidx.recyclerview.widget.h */
final class C0903h implements Runnable {

    /* renamed from: j */
    static final ThreadLocal<C0903h> f3636j = new ThreadLocal<>();

    /* renamed from: k */
    static Comparator<C0906c> f3637k = new C0904a();

    /* renamed from: f */
    ArrayList<RecyclerView> f3638f = new ArrayList<>();

    /* renamed from: g */
    long f3639g;

    /* renamed from: h */
    long f3640h;

    /* renamed from: i */
    private ArrayList<C0906c> f3641i = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    static class C0904a implements Comparator<C0906c> {
        C0904a() {
        }

        /* renamed from: a */
        public int compare(C0906c cVar, C0906c cVar2) {
            if ((cVar.f3649d == null) != (cVar2.f3649d == null)) {
                return cVar.f3649d == null ? 1 : -1;
            }
            boolean z = cVar.f3646a;
            if (z != cVar2.f3646a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f3647b - cVar.f3647b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f3648c - cVar2.f3648c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.h$b */
    static class C0905b implements RecyclerView.C0843o.C0846c {

        /* renamed from: a */
        int f3642a;

        /* renamed from: b */
        int f3643b;

        /* renamed from: c */
        int[] f3644c;

        /* renamed from: d */
        int f3645d;

        C0905b() {
        }

        /* renamed from: a */
        public void mo4516a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3645d * 2;
                int[] iArr = this.f3644c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3644c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f3644c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3644c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f3645d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4784b() {
            int[] iArr = this.f3644c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3645d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4785c(RecyclerView recyclerView, boolean z) {
            this.f3645d = 0;
            int[] iArr = this.f3644c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0843o oVar = recyclerView.f3313r;
            if (recyclerView.f3311q != null && oVar != null && oVar.mo4501u0()) {
                if (z) {
                    if (!recyclerView.f3295i.mo4691p()) {
                        oVar.mo4077p(recyclerView.f3311q.mo3963e(), this);
                    }
                } else if (!recyclerView.mo4204m0()) {
                    oVar.mo4075o(this.f3642a, this.f3643b, recyclerView.f3304m0, this);
                }
                int i = this.f3645d;
                if (i > oVar.f3402m) {
                    oVar.f3402m = i;
                    oVar.f3403n = z;
                    recyclerView.f3291g.mo4549K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4786d(int i) {
            if (this.f3644c != null) {
                int i2 = this.f3645d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3644c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4787e(int i, int i2) {
            this.f3642a = i;
            this.f3643b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    static class C0906c {

        /* renamed from: a */
        public boolean f3646a;

        /* renamed from: b */
        public int f3647b;

        /* renamed from: c */
        public int f3648c;

        /* renamed from: d */
        public RecyclerView f3649d;

        /* renamed from: e */
        public int f3650e;

        C0906c() {
        }

        /* renamed from: a */
        public void mo4788a() {
            this.f3646a = false;
            this.f3647b = 0;
            this.f3648c = 0;
            this.f3649d = null;
            this.f3650e = 0;
        }
    }

    C0903h() {
    }

    /* renamed from: b */
    private void m5019b() {
        C0906c cVar;
        int size = this.f3638f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f3638f.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3302l0.mo4785c(recyclerView, false);
                i += recyclerView.f3302l0.f3645d;
            }
        }
        this.f3641i.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f3638f.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0905b bVar = recyclerView2.f3302l0;
                int abs = Math.abs(bVar.f3642a) + Math.abs(bVar.f3643b);
                for (int i5 = 0; i5 < bVar.f3645d * 2; i5 += 2) {
                    if (i3 >= this.f3641i.size()) {
                        cVar = new C0906c();
                        this.f3641i.add(cVar);
                    } else {
                        cVar = this.f3641i.get(i3);
                    }
                    int i6 = bVar.f3644c[i5 + 1];
                    cVar.f3646a = i6 <= abs;
                    cVar.f3647b = abs;
                    cVar.f3648c = i6;
                    cVar.f3649d = recyclerView2;
                    cVar.f3650e = bVar.f3644c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3641i, f3637k);
    }

    /* renamed from: c */
    private void m5020c(C0906c cVar, long j) {
        RecyclerView.C0829d0 i = m5024i(cVar.f3649d, cVar.f3650e, cVar.f3646a ? Long.MAX_VALUE : j);
        if (i != null && i.f3360b != null && i.mo4326s() && !i.mo4327t()) {
            m5023h((RecyclerView) i.f3360b.get(), j);
        }
    }

    /* renamed from: d */
    private void m5021d(long j) {
        int i = 0;
        while (i < this.f3641i.size()) {
            C0906c cVar = this.f3641i.get(i);
            if (cVar.f3649d != null) {
                m5020c(cVar, j);
                cVar.mo4788a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m5022e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f3297j.mo4717j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.C0829d0 g0 = RecyclerView.m4223g0(recyclerView.f3297j.mo4716i(i2));
            if (g0.f3361c == i && !g0.mo4327t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m5023h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3269I && recyclerView.f3297j.mo4717j() != 0) {
                recyclerView.mo4135V0();
            }
            C0905b bVar = recyclerView.f3302l0;
            bVar.mo4785c(recyclerView, true);
            if (bVar.f3645d != 0) {
                try {
                    C3309b.m14261a("RV Nested Prefetch");
                    recyclerView.f3304m0.mo4282f(recyclerView.f3311q);
                    for (int i = 0; i < bVar.f3645d * 2; i += 2) {
                        m5024i(recyclerView, bVar.f3644c[i], j);
                    }
                } finally {
                    C3309b.m14262b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.C0829d0 m5024i(RecyclerView recyclerView, int i, long j) {
        if (m5022e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0855v vVar = recyclerView.f3291g;
        try {
            recyclerView.mo4117H0();
            RecyclerView.C0829d0 I = vVar.mo4547I(i, false, j);
            if (I != null) {
                if (!I.mo4326s() || I.mo4327t()) {
                    vVar.mo4552a(I, false);
                } else {
                    vVar.mo4541B(I.f3359a);
                }
            }
            return I;
        } finally {
            recyclerView.mo4121J0(false);
        }
    }

    /* renamed from: a */
    public void mo4777a(RecyclerView recyclerView) {
        this.f3638f.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4778f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3639g == 0) {
            this.f3639g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3302l0.mo4787e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4779g(long j) {
        m5019b();
        m5021d(j);
    }

    /* renamed from: j */
    public void mo4780j(RecyclerView recyclerView) {
        this.f3638f.remove(recyclerView);
    }

    public void run() {
        try {
            C3309b.m14261a("RV Prefetch");
            if (!this.f3638f.isEmpty()) {
                int size = this.f3638f.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3638f.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo4779g(TimeUnit.MILLISECONDS.toNanos(j) + this.f3640h);
                    this.f3639g = 0;
                    C3309b.m14262b();
                }
            }
        } finally {
            this.f3639g = 0;
            C3309b.m14262b();
        }
    }
}
