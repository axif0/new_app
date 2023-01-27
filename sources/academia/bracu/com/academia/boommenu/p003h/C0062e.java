package academia.bracu.com.academia.boommenu.p003h;

import academia.bracu.com.academia.boommenu.BoomMenuButton;
import academia.bracu.com.academia.boommenu.p002c.C0032b;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: academia.bracu.com.academia.boommenu.h.e */
public class C0062e {

    /* renamed from: academia.bracu.com.academia.boommenu.h.e$a */
    static class C0063a implements Comparator<RectF> {
        C0063a() {
        }

        /* renamed from: a */
        public int compare(RectF rectF, RectF rectF2) {
            float f = rectF.top;
            float f2 = rectF2.top;
            if (f < f2) {
                return -1;
            }
            return f > f2 ? 1 : 0;
        }
    }

    /* renamed from: academia.bracu.com.academia.boommenu.h.e$b */
    static /* synthetic */ class C0064b {

        /* renamed from: a */
        static final /* synthetic */ int[] f353a;

        /* renamed from: b */
        static final /* synthetic */ int[] f354b;

        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(82:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Can't wrap try/catch for region: R(86:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0113 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x012b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0137 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0143 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x014f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x015b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0167 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0173 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x017f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x018b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0197 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01bb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01d3 */
        static {
            /*
                academia.bracu.com.academia.boommenu.e[] r0 = academia.bracu.com.academia.boommenu.C0054e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f354b = r0
                r1 = 1
                academia.bracu.com.academia.boommenu.e r2 = academia.bracu.com.academia.boommenu.C0054e.SimpleCircle     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f354b     // Catch:{ NoSuchFieldError -> 0x001d }
                academia.bracu.com.academia.boommenu.e r3 = academia.bracu.com.academia.boommenu.C0054e.TextInsideCircle     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f354b     // Catch:{ NoSuchFieldError -> 0x0028 }
                academia.bracu.com.academia.boommenu.e r4 = academia.bracu.com.academia.boommenu.C0054e.TextOutsideCircle     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f354b     // Catch:{ NoSuchFieldError -> 0x0033 }
                academia.bracu.com.academia.boommenu.e r5 = academia.bracu.com.academia.boommenu.C0054e.Ham     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                academia.bracu.com.academia.boommenu.h.d[] r4 = academia.bracu.com.academia.boommenu.p003h.C0060d.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f353a = r4
                academia.bracu.com.academia.boommenu.h.d r5 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_4_2     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f353a     // Catch:{ NoSuchFieldError -> 0x004e }
                academia.bracu.com.academia.boommenu.h.d r4 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_5_4     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0058 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_5     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0062 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_9_3     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x006d }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_2     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0078 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_1     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0083 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_2_1     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x008f }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_2_2     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x009b }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_3_1     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00a7 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_3_2     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_3_3     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00bf }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_3_4     // Catch:{ NoSuchFieldError -> 0x00bf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bf }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00cb }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_4_1     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00d7 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_5_1     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00e3 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_5_2     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00ef }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_5_3     // Catch:{ NoSuchFieldError -> 0x00ef }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ef }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x00fb }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_6_1     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0107 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_6_2     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0113 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_6_3     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x011f }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_6_4     // Catch:{ NoSuchFieldError -> 0x011f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x012b }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_6_5     // Catch:{ NoSuchFieldError -> 0x012b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012b }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012b }
            L_0x012b:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0137 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_6_6     // Catch:{ NoSuchFieldError -> 0x0137 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0137 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0137 }
            L_0x0137:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0143 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_7_1     // Catch:{ NoSuchFieldError -> 0x0143 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0143 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0143 }
            L_0x0143:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x014f }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_7_2     // Catch:{ NoSuchFieldError -> 0x014f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014f }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014f }
            L_0x014f:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x015b }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_7_3     // Catch:{ NoSuchFieldError -> 0x015b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015b }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015b }
            L_0x015b:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0167 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_7_4     // Catch:{ NoSuchFieldError -> 0x0167 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0167 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0167 }
            L_0x0167:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0173 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_7_5     // Catch:{ NoSuchFieldError -> 0x0173 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0173 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0173 }
            L_0x0173:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x017f }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_7_6     // Catch:{ NoSuchFieldError -> 0x017f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017f }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017f }
            L_0x017f:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x018b }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_1     // Catch:{ NoSuchFieldError -> 0x018b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018b }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018b }
            L_0x018b:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x0197 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_3     // Catch:{ NoSuchFieldError -> 0x0197 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0197 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0197 }
            L_0x0197:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x01a3 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_4     // Catch:{ NoSuchFieldError -> 0x01a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a3 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a3 }
            L_0x01a3:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x01af }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_6     // Catch:{ NoSuchFieldError -> 0x01af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01af }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01af }
            L_0x01af:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x01bb }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_8_7     // Catch:{ NoSuchFieldError -> 0x01bb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bb }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bb }
            L_0x01bb:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x01c7 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_9_1     // Catch:{ NoSuchFieldError -> 0x01c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c7 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c7 }
            L_0x01c7:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x01d3 }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.DOT_9_2     // Catch:{ NoSuchFieldError -> 0x01d3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d3 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d3 }
            L_0x01d3:
                int[] r0 = f353a     // Catch:{ NoSuchFieldError -> 0x01df }
                academia.bracu.com.academia.boommenu.h.d r1 = academia.bracu.com.academia.boommenu.p003h.C0060d.Custom     // Catch:{ NoSuchFieldError -> 0x01df }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01df }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01df }
            L_0x01df:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p003h.C0062e.C0064b.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static C0058b m277a(Context context, C0032b bVar, float f) {
        C0058b bVar2 = new C0058b(context);
        bVar.mo250g(bVar2);
        bVar2.mo285b(bVar.mo251h(context), f);
        return bVar2;
    }

    /* renamed from: b */
    private static C0059c m278b(Context context, C0032b bVar, float f) {
        C0059c cVar = new C0059c(context);
        bVar.mo250g(cVar);
        cVar.mo286b(bVar.mo251h(context), f);
        return cVar;
    }

    /* renamed from: c */
    public static C0057a m279c(BoomMenuButton boomMenuButton, C0032b bVar) {
        int i = C0064b.f354b[boomMenuButton.getButtonEnum().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return m277a(boomMenuButton.getContext(), bVar, boomMenuButton.getPieceCornerRadius());
        }
        if (i == 4) {
            return m278b(boomMenuButton.getContext(), bVar, boomMenuButton.getPieceCornerRadius());
        }
        throw new RuntimeException("Unknown button-enum!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01e2, code lost:
        r14.add(r2);
        r14.add(m283g(r0, 0.0f));
        r13 = r13 + r12;
        r14.add(m283g(r1, r13));
        r14.add(m283g(r15, r13));
        r9 = r9 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x021d, code lost:
        r14.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0319, code lost:
        r14.add(m283g(r1, 0.0f));
        r6 = r6 + r10;
        r14.add(m283g(r0, r6));
        r14.add(m283g(0.0f, r6));
        r0 = m283g(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x03cf, code lost:
        r14.add(r2);
        r14.add(m283g(r1, r15));
        r14.add(m283g(r13, r15));
        r0 = m283g(0.0f, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x03fe, code lost:
        r14.add(r2);
        r14.add(m283g(r0, 0.0f));
        r13 = r13 + r12;
        r0 = m283g(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0487, code lost:
        r0 = m283g(r1, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x049f, code lost:
        r14.add(m283g(r1, r13));
        r14.add(m283g(0.0f, r13));
        r0 = m283g(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0508, code lost:
        r14.add(r0);
        r0 = m283g(r15, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0537, code lost:
        r14.add(r0);
        r0 = m283g(0.0f, r6 + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x05fc, code lost:
        r14.add(r0);
        r14.add(m283g(r9, 0.0f));
        r14.add(m283g(r1, r13));
        r14.add(m283g(r13, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0614, code lost:
        r0 = m283g(0.0f, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0656, code lost:
        r14.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0659, code lost:
        r0 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0661, code lost:
        if (r0.hasNext() == false) goto L_0x0687;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0663, code lost:
        r1 = (android.graphics.PointF) r0.next();
        r4 = r26;
        r20.add(new android.graphics.RectF((r1.x + ((float) (r4.x / 2))) - r8, (r1.y + ((float) (r4.y / 2))) - r8, r10, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0689, code lost:
        return r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x063c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<android.graphics.RectF> m280d(academia.bracu.com.academia.boommenu.BoomMenuButton r25, android.graphics.Point r26) {
        /*
            r0 = r26
            float r1 = r25.getPieceHorizontalMargin()
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r1 * r2
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r1 * r4
            float r6 = r25.getPieceVerticalMargin()
            float r2 = r2 * r6
            float r4 = r4 * r6
            float r7 = r25.getPieceInclinedMargin()
            float r8 = r25.getDotRadius()
            r9 = 1073741824(0x40000000, float:2.0)
            float r10 = r8 * r9
            r11 = 1077936128(0x40400000, float:3.0)
            float r12 = r8 * r11
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            float r15 = r3 + r8
            r17 = r12
            double r11 = (double) r15
            r18 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r20 = java.lang.Math.sqrt(r18)
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r20 = r20 / r22
            java.lang.Double.isNaN(r11)
            double r11 = r11 / r20
            float r11 = (float) r11
            float r12 = r11 / r9
            float r20 = r11 - r12
            int[] r21 = academia.bracu.com.academia.boommenu.p003h.C0062e.C0064b.f353a
            academia.bracu.com.academia.boommenu.h.d r24 = r25.getPiecePlaceEnum()
            int r24 = r24.ordinal()
            r9 = r21[r24]
            r21 = r11
            r11 = 1
            r24 = r12
            r12 = 2
            if (r9 == r11) goto L_0x008f
            if (r9 == r12) goto L_0x008f
            r11 = 3
            if (r9 == r11) goto L_0x008f
            r11 = 4
            if (r9 == r11) goto L_0x008f
            r7 = 5
            if (r9 == r7) goto L_0x0074
            r7 = r15
            r11 = r20
            r12 = r21
            r19 = 1073741824(0x40000000, float:2.0)
            r20 = r13
            r13 = r24
            goto L_0x00a6
        L_0x0074:
            float r7 = r2 + r8
            r9 = r13
            double r12 = (double) r7
            double r18 = java.lang.Math.sqrt(r18)
            double r18 = r18 / r22
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r18
            float r12 = (float) r12
            r13 = 1073741824(0x40000000, float:2.0)
            float r18 = r12 / r13
            float r20 = r12 - r18
            r13 = r18
            r11 = r20
            goto L_0x00a2
        L_0x008f:
            r9 = r13
            float r7 = r7 + r10
            double r12 = (double) r7
            double r18 = java.lang.Math.sqrt(r22)
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r18
            float r12 = (float) r12
            r13 = r12
            r7 = r15
            r11 = r20
            r12 = r21
        L_0x00a2:
            r19 = 1073741824(0x40000000, float:2.0)
            r20 = r9
        L_0x00a6:
            float r9 = r13 * r19
            float r0 = r7 * r19
            r21 = r11
            r16 = 1077936128(0x40400000, float:3.0)
            float r11 = r7 * r16
            float r16 = r12 * r19
            int[] r19 = academia.bracu.com.academia.boommenu.p003h.C0062e.C0064b.f353a
            academia.bracu.com.academia.boommenu.h.d r22 = r25.getPiecePlaceEnum()
            int r22 = r22.ordinal()
            r19 = r19[r22]
            r22 = r7
            r7 = 0
            switch(r19) {
                case 1: goto L_0x063c;
                case 2: goto L_0x0619;
                case 3: goto L_0x05e1;
                case 4: goto L_0x05bd;
                case 5: goto L_0x057f;
                case 6: goto L_0x0578;
                case 7: goto L_0x0569;
                case 8: goto L_0x0559;
                case 9: goto L_0x0541;
                case 10: goto L_0x0529;
                case 11: goto L_0x0511;
                case 12: goto L_0x04f9;
                case 13: goto L_0x04d9;
                case 14: goto L_0x04b3;
                case 15: goto L_0x048d;
                case 16: goto L_0x046c;
                case 17: goto L_0x043d;
                case 18: goto L_0x040f;
                case 19: goto L_0x03e6;
                case 20: goto L_0x03b6;
                case 21: goto L_0x0383;
                case 22: goto L_0x0360;
                case 23: goto L_0x0335;
                case 24: goto L_0x02fe;
                case 25: goto L_0x02dc;
                case 26: goto L_0x02b9;
                case 27: goto L_0x0283;
                case 28: goto L_0x024d;
                case 29: goto L_0x0222;
                case 30: goto L_0x01ff;
                case 31: goto L_0x01c1;
                case 32: goto L_0x0180;
                case 33: goto L_0x013f;
                case 34: goto L_0x0117;
                case 35: goto L_0x00ec;
                case 36: goto L_0x00cc;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown piece-place-enum!"
            r0.<init>(r1)
            throw r0
        L_0x00cc:
            java.util.ArrayList r0 = r25.getCustomPiecePlacePositions()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0659
            java.lang.Object r1 = r0.next()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            float r2 = r1.x
            float r1 = r1.y
            android.graphics.PointF r1 = m283g(r2, r1)
            r14.add(r1)
            goto L_0x00d4
        L_0x00ec:
            float r1 = -r9
            float r1 = r1 - r16
            android.graphics.PointF r1 = m283g(r7, r1)
            r14.add(r1)
            float r1 = -r3
            float r1 = r1 - r8
            float r2 = -r13
            float r2 = r2 - r12
            android.graphics.PointF r3 = m283g(r1, r2)
            r14.add(r3)
            android.graphics.PointF r2 = m283g(r15, r2)
            r14.add(r2)
            float r2 = -r0
            android.graphics.PointF r2 = m283g(r2, r7)
            r14.add(r2)
            r2 = 0
            android.graphics.PointF r2 = m284h(r2, r2)
            goto L_0x01e2
        L_0x0117:
            float r0 = -r1
            float r0 = r0 - r10
            float r2 = -r6
            float r2 = r2 - r10
            android.graphics.PointF r3 = m283g(r0, r2)
            r14.add(r3)
            android.graphics.PointF r3 = m283g(r7, r2)
            r14.add(r3)
            float r1 = r1 + r10
            android.graphics.PointF r2 = m283g(r1, r2)
            r14.add(r2)
            android.graphics.PointF r2 = m283g(r0, r7)
            r14.add(r2)
            r2 = 0
            android.graphics.PointF r2 = m284h(r2, r2)
            goto L_0x021d
        L_0x013f:
            float r0 = -r3
            float r0 = r0 - r8
            float r1 = -r4
            float r1 = r1 - r17
            android.graphics.PointF r3 = m283g(r0, r1)
            r14.add(r3)
            android.graphics.PointF r1 = m283g(r15, r1)
            r14.add(r1)
            float r1 = -r2
            float r1 = r1 - r8
            android.graphics.PointF r3 = m283g(r0, r1)
            r14.add(r3)
            android.graphics.PointF r1 = m283g(r15, r1)
            r14.add(r1)
            float r2 = r2 + r8
            android.graphics.PointF r1 = m283g(r0, r2)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r15, r2)
            r14.add(r1)
            float r4 = r4 + r17
            android.graphics.PointF r0 = m283g(r0, r4)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r4)
            goto L_0x0656
        L_0x0180:
            float r0 = -r5
            float r0 = r0 - r17
            float r1 = -r2
            float r1 = r1 - r8
            android.graphics.PointF r4 = m283g(r0, r1)
            r14.add(r4)
            float r3 = -r3
            float r3 = r3 - r8
            android.graphics.PointF r4 = m283g(r3, r1)
            r14.add(r4)
            android.graphics.PointF r4 = m283g(r15, r1)
            r14.add(r4)
            float r5 = r5 + r17
            android.graphics.PointF r1 = m283g(r5, r1)
            r14.add(r1)
            float r2 = r2 + r8
            android.graphics.PointF r0 = m283g(r0, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r3, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r5, r2)
            goto L_0x0656
        L_0x01c1:
            float r1 = -r9
            float r1 = r1 - r16
            android.graphics.PointF r1 = m283g(r7, r1)
            r14.add(r1)
            float r1 = -r3
            float r1 = r1 - r8
            float r2 = -r13
            float r2 = r2 - r12
            android.graphics.PointF r3 = m283g(r1, r2)
            r14.add(r3)
            android.graphics.PointF r2 = m283g(r15, r2)
            r14.add(r2)
            float r2 = -r0
            android.graphics.PointF r2 = m283g(r2, r7)
        L_0x01e2:
            r14.add(r2)
            android.graphics.PointF r0 = m283g(r0, r7)
            r14.add(r0)
            float r13 = r13 + r12
            android.graphics.PointF r0 = m283g(r1, r13)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r13)
            r14.add(r0)
            float r9 = r9 + r16
            goto L_0x0614
        L_0x01ff:
            float r0 = -r1
            float r0 = r0 - r10
            float r2 = -r6
            float r2 = r2 - r10
            android.graphics.PointF r3 = m283g(r0, r2)
            r14.add(r3)
            android.graphics.PointF r3 = m283g(r7, r2)
            r14.add(r3)
            float r1 = r1 + r10
            android.graphics.PointF r2 = m283g(r1, r2)
            r14.add(r2)
            android.graphics.PointF r2 = m283g(r0, r7)
        L_0x021d:
            r14.add(r2)
            goto L_0x0319
        L_0x0222:
            float r1 = -r0
            float r2 = -r13
            float r2 = r2 - r12
            android.graphics.PointF r4 = m283g(r1, r2)
            r14.add(r4)
            android.graphics.PointF r4 = m283g(r7, r2)
            r14.add(r4)
            android.graphics.PointF r2 = m283g(r0, r2)
            r14.add(r2)
            float r2 = -r3
            float r2 = r2 - r8
            android.graphics.PointF r2 = m283g(r2, r7)
            r14.add(r2)
            android.graphics.PointF r2 = m283g(r15, r7)
            r14.add(r2)
            float r13 = r13 + r12
            goto L_0x049f
        L_0x024d:
            float r1 = -r0
            float r2 = -r12
            android.graphics.PointF r1 = m283g(r1, r2)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r7, r2)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r2)
            r14.add(r0)
            float r0 = -r11
            android.graphics.PointF r0 = m283g(r0, r13)
            r14.add(r0)
            r15 = r22
            float r0 = -r15
            android.graphics.PointF r0 = m283g(r0, r13)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r13)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r11, r13)
            goto L_0x0656
        L_0x0283:
            r15 = r22
            float r1 = -r11
            float r2 = -r13
            android.graphics.PointF r1 = m283g(r1, r2)
            r14.add(r1)
            float r1 = -r15
            android.graphics.PointF r1 = m283g(r1, r2)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r15, r2)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r11, r2)
            r14.add(r1)
            float r1 = -r0
            android.graphics.PointF r1 = m283g(r1, r12)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r7, r12)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r12)
            goto L_0x0656
        L_0x02b9:
            r15 = r22
            float r1 = -r0
            android.graphics.PointF r1 = m283g(r7, r1)
            r14.add(r1)
            float r1 = -r13
            float r1 = r1 - r12
            float r2 = -r15
            android.graphics.PointF r3 = m283g(r1, r2)
            r14.add(r3)
            float r13 = r13 + r12
            android.graphics.PointF r2 = m283g(r13, r2)
            r14.add(r2)
            r2 = 0
            android.graphics.PointF r2 = m284h(r2, r2)
            goto L_0x03cf
        L_0x02dc:
            r15 = r22
            float r1 = -r15
            float r2 = -r13
            float r2 = r2 - r12
            android.graphics.PointF r3 = m283g(r1, r2)
            r14.add(r3)
            android.graphics.PointF r2 = m283g(r15, r2)
            r14.add(r2)
            float r2 = -r0
            android.graphics.PointF r2 = m283g(r2, r7)
            r14.add(r2)
            r2 = 0
            android.graphics.PointF r2 = m284h(r2, r2)
            goto L_0x03fe
        L_0x02fe:
            float r0 = -r6
            float r0 = r0 - r10
            android.graphics.PointF r0 = m283g(r7, r0)
            r14.add(r0)
            float r0 = -r1
            float r0 = r0 - r10
            android.graphics.PointF r2 = m283g(r0, r7)
            r14.add(r2)
            r2 = 0
            android.graphics.PointF r2 = m284h(r2, r2)
            r14.add(r2)
            float r1 = r1 + r10
        L_0x0319:
            android.graphics.PointF r2 = m283g(r1, r7)
            r14.add(r2)
            float r6 = r6 + r10
            android.graphics.PointF r0 = m283g(r0, r6)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r7, r6)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r1, r6)
            goto L_0x0656
        L_0x0335:
            float r0 = -r1
            float r0 = r0 - r10
            float r2 = -r6
            float r2 = r2 - r10
            android.graphics.PointF r3 = m283g(r0, r2)
            r14.add(r3)
            android.graphics.PointF r3 = m283g(r7, r2)
            r14.add(r3)
            float r1 = r1 + r10
            android.graphics.PointF r2 = m283g(r1, r2)
            r14.add(r2)
            android.graphics.PointF r0 = m283g(r0, r7)
            r14.add(r0)
            r0 = 0
            android.graphics.PointF r0 = m284h(r0, r0)
            r14.add(r0)
            goto L_0x0487
        L_0x0360:
            float r1 = -r13
            float r1 = r1 - r12
            float r1 = r1 - r21
            android.graphics.PointF r1 = m283g(r7, r1)
            r14.add(r1)
            float r1 = -r3
            float r1 = r1 - r8
            r2 = r21
            float r3 = -r2
            android.graphics.PointF r1 = m283g(r1, r3)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r15, r3)
            r14.add(r1)
            float r1 = -r0
            float r13 = r13 + r12
            float r13 = r13 - r2
            goto L_0x049f
        L_0x0383:
            r2 = r21
            float r1 = -r0
            float r4 = -r13
            float r4 = r4 - r12
            float r4 = r4 + r2
            android.graphics.PointF r1 = m283g(r1, r4)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r7, r4)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r4)
            r14.add(r0)
            float r0 = -r3
            float r0 = r0 - r8
            android.graphics.PointF r0 = m283g(r0, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r2)
            r14.add(r0)
            float r13 = r13 + r12
            float r13 = r13 + r2
            android.graphics.PointF r0 = m283g(r7, r13)
            goto L_0x0656
        L_0x03b6:
            r15 = r22
            float r1 = -r0
            android.graphics.PointF r1 = m283g(r7, r1)
            r14.add(r1)
            float r1 = -r13
            float r1 = r1 - r12
            float r2 = -r15
            android.graphics.PointF r3 = m283g(r1, r2)
            r14.add(r3)
            float r13 = r13 + r12
            android.graphics.PointF r2 = m283g(r13, r2)
        L_0x03cf:
            r14.add(r2)
            android.graphics.PointF r1 = m283g(r1, r15)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r13, r15)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r7, r0)
            goto L_0x0656
        L_0x03e6:
            r15 = r22
            float r1 = -r15
            float r2 = -r13
            float r2 = r2 - r12
            android.graphics.PointF r3 = m283g(r1, r2)
            r14.add(r3)
            android.graphics.PointF r2 = m283g(r15, r2)
            r14.add(r2)
            float r2 = -r0
            android.graphics.PointF r2 = m283g(r2, r7)
        L_0x03fe:
            r14.add(r2)
            android.graphics.PointF r0 = m283g(r0, r7)
            r14.add(r0)
            float r13 = r13 + r12
            android.graphics.PointF r0 = m283g(r1, r13)
            goto L_0x0508
        L_0x040f:
            float r0 = -r3
            float r0 = r0 - r8
            float r1 = -r6
            float r1 = r1 - r10
            android.graphics.PointF r2 = m283g(r0, r1)
            r14.add(r2)
            android.graphics.PointF r1 = m283g(r15, r1)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r0, r7)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r15, r7)
            r14.add(r1)
            float r6 = r6 + r10
            android.graphics.PointF r0 = m283g(r0, r6)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r6)
            goto L_0x0656
        L_0x043d:
            float r0 = -r1
            float r0 = r0 - r10
            float r3 = -r2
            float r3 = r3 - r8
            android.graphics.PointF r4 = m283g(r0, r3)
            r14.add(r4)
            android.graphics.PointF r4 = m283g(r7, r3)
            r14.add(r4)
            float r1 = r1 + r10
            android.graphics.PointF r3 = m283g(r1, r3)
            r14.add(r3)
            float r2 = r2 + r8
            android.graphics.PointF r0 = m283g(r0, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r7, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r1, r2)
            goto L_0x0656
        L_0x046c:
            float r0 = -r6
            float r0 = r0 - r10
            android.graphics.PointF r0 = m283g(r7, r0)
            r14.add(r0)
            float r0 = -r1
            float r0 = r0 - r10
            android.graphics.PointF r0 = m283g(r0, r7)
            r14.add(r0)
            r0 = 0
            android.graphics.PointF r0 = m284h(r0, r0)
            r14.add(r0)
            float r1 = r1 + r10
        L_0x0487:
            android.graphics.PointF r0 = m283g(r1, r7)
            goto L_0x0537
        L_0x048d:
            float r1 = -r3
            float r1 = r1 - r8
            float r2 = -r12
            android.graphics.PointF r1 = m283g(r1, r2)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r15, r2)
            r14.add(r1)
            float r1 = -r0
        L_0x049f:
            android.graphics.PointF r1 = m283g(r1, r13)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r7, r13)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r13)
            goto L_0x0656
        L_0x04b3:
            float r1 = -r0
            float r2 = -r13
            android.graphics.PointF r1 = m283g(r1, r2)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r7, r2)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r2)
            r14.add(r0)
            float r0 = -r3
            float r0 = r0 - r8
            android.graphics.PointF r0 = m283g(r0, r12)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r12)
            goto L_0x0656
        L_0x04d9:
            float r0 = -r3
            float r0 = r0 - r8
            float r1 = -r2
            float r1 = r1 - r8
            android.graphics.PointF r3 = m283g(r0, r1)
            r14.add(r3)
            android.graphics.PointF r1 = m283g(r15, r1)
            r14.add(r1)
            float r2 = r2 + r8
            android.graphics.PointF r0 = m283g(r0, r2)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r2)
            goto L_0x0656
        L_0x04f9:
            r15 = r22
            float r0 = -r12
            android.graphics.PointF r0 = m283g(r7, r0)
            r14.add(r0)
            float r0 = -r15
            android.graphics.PointF r0 = m283g(r0, r13)
        L_0x0508:
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r13)
            goto L_0x0656
        L_0x0511:
            r15 = r22
            float r0 = -r15
            float r1 = -r13
            android.graphics.PointF r0 = m283g(r0, r1)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r1)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r7, r12)
            goto L_0x0656
        L_0x0529:
            float r0 = -r6
            float r0 = r0 - r10
            android.graphics.PointF r0 = m283g(r7, r0)
            r14.add(r0)
            r0 = 0
            android.graphics.PointF r0 = m284h(r0, r0)
        L_0x0537:
            r14.add(r0)
            float r6 = r6 + r10
            android.graphics.PointF r0 = m283g(r7, r6)
            goto L_0x0656
        L_0x0541:
            r0 = 0
            float r2 = -r1
            float r2 = r2 - r10
            android.graphics.PointF r2 = m283g(r2, r7)
            r14.add(r2)
            android.graphics.PointF r0 = m284h(r0, r0)
            r14.add(r0)
            float r1 = r1 + r10
            android.graphics.PointF r0 = m283g(r1, r7)
            goto L_0x0656
        L_0x0559:
            float r0 = -r2
            float r0 = r0 - r8
            android.graphics.PointF r0 = m283g(r7, r0)
            r14.add(r0)
            float r2 = r2 + r8
            android.graphics.PointF r0 = m283g(r7, r2)
            goto L_0x0656
        L_0x0569:
            float r0 = -r3
            float r0 = r0 - r8
            android.graphics.PointF r0 = m283g(r0, r7)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r15, r7)
            goto L_0x0656
        L_0x0578:
            r0 = 0
            android.graphics.PointF r0 = m284h(r0, r0)
            goto L_0x0656
        L_0x057f:
            float r1 = -r13
            float r1 = r1 - r12
            float r3 = -r0
            android.graphics.PointF r4 = m283g(r1, r3)
            r14.add(r4)
            float r13 = r13 + r12
            android.graphics.PointF r3 = m283g(r13, r3)
            r14.add(r3)
            float r3 = -r2
            float r3 = r3 - r8
            android.graphics.PointF r3 = m283g(r7, r3)
            r14.add(r3)
            android.graphics.PointF r3 = m283g(r1, r7)
            r14.add(r3)
            android.graphics.PointF r3 = m283g(r13, r7)
            r14.add(r3)
            float r2 = r2 + r8
            android.graphics.PointF r2 = m283g(r7, r2)
            r14.add(r2)
            android.graphics.PointF r1 = m283g(r1, r0)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r13, r0)
            goto L_0x0656
        L_0x05bd:
            float r0 = -r9
            android.graphics.PointF r1 = m283g(r7, r0)
            r14.add(r1)
            float r1 = -r13
            android.graphics.PointF r2 = m283g(r1, r1)
            r14.add(r2)
            android.graphics.PointF r2 = m283g(r13, r1)
            r14.add(r2)
            android.graphics.PointF r0 = m283g(r0, r7)
            r14.add(r0)
            r0 = 0
            android.graphics.PointF r0 = m284h(r0, r0)
            goto L_0x05fc
        L_0x05e1:
            float r0 = -r9
            android.graphics.PointF r1 = m283g(r7, r0)
            r14.add(r1)
            float r1 = -r13
            android.graphics.PointF r2 = m283g(r1, r1)
            r14.add(r2)
            android.graphics.PointF r2 = m283g(r13, r1)
            r14.add(r2)
            android.graphics.PointF r0 = m283g(r0, r7)
        L_0x05fc:
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r9, r7)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r1, r13)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r13, r13)
            r14.add(r0)
        L_0x0614:
            android.graphics.PointF r0 = m283g(r7, r9)
            goto L_0x0656
        L_0x0619:
            float r0 = -r13
            android.graphics.PointF r1 = m283g(r0, r0)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r13, r0)
            r14.add(r1)
            r1 = 0
            android.graphics.PointF r1 = m284h(r1, r1)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r13)
            r14.add(r0)
            android.graphics.PointF r0 = m283g(r13, r13)
            goto L_0x0656
        L_0x063c:
            float r0 = -r13
            android.graphics.PointF r1 = m283g(r7, r0)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r13, r7)
            r14.add(r1)
            android.graphics.PointF r1 = m283g(r7, r13)
            r14.add(r1)
            android.graphics.PointF r0 = m283g(r0, r7)
        L_0x0656:
            r14.add(r0)
        L_0x0659:
            java.util.Iterator r0 = r14.iterator()
        L_0x065d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0687
            java.lang.Object r1 = r0.next()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r1.x
            r4 = r26
            int r5 = r4.x
            r6 = 2
            int r5 = r5 / r6
            float r5 = (float) r5
            float r3 = r3 + r5
            float r3 = r3 - r8
            float r1 = r1.y
            int r5 = r4.y
            int r5 = r5 / r6
            float r5 = (float) r5
            float r1 = r1 + r5
            float r1 = r1 - r8
            r2.<init>(r3, r1, r10, r10)
            r1 = r20
            r1.add(r2)
            goto L_0x065d
        L_0x0687:
            r1 = r20
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.boommenu.p003h.C0062e.m280d(academia.bracu.com.academia.boommenu.BoomMenuButton, android.graphics.Point):java.util.ArrayList");
    }

    /* renamed from: e */
    public static ArrayList<RectF> m281e(BoomMenuButton boomMenuButton, Point point) {
        ArrayList<RectF> arrayList = new ArrayList<>();
        ArrayList<PointF> arrayList2 = new ArrayList<>();
        int pieceNumber = boomMenuButton.getPiecePlaceEnum().pieceNumber();
        int i = pieceNumber / 2;
        float hamWidth = boomMenuButton.getHamWidth();
        float f = hamWidth / 2.0f;
        float hamHeight = boomMenuButton.getHamHeight();
        float f2 = hamHeight / 2.0f;
        float pieceVerticalMargin = boomMenuButton.getPieceVerticalMargin();
        float f3 = pieceVerticalMargin / 2.0f;
        if (!boomMenuButton.getPiecePlaceEnum().equals(C0060d.Custom)) {
            int i2 = 0;
            if (pieceNumber % 2 == 0) {
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    arrayList2.add(m283g(0.0f, ((-f2) - f3) - (((float) i3) * (hamHeight + pieceVerticalMargin))));
                }
                while (i2 < i) {
                    arrayList2.add(m283g(0.0f, f2 + f3 + (((float) i2) * (hamHeight + pieceVerticalMargin))));
                    i2++;
                }
            } else {
                for (int i4 = i - 1; i4 >= 0; i4--) {
                    arrayList2.add(m283g(0.0f, ((-hamHeight) - pieceVerticalMargin) - (((float) i4) * (hamHeight + pieceVerticalMargin))));
                }
                arrayList2.add(m284h(0, 0));
                while (i2 < i) {
                    float f4 = hamHeight + pieceVerticalMargin;
                    arrayList2.add(m283g(0.0f, f4 + (((float) i2) * f4)));
                    i2++;
                }
            }
        } else {
            arrayList2 = boomMenuButton.getCustomPiecePlacePositions();
        }
        Iterator<PointF> it = arrayList2.iterator();
        while (it.hasNext()) {
            PointF next = it.next();
            arrayList.add(new RectF((next.x + ((float) (point.x / 2))) - f, (next.y + ((float) (point.y / 2))) - f2, hamWidth, hamHeight));
        }
        return arrayList;
    }

    /* renamed from: f */
    public static ArrayList<RectF> m282f(BoomMenuButton boomMenuButton, Point point, int i) {
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float dotRadius = boomMenuButton.getDotRadius();
        double shareLineLength = (double) boomMenuButton.getShareLineLength();
        double sqrt = Math.sqrt(3.0d);
        Double.isNaN(shareLineLength);
        float f = (float) ((shareLineLength * sqrt) / 3.0d);
        float f2 = f / 2.0f;
        float shareLineLength2 = boomMenuButton.getShareLineLength() / 2.0f;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 % 3;
            if (i3 == 0) {
                float f3 = dotRadius + dotRadius;
                rectF = new RectF(f2, -shareLineLength2, f3, f3);
            } else if (i3 == 1) {
                float f4 = dotRadius + dotRadius;
                rectF = new RectF(-f, 0.0f, f4, f4);
            } else if (i3 != 2) {
            } else {
                float f5 = dotRadius + dotRadius;
                rectF = new RectF(f2, shareLineLength2, f5, f5);
            }
            arrayList.add(rectF);
        }
        Collections.sort(arrayList, new C0063a());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).left += ((float) (point.x / 2)) - dotRadius;
            arrayList.get(i4).top += ((float) (point.y / 2)) - dotRadius;
        }
        return arrayList;
    }

    /* renamed from: g */
    private static PointF m283g(float f, float f2) {
        return new PointF(f, f2);
    }

    /* renamed from: h */
    private static PointF m284h(int i, int i2) {
        return new PointF((float) i, (float) i2);
    }
}
