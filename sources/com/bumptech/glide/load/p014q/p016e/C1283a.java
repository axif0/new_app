package com.bumptech.glide.load.p014q.p016e;

import com.bumptech.glide.load.p006n.C1012e;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.q.e.a */
public class C1283a implements C1012e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f4504a;

    /* renamed from: com.bumptech.glide.load.q.e.a$a */
    public static class C1284a implements C1012e.C1013a<ByteBuffer> {
        /* renamed from: a */
        public Class<ByteBuffer> mo5182a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public C1012e<ByteBuffer> mo5183b(ByteBuffer byteBuffer) {
            return new C1283a(byteBuffer);
        }
    }

    public C1283a(ByteBuffer byteBuffer) {
        this.f4504a = byteBuffer;
    }

    /* renamed from: b */
    public void mo5181b() {
    }

    /* renamed from: c */
    public ByteBuffer mo5180a() {
        this.f4504a.position(0);
        return this.f4504a;
    }
}
