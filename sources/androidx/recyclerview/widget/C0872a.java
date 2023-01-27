package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0911m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p121l.C3346e;
import p086f.p111h.p121l.C3347f;

/* renamed from: androidx.recyclerview.widget.a */
class C0872a implements C0911m.C0912a {

    /* renamed from: a */
    private C3346e<C0874b> f3506a;

    /* renamed from: b */
    final ArrayList<C0874b> f3507b;

    /* renamed from: c */
    final ArrayList<C0874b> f3508c;

    /* renamed from: d */
    final C0873a f3509d;

    /* renamed from: e */
    Runnable f3510e;

    /* renamed from: f */
    final boolean f3511f;

    /* renamed from: g */
    final C0911m f3512g;

    /* renamed from: h */
    private int f3513h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C0873a {
        /* renamed from: a */
        void mo4346a(int i, int i2);

        /* renamed from: b */
        void mo4347b(C0874b bVar);

        /* renamed from: c */
        RecyclerView.C0829d0 mo4348c(int i);

        /* renamed from: d */
        void mo4349d(int i, int i2);

        /* renamed from: e */
        void mo4350e(int i, int i2);

        /* renamed from: f */
        void mo4351f(int i, int i2);

        /* renamed from: g */
        void mo4352g(C0874b bVar);

        /* renamed from: h */
        void mo4353h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class C0874b {

        /* renamed from: a */
        int f3514a;

        /* renamed from: b */
        int f3515b;

        /* renamed from: c */
        Object f3516c;

        /* renamed from: d */
        int f3517d;

        C0874b(int i, int i2, int i3, Object obj) {
            this.f3514a = i;
            this.f3515b = i2;
            this.f3517d = i3;
            this.f3516c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4700a() {
            int i = this.f3514a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0874b.class != obj.getClass()) {
                return false;
            }
            C0874b bVar = (C0874b) obj;
            int i = this.f3514a;
            if (i != bVar.f3514a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3517d - this.f3515b) == 1 && this.f3517d == bVar.f3515b && this.f3515b == bVar.f3517d) {
                return true;
            }
            if (this.f3517d != bVar.f3517d || this.f3515b != bVar.f3515b) {
                return false;
            }
            Object obj2 = this.f3516c;
            Object obj3 = bVar.f3516c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3514a * 31) + this.f3515b) * 31) + this.f3517d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4700a() + ",s:" + this.f3515b + "c:" + this.f3517d + ",p:" + this.f3516c + "]";
        }
    }

    C0872a(C0873a aVar) {
        this(aVar, false);
    }

    C0872a(C0873a aVar, boolean z) {
        this.f3506a = new C3347f(30);
        this.f3507b = new ArrayList<>();
        this.f3508c = new ArrayList<>();
        this.f3513h = 0;
        this.f3509d = aVar;
        this.f3511f = z;
        this.f3512g = new C0911m(this);
    }

    /* renamed from: c */
    private void m4873c(C0874b bVar) {
        m4879v(bVar);
    }

    /* renamed from: d */
    private void m4874d(C0874b bVar) {
        m4879v(bVar);
    }

    /* renamed from: f */
    private void m4875f(C0874b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3515b;
        int i2 = bVar.f3517d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3509d.mo4348c(i3) != null || m4877h(i3)) {
                if (c2 == 0) {
                    m4878k(mo4683b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m4879v(mo4683b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3517d) {
            mo4682a(bVar);
            bVar = mo4683b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m4878k(bVar);
        } else {
            m4879v(bVar);
        }
    }

    /* renamed from: g */
    private void m4876g(C0874b bVar) {
        int i = bVar.f3515b;
        int i2 = bVar.f3517d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3509d.mo4348c(i) != null || m4877h(i)) {
                if (c == 0) {
                    m4878k(mo4683b(4, i3, i4, bVar.f3516c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m4879v(mo4683b(4, i3, i4, bVar.f3516c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3517d) {
            Object obj = bVar.f3516c;
            mo4682a(bVar);
            bVar = mo4683b(4, i3, i4, obj);
        }
        if (c == 0) {
            m4878k(bVar);
        } else {
            m4879v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m4877h(int i) {
        int size = this.f3508c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0874b bVar = this.f3508c.get(i2);
            int i3 = bVar.f3514a;
            if (i3 == 8) {
                if (mo4689n(bVar.f3517d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3515b;
                int i5 = bVar.f3517d + i4;
                while (i4 < i5) {
                    if (mo4689n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m4878k(C0874b bVar) {
        int i;
        int i2 = bVar.f3514a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z = m4880z(bVar.f3515b, i2);
        int i3 = bVar.f3515b;
        int i4 = bVar.f3514a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3517d; i6++) {
            int z2 = m4880z(bVar.f3515b + (i * i6), bVar.f3514a);
            int i7 = bVar.f3514a;
            if (i7 == 2 ? z2 == z : i7 == 4 && z2 == z + 1) {
                i5++;
            } else {
                C0874b b = mo4683b(bVar.f3514a, z, i5, bVar.f3516c);
                mo4687l(b, i3);
                mo4682a(b);
                if (bVar.f3514a == 4) {
                    i3 += i5;
                }
                z = z2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3516c;
        mo4682a(bVar);
        if (i5 > 0) {
            C0874b b2 = mo4683b(bVar.f3514a, z, i5, obj);
            mo4687l(b2, i3);
            mo4682a(b2);
        }
    }

    /* renamed from: v */
    private void m4879v(C0874b bVar) {
        this.f3508c.add(bVar);
        int i = bVar.f3514a;
        if (i == 1) {
            this.f3509d.mo4350e(bVar.f3515b, bVar.f3517d);
        } else if (i == 2) {
            this.f3509d.mo4349d(bVar.f3515b, bVar.f3517d);
        } else if (i == 4) {
            this.f3509d.mo4353h(bVar.f3515b, bVar.f3517d, bVar.f3516c);
        } else if (i == 8) {
            this.f3509d.mo4346a(bVar.f3515b, bVar.f3517d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m4880z(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f3508c.size() - 1; size >= 0; size--) {
            C0874b bVar = this.f3508c.get(size);
            int i7 = bVar.f3514a;
            if (i7 == 8) {
                int i8 = bVar.f3515b;
                int i9 = bVar.f3517d;
                if (i8 >= i9) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                if (i < i8 || i > i9) {
                    int i11 = bVar.f3515b;
                    if (i < i11) {
                        if (i2 == 1) {
                            bVar.f3515b = i11 + 1;
                            i4 = bVar.f3517d + 1;
                        } else if (i2 == 2) {
                            bVar.f3515b = i11 - 1;
                            i4 = bVar.f3517d - 1;
                        }
                        bVar.f3517d = i4;
                    }
                } else {
                    int i12 = bVar.f3515b;
                    if (i8 == i12) {
                        if (i2 == 1) {
                            i6 = bVar.f3517d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f3517d - 1;
                            }
                            i++;
                        }
                        bVar.f3517d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i12 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i12 - 1;
                            }
                            i--;
                        }
                        bVar.f3515b = i5;
                        i--;
                    }
                }
            } else {
                int i13 = bVar.f3515b;
                if (i13 > i) {
                    if (i2 == 1) {
                        i3 = i13 + 1;
                    } else if (i2 == 2) {
                        i3 = i13 - 1;
                    }
                    bVar.f3515b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f3517d;
                } else if (i7 == 2) {
                    i += bVar.f3517d;
                }
            }
        }
        for (int size2 = this.f3508c.size() - 1; size2 >= 0; size2--) {
            C0874b bVar2 = this.f3508c.get(size2);
            if (bVar2.f3514a == 8) {
                int i14 = bVar2.f3517d;
                if (i14 != bVar2.f3515b && i14 >= 0) {
                }
            } else if (bVar2.f3517d > 0) {
            }
            this.f3508c.remove(size2);
            mo4682a(bVar2);
        }
        return i;
    }

    /* renamed from: a */
    public void mo4682a(C0874b bVar) {
        if (!this.f3511f) {
            bVar.f3516c = null;
            this.f3506a.mo5908a(bVar);
        }
    }

    /* renamed from: b */
    public C0874b mo4683b(int i, int i2, int i3, Object obj) {
        C0874b b = this.f3506a.mo5909b();
        if (b == null) {
            return new C0874b(i, i2, i3, obj);
        }
        b.f3514a = i;
        b.f3515b = i2;
        b.f3517d = i3;
        b.f3516c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo4684e(int i) {
        int size = this.f3507b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0874b bVar = this.f3507b.get(i2);
            int i3 = bVar.f3514a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3515b;
                    if (i4 <= i) {
                        int i5 = bVar.f3517d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3515b;
                    if (i6 == i) {
                        i = bVar.f3517d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3517d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3515b <= i) {
                i += bVar.f3517d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4685i() {
        int size = this.f3508c.size();
        for (int i = 0; i < size; i++) {
            this.f3509d.mo4347b(this.f3508c.get(i));
        }
        mo4698x(this.f3508c);
        this.f3513h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4686j() {
        mo4685i();
        int size = this.f3507b.size();
        for (int i = 0; i < size; i++) {
            C0874b bVar = this.f3507b.get(i);
            int i2 = bVar.f3514a;
            if (i2 == 1) {
                this.f3509d.mo4347b(bVar);
                this.f3509d.mo4350e(bVar.f3515b, bVar.f3517d);
            } else if (i2 == 2) {
                this.f3509d.mo4347b(bVar);
                this.f3509d.mo4351f(bVar.f3515b, bVar.f3517d);
            } else if (i2 == 4) {
                this.f3509d.mo4347b(bVar);
                this.f3509d.mo4353h(bVar.f3515b, bVar.f3517d, bVar.f3516c);
            } else if (i2 == 8) {
                this.f3509d.mo4347b(bVar);
                this.f3509d.mo4346a(bVar.f3515b, bVar.f3517d);
            }
            Runnable runnable = this.f3510e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4698x(this.f3507b);
        this.f3513h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4687l(C0874b bVar, int i) {
        this.f3509d.mo4352g(bVar);
        int i2 = bVar.f3514a;
        if (i2 == 2) {
            this.f3509d.mo4351f(i, bVar.f3517d);
        } else if (i2 == 4) {
            this.f3509d.mo4353h(i, bVar.f3517d, bVar.f3516c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4688m(int i) {
        return mo4689n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo4689n(int i, int i2) {
        int size = this.f3508c.size();
        while (i2 < size) {
            C0874b bVar = this.f3508c.get(i2);
            int i3 = bVar.f3514a;
            if (i3 == 8) {
                int i4 = bVar.f3515b;
                if (i4 == i) {
                    i = bVar.f3517d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3517d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3515b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3517d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3517d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4690o(int i) {
        return (i & this.f3513h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4691p() {
        return this.f3507b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4692q() {
        return !this.f3508c.isEmpty() && !this.f3507b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4693r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f3507b.add(mo4683b(4, i, i2, obj));
        this.f3513h |= 4;
        return this.f3507b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo4694s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3507b.add(mo4683b(1, i, i2, (Object) null));
        this.f3513h |= 1;
        return this.f3507b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo4695t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f3507b.add(mo4683b(8, i, i2, (Object) null));
            this.f3513h |= 8;
            return this.f3507b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo4696u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3507b.add(mo4683b(2, i, i2, (Object) null));
        this.f3513h |= 2;
        return this.f3507b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4697w() {
        this.f3512g.mo4804b(this.f3507b);
        int size = this.f3507b.size();
        for (int i = 0; i < size; i++) {
            C0874b bVar = this.f3507b.get(i);
            int i2 = bVar.f3514a;
            if (i2 == 1) {
                m4873c(bVar);
            } else if (i2 == 2) {
                m4875f(bVar);
            } else if (i2 == 4) {
                m4876g(bVar);
            } else if (i2 == 8) {
                m4874d(bVar);
            }
            Runnable runnable = this.f3510e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3507b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4698x(List<C0874b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4682a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4699y() {
        mo4698x(this.f3507b);
        mo4698x(this.f3508c);
        this.f3513h = 0;
    }
}
