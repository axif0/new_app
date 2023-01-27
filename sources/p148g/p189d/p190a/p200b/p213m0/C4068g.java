package p148g.p189d.p190a.p200b.p213m0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import p148g.p189d.p190a.p200b.C3828a;
import p148g.p189d.p190a.p200b.C3848h;
import p148g.p189d.p190a.p200b.C4109n;
import p148g.p189d.p190a.p200b.C4150o;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p230r0.C4260a;

/* renamed from: g.d.a.b.m0.g */
public final class C4068g extends C3828a implements Handler.Callback {

    /* renamed from: n */
    private final C4064d f12847n;

    /* renamed from: o */
    private final C4067f f12848o;

    /* renamed from: p */
    private final Handler f12849p;

    /* renamed from: q */
    private final C4150o f12850q;

    /* renamed from: r */
    private final C4066e f12851r;

    /* renamed from: s */
    private final C4059a[] f12852s;

    /* renamed from: t */
    private final long[] f12853t;

    /* renamed from: u */
    private int f12854u;

    /* renamed from: v */
    private int f12855v;

    /* renamed from: w */
    private C4062b f12856w;

    /* renamed from: x */
    private boolean f12857x;

    public C4068g(C4067f fVar, Looper looper) {
        this(fVar, looper, C4064d.f12845a);
    }

    public C4068g(C4067f fVar, Looper looper, C4064d dVar) {
        super(4);
        C4260a.m18073e(fVar);
        this.f12848o = fVar;
        this.f12849p = looper == null ? null : new Handler(looper, this);
        C4260a.m18073e(dVar);
        this.f12847n = dVar;
        this.f12850q = new C4150o();
        this.f12851r = new C4066e();
        this.f12852s = new C4059a[5];
        this.f12853t = new long[5];
    }

    /* renamed from: I */
    private void m17246I() {
        Arrays.fill(this.f12852s, (Object) null);
        this.f12854u = 0;
        this.f12855v = 0;
    }

    /* renamed from: J */
    private void m17247J(C4059a aVar) {
        Handler handler = this.f12849p;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            m17248K(aVar);
        }
    }

    /* renamed from: K */
    private void m17248K(C4059a aVar) {
        this.f12848o.mo12516n(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo12406B(long j, boolean z) {
        m17246I();
        this.f12857x = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo12409E(C4109n[] nVarArr, long j) throws C3848h {
        this.f12856w = this.f12847n.mo12953b(nVarArr[0]);
    }

    /* renamed from: a */
    public int mo12437a(C4109n nVar) {
        if (this.f12847n.mo12952a(nVar)) {
            return C3828a.m15879H((C3906c<?>) null, nVar.f12952n) ? 4 : 2;
        }
        return 0;
    }

    /* renamed from: c */
    public boolean mo12434c() {
        return this.f12857x;
    }

    /* renamed from: g */
    public boolean mo12435g() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m17248K((C4059a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public void mo12436l(long j, long j2) throws C3848h {
        if (!this.f12857x && this.f12855v < 5) {
            this.f12851r.mo12655k();
            if (mo12410F(this.f12850q, this.f12851r, false) == -4) {
                if (this.f12851r.mo12659o()) {
                    this.f12857x = true;
                } else if (!this.f12851r.mo12658n()) {
                    C4066e eVar = this.f12851r;
                    eVar.f12846k = this.f12850q.f13171a.f12939B;
                    eVar.mo12671u();
                    try {
                        int i = (this.f12854u + this.f12855v) % 5;
                        this.f12852s[i] = this.f12856w.mo12951a(this.f12851r);
                        this.f12853t[i] = this.f12851r.f11823i;
                        this.f12855v++;
                    } catch (C4063c e) {
                        throw C3848h.m16074a(e, mo12431x());
                    }
                }
            }
        }
        if (this.f12855v > 0) {
            long[] jArr = this.f12853t;
            int i2 = this.f12854u;
            if (jArr[i2] <= j) {
                m17247J(this.f12852s[i2]);
                C4059a[] aVarArr = this.f12852s;
                int i3 = this.f12854u;
                aVarArr[i3] = null;
                this.f12854u = (i3 + 1) % 5;
                this.f12855v--;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo12433z() {
        m17246I();
        this.f12856w = null;
    }
}
