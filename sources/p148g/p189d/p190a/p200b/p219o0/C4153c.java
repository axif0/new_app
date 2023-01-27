package p148g.p189d.p190a.p200b.p219o0;

import java.nio.ByteBuffer;
import p148g.p189d.p190a.p200b.p202i0.C3897g;

/* renamed from: g.d.a.b.o0.c */
public abstract class C4153c extends C3897g<C4160i, C4161j, C4157g> implements C4156f {
    protected C4153c(String str) {
        super(new C4160i[2], new C4161j[2]);
        mo12682v(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C4157g mo12677k(C4160i iVar, C4161j jVar, boolean z) {
        try {
            ByteBuffer byteBuffer = iVar.f11822h;
            C4161j jVar2 = jVar;
            jVar2.mo13200t(iVar.f11823i, mo13192z(byteBuffer.array(), byteBuffer.limit(), z), iVar.f13193k);
            jVar.mo12656l(Integer.MIN_VALUE);
            return null;
        } catch (C4157g e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo13187B(C4161j jVar) {
        super.mo12681s(jVar);
    }

    /* renamed from: b */
    public void mo13188b(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C4160i mo12674h() {
        return new C4160i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C4161j mo12675i() {
        return new C4154d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C4157g mo12676j(Throwable th) {
        return new C4157g("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract C4155e mo13192z(byte[] bArr, int i, boolean z) throws C4157g;
}
