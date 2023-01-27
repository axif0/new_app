package academia.bracu.com.academia.common.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.GridView;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p048d.p049a.p050a.p051a.p052c.C2812i;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: academia.bracu.com.academia.common.fragments.x */
public class C0131x extends C2961b {

    /* renamed from: d0 */
    private C2971d f465d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f466e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public Activity f467f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public GridView f468g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2812i f469h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public boolean f470i0 = false;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public boolean f471j0 = false;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public int f472k0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public HashMap<String, ArrayList<String>> f473l0 = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public ArrayList<String> f474m0 = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public ArrayList<String> f475n0 = new ArrayList<>();

    /* renamed from: academia.bracu.com.academia.common.fragments.x$a */
    class C0132a implements AbsListView.OnScrollListener {
        C0132a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            int i4 = i + i2;
            if (C0131x.this.f471j0 && i3 != 0 && i4 == i3) {
                new C0133b(C0131x.this, (C0132a) null).execute(new Void[0]);
                boolean unused = C0131x.this.f471j0 = false;
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: academia.bracu.com.academia.common.fragments.x$b */
    private class C0133b extends AsyncTask<Void, Void, HashMap> {
        private C0133b() {
        }

        /* synthetic */ C0133b(C0131x xVar, C0132a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public HashMap doInBackground(Void... voidArr) {
            JSONArray jSONArray;
            try {
                String entityUtils = EntityUtils.toString(C3098k.m13276a().execute(new HttpGet("https://api.flickr.com/services/rest/?method=flickr.people.getPublicPhotos&api_key=bcc9eeeb5a596c207b3db005596d29d8&format=json&user_id=132942701@N08&page=" + (C0131x.this.f472k0 + 1))).getEntity());
                if (entityUtils != null && entityUtils.length() > 100) {
                    entityUtils = entityUtils.substring(14, entityUtils.length() - 1);
                }
                try {
                    jSONArray = new JSONObject(entityUtils).getJSONObject("photos").getJSONArray("photo");
                } catch (Exception e) {
                    e.printStackTrace();
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            ArrayList R1 = C0131x.this.f474m0;
                            R1.add("https://farm" + jSONObject.get("farm") + ".staticflickr.com/" + jSONObject.get("server") + "/" + jSONObject.get("id") + "_" + jSONObject.get("secret") + ".jpg");
                            C0131x.this.f475n0.add(jSONObject.get("title").toString());
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                C0131x.this.f473l0.put("urlList", C0131x.this.f474m0);
                C0131x.this.f473l0.put("titleList", C0131x.this.f475n0);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return C0131x.this.f473l0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(HashMap hashMap) {
            C0131x xVar;
            C0131x xVar2;
            C0131x.this.mo10294J1();
            if (hashMap != null) {
                try {
                    if (hashMap.size() > 0) {
                        if (!C0131x.this.f470i0) {
                            C2812i unused = C0131x.this.f469h0 = new C2812i(C0131x.this.f467f0, hashMap);
                            boolean unused2 = C0131x.this.f470i0 = true;
                            C0131x.this.f468g0.setAdapter(C0131x.this.f469h0);
                            xVar = C0131x.this;
                            xVar2 = C0131x.this;
                        } else {
                            if (C0131x.this.f469h0 != null) {
                                C0131x.this.f469h0.mo10148b(hashMap);
                                C0131x.this.f468g0.setAdapter(C0131x.this.f469h0);
                                C0131x.this.f468g0.setSelection(C0131x.this.f472k0 * 100);
                                xVar = C0131x.this;
                                xVar2 = C0131x.this;
                            }
                            boolean unused3 = C0131x.this.f471j0 = true;
                            return;
                        }
                        int unused4 = xVar.f472k0 = xVar2.f472k0 + 1;
                        boolean unused5 = C0131x.this.f471j0 = true;
                        return;
                    }
                } catch (Exception unused6) {
                    C3101n.m13303R(C0131x.this.f466e0);
                    return;
                }
            }
            C3101n.m13303R(C0131x.this.f466e0);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C0131x xVar = C0131x.this;
            xVar.mo10296L1(xVar.mo3169S(C2722R.string.loading_wait_message));
        }
    }

    /* renamed from: a2 */
    public static C0131x m478a2() {
        return new C0131x();
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f468g0 = (GridView) view.findViewById(C2722R.C2724id.gv_gallery);
        new C0133b(this, (C0132a) null).execute(new Void[0]);
        this.f468g0.setOnScrollListener(new C0132a());
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f465d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_photos));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_common_gallery, viewGroup, false);
        this.f466e0 = mo3242y();
        this.f467f0 = mo3215o();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f465d0 = null;
    }
}
