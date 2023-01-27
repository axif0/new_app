package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.widget.C0479u0;

public final class ExpandedMenuView extends ListView implements C0335g.C0337b, C0352n, AdapterView.OnItemClickListener {

    /* renamed from: h */
    private static final int[] f1106h = {16842964, 16843049};

    /* renamed from: f */
    private C0335g f1107f;

    /* renamed from: g */
    private int f1108g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0479u0 v = C0479u0.m2148v(context, attributeSet, f1106h, i, 0);
        if (v.mo2361s(0)) {
            setBackgroundDrawable(v.mo2349g(0));
        }
        if (v.mo2361s(1)) {
            setDivider(v.mo2349g(1));
        }
        v.mo2362w();
    }

    /* renamed from: a */
    public boolean mo1053a(C0339i iVar) {
        return this.f1107f.mo1207N(iVar, 0);
    }

    /* renamed from: b */
    public void mo1054b(C0335g gVar) {
        this.f1107f = gVar;
    }

    public int getWindowAnimations() {
        return this.f1108g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1053a((C0339i) getAdapter().getItem(i));
    }
}
