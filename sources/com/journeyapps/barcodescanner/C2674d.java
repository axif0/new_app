package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.C0559a;
import com.journeyapps.barcodescanner.C2666c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p086f.p111h.p112e.C3267a;
import p148g.p189d.p296d.C5382n;
import p148g.p189d.p296d.C5383o;
import p148g.p189d.p296d.p300r.p301a.C5394b;
import p148g.p189d.p296d.p300r.p301a.C5399e;
import p148g.p189d.p296d.p300r.p301a.C5407j;

/* renamed from: com.journeyapps.barcodescanner.d */
public class C2674d {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f8567l = "d";

    /* renamed from: m */
    private static int f8568m = 250;

    /* renamed from: a */
    private Activity f8569a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public DecoratedBarcodeView f8570b;

    /* renamed from: c */
    private int f8571c = -1;

    /* renamed from: d */
    private boolean f8572d = false;

    /* renamed from: e */
    private boolean f8573e = false;

    /* renamed from: f */
    private C5399e f8574f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5394b f8575g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f8576h;

    /* renamed from: i */
    private C2664a f8577i = new C2675a();

    /* renamed from: j */
    private final C2666c.C2673f f8578j = new C2677b();

    /* renamed from: k */
    private boolean f8579k = false;

    /* renamed from: com.journeyapps.barcodescanner.d$a */
    class C2675a implements C2664a {

        /* renamed from: com.journeyapps.barcodescanner.d$a$a */
        class C2676a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C2665b f8581f;

            C2676a(C2665b bVar) {
                this.f8581f = bVar;
            }

            public void run() {
                C2674d.this.mo9789s(this.f8581f);
            }
        }

        C2675a() {
        }

        /* renamed from: a */
        public void mo9730a(C2665b bVar) {
            C2674d.this.f8570b.mo9718e();
            C2674d.this.f8575g.mo15638c();
            C2674d.this.f8576h.post(new C2676a(bVar));
        }

        /* renamed from: b */
        public void mo9731b(List<C5383o> list) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.d$b */
    class C2677b implements C2666c.C2673f {
        C2677b() {
        }

        /* renamed from: a */
        public void mo9736a() {
        }

        /* renamed from: b */
        public void mo9737b(Exception exc) {
            C2674d.this.mo9781g();
        }

        /* renamed from: c */
        public void mo9738c() {
        }

        /* renamed from: d */
        public void mo9739d() {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.d$c */
    class C2678c implements Runnable {
        C2678c() {
        }

        public void run() {
            Log.d(C2674d.f8567l, "Finishing due to inactivity");
            C2674d.this.m11920h();
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.d$d */
    class C2679d implements Runnable {
        C2679d() {
        }

        public void run() {
            C2674d.this.mo9790t();
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.d$e */
    class C2680e implements DialogInterface.OnClickListener {
        C2680e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2674d.this.m11920h();
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.d$f */
    class C2681f implements DialogInterface.OnCancelListener {
        C2681f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C2674d.this.m11920h();
        }
    }

    public C2674d(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        this.f8569a = activity;
        this.f8570b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().mo9752i(this.f8578j);
        this.f8576h = new Handler();
        this.f8574f = new C5399e(activity, new C2678c());
        this.f8575g = new C5394b(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11920h() {
        this.f8569a.finish();
    }

    /* renamed from: i */
    private String m11921i(C2665b bVar) {
        if (this.f8572d) {
            Bitmap b = bVar.mo9741b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f8569a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e) {
                String str = f8567l;
                Log.w(str, "Unable to create temporary file and store bitmap! " + e);
            }
        }
        return null;
    }

    @TargetApi(23)
    /* renamed from: q */
    private void m11922q() {
        if (C3267a.m14071a(this.f8569a, "android.permission.CAMERA") == 0) {
            this.f8570b.mo9719f();
        } else if (!this.f8579k) {
            C0559a.m2638n(this.f8569a, new String[]{"android.permission.CAMERA"}, f8568m);
            this.f8579k = true;
        }
    }

    /* renamed from: r */
    public static Intent m11923r(C2665b bVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", bVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", bVar.mo9740a().toString());
        byte[] c = bVar.mo9742c();
        if (c != null && c.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c);
        }
        Map<C5382n, Object> d = bVar.mo9743d();
        if (d != null) {
            if (d.containsKey(C5382n.UPC_EAN_EXTENSION)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d.get(C5382n.UPC_EAN_EXTENSION).toString());
            }
            Number number = (Number) d.get(C5382n.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d.get(C5382n.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable<byte[]> iterable = (Iterable) d.get(C5382n.BYTE_SEGMENTS);
            if (iterable != null) {
                int i = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, putExtra);
                    i++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    /* renamed from: f */
    public void mo9780f() {
        this.f8570b.mo9716b(this.f8577i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo9781g() {
        if (!this.f8569a.isFinishing() && !this.f8573e) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f8569a);
            builder.setTitle(this.f8569a.getString(C5407j.zxing_app_name));
            builder.setMessage(this.f8569a.getString(C5407j.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(C5407j.zxing_button_ok, new C2680e());
            builder.setOnCancelListener(new C2681f());
            builder.show();
        }
    }

    /* renamed from: j */
    public void mo9782j(Intent intent, Bundle bundle) {
        this.f8569a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f8571c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                mo9783k();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f8570b.mo9717d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f8575g.mo15639d(false);
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f8576h.postDelayed(new C2679d(), intent.getLongExtra("TIMEOUT", 0));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f8572d = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo9783k() {
        if (this.f8571c == -1) {
            int rotation = this.f8569a.getWindowManager().getDefaultDisplay().getRotation();
            int i = this.f8569a.getResources().getConfiguration().orientation;
            int i2 = 0;
            if (i == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i2 = 8;
                }
            } else if (i == 1) {
                i2 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f8571c = i2;
        }
        this.f8569a.setRequestedOrientation(this.f8571c);
    }

    /* renamed from: l */
    public void mo9784l() {
        this.f8573e = true;
        this.f8574f.mo15643d();
    }

    /* renamed from: m */
    public void mo9785m() {
        this.f8570b.mo9718e();
        this.f8574f.mo15643d();
    }

    /* renamed from: n */
    public void mo9786n(int i, String[] strArr, int[] iArr) {
        if (i != f8568m) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            mo9781g();
        } else {
            this.f8570b.mo9719f();
        }
    }

    /* renamed from: o */
    public void mo9787o() {
        if (Build.VERSION.SDK_INT >= 23) {
            m11922q();
        } else {
            this.f8570b.mo9719f();
        }
        this.f8574f.mo15644h();
    }

    /* renamed from: p */
    public void mo9788p(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f8571c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo9789s(C2665b bVar) {
        this.f8569a.setResult(-1, m11923r(bVar, m11921i(bVar)));
        m11920h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9790t() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f8569a.setResult(0, intent);
        m11920h();
    }
}
