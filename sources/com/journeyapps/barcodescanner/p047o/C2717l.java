package com.journeyapps.barcodescanner.p047o;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.C2692l;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.o.l */
public abstract class C2717l {

    /* renamed from: a */
    private static final String f8695a = "l";

    /* renamed from: com.journeyapps.barcodescanner.o.l$a */
    class C2718a implements Comparator<C2692l> {

        /* renamed from: f */
        final /* synthetic */ C2692l f8696f;

        C2718a(C2692l lVar) {
            this.f8696f = lVar;
        }

        /* renamed from: a */
        public int compare(C2692l lVar, C2692l lVar2) {
            return Float.compare(C2717l.this.mo9879c(lVar2, this.f8696f), C2717l.this.mo9879c(lVar, this.f8696f));
        }
    }

    /* renamed from: a */
    public List<C2692l> mo9886a(List<C2692l> list, C2692l lVar) {
        if (lVar == null) {
            return list;
        }
        Collections.sort(list, new C2718a(lVar));
        return list;
    }

    /* renamed from: b */
    public C2692l mo9887b(List<C2692l> list, C2692l lVar) {
        mo9886a(list, lVar);
        String str = f8695a;
        Log.i(str, "Viewfinder size: " + lVar);
        String str2 = f8695a;
        Log.i(str2, "Preview in order of preference: " + list);
        return list.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract float mo9879c(C2692l lVar, C2692l lVar2);

    /* renamed from: d */
    public abstract Rect mo9880d(C2692l lVar, C2692l lVar2);
}
