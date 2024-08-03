package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;

/* loaded from: classes.dex */
class EventAnimationDriver implements RCTEventEmitter {
    private List<String> mEventPath;
    C1034Q mValueNode;

    public EventAnimationDriver(List<String> list, C1034Q c1034q) {
        this.mEventPath = list;
        this.mValueNode = c1034q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap == null) {
            throw new IllegalArgumentException("Native animated events must have event data.");
        }
        int i2 = 0;
        WritableMap writableMap2 = writableMap;
        while (i2 < this.mEventPath.size() - 1) {
            ReadableMap map = writableMap2.getMap(this.mEventPath.get(i2));
            i2++;
            writableMap2 = map;
        }
        this.mValueNode.f4274e = writableMap2.getDouble(this.mEventPath.get(r3.size() - 1));
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
