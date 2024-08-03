package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    static final PorterDuff.Mode f943a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f944b;

    /* renamed from: c */
    Object f945c;

    /* renamed from: d */
    public byte[] f946d;

    /* renamed from: e */
    public Parcelable f947e;

    /* renamed from: f */
    public int f948f;

    /* renamed from: g */
    public int f949g;

    /* renamed from: h */
    public ColorStateList f950h = null;

    /* renamed from: i */
    PorterDuff.Mode f951i = f943a;

    /* renamed from: j */
    public String f952j;

    /* renamed from: a */
    private static int m1186a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    /* renamed from: a */
    private static String m1187a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: b */
    private static String m1188b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    /* renamed from: a */
    public int m1189a() {
        if (this.f944b == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1186a((Icon) this.f945c);
        }
        if (this.f944b == 2) {
            return this.f948f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m1190a(boolean z) {
        byte[] byteArray;
        String str;
        this.f952j = this.f951i.name();
        int i = this.f944b;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.f945c;
                } else if (i == 3) {
                    byteArray = (byte[]) this.f945c;
                    this.f946d = byteArray;
                    return;
                } else if (i == 4) {
                    str = this.f945c.toString();
                } else if (i != 5) {
                    return;
                }
                byteArray = str.getBytes(Charset.forName("UTF-16"));
                this.f946d = byteArray;
                return;
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f945c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                this.f946d = byteArray;
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.f947e = (Parcelable) this.f945c;
    }

    /* renamed from: b */
    public String m1191b() {
        if (this.f944b == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1188b((Icon) this.f945c);
        }
        if (this.f944b == 2) {
            return ((String) this.f945c).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    public void m1192c() {
        Object obj;
        this.f951i = PorterDuff.Mode.valueOf(this.f952j);
        int i = this.f944b;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        obj = this.f946d;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                obj = new String(this.f946d, Charset.forName("UTF-16"));
            }
            obj = this.f947e;
            if (obj == null) {
                byte[] bArr = this.f946d;
                this.f945c = bArr;
                this.f944b = 3;
                this.f948f = 0;
                this.f949g = bArr.length;
                return;
            }
        } else {
            obj = this.f947e;
            if (obj == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f945c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:            if (r1 != 5) goto L24;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f944b
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r0 = r4.f945c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f944b
            java.lang.String r1 = m1187a(r1)
            r0.append(r1)
            int r1 = r4.f944b
            r2 = 1
            if (r1 == r2) goto L77
            r3 = 2
            if (r1 == r3) goto L4f
            r2 = 3
            if (r1 == r2) goto L39
            r2 = 4
            if (r1 == r2) goto L2e
            r2 = 5
            if (r1 == r2) goto L77
            goto L97
        L2e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f945c
            r0.append(r1)
            goto L97
        L39:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f948f
            r0.append(r1)
            int r1 = r4.f949g
            if (r1 == 0) goto L97
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f949g
            goto L94
        L4f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.m1191b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.m1189a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L97
        L77:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f945c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f945c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L94:
            r0.append(r1)
        L97:
            android.content.res.ColorStateList r1 = r4.f950h
            if (r1 == 0) goto La5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f950h
            r0.append(r1)
        La5:
            android.graphics.PorterDuff$Mode r1 = r4.f951i
            android.graphics.PorterDuff$Mode r2 = android.support.v4.graphics.drawable.IconCompat.f943a
            if (r1 == r2) goto Lb5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f951i
            r0.append(r1)
        Lb5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
