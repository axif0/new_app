package p148g.p189d.p190a.p200b.p212l0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: g.d.a.b.l0.d */
public final class C4051d {

    /* renamed from: a */
    private static final C4046a f12831a = C4046a.m17144r("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f12832b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C4053b, List<C4046a>> f12833c = new HashMap<>();

    /* renamed from: d */
    private static final SparseIntArray f12834d;

    /* renamed from: e */
    private static final SparseIntArray f12835e;

    /* renamed from: f */
    private static final Map<String, Integer> f12836f;

    /* renamed from: g */
    private static int f12837g = -1;

    /* renamed from: g.d.a.b.l0.d$b */
    private static final class C4053b {

        /* renamed from: a */
        public final String f12838a;

        /* renamed from: b */
        public final boolean f12839b;

        public C4053b(String str, boolean z) {
            this.f12838a = str;
            this.f12839b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C4053b.class) {
                return false;
            }
            C4053b bVar = (C4053b) obj;
            return TextUtils.equals(this.f12838a, bVar.f12838a) && this.f12839b == bVar.f12839b;
        }

        public int hashCode() {
            String str = this.f12838a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f12839b ? 1231 : 1237);
        }
    }

    /* renamed from: g.d.a.b.l0.d$c */
    public static class C4054c extends Exception {
        private C4054c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: g.d.a.b.l0.d$d */
    private interface C4055d {
        /* renamed from: a */
        MediaCodecInfo mo12937a(int i);

        /* renamed from: b */
        int mo12938b();

        /* renamed from: c */
        boolean mo12939c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        boolean mo12940d();
    }

    /* renamed from: g.d.a.b.l0.d$e */
    private static final class C4056e implements C4055d {
        private C4056e() {
        }

        /* renamed from: a */
        public MediaCodecInfo mo12937a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public int mo12938b() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: c */
        public boolean mo12939c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        /* renamed from: d */
        public boolean mo12940d() {
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: g.d.a.b.l0.d$f */
    private static final class C4057f implements C4055d {

        /* renamed from: a */
        private final int f12840a;

        /* renamed from: b */
        private MediaCodecInfo[] f12841b;

        public C4057f(boolean z) {
            this.f12840a = z ? 1 : 0;
        }

        /* renamed from: e */
        private void m17230e() {
            if (this.f12841b == null) {
                this.f12841b = new MediaCodecList(this.f12840a).getCodecInfos();
            }
        }

        /* renamed from: a */
        public MediaCodecInfo mo12937a(int i) {
            m17230e();
            return this.f12841b[i];
        }

        /* renamed from: b */
        public int mo12938b() {
            m17230e();
            return this.f12841b.length;
        }

        /* renamed from: c */
        public boolean mo12939c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: d */
        public boolean mo12940d() {
            return true;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12834d = sparseIntArray;
        sparseIntArray.put(66, 1);
        f12834d.put(77, 2);
        f12834d.put(88, 4);
        f12834d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f12835e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f12835e.put(11, 4);
        f12835e.put(12, 8);
        f12835e.put(13, 16);
        f12835e.put(20, 32);
        f12835e.put(21, 64);
        f12835e.put(22, 128);
        f12835e.put(30, 256);
        f12835e.put(31, 512);
        f12835e.put(32, 1024);
        f12835e.put(40, 2048);
        f12835e.put(41, 4096);
        f12835e.put(42, 8192);
        f12835e.put(50, 16384);
        f12835e.put(51, 32768);
        f12835e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f12836f = hashMap;
        hashMap.put("L30", 1);
        f12836f.put("L60", 4);
        f12836f.put("L63", 16);
        f12836f.put("L90", 64);
        f12836f.put("L93", 256);
        f12836f.put("L120", 1024);
        f12836f.put("L123", 4096);
        f12836f.put("L150", 16384);
        f12836f.put("L153", 65536);
        f12836f.put("L156", 262144);
        f12836f.put("L180", 1048576);
        f12836f.put("L183", 4194304);
        f12836f.put("L186", 16777216);
        f12836f.put("H30", 2);
        f12836f.put("H60", 8);
        f12836f.put("H63", 32);
        f12836f.put("H90", 128);
        f12836f.put("H93", 512);
        f12836f.put("H120", 2048);
        f12836f.put("H123", 8192);
        f12836f.put("H150", 32768);
        f12836f.put("H153", 131072);
        f12836f.put("H156", 524288);
        f12836f.put("H180", 2097152);
        f12836f.put("H183", 8388608);
        f12836f.put("H186", 33554432);
    }

    /* renamed from: a */
    private static void m17210a(List<C4046a> list) {
        if (C4284w.f13659a < 26) {
            if (list.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).f12784a)) {
                for (int i = 1; i < list.size(); i++) {
                    C4046a aVar = list.get(i);
                    if ("OMX.google.raw.decoder".equals(aVar.f12784a)) {
                        list.remove(i);
                        list.add(0, aVar);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static int m17211b(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    private static boolean m17212c(String str) {
        return C4284w.f13659a <= 22 && (C4284w.f13662d.equals("ODROID-XU3") || C4284w.f13662d.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    /* renamed from: d */
    private static Pair<Integer, Integer> m17213d(String str, String[] strArr) {
        StringBuilder sb;
        Integer num;
        Integer num2;
        String str2;
        if (strArr.length < 2) {
            sb = new StringBuilder();
        } else {
            try {
                if (strArr[1].length() == 6) {
                    num2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                    num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                } else if (strArr.length >= 3) {
                    Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                    num = Integer.valueOf(Integer.parseInt(strArr[2]));
                    num2 = valueOf;
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                Integer valueOf2 = Integer.valueOf(f12834d.get(num2.intValue()));
                if (valueOf2 == null) {
                    str2 = "Unknown AVC profile: " + num2;
                    Log.w("MediaCodecUtil", str2);
                    return null;
                }
                Integer valueOf3 = Integer.valueOf(f12835e.get(num.intValue()));
                if (valueOf3 != null) {
                    return new Pair<>(valueOf2, valueOf3);
                }
                sb = new StringBuilder();
                sb.append("Unknown AVC level: ");
                sb.append(num);
                str2 = sb.toString();
                Log.w("MediaCodecUtil", str2);
                return null;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        }
        sb.append("Ignoring malformed AVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        Log.w("MediaCodecUtil", str2);
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m17214e(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0040
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            if (r2 == 0) goto L_0x004f
            if (r2 == r8) goto L_0x004f
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x004a
            return r0
        L_0x004a:
            android.util.Pair r9 = m17213d(r9, r1)
            return r9
        L_0x004f:
            android.util.Pair r9 = m17218i(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p212l0.C4051d.m17214e(java.lang.String):android.util.Pair");
    }

    /* renamed from: f */
    public static C4046a m17215f(String str, boolean z) throws C4054c {
        List<C4046a> g = m17216g(str, z);
        if (g.isEmpty()) {
            return null;
        }
        return g.get(0);
    }

    /* renamed from: g */
    public static synchronized List<C4046a> m17216g(String str, boolean z) throws C4054c {
        synchronized (C4051d.class) {
            C4053b bVar = new C4053b(str, z);
            List<C4046a> list = f12833c.get(bVar);
            if (list != null) {
                return list;
            }
            C4055d fVar = C4284w.f13659a >= 21 ? new C4057f(z) : new C4056e();
            ArrayList<C4046a> h = m17217h(bVar, fVar, str);
            if (z && h.isEmpty() && 21 <= C4284w.f13659a && C4284w.f13659a <= 23) {
                fVar = new C4056e();
                h = m17217h(bVar, fVar, str);
                if (!h.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + h.get(0).f12784a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                h.addAll(m17217h(new C4053b("audio/eac3", bVar.f12839b), fVar, str));
            }
            m17210a(h);
            List<C4046a> unmodifiableList = Collections.unmodifiableList(h);
            f12833c.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[Catch:{ Exception -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[Catch:{ Exception -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[SYNTHETIC, Splitter:B:38:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<p148g.p189d.p190a.p200b.p212l0.C4046a> m17217h(p148g.p189d.p190a.p200b.p212l0.C4051d.C4053b r17, p148g.p189d.p190a.p200b.p212l0.C4051d.C4055d r18, java.lang.String r19) throws p148g.p189d.p190a.p200b.p212l0.C4051d.C4054c {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e1 }
            r3.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r4 = r1.f12838a     // Catch:{ Exception -> 0x00e1 }
            int r5 = r18.mo12938b()     // Catch:{ Exception -> 0x00e1 }
            boolean r6 = r18.mo12940d()     // Catch:{ Exception -> 0x00e1 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x00e0
            android.media.MediaCodecInfo r9 = r2.mo12937a(r8)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x00e1 }
            r11 = r19
            boolean r0 = m17220k(r9, r10, r6, r11)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x00e1 }
            int r13 = r12.length     // Catch:{ Exception -> 0x00e1 }
            r14 = 0
        L_0x002c:
            if (r14 >= r13) goto L_0x00d6
            r15 = r12[r14]     // Catch:{ Exception -> 0x00e1 }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00cc
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x007f }
            boolean r7 = r2.mo12939c(r4, r0)     // Catch:{ Exception -> 0x007f }
            boolean r2 = m17212c(r10)     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x004f
            r16 = r5
            boolean r5 = r1.f12839b     // Catch:{ Exception -> 0x004d }
            if (r5 == r7) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r5 = 0
            goto L_0x0058
        L_0x004d:
            r0 = move-exception
            goto L_0x0082
        L_0x004f:
            r16 = r5
        L_0x0051:
            if (r6 != 0) goto L_0x0060
            boolean r5 = r1.f12839b     // Catch:{ Exception -> 0x004d }
            if (r5 != 0) goto L_0x0060
            goto L_0x004b
        L_0x0058:
            g.d.a.b.l0.a r0 = p148g.p189d.p190a.p200b.p212l0.C4046a.m17143q(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x004d }
            r3.add(r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x00ce
        L_0x0060:
            r5 = 0
            if (r6 != 0) goto L_0x00ce
            if (r7 == 0) goto L_0x00ce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r7.<init>()     // Catch:{ Exception -> 0x004d }
            r7.append(r10)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = ".secure"
            r7.append(r5)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x004d }
            r7 = 1
            g.d.a.b.l0.a r0 = p148g.p189d.p190a.p200b.p212l0.C4046a.m17143q(r5, r4, r0, r2, r7)     // Catch:{ Exception -> 0x004d }
            r3.add(r0)     // Catch:{ Exception -> 0x004d }
            return r3
        L_0x007f:
            r0 = move-exception
            r16 = r5
        L_0x0082:
            int r2 = p148g.p189d.p190a.p200b.p230r0.C4284w.f13659a     // Catch:{ Exception -> 0x00e1 }
            r5 = 23
            java.lang.String r7 = "MediaCodecUtil"
            if (r2 > r5) goto L_0x00aa
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x00e1 }
            if (r2 != 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r0.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "Skipping codec "
            r0.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r0.append(r10)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = " (failed to query capabilities)"
            r0.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e1 }
            android.util.Log.e(r7, r0)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00ce
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r1.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "Failed to query codec "
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r10)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r15)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e1 }
            android.util.Log.e(r7, r1)     // Catch:{ Exception -> 0x00e1 }
            throw r0     // Catch:{ Exception -> 0x00e1 }
        L_0x00cc:
            r16 = r5
        L_0x00ce:
            int r14 = r14 + 1
            r2 = r18
            r5 = r16
            goto L_0x002c
        L_0x00d6:
            r16 = r5
            int r8 = r8 + 1
            r2 = r18
            r5 = r16
            goto L_0x0014
        L_0x00e0:
            return r3
        L_0x00e1:
            r0 = move-exception
            g.d.a.b.l0.d$c r1 = new g.d.a.b.l0.d$c
            r2 = 0
            r1.<init>(r0)
            goto L_0x00ea
        L_0x00e9:
            throw r1
        L_0x00ea:
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p212l0.C4051d.m17217h(g.d.a.b.l0.d$b, g.d.a.b.l0.d$d, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    private static Pair<Integer, Integer> m17218i(String str, String[] strArr) {
        int i;
        String str2;
        StringBuilder sb;
        if (strArr.length < 4) {
            sb = new StringBuilder();
        } else {
            Matcher matcher = f12832b.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb = new StringBuilder();
            } else {
                str = matcher.group(1);
                if ("1".equals(str)) {
                    i = 1;
                } else if ("2".equals(str)) {
                    i = 2;
                } else {
                    sb = new StringBuilder();
                    sb.append("Unknown HEVC profile string: ");
                    sb.append(str);
                    str2 = sb.toString();
                    Log.w("MediaCodecUtil", str2);
                    return null;
                }
                Integer num = f12836f.get(strArr[3]);
                if (num != null) {
                    return new Pair<>(Integer.valueOf(i), num);
                }
                str2 = "Unknown HEVC level string: " + matcher.group(1);
                Log.w("MediaCodecUtil", str2);
                return null;
            }
        }
        sb.append("Ignoring malformed HEVC codec string: ");
        sb.append(str);
        str2 = sb.toString();
        Log.w("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: j */
    public static C4046a m17219j() {
        return f12831a;
    }

    /* renamed from: k */
    private static boolean m17220k(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (C4284w.f13659a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (C4284w.f13659a < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (C4284w.f13659a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(C4284w.f13660b) || ("Xiaomi".equals(C4284w.f13661c) && C4284w.f13660b.startsWith("HM")))) {
            return false;
        }
        if (C4284w.f13659a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(C4284w.f13660b) || "protou".equals(C4284w.f13660b) || "ville".equals(C4284w.f13660b) || "villeplus".equals(C4284w.f13660b) || "villec2".equals(C4284w.f13660b) || C4284w.f13660b.startsWith("gee") || "C6602".equals(C4284w.f13660b) || "C6603".equals(C4284w.f13660b) || "C6606".equals(C4284w.f13660b) || "C6616".equals(C4284w.f13660b) || "L36h".equals(C4284w.f13660b) || "SO-02E".equals(C4284w.f13660b))) {
            return false;
        }
        if (C4284w.f13659a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(C4284w.f13660b) || "C1505".equals(C4284w.f13660b) || "C1604".equals(C4284w.f13660b) || "C1605".equals(C4284w.f13660b))) {
            return false;
        }
        if (C4284w.f13659a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && C4284w.f13661c.equals("samsung") && (C4284w.f13660b.startsWith("zeroflte") || C4284w.f13660b.startsWith("zerolte") || C4284w.f13660b.startsWith("zenlte") || C4284w.f13660b.equals("SC-05G") || C4284w.f13660b.equals("marinelteatt") || C4284w.f13660b.equals("404SC") || C4284w.f13660b.equals("SC-04G") || C4284w.f13660b.equals("SCV31")))) {
            return false;
        }
        if (C4284w.f13659a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C4284w.f13661c) && (C4284w.f13660b.startsWith("d2") || C4284w.f13660b.startsWith("serrano") || C4284w.f13660b.startsWith("jflte") || C4284w.f13660b.startsWith("santos") || C4284w.f13660b.startsWith("t0"))) {
            return false;
        }
        if (C4284w.f13659a > 19 || !C4284w.f13660b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    /* renamed from: l */
    public static int m17221l() throws C4054c {
        if (f12837g == -1) {
            int i = 0;
            C4046a f = m17215f("video/avc", false);
            if (f != null) {
                MediaCodecInfo.CodecProfileLevel[] d = f.mo12918d();
                int length = d.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m17211b(d[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C4284w.f13659a >= 21 ? 345600 : 172800);
            }
            f12837g = i;
        }
        return f12837g;
    }
}
