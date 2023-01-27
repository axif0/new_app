package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c */
public class C0876c implements C0910l {

    /* renamed from: a */
    final C0910l f3519a;

    /* renamed from: b */
    int f3520b = 0;

    /* renamed from: c */
    int f3521c = -1;

    /* renamed from: d */
    int f3522d = -1;

    /* renamed from: e */
    Object f3523e = null;

    public C0876c(C0910l lVar) {
        this.f3519a = lVar;
    }

    /* renamed from: a */
    public void mo4704a(int i, int i2) {
        int i3;
        if (this.f3520b != 2 || (i3 = this.f3521c) < i || i3 > i + i2) {
            mo4708e();
            this.f3521c = i;
            this.f3522d = i2;
            this.f3520b = 2;
            return;
        }
        this.f3522d += i2;
        this.f3521c = i;
    }

    /* renamed from: b */
    public void mo4705b(int i, int i2) {
        mo4708e();
        this.f3519a.mo4705b(i, i2);
    }

    /* renamed from: c */
    public void mo4706c(int i, int i2) {
        int i3;
        if (this.f3520b == 1 && i >= (i3 = this.f3521c)) {
            int i4 = this.f3522d;
            if (i <= i3 + i4) {
                this.f3522d = i4 + i2;
                this.f3521c = Math.min(i, i3);
                return;
            }
        }
        mo4708e();
        this.f3521c = i;
        this.f3522d = i2;
        this.f3520b = 1;
    }

    /* renamed from: d */
    public void mo4707d(int i, int i2, Object obj) {
        int i3;
        if (this.f3520b == 3) {
            int i4 = this.f3521c;
            int i5 = this.f3522d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f3523e == obj) {
                this.f3521c = Math.min(i, i4);
                this.f3522d = Math.max(i5 + i4, i3) - this.f3521c;
                return;
            }
        }
        mo4708e();
        this.f3521c = i;
        this.f3522d = i2;
        this.f3523e = obj;
        this.f3520b = 3;
    }

    /* renamed from: e */
    public void mo4708e() {
        int i = this.f3520b;
        if (i != 0) {
            if (i == 1) {
                this.f3519a.mo4706c(this.f3521c, this.f3522d);
            } else if (i == 2) {
                this.f3519a.mo4704a(this.f3521c, this.f3522d);
            } else if (i == 3) {
                this.f3519a.mo4707d(this.f3521c, this.f3522d, this.f3523e);
            }
            this.f3523e = null;
            this.f3520b = 0;
        }
    }
}
