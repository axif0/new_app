package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p086f.p111h.p121l.C3345d;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C5000f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f6945f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C2095a extends C3350a {
        C2095a() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11625d0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6945f = C2139s.m9957l();
        if (C2120i.m9886m2(getContext())) {
            setNextFocusLeftId(C5000f.cancel_button);
            setNextFocusRightId(C5000f.confirm_button);
        }
        C3403t.m14643i0(this, new C2095a());
    }

    /* renamed from: a */
    private void m9799a(int i, Rect rect) {
        int b;
        if (i == 33) {
            b = getAdapter().mo8258h();
        } else if (i == 130) {
            b = getAdapter().mo8249b();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(b);
    }

    /* renamed from: c */
    private static int m9800c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m9801d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C2130m getAdapter() {
        return (C2130m) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2130m b = getAdapter();
        C2102d<?> dVar = b.f7048g;
        C2101c cVar = b.f7049h;
        Long c = b.getItem(b.mo8249b());
        Long c2 = b.getItem(b.mo8258h());
        for (C3345d next : dVar.mo8197t()) {
            F f = next.f10638a;
            if (f != null) {
                if (next.f10639b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f10639b).longValue();
                    if (!m9801d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c.longValue()) {
                            i2 = b.mo8249b();
                            i = b.mo8252f(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            materialCalendarGridView.f6945f.setTimeInMillis(longValue);
                            i2 = b.mo8248a(materialCalendarGridView.f6945f.get(5));
                            i = m9800c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = Math.min(b.mo8258h(), getChildCount() - 1);
                            i3 = b.mo8253g(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f6945f.setTimeInMillis(longValue2);
                            i4 = b.mo8248a(materialCalendarGridView.f6945f.get(5));
                            i3 = m9800c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f6965a.mo8189c()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f6965a.mo8188b()), cVar.f6972h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m9799a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo8249b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo8249b());
        return true;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C2130m) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C2130m.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo8249b()) {
            i = getAdapter().mo8249b();
        }
        super.setSelection(i);
    }
}
