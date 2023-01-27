package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0715g;
import androidx.lifecycle.C0717i;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C0715g {

    /* renamed from: a */
    private final C0934b f3698a;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C0929a implements SavedStateRegistry.C0932b {

        /* renamed from: a */
        final Set<String> f3699a = new HashSet();

        C0929a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo4879d("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo4874a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f3699a));
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4875b(String str) {
            this.f3699a.add(str);
        }
    }

    Recreator(C0934b bVar) {
        this.f3698a = bVar;
    }

    /* renamed from: h */
    private void m5217h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.C0931a.class);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.C0931a) declaredConstructor.newInstance(new Object[0])).mo3646a(this.f3698a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: d */
    public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
        if (aVar == C0710e.C0711a.ON_CREATE) {
            iVar.mo720a().mo3669c(this);
            Bundle a = this.f3698a.mo722d().mo4876a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m5217h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
