package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p143b.p204k.p205a.C2038a;

/* loaded from: classes.dex */
public class ReactContext extends ContextWrapper {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners;
    private CatalystInstance mCatalystInstance;
    private WeakReference<Activity> mCurrentActivity;
    private LayoutInflater mInflater;
    private MessageQueueThread mJSMessageQueueThread;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners;
    private LifecycleState mLifecycleState;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private MessageQueueThread mUiMessageQueueThread;

    /* renamed from: com.facebook.react.bridge.ReactContext$1 */
    /* loaded from: classes.dex */
    public class RunnableC10881 implements Runnable {
        final /* synthetic */ LifecycleEventListener val$listener;

        RunnableC10881(LifecycleEventListener lifecycleEventListener) {
            r2 = lifecycleEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ReactContext.this.mLifecycleEventListeners.contains(r2)) {
                try {
                    r2.onHostResume();
                } catch (RuntimeException e2) {
                    ReactContext.this.handleException(e2);
                }
            }
        }
    }

    /* renamed from: com.facebook.react.bridge.ReactContext$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10892 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState = new int[LifecycleState.values().length];

        static {
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactContext(Context context) {
        super(context);
        this.mLifecycleEventListeners = new CopyOnWriteArraySet<>();
        this.mActivityEventListeners = new CopyOnWriteArraySet<>();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        int i;
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (!hasActiveCatalystInstance() || (i = C10892.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()]) == 1 || i == 2) {
            return;
        }
        if (i != 3) {
            throw new RuntimeException("Unhandled lifecycle state.");
        }
        runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.bridge.ReactContext.1
            final /* synthetic */ LifecycleEventListener val$listener;

            RunnableC10881(LifecycleEventListener lifecycleEventListener2) {
                r2 = lifecycleEventListener2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ReactContext.this.mLifecycleEventListeners.contains(r2)) {
                    try {
                        r2.onHostResume();
                    } catch (RuntimeException e2) {
                        ReactContext.this.handleException(e2);
                    }
                }
            }
        });
    }

    public void assertOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread(String str) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.assertIsOnThread(str);
    }

    public void assertOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    public CatalystInstance getCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        C2038a.m8318a(catalystInstance);
        return catalystInstance;
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return (T) catalystInstance.getJSModule(cls);
        }
        throw new RuntimeException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mCatalystInstance.getJavaScriptContextHolder();
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return (T) catalystInstance.getNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public void handleException(Exception exc) {
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance == null || catalystInstance.isDestroyed() || (nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler) == null) {
            throw new RuntimeException(exc);
        }
        nativeModuleCallExceptionHandler.handleException(exc);
    }

    public boolean hasActiveCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.hasNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        }
        if (this.mCatalystInstance != null) {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        this.mCatalystInstance = catalystInstance;
        ReactQueueConfiguration reactQueueConfiguration = catalystInstance.getReactQueueConfiguration();
        this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
        this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
        this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
    }

    public boolean isOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e2) {
                handleException(e2);
            }
        }
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e2) {
                handleException(e2);
            }
        }
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e2) {
                handleException(e2);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e2) {
                handleException(e2);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e2) {
                handleException(e2);
            }
        }
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void resetPerfStats() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        if (messageQueueThread != null) {
            messageQueueThread.resetPerfStats();
        }
        MessageQueueThread messageQueueThread2 = this.mJSMessageQueueThread;
        if (messageQueueThread2 != null) {
            messageQueueThread2.resetPerfStats();
        }
    }

    public void runOnJSQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        C2038a.m8318a(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        C2038a.m8318a(currentActivity);
        currentActivity.startActivityForResult(intent, i, bundle);
        return true;
    }
}
