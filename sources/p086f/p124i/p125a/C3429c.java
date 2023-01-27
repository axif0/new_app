package p086f.p124i.p125a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.i.a.c */
public abstract class C3429c extends C3424a {

    /* renamed from: n */
    private int f10746n;

    /* renamed from: o */
    private int f10747o;

    /* renamed from: p */
    private LayoutInflater f10748p;

    @Deprecated
    public C3429c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f10747o = i;
        this.f10746n = i;
        this.f10748p = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public View mo11746g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10748p.inflate(this.f10747o, viewGroup, false);
    }

    /* renamed from: h */
    public View mo2308h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10748p.inflate(this.f10746n, viewGroup, false);
    }
}
