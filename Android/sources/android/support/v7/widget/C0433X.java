package android.support.v7.widget;

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
import java.io.InputStream;

/* renamed from: android.support.v7.widget.X */
/* loaded from: classes.dex */
class C0433X extends Resources {

    /* renamed from: a */
    private final Resources f2292a;

    public C0433X(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2292a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        return this.f2292a.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.f2292a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        return this.f2292a.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        return this.f2292a.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f2292a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.f2292a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.f2292a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.f2292a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f2292a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        return this.f2292a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.f2292a.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        return this.f2292a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f2292a.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.f2292a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f2292a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        return this.f2292a.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.f2292a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        return this.f2292a.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        return this.f2292a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return this.f2292a.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f2292a.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return this.f2292a.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        return this.f2292a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        return this.f2292a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        return this.f2292a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        return this.f2292a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        return this.f2292a.getString(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        return this.f2292a.getString(i, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return this.f2292a.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        return this.f2292a.getText(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f2292a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return this.f2292a.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f2292a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f2292a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f2292a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        return this.f2292a.getXml(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f2292a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        return this.f2292a.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        return this.f2292a.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f2292a.openRawResource(i, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f2292a.openRawResourceFd(i);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f2292a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f2292a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f2292a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
