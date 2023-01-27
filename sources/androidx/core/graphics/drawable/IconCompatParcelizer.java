package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C0936a;

public class IconCompatParcelizer {
    public static IconCompat read(C0936a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2433a = aVar.mo4915p(iconCompat.f2433a, 1);
        iconCompat.f2435c = aVar.mo4909j(iconCompat.f2435c, 2);
        iconCompat.f2436d = aVar.mo4917r(iconCompat.f2436d, 3);
        iconCompat.f2437e = aVar.mo4915p(iconCompat.f2437e, 4);
        iconCompat.f2438f = aVar.mo4915p(iconCompat.f2438f, 5);
        iconCompat.f2439g = (ColorStateList) aVar.mo4917r(iconCompat.f2439g, 6);
        iconCompat.f2441i = aVar.mo4919t(iconCompat.f2441i, 7);
        iconCompat.mo2882l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0936a aVar) {
        aVar.mo4923x(true, true);
        iconCompat.mo2883m(aVar.mo4905f());
        int i = iconCompat.f2433a;
        if (-1 != i) {
            aVar.mo4895F(i, 1);
        }
        byte[] bArr = iconCompat.f2435c;
        if (bArr != null) {
            aVar.mo4891B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2436d;
        if (parcelable != null) {
            aVar.mo4897H(parcelable, 3);
        }
        int i2 = iconCompat.f2437e;
        if (i2 != 0) {
            aVar.mo4895F(i2, 4);
        }
        int i3 = iconCompat.f2438f;
        if (i3 != 0) {
            aVar.mo4895F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2439g;
        if (colorStateList != null) {
            aVar.mo4897H(colorStateList, 6);
        }
        String str = iconCompat.f2441i;
        if (str != null) {
            aVar.mo4899J(str, 7);
        }
    }
}
