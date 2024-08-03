package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p005b.p009c.p010a.C0022a;

/* renamed from: android.support.v4.app.ea */
/* loaded from: classes.dex */
public final class C0198ea implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f753a = new ArrayList<>();

    /* renamed from: b */
    private final Context f754b;

    /* renamed from: android.support.v4.app.ea$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: d */
        Intent mo882d();
    }

    private C0198ea(Context context) {
        this.f754b = context;
    }

    /* renamed from: a */
    public static C0198ea m876a(Context context) {
        return new C0198ea(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C0198ea m877a(Activity activity) {
        Intent mo882d = activity instanceof a ? ((a) activity).mo882d() : null;
        if (mo882d == null) {
            mo882d = C0188Z.m838a(activity);
        }
        if (mo882d != null) {
            ComponentName component = mo882d.getComponent();
            if (component == null) {
                component = mo882d.resolveActivity(this.f754b.getPackageManager());
            }
            m878a(component);
            m879a(mo882d);
        }
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public C0198ea m878a(ComponentName componentName) {
        int size = this.f753a.size();
        try {
            Context context = this.f754b;
            while (true) {
                Intent m839a = C0188Z.m839a(context, componentName);
                if (m839a == null) {
                    return this;
                }
                this.f753a.add(size, m839a);
                context = this.f754b;
                componentName = m839a.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public C0198ea m879a(Intent intent) {
        this.f753a.add(intent);
        return this;
    }

    /* renamed from: a */
    public void m880a() {
        m881a((Bundle) null);
    }

    /* renamed from: a */
    public void m881a(Bundle bundle) {
        if (this.f753a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f753a;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0022a.m88a(this.f754b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f754b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f753a.iterator();
    }
}
