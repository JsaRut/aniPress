package p139d.p143b.p208m.p216f;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.InterfaceC1141a;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.modules.camera.ImageEditingManager;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.views.checkbox.ReactCheckBoxManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactDropdownPickerManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.toolbar.ReactToolbarManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.viewpager.ReactViewPagerManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p139d.p143b.p208m.AbstractC2114j;

/* renamed from: d.b.m.f.B */
/* loaded from: classes.dex */
public class C2078B extends AbstractC2114j {

    /* renamed from: a */
    private C2079a f7534a;

    @Override // p139d.p143b.p208m.AbstractC2114j
    /* renamed from: a */
    public InterfaceC1141a mo8444a() {
        return AbstractC2114j.m8454a(this);
    }

    @Override // p139d.p143b.p208m.AbstractC2114j, p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
        arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
        arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
        arrayList.add(new ReactCheckBoxManager());
        arrayList.add(new ReactDialogPickerManager());
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactDropdownPickerManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSliderManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new ReactToolbarManager());
        arrayList.add(new ReactWebViewManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new ARTSurfaceViewManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactViewPagerManager());
        arrayList.add(new ReactVirtualTextViewManager());
        return arrayList;
    }

    @Override // p139d.p143b.p208m.AbstractC2114j
    /* renamed from: d */
    public List<ModuleSpec> mo8445d(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) AccessibilityInfoModule.class, new C2090l(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) AppStateModule.class, new C2098t(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) BlobModule.class, new C2099u(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) FileReaderModule.class, new C2100v(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) AsyncStorageModule.class, new C2101w(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) CameraRollManager.class, new C2102x(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) ClipboardModule.class, new C2103y(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) DatePickerDialogModule.class, new C2104z(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) DialogModule.class, new C2077A(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) FrescoModule.class, new C2080b(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) I18nManagerModule.class, new C2081c(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) ImageEditingManager.class, new C2082d(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) ImageLoaderModule.class, new C2083e(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) ImageStoreManager.class, new C2084f(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) IntentModule.class, new C2085g(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) LocationModule.class, new C2086h(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) NativeAnimatedModule.class, new C2087i(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) NetworkingModule.class, new C2088j(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) NetInfoModule.class, new C2089k(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) PermissionsModule.class, new C2091m(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) ShareModule.class, new C2092n(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) StatusBarModule.class, new C2093o(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) TimePickerDialogModule.class, new C2094p(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) ToastModule.class, new C2095q(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) VibrationModule.class, new C2096r(this, reactApplicationContext)), ModuleSpec.nativeModuleSpec((Class<? extends NativeModule>) WebSocketModule.class, new C2097s(this, reactApplicationContext)));
    }
}
