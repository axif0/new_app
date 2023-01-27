package p148g.p189d.p296d.p322y.p323b;

import p148g.p189d.p296d.p304s.C5412b;

/* renamed from: g.d.d.y.b.c */
enum C5517c {
    DATA_MASK_000 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo15919e(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo15919e(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo15920g(C5412b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo15919e(i2, i3)) {
                    bVar.mo15664d(i3, i2);
                }
            }
        }
    }
}
