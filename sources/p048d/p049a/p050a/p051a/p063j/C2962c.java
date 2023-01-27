package p048d.p049a.p050a.p051a.p063j;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.karumi.dexter.C2722R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p048d.p049a.p050a.p051a.p065l.C2984d;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p048d.p049a.p050a.p051a.p078s.C3105o;

/* renamed from: d.a.a.a.j.c */
public class C2962c extends C2961b {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public ListView f9504d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Context f9505e0;

    /* renamed from: d.a.a.a.j.c$b */
    private class C2964b extends AsyncTask<Void, Void, HashMap> {
        private C2964b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public HashMap doInBackground(Void... voidArr) {
            JSONArray jSONArray;
            String str;
            Object obj;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("https://graph.facebook.com/BRACUniversity/feed?access_token=");
                sb.append(URLEncoder.encode("1826150770971342|mwrSl53T_bdLBOU1fNAUjAFyqY8", "UTF-8"));
                sb.append("&fields=message,link,story,created_time,description,picture,id&limit=50&offset=");
                sb.append(0);
                try {
                    jSONArray = new JSONObject(EntityUtils.toString(C3098k.m13276a().execute(new HttpGet(sb.toString())).getEntity())).getJSONArray("data");
                } catch (Exception unused) {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            new HashMap();
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject.has("message")) {
                                obj = jSONObject.get("message");
                            } else if (jSONObject.has("story")) {
                                obj = jSONObject.get("story");
                            } else {
                                str = null;
                                arrayList.add(jSONObject.get("picture").toString());
                                arrayList2.add(str);
                                arrayList3.add(jSONObject.get("id").toString());
                            }
                            str = obj.toString();
                            arrayList.add(jSONObject.get("picture").toString());
                            arrayList2.add(str);
                            arrayList3.add(jSONObject.get("id").toString());
                        } catch (Exception unused2) {
                        }
                    }
                }
                hashMap.put("urlList", arrayList);
                hashMap.put("titleList", arrayList2);
                hashMap.put("idList", arrayList3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return hashMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(HashMap hashMap) {
            C2962c.this.mo10294J1();
            if (hashMap != null) {
                try {
                    if (hashMap.size() > 0) {
                        C2962c.this.f9504d0.setAdapter(new C2984d(C2962c.this.mo3215o(), hashMap));
                        return;
                    }
                } catch (Exception unused) {
                    C3105o.m13341e(C2962c.this.mo3215o());
                    return;
                }
            }
            C3101n.m13302Q(C2962c.this.f9505e0);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C2962c cVar = C2962c.this;
            cVar.mo10296L1(cVar.mo3169S(C2722R.string.loading_wait_message));
        }
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_social_section, viewGroup, false);
        this.f9505e0 = mo3242y();
        try {
            ((LinearLayout) inflate.findViewById(C2722R.C2724id.info)).setVisibility(0);
            this.f9504d0 = (ListView) inflate.findViewById(C2722R.C2724id.title);
            if (C3101n.m13328w(this.f9505e0)) {
                new C2964b().execute(new Void[0]);
            } else {
                Toast.makeText(mo3215o(), mo3169S(C2722R.string.cannot_connect_please_check_your_connection), 1).show();
            }
            return inflate;
        } catch (Exception e) {
            e.printStackTrace();
            return inflate;
        }
    }

    /* renamed from: u0 */
    public void mo3232u0() {
        this.f9504d0.setAdapter((ListAdapter) null);
        super.mo3232u0();
    }
}
