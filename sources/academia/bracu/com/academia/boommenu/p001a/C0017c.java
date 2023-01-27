package academia.bracu.com.academia.boommenu.p001a;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: academia.bracu.com.academia.boommenu.a.c */
public class C0017c implements TimeInterpolator {

    /* renamed from: h */
    private static ArrayList<C0017c> f130h;

    /* renamed from: a */
    private C0019d f131a;

    /* renamed from: b */
    private PointF f132b = new PointF(0.0f, 0.0f);

    /* renamed from: c */
    private PointF f133c = new PointF(1.0f, 1.0f);

    /* renamed from: d */
    private PointF f134d = new PointF();

    /* renamed from: e */
    private PointF f135e = new PointF();

    /* renamed from: f */
    private PointF f136f = new PointF();

    /* renamed from: g */
    private Boolean f137g = Boolean.TRUE;

    /* renamed from: academia.bracu.com.academia.boommenu.a.c$a */
    static /* synthetic */ class C0018a {

        /* renamed from: a */
        static final /* synthetic */ int[] f138a;

        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|64) */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                academia.bracu.com.academia.boommenu.a.d[] r0 = academia.bracu.com.academia.boommenu.p001a.C0019d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f138a = r0
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.Linear     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x001d }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInSine     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0028 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutSine     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0033 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutSine     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x003e }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInQuad     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0049 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutQuad     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0054 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutQuad     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0060 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInCubic     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x006c }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutCubic     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0078 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutCubic     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0084 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInQuart     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0090 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutQuart     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x009c }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutQuart     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInQuint     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutQuint     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutQuint     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00cc }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInCirc     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutCirc     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutCirc     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInExpo     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x00fc }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutExpo     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0108 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutExpo     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0114 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInBack     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0120 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutBack     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x012c }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutBack     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0138 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInBounce     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0144 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutBounce     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0150 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutBounce     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x015c }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInElastic     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0168 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseOutElastic     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f138a     // Catch:{ NoSuchFieldError -> 0x0174 }
                academia.bracu.com.academia.boommenu.a.d r1 = academia.bracu.com.academia.boommenu.p001a.C0019d.EaseInOutElastic     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p001a.C0017c.C0018a.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0209, code lost:
        r7 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x020b, code lost:
        m120k(r1, r3, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x020f, code lost:
        r9.f131a = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0211, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0017c(academia.bracu.com.academia.boommenu.p001a.C0019d r10) {
        /*
            r9 = this;
            r9.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r1 = 0
            r0.<init>(r1, r1)
            r9.f132b = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            r9.f133c = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r9.f134d = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r9.f135e = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r9.f136f = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.f137g = r0
            int[] r0 = academia.bracu.com.academia.boommenu.p001a.C0017c.C0018a.f138a
            int r1 = r10.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0203;
                case 2: goto L_0x01f1;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01b7;
                case 6: goto L_0x01a5;
                case 7: goto L_0x0190;
                case 8: goto L_0x017a;
                case 9: goto L_0x0169;
                case 10: goto L_0x0158;
                case 11: goto L_0x0142;
                case 12: goto L_0x0131;
                case 13: goto L_0x0123;
                case 14: goto L_0x010d;
                case 15: goto L_0x00ff;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00db;
                case 18: goto L_0x00ca;
                case 19: goto L_0x00b4;
                case 20: goto L_0x009e;
                case 21: goto L_0x0090;
                case 22: goto L_0x0088;
                case 23: goto L_0x0072;
                case 24: goto L_0x005c;
                case 25: goto L_0x0046;
                case 26: goto L_0x0040;
                case 27: goto L_0x0040;
                case 28: goto L_0x0040;
                case 29: goto L_0x0040;
                case 30: goto L_0x0040;
                case 31: goto L_0x0040;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Ease-enum not found!"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.f137g = r0
            goto L_0x020f
        L_0x0046:
            r1 = 4604300115038500291(0x3fe5c28f5c28f5c3, double:0.68)
            r3 = -4620242857719391846(0xbfe199999999999a, double:-0.55)
            r5 = 4598445435522918646(0x3fd0f5c28f5c28f6, double:0.265)
            r7 = 4609659398595071181(0x3ff8cccccccccccd, double:1.55)
            goto L_0x020b
        L_0x005c:
            r1 = 4595437030971835154(0x3fc645a1cac08312, double:0.174)
            r3 = 4606146590885722194(0x3fec51eb851eb852, double:0.885)
            r5 = 4599436227440940155(0x3fd47ae147ae147b, double:0.32)
            r7 = 4608420908697544294(0x3ff4666666666666, double:1.275)
            goto L_0x020b
        L_0x0072:
            r1 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            r3 = -4626998257160447590(0xbfc999999999999a, double:-0.2)
            r5 = 4604795510997511045(0x3fe7851eb851eb85, double:0.735)
            r7 = 4586646004499207946(0x3fa70a3d70a3d70a, double:0.045)
            goto L_0x020b
        L_0x0088:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = 0
            r5 = 0
            goto L_0x0209
        L_0x0090:
            r1 = 4596013491724138578(0x3fc851eb851eb852, double:0.19)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 4597094355634707497(0x3fcc28f5c28f5c29, double:0.22)
            goto L_0x0209
        L_0x009e:
            r1 = 4606732058837280358(0x3fee666666666666, double:0.95)
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            r5 = 4605335942952795505(0x3fe970a3d70a3d71, double:0.795)
            r7 = 4585204852618449388(0x3fa1eb851eb851ec, double:0.035)
            goto L_0x020b
        L_0x00b4:
            r1 = 4605245870960248095(0x3fe91eb851eb851f, double:0.785)
            r3 = 4594031907888095560(0x3fc147ae147ae148, double:0.135)
            r5 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            r7 = 4605921410904353669(0x3feb851eb851eb85, double:0.86)
            goto L_0x020b
        L_0x00ca:
            r1 = 4590068740216009523(0x3fb3333333333333, double:0.075)
            r3 = 4605561122934164029(0x3fea3d70a3d70a3d, double:0.82)
            r5 = 4595112771798664479(0x3fc51eb851eb851f, double:0.165)
            goto L_0x0209
        L_0x00db:
            r1 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            r3 = 4585925428558828667(0x3fa47ae147ae147b, double:0.04)
            r5 = 4607002274814922588(0x3fef5c28f5c28f5c, double:0.98)
            r7 = 4599706443418582385(0x3fd570a3d70a3d71, double:0.335)
            goto L_0x020b
        L_0x00f1:
            r1 = 4605921410904353669(0x3feb851eb851eb85, double:0.86)
            r3 = 0
            r5 = 4589708452245819884(0x3fb1eb851eb851ec, double:0.07)
            goto L_0x0209
        L_0x00ff:
            r1 = 4597454643604897137(0x3fcd70a3d70a3d71, double:0.23)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 4599436227440940155(0x3fd47ae147ae147b, double:0.32)
            goto L_0x0209
        L_0x010d:
            r1 = 4604975654982605865(0x3fe828f5c28f5c29, double:0.755)
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            r5 = 4605876374908079964(0x3feb5c28f5c28f5c, double:0.855)
            r7 = 4588807732320345784(0x3faeb851eb851eb8, double:0.06)
            goto L_0x020b
        L_0x0123:
            r1 = 4605110762971426980(0x3fe8a3d70a3d70a4, double:0.77)
            r3 = 0
            r5 = 4595473059768854118(0x3fc6666666666666, double:0.175)
            goto L_0x0209
        L_0x0131:
            r1 = 4595112771798664479(0x3fc51eb851eb851f, double:0.165)
            r3 = 4605741266919258849(0x3feae147ae147ae1, double:0.84)
            r5 = 4601597955262077993(0x3fdc28f5c28f5c29, double:0.44)
            goto L_0x0209
        L_0x0142:
            r1 = 4606236662878269604(0x3feca3d70a3d70a4, double:0.895)
            r3 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
            r5 = 4604345151034773996(0x3fe5eb851eb851ec, double:0.685)
            r7 = 4597094355634707497(0x3fcc28f5c28f5c29, double:0.22)
            goto L_0x020b
        L_0x0158:
            r1 = 4603984863064584356(0x3fe4a3d70a3d70a4, double:0.645)
            r3 = 4586646004499207946(0x3fa70a3d70a3d70a, double:0.045)
            r5 = 4599706443418582385(0x3fd570a3d70a3d71, double:0.335)
            goto L_0x0209
        L_0x0169:
            r1 = 4596914211649612677(0x3fcb851eb851eb85, double:0.215)
            r3 = 4603669611090668421(0x3fe3851eb851eb85, double:0.61)
            r5 = 4600066731388772024(0x3fd6b851eb851eb8, double:0.355)
            goto L_0x0209
        L_0x017a:
            r1 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            r3 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r5 = 4604255079042226586(0x3fe599999999999a, double:0.675)
            r7 = 4596013491724138578(0x3fc851eb851eb852, double:0.19)
            goto L_0x020b
        L_0x0190:
            r1 = 4601868171239720223(0x3fdd1eb851eb851f, double:0.455)
            r3 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
            r5 = 4602813927161468027(0x3fe07ae147ae147b, double:0.515)
            r7 = 4606777094833554063(0x3fee8f5c28f5c28f, double:0.955)
            goto L_0x020b
        L_0x01a5:
            r1 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r3 = 4601958243232267633(0x3fdd70a3d70a3d71, double:0.46)
            r5 = 4601778099247172813(0x3fdccccccccccccd, double:0.45)
            r7 = 4606641986844732948(0x3fee147ae147ae14, double:0.94)
            goto L_0x020b
        L_0x01b7:
            r1 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            r3 = 4590789316156388803(0x3fb5c28f5c28f5c3, double:0.085)
            r5 = 4604300115038500291(0x3fe5c28f5c28f5c3, double:0.68)
            r7 = 4602949035150289142(0x3fe0f5c28f5c28f6, double:0.53)
            goto L_0x020b
        L_0x01cc:
            r1 = 4601688027254625403(0x3fdc7ae147ae147b, double:0.445)
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            r5 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            r7 = 4606732058837280358(0x3fee666666666666, double:0.95)
            goto L_0x020b
        L_0x01e1:
            r1 = 4600697235336603894(0x3fd8f5c28f5c28f6, double:0.39)
            r3 = 4603354359116752486(0x3fe2666666666666, double:0.575)
            r5 = 4603264287124205076(0x3fe2147ae147ae14, double:0.565)
            goto L_0x0209
        L_0x01f1:
            r1 = 4602138387217362452(0x3fde147ae147ae14, double:0.47)
            r3 = 0
            r5 = 4604885582990058455(0x3fe7d70a3d70a3d7, double:0.745)
            r7 = 4604615367012416225(0x3fe6e147ae147ae1, double:0.715)
            goto L_0x020b
        L_0x0203:
            r1 = 0
            r3 = 0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0209:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x020b:
            r0 = r9
            r0.m120k(r1, r3, r5, r7)
        L_0x020f:
            r9.f131a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p001a.C0017c.<init>(academia.bracu.com.academia.boommenu.a.d):void");
    }

    /* renamed from: a */
    private float m110a(float f) {
        PointF pointF = this.f132b;
        if (pointF.x == 0.0f && pointF.y == 0.0f) {
            PointF pointF2 = this.f133c;
            if (pointF2.x == 1.0f && pointF2.y == 1.0f) {
                return f;
            }
        }
        PointF pointF3 = this.f136f;
        PointF pointF4 = this.f132b;
        float f2 = pointF4.y * 3.0f;
        pointF3.y = f2;
        PointF pointF5 = this.f135e;
        float f3 = ((this.f133c.y - pointF4.y) * 3.0f) - f2;
        pointF5.y = f3;
        PointF pointF6 = this.f134d;
        float f4 = (1.0f - pointF3.y) - f3;
        pointF6.y = f4;
        return f * (pointF3.y + ((pointF5.y + (f4 * f)) * f));
    }

    /* renamed from: b */
    private float m111b(float f, float f2, float f3, float f4) {
        return (f3 - m112c(f4 - f, 0.0f, f3, f4)) + f2;
    }

    /* renamed from: c */
    private float m112c(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f / f4;
        double d = (double) f8;
        if (d < 0.36363636363636365d) {
            f7 = 7.5625f * f8 * f8;
        } else {
            if (d < 0.7272727272727273d) {
                Double.isNaN(d);
                float f9 = (float) (d - 0.5454545454545454d);
                f5 = 7.5625f * f9 * f9;
                f6 = 0.75f;
            } else if (d < 0.7272727272727273d) {
                Double.isNaN(d);
                float f10 = (float) (d - 0.5454545454545454d);
                f5 = 7.5625f * f10 * f10;
                f6 = 0.9375f;
            } else {
                Double.isNaN(d);
                float f11 = (float) (d - 0.9545454545454546d);
                f5 = 7.5625f * f11 * f11;
                f6 = 0.984375f;
            }
            f7 = f5 + f6;
        }
        return (f3 * f7) + f2;
    }

    /* renamed from: d */
    private float m113d(float f) {
        return (1.0f - m112c(1.0f - f, 0.0f, 1.0f, 1.0f)) + 0.0f;
    }

    /* renamed from: e */
    private float m114e(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = f / 1.0f;
        if (f2 == 1.0f) {
            return 1.0f;
        }
        float f3 = f2 - 1.0f;
        return (-(((float) Math.pow(2.0d, (double) (10.0f * f3))) * 1.0f * ((float) Math.sin((double) ((((f3 * 1.0f) - 0.075f) * 6.2831855f) / 0.3f))))) + 0.0f;
    }

    /* renamed from: f */
    private float m115f(float f) {
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        float f2 = f * 2.0f;
        return (i < 0 ? m111b(f2, 0.0f, 1.0f, 1.0f) * 0.5f : (m112c(f2, 0.0f, 1.0f, 1.0f) * 0.5f) + 0.5f) + 0.0f;
    }

    /* renamed from: g */
    private float m116g(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = f / 0.5f;
        if (f2 == 2.0f) {
            return 1.0f;
        }
        int i = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        float f3 = f2 - 1.0f;
        return (i < 0 ? ((float) Math.pow(2.0d, (double) (10.0f * f3))) * 1.0f * ((float) Math.sin((double) ((((f3 * 1.0f) - 0.1125f) * 6.2831855f) / 0.45f))) * -0.5f : (((float) Math.pow(2.0d, (double) (-10.0f * f3))) * 1.0f * ((float) Math.sin((double) ((((f3 * 1.0f) - 0.1125f) * 6.2831855f) / 0.45f))) * 0.5f) + 1.0f) + 0.0f;
    }

    /* renamed from: h */
    private float m117h(float f) {
        float f2;
        float f3;
        float f4;
        float f5 = f / 1.0f;
        double d = (double) f5;
        if (d < 0.36363636363636365d) {
            f4 = 7.5625f * f5 * f5;
        } else {
            if (d < 0.7272727272727273d) {
                Double.isNaN(d);
                float f6 = (float) (d - 0.5454545454545454d);
                f2 = 7.5625f * f6 * f6;
                f3 = 0.75f;
            } else if (d < 0.9090909090909091d) {
                Double.isNaN(d);
                float f7 = (float) (d - 0.8181818181818182d);
                f2 = 7.5625f * f7 * f7;
                f3 = 0.9375f;
            } else {
                Double.isNaN(d);
                float f8 = (float) (d - 0.9545454545454546d);
                f2 = 7.5625f * f8 * f8;
                f3 = 0.984375f;
            }
            f4 = f2 + f3;
        }
        return (f4 * 1.0f) + 0.0f;
    }

    /* renamed from: i */
    private float m118i(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = f / 1.0f;
        if (f2 == 1.0f) {
            return 1.0f;
        }
        return (((float) Math.pow(2.0d, (double) (-10.0f * f2))) * 1.0f * ((float) Math.sin((double) ((((f2 * 1.0f) - 0.075f) * 6.2831855f) / 0.3f)))) + 1.0f + 0.0f;
    }

    /* renamed from: j */
    public static C0017c m119j(C0019d dVar) {
        if (f130h == null) {
            f130h = new ArrayList<>(C0019d.values().length);
            for (int length = C0019d.values().length; length > 0; length--) {
                f130h.add((Object) null);
            }
        }
        C0017c cVar = f130h.get(dVar.getValue());
        if (cVar != null) {
            return cVar;
        }
        C0017c cVar2 = new C0017c(dVar);
        f130h.set(dVar.getValue(), cVar2);
        return cVar2;
    }

    /* renamed from: k */
    private void m120k(double d, double d2, double d3, double d4) {
        m121l((float) d, (float) d2, (float) d3, (float) d4);
    }

    /* renamed from: l */
    private void m121l(float f, float f2, float f3, float f4) {
        this.f137g = Boolean.TRUE;
        this.f132b = new PointF(f, f2);
        this.f133c = new PointF(f3, f4);
    }

    public float getInterpolation(float f) {
        if (this.f137g.booleanValue()) {
            return m110a(f);
        }
        switch (C0018a.f138a[this.f131a.ordinal()]) {
            case 26:
                return m113d(f);
            case 27:
                return m117h(f);
            case 28:
                return m115f(f);
            case 29:
                return m114e(f);
            case 30:
                return m118i(f);
            case 31:
                return m116g(f);
            default:
                throw new RuntimeException("Wrong ease-enum initialize method.");
        }
    }
}
