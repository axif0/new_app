package p048d.p049a.p050a.p051a.p054e.p055a;

import academia.bracu.com.academia.common.fragments.C0096b0;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;
import java.util.List;
import p048d.p049a.p050a.p051a.p066m.C2987b;
import p086f.p111h.p112e.p113c.C3279f;

/* renamed from: d.a.a.a.e.a.e */
public class C2830e extends RecyclerView.C0832g<C2831a> {

    /* renamed from: h */
    private final List<C2987b> f9037h;

    /* renamed from: i */
    private final C0096b0.C0097a f9038i;

    /* renamed from: d.a.a.a.e.a.e$a */
    public static class C2831a extends RecyclerView.C0829d0 {

        /* renamed from: t */
        final View f9039t;

        /* renamed from: u */
        final TextView f9040u;

        /* renamed from: v */
        final ImageView f9041v;

        /* renamed from: w */
        C2987b f9042w;

        public C2831a(View view) {
            super(view);
            this.f9039t = view;
            this.f9040u = (TextView) view.findViewById(C2722R.C2724id.tv_item_title);
            this.f9041v = (ImageView) view.findViewById(C2722R.C2724id.imv_item_icon);
        }
    }

    public C2830e(List<C2987b> list, C0096b0.C0097a aVar) {
        this.f9037h = list;
        this.f9038i = aVar;
    }

    /* renamed from: B */
    public /* synthetic */ void mo10161B(C2831a aVar, View view) {
        C0096b0.C0097a aVar2 = this.f9038i;
        if (aVar2 != null) {
            aVar2.mo363i(aVar.f9042w.mo10324c());
        }
    }

    /* renamed from: C */
    public void mo3966q(C2831a aVar, int i) {
        aVar.f9042w = this.f9037h.get(i);
        aVar.f9040u.setText(this.f9037h.get(i).mo10325d());
        ImageView imageView = aVar.f9041v;
        imageView.setBackground(C3279f.m14126a(imageView.getContext().getResources(), this.f9037h.get(i).mo10323b(), (Resources.Theme) null));
        aVar.f9039t.setOnClickListener(new C2826c(this, aVar));
    }

    /* renamed from: D */
    public C2831a mo3967s(ViewGroup viewGroup, int i) {
        return new C2831a(LayoutInflater.from(viewGroup.getContext()).inflate(C2722R.layout.rv_miscellaneous_item_view, viewGroup, false));
    }

    /* renamed from: e */
    public int mo3963e() {
        List<C2987b> list = this.f9037h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
