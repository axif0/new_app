package p374m;

import java.io.IOException;
import p374m.p375g0.C6130c;
import p385n.C6280d;
import p385n.C6282f;

/* renamed from: m.b0 */
public abstract class C6103b0 {

    /* renamed from: m.b0$a */
    class C6104a extends C6103b0 {

        /* renamed from: a */
        final /* synthetic */ C6261v f17082a;

        /* renamed from: b */
        final /* synthetic */ C6282f f17083b;

        C6104a(C6261v vVar, C6282f fVar) {
            this.f17082a = vVar;
            this.f17083b = fVar;
        }

        /* renamed from: a */
        public long mo17233a() throws IOException {
            return (long) this.f17083b.mo17892x();
        }

        /* renamed from: b */
        public C6261v mo17234b() {
            return this.f17082a;
        }

        /* renamed from: f */
        public void mo17235f(C6280d dVar) throws IOException {
            dVar.mo17801I(this.f17083b);
        }
    }

    /* renamed from: m.b0$b */
    class C6105b extends C6103b0 {

        /* renamed from: a */
        final /* synthetic */ C6261v f17084a;

        /* renamed from: b */
        final /* synthetic */ int f17085b;

        /* renamed from: c */
        final /* synthetic */ byte[] f17086c;

        /* renamed from: d */
        final /* synthetic */ int f17087d;

        C6105b(C6261v vVar, int i, byte[] bArr, int i2) {
            this.f17084a = vVar;
            this.f17085b = i;
            this.f17086c = bArr;
            this.f17087d = i2;
        }

        /* renamed from: a */
        public long mo17233a() {
            return (long) this.f17085b;
        }

        /* renamed from: b */
        public C6261v mo17234b() {
            return this.f17084a;
        }

        /* renamed from: f */
        public void mo17235f(C6280d dVar) throws IOException {
            dVar.mo17818d(this.f17086c, this.f17087d, this.f17085b);
        }
    }

    /* renamed from: c */
    public static C6103b0 m24899c(C6261v vVar, C6282f fVar) {
        return new C6104a(vVar, fVar);
    }

    /* renamed from: d */
    public static C6103b0 m24900d(C6261v vVar, byte[] bArr) {
        return m24901e(vVar, bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static C6103b0 m24901e(C6261v vVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C6130c.m25043f((long) bArr.length, (long) i, (long) i2);
            return new C6105b(vVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    /* renamed from: a */
    public long mo17233a() throws IOException {
        return -1;
    }

    /* renamed from: b */
    public abstract C6261v mo17234b();

    /* renamed from: f */
    public abstract void mo17235f(C6280d dVar) throws IOException;
}
