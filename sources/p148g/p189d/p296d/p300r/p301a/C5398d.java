package p148g.p189d.p296d.p300r.p301a;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import p148g.p189d.p296d.C5373e;

/* renamed from: g.d.d.r.a.d */
public final class C5398d {

    /* renamed from: a */
    private static final String f15623a = "d";

    static {
        Pattern.compile(",");
    }

    /* renamed from: a */
    public static Map<C5373e, Object> m22261a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5373e.class);
        for (C5373e eVar : C5373e.values()) {
            if (!(eVar == C5373e.CHARACTER_SET || eVar == C5373e.NEED_RESULT_POINT_CALLBACK || eVar == C5373e.POSSIBLE_FORMATS)) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.mo15595e().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.mo15595e().isInstance(obj)) {
                            Log.w(f15623a, "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put(eVar, obj);
                }
            }
        }
        Log.i(f15623a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
