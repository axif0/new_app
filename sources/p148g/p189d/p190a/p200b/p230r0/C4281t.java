package p148g.p189d.p190a.p200b.p230r0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: g.d.a.b.r0.t */
final class C4281t implements C4266g {

    /* renamed from: a */
    private final Handler f13655a;

    public C4281t(Handler handler) {
        this.f13655a = handler;
    }

    /* renamed from: a */
    public Message mo13419a(int i, int i2, int i3) {
        return this.f13655a.obtainMessage(i, i2, i3);
    }

    /* renamed from: b */
    public boolean mo13420b(int i) {
        return this.f13655a.sendEmptyMessage(i);
    }

    /* renamed from: c */
    public Message mo13421c(int i, int i2, int i3, Object obj) {
        return this.f13655a.obtainMessage(i, i2, i3, obj);
    }

    /* renamed from: d */
    public boolean mo13422d(int i, long j) {
        return this.f13655a.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: e */
    public void mo13423e(int i) {
        this.f13655a.removeMessages(i);
    }

    /* renamed from: f */
    public Message mo13424f(int i, Object obj) {
        return this.f13655a.obtainMessage(i, obj);
    }

    /* renamed from: g */
    public Looper mo13425g() {
        return this.f13655a.getLooper();
    }
}
