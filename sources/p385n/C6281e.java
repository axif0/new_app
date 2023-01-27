package p385n;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: n.e */
public interface C6281e extends C6300s, ReadableByteChannel {
    /* renamed from: A */
    boolean mo17794A() throws IOException;

    /* renamed from: C */
    byte[] mo17798C(long j) throws IOException;

    /* renamed from: K */
    short mo17803K() throws IOException;

    /* renamed from: M */
    long mo17805M() throws IOException;

    /* renamed from: P */
    String mo17806P(long j) throws IOException;

    /* renamed from: R */
    long mo17807R(C6299r rVar) throws IOException;

    /* renamed from: W */
    void mo17809W(long j) throws IOException;

    /* renamed from: b */
    C6277c mo17813b();

    /* renamed from: b0 */
    long mo17814b0(byte b) throws IOException;

    /* renamed from: c */
    void mo17815c(long j) throws IOException;

    /* renamed from: c0 */
    boolean mo17816c0(long j, C6282f fVar) throws IOException;

    /* renamed from: d0 */
    long mo17819d0() throws IOException;

    InputStream inputStream();

    /* renamed from: k */
    C6282f mo17831k(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    String mo17849s() throws IOException;

    /* renamed from: v */
    byte[] mo17856v() throws IOException;

    /* renamed from: y */
    int mo17862y() throws IOException;
}
