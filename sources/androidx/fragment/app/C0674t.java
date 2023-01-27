package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.t */
class C0674t {

    /* renamed from: a */
    private final ArrayList<Fragment> f2818a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0672s> f2819b = new HashMap<>();

    C0674t() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3541a(Fragment fragment) {
        if (!this.f2818a.contains(fragment)) {
            synchronized (this.f2818a) {
                this.f2818a.add(fragment);
            }
            fragment.f2629p = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3542b() {
        this.f2819b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3543c(String str) {
        return this.f2819b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3544d(int i) {
        Iterator<Fragment> it = this.f2818a.iterator();
        while (it.hasNext()) {
            C0672s sVar = this.f2819b.get(it.next().f2623j);
            if (sVar != null) {
                sVar.mo3538q(i);
            }
        }
        for (C0672s next : this.f2819b.values()) {
            if (next != null) {
                next.mo3538q(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3545e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2819b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0672s next : this.f2819b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment i = next.mo3531i();
                    printWriter.println(i);
                    i.mo3206k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2818a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f2818a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo3546f(String str) {
        C0672s sVar = this.f2819b.get(str);
        if (sVar != null) {
            return sVar.mo3531i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3547g(int i) {
        for (int size = this.f2818a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2818a.get(size);
            if (fragment != null && fragment.f2593A == i) {
                return fragment;
            }
        }
        for (C0672s next : this.f2819b.values()) {
            if (next != null) {
                Fragment i2 = next.mo3531i();
                if (i2.f2593A == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo3548h(String str) {
        if (str != null) {
            for (int size = this.f2818a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2818a.get(size);
                if (fragment != null && str.equals(fragment.f2595C)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0672s next : this.f2819b.values()) {
            if (next != null) {
                Fragment i = next.mo3531i();
                if (str.equals(i.f2595C)) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3549i(String str) {
        Fragment m;
        for (C0672s next : this.f2819b.values()) {
            if (next != null && (m = next.mo3531i().mo3211m(str)) != null) {
                return m;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Fragment mo3550j(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2603K;
        View view = fragment.f2604L;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f2818a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f2818a.get(indexOf);
                if (fragment2.f2603K == viewGroup && fragment2.f2604L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<Fragment> mo3551k() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0672s> it = this.f2819b.values().iterator();
        while (it.hasNext()) {
            C0672s next = it.next();
            arrayList.add(next != null ? next.mo3531i() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0672s mo3552l(String str) {
        return this.f2819b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Fragment> mo3553m() {
        ArrayList arrayList;
        if (this.f2818a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2818a) {
            arrayList = new ArrayList(this.f2818a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3554n(C0672s sVar) {
        this.f2819b.put(sVar.mo3531i().f2623j, sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3555o(C0672s sVar) {
        Fragment i = sVar.mo3531i();
        for (C0672s next : this.f2819b.values()) {
            if (next != null) {
                Fragment i2 = next.mo3531i();
                if (i.f2623j.equals(i2.f2626m)) {
                    i2.f2625l = i;
                    i2.f2626m = null;
                }
            }
        }
        this.f2819b.put(i.f2623j, (Object) null);
        String str = i.f2626m;
        if (str != null) {
            i.f2625l = mo3546f(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3556p(Fragment fragment) {
        synchronized (this.f2818a) {
            this.f2818a.remove(fragment);
        }
        fragment.f2629p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3557q() {
        this.f2819b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3558r(List<String> list) {
        this.f2818a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo3546f(next);
                if (f != null) {
                    if (C0653m.m3287p0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo3541a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public ArrayList<C0670r> mo3559s() {
        ArrayList<C0670r> arrayList = new ArrayList<>(this.f2819b.size());
        for (C0672s next : this.f2819b.values()) {
            if (next != null) {
                Fragment i = next.mo3531i();
                C0670r o = next.mo3536o();
                arrayList.add(o);
                if (C0653m.m3287p0(2)) {
                    Log.v("FragmentManager", "Saved state of " + i + ": " + o.f2813r);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public ArrayList<String> mo3560t() {
        synchronized (this.f2818a) {
            if (this.f2818a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2818a.size());
            Iterator<Fragment> it = this.f2818a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2623j);
                if (C0653m.m3287p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2623j + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
