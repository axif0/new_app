package p148g.p189d.p296d.p310u.p311a;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: g.d.d.u.a.a */
public class C5441a {

    /* renamed from: a */
    private final Activity f15762a;

    /* renamed from: b */
    private Fragment f15763b;

    /* renamed from: c */
    private androidx.fragment.app.Fragment f15764c;

    /* renamed from: d */
    private final Map<String, Object> f15765d = new HashMap(3);

    /* renamed from: e */
    private Collection<String> f15766e;

    /* renamed from: f */
    private Class<?> f15767f;

    static {
        m22439f("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");
        m22439f("UPC_A", "UPC_E", "EAN_8", "EAN_13", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");
        Collections.singleton("QR_CODE");
        Collections.singleton("DATA_MATRIX");
    }

    public C5441a(Activity activity) {
        this.f15762a = activity;
    }

    /* renamed from: a */
    private void m22438a(Intent intent) {
        Serializable serializable;
        for (Map.Entry next : this.f15765d.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Integer) {
                serializable = (Integer) value;
            } else if (value instanceof Long) {
                serializable = (Long) value;
            } else if (value instanceof Boolean) {
                serializable = (Boolean) value;
            } else if (value instanceof Double) {
                serializable = (Double) value;
            } else if (value instanceof Float) {
                serializable = (Float) value;
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else {
                intent.putExtra(str, value.toString());
            }
            intent.putExtra(str, serializable);
        }
    }

    /* renamed from: f */
    private static List<String> m22439f(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    /* renamed from: g */
    public static C5442b m22440g(int i, int i2, Intent intent) {
        Integer num = null;
        if (i != 49374) {
            return null;
        }
        if (i2 != -1) {
            return new C5442b();
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
        if (intExtra != Integer.MIN_VALUE) {
            num = Integer.valueOf(intExtra);
        }
        return new C5442b(stringExtra, stringExtra2, byteArrayExtra, num, intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"));
    }

    /* renamed from: b */
    public Intent mo15743b() {
        Intent intent = new Intent(this.f15762a, mo15744c());
        intent.setAction("com.google.zxing.client.android.SCAN");
        if (this.f15766e != null) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.f15766e) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(next);
            }
            intent.putExtra("SCAN_FORMATS", sb.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        m22438a(intent);
        return intent;
    }

    /* renamed from: c */
    public Class<?> mo15744c() {
        if (this.f15767f == null) {
            this.f15767f = mo15745d();
        }
        return this.f15767f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Class<?> mo15745d() {
        return CaptureActivity.class;
    }

    /* renamed from: e */
    public final void mo15746e() {
        mo15747h(mo15743b(), 49374);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo15747h(Intent intent, int i) {
        Fragment fragment = this.f15763b;
        if (fragment == null) {
            androidx.fragment.app.Fragment fragment2 = this.f15764c;
            if (fragment2 != null) {
                fragment2.mo3147G1(intent, i);
            } else {
                this.f15762a.startActivityForResult(intent, i);
            }
        } else if (Build.VERSION.SDK_INT >= 11) {
            fragment.startActivityForResult(intent, i);
        }
    }
}
