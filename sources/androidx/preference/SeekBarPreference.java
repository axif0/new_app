package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {

    /* renamed from: U */
    int f3081U;

    /* renamed from: V */
    int f3082V;

    /* renamed from: W */
    private int f3083W;

    /* renamed from: X */
    private int f3084X;

    /* renamed from: Y */
    boolean f3085Y;

    /* renamed from: Z */
    SeekBar f3086Z;

    /* renamed from: a0 */
    private TextView f3087a0;

    /* renamed from: b0 */
    boolean f3088b0;

    /* renamed from: c0 */
    private boolean f3089c0;

    /* renamed from: d0 */
    boolean f3090d0;

    /* renamed from: e0 */
    private SeekBar.OnSeekBarChangeListener f3091e0;

    /* renamed from: f0 */
    private View.OnKeyListener f3092f0;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C0769a implements SeekBar.OnSeekBarChangeListener {
        C0769a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f3090d0 || !seekBarPreference.f3085Y) {
                    SeekBarPreference.this.mo3886N0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo3887O0(i + seekBarPreference2.f3082V);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3085Y = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3085Y = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f3082V != seekBarPreference.f3081U) {
                seekBarPreference.mo3886N0(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C0770b implements View.OnKeyListener {
        C0770b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if ((!SeekBarPreference.this.f3088b0 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = SeekBarPreference.this.f3086Z;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$c */
    private static class C0771c extends Preference.C0759b {
        public static final Parcelable.Creator<C0771c> CREATOR = new C0772a();

        /* renamed from: f */
        int f3095f;

        /* renamed from: g */
        int f3096g;

        /* renamed from: h */
        int f3097h;

        /* renamed from: androidx.preference.SeekBarPreference$c$a */
        static class C0772a implements Parcelable.Creator<C0771c> {
            C0772a() {
            }

            /* renamed from: a */
            public C0771c createFromParcel(Parcel parcel) {
                return new C0771c(parcel);
            }

            /* renamed from: b */
            public C0771c[] newArray(int i) {
                return new C0771c[i];
            }
        }

        C0771c(Parcel parcel) {
            super(parcel);
            this.f3095f = parcel.readInt();
            this.f3096g = parcel.readInt();
            this.f3097h = parcel.readInt();
        }

        C0771c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3095f);
            parcel.writeInt(this.f3096g);
            parcel.writeInt(this.f3097h);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m.seekBarPreferenceStyle);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3091e0 = new C0769a();
        this.f3092f0 = new C0770b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.SeekBarPreference, i, i2);
        this.f3082V = obtainStyledAttributes.getInt(C0813t.SeekBarPreference_min, 0);
        mo3883J0(obtainStyledAttributes.getInt(C0813t.SeekBarPreference_android_max, 100));
        mo3884K0(obtainStyledAttributes.getInt(C0813t.SeekBarPreference_seekBarIncrement, 0));
        this.f3088b0 = obtainStyledAttributes.getBoolean(C0813t.SeekBarPreference_adjustable, true);
        this.f3089c0 = obtainStyledAttributes.getBoolean(C0813t.SeekBarPreference_showSeekBarValue, false);
        this.f3090d0 = obtainStyledAttributes.getBoolean(C0813t.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: M0 */
    private void m3862M0(int i, boolean z) {
        int i2 = this.f3082V;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f3083W;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f3081U) {
            this.f3081U = i;
            mo3887O0(i);
            mo3827k0(i);
            if (z) {
                mo3746Q();
            }
        }
    }

    /* renamed from: J0 */
    public final void mo3883J0(int i) {
        int i2 = this.f3082V;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f3083W) {
            this.f3083W = i;
            mo3746Q();
        }
    }

    /* renamed from: K0 */
    public final void mo3884K0(int i) {
        if (i != this.f3084X) {
            this.f3084X = Math.min(this.f3083W - this.f3082V, Math.abs(i));
            mo3746Q();
        }
    }

    /* renamed from: L0 */
    public void mo3885L0(int i) {
        m3862M0(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo3886N0(SeekBar seekBar) {
        int progress = this.f3082V + seekBar.getProgress();
        if (progress == this.f3081U) {
            return;
        }
        if (mo3819g(Integer.valueOf(progress))) {
            m3862M0(progress, false);
            return;
        }
        seekBar.setProgress(this.f3081U - this.f3082V);
        mo3887O0(this.f3081U);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3887O0(int i) {
        TextView textView = this.f3087a0;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        super.mo3735W(lVar);
        lVar.f3359a.setOnKeyListener(this.f3092f0);
        this.f3086Z = (SeekBar) lVar.mo4005M(C0809p.seekbar);
        TextView textView = (TextView) lVar.mo4005M(C0809p.seekbar_value);
        this.f3087a0 = textView;
        if (this.f3089c0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f3087a0 = null;
        }
        SeekBar seekBar = this.f3086Z;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f3091e0);
        this.f3086Z.setMax(this.f3083W - this.f3082V);
        int i = this.f3084X;
        if (i != 0) {
            this.f3086Z.setKeyProgressIncrement(i);
        } else {
            this.f3084X = this.f3086Z.getKeyProgressIncrement();
        }
        this.f3086Z.setProgress(this.f3081U - this.f3082V);
        mo3887O0(this.f3081U);
        this.f3086Z.setEnabled(mo3804M());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Object mo3755a0(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo3756d0(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0771c.class)) {
            super.mo3756d0(parcelable);
            return;
        }
        C0771c cVar = (C0771c) parcelable;
        super.mo3756d0(cVar.getSuperState());
        this.f3081U = cVar.f3095f;
        this.f3082V = cVar.f3096g;
        this.f3083W = cVar.f3097h;
        mo3746Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Parcelable mo3757e0() {
        Parcelable e0 = super.mo3757e0();
        if (mo3805N()) {
            return e0;
        }
        C0771c cVar = new C0771c(e0);
        cVar.f3095f = this.f3081U;
        cVar.f3096g = this.f3082V;
        cVar.f3097h = this.f3083W;
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo3758f0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        mo3885L0(mo3852z(((Integer) obj).intValue()));
    }
}
