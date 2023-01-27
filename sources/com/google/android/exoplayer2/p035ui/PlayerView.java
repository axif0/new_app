package com.google.android.exoplayer2.p035ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.exoplayer2.p035ui.C1531a;
import java.util.List;
import p148g.p189d.p190a.p200b.C3832c;
import p148g.p189d.p190a.p200b.C4316x;
import p148g.p189d.p190a.p200b.C4317y;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4072a;
import p148g.p189d.p190a.p200b.p217n0.C4146n;
import p148g.p189d.p190a.p200b.p219o0.C4152b;
import p148g.p189d.p190a.p200b.p219o0.C4162k;
import p148g.p189d.p190a.p200b.p228p0.C4229e;
import p148g.p189d.p190a.p200b.p228p0.C4231f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4284w;
import p148g.p189d.p190a.p200b.p231s0.C4302g;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
public class PlayerView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AspectRatioFrameLayout f5179f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final View f5180g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final View f5181h;

    /* renamed from: i */
    private final ImageView f5182i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SubtitleView f5183j;

    /* renamed from: k */
    private final C1531a f5184k;

    /* renamed from: l */
    private final C1530b f5185l;

    /* renamed from: m */
    private final FrameLayout f5186m;

    /* renamed from: n */
    private C4317y f5187n;

    /* renamed from: o */
    private boolean f5188o;

    /* renamed from: p */
    private boolean f5189p;

    /* renamed from: q */
    private Bitmap f5190q;

    /* renamed from: r */
    private int f5191r;

    /* renamed from: s */
    private boolean f5192s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f5193t;

    /* renamed from: u */
    private boolean f5194u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f5195v;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$b */
    private final class C1530b extends C4317y.C4318a implements C4162k, C4302g, View.OnLayoutChangeListener {
        private C1530b() {
        }

        /* renamed from: a */
        public void mo6240a(int i, int i2, int i3, float f) {
            if (PlayerView.this.f5179f != null) {
                float f2 = (i2 == 0 || i == 0) ? 1.0f : (((float) i) * f) / ((float) i2);
                if (PlayerView.this.f5181h instanceof TextureView) {
                    if (i3 == 90 || i3 == 270) {
                        f2 = 1.0f / f2;
                    }
                    if (PlayerView.this.f5195v != 0) {
                        PlayerView.this.f5181h.removeOnLayoutChangeListener(this);
                    }
                    int unused = PlayerView.this.f5195v = i3;
                    if (PlayerView.this.f5195v != 0) {
                        PlayerView.this.f5181h.addOnLayoutChangeListener(this);
                    }
                    PlayerView.m7377l((TextureView) PlayerView.this.f5181h, PlayerView.this.f5195v);
                }
                PlayerView.this.f5179f.setAspectRatio(f2);
            }
        }

        /* renamed from: c */
        public void mo6241c(boolean z, int i) {
            if (!PlayerView.this.m7382s() || !PlayerView.this.f5193t) {
                PlayerView.this.m7383t(false);
            } else {
                PlayerView.this.mo6219q();
            }
        }

        /* renamed from: e */
        public void mo6242e(int i) {
            if (PlayerView.this.m7382s() && PlayerView.this.f5193t) {
                PlayerView.this.mo6219q();
            }
        }

        /* renamed from: i */
        public void mo6243i() {
            if (PlayerView.this.f5180g != null) {
                PlayerView.this.f5180g.setVisibility(4);
            }
        }

        /* renamed from: k */
        public void mo6244k(List<C4152b> list) {
            if (PlayerView.this.f5183j != null) {
                PlayerView.this.f5183j.mo6244k(list);
            }
        }

        /* renamed from: o */
        public void mo6245o(C4146n nVar, C4231f fVar) {
            PlayerView.this.m7365A();
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m7377l((TextureView) view, PlayerView.this.f5195v);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (isInEditMode()) {
            this.f5179f = null;
            this.f5180g = null;
            this.f5181h = null;
            this.f5182i = null;
            this.f5183j = null;
            this.f5184k = null;
            this.f5185l = null;
            this.f5186m = null;
            ImageView imageView = new ImageView(context2);
            if (C4284w.f13659a >= 23) {
                m7379n(getResources(), imageView);
            } else {
                m7378m(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i7 = C1539e.exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1541g.PlayerView, 0, 0);
            try {
                z3 = obtainStyledAttributes.hasValue(C1541g.PlayerView_shutter_background_color);
                i5 = obtainStyledAttributes.getColor(C1541g.PlayerView_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C1541g.PlayerView_player_layout_id, i7);
                z2 = obtainStyledAttributes.getBoolean(C1541g.PlayerView_use_artwork, true);
                i4 = obtainStyledAttributes.getResourceId(C1541g.PlayerView_default_artwork, 0);
                z = obtainStyledAttributes.getBoolean(C1541g.PlayerView_use_controller, true);
                i3 = obtainStyledAttributes.getInt(C1541g.PlayerView_surface_type, 1);
                i2 = obtainStyledAttributes.getInt(C1541g.PlayerView_resize_mode, 0);
                int i8 = obtainStyledAttributes.getInt(C1541g.PlayerView_show_timeout, 5000);
                boolean z7 = obtainStyledAttributes.getBoolean(C1541g.PlayerView_hide_on_touch, true);
                boolean z8 = obtainStyledAttributes.getBoolean(C1541g.PlayerView_auto_show, true);
                int i9 = resourceId;
                boolean z9 = obtainStyledAttributes.getBoolean(C1541g.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z4 = z7;
                i6 = i8;
                z5 = z8;
                z6 = z9;
                i7 = i9;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z6 = true;
            z5 = true;
            i6 = 5000;
            z4 = true;
            z3 = false;
            i5 = 0;
            z2 = true;
            i4 = 0;
            z = true;
            i3 = 1;
            i2 = 0;
        }
        LayoutInflater.from(context).inflate(i7, this);
        this.f5185l = new C1530b();
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C1538d.exo_content_frame);
        this.f5179f = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m7386w(aspectRatioFrameLayout, i2);
        }
        View findViewById = findViewById(C1538d.exo_shutter);
        this.f5180g = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i5);
        }
        if (this.f5179f == null || i3 == 0) {
            this.f5181h = null;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            View textureView = i3 == 2 ? new TextureView(context2) : new SurfaceView(context2);
            this.f5181h = textureView;
            textureView.setLayoutParams(layoutParams);
            this.f5179f.addView(this.f5181h, 0);
        }
        this.f5186m = (FrameLayout) findViewById(C1538d.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(C1538d.exo_artwork);
        this.f5182i = imageView2;
        this.f5189p = z2 && imageView2 != null;
        if (i4 != 0) {
            this.f5190q = BitmapFactory.decodeResource(context.getResources(), i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C1538d.exo_subtitles);
        this.f5183j = subtitleView;
        if (subtitleView != null) {
            subtitleView.mo6248c();
            this.f5183j.mo6249d();
        }
        C1531a aVar = (C1531a) findViewById(C1538d.exo_controller);
        View findViewById2 = findViewById(C1538d.exo_controller_placeholder);
        if (aVar != null) {
            this.f5184k = aVar;
        } else if (findViewById2 != null) {
            C1531a aVar2 = new C1531a(context2, (AttributeSet) null, 0, attributeSet2);
            this.f5184k = aVar2;
            aVar2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(this.f5184k, indexOfChild);
        } else {
            this.f5184k = null;
        }
        this.f5191r = this.f5184k == null ? 0 : i6;
        this.f5194u = z4;
        this.f5192s = z5;
        this.f5193t = z6;
        this.f5188o = z && this.f5184k != null;
        mo6219q();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m7365A() {
        C4317y yVar = this.f5187n;
        if (yVar != null) {
            C4231f C = yVar.mo12469C();
            int i = 0;
            while (i < C.f13529a) {
                if (this.f5187n.mo12470D(i) != 2 || C.mo13357a(i) == null) {
                    i++;
                } else {
                    m7380p();
                    return;
                }
            }
            View view = this.f5180g;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f5189p) {
                for (int i2 = 0; i2 < C.f13529a; i2++) {
                    C4229e a = C.mo13357a(i2);
                    if (a != null) {
                        int i3 = 0;
                        while (i3 < a.length()) {
                            C4059a aVar = a.mo13326a(i3).f12947i;
                            if (aVar == null || !m7385v(aVar)) {
                                i3++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    }
                }
                if (m7384u(this.f5190q)) {
                    return;
                }
            }
            m7380p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m7377l(TextureView textureView, int i) {
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (width == 0.0f || height == 0.0f || i == 0) {
            textureView.setTransform((Matrix) null);
            return;
        }
        Matrix matrix = new Matrix();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        matrix.postRotate((float) i, f, f2);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        textureView.setTransform(matrix);
    }

    /* renamed from: m */
    private static void m7378m(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C1537c.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(C1536b.exo_edit_mode_background_color));
    }

    @TargetApi(23)
    /* renamed from: n */
    private static void m7379n(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C1537c.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(C1536b.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    /* renamed from: p */
    private void m7380p() {
        ImageView imageView = this.f5182i;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f5182i.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: r */
    private boolean m7381r(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public boolean m7382s() {
        C4317y yVar = this.f5187n;
        return yVar != null && yVar.mo12484g() && this.f5187n.mo12489l();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m7383t(boolean z) {
        if ((!m7382s() || !this.f5193t) && this.f5188o) {
            boolean z2 = this.f5184k.mo6259L() && this.f5184k.getShowTimeoutMs() <= 0;
            boolean x = m7387x();
            if (z || z2 || x) {
                m7388z(x);
            }
        }
    }

    /* renamed from: u */
    private boolean m7384u(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0) {
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f5179f;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(((float) width) / ((float) height));
                }
                this.f5182i.setImageBitmap(bitmap);
                this.f5182i.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    private boolean m7385v(C4059a aVar) {
        for (int i = 0; i < aVar.mo12942b(); i++) {
            C4059a.C4061b a = aVar.mo12941a(i);
            if (a instanceof C4072a) {
                byte[] bArr = ((C4072a) a).f12868j;
                return m7384u(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
        }
        return false;
    }

    /* renamed from: w */
    private static void m7386w(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: x */
    private boolean m7387x() {
        C4317y yVar = this.f5187n;
        if (yVar == null) {
            return true;
        }
        int n = yVar.mo12491n();
        return this.f5192s && (n == 1 || n == 4 || !this.f5187n.mo12489l());
    }

    /* renamed from: z */
    private void m7388z(boolean z) {
        if (this.f5188o) {
            this.f5184k.setShowTimeoutMs(z ? 0 : this.f5191r);
            this.f5184k.mo6260U();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C4317y yVar = this.f5187n;
        if (yVar == null || !yVar.mo12484g()) {
            boolean z = m7381r(keyEvent.getKeyCode()) && this.f5188o && !this.f5184k.mo6259L();
            m7383t(true);
            return z || mo6216o(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        this.f5186m.requestFocus();
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean getControllerAutoShow() {
        return this.f5192s;
    }

    public boolean getControllerHideOnTouch() {
        return this.f5194u;
    }

    public int getControllerShowTimeoutMs() {
        return this.f5191r;
    }

    public Bitmap getDefaultArtwork() {
        return this.f5190q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f5186m;
    }

    public C4317y getPlayer() {
        return this.f5187n;
    }

    public SubtitleView getSubtitleView() {
        return this.f5183j;
    }

    public boolean getUseArtwork() {
        return this.f5189p;
    }

    public boolean getUseController() {
        return this.f5188o;
    }

    public View getVideoSurfaceView() {
        return this.f5181h;
    }

    /* renamed from: o */
    public boolean mo6216o(KeyEvent keyEvent) {
        return this.f5188o && this.f5184k.mo6257E(keyEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5188o || this.f5187n == null || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (!this.f5184k.mo6259L()) {
            m7383t(true);
        } else if (this.f5194u) {
            this.f5184k.mo6258H();
        }
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f5188o || this.f5187n == null) {
            return false;
        }
        m7383t(true);
        return true;
    }

    /* renamed from: q */
    public void mo6219q() {
        C1531a aVar = this.f5184k;
        if (aVar != null) {
            aVar.mo6258H();
        }
    }

    public void setControlDispatcher(C3832c cVar) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setControlDispatcher(cVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f5192s = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f5193t = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C4260a.m18074f(this.f5184k != null);
        this.f5194u = z;
    }

    public void setControllerShowTimeoutMs(int i) {
        C4260a.m18074f(this.f5184k != null);
        this.f5191r = i;
        if (this.f5184k.mo6259L()) {
            mo6239y();
        }
    }

    public void setControllerVisibilityListener(C1531a.C1535d dVar) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setVisibilityListener(dVar);
    }

    public void setDefaultArtwork(Bitmap bitmap) {
        if (this.f5190q != bitmap) {
            this.f5190q = bitmap;
            m7365A();
        }
    }

    public void setFastForwardIncrementMs(int i) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setFastForwardIncrementMs(i);
    }

    public void setPlaybackPreparer(C4316x xVar) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setPlaybackPreparer(xVar);
    }

    public void setPlayer(C4317y yVar) {
        C4317y yVar2 = this.f5187n;
        if (yVar2 != yVar) {
            if (yVar2 != null) {
                yVar2.mo12503z(this.f5185l);
                C4317y.C4321d f = this.f5187n.mo12483f();
                if (f != null) {
                    f.mo12471E(this.f5185l);
                    View view = this.f5181h;
                    if (view instanceof TextureView) {
                        f.mo12479b((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        f.mo12495r((SurfaceView) view);
                    }
                }
                C4317y.C4320c H = this.f5187n.mo12474H();
                if (H != null) {
                    H.mo12497t(this.f5185l);
                }
            }
            this.f5187n = yVar;
            if (this.f5188o) {
                this.f5184k.setPlayer(yVar);
            }
            View view2 = this.f5180g;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            SubtitleView subtitleView = this.f5183j;
            if (subtitleView != null) {
                subtitleView.setCues((List<C4152b>) null);
            }
            if (yVar != null) {
                C4317y.C4321d f2 = yVar.mo12483f();
                if (f2 != null) {
                    View view3 = this.f5181h;
                    if (view3 instanceof TextureView) {
                        f2.mo12468B((TextureView) view3);
                    } else if (view3 instanceof SurfaceView) {
                        f2.mo12480c((SurfaceView) view3);
                    }
                    f2.mo12473G(this.f5185l);
                }
                C4317y.C4320c H2 = yVar.mo12474H();
                if (H2 != null) {
                    H2.mo12496s(this.f5185l);
                }
                yVar.mo12494q(this.f5185l);
                m7383t(false);
                m7365A();
                return;
            }
            mo6219q();
            m7380p();
        }
    }

    public void setRepeatToggleModes(int i) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C4260a.m18074f(this.f5179f != null);
        this.f5179f.setResizeMode(i);
    }

    public void setRewindIncrementMs(int i) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setRewindIncrementMs(i);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setShowMultiWindowTimeBar(z);
    }

    public void setShowShuffleButton(boolean z) {
        C4260a.m18074f(this.f5184k != null);
        this.f5184k.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f5180g;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        C4260a.m18074f(!z || this.f5182i != null);
        if (this.f5189p != z) {
            this.f5189p = z;
            m7365A();
        }
    }

    public void setUseController(boolean z) {
        C1531a aVar;
        C4317y yVar;
        C4260a.m18074f(!z || this.f5184k != null);
        if (this.f5188o != z) {
            this.f5188o = z;
            if (z) {
                aVar = this.f5184k;
                yVar = this.f5187n;
            } else {
                C1531a aVar2 = this.f5184k;
                if (aVar2 != null) {
                    aVar2.mo6258H();
                    aVar = this.f5184k;
                    yVar = null;
                } else {
                    return;
                }
            }
            aVar.setPlayer(yVar);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f5181h;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: y */
    public void mo6239y() {
        m7388z(m7387x());
    }
}
