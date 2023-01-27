package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0350m;
import androidx.appcompat.view.menu.C0352n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0324b implements C0350m {

    /* renamed from: f */
    protected Context f1145f;

    /* renamed from: g */
    protected Context f1146g;

    /* renamed from: h */
    protected C0335g f1147h;

    /* renamed from: i */
    protected LayoutInflater f1148i;

    /* renamed from: j */
    private C0350m.C0351a f1149j;

    /* renamed from: k */
    private int f1150k;

    /* renamed from: l */
    private int f1151l;

    /* renamed from: m */
    protected C0352n f1152m;

    /* renamed from: n */
    private int f1153n;

    public C0324b(Context context, int i, int i2) {
        this.f1145f = context;
        this.f1148i = LayoutInflater.from(context);
        this.f1150k = i;
        this.f1151l = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1127a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1152m).addView(view, i);
    }

    /* renamed from: b */
    public void mo1128b(C0335g gVar, boolean z) {
        C0350m.C0351a aVar = this.f1149j;
        if (aVar != null) {
            aVar.mo930b(gVar, z);
        }
    }

    /* renamed from: c */
    public abstract void mo1129c(C0339i iVar, C0352n.C0353a aVar);

    /* renamed from: d */
    public C0352n.C0353a mo1130d(ViewGroup viewGroup) {
        return (C0352n.C0353a) this.f1148i.inflate(this.f1151l, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo1131e(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: f */
    public int mo1132f() {
        return this.f1153n;
    }

    /* renamed from: g */
    public void mo1133g(Context context, C0335g gVar) {
        this.f1146g = context;
        LayoutInflater.from(context);
        this.f1147h = gVar;
    }

    /* renamed from: i */
    public C0350m.C0351a mo1134i() {
        return this.f1149j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1135j(androidx.appcompat.view.menu.C0359r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f1149j
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f1147h
        L_0x0009:
            boolean r2 = r0.mo931c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0324b.mo1135j(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: k */
    public void mo1136k(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1152m;
        if (viewGroup != null) {
            C0335g gVar = this.f1147h;
            int i = 0;
            if (gVar != null) {
                gVar.mo1264t();
                ArrayList<C0339i> G = this.f1147h.mo1200G();
                int size = G.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0339i iVar = G.get(i3);
                    if (mo1143t(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0339i itemData = childAt instanceof C0352n.C0353a ? ((C0352n.C0353a) childAt).getItemData() : null;
                        View q = mo1140q(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            q.setPressed(false);
                            q.jumpDrawablesToCurrentState();
                        }
                        if (q != childAt) {
                            mo1127a(q, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1131e(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo1137n(C0335g gVar, C0339i iVar) {
        return false;
    }

    /* renamed from: o */
    public boolean mo1138o(C0335g gVar, C0339i iVar) {
        return false;
    }

    /* renamed from: p */
    public void mo1139p(C0350m.C0351a aVar) {
        this.f1149j = aVar;
    }

    /* renamed from: q */
    public View mo1140q(C0339i iVar, View view, ViewGroup viewGroup) {
        C0352n.C0353a d = view instanceof C0352n.C0353a ? (C0352n.C0353a) view : mo1130d(viewGroup);
        mo1129c(iVar, d);
        return (View) d;
    }

    /* renamed from: r */
    public C0352n mo1141r(ViewGroup viewGroup) {
        if (this.f1152m == null) {
            C0352n nVar = (C0352n) this.f1148i.inflate(this.f1150k, viewGroup, false);
            this.f1152m = nVar;
            nVar.mo1054b(this.f1147h);
            mo1136k(true);
        }
        return this.f1152m;
    }

    /* renamed from: s */
    public void mo1142s(int i) {
        this.f1153n = i;
    }

    /* renamed from: t */
    public abstract boolean mo1143t(int i, C0339i iVar);
}
