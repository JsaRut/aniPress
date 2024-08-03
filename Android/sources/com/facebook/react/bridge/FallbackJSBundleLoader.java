package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import p139d.p143b.p148c.p153e.C1700a;

/* loaded from: classes.dex */
public final class FallbackJSBundleLoader extends JSBundleLoader {
    static final String RECOVERABLE = "facebook::react::Recoverable";
    static final String TAG = "FallbackJSBundleLoader";
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();
    private Stack<JSBundleLoader> mLoaders = new Stack<>();

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator<JSBundleLoader> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return this.mLoaders.peek();
        }
        RuntimeException runtimeException = new RuntimeException("No fallback options available");
        Iterator<Exception> it = this.mRecoveredErrors.iterator();
        Throwable th = runtimeException;
        while (it.hasNext()) {
            th.initCause(it.next());
            while (th.getCause() != null) {
                th = th.getCause();
            }
        }
        throw runtimeException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.JSBundleLoader
    public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(jSBundleLoaderDelegate);
            } catch (Exception e2) {
                if (e2.getMessage() == null || !e2.getMessage().startsWith(RECOVERABLE)) {
                    throw e2;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e2);
                C1700a.m7013c(TAG, "Falling back from recoverable error", e2);
            }
        }
        throw e2;
    }
}
