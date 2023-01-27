package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.l0 */
class C0456l0 extends Resources {

    /* renamed from: a */
    private final Resources f1775a;

    public C0456l0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1775a = resources;
    }

    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return this.f1775a.getAnimation(i);
    }

    public boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.f1775a.getBoolean(i);
    }

    public int getColor(int i) throws Resources.NotFoundException {
        return this.f1775a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return this.f1775a.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.f1775a.getConfiguration();
    }

    public float getDimension(int i) throws Resources.NotFoundException {
        return this.f1775a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.f1775a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.f1775a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1775a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.f1775a.getDrawable(i);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f1775a.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return this.f1775a.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f1775a.getDrawableForDensity(i, i2, theme);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f1775a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1775a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) throws Resources.NotFoundException {
        return this.f1775a.getIntArray(i);
    }

    public int getInteger(int i) throws Resources.NotFoundException {
        return this.f1775a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return this.f1775a.getLayout(i);
    }

    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.f1775a.getMovie(i);
    }

    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return this.f1775a.getQuantityString(i, i2);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.f1775a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return this.f1775a.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.f1775a.getResourceEntryName(i);
    }

    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.f1775a.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.f1775a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.f1775a.getResourceTypeName(i);
    }

    public String getString(int i) throws Resources.NotFoundException {
        return this.f1775a.getString(i);
    }

    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return this.f1775a.getString(i, objArr);
    }

    public String[] getStringArray(int i) throws Resources.NotFoundException {
        return this.f1775a.getStringArray(i);
    }

    public CharSequence getText(int i) throws Resources.NotFoundException {
        return this.f1775a.getText(i);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f1775a.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return this.f1775a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f1775a.getValue(i, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f1775a.getValue(str, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f1775a.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return this.f1775a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1775a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return this.f1775a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        return this.f1775a.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1775a.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.f1775a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1775a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1775a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1775a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
