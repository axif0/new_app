package p148g.p176b.p177a.p178g;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b.a.g.m */
public class C3705m extends C3698f {
    public C3705m(C3701i iVar, C3696d dVar, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f11290a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f11300a = iVar.mo12224u(allocate, dVar.f11292c + ((long) (i * dVar.f11295f)) + 44);
    }
}
