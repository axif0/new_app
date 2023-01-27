package com.bumptech.glide.load.p012p;

import android.util.Log;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import com.bumptech.glide.p029s.C1388a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d */
public class C1159d implements C1188n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.p.d$a */
    private static final class C1160a implements C1010d<ByteBuffer> {

        /* renamed from: f */
        private final File f4325f;

        C1160a(File file) {
            this.f4325f = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo5162a() {
            return ByteBuffer.class;
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
        public void mo5172f(C0969f fVar, C1010d.C1011a<? super ByteBuffer> aVar) {
            try {
                aVar.mo5179d(C1388a.m6938a(this.f4325f));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo5178c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d$b */
    public static class C1161b implements C1190o<File, ByteBuffer> {
        /* renamed from: b */
        public C1188n<File, ByteBuffer> mo5458b(C1196r rVar) {
            return new C1159d();
        }
    }

    /* renamed from: c */
    public C1188n.C1189a<ByteBuffer> mo5453a(File file, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(file), new C1160a(file));
    }

    /* renamed from: d */
    public boolean mo5454b(File file) {
        return true;
    }
}
