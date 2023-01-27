package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import p086f.p111h.C3264b;

/* renamed from: androidx.core.app.h */
public class C0575h {

    /* renamed from: androidx.core.app.h$a */
    public static class C0576a {

        /* renamed from: a */
        final Bundle f2356a;

        /* renamed from: b */
        private IconCompat f2357b;

        /* renamed from: c */
        private final C0584k[] f2358c;

        /* renamed from: d */
        private final C0584k[] f2359d;

        /* renamed from: e */
        private boolean f2360e;

        /* renamed from: f */
        boolean f2361f;

        /* renamed from: g */
        private final int f2362g;

        /* renamed from: h */
        private final boolean f2363h;
        @Deprecated

        /* renamed from: i */
        public int f2364i;

        /* renamed from: j */
        public CharSequence f2365j;

        /* renamed from: k */
        public PendingIntent f2366k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0576a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m2743b((Resources) null, BuildConfig.FLAVOR, i) : null, charSequence, pendingIntent);
        }

        public C0576a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C0584k[]) null, (C0584k[]) null, true, 0, true, false);
        }

        C0576a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0584k[] kVarArr, C0584k[] kVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f2361f = true;
            this.f2357b = iconCompat;
            if (iconCompat != null && iconCompat.mo2880g() == 2) {
                this.f2364i = iconCompat.mo2878c();
            }
            this.f2365j = C0580e.m2685d(charSequence);
            this.f2366k = pendingIntent;
            this.f2356a = bundle == null ? new Bundle() : bundle;
            this.f2358c = kVarArr;
            this.f2359d = kVarArr2;
            this.f2360e = z;
            this.f2362g = i;
            this.f2361f = z2;
            this.f2363h = z3;
        }

        /* renamed from: a */
        public PendingIntent mo2822a() {
            return this.f2366k;
        }

        /* renamed from: b */
        public boolean mo2823b() {
            return this.f2360e;
        }

        /* renamed from: c */
        public C0584k[] mo2824c() {
            return this.f2359d;
        }

        /* renamed from: d */
        public Bundle mo2825d() {
            return this.f2356a;
        }

        /* renamed from: e */
        public IconCompat mo2826e() {
            int i;
            if (this.f2357b == null && (i = this.f2364i) != 0) {
                this.f2357b = IconCompat.m2743b((Resources) null, BuildConfig.FLAVOR, i);
            }
            return this.f2357b;
        }

        /* renamed from: f */
        public C0584k[] mo2827f() {
            return this.f2358c;
        }

        /* renamed from: g */
        public int mo2828g() {
            return this.f2362g;
        }

        /* renamed from: h */
        public boolean mo2829h() {
            return this.f2361f;
        }

        /* renamed from: i */
        public CharSequence mo2830i() {
            return this.f2365j;
        }

        /* renamed from: j */
        public boolean mo2831j() {
            return this.f2363h;
        }
    }

    /* renamed from: androidx.core.app.h$b */
    public static class C0577b extends C0581f {

        /* renamed from: e */
        private Bitmap f2367e;

        /* renamed from: f */
        private Bitmap f2368f;

        /* renamed from: g */
        private boolean f2369g;

        /* renamed from: b */
        public void mo2832b(C0574g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(gVar.mo2821a()).setBigContentTitle(this.f2416b).bigPicture(this.f2367e);
                if (this.f2369g) {
                    bigPicture.bigLargeIcon(this.f2368f);
                }
                if (this.f2418d) {
                    bigPicture.setSummaryText(this.f2417c);
                }
            }
        }

        /* renamed from: g */
        public C0577b mo2833g(Bitmap bitmap) {
            this.f2368f = bitmap;
            this.f2369g = true;
            return this;
        }

        /* renamed from: h */
        public C0577b mo2834h(Bitmap bitmap) {
            this.f2367e = bitmap;
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$c */
    public static class C0578c extends C0581f {

        /* renamed from: e */
        private CharSequence f2370e;

        /* renamed from: b */
        public void mo2832b(C0574g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.mo2821a()).setBigContentTitle(this.f2416b).bigText(this.f2370e);
                if (this.f2418d) {
                    bigText.setSummaryText(this.f2417c);
                }
            }
        }

        /* renamed from: g */
        public C0578c mo2835g(CharSequence charSequence) {
            this.f2370e = C0580e.m2685d(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$d */
    public static final class C0579d {
        /* renamed from: b */
        public static Notification.BubbleMetadata m2683b(C0579d dVar) {
            if (dVar == null) {
                return null;
            }
            new Notification.BubbleMetadata.Builder();
            dVar.mo2836a();
            throw null;
        }

        /* renamed from: a */
        public boolean mo2836a() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.h$e */
    public static class C0580e {

        /* renamed from: A */
        String f2371A;

        /* renamed from: B */
        Bundle f2372B;

        /* renamed from: C */
        int f2373C;

        /* renamed from: D */
        int f2374D;

        /* renamed from: E */
        Notification f2375E;

        /* renamed from: F */
        RemoteViews f2376F;

        /* renamed from: G */
        RemoteViews f2377G;

        /* renamed from: H */
        RemoteViews f2378H;

        /* renamed from: I */
        String f2379I;

        /* renamed from: J */
        int f2380J;

        /* renamed from: K */
        String f2381K;

        /* renamed from: L */
        long f2382L;

        /* renamed from: M */
        int f2383M;

        /* renamed from: N */
        boolean f2384N;

        /* renamed from: O */
        C0579d f2385O;

        /* renamed from: P */
        Notification f2386P;

        /* renamed from: Q */
        boolean f2387Q;
        @Deprecated

        /* renamed from: R */
        public ArrayList<String> f2388R;

        /* renamed from: a */
        public Context f2389a;

        /* renamed from: b */
        public ArrayList<C0576a> f2390b;

        /* renamed from: c */
        ArrayList<C0576a> f2391c;

        /* renamed from: d */
        CharSequence f2392d;

        /* renamed from: e */
        CharSequence f2393e;

        /* renamed from: f */
        PendingIntent f2394f;

        /* renamed from: g */
        PendingIntent f2395g;

        /* renamed from: h */
        RemoteViews f2396h;

        /* renamed from: i */
        Bitmap f2397i;

        /* renamed from: j */
        CharSequence f2398j;

        /* renamed from: k */
        int f2399k;

        /* renamed from: l */
        int f2400l;

        /* renamed from: m */
        boolean f2401m;

        /* renamed from: n */
        boolean f2402n;

        /* renamed from: o */
        C0581f f2403o;

        /* renamed from: p */
        CharSequence f2404p;

        /* renamed from: q */
        CharSequence[] f2405q;

        /* renamed from: r */
        int f2406r;

        /* renamed from: s */
        int f2407s;

        /* renamed from: t */
        boolean f2408t;

        /* renamed from: u */
        String f2409u;

        /* renamed from: v */
        boolean f2410v;

        /* renamed from: w */
        String f2411w;

        /* renamed from: x */
        boolean f2412x;

        /* renamed from: y */
        boolean f2413y;

        /* renamed from: z */
        boolean f2414z;

        @Deprecated
        public C0580e(Context context) {
            this(context, (String) null);
        }

        public C0580e(Context context, String str) {
            this.f2390b = new ArrayList<>();
            this.f2391c = new ArrayList<>();
            this.f2401m = true;
            this.f2412x = false;
            this.f2373C = 0;
            this.f2374D = 0;
            this.f2380J = 0;
            this.f2383M = 0;
            Notification notification = new Notification();
            this.f2386P = notification;
            this.f2389a = context;
            this.f2379I = str;
            notification.when = System.currentTimeMillis();
            this.f2386P.audioStreamType = -1;
            this.f2400l = 0;
            this.f2388R = new ArrayList<>();
            this.f2384N = true;
        }

        /* renamed from: d */
        protected static CharSequence m2685d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: e */
        private Bitmap m2686e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2389a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C3264b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C3264b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d = (double) dimensionPixelSize;
            double max = (double) Math.max(1, bitmap.getWidth());
            Double.isNaN(d);
            Double.isNaN(max);
            double d2 = d / max;
            double d3 = (double) dimensionPixelSize2;
            double max2 = (double) Math.max(1, bitmap.getHeight());
            Double.isNaN(d3);
            Double.isNaN(max2);
            double min = Math.min(d2, d3 / max2);
            double width = (double) bitmap.getWidth();
            Double.isNaN(width);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
        }

        /* renamed from: n */
        private void m2687n(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f2386P;
                i2 = i | notification.flags;
            } else {
                notification = this.f2386P;
                i2 = (i ^ -1) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: A */
        public C0580e mo2837A(long j) {
            this.f2386P.when = j;
            return this;
        }

        /* renamed from: a */
        public C0580e mo2838a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2390b.add(new C0576a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification mo2839b() {
            return new C0582i(this).mo2866c();
        }

        /* renamed from: c */
        public Bundle mo2840c() {
            if (this.f2372B == null) {
                this.f2372B = new Bundle();
            }
            return this.f2372B;
        }

        /* renamed from: f */
        public C0580e mo2841f(boolean z) {
            m2687n(16, z);
            return this;
        }

        /* renamed from: g */
        public C0580e mo2842g(String str) {
            this.f2379I = str;
            return this;
        }

        /* renamed from: h */
        public C0580e mo2843h(int i) {
            this.f2373C = i;
            return this;
        }

        /* renamed from: i */
        public C0580e mo2844i(PendingIntent pendingIntent) {
            this.f2394f = pendingIntent;
            return this;
        }

        /* renamed from: j */
        public C0580e mo2845j(CharSequence charSequence) {
            this.f2393e = m2685d(charSequence);
            return this;
        }

        /* renamed from: k */
        public C0580e mo2846k(CharSequence charSequence) {
            this.f2392d = m2685d(charSequence);
            return this;
        }

        /* renamed from: l */
        public C0580e mo2847l(int i) {
            Notification notification = this.f2386P;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: m */
        public C0580e mo2848m(PendingIntent pendingIntent) {
            this.f2386P.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: o */
        public C0580e mo2849o(Bitmap bitmap) {
            this.f2397i = m2686e(bitmap);
            return this;
        }

        /* renamed from: p */
        public C0580e mo2850p(int i, int i2, int i3) {
            Notification notification = this.f2386P;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.f2386P;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        /* renamed from: q */
        public C0580e mo2851q(boolean z) {
            this.f2412x = z;
            return this;
        }

        /* renamed from: r */
        public C0580e mo2852r(int i) {
            this.f2399k = i;
            return this;
        }

        /* renamed from: s */
        public C0580e mo2853s(int i) {
            this.f2400l = i;
            return this;
        }

        /* renamed from: t */
        public C0580e mo2854t(boolean z) {
            this.f2401m = z;
            return this;
        }

        /* renamed from: u */
        public C0580e mo2855u(int i) {
            this.f2386P.icon = i;
            return this;
        }

        /* renamed from: v */
        public C0580e mo2856v(Uri uri) {
            Notification notification = this.f2386P;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: w */
        public C0580e mo2857w(C0581f fVar) {
            if (this.f2403o != fVar) {
                this.f2403o = fVar;
                if (fVar != null) {
                    fVar.mo2865f(this);
                }
            }
            return this;
        }

        /* renamed from: x */
        public C0580e mo2858x(CharSequence charSequence) {
            this.f2386P.tickerText = m2685d(charSequence);
            return this;
        }

        /* renamed from: y */
        public C0580e mo2859y(long[] jArr) {
            this.f2386P.vibrate = jArr;
            return this;
        }

        /* renamed from: z */
        public C0580e mo2860z(int i) {
            this.f2374D = i;
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$f */
    public static abstract class C0581f {

        /* renamed from: a */
        protected C0580e f2415a;

        /* renamed from: b */
        CharSequence f2416b;

        /* renamed from: c */
        CharSequence f2417c;

        /* renamed from: d */
        boolean f2418d = false;

        /* renamed from: a */
        public void mo2861a(Bundle bundle) {
        }

        /* renamed from: b */
        public abstract void mo2832b(C0574g gVar);

        /* renamed from: c */
        public RemoteViews mo2862c(C0574g gVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2863d(C0574g gVar) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo2864e(C0574g gVar) {
            return null;
        }

        /* renamed from: f */
        public void mo2865f(C0580e eVar) {
            if (this.f2415a != eVar) {
                this.f2415a = eVar;
                if (eVar != null) {
                    eVar.mo2857w(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2667a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0583j.m2725c(notification);
        }
        return null;
    }
}
