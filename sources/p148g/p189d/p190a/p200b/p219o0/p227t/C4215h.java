package p148g.p189d.p190a.p200b.p219o0.p227t;

import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p219o0.C4157g;
import p148g.p189d.p190a.p200b.p230r0.C4274m;

/* renamed from: g.d.a.b.o0.t.h */
public final class C4215h {

    /* renamed from: a */
    private static final Pattern f13483a = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    static {
        Pattern.compile("^NOTE(( |\t).*)?$");
    }

    /* renamed from: a */
    public static float m17915a(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static long m17916b(String str) throws NumberFormatException {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: c */
    public static void m17917c(C4274m mVar) throws C4157g {
        String k = mVar.mo13466k();
        if (k == null || !f13483a.matcher(k).matches()) {
            throw new C4157g("Expected WEBVTT. Got " + k);
        }
    }
}
