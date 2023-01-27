package academia.bracu.com.academia.mediaslider;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.app.C0273e;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.C0954a;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.C0977i;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.p008o.C1134q;
import com.bumptech.glide.p025q.C1364e;
import com.bumptech.glide.p025q.p026j.C1377h;
import com.google.android.exoplayer2.p035ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import p086f.p111h.p112e.p113c.C3279f;
import p148g.p189d.p190a.p200b.C3836e;
import p148g.p189d.p190a.p200b.C3840f0;
import p148g.p189d.p190a.p200b.C3843g;
import p148g.p189d.p190a.p200b.C3899j;
import p148g.p189d.p190a.p200b.p217n0.C4121d;
import p148g.p189d.p190a.p200b.p217n0.C4126f;
import p148g.p189d.p190a.p200b.p228p0.C4221b;
import p148g.p189d.p190a.p200b.p229q0.C4244h;

/* renamed from: academia.bracu.com.academia.mediaslider.d */
public class C0165d extends C0273e {

    /* renamed from: A */
    private boolean f581A;

    /* renamed from: B */
    private boolean f582B;

    /* renamed from: C */
    private String f583C;

    /* renamed from: D */
    private Toolbar f584D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ArrayList<String> f585E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public ArrayList<String> f586F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f587G;

    /* renamed from: H */
    private String f588H;

    /* renamed from: I */
    private String f589I;

    /* renamed from: J */
    private int f590J = 0;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public TextView f591K;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ViewPager f592x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public TextView f593y;

    /* renamed from: z */
    private boolean f594z;

    /* renamed from: academia.bracu.com.academia.mediaslider.d$a */
    class C0166a implements ViewPager.C0948j {
        C0166a() {
        }

        /* renamed from: a */
        public void mo506a(int i, float f, int i2) {
            if (C0165d.this.f587G.equalsIgnoreCase("video")) {
                ViewPager T = C0165d.this.f592x;
                PlayerView playerView = (PlayerView) T.findViewWithTag("view" + i).findViewById(C0171g.video_view);
                if (playerView.getPlayer() != null) {
                    ((C3840f0) playerView.getPlayer()).mo12482e(false);
                }
            }
        }

        /* renamed from: b */
        public void mo507b(int i) {
        }

        /* renamed from: c */
        public void mo508c(int i) {
            C0165d.this.f593y.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(C0165d.this.f592x.getCurrentItem() + 1), Integer.valueOf(C0165d.this.f585E.size())}));
            if (C0165d.this.f587G.equalsIgnoreCase("video")) {
                ViewPager T = C0165d.this.f592x;
                PlayerView playerView = (PlayerView) T.findViewWithTag("view" + i).findViewById(C0171g.video_view);
                if (playerView.getPlayer() != null) {
                    C3840f0 f0Var = (C3840f0) playerView.getPlayer();
                    f0Var.mo12478a(new C4121d.C4123b(new C4244h("media-slider-view")).mo13118a(Uri.parse((String) C0165d.this.f585E.get(i))), true, true);
                    f0Var.mo12482e(false);
                    f0Var.mo12486i(0, 0);
                }
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.mediaslider.d$b */
    private class C0167b extends C0954a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Context f596b;

        /* renamed from: c */
        private ArrayList<String> f597c;

        /* renamed from: d */
        private String f598d;

        /* renamed from: e */
        C3840f0 f599e;

        /* renamed from: f */
        PlayerView f600f;

        /* renamed from: g */
        C4126f f601g;

        /* renamed from: h */
        TouchImageView f602h;

        /* renamed from: academia.bracu.com.academia.mediaslider.d$b$a */
        class C0168a implements C1364e<Drawable> {
            C0168a() {
            }

            /* renamed from: b */
            public boolean mo514b(C1134q qVar, Object obj, C1377h<Drawable> hVar, boolean z) {
                C0167b bVar = C0167b.this;
                bVar.f602h.setImageDrawable(C3279f.m14126a(bVar.f596b.getResources(), C0170f.images, (Resources.Theme) null));
                return false;
            }

            /* renamed from: c */
            public boolean mo513a(Drawable drawable, Object obj, C1377h<Drawable> hVar, C0992a aVar, boolean z) {
                return false;
            }
        }

        static {
            Class<C0165d> cls = C0165d.class;
        }

        private C0167b(Context context, ArrayList<String> arrayList, String str) {
            this.f596b = context;
            this.f597c = arrayList;
            this.f598d = str;
        }

        /* synthetic */ C0167b(C0165d dVar, Context context, ArrayList arrayList, String str, C0166a aVar) {
            this(context, arrayList, str);
        }

        /* renamed from: a */
        public void mo509a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* renamed from: d */
        public int mo510d() {
            return this.f597c.size();
        }

        /* renamed from: h */
        public Object mo511h(ViewGroup viewGroup, int i) {
            if (C0165d.this.f586F != null && C0165d.this.f586F.size() > i) {
                C0165d.this.f591K.setText((CharSequence) C0165d.this.f586F.get(i));
            }
            LayoutInflater layoutInflater = (LayoutInflater) this.f596b.getSystemService("layout_inflater");
            View view = null;
            if (this.f598d.equalsIgnoreCase("image")) {
                View inflate = layoutInflater.inflate(C0172h.image_item, viewGroup, false);
                this.f602h = (TouchImageView) inflate.findViewById(C0171g.mBigImage);
                C0977i iVar = (C0977i) ((C0977i) C0963b.m5394t(this.f596b).mo5106s(this.f597c.get(i)).mo5789d()).mo5786a0(C3279f.m14126a(this.f596b.getResources(), C0170f.images, (Resources.Theme) null));
                iVar.mo5082C0(new C0168a());
                iVar.mo5081A0(this.f602h);
                view = inflate;
            } else if (this.f598d.equalsIgnoreCase("video")) {
                view = layoutInflater.inflate(C0172h.video_item, viewGroup, false);
                PlayerView playerView = (PlayerView) view.findViewById(C0171g.video_view);
                this.f600f = playerView;
                playerView.setTag("view" + i);
                this.f599e = C3899j.m16367a(new C3843g(this.f596b), new C4221b(), new C3836e());
                this.f601g = new C4121d.C4123b(new C4244h("media-slider-view")).mo13118a(Uri.parse(this.f597c.get(i)));
                this.f600f.setPlayer(this.f599e);
                this.f599e.mo12478a(this.f601g, true, true);
                this.f599e.mo12482e(false);
                this.f599e.mo12486i(0, 0);
            }
            viewGroup.addView(view);
            return view;
        }

        /* renamed from: i */
        public boolean mo512i(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: Y */
    private void m613Y() {
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(C0171g.status_holder);
        this.f591K = (TextView) this.f584D.findViewById(C0171g.tv_title);
        this.f593y = (TextView) this.f584D.findViewById(C0171g.tv_subtitle);
        ImageView imageView = (ImageView) findViewById(C0171g.left_arrow);
        ImageView imageView2 = (ImageView) findViewById(C0171g.right_arrow);
        this.f592x = (ViewPager) findViewById(C0171g.pager);
        this.f592x.setAdapter(new C0167b(this, this, this.f585E, this.f587G, (C0166a) null));
        m614d0();
        if (this.f594z || this.f581A) {
            String str = this.f589I;
            appBarLayout.setBackgroundColor((str == null || !str.matches("/^#(?:(?:[\\da-f]{3}){1,2}|(?:[\\da-f]{4}){1,2})$/i")) ? getResources().getColor(C0169e.transparent) : Color.parseColor(this.f589I));
        }
        if (this.f594z) {
            this.f591K.setVisibility(0);
            String str2 = this.f583C;
            if (str2 != null) {
                this.f591K.setText(str2);
            } else {
                this.f591K.setText(BuildConfig.FLAVOR);
            }
            String str3 = this.f588H;
            if (str3 != null && str3.matches("/^#(?:(?:[\\da-f]{3}){1,2}|(?:[\\da-f]{4}){1,2})$/i")) {
                this.f591K.setTextColor(Color.parseColor(this.f588H));
            }
        }
        if (this.f581A) {
            this.f593y.setVisibility(0);
            this.f593y.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(this.f592x.getCurrentItem() + 1), Integer.valueOf(this.f585E.size())}));
        }
        if (this.f582B) {
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
            imageView.setOnClickListener(new C0164c(this));
            imageView2.setOnClickListener(new C0163b(this));
        }
        this.f592x.mo4941c(new C0166a());
    }

    /* renamed from: d0 */
    private void m614d0() {
        int i = this.f590J;
        if (i < 0) {
            this.f592x.setCurrentItem(0);
        } else if (i > this.f585E.size()) {
            this.f592x.setCurrentItem(this.f585E.size() - 1);
            return;
        } else {
            this.f592x.setCurrentItem(this.f590J);
        }
        this.f592x.setOffscreenPageLimit(0);
    }

    /* renamed from: Z */
    public /* synthetic */ void mo501Z(View view) {
        this.f592x.setCurrentItem(this.f592x.getCurrentItem() - 1);
        this.f593y.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(this.f592x.getCurrentItem() + 1), Integer.valueOf(this.f585E.size())}));
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo502a0(View view) {
        this.f592x.setCurrentItem(this.f592x.getCurrentItem() + 1);
        this.f593y.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(this.f592x.getCurrentItem() + 1), Integer.valueOf(this.f585E.size())}));
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo503b0(View view) {
        finish();
    }

    /* renamed from: c0 */
    public void mo504c0(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, int i) {
        this.f586F = arrayList;
        this.f585E = arrayList2;
        this.f587G = str;
        this.f594z = z;
        this.f581A = z2;
        this.f582B = z3;
        this.f583C = str2;
        this.f589I = str3;
        this.f588H = str4;
        this.f590J = i;
        m613Y();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0172h.activity_media_slider);
        Toolbar toolbar = (Toolbar) findViewById(C0171g.toolbar);
        this.f584D = toolbar;
        mo835P(toolbar);
        ((C0259a) Objects.requireNonNull(mo829I())).mo782s(true);
        mo829I().mo783t(true);
        this.f584D.setNavigationOnClickListener(new C0162a(this));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
