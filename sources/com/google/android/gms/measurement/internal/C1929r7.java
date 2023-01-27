package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.internal.C1662s;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
public final class C1929r7 {
    /* renamed from: a */
    public static String m8823a(Context context, String str) {
        try {
            return new C1662s(context).mo6565a(str);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m8824b(String str, String[] strArr, String[] strArr2) {
        C1658o.m7845j(strArr);
        C1658o.m7845j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
