package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0444j;
import com.google.android.material.internal.C2177f;
import com.google.android.material.internal.C2205o;
import com.google.android.material.theme.p040a.C2306a;
import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p252d.C4965b;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5005k;
import p148g.p189d.p190a.p252d.C5006l;

public class TextInputEditText extends C0444j {

    /* renamed from: i */
    private final Rect f7496i;

    /* renamed from: j */
    private boolean f7497j;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4965b.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C2306a.m10749c(context, attributeSet, i, 0), attributeSet, i);
        this.f7496i = new Rect();
        TypedArray h = C2205o.m10305h(context, attributeSet, C5006l.TextInputEditText, i, C5005k.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h.getBoolean(C5006l.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        h.recycle();
    }

    /* renamed from: a */
    private String m10538a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String str = BuildConfig.FLAVOR;
        String charSequence = z2 ? hint.toString() : str;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = str;
        }
        sb3.append(helperText);
        String sb4 = sb3.toString();
        if (!z) {
            return !TextUtils.isEmpty(sb4) ? sb4 : str;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(text);
        if (!TextUtils.isEmpty(sb4)) {
            str = ", " + sb4;
        }
        sb5.append(str);
        return sb5.toString();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f7497j && rect != null) {
            textInputLayout.getFocusedRect(this.f7496i);
            rect.bottom = this.f7496i.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f7497j || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f7496i, point);
            rect.bottom = this.f7496i.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.mo8853N()) ? super.getHint() : textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo8853N() && super.getHint() == null && C2177f.m10204a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(m10538a(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f7497j) {
            this.f7496i.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C4998d.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f7496i, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f7497j = z;
    }
}
