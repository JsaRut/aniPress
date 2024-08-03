package com.facebook.react.modules.storage;

import android.os.AsyncTask;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p139d.p143b.p208m.p214e.p215a.InterfaceC2075a;

@InterfaceC2073a(name = AsyncStorageModule.NAME)
/* loaded from: classes.dex */
public final class AsyncStorageModule extends ReactContextBaseJavaModule implements InterfaceC2075a {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final ExecutorC1243a executor;
    private C1253j mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$a */
    /* loaded from: classes.dex */
    public class ExecutorC1243a implements Executor {

        /* renamed from: a */
        private final ArrayDeque<Runnable> f4681a = new ArrayDeque<>();

        /* renamed from: b */
        private Runnable f4682b;

        /* renamed from: c */
        private final Executor f4683c;

        ExecutorC1243a(Executor executor) {
            this.f4683c = executor;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void m5443a() {
            Runnable poll = this.f4681a.poll();
            this.f4682b = poll;
            if (poll != null) {
                this.f4683c.execute(this.f4682b);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f4681a.offer(new RunnableC1252i(this, runnable));
            if (this.f4682b == null) {
                m5443a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new ExecutorC1243a(executor);
        this.mReactDatabaseSupplier = C1253j.m5460a(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m5465c();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new AsyncTaskC1250g(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.m5464b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new AsyncTaskC1251h(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(C1245b.m5452b(null), null);
        } else {
            new AsyncTaskC1246c(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new AsyncTaskC1249f(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C1245b.m5452b(null));
        } else {
            new AsyncTaskC1248e(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C1245b.m5452b(null));
        } else {
            new AsyncTaskC1247d(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }
}
