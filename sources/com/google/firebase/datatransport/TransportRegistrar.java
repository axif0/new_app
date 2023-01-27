package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2517h;
import com.google.firebase.components.C2526n;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p191a.C3732g;

@Keep
public class TransportRegistrar implements C2517h {
    public List<C2508d<?>> getComponents() {
        C2508d.C2510b<C3732g> a = C2508d.m11268a(C3732g.class);
        a.mo9372b(C2526n.m11326f(Context.class));
        a.mo9376f(C2536a.m11347b());
        return Collections.singletonList(a.mo9374d());
    }
}
