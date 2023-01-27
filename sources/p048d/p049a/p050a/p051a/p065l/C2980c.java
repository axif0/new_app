package p048d.p049a.p050a.p051a.p065l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Handler;
import android.widget.ImageView;
import com.karumi.dexter.C2722R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: d.a.a.a.l.c */
public class C2980c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2985e f9515a = new C2985e();

    /* renamed from: b */
    private C2979b f9516b;

    /* renamed from: c */
    private Map<ImageView, String> f9517c = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: d */
    private ExecutorService f9518d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f9519e = new Handler();

    /* renamed from: d.a.a.a.l.c$a */
    class C2981a implements Runnable {

        /* renamed from: f */
        Bitmap f9520f;

        /* renamed from: g */
        C2982b f9521g;

        C2981a(Bitmap bitmap, C2982b bVar) {
            this.f9520f = bitmap;
            this.f9521g = bVar;
        }

        public void run() {
            if (!C2980c.this.m12761h(this.f9521g)) {
                Bitmap bitmap = this.f9520f;
                if (bitmap != null) {
                    this.f9521g.f9524b.setImageBitmap(bitmap);
                } else {
                    this.f9521g.f9524b.setImageResource(C2722R.mipmap.ic_launcher_new);
                }
            }
        }
    }

    /* renamed from: d.a.a.a.l.c$b */
    private class C2982b {

        /* renamed from: a */
        public String f9523a;

        /* renamed from: b */
        public ImageView f9524b;

        C2982b(C2980c cVar, String str, ImageView imageView) {
            this.f9523a = str;
            this.f9524b = imageView;
        }
    }

    /* renamed from: d.a.a.a.l.c$c */
    class C2983c implements Runnable {

        /* renamed from: f */
        C2982b f9525f;

        C2983c(C2982b bVar) {
            this.f9525f = bVar;
        }

        public void run() {
            try {
                if (!C2980c.this.m12761h(this.f9525f)) {
                    Bitmap c = C2980c.this.m12760g(this.f9525f.f9523a);
                    C2980c.this.f9515a.mo10317e(this.f9525f.f9523a, c);
                    if (!C2980c.this.m12761h(this.f9525f)) {
                        C2980c.this.f9519e.post(new C2981a(c, this.f9525f));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public C2980c(Context context) {
        this.f9516b = new C2979b(context);
        this.f9518d = Executors.newFixedThreadPool(5);
    }

    /* renamed from: f */
    private Bitmap m12759f(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
            fileInputStream.close();
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            while (true) {
                if (i2 / 2 < 70) {
                    break;
                } else if (i3 / 2 < 70) {
                    break;
                } else {
                    i2 /= 2;
                    i3 /= 2;
                    i *= 2;
                }
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, (Rect) null, options2);
            fileInputStream2.close();
            return decodeStream;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public Bitmap m12760g(String str) {
        File a = this.f9516b.mo10305a(str);
        Bitmap f = m12759f(a);
        if (f != null) {
            return f;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(true);
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            C3101n.m13308a(inputStream, fileOutputStream);
            fileOutputStream.close();
            httpURLConnection.disconnect();
            return m12759f(a);
        } catch (Throwable th) {
            th.printStackTrace();
            if (!(th instanceof OutOfMemoryError)) {
                return null;
            }
            this.f9515a.mo10314b();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m12761h(C2982b bVar) {
        String str = this.f9517c.get(bVar.f9524b);
        return str == null || !str.equals(bVar.f9523a);
    }

    /* renamed from: i */
    private void m12762i(String str, ImageView imageView) {
        this.f9518d.submit(new C2983c(new C2982b(this, str, imageView)));
    }

    /* renamed from: a */
    public void mo10306a(String str, ImageView imageView) {
        this.f9517c.put(imageView, str);
        Bitmap c = this.f9515a.mo10315c(str);
        if (c != null) {
            imageView.setImageBitmap(c);
            return;
        }
        m12762i(str, imageView);
        imageView.setImageResource(C2722R.mipmap.ic_launcher_new);
    }
}
