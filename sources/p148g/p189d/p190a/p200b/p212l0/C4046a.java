package p148g.p189d.p190a.p200b.p212l0;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4269j;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

@TargetApi(16)
/* renamed from: g.d.a.b.l0.a */
public final class C4046a {

    /* renamed from: a */
    public final String f12784a;

    /* renamed from: b */
    public final boolean f12785b;

    /* renamed from: c */
    public final boolean f12786c;

    /* renamed from: d */
    public final boolean f12787d;

    /* renamed from: e */
    private final String f12788e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f12789f;

    private C4046a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        C4260a.m18073e(str);
        this.f12784a = str;
        this.f12788e = str2;
        this.f12789f = codecCapabilities;
        boolean z3 = true;
        this.f12785b = !z && codecCapabilities != null && m17135e(codecCapabilities);
        this.f12786c = codecCapabilities != null && m17139l(codecCapabilities);
        if (!z2 && (codecCapabilities == null || !m17137j(codecCapabilities))) {
            z3 = false;
        }
        this.f12787d = z3;
    }

    /* renamed from: a */
    private static int m17133a(String str, String str2, int i) {
        if (i > 1 || ((C4284w.f13659a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    @TargetApi(21)
    /* renamed from: c */
    private static boolean m17134c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    /* renamed from: e */
    private static boolean m17135e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4284w.f13659a >= 19 && m17136f(codecCapabilities);
    }

    @TargetApi(19)
    /* renamed from: f */
    private static boolean m17136f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: j */
    private static boolean m17137j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4284w.f13659a >= 21 && m17138k(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: k */
    private static boolean m17138k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: l */
    private static boolean m17139l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4284w.f13659a >= 21 && m17140m(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: m */
    private static boolean m17140m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: o */
    private void m17141o(String str) {
        Log.d("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f12784a + ", " + this.f12788e + "] [" + C4284w.f13663e + "]");
    }

    /* renamed from: p */
    private void m17142p(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f12784a + ", " + this.f12788e + "] [" + C4284w.f13663e + "]");
    }

    /* renamed from: q */
    public static C4046a m17143q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C4046a(str, str2, codecCapabilities, z, z2);
    }

    /* renamed from: r */
    public static C4046a m17144r(String str) {
        return new C4046a(str, (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    @TargetApi(21)
    /* renamed from: b */
    public Point mo12917b(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12789f;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "align.vCaps";
            } else {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(C4284w.m18239e(i, widthAlignment) * widthAlignment, C4284w.m18239e(i2, heightAlignment) * heightAlignment);
            }
        }
        m17142p(str);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] mo12918d() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f12789f
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p212l0.C4046a.mo12918d():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    @TargetApi(21)
    /* renamed from: g */
    public boolean mo12919g(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12789f;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (m17133a(this.f12784a, this.f12788e, audioCapabilities.getMaxInputChannelCount()) >= i) {
                return true;
            } else {
                str = "channelCount.support, " + i;
            }
        }
        m17142p(str);
        return false;
    }

    @TargetApi(21)
    /* renamed from: h */
    public boolean mo12920h(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12789f;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                str = "sampleRate.support, " + i;
            }
        }
        m17142p(str);
        return false;
    }

    /* renamed from: i */
    public boolean mo12921i(String str) {
        String b;
        StringBuilder sb;
        String str2;
        if (str == null || this.f12788e == null || (b = C4269j.m18111b(str)) == null) {
            return true;
        }
        if (!this.f12788e.equals(b)) {
            sb = new StringBuilder();
            str2 = "codec.mime ";
        } else {
            Pair<Integer, Integer> e = C4051d.m17214e(str);
            if (e == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo12918d()) {
                if (codecProfileLevel.profile == ((Integer) e.first).intValue() && codecProfileLevel.level >= ((Integer) e.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str2 = "codec.profileLevel, ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(b);
        m17142p(sb.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: n */
    public boolean mo12922n(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12789f;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (m17134c(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i >= i2 || !m17134c(videoCapabilities, i2, i, d)) {
                    str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d;
                } else {
                    m17141o("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                    return true;
                }
            }
        }
        m17142p(str);
        return false;
    }
}
