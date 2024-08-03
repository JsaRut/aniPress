package com.facebook.react.modules.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1107i;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p000a.p005b.p009c.p010a.C0022a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = LocationModule.NAME)
@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public class LocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "LocationObserver";
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    private final LocationListener mLocationListener;
    private String mWatchedProvider;

    /* renamed from: com.facebook.react.modules.location.LocationModule$a */
    /* loaded from: classes.dex */
    private static class C1195a {

        /* renamed from: a */
        private final long f4583a;

        /* renamed from: b */
        private final double f4584b;

        /* renamed from: c */
        private final boolean f4585c;

        /* renamed from: d */
        private final float f4586d;

        private C1195a(long j, double d2, boolean z, float f) {
            this.f4583a = j;
            this.f4584b = d2;
            this.f4585c = z;
            this.f4586d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static C1195a m5363b(ReadableMap readableMap) {
            return new C1195a(readableMap.hasKey("timeout") ? (long) readableMap.getDouble("timeout") : Long.MAX_VALUE, readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY, readableMap.hasKey("enableHighAccuracy") && readableMap.getBoolean("enableHighAccuracy"), readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : LocationModule.RCT_DEFAULT_LOCATION_ACCURACY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.location.LocationModule$b */
    /* loaded from: classes.dex */
    public static class C1196b {

        /* renamed from: a */
        private final Callback f4587a;

        /* renamed from: b */
        private final Callback f4588b;

        /* renamed from: c */
        private final LocationManager f4589c;

        /* renamed from: d */
        private final String f4590d;

        /* renamed from: e */
        private final long f4591e;

        /* renamed from: f */
        private Location f4592f;

        /* renamed from: g */
        private final Handler f4593g;

        /* renamed from: h */
        private final Runnable f4594h;

        /* renamed from: i */
        private final LocationListener f4595i;

        /* renamed from: j */
        private boolean f4596j;

        private C1196b(LocationManager locationManager, String str, long j, Callback callback, Callback callback2) {
            this.f4593g = new Handler();
            this.f4594h = new RunnableC1198b(this);
            this.f4595i = new C1199c(this);
            this.f4589c = locationManager;
            this.f4590d = str;
            this.f4591e = j;
            this.f4587a = callback;
            this.f4588b = callback2;
        }

        /* synthetic */ C1196b(LocationManager locationManager, String str, long j, Callback callback, Callback callback2, C1197a c1197a) {
            this(locationManager, str, j, callback, callback2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public boolean m5368a(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z = time > 120000;
            boolean z2 = time < -120000;
            boolean z3 = time > 0;
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = accuracy > 200;
            boolean m5371a = m5371a(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (!z3 || z4) {
                return z3 && !z6 && m5371a;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m5371a(String str, String str2) {
            return str == null ? str2 == null : str.equals(str2);
        }

        /* renamed from: a */
        public void m5379a(Location location) {
            this.f4592f = location;
            this.f4589c.requestLocationUpdates(this.f4590d, 100L, 1.0f, this.f4595i);
            this.f4593g.postDelayed(this.f4594h, this.f4591e);
        }
    }

    public LocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLocationListener = new C1197a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitError(int i, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", C1200d.m5380a(i, str));
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str = z ? "gps" : "network";
        if (!locationManager.isProviderEnabled(str)) {
            str = str.equals("gps") ? "network" : "gps";
            if (!locationManager.isProviderEnabled(str)) {
                return null;
            }
        }
        int m87a = C0022a.m87a(getReactApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
        if (!str.equals("gps") || m87a == 0) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap locationToMap(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", location.getAccuracy());
        createMap2.putDouble("heading", location.getBearing());
        createMap2.putDouble("speed", location.getSpeed());
        createMap.putMap("coords", createMap2);
        createMap.putDouble("timestamp", location.getTime());
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putBoolean("mocked", location.isFromMockProvider());
        }
        return createMap;
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        C1195a m5363b = C1195a.m5363b(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, m5363b.f4585c);
            if (validProvider == null) {
                callback2.invoke(C1200d.m5380a(C1200d.f4601b, "No location provider available."));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || C1107i.m5191a() - lastKnownLocation.getTime() >= m5363b.f4584b) {
                new C1196b(locationManager, validProvider, m5363b.f4583a, callback, callback2, null).m5379a(lastKnownLocation);
            } else {
                callback.invoke(locationToMap(lastKnownLocation));
            }
        } catch (SecurityException e2) {
            throwLocationPermissionMissing(e2);
            throw null;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if ("gps".equals(this.mWatchedProvider)) {
            return;
        }
        C1195a m5363b = C1195a.m5363b(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, m5363b.f4585c);
            if (validProvider == null) {
                emitError(C1200d.f4601b, "No location provider available.");
                return;
            }
            if (!validProvider.equals(this.mWatchedProvider)) {
                locationManager.removeUpdates(this.mLocationListener);
                locationManager.requestLocationUpdates(validProvider, 1000L, m5363b.f4586d, this.mLocationListener);
            }
            this.mWatchedProvider = validProvider;
        } catch (SecurityException e2) {
            throwLocationPermissionMissing(e2);
            throw null;
        }
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService("location")).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }
}
