package p048d.p049a.p050a.p051a.p053d;

import academia.bracu.com.academia.boommenu.C0073q;
import academia.bracu.com.academia.boommenu.p002c.C0047k;
import com.karumi.dexter.C2722R;

/* renamed from: d.a.a.a.d.b */
public class C2823b {

    /* renamed from: a */
    private static int[] f9020a = {C2722R.C2723drawable.ic_announcement, C2722R.C2723drawable.ic_calendar, C2722R.C2723drawable.ic_news, C2722R.C2723drawable.ic_event, C2722R.C2723drawable.ic_admission, C2722R.C2723drawable.ic_library, C2722R.C2723drawable.ic_social_media, C2722R.C2723drawable.ic_location, C2722R.C2723drawable.ic_contact};

    /* renamed from: b */
    private static int f9021b = 0;

    /* renamed from: a */
    private static int m12324a() {
        if (f9021b >= f9020a.length) {
            f9021b = 0;
        }
        int[] iArr = f9020a;
        int i = f9021b;
        f9021b = i + 1;
        return iArr[i];
    }

    /* renamed from: b */
    public static C0047k.C0049b m12325b(int i) {
        C0047k.C0049b bVar = new C0047k.C0049b();
        bVar.mo269o(false);
        bVar.mo253j(C0073q.m291b(10.0f));
        C0047k.C0049b bVar2 = bVar;
        bVar2.mo267m(C0073q.m291b(10.0f));
        bVar2.mo252i(C2722R.color.colorRegularIcon);
        C0047k.C0049b bVar3 = bVar2;
        bVar3.mo248e(i);
        C0047k.C0049b bVar4 = bVar3;
        bVar4.mo249f(m12324a());
        return bVar4;
    }
}
