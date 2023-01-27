package academia.bracu.com.academia.spinner;

import academia.bracu.com.academia.spinner.C0179b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.C0480v;
import androidx.fragment.app.C0636d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.C2797b;

public class SearchableSpinner extends C0480v implements View.OnTouchListener, C0179b.C0181b {

    /* renamed from: o */
    private final Context f613o;

    /* renamed from: p */
    private List f614p;

    /* renamed from: q */
    private C0179b f615q;

    /* renamed from: r */
    private C0177a f616r;

    /* renamed from: s */
    private boolean f617s;

    /* renamed from: t */
    private ArrayAdapter f618t;

    /* renamed from: u */
    private String f619u;

    /* renamed from: v */
    private boolean f620v;

    /* renamed from: academia.bracu.com.academia.spinner.SearchableSpinner$a */
    public interface C0177a extends Serializable {
        /* renamed from: i */
        void mo537i(int i);
    }

    public SearchableSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f613o = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2797b.SearchableSpinner);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f619u = obtainStyledAttributes.getString(index);
            }
        }
        obtainStyledAttributes.recycle();
        m646c();
    }

    /* renamed from: c */
    private void m646c() {
        ArrayList arrayList = new ArrayList();
        this.f614p = arrayList;
        C0179b Y1 = C0179b.m650Y1(arrayList);
        this.f615q = Y1;
        Y1.mo545b2(this);
        setOnTouchListener(this);
        this.f618t = (ArrayAdapter) getAdapter();
        if (!TextUtils.isEmpty(this.f619u)) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.f613o, 17367043, new String[]{this.f619u});
            this.f620v = true;
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
    }

    /* renamed from: d */
    private C0636d m647d(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (C0636d) context;
        }
        if (context instanceof ContextWrapper) {
            return m647d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: C */
    public void mo527C(Object obj, int i) {
        setSelection(this.f614p.indexOf(obj));
        C0177a aVar = this.f616r;
        if (aVar != null) {
            aVar.mo537i(this.f614p.indexOf(obj));
        }
        if (!this.f617s) {
            this.f617s = true;
            setAdapter((SpinnerAdapter) this.f618t);
            setSelection(this.f614p.indexOf(obj));
        }
    }

    public Object getSelectedItem() {
        if (TextUtils.isEmpty(this.f619u) || this.f617s) {
            return super.getSelectedItem();
        }
        return null;
    }

    public int getSelectedItemPosition() {
        if (TextUtils.isEmpty(this.f619u) || this.f617s) {
            return super.getSelectedItemPosition();
        }
        return -1;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayAdapter arrayAdapter;
        if (!this.f615q.mo3181Z() && motionEvent.getAction() == 1 && (arrayAdapter = this.f618t) != null && arrayAdapter.getCount() > 0) {
            this.f614p.clear();
            for (int i = 0; i < this.f618t.getCount(); i++) {
                this.f614p.add(this.f618t.getItem(i));
            }
            this.f615q.mo3292W1(m647d(this.f613o).mo3317z(), "TAG");
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f620v) {
            this.f618t = (ArrayAdapter) spinnerAdapter;
            if (!TextUtils.isEmpty(this.f619u) && !this.f617s) {
                spinnerAdapter = new ArrayAdapter(this.f613o, 17367043, new String[]{this.f619u});
            }
        } else {
            this.f620v = false;
        }
        super.setAdapter(spinnerAdapter);
    }

    public void setOnItemClickListener(C0177a aVar) {
        this.f616r = aVar;
    }

    public void setOnSearchTextChangedListener(C0179b.C0180a aVar) {
        this.f615q.mo544a2(aVar);
    }

    public void setPositiveButton(String str) {
        this.f615q.mo546c2(str);
    }

    public void setTitle(String str) {
        this.f615q.mo547d2(str);
    }
}
