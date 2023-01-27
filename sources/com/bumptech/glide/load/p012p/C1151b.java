package com.bumptech.glide.load.p012p;

import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.b */
public class C1151b<Data> implements C1188n<byte[], Data> {

    /* renamed from: a */
    private final C1154b<Data> f4322a;

    /* renamed from: com.bumptech.glide.load.p.b$a */
    public static class C1152a implements C1190o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.p.b$a$a */
        class C1153a implements C1154b<ByteBuffer> {
            C1153a(C1152a aVar) {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo5461a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo5462b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: b */
        public C1188n<byte[], ByteBuffer> mo5458b(C1196r rVar) {
            return new C1151b(new C1153a(this));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.b$b */
    public interface C1154b<Data> {
        /* renamed from: a */
        Class<Data> mo5461a();

        /* renamed from: b */
        Data mo5462b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.p.b$c */
    private static class C1155c<Data> implements C1010d<Data> {

        /* renamed from: f */
        private final byte[] f4323f;

        /* renamed from: g */
        private final C1154b<Data> f4324g;

        C1155c(byte[] bArr, C1154b<Data> bVar) {
            this.f4323f = bArr;
            this.f4324g = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo5162a() {
            return this.f4324g.mo5461a();
        }

        /* renamed from: b */
        public void mo5167b() {
        }

        public void cancel() {
        }

        /* renamed from: e */
        public C0992a mo5171e() {
            return C0992a.LOCAL;
        }

        /* renamed from: f */
        public void mo5172f(C0969f fVar, C1010d.C1011a<? super Data> aVar) {
            aVar.mo5179d(this.f4324g.mo5462b(this.f4323f));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.b$d */
    public static class C1156d implements C1190o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.p.b$d$a */
        class C1157a implements C1154b<InputStream> {
            C1157a(C1156d dVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo5461a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo5462b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: b */
        public C1188n<byte[], InputStream> mo5458b(C1196r rVar) {
            return new C1151b(new C1157a(this));
        }
    }

    public C1151b(C1154b<Data> bVar) {
        this.f4322a = bVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(byte[] bArr, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(bArr), new C1155c(bArr, this.f4322a));
    }

    /* renamed from: d */
    public boolean mo5454b(byte[] bArr) {
        return true;
    }
}
