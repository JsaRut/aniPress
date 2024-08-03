package com.reactnativecommunity.asyncstorage;

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
    public static final String NAME = "RNC_AsyncSQLiteDBStorage";
    private final ExecutorC1601a executor;
    private C1613l mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$a */
    /* loaded from: classes.dex */
    public class ExecutorC1601a implements Executor {

        /* renamed from: a */
        private final ArrayDeque<Runnable> f6017a = new ArrayDeque<>();

        /* renamed from: b */
        private Runnable f6018b;

        /* renamed from: c */
        private final Executor f6019c;

        ExecutorC1601a(Executor executor) {
            this.f6019c = executor;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void m6717a() {
            Runnable poll = this.f6017a.poll();
            this.f6018b = poll;
            if (poll != null) {
                this.f6019c.execute(this.f6018b);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f6017a.offer(new RunnableC1610i(this, runnable));
            if (this.f6018b == null) {
                m6717a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new ExecutorC1601a(executor);
        this.mReactDatabaseSupplier = C1613l.m6734a(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m6739c();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new AsyncTaskC1608g(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.m6738b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new AsyncTaskC1609h(this, getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
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
            callback.invoke(C1603b.m6726b(null), null);
        } else {
            new AsyncTaskC1604c(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new AsyncTaskC1607f(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new AsyncTaskC1606e(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new AsyncTaskC1605d(this, getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }
}
