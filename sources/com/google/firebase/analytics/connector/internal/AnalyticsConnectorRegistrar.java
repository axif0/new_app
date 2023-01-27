package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.p043a.C2498a;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2517h;
import com.google.firebase.components.C2526n;
import java.util.Arrays;
import java.util.List;
import p148g.p189d.p281b.C5171c;
import p148g.p189d.p281b.p284g.C5194d;
import p148g.p189d.p281b.p288k.C5208g;

@Keep
public class AnalyticsConnectorRegistrar implements C2517h {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C2508d<?>> getComponents() {
        C2508d.C2510b<C2498a> a = C2508d.m11268a(C2498a.class);
        a.mo9372b(C2526n.m11326f(C5171c.class));
        a.mo9372b(C2526n.m11326f(Context.class));
        a.mo9372b(C2526n.m11326f(C5194d.class));
        a.mo9376f(C2503a.f8171a);
        a.mo9375e();
        return Arrays.asList(new C2508d[]{a.mo9374d(), C5208g.m21758a("fire-analytics", "17.5.0")});
    }
}
