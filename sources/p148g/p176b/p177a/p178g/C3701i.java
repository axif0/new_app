package p148g.p176b.p177a.p178g;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g.b.a.g.i */
public class C3701i implements Closeable {

    /* renamed from: f */
    private final FileChannel f11303f;

    public C3701i(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f11303f = new FileInputStream(file).getChannel();
    }

    /* renamed from: a */
    private long m15505a(C3696d dVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C3697e b = dVar.mo12214b(j3);
            if (b.f11296a == 1) {
                long j4 = b.f11298c;
                if (j4 <= j2 && j2 <= b.f11299d + j4) {
                    return (j2 - j4) + b.f11297b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public void close() throws IOException {
        this.f11303f.close();
    }

    /* renamed from: h */
    public C3696d mo12217h() throws IOException {
        this.f11303f.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo12224u(allocate, 0) == 1179403647) {
            short o = mo12220o(allocate, 4);
            boolean z = mo12220o(allocate, 5) == 2;
            if (o == 1) {
                return new C3699g(z, this);
            }
            if (o == 2) {
                return new C3700h(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    /* renamed from: j */
    public List<String> mo12218j() throws IOException {
        long j;
        this.f11303f.position(0);
        ArrayList arrayList = new ArrayList();
        C3696d h = mo12217h();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(h.f11290a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (long) h.f11294e;
        int i = 0;
        if (j2 == 65535) {
            j2 = h.mo12215c(0).f11300a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            C3697e b = h.mo12214b(j3);
            if (b.f11296a == 2) {
                j = b.f11297b;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j4 = 0;
        while (true) {
            C3695c a = h.mo12213a(j, i);
            long j5 = j;
            long j6 = a.f11288a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a.f11289b));
            } else if (j6 == 5) {
                j4 = a.f11289b;
            }
            i++;
            if (a.f11288a == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long a2 = m15505a(h, j2, j4);
            for (Long longValue : arrayList2) {
                arrayList.add(mo12223t(allocate, longValue.longValue() + a2));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo12219m(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f11303f.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public short mo12220o(ByteBuffer byteBuffer, long j) throws IOException {
        mo12219m(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo12221q(ByteBuffer byteBuffer, long j) throws IOException {
        mo12219m(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public long mo12222r(ByteBuffer byteBuffer, long j) throws IOException {
        mo12219m(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo12223t(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short o = mo12220o(byteBuffer, j);
            if (o == 0) {
                return sb.toString();
            }
            sb.append((char) o);
            j = j2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public long mo12224u(ByteBuffer byteBuffer, long j) throws IOException {
        mo12219m(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
