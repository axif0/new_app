package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.p047o.C2699b;
import com.journeyapps.barcodescanner.p047o.C2708d;
import com.journeyapps.barcodescanner.p047o.C2710e;
import com.journeyapps.barcodescanner.p047o.C2712g;
import com.journeyapps.barcodescanner.p047o.C2713h;
import com.journeyapps.barcodescanner.p047o.C2714i;
import com.journeyapps.barcodescanner.p047o.C2715j;
import com.journeyapps.barcodescanner.p047o.C2717l;
import java.util.ArrayList;
import java.util.List;
import p148g.p189d.p296d.p300r.p301a.C5404g;
import p148g.p189d.p296d.p300r.p301a.C5408k;

/* renamed from: com.journeyapps.barcodescanner.c */
public class C2666c extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final String f8534F = C2666c.class.getSimpleName();

    /* renamed from: A */
    private boolean f8535A = false;

    /* renamed from: B */
    private final SurfaceHolder.Callback f8536B = new C2668b();

    /* renamed from: C */
    private final Handler.Callback f8537C = new C2669c();

    /* renamed from: D */
    private C2689j f8538D = new C2670d();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C2673f f8539E = new C2672e();

    /* renamed from: f */
    private C2699b f8540f;

    /* renamed from: g */
    private WindowManager f8541g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f8542h;

    /* renamed from: i */
    private boolean f8543i = false;

    /* renamed from: j */
    private SurfaceView f8544j;

    /* renamed from: k */
    private TextureView f8545k;

    /* renamed from: l */
    private boolean f8546l = false;

    /* renamed from: m */
    private C2690k f8547m;

    /* renamed from: n */
    private int f8548n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List<C2673f> f8549o = new ArrayList();

    /* renamed from: p */
    private C2713h f8550p;

    /* renamed from: q */
    private C2708d f8551q = new C2708d();

    /* renamed from: r */
    private C2692l f8552r;

    /* renamed from: s */
    private C2692l f8553s;

    /* renamed from: t */
    private Rect f8554t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C2692l f8555u;

    /* renamed from: v */
    private Rect f8556v = null;

    /* renamed from: w */
    private Rect f8557w = null;

    /* renamed from: x */
    private C2692l f8558x = null;

    /* renamed from: y */
    private double f8559y = 0.1d;

    /* renamed from: z */
    private C2717l f8560z = null;

    /* renamed from: com.journeyapps.barcodescanner.c$a */
    class C2667a implements TextureView.SurfaceTextureListener {
        C2667a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C2692l unused = C2666c.this.f8555u = new C2692l(i, i2);
            C2666c.this.m11878A();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.c$b */
    class C2668b implements SurfaceHolder.Callback {
        C2668b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                Log.e(C2666c.f8534F, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            C2692l unused = C2666c.this.f8555u = new C2692l(i2, i3);
            C2666c.this.m11878A();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C2692l unused = C2666c.this.f8555u = null;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.c$c */
    class C2669c implements Handler.Callback {
        C2669c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C5404g.zxing_prewiew_size_ready) {
                C2666c.this.m11892u((C2692l) message.obj);
                return true;
            } else if (i != C5404g.zxing_camera_error) {
                return false;
            } else {
                Exception exc = (Exception) message.obj;
                if (!C2666c.this.mo9761r()) {
                    return false;
                }
                C2666c.this.mo9705t();
                C2666c.this.f8539E.mo9737b(exc);
                return false;
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.c$d */
    class C2670d implements C2689j {

        /* renamed from: com.journeyapps.barcodescanner.c$d$a */
        class C2671a implements Runnable {
            C2671a() {
            }

            public void run() {
                C2666c.this.m11893x();
            }
        }

        C2670d() {
        }

        /* renamed from: a */
        public void mo9778a(int i) {
            C2666c.this.f8542h.postDelayed(new C2671a(), 250);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.c$e */
    class C2672e implements C2673f {
        C2672e() {
        }

        /* renamed from: a */
        public void mo9736a() {
            for (C2673f a : C2666c.this.f8549o) {
                a.mo9736a();
            }
        }

        /* renamed from: b */
        public void mo9737b(Exception exc) {
            for (C2673f b : C2666c.this.f8549o) {
                b.mo9737b(exc);
            }
        }

        /* renamed from: c */
        public void mo9738c() {
            for (C2673f c : C2666c.this.f8549o) {
                c.mo9738c();
            }
        }

        /* renamed from: d */
        public void mo9739d() {
            for (C2673f d : C2666c.this.f8549o) {
                d.mo9739d();
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.c$f */
    public interface C2673f {
        /* renamed from: a */
        void mo9736a();

        /* renamed from: b */
        void mo9737b(Exception exc);

        /* renamed from: c */
        void mo9738c();

        /* renamed from: d */
        void mo9739d();
    }

    public C2666c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11891p(context, attributeSet, 0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m11878A() {
        Rect rect;
        C2710e eVar;
        C2692l lVar = this.f8555u;
        if (lVar != null && this.f8553s != null && (rect = this.f8554t) != null) {
            if (this.f8544j == null || !lVar.equals(new C2692l(rect.width(), this.f8554t.height()))) {
                TextureView textureView = this.f8545k;
                if (textureView != null && Build.VERSION.SDK_INT >= 14 && textureView.getSurfaceTexture() != null) {
                    if (this.f8553s != null) {
                        this.f8545k.setTransform(mo9754l(new C2692l(this.f8545k.getWidth(), this.f8545k.getHeight()), this.f8553s));
                    }
                    eVar = new C2710e(this.f8545k.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                eVar = new C2710e(this.f8544j.getHolder());
            }
            m11895z(eVar);
        }
    }

    @TargetApi(14)
    /* renamed from: B */
    private TextureView.SurfaceTextureListener m11879B() {
        return new C2667a();
    }

    private int getDisplayRotation() {
        return this.f8541g.getDefaultDisplay().getRotation();
    }

    /* renamed from: j */
    private void m11888j() {
        C2692l lVar;
        C2713h hVar;
        C2692l lVar2 = this.f8552r;
        if (lVar2 == null || (lVar = this.f8553s) == null || (hVar = this.f8550p) == null) {
            this.f8557w = null;
            this.f8556v = null;
            this.f8554t = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = lVar.f8612f;
        int i2 = lVar.f8613g;
        int i3 = lVar2.f8612f;
        int i4 = lVar2.f8613g;
        this.f8554t = hVar.mo9884d(lVar);
        this.f8556v = mo9753k(new Rect(0, 0, i3, i4), this.f8554t);
        Rect rect = new Rect(this.f8556v);
        Rect rect2 = this.f8554t;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i) / this.f8554t.width(), (rect.top * i2) / this.f8554t.height(), (rect.right * i) / this.f8554t.width(), (rect.bottom * i2) / this.f8554t.height());
        this.f8557w = rect3;
        if (rect3.width() <= 0 || this.f8557w.height() <= 0) {
            this.f8557w = null;
            this.f8556v = null;
            Log.w(f8534F, "Preview frame is too small");
            return;
        }
        this.f8539E.mo9736a();
    }

    /* renamed from: m */
    private void m11889m(C2692l lVar) {
        this.f8552r = lVar;
        C2699b bVar = this.f8540f;
        if (bVar != null && bVar.mo9833j() == null) {
            C2713h hVar = new C2713h(getDisplayRotation(), lVar);
            this.f8550p = hVar;
            hVar.mo9885e(getPreviewScalingStrategy());
            this.f8540f.mo9838q(this.f8550p);
            this.f8540f.mo9832i();
            boolean z = this.f8535A;
            if (z) {
                this.f8540f.mo9841t(z);
            }
        }
    }

    /* renamed from: o */
    private void m11890o() {
        if (this.f8540f != null) {
            Log.w(f8534F, "initCamera called twice");
            return;
        }
        C2699b n = mo9755n();
        this.f8540f = n;
        n.mo9839r(this.f8542h);
        this.f8540f.mo9835n();
        this.f8548n = getDisplayRotation();
    }

    /* renamed from: p */
    private void m11891p(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        mo9760q(attributeSet);
        this.f8541g = (WindowManager) context.getSystemService("window");
        this.f8542h = new Handler(this.f8537C);
        this.f8547m = new C2690k();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m11892u(C2692l lVar) {
        this.f8553s = lVar;
        if (this.f8552r != null) {
            m11888j();
            requestLayout();
            m11878A();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m11893x() {
        if (mo9761r() && getDisplayRotation() != this.f8548n) {
            mo9705t();
            mo9769w();
        }
    }

    @SuppressLint({"NewAPI"})
    /* renamed from: y */
    private void m11894y() {
        View view;
        if (!this.f8543i || Build.VERSION.SDK_INT < 14) {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f8544j = surfaceView;
            if (Build.VERSION.SDK_INT < 11) {
                surfaceView.getHolder().setType(3);
            }
            this.f8544j.getHolder().addCallback(this.f8536B);
            view = this.f8544j;
        } else {
            TextureView textureView = new TextureView(getContext());
            this.f8545k = textureView;
            textureView.setSurfaceTextureListener(m11879B());
            view = this.f8545k;
        }
        addView(view);
    }

    /* renamed from: z */
    private void m11895z(C2710e eVar) {
        if (!this.f8546l && this.f8540f != null) {
            Log.i(f8534F, "Starting preview");
            this.f8540f.mo9840s(eVar);
            this.f8540f.mo9842u();
            this.f8546l = true;
            mo9706v();
            this.f8539E.mo9738c();
        }
    }

    public C2699b getCameraInstance() {
        return this.f8540f;
    }

    public C2708d getCameraSettings() {
        return this.f8551q;
    }

    public Rect getFramingRect() {
        return this.f8556v;
    }

    public C2692l getFramingRectSize() {
        return this.f8558x;
    }

    public double getMarginFraction() {
        return this.f8559y;
    }

    public Rect getPreviewFramingRect() {
        return this.f8557w;
    }

    public C2717l getPreviewScalingStrategy() {
        C2717l lVar = this.f8560z;
        return lVar != null ? lVar : this.f8545k != null ? new C2712g() : new C2714i();
    }

    /* renamed from: i */
    public void mo9752i(C2673f fVar) {
        this.f8549o.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Rect mo9753k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f8558x != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f8558x.f8612f) / 2), Math.max(0, (rect3.height() - this.f8558x.f8613g) / 2));
            return rect3;
        }
        double width = (double) rect3.width();
        double d = this.f8559y;
        Double.isNaN(width);
        double d2 = width * d;
        double height = (double) rect3.height();
        double d3 = this.f8559y;
        Double.isNaN(height);
        int min = (int) Math.min(d2, height * d3);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Matrix mo9754l(C2692l lVar, C2692l lVar2) {
        float f;
        float f2 = ((float) lVar.f8612f) / ((float) lVar.f8613g);
        float f3 = ((float) lVar2.f8612f) / ((float) lVar2.f8613g);
        float f4 = 1.0f;
        if (f2 < f3) {
            f4 = f3 / f2;
            f = 1.0f;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        int i = lVar.f8612f;
        int i2 = lVar.f8613g;
        matrix.postTranslate((((float) i) - (((float) i) * f4)) / 2.0f, (((float) i2) - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C2699b mo9755n() {
        C2699b bVar = new C2699b(getContext());
        bVar.mo9837p(this.f8551q);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11894y();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m11889m(new C2692l(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.f8544j;
        if (surfaceView != null) {
            Rect rect = this.f8554t;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f8545k;
            if (textureView != null && Build.VERSION.SDK_INT >= 14) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f8535A);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo9760q(AttributeSet attributeSet) {
        C2717l jVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5408k.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(C5408k.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C5408k.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f8558x = new C2692l(dimension, dimension2);
        }
        this.f8543i = obtainStyledAttributes.getBoolean(C5408k.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(C5408k.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            jVar = new C2712g();
        } else if (integer == 2) {
            jVar = new C2714i();
        } else {
            if (integer == 3) {
                jVar = new C2715j();
            }
            obtainStyledAttributes.recycle();
        }
        this.f8560z = jVar;
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo9761r() {
        return this.f8540f != null;
    }

    /* renamed from: s */
    public boolean mo9762s() {
        return this.f8546l;
    }

    public void setCameraSettings(C2708d dVar) {
        this.f8551q = dVar;
    }

    public void setFramingRectSize(C2692l lVar) {
        this.f8558x = lVar;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.f8559y = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(C2717l lVar) {
        this.f8560z = lVar;
    }

    public void setTorch(boolean z) {
        this.f8535A = z;
        C2699b bVar = this.f8540f;
        if (bVar != null) {
            bVar.mo9841t(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.f8543i = z;
    }

    /* renamed from: t */
    public void mo9705t() {
        TextureView textureView;
        SurfaceView surfaceView;
        C2694n.m11984a();
        Log.d(f8534F, "pause()");
        this.f8548n = -1;
        C2699b bVar = this.f8540f;
        if (bVar != null) {
            bVar.mo9831h();
            this.f8540f = null;
            this.f8546l = false;
        }
        if (this.f8555u == null && (surfaceView = this.f8544j) != null) {
            surfaceView.getHolder().removeCallback(this.f8536B);
        }
        if (this.f8555u == null && (textureView = this.f8545k) != null && Build.VERSION.SDK_INT >= 14) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f8552r = null;
        this.f8553s = null;
        this.f8557w = null;
        this.f8547m.mo9812f();
        this.f8539E.mo9739d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo9706v() {
    }

    /* renamed from: w */
    public void mo9769w() {
        C2694n.m11984a();
        Log.d(f8534F, "resume()");
        m11890o();
        if (this.f8555u != null) {
            m11878A();
        } else {
            SurfaceView surfaceView = this.f8544j;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f8536B);
            } else {
                TextureView textureView = this.f8545k;
                if (textureView != null && Build.VERSION.SDK_INT >= 14) {
                    if (textureView.isAvailable()) {
                        m11879B().onSurfaceTextureAvailable(this.f8545k.getSurfaceTexture(), this.f8545k.getWidth(), this.f8545k.getHeight());
                    } else {
                        this.f8545k.setSurfaceTextureListener(m11879B());
                    }
                }
            }
        }
        requestLayout();
        this.f8547m.mo9811e(getContext(), this.f8538D);
    }
}
