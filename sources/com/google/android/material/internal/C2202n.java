package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p148g.p189d.p190a.p252d.p269y.C5047d;
import p148g.p189d.p190a.p252d.p269y.C5051f;

/* renamed from: com.google.android.material.internal.n */
public class C2202n {

    /* renamed from: a */
    private final TextPaint f7304a = new TextPaint(1);

    /* renamed from: b */
    private final C5051f f7305b = new C2203a();

    /* renamed from: c */
    private float f7306c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f7307d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C2204b> f7308e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C5047d f7309f;

    /* renamed from: com.google.android.material.internal.n$a */
    class C2203a extends C5051f {
        C2203a() {
        }

        /* renamed from: a */
        public void mo7993a(int i) {
            boolean unused = C2202n.this.f7307d = true;
            C2204b bVar = (C2204b) C2202n.this.f7308e.get();
            if (bVar != null) {
                bVar.mo8096a();
            }
        }

        /* renamed from: b */
        public void mo7994b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C2202n.this.f7307d = true;
                C2204b bVar = (C2204b) C2202n.this.f7308e.get();
                if (bVar != null) {
                    bVar.mo8096a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.n$b */
    public interface C2204b {
        /* renamed from: a */
        void mo8096a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C2202n(C2204b bVar) {
        mo8606g(bVar);
    }

    /* renamed from: c */
    private float m10287c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7304a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C5047d mo8603d() {
        return this.f7309f;
    }

    /* renamed from: e */
    public TextPaint mo8604e() {
        return this.f7304a;
    }

    /* renamed from: f */
    public float mo8605f(String str) {
        if (!this.f7307d) {
            return this.f7306c;
        }
        float c = m10287c(str);
        this.f7306c = c;
        this.f7307d = false;
        return c;
    }

    /* renamed from: g */
    public void mo8606g(C2204b bVar) {
        this.f7308e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo8607h(C5047d dVar, Context context) {
        if (this.f7309f != dVar) {
            this.f7309f = dVar;
            if (dVar != null) {
                dVar.mo15132j(context, this.f7304a, this.f7305b);
                C2204b bVar = (C2204b) this.f7308e.get();
                if (bVar != null) {
                    this.f7304a.drawableState = bVar.getState();
                }
                dVar.mo15131i(context, this.f7304a, this.f7305b);
                this.f7307d = true;
            }
            C2204b bVar2 = (C2204b) this.f7308e.get();
            if (bVar2 != null) {
                bVar2.mo8096a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo8608i(boolean z) {
        this.f7307d = z;
    }

    /* renamed from: j */
    public void mo8609j(Context context) {
        this.f7309f.mo15131i(context, this.f7304a, this.f7305b);
    }
}
