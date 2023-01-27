package com.bumptech.glide.load.p012p;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.f */
public class C1167f<Data> implements C1188n<File, Data> {

    /* renamed from: a */
    private final C1172d<Data> f4331a;

    /* renamed from: com.bumptech.glide.load.p.f$a */
    public static class C1168a<Data> implements C1190o<File, Data> {

        /* renamed from: a */
        private final C1172d<Data> f4332a;

        public C1168a(C1172d<Data> dVar) {
            this.f4332a = dVar;
        }

        /* renamed from: b */
        public final C1188n<File, Data> mo5458b(C1196r rVar) {
            return new C1167f(this.f4332a);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$b */
    public static class C1169b extends C1168a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.p.f$b$a */
        class C1170a implements C1172d<ParcelFileDescriptor> {
            C1170a() {
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo5475a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo5476b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo5477c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C1169b() {
            super(new C1170a());
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$c */
    private static final class C1171c<Data> implements C1010d<Data> {

        /* renamed from: f */
        private final File f4333f;

        /* renamed from: g */
        private final C1172d<Data> f4334g;

        /* renamed from: h */
        private Data f4335h;

        C1171c(File file, C1172d<Data> dVar) {
            this.f4333f = file;
            this.f4334g = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo5162a() {
            return this.f4334g.mo5475a();
        }

        /* renamed from: b */
        public void mo5167b() {
            Data data = this.f4335h;
            if (data != null) {
                try {
                    this.f4334g.mo5476b(data);
                } catch (IOException unused) {
                }
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
                Data c = this.f4334g.mo5477c(this.f4333f);
                this.f4335h = c;
                aVar.mo5179d(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo5178c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.f$d */
    public interface C1172d<Data> {
        /* renamed from: a */
        Class<Data> mo5475a();

        /* renamed from: b */
        void mo5476b(Data data) throws IOException;

        /* renamed from: c */
        Data mo5477c(File file) throws FileNotFoundException;
    }

    /* renamed from: com.bumptech.glide.load.p.f$e */
    public static class C1173e extends C1168a<InputStream> {

        /* renamed from: com.bumptech.glide.load.p.f$e$a */
        class C1174a implements C1172d<InputStream> {
            C1174a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo5475a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo5476b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo5477c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C1173e() {
            super(new C1174a());
        }
    }

    public C1167f(C1172d<Data> dVar) {
        this.f4331a = dVar;
    }

    /* renamed from: c */
    public C1188n.C1189a<Data> mo5453a(File file, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(file), new C1171c(file, this.f4331a));
    }

    /* renamed from: d */
    public boolean mo5454b(File file) {
        return true;
    }
}
