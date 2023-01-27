package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p045p.C2605d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.installations.o */
class C2598o {

    /* renamed from: a */
    public static final long f8362a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    private static final Pattern f8363b = Pattern.compile("\\AA[\\w-]{38}\\z");

    C2598o() {
    }

    /* renamed from: c */
    static boolean m11543c(String str) {
        return f8363b.matcher(str).matches();
    }

    /* renamed from: d */
    static boolean m11544d(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo9504a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: b */
    public boolean mo9505b(C2605d dVar) {
        return TextUtils.isEmpty(dVar.mo9506b()) || dVar.mo9513h() + dVar.mo9507c() < mo9504a() + f8362a;
    }
}
