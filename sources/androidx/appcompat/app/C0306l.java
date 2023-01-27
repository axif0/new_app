package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.l */
class C0306l {

    /* renamed from: a */
    private static Field f1020a;

    /* renamed from: b */
    private static boolean f1021b;

    /* renamed from: c */
    private static Class<?> f1022c;

    /* renamed from: d */
    private static boolean f1023d;

    /* renamed from: e */
    private static Field f1024e;

    /* renamed from: f */
    private static boolean f1025f;

    /* renamed from: g */
    private static Field f1026g;

    /* renamed from: h */
    private static boolean f1027h;

    /* renamed from: a */
    static void m1225a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1228d(resources);
            } else if (i >= 23) {
                m1227c(resources);
            } else if (i >= 21) {
                m1226b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m1226b(Resources resources) {
        if (!f1021b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1020a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1021b = true;
        }
        Field field = f1020a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m1227c(Resources resources) {
        if (!f1021b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1020a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1021b = true;
        }
        Object obj = null;
        Field field = f1020a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m1229e(obj);
        }
    }

    /* renamed from: d */
    private static void m1228d(Resources resources) {
        Object obj;
        if (!f1027h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1026g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1027h = true;
        }
        Field field = f1026g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f1021b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f1020a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f1021b = true;
                }
                Field field2 = f1020a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m1229e(obj2);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m1229e(Object obj) {
        if (!f1023d) {
            try {
                f1022c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1023d = true;
        }
        Class<?> cls = f1022c;
        if (cls != null) {
            if (!f1025f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f1024e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f1025f = true;
            }
            Field field = f1024e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
