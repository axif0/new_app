package p340io.realm;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import p340io.realm.SyncManager;
import p340io.realm.internal.Keep;
import p340io.realm.internal.Util;
import p340io.realm.log.RealmLog;

@Keep
/* renamed from: io.realm.ObjectServer */
class ObjectServer {
    ObjectServer() {
    }

    public static void init(Context context, String str) {
        String str2;
        String str3;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception unused) {
            str2 = "unknown";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("RealmJava/");
            sb.append("6.0.1");
            sb.append(" (");
            sb.append(Util.m23792e(Build.DEVICE) ? "unknown-device" : Build.DEVICE);
            sb.append(", ");
            sb.append(Util.m23792e(Build.MODEL) ? "unknown-model" : Build.MODEL);
            sb.append(", v");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(")");
            if (!Util.m23792e(str)) {
                sb.append(" ");
                sb.append(str);
            }
            str3 = sb.toString();
        } catch (Exception e) {
            RealmLog.m24088n("Constructing User-Agent description failed.", e);
            str3 = "Unknown";
        }
        if (SyncManager.C5620d.f16206b) {
            try {
                File createTempFile = File.createTempFile("remote_sync_", "_" + Process.myPid(), context.getFilesDir());
                if (!createTempFile.delete()) {
                    throw new IllegalStateException(String.format(Locale.US, "Temp file '%s' cannot be deleted.", new Object[]{createTempFile.getPath()}));
                } else if (createTempFile.mkdir()) {
                    SyncManager.nativeInitializeSyncManager(createTempFile.getPath(), str3);
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "Directory '%s' for SyncManager cannot be created. ", new Object[]{createTempFile.getPath()}));
                }
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            SyncManager.nativeInitializeSyncManager(context.getFilesDir().getPath(), str3);
        }
        SyncManager.init(str2, new RealmFileUserStore());
    }
}
