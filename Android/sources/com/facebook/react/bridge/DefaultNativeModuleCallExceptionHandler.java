package com.facebook.react.bridge;

/* loaded from: classes.dex */
public class DefaultNativeModuleCallExceptionHandler implements NativeModuleCallExceptionHandler {
    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        if (!(exc instanceof RuntimeException)) {
            throw new RuntimeException(exc);
        }
        throw ((RuntimeException) exc);
    }
}
