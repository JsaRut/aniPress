package com.brentvatne.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import java.util.HashMap;
import java.util.Map;
import p139d.p225c.p226a.p227a.p269m.C2584C;

/* loaded from: classes.dex */
public class ReactExoplayerViewManager extends ViewGroupManager<C0982i> {
    private static final String PROP_BUFFER_CONFIG = "bufferConfig";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SRC = "src";
    private static final String PROP_SRC_HEADERS = "requestHeaders";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_TEXT_TRACKS = "textTracks";
    private static final String PROP_USE_TEXTURE_VIEW = "useTextureView";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVideo";

    private int convertToIntDef(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return C0983j.m4949a(Integer.parseInt(str));
    }

    private boolean startsWithValidScheme(String str) {
        return str.startsWith("http://") || str.startsWith("https://") || str.startsWith("content://") || str.startsWith("file://") || str.startsWith("asset://");
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C0982i createViewInstance(C1278N c1278n) {
        return new C0982i(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1104f.a m5175a = C1104f.m5175a();
        for (String str : C0984k.f4115a) {
            m5175a.m5184a(str, C1104f.m5176a("registrationName", str));
        }
        return m5175a.m5185a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return C1104f.m5179a("ScaleNone", Integer.toString(0), "ScaleAspectFit", Integer.toString(0), "ScaleToFill", Integer.toString(3), "ScaleAspectFill", Integer.toString(4));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC1294a(name = PROP_MIN_LOAD_RETRY_COUNT)
    public void minLoadRetryCount(C0982i c0982i, int i) {
        c0982i.m4939e(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C0982i c0982i) {
        c0982i.m4936d();
    }

    @InterfaceC1294a(name = PROP_BUFFER_CONFIG)
    public void setBufferConfig(C0982i c0982i, ReadableMap readableMap) {
        if (readableMap != null) {
            c0982i.m4920a(readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) : 15000, readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_BUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_MAX_BUFFER_MS) : 50000, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) : 2500, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) : 5000);
        }
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_CONTROLS)
    public void setControls(C0982i c0982i, boolean z) {
        c0982i.m4935c(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public void setDisableFocus(C0982i c0982i, boolean z) {
        c0982i.m4938d(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_FULLSCREEN)
    public void setFullscreen(C0982i c0982i, boolean z) {
        c0982i.m4940e(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public void setHideShutterView(C0982i c0982i, boolean z) {
        c0982i.m4942f(z);
    }

    @InterfaceC1294a(name = PROP_MAXIMUM_BIT_RATE)
    public void setMaxBitRate(C0982i c0982i, int i) {
        c0982i.m4937d(i);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_MUTED)
    public void setMuted(C0982i c0982i, boolean z) {
        c0982i.m4943g(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_PAUSED)
    public void setPaused(C0982i c0982i, boolean z) {
        c0982i.m4944h(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public void setPlayInBackground(C0982i c0982i, boolean z) {
        c0982i.m4945i(z);
    }

    @InterfaceC1294a(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public void setProgressUpdateInterval(C0982i c0982i, float f) {
        c0982i.m4919a(f);
    }

    @InterfaceC1294a(name = PROP_TEXT_TRACKS)
    public void setPropTextTracks(C0982i c0982i, ReadableArray readableArray) {
        c0982i.m4926a(readableArray);
    }

    @InterfaceC1294a(name = PROP_RATE)
    public void setRate(C0982i c0982i, float f) {
        c0982i.m4930b(f);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(C0982i c0982i, boolean z) {
        c0982i.m4946j(z);
    }

    @InterfaceC1294a(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public void setReportBandwidth(C0982i c0982i, boolean z) {
        c0982i.m4947k(z);
    }

    @InterfaceC1294a(name = PROP_RESIZE_MODE)
    public void setResizeMode(C0982i c0982i, String str) {
        c0982i.m4941f(convertToIntDef(str));
    }

    @InterfaceC1294a(name = PROP_SEEK)
    public void setSeek(C0982i c0982i, float f) {
        c0982i.m4923a(Math.round(f * 1000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.facebook.react.bridge.Dynamic] */
    @InterfaceC1294a(name = PROP_SELECTED_AUDIO_TRACK)
    public void setSelectedAudioTrack(C0982i c0982i, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        c0982i.m4928a(r0, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.facebook.react.bridge.Dynamic] */
    @InterfaceC1294a(name = PROP_SELECTED_TEXT_TRACK)
    public void setSelectedTextTrack(C0982i c0982i, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        c0982i.m4931b(r0, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.facebook.react.bridge.Dynamic] */
    @InterfaceC1294a(name = PROP_SELECTED_VIDEO_TRACK)
    public void setSelectedVideoTrack(C0982i c0982i, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        c0982i.m4934c(r0, dynamic);
    }

    @InterfaceC1294a(name = PROP_SRC)
    public void setSrc(C0982i c0982i, ReadableMap readableMap) {
        Uri m10900b;
        Context applicationContext = c0982i.getContext().getApplicationContext();
        String string = readableMap.hasKey(PROP_SRC_URI) ? readableMap.getString(PROP_SRC_URI) : null;
        String string2 = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        Map<String, String> stringMap = readableMap.hasKey(PROP_SRC_HEADERS) ? toStringMap(readableMap.getMap(PROP_SRC_HEADERS)) : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (startsWithValidScheme(string)) {
            Uri parse = Uri.parse(string);
            if (parse != null) {
                c0982i.m4925a(parse, string2, stringMap);
                return;
            }
            return;
        }
        int identifier = applicationContext.getResources().getIdentifier(string, "drawable", applicationContext.getPackageName());
        if (identifier == 0) {
            identifier = applicationContext.getResources().getIdentifier(string, "raw", applicationContext.getPackageName());
        }
        if (identifier <= 0 || (m10900b = C2584C.m10900b(identifier)) == null) {
            return;
        }
        c0982i.m4924a(m10900b, string2);
    }

    @InterfaceC1294a(defaultBoolean = true, name = PROP_USE_TEXTURE_VIEW)
    public void setUseTextureView(C0982i c0982i, boolean z) {
        c0982i.m4948l(z);
    }

    @InterfaceC1294a(defaultFloat = 1.0f, name = PROP_VOLUME)
    public void setVolume(C0982i c0982i, float f) {
        c0982i.m4933c(f);
    }
}
