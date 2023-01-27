package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.b */
public class C3694b extends C3695c {
    public C3694b(C3701i iVar, C3696d dVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f11290a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        this.f11288a = iVar.mo12222r(allocate, j2);
        this.f11289b = iVar.mo12222r(allocate, j2 + 8);
    }
}
