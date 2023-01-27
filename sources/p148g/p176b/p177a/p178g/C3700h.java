package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.h */
public class C3700h extends C3696d {

    /* renamed from: g */
    private final C3701i f11302g;

    public C3700h(boolean z, C3701i iVar) throws IOException {
        this.f11290a = z;
        this.f11302g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.mo12221q(allocate, 16);
        this.f11291b = iVar.mo12222r(allocate, 32);
        this.f11292c = iVar.mo12222r(allocate, 40);
        this.f11293d = iVar.mo12221q(allocate, 54);
        this.f11294e = iVar.mo12221q(allocate, 56);
        this.f11295f = iVar.mo12221q(allocate, 58);
        iVar.mo12221q(allocate, 60);
        iVar.mo12221q(allocate, 62);
    }

    /* renamed from: a */
    public C3695c mo12213a(long j, int i) throws IOException {
        return new C3694b(this.f11302g, this, j, i);
    }

    /* renamed from: b */
    public C3697e mo12214b(long j) throws IOException {
        return new C3703k(this.f11302g, this, j);
    }

    /* renamed from: c */
    public C3698f mo12215c(int i) throws IOException {
        return new C3705m(this.f11302g, this, i);
    }
}
