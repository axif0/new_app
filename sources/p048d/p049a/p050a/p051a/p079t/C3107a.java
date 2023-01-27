package p048d.p049a.p050a.p051a.p079t;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.player.C2453b;
import com.google.android.youtube.player.C2458e;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.karumi.dexter.C2722R;
import java.util.HashMap;
import java.util.Map;
import p048d.p049a.p050a.p051a.p078s.C3105o;
import p048d.p049a.p050a.p051a.p079t.p080b.C3111c;
import p048d.p049a.p050a.p051a.p079t.p080b.C3112d;

/* renamed from: d.a.a.a.t.a */
public class C3107a extends BaseAdapter implements YouTubeThumbnailView.C2450a {

    /* renamed from: f */
    private Context f9883f;

    /* renamed from: g */
    private Map<View, C2458e> f9884g = new HashMap();

    /* renamed from: d.a.a.a.t.a$a */
    static class C3108a {

        /* renamed from: a */
        YouTubeThumbnailView f9885a;

        /* renamed from: b */
        TextView f9886b;

        /* renamed from: c */
        TextView f9887c;

        /* renamed from: d */
        TextView f9888d;

        C3108a() {
        }
    }

    public C3107a(Context context) {
        this.f9883f = context;
    }

    /* renamed from: a */
    public void mo9295a(YouTubeThumbnailView youTubeThumbnailView, C2453b bVar) {
        Toast.makeText(this.f9883f, bVar.toString(), 1).show();
    }

    /* renamed from: b */
    public void mo9296b(YouTubeThumbnailView youTubeThumbnailView, C2458e eVar) {
        this.f9884g.put(youTubeThumbnailView, eVar);
        eVar.mo9303a((String) youTubeThumbnailView.getTag());
    }

    public int getCount() {
        return C3111c.f9893a.size();
    }

    public Object getItem(int i) {
        return C3111c.f9893a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C3112d dVar = C3111c.f9893a.get(i);
        if (view == null) {
            View inflate = ((LayoutInflater) this.f9883f.getSystemService("layout_inflater")).inflate(C2722R.layout.gv_video_item, viewGroup, false);
            C3108a aVar = new C3108a();
            TextView textView = (TextView) inflate.findViewById(C2722R.C2724id.textView_title);
            aVar.f9886b = textView;
            textView.setText(dVar.mo10723b());
            aVar.f9887c = (TextView) inflate.findViewById(C2722R.C2724id.textviewDate);
            aVar.f9887c.setText(C3105o.m13340d(dVar.mo10729y(), "yyyy-dd-MM"));
            TextView textView2 = (TextView) inflate.findViewById(C2722R.C2724id.textViewViewCount);
            aVar.f9888d = textView2;
            textView2.setText(dVar.mo10728r());
            YouTubeThumbnailView youTubeThumbnailView = (YouTubeThumbnailView) inflate.findViewById(C2722R.C2724id.imageView_thumbnail);
            aVar.f9885a = youTubeThumbnailView;
            youTubeThumbnailView.setTag(dVar.mo10715U());
            aVar.f9885a.mo9293e(this.f9883f.getString(C2722R.string.DEVELOPER_KEY), this);
            inflate.setTag(aVar);
            return inflate;
        }
        C3108a aVar2 = (C3108a) view.getTag();
        C2458e eVar = this.f9884g.get(aVar2.f9885a);
        if (dVar == null) {
            return view;
        }
        aVar2.f9886b.setText(dVar.mo10723b());
        aVar2.f9885a.setImageBitmap((Bitmap) null);
        if (eVar == null) {
            aVar2.f9885a.setTag(dVar.mo10715U());
            return view;
        }
        try {
            eVar.mo9303a(dVar.mo10715U());
            return view;
        } catch (IllegalStateException unused) {
            this.f9884g.remove(aVar2.f9885a);
            aVar2.f9885a.mo9293e(this.f9883f.getString(C2722R.string.DEVELOPER_KEY), this);
            return view;
        }
    }
}
