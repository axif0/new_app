package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1572b;
import p148g.p189d.p190a.p232c.p237d.C4366b;
import p148g.p189d.p190a.p232c.p237d.C4372e;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    private int f5305f = 0;

    /* renamed from: a */
    public static PendingIntent m7495a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m7496b(context, pendingIntent, i, true), 134217728);
    }

    /* renamed from: b */
    public static Intent m7496b(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5305f = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1572b d = C1572b.m7553d(this);
                if (i2 == -1) {
                    d.mo6379q();
                } else if (i2 == 0) {
                    d.mo6376b(new C4366b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f5305f = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5305f = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5305f = bundle.getInt("resolution");
        }
        if (this.f5305f != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.f5305f = 1;
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    }
                } else {
                    C4372e.m18564m().mo13703n(this, num.intValue(), 2, this);
                    this.f5305f = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5305f);
        super.onSaveInstanceState(bundle);
    }
}
