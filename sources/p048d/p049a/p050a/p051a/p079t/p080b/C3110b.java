package p048d.p049a.p050a.p051a.p079t.p080b;

import academia.bracu.com.academia.youtube.fragments.VideoListFragment;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p048d.p049a.p050a.p051a.p067n.p069b.C3003k;
import p048d.p049a.p050a.p051a.p067n.p070c.C3004a;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p079t.C3107a;
import p340io.realm.C5648d0;
import p340io.realm.C5781q;

/* renamed from: d.a.a.a.t.b.b */
public class C3110b extends AsyncTask<Void, Void, JSONArray> {

    /* renamed from: a */
    private Context f9890a;

    /* renamed from: b */
    private VideoListFragment f9891b;

    /* renamed from: c */
    private boolean f9892c = false;

    public C3110b(VideoListFragment videoListFragment, Context context) {
        this.f9890a = context;
        this.f9891b = videoListFragment;
        this.f9892c = true;
    }

    public C3110b(Context context) {
        this.f9890a = context;
    }

    /* renamed from: b */
    static /* synthetic */ void m13347b(C3112d dVar, C5648d0 d0Var) {
        C3112d dVar2 = (C3112d) d0Var.mo16272g0(dVar, new C5781q[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray doInBackground(Void... voidArr) {
        try {
            try {
                return new JSONObject(EntityUtils.toString(C3098k.m13276a().execute(new HttpGet("https://www.googleapis.com/youtube/v3/search?order=date&part=snippet&channelId=UC1TJvVzwhHGNZ0Rr7sGnpSA&maxResults=50&key=AIzaSyAOvXKnqlAVIzSZpmBxvFEerYusQYAPklE")).getEntity())).getJSONArray("items");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            C5648d0 a = C3003k.m12821c(this.f9890a).mo10355a();
            Number u = a.mo16277u0(C3004a.class).mo16168u("id");
            long intValue = u == null ? 1 : (long) (u.intValue() + 1);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONObject jSONObject2 = (JSONObject) jSONObject.get("snippet");
                    C3112d dVar = new C3112d();
                    dVar.mo10724b0(intValue);
                    dVar.mo10727e0(((JSONObject) jSONObject.get("id")).get("videoId").toString());
                    dVar.mo10725c0(jSONObject2.get("title").toString());
                    dVar.mo10722a0(jSONObject2.get("publishedAt").toString().substring(0, 10));
                    dVar.mo10726d0(BuildConfig.FLAVOR);
                    if (C3003k.m12821c(this.f9890a).mo10356b(intValue)) {
                        a.mo16275m0(new C3109a(dVar));
                        intValue++;
                    }
                    arrayList.add(dVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (arrayList.size() > 0) {
            C3111c.m13350a(arrayList);
        } else if (this.f9892c) {
            Context context = this.f9890a;
            Toast.makeText(context, context.getString(C2722R.string.no_data_found), 0).show();
        }
        if (this.f9892c) {
            this.f9891b.mo3625L1(new C3107a(this.f9890a));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
    }
}
