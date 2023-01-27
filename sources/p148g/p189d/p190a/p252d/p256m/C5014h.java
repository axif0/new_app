package p148g.p189d.p190a.p252d.p256m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p086f.p102e.C3203g;

/* renamed from: g.d.a.d.m.h */
public class C5014h {

    /* renamed from: a */
    private final C3203g<String, C5015i> f14960a = new C3203g<>();

    /* renamed from: b */
    private final C3203g<String, PropertyValuesHolder[]> f14961b = new C3203g<>();

    /* renamed from: a */
    private static void m21212a(C5014h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo15035h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo15037i(objectAnimator.getPropertyName(), C5015i.m21221b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C5014h m21213b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m21214c(context, resourceId);
    }

    /* renamed from: c */
    public static C5014h m21214c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m21215d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m21215d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C5014h m21215d(List<Animator> list) {
        C5014h hVar = new C5014h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m21212a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: e */
    public C5015i mo15031e(String str) {
        if (mo15034g(str)) {
            return this.f14960a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5014h)) {
            return false;
        }
        return this.f14960a.equals(((C5014h) obj).f14960a);
    }

    /* renamed from: f */
    public long mo15033f() {
        int size = this.f14960a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C5015i m = this.f14960a.mo11141m(i);
            j = Math.max(j, m.mo15040c() + m.mo15041d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean mo15034g(String str) {
        return this.f14960a.get(str) != null;
    }

    /* renamed from: h */
    public void mo15035h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f14961b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f14960a.hashCode();
    }

    /* renamed from: i */
    public void mo15037i(String str, C5015i iVar) {
        this.f14960a.put(str, iVar);
    }

    public String toString() {
        return 10 + C5014h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f14960a + "}\n";
    }
}
