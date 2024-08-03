package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.debug.C1181c;
import com.facebook.react.modules.debug.p126a.InterfaceC1179a;
import java.util.Locale;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = AnimationsDebugModule.NAME)
/* loaded from: classes.dex */
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "AnimationsDebugModule";
    private final InterfaceC1179a mCatalystSettings;
    private C1181c mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, InterfaceC1179a interfaceC1179a) {
        super(reactApplicationContext);
        this.mCatalystSettings = interfaceC1179a;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        C1181c c1181c = this.mFrameCallback;
        if (c1181c != null) {
            c1181c.m5325j();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        InterfaceC1179a interfaceC1179a = this.mCatalystSettings;
        if (interfaceC1179a == null || !interfaceC1179a.m5312a()) {
            return;
        }
        if (this.mFrameCallback != null) {
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
        this.mFrameCallback = new C1181c(getReactApplicationContext());
        this.mFrameCallback.m5324i();
    }

    @ReactMethod
    public void stopRecordingFps(double d2) {
        C1181c c1181c = this.mFrameCallback;
        if (c1181c == null) {
            return;
        }
        c1181c.m5325j();
        C1181c.a m5317b = this.mFrameCallback.m5317b((long) d2);
        if (m5317b == null) {
            Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
        } else {
            String str = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", Double.valueOf(m5317b.f4551e), Integer.valueOf(m5317b.f4547a), Integer.valueOf(m5317b.f4549c)) + "\n" + String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", Double.valueOf(m5317b.f4552f), Integer.valueOf(m5317b.f4548b), Integer.valueOf(m5317b.f4549c)) + "\nTotal Time MS: " + String.format(Locale.US, "%d", Integer.valueOf(m5317b.f4553g));
            C1700a.m6997a("ReactNative", str);
            Toast.makeText(getReactApplicationContext(), str, 1).show();
        }
        this.mFrameCallback = null;
    }
}
