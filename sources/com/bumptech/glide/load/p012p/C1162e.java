package com.bumptech.glide.load.p012p;

import android.util.Base64;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.e */
public final class C1162e<Model, Data> implements C1188n<Model, Data> {

    /* renamed from: a */
    private final C1163a<Data> f4326a;

    /* renamed from: com.bumptech.glide.load.p.e$a */
    public interface C1163a<Data> {
        /* renamed from: a */
        Class<Data> mo5468a();

        /* renamed from: b */
        void mo5469b(Data data) throws IOException;

        /* renamed from: c */
        Data mo5470c(String str) throws IllegalArgumentException;
    }

    /* renamed from: com.bumptech.glide.load.p.e$b */
    private static final class C1164b<Data> implements C1010d<Data> {

        /* renamed from: f */
        private final String f4327f;

        /* renamed from: g */
        private final C1163a<Data> f4328g;

        /* renamed from: h */
        private Data f4329h;

        C1164b(String str, C1163a<Data> aVar) {
            this.f4327f = str;
            this.f4328g = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo5162a() {
            return this.f4328g.mo5468a();
        }

        /* renamed from: b */
        public void mo5167b() {
            try {
                this.f4328g.mo5469b(this.f4329h);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        /* renamed from: e */
        public C0992a mo5171e() {
            return C0992a.LOCAL;
        }

        /* renamed from: f */
        public void mo5172f(C0969f fVar, C1010d.C1011a<? super Data> aVar) {
            try {
                Data c = this.f4328g.mo5470c(this.f4327f);
                this.f4329h = c;
                aVar.mo5179d(c);
            } catch (IllegalArgumentException e) {
                aVar.mo5178c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.e$c */
    public static final class C1165c<Model> implements C1190o<Model, InputStream> {

        /* renamed from: a */
        private final C1163a<InputStream> f4330a = new C1166a(this);

        /* renamed from: com.bumptech.glide.load.p.e$c$a */
        class C1166a implements C1163a<InputStream> {
            C1166a(C1165c cVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo5468a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo5469b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo5470c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: b */
        public C1188n<Model, InputStream> mo5458b(C1196r rVar) {
            return new C1162e(this.f4330a);
        }
    }

    public C1162e(C1163a<Data> aVar) {
        this.f4326a = aVar;
    }

    /* renamed from: a */
    public C1188n.C1189a<Data> mo5453a(Model model, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(model), new C1164b(model.toString(), this.f4326a));
    }

    /* renamed from: b */
    public boolean mo5454b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
