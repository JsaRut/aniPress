package com.brentvatne.exoplayer;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o;
import p139d.p225c.p226a.p227a.p245h.p247b.C2376w;

/* renamed from: com.brentvatne.exoplayer.k */
/* loaded from: classes.dex */
public class C0984k {

    /* renamed from: a */
    static final String[] f4115a = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* renamed from: b */
    private final RCTEventEmitter f4116b;

    /* renamed from: c */
    private int f4117c = -1;

    public C0984k(ReactContext reactContext) {
        this.f4116b = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    /* renamed from: a */
    private void m4950a(String str, WritableMap writableMap) {
        this.f4116b.receiveEvent(this.f4117c, str, writableMap);
    }

    /* renamed from: a */
    public void m4951a() {
        m4950a("onVideoAudioBecomingNoisy", (WritableMap) null);
    }

    /* renamed from: a */
    public void m4952a(double d2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("bitrate", d2);
        m4950a("onVideoBandwidthUpdate", createMap);
    }

    /* renamed from: a */
    public void m4953a(double d2, double d3, double d4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", d2 / 1000.0d);
        createMap.putDouble("playableDuration", d3 / 1000.0d);
        createMap.putDouble("seekableDuration", d4 / 1000.0d);
        m4950a("onVideoProgress", createMap);
    }

    /* renamed from: a */
    public void m4954a(double d2, double d3, int i, int i2, WritableArray writableArray, WritableArray writableArray2, WritableArray writableArray3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("duration", d2 / 1000.0d);
        createMap.putDouble("currentTime", d3 / 1000.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("width", i);
        createMap2.putInt("height", i2);
        createMap2.putString("orientation", i > i2 ? "landscape" : "portrait");
        createMap.putMap("naturalSize", createMap2);
        createMap.putArray("videoTracks", writableArray3);
        createMap.putArray("audioTracks", writableArray);
        createMap.putArray("textTracks", writableArray2);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canPlaySlowForward", true);
        createMap.putBoolean("canPlaySlowReverse", true);
        createMap.putBoolean("canPlayReverse", true);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canStepBackward", true);
        createMap.putBoolean("canStepForward", true);
        m4950a("onVideoLoad", createMap);
    }

    /* renamed from: a */
    public void m4955a(float f) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("playbackRate", f);
        m4950a("onPlaybackRateChange", createMap);
    }

    /* renamed from: a */
    public void m4956a(int i) {
        this.f4117c = i;
    }

    /* renamed from: a */
    public void m4957a(long j, long j2) {
        WritableMap createMap = Arguments.createMap();
        double d2 = j;
        Double.isNaN(d2);
        createMap.putDouble("currentTime", d2 / 1000.0d);
        double d3 = j2;
        Double.isNaN(d3);
        createMap.putDouble("seekTime", d3 / 1000.0d);
        m4950a("onVideoSeek", createMap);
    }

    /* renamed from: a */
    public void m4958a(C2353b c2353b) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < c2353b.m9810a(); i++) {
            AbstractC2368o abstractC2368o = (AbstractC2368o) c2353b.m9811a(i);
            String str = abstractC2368o instanceof C2376w ? ((C2376w) abstractC2368o).f9322b : "";
            String str2 = abstractC2368o.f9310a;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("identifier", str2);
            createMap.putString("value", str);
            createArray.pushMap(createMap);
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putArray("metadata", createArray);
        m4950a("onTimedMetadata", createMap2);
    }

    /* renamed from: a */
    public void m4959a(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorString", str);
        createMap.putString("errorException", exc.getMessage());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        m4950a("onVideoError", createMap2);
    }

    /* renamed from: a */
    public void m4960a(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("hasAudioFocus", z);
        m4950a("onAudioFocusChanged", createMap);
    }

    /* renamed from: b */
    public void m4961b() {
        m4950a("onVideoEnd", (WritableMap) null);
    }

    /* renamed from: b */
    public void m4962b(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isBuffering", z);
        m4950a("onVideoBuffer", createMap);
    }

    /* renamed from: c */
    public void m4963c() {
        m4950a("onVideoFullscreenPlayerDidDismiss", (WritableMap) null);
    }

    /* renamed from: d */
    public void m4964d() {
        m4950a("onVideoFullscreenPlayerDidPresent", (WritableMap) null);
    }

    /* renamed from: e */
    public void m4965e() {
        m4950a("onVideoFullscreenPlayerWillDismiss", (WritableMap) null);
    }

    /* renamed from: f */
    public void m4966f() {
        m4950a("onVideoFullscreenPlayerWillPresent", (WritableMap) null);
    }

    /* renamed from: g */
    public void m4967g() {
        m4950a("onVideoIdle", (WritableMap) null);
    }

    /* renamed from: h */
    public void m4968h() {
        m4950a("onVideoLoadStart", (WritableMap) null);
    }

    /* renamed from: i */
    public void m4969i() {
        m4950a("onReadyForDisplay", (WritableMap) null);
    }
}
