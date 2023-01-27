package academia.bracu.com.academia.boommenu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import p086f.p111h.p112e.p113c.C3279f;

/* renamed from: academia.bracu.com.academia.boommenu.q */
public class C0073q {

    /* renamed from: a */
    private static final int[] f357a = {Color.parseColor("#F44336"), Color.parseColor("#E91E63"), Color.parseColor("#9C27B0"), Color.parseColor("#673AB7"), Color.parseColor("#3F51B5"), Color.parseColor("#2196F3"), Color.parseColor("#03A9F4"), Color.parseColor("#00BCD4"), Color.parseColor("#009688"), Color.parseColor("#4CAF50"), Color.parseColor("#009688"), Color.parseColor("#CDDC39"), Color.parseColor("#FFEB3B"), Color.parseColor("#FF9800"), Color.parseColor("#FF5722"), Color.parseColor("#795548"), Color.parseColor("#9E9E9E"), Color.parseColor("#607D8B")};

    /* renamed from: b */
    private static final ArrayList<Integer> f358b = new ArrayList<>();

    /* renamed from: A */
    public static void m286A(ImageView imageView, int i, Drawable drawable) {
        if (imageView != null) {
            if (i != 0) {
                imageView.setImageResource(i);
            } else if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: B */
    public static void m287B(TextView textView, int i, String str) {
        if (textView != null) {
            if (i == 0) {
                if (str != null && !str.contentEquals(textView.getText())) {
                    textView.setText(str);
                }
            } else if (!textView.getContext().getResources().getText(i).equals(textView.getText())) {
                textView.setText(i);
            }
        }
    }

    /* renamed from: C */
    public static void m288C(TextView textView, int i, int i2) {
        if (textView != null) {
            if (i == 0) {
                textView.setTextColor(i2);
            } else {
                textView.setTextColor(m294e(textView.getContext(), i));
            }
        }
    }

    /* renamed from: D */
    static void m289D(int i, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public static float m290a(Point point, Point point2) {
        int i = point.x;
        int i2 = point2.x;
        int i3 = point.y;
        int i4 = point2.y;
        return (float) Math.sqrt((double) (((i - i2) * (i - i2)) + ((i3 - i4) * (i3 - i4))));
    }

    /* renamed from: b */
    public static int m291b(float f) {
        return Math.round(f * (((float) Resources.getSystem().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: c */
    static boolean m292c(TypedArray typedArray, int i, int i2) {
        return typedArray.getBoolean(i, typedArray.getResources().getBoolean(i2));
    }

    /* renamed from: d */
    public static int m293d() {
        int nextInt;
        Random random = new Random();
        do {
            nextInt = random.nextInt(f357a.length);
        } while (f358b.contains(Integer.valueOf(nextInt)));
        f358b.add(Integer.valueOf(nextInt));
        while (f358b.size() > 6) {
            f358b.remove(0);
        }
        return f357a[nextInt];
    }

    /* renamed from: e */
    public static int m294e(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        return i2 >= 23 ? resources.getColor(i, (Resources.Theme) null) : resources.getColor(i);
    }

    /* renamed from: f */
    public static int m295f(Context context, int i, int i2) {
        return i == 0 ? i2 : m294e(context, i);
    }

    /* renamed from: g */
    public static int m296g(TypedArray typedArray, int i) {
        return m298i(typedArray, i, (Resources.Theme) null);
    }

    /* renamed from: h */
    public static int m297h(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, m296g(typedArray, i2));
    }

    /* renamed from: i */
    public static int m298i(TypedArray typedArray, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        Resources resources = typedArray.getResources();
        return i2 >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    /* renamed from: j */
    static int m299j(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.9f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: k */
    static int m300k(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, typedArray.getResources().getDimensionPixelOffset(i2));
    }

    /* renamed from: l */
    static int m301l(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelSize(i, typedArray.getResources().getDimensionPixelSize(i2));
    }

    /* renamed from: m */
    public static Drawable m302m(View view, int i) {
        return C3279f.m14126a(view.getResources(), i, (Resources.Theme) null);
    }

    /* renamed from: n */
    public static Drawable m303n(View view, int i, Resources.Theme theme) {
        return C3279f.m14126a(view.getResources(), i, theme);
    }

    /* renamed from: o */
    static int m304o(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getResources().getInteger(i2));
    }

    /* renamed from: p */
    static int m305p(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 1.1f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: q */
    private static BitmapDrawable m306q(View view, int i, int i2) {
        if (i <= 0) {
            return null;
        }
        int i3 = i * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i2);
        float f = (float) i;
        canvas.drawCircle(f, f, f, paint);
        return new BitmapDrawable(view.getResources(), createBitmap);
    }

    /* renamed from: r */
    public static GradientDrawable m307r(View view, int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) m302m(view, C0068l.shape_oval_normal);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: s */
    public static StateListDrawable m308s(View view, int i, int i2, int i3, int i4) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, m306q(view, i, i3));
        stateListDrawable.addState(new int[]{-16842910}, m306q(view, i, i4));
        stateListDrawable.addState(StateSet.WILD_CARD, m306q(view, i, i2));
        return stateListDrawable;
    }

    /* renamed from: t */
    private static BitmapDrawable m309t(View view, int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i4);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        float f = (float) i3;
        canvas.drawRoundRect(rectF, f, f, paint);
        return new BitmapDrawable(view.getResources(), createBitmap);
    }

    /* renamed from: u */
    public static GradientDrawable m310u(View view, int i, int i2) {
        GradientDrawable gradientDrawable = (GradientDrawable) m302m(view, C0068l.shape_rectangle_normal);
        gradientDrawable.setCornerRadius((float) i);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    /* renamed from: v */
    public static StateListDrawable m311v(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, m309t(view, i, i2, i3, i5));
        stateListDrawable.addState(new int[]{-16842910}, m309t(view, i, i2, i3, i6));
        stateListDrawable.addState(StateSet.WILD_CARD, m309t(view, i, i2, i3, i4));
        return stateListDrawable;
    }

    /* renamed from: w */
    static Drawable m312w(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: x */
    public static boolean m313x(PointF pointF, View view) {
        float f = pointF.x;
        if (((float) view.getLeft()) <= f && f <= ((float) view.getRight())) {
            float f2 = pointF.y;
            return ((float) view.getTop()) <= f2 && f2 <= ((float) view.getBottom());
        }
    }

    /* renamed from: y */
    static Activity m314y(Context context) {
        if (context == null) {
            Log.w("BoomMenuButton", "scanForActivity: context is null!");
            return null;
        } else if (context instanceof Activity) {
            return (Activity) context;
        } else {
            if (context instanceof ContextWrapper) {
                return m314y(((ContextWrapper) context).getBaseContext());
            }
            Log.w("BoomMenuButton", "scanForActivity: context is null!");
            return null;
        }
    }

    /* renamed from: z */
    public static void m315z(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
