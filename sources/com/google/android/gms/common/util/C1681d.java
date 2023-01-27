package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: com.google.android.gms.common.util.d */
public class C1681d {
    /* renamed from: a */
    public static boolean m7937a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (C4389c.m18627a(context).mo13715c(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
