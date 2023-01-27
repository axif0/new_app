package academia.bracu.com.academia.common.activities;

import academia.bracu.com.academia.mediaslider.C0165d;
import android.os.Bundle;

public class GalleryViewerActivity extends C0165d {
    static {
        Class<GalleryViewerActivity> cls = GalleryViewerActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo504c0(getIntent().getStringArrayListExtra("titles"), getIntent().getStringArrayListExtra("urls"), "image", true, true, false, "Image-Slider", "#000000", (String) null, getIntent().getIntExtra("position", 0));
    }
}
