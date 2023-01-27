package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.a */
public class C3693a extends C3695c {
    public C3693a(C3701i iVar, C3696d dVar, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f11290a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        this.f11288a = iVar.mo12224u(allocate, j2);
        this.f11289b = iVar.mo12224u(allocate, j2 + 4);
    }
}
