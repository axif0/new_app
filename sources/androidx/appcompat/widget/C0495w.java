package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p086f.p111h.p121l.C3349h;

/* renamed from: androidx.appcompat.widget.w */
final class C0495w {

    /* renamed from: a */
    private TextView f1917a;

    /* renamed from: b */
    private TextClassifier f1918b;

    C0495w(TextView textView) {
        C3349h.m14361c(textView);
        this.f1917a = textView;
    }

    /* renamed from: a */
    public TextClassifier mo2433a() {
        TextClassifier textClassifier = this.f1918b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1917a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void mo2434b(TextClassifier textClassifier) {
        this.f1918b = textClassifier;
    }
}
