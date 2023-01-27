package p086f.p142q;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: f.q.c */
final class C3480c {

    /* renamed from: f.q.c$a */
    static class C3481a {

        /* renamed from: a */
        long f10894a;

        /* renamed from: b */
        long f10895b;

        C3481a() {
        }
    }

    /* renamed from: a */
    static long m15000a(RandomAccessFile randomAccessFile, C3481a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f10895b;
        randomAccessFile.seek(aVar.f10894a);
        int min = (int) Math.min(16384, j);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = randomAccessFile.read(bArr, 0, min);
            if (read == -1) {
                break;
            }
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            min = (int) Math.min(16384, j);
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    static C3481a m15001b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C3481a aVar = new C3481a();
                    aVar.f10895b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f10894a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    static long m15002c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m15000a(randomAccessFile, m15001b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
