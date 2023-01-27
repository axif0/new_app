package p086f.p087a.p094o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p086f.p087a.p094o.C3155b;

/* renamed from: f.a.o.e */
public class C3159e extends C3155b implements C0335g.C0336a {

    /* renamed from: h */
    private Context f10026h;

    /* renamed from: i */
    private ActionBarContextView f10027i;

    /* renamed from: j */
    private C3155b.C3156a f10028j;

    /* renamed from: k */
    private WeakReference<View> f10029k;

    /* renamed from: l */
    private boolean f10030l;

    /* renamed from: m */
    private C0335g f10031m;

    public C3159e(Context context, ActionBarContextView actionBarContextView, C3155b.C3156a aVar, boolean z) {
        this.f10026h = context;
        this.f10027i = actionBarContextView;
        this.f10028j = aVar;
        C0335g gVar = new C0335g(actionBarContextView.getContext());
        gVar.mo1215W(1);
        this.f10031m = gVar;
        gVar.mo1214V(this);
    }

    /* renamed from: a */
    public boolean mo904a(C0335g gVar, MenuItem menuItem) {
        return this.f10028j.mo934c(this, menuItem);
    }

    /* renamed from: b */
    public void mo906b(C0335g gVar) {
        mo1022k();
        this.f10027i.mo1496l();
    }

    /* renamed from: c */
    public void mo1016c() {
        if (!this.f10030l) {
            this.f10030l = true;
            this.f10027i.sendAccessibilityEvent(32);
            this.f10028j.mo933b(this);
        }
    }

    /* renamed from: d */
    public View mo1017d() {
        WeakReference<View> weakReference = this.f10029k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo1018e() {
        return this.f10031m;
    }

    /* renamed from: f */
    public MenuInflater mo1019f() {
        return new C3162g(this.f10027i.getContext());
    }

    /* renamed from: g */
    public CharSequence mo1020g() {
        return this.f10027i.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo1021i() {
        return this.f10027i.getTitle();
    }

    /* renamed from: k */
    public void mo1022k() {
        this.f10028j.mo932a(this, this.f10031m);
    }

    /* renamed from: l */
    public boolean mo1023l() {
        return this.f10027i.mo1494j();
    }

    /* renamed from: m */
    public void mo1024m(View view) {
        this.f10027i.setCustomView(view);
        this.f10029k = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo1025n(int i) {
        mo1026o(this.f10026h.getString(i));
    }

    /* renamed from: o */
    public void mo1026o(CharSequence charSequence) {
        this.f10027i.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo1027q(int i) {
        mo1028r(this.f10026h.getString(i));
    }

    /* renamed from: r */
    public void mo1028r(CharSequence charSequence) {
        this.f10027i.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo1029s(boolean z) {
        super.mo1029s(z);
        this.f10027i.setTitleOptional(z);
    }
}
