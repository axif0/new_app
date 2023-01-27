package p148g.p189d.p190a.p200b.p204k0.p208r;

import android.util.Log;
import com.karumi.dexter.BuildConfig;
import p148g.p189d.p190a.p200b.p213m0.C4059a;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4072a;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4080e;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4087h;
import p148g.p189d.p190a.p200b.p213m0.p215i.C4090j;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.r.f */
final class C3969f {

    /* renamed from: A */
    private static final int f12283A = C4284w.m18249o("sosn");

    /* renamed from: B */
    private static final int f12284B = C4284w.m18249o("tvsh");

    /* renamed from: C */
    private static final int f12285C = C4284w.m18249o("----");

    /* renamed from: D */
    private static final String[] f12286D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f12287a = C4284w.m18249o("nam");

    /* renamed from: b */
    private static final int f12288b = C4284w.m18249o("trk");

    /* renamed from: c */
    private static final int f12289c = C4284w.m18249o("cmt");

    /* renamed from: d */
    private static final int f12290d = C4284w.m18249o("day");

    /* renamed from: e */
    private static final int f12291e = C4284w.m18249o("ART");

    /* renamed from: f */
    private static final int f12292f = C4284w.m18249o("too");

    /* renamed from: g */
    private static final int f12293g = C4284w.m18249o("alb");

    /* renamed from: h */
    private static final int f12294h = C4284w.m18249o("com");

    /* renamed from: i */
    private static final int f12295i = C4284w.m18249o("wrt");

    /* renamed from: j */
    private static final int f12296j = C4284w.m18249o("lyr");

    /* renamed from: k */
    private static final int f12297k = C4284w.m18249o("gen");

    /* renamed from: l */
    private static final int f12298l = C4284w.m18249o("covr");

    /* renamed from: m */
    private static final int f12299m = C4284w.m18249o("gnre");

    /* renamed from: n */
    private static final int f12300n = C4284w.m18249o("grp");

    /* renamed from: o */
    private static final int f12301o = C4284w.m18249o("disk");

    /* renamed from: p */
    private static final int f12302p = C4284w.m18249o("trkn");

    /* renamed from: q */
    private static final int f12303q = C4284w.m18249o("tmpo");

    /* renamed from: r */
    private static final int f12304r = C4284w.m18249o("cpil");

    /* renamed from: s */
    private static final int f12305s = C4284w.m18249o("aART");

    /* renamed from: t */
    private static final int f12306t = C4284w.m18249o("sonm");

    /* renamed from: u */
    private static final int f12307u = C4284w.m18249o("soal");

    /* renamed from: v */
    private static final int f12308v = C4284w.m18249o("soar");

    /* renamed from: w */
    private static final int f12309w = C4284w.m18249o("soaa");

    /* renamed from: x */
    private static final int f12310x = C4284w.m18249o("soco");

    /* renamed from: y */
    private static final int f12311y = C4284w.m18249o("rtng");

    /* renamed from: z */
    private static final int f12312z = C4284w.m18249o("pgap");

    /* renamed from: a */
    private static C4080e m16700a(int i, C4274m mVar) {
        int i2 = mVar.mo13464i();
        if (mVar.mo13464i() == C3952a.f12110F0) {
            mVar.mo13455K(8);
            String s = mVar.mo13474s(i2 - 16);
            return new C4080e("und", s, s);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + C3952a.m16616a(i));
        return null;
    }

    /* renamed from: b */
    private static C4072a m16701b(C4274m mVar) {
        String str;
        int i = mVar.mo13464i();
        if (mVar.mo13464i() == C3952a.f12110F0) {
            int b = C3952a.m16617b(mVar.mo13464i());
            String str2 = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str2 == null) {
                str = "Unrecognized cover art flags: " + b;
            } else {
                mVar.mo13455K(4);
                int i2 = i - 16;
                byte[] bArr = new byte[i2];
                mVar.mo13462g(bArr, 0, i2);
                return new C4072a(str2, (String) null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        Log.w("MetadataUtil", str);
        return null;
    }

    /* renamed from: c */
    public static C4059a.C4061b m16702c(C4274m mVar) {
        int c = mVar.mo13458c() + mVar.mo13464i();
        int i = mVar.mo13464i();
        int i2 = (i >> 24) & 255;
        if (i2 == 169 || i2 == 65533) {
            int i3 = 16777215 & i;
            if (i3 == f12289c) {
                C4080e a = m16700a(i, mVar);
                mVar.mo13454J(c);
                return a;
            }
            if (i3 != f12287a) {
                if (i3 != f12288b) {
                    if (i3 != f12294h) {
                        if (i3 != f12295i) {
                            if (i3 == f12290d) {
                                C4090j g = m16706g(i, "TDRC", mVar);
                                mVar.mo13454J(c);
                                return g;
                            } else if (i3 == f12291e) {
                                C4090j g2 = m16706g(i, "TPE1", mVar);
                                mVar.mo13454J(c);
                                return g2;
                            } else if (i3 == f12292f) {
                                C4090j g3 = m16706g(i, "TSSE", mVar);
                                mVar.mo13454J(c);
                                return g3;
                            } else if (i3 == f12293g) {
                                C4090j g4 = m16706g(i, "TALB", mVar);
                                mVar.mo13454J(c);
                                return g4;
                            } else if (i3 == f12296j) {
                                C4090j g5 = m16706g(i, "USLT", mVar);
                                mVar.mo13454J(c);
                                return g5;
                            } else if (i3 == f12297k) {
                                C4090j g6 = m16706g(i, "TCON", mVar);
                                mVar.mo13454J(c);
                                return g6;
                            } else if (i3 == f12300n) {
                                C4090j g7 = m16706g(i, "TIT1", mVar);
                                mVar.mo13454J(c);
                                return g7;
                            }
                        }
                    }
                    C4090j g8 = m16706g(i, "TCOM", mVar);
                    mVar.mo13454J(c);
                    return g8;
                }
            }
            C4090j g9 = m16706g(i, "TIT2", mVar);
            mVar.mo13454J(c);
            return g9;
        }
        try {
            if (i == f12299m) {
                return m16705f(mVar);
            }
            if (i == f12301o) {
                C4090j d = m16703d(i, "TPOS", mVar);
                mVar.mo13454J(c);
                return d;
            } else if (i == f12302p) {
                C4090j d2 = m16703d(i, "TRCK", mVar);
                mVar.mo13454J(c);
                return d2;
            } else if (i == f12303q) {
                C4087h h = m16707h(i, "TBPM", mVar, true, false);
                mVar.mo13454J(c);
                return h;
            } else if (i == f12304r) {
                C4087h h2 = m16707h(i, "TCMP", mVar, true, true);
                mVar.mo13454J(c);
                return h2;
            } else if (i == f12298l) {
                C4072a b = m16701b(mVar);
                mVar.mo13454J(c);
                return b;
            } else if (i == f12305s) {
                C4090j g10 = m16706g(i, "TPE2", mVar);
                mVar.mo13454J(c);
                return g10;
            } else if (i == f12306t) {
                C4090j g11 = m16706g(i, "TSOT", mVar);
                mVar.mo13454J(c);
                return g11;
            } else if (i == f12307u) {
                C4090j g12 = m16706g(i, "TSO2", mVar);
                mVar.mo13454J(c);
                return g12;
            } else if (i == f12308v) {
                C4090j g13 = m16706g(i, "TSOA", mVar);
                mVar.mo13454J(c);
                return g13;
            } else if (i == f12309w) {
                C4090j g14 = m16706g(i, "TSOP", mVar);
                mVar.mo13454J(c);
                return g14;
            } else if (i == f12310x) {
                C4090j g15 = m16706g(i, "TSOC", mVar);
                mVar.mo13454J(c);
                return g15;
            } else if (i == f12311y) {
                C4087h h3 = m16707h(i, "ITUNESADVISORY", mVar, false, false);
                mVar.mo13454J(c);
                return h3;
            } else if (i == f12312z) {
                C4087h h4 = m16707h(i, "ITUNESGAPLESS", mVar, false, true);
                mVar.mo13454J(c);
                return h4;
            } else if (i == f12283A) {
                C4090j g16 = m16706g(i, "TVSHOWSORT", mVar);
                mVar.mo13454J(c);
                return g16;
            } else if (i == f12284B) {
                C4090j g17 = m16706g(i, "TVSHOW", mVar);
                mVar.mo13454J(c);
                return g17;
            } else if (i == f12285C) {
                C4087h e = m16704e(mVar, c);
                mVar.mo13454J(c);
                return e;
            }
        } finally {
            mVar.mo13454J(c);
        }
        Log.d("MetadataUtil", "Skipped unknown metadata entry: " + C3952a.m16616a(i));
        mVar.mo13454J(c);
        return null;
    }

    /* renamed from: d */
    private static C4090j m16703d(int i, String str, C4274m mVar) {
        int i2 = mVar.mo13464i();
        if (mVar.mo13464i() == C3952a.f12110F0 && i2 >= 22) {
            mVar.mo13455K(10);
            int D = mVar.mo13448D();
            if (D > 0) {
                String str2 = BuildConfig.FLAVOR + D;
                int D2 = mVar.mo13448D();
                if (D2 > 0) {
                    str2 = str2 + "/" + D2;
                }
                return new C4090j(str, (String) null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + C3952a.m16616a(i));
        return null;
    }

    /* renamed from: e */
    private static C4087h m16704e(C4274m mVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (mVar.mo13458c() < i) {
            int c = mVar.mo13458c();
            int i4 = mVar.mo13464i();
            int i5 = mVar.mo13464i();
            mVar.mo13455K(4);
            if (i5 == C3952a.f12106D0) {
                str = mVar.mo13474s(i4 - 12);
            } else if (i5 == C3952a.f12108E0) {
                str2 = mVar.mo13474s(i4 - 12);
            } else {
                if (i5 == C3952a.f12110F0) {
                    i2 = c;
                    i3 = i4;
                }
                mVar.mo13455K(i4 - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i2 == -1) {
            return null;
        }
        mVar.mo13454J(i2);
        mVar.mo13455K(16);
        return new C4080e("und", str2, mVar.mo13474s(i3 - 16));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p148g.p189d.p190a.p200b.p213m0.p215i.C4090j m16705f(p148g.p189d.p190a.p200b.p230r0.C4274m r3) {
        /*
            int r3 = m16708i(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f12286D
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            g.d.a.b.m0.i.j r1 = new g.d.a.b.m0.i.j
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p208r.C3969f.m16705f(g.d.a.b.r0.m):g.d.a.b.m0.i.j");
    }

    /* renamed from: g */
    private static C4090j m16706g(int i, String str, C4274m mVar) {
        int i2 = mVar.mo13464i();
        if (mVar.mo13464i() == C3952a.f12110F0) {
            mVar.mo13455K(8);
            return new C4090j(str, (String) null, mVar.mo13474s(i2 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + C3952a.m16616a(i));
        return null;
    }

    /* renamed from: h */
    private static C4087h m16707h(int i, String str, C4274m mVar, boolean z, boolean z2) {
        int i2 = m16708i(mVar);
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new C4090j(str, (String) null, Integer.toString(i2)) : new C4080e("und", str, Integer.toString(i2));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + C3952a.m16616a(i));
        return null;
    }

    /* renamed from: i */
    private static int m16708i(C4274m mVar) {
        mVar.mo13455K(4);
        if (mVar.mo13464i() == C3952a.f12110F0) {
            mVar.mo13455K(8);
            return mVar.mo13479x();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
