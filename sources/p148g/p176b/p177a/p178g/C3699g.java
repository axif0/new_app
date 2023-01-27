package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.g */
public class C3699g extends C3696d {

    /* renamed from: g */
    private final C3701i f11301g;

    public C3699g(boolean z, C3701i iVar) throws IOException {
        this.f11290a = z;
        this.f11301g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.mo12221q(allocate, 16);
        this.f11291b = iVar.mo12224u(allocate, 28);
        this.f11292c = iVar.mo12224u(allocate, 32);
        this.f11293d = iVar.mo12221q(allocate, 42);
        this.f11294e = iVar.mo12221q(allocate, 44);
        this.f11295f = iVar.mo12221q(allocate, 46);
        iVar.mo12221q(allocate, 48);
        iVar.mo12221q(allocate, 50);
    }

    /* renamed from: a */
    public C3695c mo12213a(long j, int i) throws IOException {
        return new C3693a(this.f11301g, this, j, i);
    }

    /* renamed from: b */
    public C3697e mo12214b(long j) throws IOException {
        return new C3702j(this.f11301g, this, j);
    }

    /* renamed from: c */
    public C3698f mo12215c(int i) throws IOException {
        return new C3704l(this.f11301g, this, i);
    }
}
