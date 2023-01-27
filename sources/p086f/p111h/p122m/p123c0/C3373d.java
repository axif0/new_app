package p086f.p111h.p122m.p123c0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f.h.m.c0.d */
public class C3373d {

    /* renamed from: a */
    private final Object f10687a;

    /* renamed from: f.h.m.c0.d$a */
    static class C3374a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C3373d f10688a;

        C3374a(C3373d dVar) {
            this.f10688a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C3369c a = this.f10688a.mo11675a(i);
            if (a == null) {
                return null;
            }
            return a.mo11599C0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C3369c> b = this.f10688a.mo11676b(str, i);
            if (b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(b.get(i2).mo11599C0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f10688a.mo11679e(i, i2, bundle);
        }
    }

    /* renamed from: f.h.m.c0.d$b */
    static class C3375b extends C3374a {
        C3375b(C3373d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C3369c c = this.f10688a.mo11677c(i);
            if (c == null) {
                return null;
            }
            return c.mo11599C0();
        }
    }

    public C3373d() {
        int i = Build.VERSION.SDK_INT;
        this.f10687a = i >= 19 ? new C3375b(this) : i >= 16 ? new C3374a(this) : null;
    }

    public C3373d(Object obj) {
        this.f10687a = obj;
    }

    /* renamed from: a */
    public C3369c mo11675a(int i) {
        return null;
    }

    /* renamed from: b */
    public List<C3369c> mo11676b(String str, int i) {
        return null;
    }

    /* renamed from: c */
    public C3369c mo11677c(int i) {
        return null;
    }

    /* renamed from: d */
    public Object mo11678d() {
        return this.f10687a;
    }

    /* renamed from: e */
    public boolean mo11679e(int i, int i2, Bundle bundle) {
        return false;
    }
}
