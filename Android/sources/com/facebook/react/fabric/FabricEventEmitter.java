package com.facebook.react.fabric;

import android.util.Pair;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.C1550a;
import java.util.HashSet;
import p139d.p143b.p148c.p153e.C1700a;

/* loaded from: classes.dex */
public class FabricEventEmitter implements RCTEventEmitter {
    private static final String TAG = "FabricEventEmitter";
    private final C1125b mUIManager;

    public FabricEventEmitter(C1125b c1125b) {
        this.mUIManager = c1125b;
    }

    private WritableArray copyWritableArray(WritableArray writableArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i)));
        }
        return writableNativeArray;
    }

    private WritableMap getWritableMap(ReadableMap readableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(readableMap);
        return writableNativeMap;
    }

    private Pair<WritableArray, WritableArray> removeTouchesAtIndices(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < writableArray2.size(); i++) {
            int i2 = writableArray2.getInt(i);
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i2)));
            hashSet.add(Integer.valueOf(i2));
        }
        for (int i3 = 0; i3 < writableArray.size(); i3++) {
            if (!hashSet.contains(Integer.valueOf(i3))) {
                writableNativeArray2.pushMap(getWritableMap(writableArray.getMap(i3)));
            }
        }
        return new Pair<>(writableNativeArray, writableNativeArray2);
    }

    private Pair<WritableArray, WritableArray> touchSubsequence(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray2.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(writableArray2.getInt(i))));
        }
        return new Pair<>(writableNativeArray, writableArray);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        C1550a.m6454a(0L, "FabricEventEmitter.receiveEvent('" + str + "')");
        this.mUIManager.m5237a(i, str, writableMap);
        C1550a.m6453a(0L);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        Pair<WritableArray, WritableArray> removeTouchesAtIndices = ("topTouchEnd".equalsIgnoreCase(str) || "topTouchCancel".equalsIgnoreCase(str)) ? removeTouchesAtIndices(writableArray, writableArray2) : touchSubsequence(writableArray, writableArray2);
        WritableArray writableArray3 = (WritableArray) removeTouchesAtIndices.first;
        WritableArray writableArray4 = (WritableArray) removeTouchesAtIndices.second;
        for (int i = 0; i < writableArray3.size(); i++) {
            WritableMap writableMap = getWritableMap(writableArray3.getMap(i));
            writableMap.putArray("changedTouches", copyWritableArray(writableArray3));
            writableMap.putArray("touches", copyWritableArray(writableArray4));
            int i2 = writableMap.getInt("target");
            if (i2 < 1) {
                C1700a.m7006b(TAG, "A view is reporting that a touch occurred on tag zero.");
                i2 = 0;
            }
            receiveEvent(i2, str, writableMap);
        }
    }
}
