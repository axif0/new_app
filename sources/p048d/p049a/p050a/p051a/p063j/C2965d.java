package p048d.p049a.p050a.p051a.p063j;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.p066m.C2987b;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: d.a.a.a.j.d */
public class C2965d extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public List<String> f9507b0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public List<C2987b> f9508c0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public Context f9509d0;

    /* renamed from: d.a.a.a.j.d$a */
    class C2966a implements AdapterView.OnItemClickListener {
        C2966a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C3101n.m13325t(C2965d.this.f9509d0, (String) C2965d.this.f9507b0.get(i));
        }
    }

    /* renamed from: d.a.a.a.j.d$b */
    private class C2967b extends ArrayAdapter<C2987b> {
        C2967b() {
            super(C2965d.this.f9509d0, C2722R.layout.item_social, C2965d.this.f9508c0);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                try {
                    view = C2965d.this.mo3143F().inflate(C2722R.layout.item_social_row, viewGroup, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            C2987b bVar = (C2987b) C2965d.this.f9508c0.get(i);
            ((TextView) view.findViewById(C2722R.C2724id.story)).setText(bVar.mo10325d());
            ((ImageView) view.findViewById(C2722R.C2724id.others)).setImageResource(bVar.mo10323b());
            return view;
        }
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.f9509d0 = mo3242y();
        try {
            view = layoutInflater.inflate(C2722R.layout.fragment_social_section, viewGroup, false);
            try {
                ((LinearLayout) view.findViewById(C2722R.C2724id.info)).setVisibility(0);
                TableLayout tableLayout = (TableLayout) view.findViewById(C2722R.C2724id.socialOthers);
                this.f9507b0.clear();
                this.f9507b0.add("https://www.facebook.com/BRACUniversity");
                this.f9507b0.add("https://www.youtube.com/bracuniversity");
                this.f9507b0.add("https://twitter.com/BRACUniversity");
                this.f9507b0.add("https://www.instagram.com/BRACUniversity");
                this.f9507b0.add("https://www.linkedin.com/school/58028");
                this.f9507b0.add("https://www.flickr.com/photos/bracuniversity");
                this.f9508c0.clear();
                this.f9508c0.add(new C2987b("Facebook", (int) C2722R.C2723drawable.ic_facebook, BuildConfig.FLAVOR));
                this.f9508c0.add(new C2987b("Youtube", (int) C2722R.C2723drawable.ic_youtube, BuildConfig.FLAVOR));
                this.f9508c0.add(new C2987b("Twitter", (int) C2722R.C2723drawable.ic_twitter, BuildConfig.FLAVOR));
                this.f9508c0.add(new C2987b("Instagram", (int) C2722R.C2723drawable.ic_instagram, BuildConfig.FLAVOR));
                this.f9508c0.add(new C2987b("Linkedin", (int) C2722R.C2723drawable.ic_linkedin, BuildConfig.FLAVOR));
                this.f9508c0.add(new C2987b("Flickr", (int) C2722R.C2723drawable.ic_flickr, BuildConfig.FLAVOR));
                C2967b bVar = new C2967b();
                ListView listView = (ListView) view.findViewById(C2722R.C2724id.title);
                listView.setAdapter(bVar);
                listView.setOnItemClickListener(new C2966a());
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            view = null;
            e.printStackTrace();
            return view;
        }
        return view;
    }
}
