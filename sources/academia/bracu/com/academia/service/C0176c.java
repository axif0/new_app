package academia.bracu.com.academia.service;

import com.karumi.dexter.BuildConfig;
import java.io.Serializable;
import java.util.Map;

/* renamed from: academia.bracu.com.academia.service.c */
public class C0176c implements Serializable {

    /* renamed from: f */
    private int f610f;

    /* renamed from: g */
    private String f611g = BuildConfig.FLAVOR;

    /* renamed from: h */
    private String f612h = BuildConfig.FLAVOR;

    /* renamed from: a */
    public String mo520a() {
        return this.f612h;
    }

    /* renamed from: b */
    public int mo521b() {
        return this.f610f;
    }

    /* renamed from: c */
    public String mo522c() {
        return this.f611g;
    }

    /* renamed from: d */
    public void mo523d(Map<String, String> map) {
    }

    /* renamed from: e */
    public void mo524e(String str) {
        this.f612h = str;
    }

    /* renamed from: f */
    public void mo525f(int i) {
        this.f610f = i;
    }

    /* renamed from: g */
    public void mo526g(String str) {
        this.f611g = str;
    }
}
