package p048d.p049a.p050a.p051a.p052c;

import academia.bracu.com.academia.common.activities.GalleryViewerActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import com.squareup.picasso.C2752e;
import com.squareup.picasso.C2776t;
import com.squareup.picasso.C2792x;
import java.util.ArrayList;
import java.util.HashMap;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.c.i */
public class C2812i extends BaseAdapter {

    /* renamed from: i */
    private static LayoutInflater f8995i = null;

    /* renamed from: f */
    private Activity f8996f;

    /* renamed from: g */
    private ArrayList<String> f8997g;

    /* renamed from: h */
    private ArrayList<String> f8998h;

    /* renamed from: d.a.a.a.c.i$a */
    class C2813a implements C2752e {
        C2813a(C2812i iVar) {
        }

        /* renamed from: a */
        public void mo10045a(Exception exc) {
            C6550a.m26771a("onError: ", new Object[0]);
        }

        /* renamed from: b */
        public void mo10046b() {
            C6550a.m26771a("onSuccess: ", new Object[0]);
        }
    }

    static {
        Class<C2812i> cls = C2812i.class;
    }

    public C2812i(Activity activity, HashMap hashMap) {
        this.f8996f = activity;
        this.f8997g = (ArrayList) hashMap.get("urlList");
        this.f8998h = (ArrayList) hashMap.get("titleList");
        f8995i = (LayoutInflater) this.f8996f.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public /* synthetic */ void mo10147a(int i, View view) {
        Intent intent = new Intent(this.f8996f, GalleryViewerActivity.class);
        intent.putStringArrayListExtra("urls", this.f8997g);
        intent.putStringArrayListExtra("titles", this.f8998h);
        intent.putExtra("position", i);
        intent.setFlags(131072);
        this.f8996f.startActivity(intent);
    }

    /* renamed from: b */
    public void mo10148b(HashMap hashMap) {
        this.f8997g = (ArrayList) hashMap.get("urlList");
        this.f8998h = (ArrayList) hashMap.get("titleList");
    }

    public int getCount() {
        return this.f8997g.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = f8995i.inflate(C2722R.layout.flickr_photo_list_item, (ViewGroup) null);
        }
        ((TextView) view.findViewById(C2722R.C2724id.text)).setText(this.f8998h.get(i));
        C2792x j = C2776t.m12224g().mo10099j(this.f8997g.get(i));
        j.mo10133f(C2722R.C2723drawable.ic_logo_white);
        j.mo10131c(C2722R.C2723drawable.ic_logo_white);
        j.mo10132e((ImageView) view.findViewById(C2722R.C2724id.image), new C2813a(this));
        view.setOnClickListener(new C2799b(this, i));
        return view;
    }
}
