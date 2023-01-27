package p086f.p111h.p122m;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p086f.p111h.C3265c;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3373d;

/* renamed from: f.h.m.a */
public class C3350a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f10643c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f10644a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f10645b;

    /* renamed from: f.h.m.a$a */
    static final class C3351a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C3350a f10646a;

        C3351a(C3350a aVar) {
            this.f10646a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10646a.mo3106a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3373d b = this.f10646a.mo4824b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo11678d();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10646a.mo2996f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3369c D0 = C3369c.m14440D0(accessibilityNodeInfo);
            D0.mo11655u0(C3403t.m14617R(view));
            D0.mo11638l0(C3403t.m14612M(view));
            D0.mo11647q0(C3403t.m14652n(view));
            this.f10646a.mo2997g(view, D0);
            D0.mo11628f(accessibilityNodeInfo.getText(), view);
            List<C3369c.C3370a> c = C3350a.m14363c(view);
            for (int i = 0; i < c.size(); i++) {
                D0.mo11620b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10646a.mo4825h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f10646a.mo3107i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f10646a.mo2998j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f10646a.mo4826l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f10646a.mo4827m(view, accessibilityEvent);
        }
    }

    public C3350a() {
        this(f10643c);
    }

    public C3350a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f10644a = accessibilityDelegate;
        this.f10645b = new C3351a(this);
    }

    /* renamed from: c */
    static List<C3369c.C3370a> m14363c(View view) {
        List<C3369c.C3370a> list = (List) view.getTag(C3265c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m14364e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = C3369c.m14451q(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (q != null && i < q.length) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m14365k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C3265c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m14364e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo3106a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f10644a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C3373d mo4824b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f10644a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C3373d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo11545d() {
        return this.f10645b;
    }

    /* renamed from: f */
    public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
        this.f10644a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2997g(View view, C3369c cVar) {
        this.f10644a.onInitializeAccessibilityNodeInfo(view, cVar.mo11599C0());
    }

    /* renamed from: h */
    public void mo4825h(View view, AccessibilityEvent accessibilityEvent) {
        this.f10644a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo3107i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f10644a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2998j(View view, int i, Bundle bundle) {
        List<C3369c.C3370a> c = m14363c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C3369c.C3370a aVar = c.get(i2);
            if (aVar.mo11665b() == i) {
                z = aVar.mo11667d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f10644a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C3265c.accessibility_action_clickable_span) ? z : m14365k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo4826l(View view, int i) {
        this.f10644a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo4827m(View view, AccessibilityEvent accessibilityEvent) {
        this.f10644a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
