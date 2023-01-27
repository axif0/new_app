package p048d.p049a.p050a.p051a.p065l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.HashMap;
import java.util.List;

/* renamed from: d.a.a.a.l.d */
public class C2984d extends BaseAdapter {

    /* renamed from: k */
    private static LayoutInflater f9527k;

    /* renamed from: f */
    private Activity f9528f;

    /* renamed from: g */
    private List f9529g;

    /* renamed from: h */
    private List f9530h;

    /* renamed from: i */
    private List f9531i;

    /* renamed from: j */
    public C2980c f9532j = new C2980c(this.f9528f.getApplicationContext());

    public C2984d(Activity activity, HashMap hashMap) {
        this.f9528f = activity;
        this.f9529g = (List) hashMap.get("urlList");
        this.f9530h = (List) hashMap.get("titleList");
        this.f9531i = (List) hashMap.get("idList");
        f9527k = (LayoutInflater) this.f9528f.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public /* synthetic */ void mo10309a(int i, View view) {
        this.f9528f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/" + this.f9531i.get(i).toString())));
    }

    public int getCount() {
        return this.f9529g.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = f9527k.inflate(C2722R.layout.feed_dsiplay_layout, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(C2722R.C2724id.title_feed);
        ImageView imageView = (ImageView) view.findViewById(C2722R.C2724id.thumbnail);
        String obj = this.f9530h.get(i).toString();
        if (obj.length() > 150) {
            String substring = obj.substring(0, 150);
            obj = substring.substring(0, substring.lastIndexOf(" ") + 1) + "...";
        }
        textView.setText(obj);
        this.f9532j.mo10306a(this.f9529g.get(i).toString(), imageView);
        view.setOnClickListener(new C2978a(this, i));
        return view;
    }
}
