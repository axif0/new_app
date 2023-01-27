package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.e */
public class C0604e {
    /* renamed from: a */
    public static ColorStateList m2876a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof C0612l) {
            return ((C0612l) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2877b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof C0612l) {
            return ((C0612l) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m2878c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0612l) {
            ((C0612l) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m2879d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0612l) {
            ((C0612l) imageView).setSupportImageTintMode(mode);
        }
    }
}
