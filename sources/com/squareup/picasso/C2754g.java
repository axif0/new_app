package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2793y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p385n.C6288l;

/* renamed from: com.squareup.picasso.g */
class C2754g extends C2793y {

    /* renamed from: a */
    final Context f8799a;

    C2754g(Context context) {
        this.f8799a = context;
    }

    /* renamed from: c */
    public boolean mo10008c(C2789w wVar) {
        return "content".equals(wVar.f8909d.getScheme());
    }

    /* renamed from: f */
    public C2793y.C2794a mo10009f(C2789w wVar, int i) throws IOException {
        return new C2793y.C2794a(C6288l.m25940k(mo10047j(wVar)), C2776t.C2782e.DISK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public InputStream mo10047j(C2789w wVar) throws FileNotFoundException {
        return this.f8799a.getContentResolver().openInputStream(wVar.f8909d);
    }
}
