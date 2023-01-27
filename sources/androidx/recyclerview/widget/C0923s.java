package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.s */
class C0923s {

    /* renamed from: a */
    final C0925b f3685a;

    /* renamed from: b */
    C0924a f3686b = new C0924a();

    /* renamed from: androidx.recyclerview.widget.s$a */
    static class C0924a {

        /* renamed from: a */
        int f3687a = 0;

        /* renamed from: b */
        int f3688b;

        /* renamed from: c */
        int f3689c;

        /* renamed from: d */
        int f3690d;

        /* renamed from: e */
        int f3691e;

        C0924a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4853a(int i) {
            this.f3687a = i | this.f3687a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4854b() {
            int i = this.f3687a;
            if ((i & 7) != 0 && (i & (mo4855c(this.f3690d, this.f3688b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3687a;
            if ((i2 & 112) != 0 && (i2 & (mo4855c(this.f3690d, this.f3689c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3687a;
            if ((i3 & 1792) != 0 && (i3 & (mo4855c(this.f3691e, this.f3688b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3687a;
            return (i4 & 28672) == 0 || (i4 & (mo4855c(this.f3691e, this.f3689c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4855c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4856d() {
            this.f3687a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4857e(int i, int i2, int i3, int i4) {
            this.f3688b = i;
            this.f3689c = i2;
            this.f3690d = i3;
            this.f3691e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.s$b */
    interface C0925b {
        /* renamed from: a */
        View mo4511a(int i);

        /* renamed from: b */
        int mo4512b();

        /* renamed from: c */
        int mo4513c(View view);

        /* renamed from: d */
        int mo4514d();

        /* renamed from: e */
        int mo4515e(View view);
    }

    C0923s(C0925b bVar) {
        this.f3685a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4851a(int i, int i2, int i3, int i4) {
        int d = this.f3685a.mo4514d();
        int b = this.f3685a.mo4512b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f3685a.mo4511a(i);
            this.f3686b.mo4857e(d, b, this.f3685a.mo4513c(a), this.f3685a.mo4515e(a));
            if (i3 != 0) {
                this.f3686b.mo4856d();
                this.f3686b.mo4853a(i3);
                if (this.f3686b.mo4854b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f3686b.mo4856d();
                this.f3686b.mo4853a(i4);
                if (this.f3686b.mo4854b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4852b(View view, int i) {
        this.f3686b.mo4857e(this.f3685a.mo4514d(), this.f3685a.mo4512b(), this.f3685a.mo4513c(view), this.f3685a.mo4515e(view));
        if (i == 0) {
            return false;
        }
        this.f3686b.mo4856d();
        this.f3686b.mo4853a(i);
        return this.f3686b.mo4854b();
    }
}
