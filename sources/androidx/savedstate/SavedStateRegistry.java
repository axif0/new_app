package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0715g;
import androidx.lifecycle.C0717i;
import androidx.savedstate.Recreator;
import java.util.Map;
import p086f.p095b.p096a.p098b.C3173b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C3173b<String, C0932b> f3700a = new C3173b<>();

    /* renamed from: b */
    private Bundle f3701b;

    /* renamed from: c */
    private boolean f3702c;

    /* renamed from: d */
    private Recreator.C0929a f3703d;

    /* renamed from: e */
    boolean f3704e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0931a {
        /* renamed from: a */
        void mo3646a(C0934b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0932b {
        /* renamed from: a */
        Bundle mo4874a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo4876a(String str) {
        if (this.f3702c) {
            Bundle bundle = this.f3701b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f3701b.remove(str);
            if (this.f3701b.isEmpty()) {
                this.f3701b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4877b(C0710e eVar, Bundle bundle) {
        if (!this.f3702c) {
            if (bundle != null) {
                this.f3701b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            eVar.mo3667a(new C0715g() {
                /* renamed from: d */
                public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == C0710e.C0711a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar == C0710e.C0711a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f3704e = z;
                }
            });
            this.f3702c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4878c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3701b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3173b<K, V>.d h = this.f3700a.mo10982h();
        while (h.hasNext()) {
            Map.Entry entry = (Map.Entry) h.next();
            bundle2.putBundle((String) entry.getKey(), ((C0932b) entry.getValue()).mo4874a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void mo4879d(String str, C0932b bVar) {
        if (this.f3700a.mo10976m(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void mo4880e(Class<? extends C0931a> cls) {
        if (this.f3704e) {
            if (this.f3703d == null) {
                this.f3703d = new Recreator.C0929a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f3703d.mo4875b(cls.getName());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
