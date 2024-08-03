package p139d.p225c.p226a.p227a.p250j.p257e.p258a;

import android.net.Uri;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.e.a.c */
/* loaded from: classes.dex */
public final class C2491c {
    /* renamed from: a */
    public static Uri m10414a(Uri uri) {
        return C2622I.m11098j(uri.getLastPathSegment()).matches("manifest(\\(.+\\))?") ? uri : Uri.withAppendedPath(uri, "Manifest");
    }
}
