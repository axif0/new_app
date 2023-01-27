package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0653m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.l */
class C0651l {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C0652a> f2734a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final C0653m f2735b;

    /* renamed from: androidx.fragment.app.l$a */
    private static final class C0652a {

        /* renamed from: a */
        final C0653m.C0659f f2736a;

        /* renamed from: b */
        final boolean f2737b;
    }

    C0651l(C0653m mVar) {
        this.f2735b = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3381a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3381a(fragment, bundle, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3471a(this.f2735b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3382b(Fragment fragment, Context context, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3382b(fragment, context, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3472b(this.f2735b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3383c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3383c(fragment, bundle, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3473c(this.f2735b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3384d(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3384d(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3474d(this.f2735b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3385e(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3385e(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3475e(this.f2735b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3386f(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3386f(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3476f(this.f2735b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3387g(Fragment fragment, Context context, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3387g(fragment, context, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3477g(this.f2735b, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3388h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3388h(fragment, bundle, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3478h(this.f2735b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3389i(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3389i(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3479i(this.f2735b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3390j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3390j(fragment, bundle, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3480j(this.f2735b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3391k(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3391k(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3481k(this.f2735b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3392l(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3392l(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3482l(this.f2735b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3393m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3393m(fragment, view, bundle, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3483m(this.f2735b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3394n(Fragment fragment, boolean z) {
        Fragment i0 = this.f2735b.mo3441i0();
        if (i0 != null) {
            i0.mo3156K().mo3439h0().mo3394n(fragment, true);
        }
        Iterator<C0652a> it = this.f2734a.iterator();
        while (it.hasNext()) {
            C0652a next = it.next();
            if (!z || next.f2737b) {
                next.f2736a.mo3484n(this.f2735b, fragment);
            }
        }
    }
}
