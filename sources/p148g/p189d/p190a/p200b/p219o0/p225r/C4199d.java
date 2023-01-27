package p148g.p189d.p190a.p200b.p219o0.p225r;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: g.d.a.b.o0.r.d */
final class C4199d {
    /* renamed from: a */
    public static void m17790a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C4200e eVar) {
        Object obj;
        if (eVar.mo13267h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.mo13267h()), i, i2, 33);
        }
        if (eVar.mo13271m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (eVar.mo13272n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (eVar.mo13270k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.mo13262c()), i, i2, 33);
        }
        if (eVar.mo13269j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.mo13261b()), i, i2, 33);
        }
        if (eVar.mo13263d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.mo13263d()), i, i2, 33);
        }
        if (eVar.mo13268i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(eVar.mo13268i()), i, i2, 33);
        }
        int f = eVar.mo13265f();
        if (f == 1) {
            obj = new AbsoluteSizeSpan((int) eVar.mo13264e(), true);
        } else if (f == 2) {
            obj = new RelativeSizeSpan(eVar.mo13264e());
        } else if (f == 3) {
            obj = new RelativeSizeSpan(eVar.mo13264e() / 100.0f);
        } else {
            return;
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* renamed from: b */
    static String m17791b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    static void m17792c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: d */
    public static C4200e m17793d(C4200e eVar, String[] strArr, Map<String, C4200e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (eVar == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            C4200e eVar2 = new C4200e();
            int length = strArr.length;
            while (i < length) {
                eVar2.mo13260a(map.get(strArr[i]));
                i++;
            }
            return eVar2;
        } else if (eVar == null || strArr == null || strArr.length != 1) {
            if (!(eVar == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    eVar.mo13260a(map.get(strArr[i]));
                    i++;
                }
            }
            return eVar;
        } else {
            eVar.mo13260a(map.get(strArr[0]));
            return eVar;
        }
    }
}
