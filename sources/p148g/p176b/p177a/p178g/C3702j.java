package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.j */
public class C3702j extends C3697e {
    public C3702j(C3701i iVar, C3696d dVar, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f11290a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = dVar.f11291b + (j * ((long) dVar.f11293d));
        this.f11296a = iVar.mo12224u(allocate, j2);
        this.f11297b = iVar.mo12224u(allocate, 4 + j2);
        this.f11298c = iVar.mo12224u(allocate, 8 + j2);
        this.f11299d = iVar.mo12224u(allocate, j2 + 20);
    }
}
