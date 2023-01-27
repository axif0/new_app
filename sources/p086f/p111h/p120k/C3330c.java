package p086f.p111h.p120k;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p086f.p111h.p121l.C3344c;

/* renamed from: f.h.k.c */
public class C3330c implements Spannable {

    /* renamed from: f */
    private final Spannable f10614f;

    /* renamed from: g */
    private final C3331a f10615g;

    /* renamed from: h */
    private final PrecomputedText f10616h;

    /* renamed from: f.h.k.c$a */
    public static final class C3331a {

        /* renamed from: a */
        private final TextPaint f10617a;

        /* renamed from: b */
        private final TextDirectionHeuristic f10618b;

        /* renamed from: c */
        private final int f10619c;

        /* renamed from: d */
        private final int f10620d;

        /* renamed from: f.h.k.c$a$a */
        public static class C3332a {

            /* renamed from: a */
            private final TextPaint f10621a;

            /* renamed from: b */
            private TextDirectionHeuristic f10622b;

            /* renamed from: c */
            private int f10623c;

            /* renamed from: d */
            private int f10624d;

            public C3332a(TextPaint textPaint) {
                this.f10621a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f10623c = 1;
                    this.f10624d = 1;
                } else {
                    this.f10624d = 0;
                    this.f10623c = 0;
                }
                this.f10622b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C3331a mo11532a() {
                return new C3331a(this.f10621a, this.f10622b, this.f10623c, this.f10624d);
            }

            /* renamed from: b */
            public C3332a mo11533b(int i) {
                this.f10623c = i;
                return this;
            }

            /* renamed from: c */
            public C3332a mo11534c(int i) {
                this.f10624d = i;
                return this;
            }

            /* renamed from: d */
            public C3332a mo11535d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f10622b = textDirectionHeuristic;
                return this;
            }
        }

        public C3331a(PrecomputedText.Params params) {
            this.f10617a = params.getTextPaint();
            this.f10618b = params.getTextDirection();
            this.f10619c = params.getBreakStrategy();
            this.f10620d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        C3331a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f10617a = textPaint;
            this.f10618b = textDirectionHeuristic;
            this.f10619c = i;
            this.f10620d = i2;
        }

        /* renamed from: a */
        public boolean mo11524a(C3331a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f10619c != aVar.mo11525b() || this.f10620d != aVar.mo11526c())) || this.f10617a.getTextSize() != aVar.mo11528e().getTextSize() || this.f10617a.getTextScaleX() != aVar.mo11528e().getTextScaleX() || this.f10617a.getTextSkewX() != aVar.mo11528e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f10617a.getLetterSpacing() != aVar.mo11528e().getLetterSpacing() || !TextUtils.equals(this.f10617a.getFontFeatureSettings(), aVar.mo11528e().getFontFeatureSettings()))) || this.f10617a.getFlags() != aVar.mo11528e().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f10617a.getTextLocales().equals(aVar.mo11528e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f10617a.getTextLocale().equals(aVar.mo11528e().getTextLocale())) {
                return false;
            }
            return this.f10617a.getTypeface() == null ? aVar.mo11528e().getTypeface() == null : this.f10617a.getTypeface().equals(aVar.mo11528e().getTypeface());
        }

        /* renamed from: b */
        public int mo11525b() {
            return this.f10619c;
        }

        /* renamed from: c */
        public int mo11526c() {
            return this.f10620d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo11527d() {
            return this.f10618b;
        }

        /* renamed from: e */
        public TextPaint mo11528e() {
            return this.f10617a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3331a)) {
                return false;
            }
            C3331a aVar = (C3331a) obj;
            if (!mo11524a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f10618b == aVar.mo11527d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C3344c.m14351b(Float.valueOf(this.f10617a.getTextSize()), Float.valueOf(this.f10617a.getTextScaleX()), Float.valueOf(this.f10617a.getTextSkewX()), Float.valueOf(this.f10617a.getLetterSpacing()), Integer.valueOf(this.f10617a.getFlags()), this.f10617a.getTextLocales(), this.f10617a.getTypeface(), Boolean.valueOf(this.f10617a.isElegantTextHeight()), this.f10618b, Integer.valueOf(this.f10619c), Integer.valueOf(this.f10620d));
            } else if (i >= 21) {
                return C3344c.m14351b(Float.valueOf(this.f10617a.getTextSize()), Float.valueOf(this.f10617a.getTextScaleX()), Float.valueOf(this.f10617a.getTextSkewX()), Float.valueOf(this.f10617a.getLetterSpacing()), Integer.valueOf(this.f10617a.getFlags()), this.f10617a.getTextLocale(), this.f10617a.getTypeface(), Boolean.valueOf(this.f10617a.isElegantTextHeight()), this.f10618b, Integer.valueOf(this.f10619c), Integer.valueOf(this.f10620d));
            } else if (i >= 18) {
                return C3344c.m14351b(Float.valueOf(this.f10617a.getTextSize()), Float.valueOf(this.f10617a.getTextScaleX()), Float.valueOf(this.f10617a.getTextSkewX()), Integer.valueOf(this.f10617a.getFlags()), this.f10617a.getTextLocale(), this.f10617a.getTypeface(), this.f10618b, Integer.valueOf(this.f10619c), Integer.valueOf(this.f10620d));
            } else if (i >= 17) {
                return C3344c.m14351b(Float.valueOf(this.f10617a.getTextSize()), Float.valueOf(this.f10617a.getTextScaleX()), Float.valueOf(this.f10617a.getTextSkewX()), Integer.valueOf(this.f10617a.getFlags()), this.f10617a.getTextLocale(), this.f10617a.getTypeface(), this.f10618b, Integer.valueOf(this.f10619c), Integer.valueOf(this.f10620d));
            } else {
                return C3344c.m14351b(Float.valueOf(this.f10617a.getTextSize()), Float.valueOf(this.f10617a.getTextScaleX()), Float.valueOf(this.f10617a.getTextSkewX()), Integer.valueOf(this.f10617a.getFlags()), this.f10617a.getTypeface(), this.f10618b, Integer.valueOf(this.f10619c), Integer.valueOf(this.f10620d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x008f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f10617a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x00a5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00c3
            L_0x00b0:
                r2 = 17
                if (r1 < r2) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f10617a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x00a5
            L_0x00c3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f10617a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00fd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f10618b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f10619c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f10620d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p120k.C3330c.C3331a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C3331a mo11511a() {
        return this.f10615g;
    }

    /* renamed from: b */
    public PrecomputedText mo11512b() {
        Spannable spannable = this.f10614f;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f10614f.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f10614f.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f10614f.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f10614f.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f10616h.getSpans(i, i2, cls) : this.f10614f.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f10614f.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f10614f.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f10616h.removeSpan(obj);
        } else {
            this.f10614f.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f10616h.setSpan(obj, i, i2, i3);
        } else {
            this.f10614f.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f10614f.subSequence(i, i2);
    }

    public String toString() {
        return this.f10614f.toString();
    }
}
