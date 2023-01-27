package p086f.p111h.p118i;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* renamed from: f.h.i.b */
public final class C3309b {
    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, cls, Integer.TYPE});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, cls, Integer.TYPE});
                Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, cls, Integer.TYPE});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m14261a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m14262b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
