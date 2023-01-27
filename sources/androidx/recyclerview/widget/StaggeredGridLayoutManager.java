package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p086f.p111h.p122m.p123c0.C3369c;

public class StaggeredGridLayoutManager extends RecyclerView.C0843o implements RecyclerView.C0860z.C0862b {

    /* renamed from: A */
    boolean f3450A = false;

    /* renamed from: B */
    private BitSet f3451B;

    /* renamed from: C */
    int f3452C = -1;

    /* renamed from: D */
    int f3453D = Integer.MIN_VALUE;

    /* renamed from: E */
    C0866d f3454E = new C0866d();

    /* renamed from: F */
    private int f3455F = 2;

    /* renamed from: G */
    private boolean f3456G;

    /* renamed from: H */
    private boolean f3457H;

    /* renamed from: I */
    private C0869e f3458I;

    /* renamed from: J */
    private int f3459J;

    /* renamed from: K */
    private final Rect f3460K = new Rect();

    /* renamed from: L */
    private final C0864b f3461L = new C0864b();

    /* renamed from: M */
    private boolean f3462M = false;

    /* renamed from: N */
    private boolean f3463N = true;

    /* renamed from: O */
    private int[] f3464O;

    /* renamed from: P */
    private final Runnable f3465P = new C0863a();

    /* renamed from: s */
    private int f3466s = -1;

    /* renamed from: t */
    C0871f[] f3467t;

    /* renamed from: u */
    C0913n f3468u;

    /* renamed from: v */
    C0913n f3469v;

    /* renamed from: w */
    private int f3470w;

    /* renamed from: x */
    private int f3471x;

    /* renamed from: y */
    private final C0907i f3472y;

    /* renamed from: z */
    boolean f3473z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0863a implements Runnable {
        C0863a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo4615S1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0864b {

        /* renamed from: a */
        int f3475a;

        /* renamed from: b */
        int f3476b;

        /* renamed from: c */
        boolean f3477c;

        /* renamed from: d */
        boolean f3478d;

        /* renamed from: e */
        boolean f3479e;

        /* renamed from: f */
        int[] f3480f;

        C0864b() {
            mo4628c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4626a() {
            this.f3476b = this.f3477c ? StaggeredGridLayoutManager.this.f3468u.mo4812i() : StaggeredGridLayoutManager.this.f3468u.mo4816m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4627b(int i) {
            this.f3476b = this.f3477c ? StaggeredGridLayoutManager.this.f3468u.mo4812i() - i : StaggeredGridLayoutManager.this.f3468u.mo4816m() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4628c() {
            this.f3475a = -1;
            this.f3476b = Integer.MIN_VALUE;
            this.f3477c = false;
            this.f3478d = false;
            this.f3479e = false;
            int[] iArr = this.f3480f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4629d(C0871f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3480f;
            if (iArr == null || iArr.length < length) {
                this.f3480f = new int[StaggeredGridLayoutManager.this.f3467t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3480f[i] = fVarArr[i].mo4675p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0865c extends RecyclerView.C0848p {

        /* renamed from: e */
        C0871f f3482e;

        /* renamed from: f */
        boolean f3483f;

        public C0865c(int i, int i2) {
            super(i, i2);
        }

        public C0865c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0865c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0865c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int mo4630e() {
            C0871f fVar = this.f3482e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3504e;
        }

        /* renamed from: f */
        public boolean mo4631f() {
            return this.f3483f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C0866d {

        /* renamed from: a */
        int[] f3484a;

        /* renamed from: b */
        List<C0867a> f3485b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C0867a implements Parcelable {
            public static final Parcelable.Creator<C0867a> CREATOR = new C0868a();

            /* renamed from: f */
            int f3486f;

            /* renamed from: g */
            int f3487g;

            /* renamed from: h */
            int[] f3488h;

            /* renamed from: i */
            boolean f3489i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C0868a implements Parcelable.Creator<C0867a> {
                C0868a() {
                }

                /* renamed from: a */
                public C0867a createFromParcel(Parcel parcel) {
                    return new C0867a(parcel);
                }

                /* renamed from: b */
                public C0867a[] newArray(int i) {
                    return new C0867a[i];
                }
            }

            C0867a() {
            }

            C0867a(Parcel parcel) {
                this.f3486f = parcel.readInt();
                this.f3487g = parcel.readInt();
                this.f3489i = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3488h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo4644a(int i) {
                int[] iArr = this.f3488h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3486f + ", mGapDir=" + this.f3487g + ", mHasUnwantedGapAfter=" + this.f3489i + ", mGapPerSpan=" + Arrays.toString(this.f3488h) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3486f);
                parcel.writeInt(this.f3487g);
                parcel.writeInt(this.f3489i ? 1 : 0);
                int[] iArr = this.f3488h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3488h);
            }
        }

        C0866d() {
        }

        /* renamed from: i */
        private int m4829i(int i) {
            if (this.f3485b == null) {
                return -1;
            }
            C0867a f = mo4637f(i);
            if (f != null) {
                this.f3485b.remove(f);
            }
            int size = this.f3485b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3485b.get(i2).f3486f >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3485b.remove(i2);
            return this.f3485b.get(i2).f3486f;
        }

        /* renamed from: l */
        private void m4830l(int i, int i2) {
            List<C0867a> list = this.f3485b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0867a aVar = this.f3485b.get(size);
                    int i3 = aVar.f3486f;
                    if (i3 >= i) {
                        aVar.f3486f = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m4831m(int i, int i2) {
            List<C0867a> list = this.f3485b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0867a aVar = this.f3485b.get(size);
                    int i4 = aVar.f3486f;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3485b.remove(size);
                        } else {
                            aVar.f3486f = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo4632a(C0867a aVar) {
            if (this.f3485b == null) {
                this.f3485b = new ArrayList();
            }
            int size = this.f3485b.size();
            for (int i = 0; i < size; i++) {
                C0867a aVar2 = this.f3485b.get(i);
                if (aVar2.f3486f == aVar.f3486f) {
                    this.f3485b.remove(i);
                }
                if (aVar2.f3486f >= aVar.f3486f) {
                    this.f3485b.add(i, aVar);
                    return;
                }
            }
            this.f3485b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4633b() {
            int[] iArr = this.f3484a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3485b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4634c(int i) {
            int[] iArr = this.f3484a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f3484a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo4643o(i)];
                this.f3484a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3484a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo4635d(int i) {
            List<C0867a> list = this.f3485b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3485b.get(size).f3486f >= i) {
                        this.f3485b.remove(size);
                    }
                }
            }
            return mo4639h(i);
        }

        /* renamed from: e */
        public C0867a mo4636e(int i, int i2, int i3, boolean z) {
            List<C0867a> list = this.f3485b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0867a aVar = this.f3485b.get(i4);
                int i5 = aVar.f3486f;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f3487g == i3 || (z && aVar.f3489i))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C0867a mo4637f(int i) {
            List<C0867a> list = this.f3485b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0867a aVar = this.f3485b.get(size);
                if (aVar.f3486f == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo4638g(int i) {
            int[] iArr = this.f3484a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4639h(int i) {
            int[] iArr = this.f3484a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m4829i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f3484a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3484a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f3484a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4640j(int i, int i2) {
            int[] iArr = this.f3484a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4634c(i3);
                int[] iArr2 = this.f3484a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3484a, i, i3, -1);
                m4830l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4641k(int i, int i2) {
            int[] iArr = this.f3484a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4634c(i3);
                int[] iArr2 = this.f3484a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3484a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m4831m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo4642n(int i, C0871f fVar) {
            mo4634c(i);
            this.f3484a[i] = fVar.f3504e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4643o(int i) {
            int length = this.f3484a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0869e implements Parcelable {
        public static final Parcelable.Creator<C0869e> CREATOR = new C0870a();

        /* renamed from: f */
        int f3490f;

        /* renamed from: g */
        int f3491g;

        /* renamed from: h */
        int f3492h;

        /* renamed from: i */
        int[] f3493i;

        /* renamed from: j */
        int f3494j;

        /* renamed from: k */
        int[] f3495k;

        /* renamed from: l */
        List<C0866d.C0867a> f3496l;

        /* renamed from: m */
        boolean f3497m;

        /* renamed from: n */
        boolean f3498n;

        /* renamed from: o */
        boolean f3499o;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C0870a implements Parcelable.Creator<C0869e> {
            C0870a() {
            }

            /* renamed from: a */
            public C0869e createFromParcel(Parcel parcel) {
                return new C0869e(parcel);
            }

            /* renamed from: b */
            public C0869e[] newArray(int i) {
                return new C0869e[i];
            }
        }

        public C0869e() {
        }

        C0869e(Parcel parcel) {
            this.f3490f = parcel.readInt();
            this.f3491g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3492h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3493i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3494j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3495k = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3497m = parcel.readInt() == 1;
            this.f3498n = parcel.readInt() == 1;
            this.f3499o = parcel.readInt() == 1 ? true : z;
            this.f3496l = parcel.readArrayList(C0866d.C0867a.class.getClassLoader());
        }

        public C0869e(C0869e eVar) {
            this.f3492h = eVar.f3492h;
            this.f3490f = eVar.f3490f;
            this.f3491g = eVar.f3491g;
            this.f3493i = eVar.f3493i;
            this.f3494j = eVar.f3494j;
            this.f3495k = eVar.f3495k;
            this.f3497m = eVar.f3497m;
            this.f3498n = eVar.f3498n;
            this.f3499o = eVar.f3499o;
            this.f3496l = eVar.f3496l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4652a() {
            this.f3493i = null;
            this.f3492h = 0;
            this.f3490f = -1;
            this.f3491g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4653b() {
            this.f3493i = null;
            this.f3492h = 0;
            this.f3494j = 0;
            this.f3495k = null;
            this.f3496l = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3490f);
            parcel.writeInt(this.f3491g);
            parcel.writeInt(this.f3492h);
            if (this.f3492h > 0) {
                parcel.writeIntArray(this.f3493i);
            }
            parcel.writeInt(this.f3494j);
            if (this.f3494j > 0) {
                parcel.writeIntArray(this.f3495k);
            }
            parcel.writeInt(this.f3497m ? 1 : 0);
            parcel.writeInt(this.f3498n ? 1 : 0);
            parcel.writeInt(this.f3499o ? 1 : 0);
            parcel.writeList(this.f3496l);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C0871f {

        /* renamed from: a */
        ArrayList<View> f3500a = new ArrayList<>();

        /* renamed from: b */
        int f3501b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3502c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3503d = 0;

        /* renamed from: e */
        final int f3504e;

        C0871f(int i) {
            this.f3504e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4660a(View view) {
            C0865c n = mo4673n(view);
            n.f3482e = this;
            this.f3500a.add(view);
            this.f3502c = Integer.MIN_VALUE;
            if (this.f3500a.size() == 1) {
                this.f3501b = Integer.MIN_VALUE;
            }
            if (n.mo4519c() || n.mo4518b()) {
                this.f3503d += StaggeredGridLayoutManager.this.f3468u.mo4808e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4661b(boolean z, int i) {
            int l = z ? mo4671l(Integer.MIN_VALUE) : mo4675p(Integer.MIN_VALUE);
            mo4664e();
            if (l != Integer.MIN_VALUE) {
                if (z && l < StaggeredGridLayoutManager.this.f3468u.mo4812i()) {
                    return;
                }
                if (z || l <= StaggeredGridLayoutManager.this.f3468u.mo4816m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.f3502c = l;
                    this.f3501b = l;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4662c() {
            C0866d.C0867a f;
            ArrayList<View> arrayList = this.f3500a;
            View view = arrayList.get(arrayList.size() - 1);
            C0865c n = mo4673n(view);
            this.f3502c = StaggeredGridLayoutManager.this.f3468u.mo4807d(view);
            if (n.f3483f && (f = StaggeredGridLayoutManager.this.f3454E.mo4637f(n.mo4517a())) != null && f.f3487g == 1) {
                this.f3502c += f.mo4644a(this.f3504e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4663d() {
            C0866d.C0867a f;
            View view = this.f3500a.get(0);
            C0865c n = mo4673n(view);
            this.f3501b = StaggeredGridLayoutManager.this.f3468u.mo4810g(view);
            if (n.f3483f && (f = StaggeredGridLayoutManager.this.f3454E.mo4637f(n.mo4517a())) != null && f.f3487g == -1) {
                this.f3501b -= f.mo4644a(this.f3504e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4664e() {
            this.f3500a.clear();
            mo4676q();
            this.f3503d = 0;
        }

        /* renamed from: f */
        public int mo4665f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3473z) {
                i2 = this.f3500a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f3500a.size();
            }
            return mo4668i(i2, i, true);
        }

        /* renamed from: g */
        public int mo4666g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3473z) {
                i2 = 0;
                i = this.f3500a.size();
            } else {
                i2 = this.f3500a.size() - 1;
                i = -1;
            }
            return mo4668i(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4667h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f3468u.mo4816m();
            int i3 = StaggeredGridLayoutManager.this.f3468u.mo4812i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3500a.get(i);
                int g = StaggeredGridLayoutManager.this.f3468u.mo4810g(view);
                int d = StaggeredGridLayoutManager.this.f3468u.mo4807d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d <= i3) {
                        }
                    } else if (g >= m && d <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.mo4477h0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo4668i(int i, int i2, boolean z) {
            return mo4667h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo4669j() {
            return this.f3503d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo4670k() {
            int i = this.f3502c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4662c();
            return this.f3502c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo4671l(int i) {
            int i2 = this.f3502c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3500a.size() == 0) {
                return i;
            }
            mo4662c();
            return this.f3502c;
        }

        /* renamed from: m */
        public View mo4672m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3500a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3500a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3473z && staggeredGridLayoutManager.mo4477h0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3473z && staggeredGridLayoutManager2.mo4477h0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3500a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3500a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3473z && staggeredGridLayoutManager3.mo4477h0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3473z && staggeredGridLayoutManager4.mo4477h0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C0865c mo4673n(View view) {
            return (C0865c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4674o() {
            int i = this.f3501b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4663d();
            return this.f3501b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo4675p(int i) {
            int i2 = this.f3501b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3500a.size() == 0) {
                return i;
            }
            mo4663d();
            return this.f3501b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4676q() {
            this.f3501b = Integer.MIN_VALUE;
            this.f3502c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo4677r(int i) {
            int i2 = this.f3501b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3501b = i2 + i;
            }
            int i3 = this.f3502c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3502c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4678s() {
            int size = this.f3500a.size();
            View remove = this.f3500a.remove(size - 1);
            C0865c n = mo4673n(remove);
            n.f3482e = null;
            if (n.mo4519c() || n.mo4518b()) {
                this.f3503d -= StaggeredGridLayoutManager.this.f3468u.mo4808e(remove);
            }
            if (size == 1) {
                this.f3501b = Integer.MIN_VALUE;
            }
            this.f3502c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4679t() {
            View remove = this.f3500a.remove(0);
            C0865c n = mo4673n(remove);
            n.f3482e = null;
            if (this.f3500a.size() == 0) {
                this.f3502c = Integer.MIN_VALUE;
            }
            if (n.mo4519c() || n.mo4518b()) {
                this.f3503d -= StaggeredGridLayoutManager.this.f3468u.mo4808e(remove);
            }
            this.f3501b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4680u(View view) {
            C0865c n = mo4673n(view);
            n.f3482e = this;
            this.f3500a.add(0, view);
            this.f3501b = Integer.MIN_VALUE;
            if (this.f3500a.size() == 1) {
                this.f3502c = Integer.MIN_VALUE;
            }
            if (n.mo4519c() || n.mo4518b()) {
                this.f3503d += StaggeredGridLayoutManager.this.f3468u.mo4808e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4681v(int i) {
            this.f3501b = i;
            this.f3502c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0843o.C0847d i0 = RecyclerView.C0843o.m4478i0(context, attributeSet, i, i2);
        mo4607H2(i0.f3410a);
        mo4609J2(i0.f3411b);
        mo4608I2(i0.f3412c);
        this.f3472y = new C0907i();
        m4747a2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f3655e == -1) goto L_0x0012;
     */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4725A2(androidx.recyclerview.widget.RecyclerView.C0855v r3, androidx.recyclerview.widget.C0907i r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3651a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3659i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3652b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3655e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3657g
        L_0x0014:
            r2.m4726B2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3656f
        L_0x001a:
            r2.m4727C2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3655e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3656f
            int r1 = r2.m4754m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3657g
            int r4 = r4.f3652b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3657g
            int r0 = r2.m4755n2(r0)
            int r1 = r4.f3657g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3656f
            int r4 = r4.f3652b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4725A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.i):void");
    }

    /* renamed from: B2 */
    private void m4726B2(RecyclerView.C0855v vVar, int i) {
        int J = mo4437J() - 1;
        while (J >= 0) {
            View I = mo4436I(J);
            if (this.f3468u.mo4810g(I) >= i && this.f3468u.mo4820q(I) >= i) {
                C0865c cVar = (C0865c) I.getLayoutParams();
                if (cVar.f3483f) {
                    int i2 = 0;
                    while (i2 < this.f3466s) {
                        if (this.f3467t[i2].f3500a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3466s; i3++) {
                        this.f3467t[i3].mo4678s();
                    }
                } else if (cVar.f3482e.f3500a.size() != 1) {
                    cVar.f3482e.mo4678s();
                } else {
                    return;
                }
                mo4488m1(I, vVar);
                J--;
            } else {
                return;
            }
        }
    }

    /* renamed from: C2 */
    private void m4727C2(RecyclerView.C0855v vVar, int i) {
        while (mo4437J() > 0) {
            View I = mo4436I(0);
            if (this.f3468u.mo4807d(I) <= i && this.f3468u.mo4819p(I) <= i) {
                C0865c cVar = (C0865c) I.getLayoutParams();
                if (cVar.f3483f) {
                    int i2 = 0;
                    while (i2 < this.f3466s) {
                        if (this.f3467t[i2].f3500a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3466s; i3++) {
                        this.f3467t[i3].mo4679t();
                    }
                } else if (cVar.f3482e.f3500a.size() != 1) {
                    cVar.f3482e.mo4679t();
                } else {
                    return;
                }
                mo4488m1(I, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: D2 */
    private void m4728D2() {
        if (this.f3469v.mo4814k() != 1073741824) {
            float f = 0.0f;
            int J = mo4437J();
            for (int i = 0; i < J; i++) {
                View I = mo4436I(i);
                float e = (float) this.f3469v.mo4808e(I);
                if (e >= f) {
                    if (((C0865c) I.getLayoutParams()).mo4631f()) {
                        e = (e * 1.0f) / ((float) this.f3466s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f3471x;
            int round = Math.round(f * ((float) this.f3466s));
            if (this.f3469v.mo4814k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3469v.mo4817n());
            }
            mo4614P2(round);
            if (this.f3471x != i2) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I2 = mo4436I(i3);
                    C0865c cVar = (C0865c) I2.getLayoutParams();
                    if (!cVar.f3483f) {
                        if (!mo4623t2() || this.f3470w != 1) {
                            int i4 = cVar.f3482e.f3504e;
                            int i5 = this.f3470w;
                            int i6 = (this.f3471x * i4) - (i4 * i2);
                            if (i5 == 1) {
                                I2.offsetLeftAndRight(i6);
                            } else {
                                I2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f3466s;
                            int i8 = cVar.f3482e.f3504e;
                            I2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3471x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E2 */
    private void m4729E2() {
        this.f3450A = (this.f3470w == 1 || !mo4623t2()) ? this.f3473z : !this.f3473z;
    }

    /* renamed from: G2 */
    private void m4730G2(int i) {
        C0907i iVar = this.f3472y;
        iVar.f3655e = i;
        int i2 = 1;
        if (this.f3450A != (i == -1)) {
            i2 = -1;
        }
        iVar.f3654d = i2;
    }

    /* renamed from: K2 */
    private void m4731K2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3466s; i3++) {
            if (!this.f3467t[i3].f3500a.isEmpty()) {
                m4737Q2(this.f3467t[i3], i, i2);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m4732L2(RecyclerView.C0823a0 a0Var, C0864b bVar) {
        boolean z = this.f3456G;
        int b = a0Var.mo4278b();
        bVar.f3475a = z ? m4750g2(b) : m4749c2(b);
        bVar.f3476b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: M1 */
    private void m4733M1(View view) {
        for (int i = this.f3466s - 1; i >= 0; i--) {
            this.f3467t[i].mo4660a(view);
        }
    }

    /* renamed from: N1 */
    private void m4734N1(C0864b bVar) {
        boolean z;
        C0869e eVar = this.f3458I;
        int i = eVar.f3492h;
        if (i > 0) {
            if (i == this.f3466s) {
                for (int i2 = 0; i2 < this.f3466s; i2++) {
                    this.f3467t[i2].mo4664e();
                    C0869e eVar2 = this.f3458I;
                    int i3 = eVar2.f3493i[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f3498n ? this.f3468u.mo4812i() : this.f3468u.mo4816m();
                    }
                    this.f3467t[i2].mo4681v(i3);
                }
            } else {
                eVar.mo4653b();
                C0869e eVar3 = this.f3458I;
                eVar3.f3490f = eVar3.f3491g;
            }
        }
        C0869e eVar4 = this.f3458I;
        this.f3457H = eVar4.f3499o;
        mo4608I2(eVar4.f3497m);
        m4729E2();
        C0869e eVar5 = this.f3458I;
        int i4 = eVar5.f3490f;
        if (i4 != -1) {
            this.f3452C = i4;
            z = eVar5.f3498n;
        } else {
            z = this.f3450A;
        }
        bVar.f3477c = z;
        C0869e eVar6 = this.f3458I;
        if (eVar6.f3494j > 1) {
            C0866d dVar = this.f3454E;
            dVar.f3484a = eVar6.f3495k;
            dVar.f3485b = eVar6.f3496l;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: O2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4735O2(int r5, androidx.recyclerview.widget.RecyclerView.C0823a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.i r0 = r4.f3472y
            r1 = 0
            r0.f3652b = r1
            r0.f3653c = r5
            boolean r0 = r4.mo4506x0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo4279c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f3450A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.n r5 = r4.f3468u
            int r5 = r5.mo4817n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.n r5 = r4.f3468u
            int r5 = r5.mo4817n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo4441M()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.i r0 = r4.f3472y
            androidx.recyclerview.widget.n r3 = r4.f3468u
            int r3 = r3.mo4816m()
            int r3 = r3 - r6
            r0.f3656f = r3
            androidx.recyclerview.widget.i r6 = r4.f3472y
            androidx.recyclerview.widget.n r0 = r4.f3468u
            int r0 = r0.mo4812i()
            int r0 = r0 + r5
            r6.f3657g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.i r0 = r4.f3472y
            androidx.recyclerview.widget.n r3 = r4.f3468u
            int r3 = r3.mo4811h()
            int r3 = r3 + r5
            r0.f3657g = r3
            androidx.recyclerview.widget.i r5 = r4.f3472y
            int r6 = -r6
            r5.f3656f = r6
        L_0x005d:
            androidx.recyclerview.widget.i r5 = r4.f3472y
            r5.f3658h = r1
            r5.f3651a = r2
            androidx.recyclerview.widget.n r6 = r4.f3468u
            int r6 = r6.mo4814k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.n r6 = r4.f3468u
            int r6 = r6.mo4811h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f3659i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4735O2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: Q1 */
    private void m4736Q1(View view, C0865c cVar, C0907i iVar) {
        if (iVar.f3655e == 1) {
            if (cVar.f3483f) {
                m4733M1(view);
            } else {
                cVar.f3482e.mo4660a(view);
            }
        } else if (cVar.f3483f) {
            m4763z2(view);
        } else {
            cVar.f3482e.mo4680u(view);
        }
    }

    /* renamed from: Q2 */
    private void m4737Q2(C0871f fVar, int i, int i2) {
        int j = fVar.mo4669j();
        if (i == -1) {
            if (fVar.mo4674o() + j > i2) {
                return;
            }
        } else if (fVar.mo4670k() - j < i2) {
            return;
        }
        this.f3451B.set(fVar.f3504e, false);
    }

    /* renamed from: R1 */
    private int m4738R1(int i) {
        if (mo4437J() == 0) {
            return this.f3450A ? 1 : -1;
        }
        return (i < mo4619j2()) != this.f3450A ? -1 : 1;
    }

    /* renamed from: R2 */
    private int m4739R2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: T1 */
    private boolean m4740T1(C0871f fVar) {
        if (this.f3450A) {
            if (fVar.mo4670k() < this.f3468u.mo4812i()) {
                ArrayList<View> arrayList = fVar.f3500a;
                return !fVar.mo4673n(arrayList.get(arrayList.size() - 1)).f3483f;
            }
        } else if (fVar.mo4674o() > this.f3468u.mo4816m()) {
            return !fVar.mo4673n(fVar.f3500a.get(0)).f3483f;
        }
        return false;
    }

    /* renamed from: U1 */
    private int m4741U1(RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0) {
            return 0;
        }
        return C0918p.m5137a(a0Var, this.f3468u, mo4617e2(!this.f3463N), mo4616d2(!this.f3463N), this, this.f3463N);
    }

    /* renamed from: V1 */
    private int m4742V1(RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0) {
            return 0;
        }
        return C0918p.m5138b(a0Var, this.f3468u, mo4617e2(!this.f3463N), mo4616d2(!this.f3463N), this, this.f3463N, this.f3450A);
    }

    /* renamed from: W1 */
    private int m4743W1(RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0) {
            return 0;
        }
        return C0918p.m5139c(a0Var, this.f3468u, mo4617e2(!this.f3463N), mo4616d2(!this.f3463N), this, this.f3463N);
    }

    /* renamed from: X1 */
    private int m4744X1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3470w == 1) ? 1 : Integer.MIN_VALUE : this.f3470w == 0 ? 1 : Integer.MIN_VALUE : this.f3470w == 1 ? -1 : Integer.MIN_VALUE : this.f3470w == 0 ? -1 : Integer.MIN_VALUE : (this.f3470w != 1 && mo4623t2()) ? -1 : 1 : (this.f3470w != 1 && mo4623t2()) ? 1 : -1;
    }

    /* renamed from: Y1 */
    private C0866d.C0867a m4745Y1(int i) {
        C0866d.C0867a aVar = new C0866d.C0867a();
        aVar.f3488h = new int[this.f3466s];
        for (int i2 = 0; i2 < this.f3466s; i2++) {
            aVar.f3488h[i2] = i - this.f3467t[i2].mo4671l(i);
        }
        return aVar;
    }

    /* renamed from: Z1 */
    private C0866d.C0867a m4746Z1(int i) {
        C0866d.C0867a aVar = new C0866d.C0867a();
        aVar.f3488h = new int[this.f3466s];
        for (int i2 = 0; i2 < this.f3466s; i2++) {
            aVar.f3488h[i2] = this.f3467t[i2].mo4675p(i) - i;
        }
        return aVar;
    }

    /* renamed from: a2 */
    private void m4747a2() {
        this.f3468u = C0913n.m5075b(this, this.f3470w);
        this.f3469v = C0913n.m5075b(this, 1 - this.f3470w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: b2 */
    private int m4748b2(RecyclerView.C0855v vVar, C0907i iVar, RecyclerView.C0823a0 a0Var) {
        int i;
        C0871f fVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.C0855v vVar2 = vVar;
        C0907i iVar2 = iVar;
        ? r9 = 0;
        this.f3451B.set(0, this.f3466s, true);
        if (this.f3472y.f3659i) {
            i = iVar2.f3655e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = iVar2.f3655e == 1 ? iVar2.f3657g + iVar2.f3652b : iVar2.f3656f - iVar2.f3652b;
        }
        m4731K2(iVar2.f3655e, i);
        int i8 = this.f3450A ? this.f3468u.mo4812i() : this.f3468u.mo4816m();
        boolean z = false;
        while (iVar.mo4789a(a0Var) && (this.f3472y.f3659i || !this.f3451B.isEmpty())) {
            View b = iVar2.mo4790b(vVar2);
            C0865c cVar = (C0865c) b.getLayoutParams();
            int a = cVar.mo4517a();
            int g = this.f3454E.mo4638g(a);
            boolean z2 = g == -1;
            if (z2) {
                fVar = cVar.f3483f ? this.f3467t[r9] : m4757p2(iVar2);
                this.f3454E.mo4642n(a, fVar);
            } else {
                fVar = this.f3467t[g];
            }
            C0871f fVar2 = fVar;
            cVar.f3482e = fVar2;
            if (iVar2.f3655e == 1) {
                mo4467d(b);
            } else {
                mo4469e(b, r9);
            }
            m4760v2(b, cVar, r9);
            if (iVar2.f3655e == 1) {
                int l2 = cVar.f3483f ? m4753l2(i8) : fVar2.mo4671l(i8);
                int e = this.f3468u.mo4808e(b) + l2;
                if (z2 && cVar.f3483f) {
                    C0866d.C0867a Y1 = m4745Y1(l2);
                    Y1.f3487g = -1;
                    Y1.f3486f = a;
                    this.f3454E.mo4632a(Y1);
                }
                i2 = e;
                i3 = l2;
            } else {
                int o2 = cVar.f3483f ? m4756o2(i8) : fVar2.mo4675p(i8);
                i3 = o2 - this.f3468u.mo4808e(b);
                if (z2 && cVar.f3483f) {
                    C0866d.C0867a Z1 = m4746Z1(o2);
                    Z1.f3487g = 1;
                    Z1.f3486f = a;
                    this.f3454E.mo4632a(Z1);
                }
                i2 = o2;
            }
            if (cVar.f3483f && iVar2.f3654d == -1) {
                if (!z2) {
                    if (!(iVar2.f3655e == 1 ? mo4612O1() : mo4613P1())) {
                        C0866d.C0867a f = this.f3454E.mo4637f(a);
                        if (f != null) {
                            f.f3489i = true;
                        }
                    }
                }
                this.f3462M = true;
            }
            m4736Q1(b, cVar, iVar2);
            if (!mo4623t2() || this.f3470w != 1) {
                int m = cVar.f3483f ? this.f3469v.mo4816m() : (fVar2.f3504e * this.f3471x) + this.f3469v.mo4816m();
                i5 = m;
                i4 = this.f3469v.mo4808e(b) + m;
            } else {
                int i9 = cVar.f3483f ? this.f3469v.mo4812i() : this.f3469v.mo4812i() - (((this.f3466s - 1) - fVar2.f3504e) * this.f3471x);
                i4 = i9;
                i5 = i9 - this.f3469v.mo4808e(b);
            }
            if (this.f3470w == 1) {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo4509z0(view, i7, i5, i6, i2);
            if (cVar.f3483f) {
                m4731K2(this.f3472y.f3655e, i);
            } else {
                m4737Q2(fVar2, this.f3472y.f3655e, i);
            }
            m4725A2(vVar2, this.f3472y);
            if (this.f3472y.f3658h && b.hasFocusable()) {
                if (cVar.f3483f) {
                    this.f3451B.clear();
                } else {
                    this.f3451B.set(fVar2.f3504e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m4725A2(vVar2, this.f3472y);
        }
        int m2 = this.f3472y.f3655e == -1 ? this.f3468u.mo4816m() - m4756o2(this.f3468u.mo4816m()) : m4753l2(this.f3468u.mo4812i()) - this.f3468u.mo4812i();
        if (m2 > 0) {
            return Math.min(iVar2.f3652b, m2);
        }
        return 0;
    }

    /* renamed from: c2 */
    private int m4749c2(int i) {
        int J = mo4437J();
        for (int i2 = 0; i2 < J; i2++) {
            int h0 = mo4477h0(mo4436I(i2));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    private int m4750g2(int i) {
        for (int J = mo4437J() - 1; J >= 0; J--) {
            int h0 = mo4477h0(mo4436I(J));
            if (h0 >= 0 && h0 < i) {
                return h0;
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private void m4751h2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, boolean z) {
        int i;
        int l2 = m4753l2(Integer.MIN_VALUE);
        if (l2 != Integer.MIN_VALUE && (i = this.f3468u.mo4812i() - l2) > 0) {
            int i2 = i - (-mo4606F2(-i, vVar, a0Var));
            if (z && i2 > 0) {
                this.f3468u.mo4821r(i2);
            }
        }
    }

    /* renamed from: i2 */
    private void m4752i2(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, boolean z) {
        int m;
        int o2 = m4756o2(Integer.MAX_VALUE);
        if (o2 != Integer.MAX_VALUE && (m = o2 - this.f3468u.mo4816m()) > 0) {
            int F2 = m - mo4606F2(m, vVar, a0Var);
            if (z && F2 > 0) {
                this.f3468u.mo4821r(-F2);
            }
        }
    }

    /* renamed from: l2 */
    private int m4753l2(int i) {
        int l = this.f3467t[0].mo4671l(i);
        for (int i2 = 1; i2 < this.f3466s; i2++) {
            int l2 = this.f3467t[i2].mo4671l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: m2 */
    private int m4754m2(int i) {
        int p = this.f3467t[0].mo4675p(i);
        for (int i2 = 1; i2 < this.f3466s; i2++) {
            int p2 = this.f3467t[i2].mo4675p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: n2 */
    private int m4755n2(int i) {
        int l = this.f3467t[0].mo4671l(i);
        for (int i2 = 1; i2 < this.f3466s; i2++) {
            int l2 = this.f3467t[i2].mo4671l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: o2 */
    private int m4756o2(int i) {
        int p = this.f3467t[0].mo4675p(i);
        for (int i2 = 1; i2 < this.f3466s; i2++) {
            int p2 = this.f3467t[i2].mo4675p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: p2 */
    private C0871f m4757p2(C0907i iVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m4762x2(iVar.f3655e)) {
            i2 = this.f3466s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3466s;
            i = 1;
        }
        C0871f fVar = null;
        if (iVar.f3655e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f3468u.mo4816m();
            while (i2 != i3) {
                C0871f fVar2 = this.f3467t[i2];
                int l = fVar2.mo4671l(m);
                if (l < i4) {
                    fVar = fVar2;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f3468u.mo4812i();
        while (i2 != i3) {
            C0871f fVar3 = this.f3467t[i2];
            int p = fVar3.mo4675p(i6);
            if (p > i5) {
                fVar = fVar3;
                i5 = p;
            }
            i2 += i;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4758q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3450A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4620k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4619j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3454E
            r4.mo4639h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3454E
            r9.mo4641k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3454E
            r7.mo4640j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3454E
            r9.mo4641k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3454E
            r9.mo4640j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f3450A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo4619j2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo4620k2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo4500t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4758q2(int, int, int):void");
    }

    /* renamed from: u2 */
    private void m4759u2(View view, int i, int i2, boolean z) {
        mo4481j(view, this.f3460K);
        C0865c cVar = (C0865c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f3460K;
        int R2 = m4739R2(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f3460K;
        int R22 = m4739R2(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z ? mo4435H1(view, R2, R22, cVar) : mo4430F1(view, R2, R22, cVar)) {
            view.measure(R2, R22);
        }
    }

    /* renamed from: v2 */
    private void m4760v2(View view, C0865c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f3483f) {
            if (this.f3470w == 1) {
                i2 = this.f3459J;
            } else {
                m4759u2(view, RecyclerView.C0843o.m4475K(mo4491o0(), mo4493p0(), mo4470e0() + mo4472f0(), cVar.width, true), this.f3459J, z);
                return;
            }
        } else if (this.f3470w == 1) {
            i2 = RecyclerView.C0843o.m4475K(this.f3471x, mo4493p0(), 0, cVar.width, false);
        } else {
            i2 = RecyclerView.C0843o.m4475K(mo4491o0(), mo4493p0(), mo4470e0() + mo4472f0(), cVar.width, true);
            i = RecyclerView.C0843o.m4475K(this.f3471x, mo4456X(), 0, cVar.height, false);
            m4759u2(view, i2, i, z);
        }
        i = RecyclerView.C0843o.m4475K(mo4455W(), mo4456X(), mo4474g0() + mo4468d0(), cVar.height, true);
        m4759u2(view, i2, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo4615S1() != false) goto L_0x014f;
     */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4761w2(androidx.recyclerview.widget.RecyclerView.C0855v r9, androidx.recyclerview.widget.RecyclerView.C0823a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f3461L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3458I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3452C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4278b()
            if (r1 != 0) goto L_0x0018
            r8.mo4484k1(r9)
            r0.mo4628c()
            return
        L_0x0018:
            boolean r1 = r0.f3479e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3452C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f3458I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4628c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3458I
            if (r5 == 0) goto L_0x0037
            r8.m4734N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m4729E2()
            boolean r5 = r8.f3450A
            r0.f3477c = r5
        L_0x003e:
            r8.mo4611N2(r10, r0)
            r0.f3479e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3458I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3452C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3477c
            boolean r6 = r8.f3456G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4623t2()
            boolean r6 = r8.f3457H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f3454E
            r5.mo4633b()
            r0.f3478d = r4
        L_0x0060:
            int r5 = r8.mo4437J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f3458I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3492h
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3478d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f3466s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3467t
            r5 = r5[r1]
            r5.mo4664e()
            int r5 = r0.f3476b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f3467t
            r6 = r6[r1]
            r6.mo4681v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3461L
            int[] r1 = r1.f3480f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f3466s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3467t
            r5 = r5[r1]
            r5.mo4664e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f3461L
            int[] r6 = r6.f3480f
            r6 = r6[r1]
            r5.mo4681v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f3466s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3467t
            r5 = r5[r1]
            boolean r6 = r8.f3450A
            int r7 = r0.f3476b
            r5.mo4661b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3461L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f3467t
            r1.mo4629d(r5)
        L_0x00c9:
            r8.mo4504w(r9)
            androidx.recyclerview.widget.i r1 = r8.f3472y
            r1.f3651a = r3
            r8.f3462M = r3
            androidx.recyclerview.widget.n r1 = r8.f3469v
            int r1 = r1.mo4817n()
            r8.mo4614P2(r1)
            int r1 = r0.f3475a
            r8.m4735O2(r1, r10)
            boolean r1 = r0.f3477c
            if (r1 == 0) goto L_0x00f0
            r8.m4730G2(r2)
            androidx.recyclerview.widget.i r1 = r8.f3472y
            r8.m4748b2(r9, r1, r10)
            r8.m4730G2(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m4730G2(r4)
            androidx.recyclerview.widget.i r1 = r8.f3472y
            r8.m4748b2(r9, r1, r10)
            r8.m4730G2(r2)
        L_0x00fb:
            androidx.recyclerview.widget.i r1 = r8.f3472y
            int r2 = r0.f3475a
            int r5 = r1.f3654d
            int r2 = r2 + r5
            r1.f3653c = r2
            r8.m4748b2(r9, r1, r10)
            r8.m4728D2()
            int r1 = r8.mo4437J()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f3450A
            if (r1 == 0) goto L_0x011b
            r8.m4751h2(r9, r10, r4)
            r8.m4752i2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.m4752i2(r9, r10, r4)
            r8.m4751h2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo4281e()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f3455F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo4437J()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f3462M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo4621r2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f3465P
            r8.mo4492o1(r11)
            boolean r11 = r8.mo4615S1()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.mo4281e()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3461L
            r11.mo4628c()
        L_0x015a:
            boolean r11 = r0.f3477c
            r8.f3456G = r11
            boolean r11 = r8.mo4623t2()
            r8.f3457H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3461L
            r11.mo4628c()
            r8.m4761w2(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4761w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: x2 */
    private boolean m4762x2(int i) {
        if (this.f3470w == 0) {
            return (i == -1) != this.f3450A;
        }
        return ((i == -1) == this.f3450A) == mo4623t2();
    }

    /* renamed from: z2 */
    private void m4763z2(View view) {
        for (int i = this.f3466s - 1; i >= 0; i--) {
            this.f3467t[i].mo4680u(view);
        }
    }

    /* renamed from: C0 */
    public void mo4424C0(int i) {
        super.mo4424C0(i);
        for (int i2 = 0; i2 < this.f3466s; i2++) {
            this.f3467t[i2].mo4677r(i);
        }
    }

    /* renamed from: C1 */
    public void mo4010C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int e0 = mo4470e0() + mo4472f0();
        int g0 = mo4474g0() + mo4468d0();
        if (this.f3470w == 1) {
            i4 = RecyclerView.C0843o.m4479n(i2, rect.height() + g0, mo4463b0());
            i3 = RecyclerView.C0843o.m4479n(i, (this.f3471x * this.f3466s) + e0, mo4466c0());
        } else {
            i3 = RecyclerView.C0843o.m4479n(i, rect.width() + e0, mo4466c0());
            i4 = RecyclerView.C0843o.m4479n(i2, (this.f3471x * this.f3466s) + g0, mo4463b0());
        }
        mo4423B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.C0848p mo4011D() {
        return this.f3470w == 0 ? new C0865c(-2, -1) : new C0865c(-1, -2);
    }

    /* renamed from: D0 */
    public void mo4425D0(int i) {
        super.mo4425D0(i);
        for (int i2 = 0; i2 < this.f3466s; i2++) {
            this.f3467t[i2].mo4677r(i);
        }
    }

    /* renamed from: E */
    public RecyclerView.C0848p mo4012E(Context context, AttributeSet attributeSet) {
        return new C0865c(context, attributeSet);
    }

    /* renamed from: F */
    public RecyclerView.C0848p mo4014F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0865c((ViewGroup.MarginLayoutParams) layoutParams) : new C0865c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public int mo4606F2(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        if (mo4437J() == 0 || i == 0) {
            return 0;
        }
        mo4624y2(i, a0Var);
        int b2 = m4748b2(vVar, this.f3472y, a0Var);
        if (this.f3472y.f3652b >= b2) {
            i = i < 0 ? -b2 : b2;
        }
        this.f3468u.mo4821r(-i);
        this.f3456G = this.f3450A;
        C0907i iVar = this.f3472y;
        iVar.f3652b = 0;
        m4725A2(vVar, iVar);
        return i;
    }

    /* renamed from: H2 */
    public void mo4607H2(int i) {
        if (i == 0 || i == 1) {
            mo4072g((String) null);
            if (i != this.f3470w) {
                this.f3470w = i;
                C0913n nVar = this.f3468u;
                this.f3468u = this.f3469v;
                this.f3469v = nVar;
                mo4500t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: I0 */
    public void mo4055I0(RecyclerView recyclerView, RecyclerView.C0855v vVar) {
        super.mo4055I0(recyclerView, vVar);
        mo4492o1(this.f3465P);
        for (int i = 0; i < this.f3466s; i++) {
            this.f3467t[i].mo4664e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: I1 */
    public void mo4056I1(RecyclerView recyclerView, RecyclerView.C0823a0 a0Var, int i) {
        C0908j jVar = new C0908j(recyclerView.getContext());
        jVar.mo4599p(i);
        mo4438J1(jVar);
    }

    /* renamed from: I2 */
    public void mo4608I2(boolean z) {
        mo4072g((String) null);
        C0869e eVar = this.f3458I;
        if (!(eVar == null || eVar.f3497m == z)) {
            eVar.f3497m = z;
        }
        this.f3473z = z;
        mo4500t1();
    }

    /* renamed from: J0 */
    public View mo4015J0(View view, int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        View B;
        View m;
        if (mo4437J() == 0 || (B = mo4421B(view)) == null) {
            return null;
        }
        m4729E2();
        int X1 = m4744X1(i);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        C0865c cVar = (C0865c) B.getLayoutParams();
        boolean z = cVar.f3483f;
        C0871f fVar = cVar.f3482e;
        int k2 = X1 == 1 ? mo4620k2() : mo4619j2();
        m4735O2(k2, a0Var);
        m4730G2(X1);
        C0907i iVar = this.f3472y;
        iVar.f3653c = iVar.f3654d + k2;
        iVar.f3652b = (int) (((float) this.f3468u.mo4817n()) * 0.33333334f);
        C0907i iVar2 = this.f3472y;
        iVar2.f3658h = true;
        iVar2.f3651a = false;
        m4748b2(vVar, iVar2, a0Var);
        this.f3456G = this.f3450A;
        if (!z && (m = fVar.mo4672m(k2, X1)) != null && m != B) {
            return m;
        }
        if (m4762x2(X1)) {
            for (int i2 = this.f3466s - 1; i2 >= 0; i2--) {
                View m2 = this.f3467t[i2].mo4672m(k2, X1);
                if (m2 != null && m2 != B) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3466s; i3++) {
                View m3 = this.f3467t[i3].mo4672m(k2, X1);
                if (m3 != null && m3 != B) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f3473z ^ true) == (X1 == -1);
        if (!z) {
            View C = mo4051C(z2 ? fVar.mo4665f() : fVar.mo4666g());
            if (!(C == null || C == B)) {
                return C;
            }
        }
        if (m4762x2(X1)) {
            for (int i4 = this.f3466s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f3504e) {
                    C0871f[] fVarArr = this.f3467t;
                    View C2 = mo4051C(z2 ? fVarArr[i4].mo4665f() : fVarArr[i4].mo4666g());
                    if (!(C2 == null || C2 == B)) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3466s; i5++) {
                C0871f[] fVarArr2 = this.f3467t;
                View C3 = mo4051C(z2 ? fVarArr2[i5].mo4665f() : fVarArr2[i5].mo4666g());
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    /* renamed from: J2 */
    public void mo4609J2(int i) {
        mo4072g((String) null);
        if (i != this.f3466s) {
            mo4622s2();
            this.f3466s = i;
            this.f3451B = new BitSet(this.f3466s);
            this.f3467t = new C0871f[this.f3466s];
            for (int i2 = 0; i2 < this.f3466s; i2++) {
                this.f3467t[i2] = new C0871f(i2);
            }
            mo4500t1();
        }
    }

    /* renamed from: K0 */
    public void mo4057K0(AccessibilityEvent accessibilityEvent) {
        super.mo4057K0(accessibilityEvent);
        if (mo4437J() > 0) {
            View e2 = mo4617e2(false);
            View d2 = mo4616d2(false);
            if (e2 != null && d2 != null) {
                int h0 = mo4477h0(e2);
                int h02 = mo4477h0(d2);
                if (h0 < h02) {
                    accessibilityEvent.setFromIndex(h0);
                    accessibilityEvent.setToIndex(h02);
                    return;
                }
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h0);
            }
        }
    }

    /* renamed from: L1 */
    public boolean mo4016L1() {
        return this.f3458I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean mo4610M2(RecyclerView.C0823a0 a0Var, C0864b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.mo4281e() && (i = this.f3452C) != -1) {
            if (i < 0 || i >= a0Var.mo4278b()) {
                this.f3452C = -1;
                this.f3453D = Integer.MIN_VALUE;
            } else {
                C0869e eVar = this.f3458I;
                if (eVar == null || eVar.f3490f == -1 || eVar.f3492h < 1) {
                    View C = mo4051C(this.f3452C);
                    if (C != null) {
                        bVar.f3475a = this.f3450A ? mo4620k2() : mo4619j2();
                        if (this.f3453D != Integer.MIN_VALUE) {
                            if (bVar.f3477c) {
                                i3 = this.f3468u.mo4812i() - this.f3453D;
                                i2 = this.f3468u.mo4807d(C);
                            } else {
                                i3 = this.f3468u.mo4816m() + this.f3453D;
                                i2 = this.f3468u.mo4810g(C);
                            }
                            bVar.f3476b = i3 - i2;
                            return true;
                        } else if (this.f3468u.mo4808e(C) > this.f3468u.mo4817n()) {
                            bVar.f3476b = bVar.f3477c ? this.f3468u.mo4812i() : this.f3468u.mo4816m();
                            return true;
                        } else {
                            int g = this.f3468u.mo4810g(C) - this.f3468u.mo4816m();
                            if (g < 0) {
                                bVar.f3476b = -g;
                                return true;
                            }
                            int i4 = this.f3468u.mo4812i() - this.f3468u.mo4807d(C);
                            if (i4 < 0) {
                                bVar.f3476b = i4;
                                return true;
                            }
                            bVar.f3476b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f3452C;
                        bVar.f3475a = i5;
                        int i6 = this.f3453D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m4738R1(i5) == 1) {
                                z = true;
                            }
                            bVar.f3477c = z;
                            bVar.mo4626a();
                        } else {
                            bVar.mo4627b(i6);
                        }
                        bVar.f3478d = true;
                    }
                } else {
                    bVar.f3476b = Integer.MIN_VALUE;
                    bVar.f3475a = this.f3452C;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public int mo4017N(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return this.f3470w == 1 ? this.f3466s : super.mo4017N(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N2 */
    public void mo4611N2(RecyclerView.C0823a0 a0Var, C0864b bVar) {
        if (!mo4610M2(a0Var, bVar) && !m4732L2(a0Var, bVar)) {
            bVar.mo4626a();
            bVar.f3475a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public boolean mo4612O1() {
        int l = this.f3467t[0].mo4671l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3466s; i++) {
            if (this.f3467t[i].mo4671l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P0 */
    public void mo4019P0(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var, View view, C3369c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0865c)) {
            super.mo4445O0(view, cVar);
            return;
        }
        C0865c cVar2 = (C0865c) layoutParams;
        if (this.f3470w == 0) {
            i4 = cVar2.mo4630e();
            i3 = cVar2.f3483f ? this.f3466s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.mo4630e();
            i = cVar2.f3483f ? this.f3466s : 1;
        }
        cVar.mo11626e0(C3369c.C3372c.m14527f(i4, i3, i2, i, false, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public boolean mo4613P1() {
        int p = this.f3467t[0].mo4675p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3466s; i++) {
            if (this.f3467t[i].mo4675p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public void mo4614P2(int i) {
        this.f3471x = i / this.f3466s;
        this.f3459J = View.MeasureSpec.makeMeasureSpec(i, this.f3469v.mo4814k());
    }

    /* renamed from: R0 */
    public void mo4020R0(RecyclerView recyclerView, int i, int i2) {
        m4758q2(i, i2, 1);
    }

    /* renamed from: S0 */
    public void mo4021S0(RecyclerView recyclerView) {
        this.f3454E.mo4633b();
        mo4500t1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public boolean mo4615S1() {
        int i;
        int i2;
        if (mo4437J() == 0 || this.f3455F == 0 || !mo4497r0()) {
            return false;
        }
        if (this.f3450A) {
            i2 = mo4620k2();
            i = mo4619j2();
        } else {
            i2 = mo4619j2();
            i = mo4620k2();
        }
        if (i2 == 0 && mo4621r2() != null) {
            this.f3454E.mo4633b();
        } else if (!this.f3462M) {
            return false;
        } else {
            int i3 = this.f3450A ? -1 : 1;
            int i4 = i + 1;
            C0866d.C0867a e = this.f3454E.mo4636e(i2, i4, i3, true);
            if (e == null) {
                this.f3462M = false;
                this.f3454E.mo4635d(i4);
                return false;
            }
            C0866d.C0867a e2 = this.f3454E.mo4636e(i2, e.f3486f, i3 * -1, true);
            if (e2 == null) {
                this.f3454E.mo4635d(e.f3486f);
            } else {
                this.f3454E.mo4635d(e2.f3486f + 1);
            }
        }
        mo4502u1();
        mo4500t1();
        return true;
    }

    /* renamed from: T0 */
    public void mo4022T0(RecyclerView recyclerView, int i, int i2, int i3) {
        m4758q2(i, i2, 8);
    }

    /* renamed from: U0 */
    public void mo4023U0(RecyclerView recyclerView, int i, int i2) {
        m4758q2(i, i2, 2);
    }

    /* renamed from: W0 */
    public void mo4024W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m4758q2(i, i2, 4);
    }

    /* renamed from: X0 */
    public void mo4026X0(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        m4761w2(vVar, a0Var, true);
    }

    /* renamed from: Y0 */
    public void mo4028Y0(RecyclerView.C0823a0 a0Var) {
        super.mo4028Y0(a0Var);
        this.f3452C = -1;
        this.f3453D = Integer.MIN_VALUE;
        this.f3458I = null;
        this.f3461L.mo4628c();
    }

    /* renamed from: a */
    public PointF mo4066a(int i) {
        int R1 = m4738R1(i);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f3470w == 0) {
            pointF.x = (float) R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R1;
        }
        return pointF;
    }

    /* renamed from: c1 */
    public void mo4067c1(Parcelable parcelable) {
        if (parcelable instanceof C0869e) {
            this.f3458I = (C0869e) parcelable;
            mo4500t1();
        }
    }

    /* renamed from: d1 */
    public Parcelable mo4069d1() {
        int i;
        int i2;
        int[] iArr;
        if (this.f3458I != null) {
            return new C0869e(this.f3458I);
        }
        C0869e eVar = new C0869e();
        eVar.f3497m = this.f3473z;
        eVar.f3498n = this.f3456G;
        eVar.f3499o = this.f3457H;
        C0866d dVar = this.f3454E;
        if (dVar == null || (iArr = dVar.f3484a) == null) {
            eVar.f3494j = 0;
        } else {
            eVar.f3495k = iArr;
            eVar.f3494j = iArr.length;
            eVar.f3496l = dVar.f3485b;
        }
        if (mo4437J() > 0) {
            eVar.f3490f = this.f3456G ? mo4620k2() : mo4619j2();
            eVar.f3491g = mo4618f2();
            int i3 = this.f3466s;
            eVar.f3492h = i3;
            eVar.f3493i = new int[i3];
            for (int i4 = 0; i4 < this.f3466s; i4++) {
                if (this.f3456G) {
                    i = this.f3467t[i4].mo4671l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3468u.mo4812i();
                    } else {
                        eVar.f3493i[i4] = i;
                    }
                } else {
                    i = this.f3467t[i4].mo4675p(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3468u.mo4816m();
                    } else {
                        eVar.f3493i[i4] = i;
                    }
                }
                i -= i2;
                eVar.f3493i[i4] = i;
            }
        } else {
            eVar.f3490f = -1;
            eVar.f3491g = -1;
            eVar.f3492h = 0;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo4616d2(boolean z) {
        int m = this.f3468u.mo4816m();
        int i = this.f3468u.mo4812i();
        View view = null;
        for (int J = mo4437J() - 1; J >= 0; J--) {
            View I = mo4436I(J);
            int g = this.f3468u.mo4810g(I);
            int d = this.f3468u.mo4807d(I);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* renamed from: e1 */
    public void mo4471e1(int i) {
        if (i == 0) {
            mo4615S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo4617e2(boolean z) {
        int m = this.f3468u.mo4816m();
        int i = this.f3468u.mo4812i();
        int J = mo4437J();
        View view = null;
        for (int i2 = 0; i2 < J; i2++) {
            View I = mo4436I(i2);
            int g = this.f3468u.mo4810g(I);
            if (this.f3468u.mo4807d(I) > m && g < i) {
                if (g >= m || !z) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public int mo4618f2() {
        View d2 = this.f3450A ? mo4616d2(true) : mo4617e2(true);
        if (d2 == null) {
            return -1;
        }
        return mo4477h0(d2);
    }

    /* renamed from: g */
    public void mo4072g(String str) {
        if (this.f3458I == null) {
            super.mo4072g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public int mo4619j2() {
        if (mo4437J() == 0) {
            return 0;
        }
        return mo4477h0(mo4436I(0));
    }

    /* renamed from: k */
    public boolean mo4073k() {
        return this.f3470w == 0;
    }

    /* renamed from: k0 */
    public int mo4031k0(RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return this.f3470w == 0 ? this.f3466s : super.mo4031k0(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public int mo4620k2() {
        int J = mo4437J();
        if (J == 0) {
            return 0;
        }
        return mo4477h0(mo4436I(J - 1));
    }

    /* renamed from: l */
    public boolean mo4074l() {
        return this.f3470w == 1;
    }

    /* renamed from: m */
    public boolean mo4032m(RecyclerView.C0848p pVar) {
        return pVar instanceof C0865c;
    }

    /* renamed from: o */
    public void mo4075o(int i, int i2, RecyclerView.C0823a0 a0Var, RecyclerView.C0843o.C0846c cVar) {
        int i3;
        int i4;
        if (this.f3470w != 0) {
            i = i2;
        }
        if (mo4437J() != 0 && i != 0) {
            mo4624y2(i, a0Var);
            int[] iArr = this.f3464O;
            if (iArr == null || iArr.length < this.f3466s) {
                this.f3464O = new int[this.f3466s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3466s; i6++) {
                C0907i iVar = this.f3472y;
                if (iVar.f3654d == -1) {
                    i4 = iVar.f3656f;
                    i3 = this.f3467t[i6].mo4675p(i4);
                } else {
                    i4 = this.f3467t[i6].mo4671l(iVar.f3657g);
                    i3 = this.f3472y.f3657g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3464O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3464O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3472y.mo4789a(a0Var); i8++) {
                cVar.mo4516a(this.f3472y.f3653c, this.f3464O[i8]);
                C0907i iVar2 = this.f3472y;
                iVar2.f3653c += iVar2.f3654d;
            }
        }
    }

    /* renamed from: q */
    public int mo4079q(RecyclerView.C0823a0 a0Var) {
        return m4741U1(a0Var);
    }

    /* renamed from: r */
    public int mo4033r(RecyclerView.C0823a0 a0Var) {
        return m4742V1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4621r2() {
        /*
            r12 = this;
            int r0 = r12.mo4437J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3466s
            r2.<init>(r3)
            int r3 = r12.f3466s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3470w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4623t2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3450A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4436I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0865c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3482e
            int r9 = r9.f3504e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3482e
            boolean r9 = r12.m4740T1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3482e
            int r9 = r9.f3504e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3483f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4436I(r9)
            boolean r10 = r12.f3450A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.n r10 = r12.f3468u
            int r10 = r10.mo4807d(r7)
            androidx.recyclerview.widget.n r11 = r12.f3468u
            int r11 = r11.mo4807d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.n r10 = r12.f3468u
            int r10 = r10.mo4810g(r7)
            androidx.recyclerview.widget.n r11 = r12.f3468u
            int r11 = r11.mo4810g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0865c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3482e
            int r8 = r8.f3504e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3482e
            int r9 = r9.f3504e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4621r2():android.view.View");
    }

    /* renamed from: s */
    public int mo4034s(RecyclerView.C0823a0 a0Var) {
        return m4743W1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo4082s0() {
        return this.f3455F != 0;
    }

    /* renamed from: s2 */
    public void mo4622s2() {
        this.f3454E.mo4633b();
        mo4500t1();
    }

    /* renamed from: t */
    public int mo4083t(RecyclerView.C0823a0 a0Var) {
        return m4741U1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public boolean mo4623t2() {
        return mo4458Z() == 1;
    }

    /* renamed from: u */
    public int mo4036u(RecyclerView.C0823a0 a0Var) {
        return m4742V1(a0Var);
    }

    /* renamed from: v */
    public int mo4038v(RecyclerView.C0823a0 a0Var) {
        return m4743W1(a0Var);
    }

    /* renamed from: w1 */
    public int mo4039w1(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return mo4606F2(i, vVar, a0Var);
    }

    /* renamed from: x1 */
    public void mo4084x1(int i) {
        C0869e eVar = this.f3458I;
        if (!(eVar == null || eVar.f3490f == i)) {
            eVar.mo4652a();
        }
        this.f3452C = i;
        this.f3453D = Integer.MIN_VALUE;
        mo4500t1();
    }

    /* renamed from: y1 */
    public int mo4040y1(int i, RecyclerView.C0855v vVar, RecyclerView.C0823a0 a0Var) {
        return mo4606F2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public void mo4624y2(int i, RecyclerView.C0823a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4620k2();
            i2 = 1;
        } else {
            i3 = mo4619j2();
            i2 = -1;
        }
        this.f3472y.f3651a = true;
        m4735O2(i3, a0Var);
        m4730G2(i2);
        C0907i iVar = this.f3472y;
        iVar.f3653c = i3 + iVar.f3654d;
        iVar.f3652b = Math.abs(i);
    }
}
