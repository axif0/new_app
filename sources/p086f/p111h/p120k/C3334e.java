package p086f.p111h.p120k;

import java.util.Locale;

/* renamed from: f.h.k.e */
public final class C3334e {

    /* renamed from: a */
    public static final C3333d f10625a = new C3339e((C3337c) null, false);

    /* renamed from: b */
    public static final C3333d f10626b = new C3339e((C3337c) null, true);

    /* renamed from: c */
    public static final C3333d f10627c = new C3339e(C3336b.f10631a, false);

    /* renamed from: d */
    public static final C3333d f10628d = new C3339e(C3336b.f10631a, true);

    /* renamed from: f.h.k.e$a */
    private static class C3335a implements C3337c {

        /* renamed from: b */
        static final C3335a f10629b = new C3335a(true);

        /* renamed from: a */
        private final boolean f10630a;

        private C3335a(boolean z) {
            this.f10630a = z;
        }

        /* renamed from: a */
        public int mo11537a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C3334e.m14336a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f10630a) {
                        return 1;
                    }
                } else if (this.f10630a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f10630a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: f.h.k.e$b */
    private static class C3336b implements C3337c {

        /* renamed from: a */
        static final C3336b f10631a = new C3336b();

        private C3336b() {
        }

        /* renamed from: a */
        public int mo11537a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C3334e.m14337b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: f.h.k.e$c */
    private interface C3337c {
        /* renamed from: a */
        int mo11537a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: f.h.k.e$d */
    private static abstract class C3338d implements C3333d {

        /* renamed from: a */
        private final C3337c f10632a;

        C3338d(C3337c cVar) {
            this.f10632a = cVar;
        }

        /* renamed from: c */
        private boolean m14341c(CharSequence charSequence, int i, int i2) {
            int a = this.f10632a.mo11537a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo11538b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo11536a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f10632a == null ? mo11538b() : m14341c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo11538b();
    }

    /* renamed from: f.h.k.e$e */
    private static class C3339e extends C3338d {

        /* renamed from: b */
        private final boolean f10633b;

        C3339e(C3337c cVar, boolean z) {
            super(cVar);
            this.f10633b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo11538b() {
            return this.f10633b;
        }
    }

    /* renamed from: f.h.k.e$f */
    private static class C3340f extends C3338d {

        /* renamed from: b */
        static final C3340f f10634b = new C3340f();

        C3340f() {
            super((C3337c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo11538b() {
            return C3341f.m14347b(Locale.getDefault()) == 1;
        }
    }

    static {
        C3335a aVar = C3335a.f10629b;
        C3340f fVar = C3340f.f10634b;
    }

    /* renamed from: a */
    static int m14336a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m14337b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
