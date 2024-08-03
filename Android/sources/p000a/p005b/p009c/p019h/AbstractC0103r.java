package p000a.p005b.p009c.p019h;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.c.h.r */
/* loaded from: classes.dex */
public abstract class AbstractC0103r {

    /* renamed from: a */
    private final DataSetObservable f397a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f398b;

    /* renamed from: a */
    public float m474a(int i) {
        return 1.0f;
    }

    /* renamed from: a */
    public abstract int mo475a();

    /* renamed from: a */
    public int mo476a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public abstract Object mo477a(ViewGroup viewGroup, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m478a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f398b = dataSetObserver;
        }
    }

    /* renamed from: a */
    public void mo479a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void m480a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void m481a(View view, int i, Object obj) {
    }

    /* renamed from: a */
    public void mo482a(ViewGroup viewGroup) {
        m480a((View) viewGroup);
    }

    /* renamed from: a */
    public abstract void mo483a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a */
    public abstract boolean mo484a(View view, Object obj);

    /* renamed from: b */
    public void m485b() {
        synchronized (this) {
            if (this.f398b != null) {
                this.f398b.onChanged();
            }
        }
        this.f397a.notifyChanged();
    }

    @Deprecated
    /* renamed from: b */
    public void m486b(View view) {
    }

    /* renamed from: b */
    public void mo487b(ViewGroup viewGroup) {
        m486b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo488b(ViewGroup viewGroup, int i, Object obj) {
        m481a((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public Parcelable mo489c() {
        return null;
    }
}
