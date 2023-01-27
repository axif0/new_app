package p048d.p049a.p050a.p051a.p065l;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: d.a.a.a.l.e */
public class C2985e {

    /* renamed from: a */
    private Map<String, Bitmap> f9533a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* renamed from: b */
    private long f9534b = 0;

    /* renamed from: c */
    private long f9535c = 1000000;

    public C2985e() {
        mo10318f(Runtime.getRuntime().maxMemory() / 4);
    }

    /* renamed from: a */
    private void m12765a() {
        if (this.f9534b > this.f9535c) {
            Iterator<Map.Entry<String, Bitmap>> it = this.f9533a.entrySet().iterator();
            while (it.hasNext()) {
                this.f9534b -= mo10316d((Bitmap) it.next().getValue());
                it.remove();
                if (this.f9534b <= this.f9535c) {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo10314b() {
        try {
            this.f9533a.clear();
            this.f9534b = 0;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public Bitmap mo10315c(String str) {
        try {
            if (!this.f9533a.containsKey(str)) {
                return null;
            }
            return this.f9533a.get(str);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo10316d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return (long) (bitmap.getRowBytes() * bitmap.getHeight());
    }

    /* renamed from: e */
    public void mo10317e(String str, Bitmap bitmap) {
        try {
            if (this.f9533a.containsKey(str)) {
                this.f9534b -= mo10316d(this.f9533a.get(str));
            }
            this.f9533a.put(str, bitmap);
            this.f9534b += mo10316d(bitmap);
            m12765a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo10318f(long j) {
        this.f9535c = j;
    }
}
