package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import p086f.p131l.C3452c;

/* renamed from: androidx.fragment.app.k */
class C0650k implements LayoutInflater.Factory2 {

    /* renamed from: f */
    private final C0653m f2733f;

    C0650k(C0653m mVar) {
        this.f2733f = mVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (C0646g.class.getName().equals(str)) {
            return new C0646g(context, attributeSet, this.f2733f);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3452c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C3452c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C3452c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C3452c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0648i.m3231b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f2733f.mo3425W(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f2733f.mo3426X(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f2733f.mo3425W(id);
        }
        if (C0653m.m3287p0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f2733f.mo3433e0().mo3375a(context.getClassLoader(), attributeValue);
            fragment.f2631r = true;
            fragment.f2593A = resourceId != 0 ? resourceId : id;
            fragment.f2594B = id;
            fragment.f2595C = string;
            fragment.f2632s = true;
            C0653m mVar = this.f2733f;
            fragment.f2636w = mVar;
            C0649j<?> jVar = mVar.f2758o;
            fragment.f2637x = jVar;
            fragment.mo3133B0(jVar.mo3377h(), attributeSet, fragment.f2620g);
            this.f2733f.mo3431d(fragment);
            this.f2733f.mo3466z0(fragment);
        } else if (!fragment.f2632s) {
            fragment.f2632s = true;
            C0649j<?> jVar2 = this.f2733f.f2758o;
            fragment.f2637x = jVar2;
            fragment.mo3133B0(jVar2.mo3377h(), attributeSet, fragment.f2620g);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        C0653m mVar2 = this.f2733f;
        if (mVar2.f2757n >= 1 || !fragment.f2631r) {
            this.f2733f.mo3466z0(fragment);
        } else {
            mVar2.mo3396A0(fragment, 1);
        }
        View view2 = fragment.f2604L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f2604L.getTag() == null) {
                fragment.f2604L.setTag(string);
            }
            return fragment.f2604L;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
