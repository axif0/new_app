package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0715g;
import androidx.lifecycle.C0717i;

class FragmentStateAdapter$5 implements C0715g {

    /* renamed from: a */
    final /* synthetic */ Handler f3800a;

    /* renamed from: b */
    final /* synthetic */ Runnable f3801b;

    /* renamed from: d */
    public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
        if (aVar == C0710e.C0711a.ON_DESTROY) {
            this.f3800a.removeCallbacks(this.f3801b);
            iVar.mo720a().mo3669c(this);
        }
    }
}
