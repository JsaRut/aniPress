package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.o */
/* loaded from: classes.dex */
public class C0297o {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ColorStateList m1686a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof InterfaceC0276F) {
            return ((InterfaceC0276F) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1687a(ImageView imageView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (imageView instanceof InterfaceC0276F) {
                ((InterfaceC0276F) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = imageView.getDrawable();
            boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
            if (drawable == null || !z) {
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1688a(ImageView imageView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (imageView instanceof InterfaceC0276F) {
                ((InterfaceC0276F) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        imageView.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = imageView.getDrawable();
            boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
            if (drawable == null || !z) {
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static PorterDuff.Mode m1689b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof InterfaceC0276F) {
            return ((InterfaceC0276F) imageView).getSupportImageTintMode();
        }
        return null;
    }
}
