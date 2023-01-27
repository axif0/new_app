package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1655n;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.v */
final class C2652v {

    /* renamed from: d */
    private static final Pattern f8466d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f8467a;

    /* renamed from: b */
    private final String f8468b;

    /* renamed from: c */
    private final String f8469c;

    private C2652v(String str, String str2) {
        this.f8467a = m11805d(str2, str);
        this.f8468b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f8469c = sb.toString();
    }

    /* renamed from: a */
    static C2652v m11804a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C2652v(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m11805d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f8466d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: b */
    public final String mo9630b() {
        return this.f8468b;
    }

    /* renamed from: c */
    public final String mo9631c() {
        return this.f8467a;
    }

    /* renamed from: e */
    public final String mo9632e() {
        return this.f8469c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2652v)) {
            return false;
        }
        C2652v vVar = (C2652v) obj;
        return this.f8467a.equals(vVar.f8467a) && this.f8468b.equals(vVar.f8468b);
    }

    public final int hashCode() {
        return C1655n.m7833b(this.f8468b, this.f8467a);
    }
}
