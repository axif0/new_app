package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.l */
public class C3704l extends C3698f {
    public C3704l(C3701i iVar, C3696d dVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f11290a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f11300a = iVar.mo12224u(allocate, dVar.f11292c + ((long) (i * dVar.f11295f)) + 28);
    }
}
