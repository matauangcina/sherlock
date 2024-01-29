package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.C2820a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.p149e.InterfaceC2839c;
import io.flutter.embedding.engine.p150f.InterfaceC2840a;
import io.flutter.embedding.engine.renderer.InterfaceC2924b;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.C2958j;
import io.flutter.view.C2974c;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1529q;
import p108c.p109a.p110c.p112b.C1533a;
@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC2819b asyncWaitForVsyncDelegate;
    private static String observatoryUri;
    private static float refreshRateFPS;
    private InterfaceC2818a accessibilityDelegate;
    private InterfaceC2840a dynamicFeatureManager;
    private C1533a localizationPlugin;
    private Long nativePlatformViewId;
    private InterfaceC2839c platformMessageHandler;
    private C2958j platformViewsController;
    private final Set<C2820a.InterfaceC2822b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<InterfaceC2924b> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2818a {
        /* renamed from: b */
        void mo95b(ByteBuffer byteBuffer, String[] strArr);

        /* renamed from: e */
        void mo92e(ByteBuffer byteBuffer, String[] strArr);
    }

    /* renamed from: io.flutter.embedding.engine.FlutterJNI$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2819b {
        /* renamed from: a */
        void mo6a(long j);
    }

    private static void asyncWaitForVsync(long j) {
        InterfaceC2819b interfaceC2819b = asyncWaitForVsyncDelegate;
        if (interfaceC2819b == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        interfaceC2819b.mo6a(j);
    }

    private void ensureAttachedToNative() {
        if (this.nativePlatformViewId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativePlatformViewId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessageResponse(int i, byte[] bArr) {
        InterfaceC2839c interfaceC2839c = this.platformMessageHandler;
        if (interfaceC2839c != null) {
            interfaceC2839c.mo545c(i, bArr);
        }
    }

    private native long nativeAttach(FlutterJNI flutterJNI, boolean z);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native void nativeDynamicFeatureInstallFailure(int i, String str, boolean z);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    @Deprecated
    public static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    private native void nativeLoadDartDeferredLibrary(long j, int i, String[] strArr);

    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    public static native void nativeOnVsync(long j, long j2, long j3);

    @Deprecated
    public static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterTexture(long j, long j2, SurfaceTextureWrapper surfaceTextureWrapper);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j2);

    private native void nativeUpdateAssetManager(long j, AssetManager assetManager, String str);

    private void onPreEngineRestart() {
        for (C2820a.InterfaceC2822b interfaceC2822b : this.engineLifecycleListeners) {
            interfaceC2822b.mo589a();
        }
    }

    public static void setAsyncWaitForVsyncDelegate(InterfaceC2819b interfaceC2819b) {
        asyncWaitForVsyncDelegate = interfaceC2819b;
    }

    public static void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC2818a interfaceC2818a = this.accessibilityDelegate;
        if (interfaceC2818a != null) {
            interfaceC2818a.mo95b(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC2818a interfaceC2818a = this.accessibilityDelegate;
        if (interfaceC2818a != null) {
            interfaceC2818a.mo92e(byteBuffer, strArr);
        }
    }

    public void addEngineLifecycleListener(C2820a.InterfaceC2822b interfaceC2822b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC2822b);
    }

    public void addIsDisplayingFlutterUiListener(InterfaceC2924b interfaceC2924b) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(interfaceC2924b);
    }

    public void attachToNative(boolean z) {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.nativePlatformViewId = Long.valueOf(performNativeAttach(this, z));
    }

    String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i += 3) {
            String str = strArr[i + 0];
            String str2 = strArr[i + 1];
            String str3 = strArr[i + 2];
            if (Build.VERSION.SDK_INT >= 21) {
                Locale.Builder builder = new Locale.Builder();
                if (!str.isEmpty()) {
                    builder.setLanguage(str);
                }
                if (!str2.isEmpty()) {
                    builder.setRegion(str2);
                }
                if (!str3.isEmpty()) {
                    builder.setScript(str3);
                }
                arrayList.add(builder.build());
            } else {
                arrayList.add(new Locale(str, str2));
            }
        }
        Locale m4002a = this.localizationPlugin.m4002a(arrayList);
        if (m4002a == null) {
            return new String[0];
        }
        String[] strArr2 = new String[3];
        strArr2[0] = m4002a.getLanguage();
        strArr2[1] = m4002a.getCountry();
        if (Build.VERSION.SDK_INT >= 21) {
            strArr2[2] = m4002a.getScript();
        } else {
            strArr2[2] = "";
        }
        return strArr2;
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        C2958j c2958j = this.platformViewsController;
        if (c2958j != null) {
            return c2958j.m183y();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        C2958j c2958j = this.platformViewsController;
        if (c2958j == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c2958j.m235A();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDestroy(this.nativePlatformViewId.longValue());
        this.nativePlatformViewId = null;
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativePlatformViewId.longValue(), str, i);
            return;
        }
        C1499b.m4049e(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativePlatformViewId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        C1499b.m4049e(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativePlatformViewId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativePlatformViewId.longValue(), i, i2, byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i, C2974c.EnumC2980f enumC2980f) {
        dispatchSemanticsAction(i, enumC2980f, null);
    }

    public void dispatchSemanticsAction(int i, C2974c.EnumC2980f enumC2980f, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = C1529q.f4558a.mo4006a(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, enumC2980f.f7482f, byteBuffer, i2);
    }

    public void dynamicFeatureInstallFailure(int i, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDynamicFeatureInstallFailure(i, str, z);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativePlatformViewId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public void handlePlatformMessage(String str, byte[] bArr, int i) {
        InterfaceC2839c interfaceC2839c = this.platformMessageHandler;
        if (interfaceC2839c != null) {
            interfaceC2839c.mo544d(str, bArr, i);
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j) {
        nativeInit(context, strArr, str, str2, str3, j);
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageEmptyResponseCallback(this.nativePlatformViewId.longValue(), i);
            return;
        }
        C1499b.m4049e(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeInvokePlatformMessageResponseCallback(this.nativePlatformViewId.longValue(), i, byteBuffer, i2);
            return;
        }
        C1499b.m4049e(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
    }

    public boolean isAttached() {
        return this.nativePlatformViewId != null;
    }

    public void loadDartDeferredLibrary(int i, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativePlatformViewId.longValue(), i, strArr);
    }

    public void loadLibrary() {
        System.loadLibrary("flutter");
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativePlatformViewId.longValue(), j);
    }

    public native boolean nativeFlutterTextUtilsIsEmoji(int i);

    public native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    public native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    public native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    public native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativePlatformViewId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        C2958j c2958j = this.platformViewsController;
        if (c2958j == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        c2958j.m222N();
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        C2958j c2958j = this.platformViewsController;
        if (c2958j == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        c2958j.m220P(i, i2, i3, i4, i5);
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        C2958j c2958j = this.platformViewsController;
        if (c2958j == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c2958j.m219Q(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        C2958j c2958j = this.platformViewsController;
        if (c2958j == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        c2958j.m218R();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (InterfaceC2924b interfaceC2924b : this.flutterUiDisplayListeners) {
            interfaceC2924b.mo365g();
        }
    }

    void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (InterfaceC2924b interfaceC2924b : this.flutterUiDisplayListeners) {
            interfaceC2924b.mo366d();
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativePlatformViewId.longValue(), i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativePlatformViewId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativePlatformViewId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativePlatformViewId.longValue(), surface);
    }

    public long performNativeAttach(FlutterJNI flutterJNI, boolean z) {
        return nativeAttach(flutterJNI, z);
    }

    public void prefetchDefaultFontManager() {
        nativePrefetchDefaultFontManager();
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativePlatformViewId.longValue(), j, surfaceTextureWrapper);
    }

    public void removeEngineLifecycleListener(C2820a.InterfaceC2822b interfaceC2822b) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC2822b);
    }

    public void removeIsDisplayingFlutterUiListener(InterfaceC2924b interfaceC2924b) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(interfaceC2924b);
    }

    public void requestDartDeferredLibrary(int i) {
        InterfaceC2840a interfaceC2840a = this.dynamicFeatureManager;
        if (interfaceC2840a != null) {
            interfaceC2840a.m543a(i, null);
        } else {
            C1499b.m4052b(TAG, "No DynamicFeatureManager found. Android setup must be completed before using split AOT dynamic features.");
        }
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativePlatformViewId.longValue(), str, str2, str3, assetManager);
    }

    public void setAccessibilityDelegate(InterfaceC2818a interfaceC2818a) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC2818a;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetAccessibilityFeatures(this.nativePlatformViewId.longValue(), i);
    }

    public void setDynamicFeatureManager(InterfaceC2840a interfaceC2840a) {
        ensureRunningOnMainThread();
        this.dynamicFeatureManager = interfaceC2840a;
        if (interfaceC2840a != null) {
            interfaceC2840a.m542b(this);
        }
    }

    public void setLocalizationPlugin(C1533a c1533a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c1533a;
    }

    public void setPlatformMessageHandler(InterfaceC2839c interfaceC2839c) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC2839c;
    }

    public void setPlatformViewsController(C2958j c2958j) {
        ensureRunningOnMainThread();
        this.platformViewsController = c2958j;
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetSemanticsEnabled(this.nativePlatformViewId.longValue(), z);
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativePlatformViewId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14);
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativePlatformViewId.longValue(), j);
    }

    public void updateAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateAssetManager(this.nativePlatformViewId.longValue(), assetManager, str);
    }
}
