package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0335g;
import androidx.appcompat.view.menu.C0339i;

/* renamed from: com.google.android.material.internal.g */
public class C2178g extends C0335g {
    public C2178g(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0339i iVar = (C0339i) mo1219a(i, i2, i3, charSequence);
        C2192i iVar2 = new C2192i(mo1267w(), this, iVar);
        iVar.mo1331x(iVar2);
        return iVar2;
    }
}
