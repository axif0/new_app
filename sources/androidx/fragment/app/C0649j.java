package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import p086f.p111h.p121l.C3349h;

/* renamed from: androidx.fragment.app.j */
public abstract class C0649j<E> extends C0645f {

    /* renamed from: f */
    private final Activity f2729f;

    /* renamed from: g */
    private final Context f2730g;

    /* renamed from: h */
    private final Handler f2731h;

    /* renamed from: i */
    final C0653m f2732i;

    C0649j(Activity activity, Context context, Handler handler, int i) {
        this.f2732i = new C0664n();
        this.f2729f = activity;
        C3349h.m14362d(context, "context == null");
        this.f2730g = context;
        C3349h.m14362d(handler, "handler == null");
        this.f2731h = handler;
    }

    C0649j(C0636d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    /* renamed from: e */
    public View mo3249e(int i) {
        return null;
    }

    /* renamed from: f */
    public boolean mo3250f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Activity mo3376g() {
        return this.f2729f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Context mo3377h() {
        return this.f2730g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Handler mo3378i() {
        return this.f2731h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3318j(Fragment fragment) {
    }

    /* renamed from: k */
    public abstract E mo3319k();

    /* renamed from: l */
    public LayoutInflater mo3320l() {
        return LayoutInflater.from(this.f2730g);
    }

    /* renamed from: m */
    public boolean mo3321m(Fragment fragment) {
        return true;
    }

    /* renamed from: n */
    public void mo3322n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f2730g.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: o */
    public void mo3323o() {
    }
}
