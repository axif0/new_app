package p148g.p189d.p190a.p200b.p230r0;

import android.text.TextUtils;

/* renamed from: g.d.a.b.r0.j */
public final class C4269j {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18110a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 5
            switch(r0) {
                case -2123537834: goto L_0x0040;
                case -1095064472: goto L_0x0036;
                case 187078296: goto L_0x002c;
                case 1504578661: goto L_0x0022;
                case 1505942594: goto L_0x0018;
                case 1556697186: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 5
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 4
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 2
            goto L_0x004b
        L_0x004a:
            r7 = -1
        L_0x004b:
            if (r7 == 0) goto L_0x0062
            if (r7 == r5) goto L_0x0060
            if (r7 == r4) goto L_0x0060
            if (r7 == r3) goto L_0x005e
            if (r7 == r2) goto L_0x005b
            if (r7 == r6) goto L_0x0058
            return r1
        L_0x0058:
            r7 = 14
            return r7
        L_0x005b:
            r7 = 8
            return r7
        L_0x005e:
            r7 = 7
            return r7
        L_0x0060:
            r7 = 6
            return r7
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p230r0.C4269j.m18110a(java.lang.String):int");
    }

    /* renamed from: b */
    public static String m18111b(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9") || trim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8") || trim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (trim.startsWith("mp4a")) {
            if (trim.startsWith("mp4a.")) {
                String substring = trim.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = m18112c(Integer.parseInt(C4284w.m18234G(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (trim.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (trim.startsWith("opus")) {
                return "audio/opus";
            }
            if (trim.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            return null;
        }
    }

    /* renamed from: c */
    public static String m18112c(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 107) {
            return "audio/mpeg";
        }
        if (i == 96 || i == 97) {
            return "video/mpeg2";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
                return "audio/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: d */
    private static String m18113d(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    /* renamed from: e */
    public static int m18114e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m18115f(str)) {
            return 1;
        }
        if (m18117h(str)) {
            return 2;
        }
        if (m18116g(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        return ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) ? 4 : -1;
    }

    /* renamed from: f */
    public static boolean m18115f(String str) {
        return "audio".equals(m18113d(str));
    }

    /* renamed from: g */
    public static boolean m18116g(String str) {
        return "text".equals(m18113d(str));
    }

    /* renamed from: h */
    public static boolean m18117h(String str) {
        return "video".equals(m18113d(str));
    }
}
