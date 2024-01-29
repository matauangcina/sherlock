package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p108c.p109a.C1499b;
@Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final C2970b reflectionAccessors = new C2970b();
    private final SparseArray<C2971c> flutterIdToOrigin = new SparseArray<>();
    private final Map<C2971c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$b */
    /* loaded from: classes.dex */
    public static class C2970b {

        /* renamed from: a */
        private final Method f7415a;

        /* renamed from: b */
        private final Method f7416b;

        /* renamed from: c */
        private final Method f7417c;

        /* renamed from: d */
        private final Method f7418d;

        /* renamed from: e */
        private final Field f7419e;

        /* renamed from: f */
        private final Method f7420f;

        /* JADX WARN: Multi-variable type inference failed */
        private C2970b() {
            Method method;
            Method method2;
            Method method3;
            Field field;
            Field declaredField;
            Method method4;
            Method method5;
            Field field2;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                C1499b.m4049e(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                C1499b.m4049e(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    C1499b.m4049e(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    field = null;
                }
                this.f7415a = method;
                this.f7416b = method6;
                this.f7417c = method2;
                this.f7418d = method3;
                this.f7419e = declaredField;
                this.f7420f = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                C1499b.m4049e(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                field2 = null;
            } catch (NoSuchMethodException unused5) {
                C1499b.m4049e(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method3 = null;
                field2 = null;
            }
            method6 = method5;
            field = field2;
            declaredField = field;
            method4 = field;
            this.f7415a = method;
            this.f7416b = method6;
            this.f7417c = method2;
            this.f7418d = method3;
            this.f7419e = declaredField;
            this.f7420f = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public Long m145f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            String str;
            if (this.f7418d == null && (this.f7419e == null || this.f7420f == null)) {
                return null;
            }
            Method method = this.f7418d;
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    e = e;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e2) {
                    e = e2;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f7420f.invoke(this.f7419e.get(accessibilityNodeInfo), Integer.valueOf(i))).longValue());
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e4) {
                    e = e4;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e5) {
                    e = e5;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public Long m144g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f7416b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e) {
                    e = e;
                    str = "Failed to access getParentNodeId method.";
                    C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                    return m139l(accessibilityNodeInfo);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                    return m139l(accessibilityNodeInfo);
                }
            }
            return m139l(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public Long m143h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f7417c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e) {
                e = e;
                str = "Failed to access the getRecordSourceNodeId method.";
                C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e2) {
                e = e2;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public Long m142i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f7415a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e) {
                e = e;
                str = "Failed to access getSourceNodeId method.";
                C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e2) {
                e = e2;
                str = "The getSourceNodeId method threw an exception when invoked.";
                C1499b.m4048f(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static int m141j(long j) {
            return (int) (j >> 32);
        }

        /* renamed from: k */
        private static boolean m140k(long j, int i) {
            return (j & (1 << i)) != 0;
        }

        /* renamed from: l */
        private static Long m139l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                C1499b.m4049e(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m140k(readLong, 0)) {
                obtain2.readInt();
            }
            if (m140k(readLong, 1)) {
                obtain2.readLong();
            }
            if (m140k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = m140k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$c */
    /* loaded from: classes.dex */
    public static class C2971c {

        /* renamed from: a */
        final View f7421a;

        /* renamed from: b */
        final int f7422b;

        private C2971c(View view, int i) {
            this.f7421a = view;
            this.f7422b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2971c) {
                C2971c c2971c = (C2971c) obj;
                return this.f7422b == c2971c.f7422b && this.f7421a.equals(c2971c.f7421a);
            }
            return false;
        }

        public int hashCode() {
            return ((this.f7421a.hashCode() + 31) * 31) + this.f7422b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            Long m145f = this.reflectionAccessors.m145f(accessibilityNodeInfo, i2);
            if (m145f != null) {
                int m141j = C2970b.m141j(m145f.longValue());
                C2971c c2971c = new C2971c(view, m141j);
                if (this.originToFlutterId.containsKey(c2971c)) {
                    i = this.originToFlutterId.get(c2971c).intValue();
                } else {
                    int i3 = this.nextFlutterId;
                    this.nextFlutterId = i3 + 1;
                    cacheVirtualIdMappings(view, m141j, i3);
                    i = i3;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        C2971c c2971c = new C2971c(view, i);
        this.originToFlutterId.put(c2971c, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, c2971c);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        if (Build.VERSION.SDK_INT >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long m144g = this.reflectionAccessors.m144g(accessibilityNodeInfo);
        if (m144g == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new C2971c(view, C2970b.m141j(m144g.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        C2971c c2971c = this.flutterIdToOrigin.get(i);
        if (c2971c == null || !this.embeddedViewToDisplayBounds.containsKey(c2971c.f7421a) || c2971c.f7421a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = c2971c.f7421a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c2971c.f7422b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, c2971c.f7421a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long m143h = this.reflectionAccessors.m143h(accessibilityRecord);
        if (m143h == null) {
            return null;
        }
        return this.originToFlutterId.get(new C2971c(view, C2970b.m141j(m143h.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long m142i = this.reflectionAccessors.m142i(createAccessibilityNodeInfo);
        if (m142i == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, C2970b.m141j(m142i.longValue()), i);
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        C2971c c2971c = this.flutterIdToOrigin.get(i);
        if (c2971c == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(c2971c.f7421a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i2, pointerPropertiesArr[i2]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2].x -= rect.left;
            pointerCoordsArr[i2].y -= rect.top;
        }
        return c2971c.f7421a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        C2971c c2971c = this.flutterIdToOrigin.get(i);
        if (c2971c == null || (accessibilityNodeProvider = c2971c.f7421a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(c2971c.f7422b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        C2971c c2971c = this.flutterIdToOrigin.get(i);
        if (c2971c == null) {
            return null;
        }
        return c2971c.f7421a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long m143h = this.reflectionAccessors.m143h(accessibilityEvent);
        if (m143h == null) {
            return false;
        }
        int m141j = C2970b.m141j(m143h.longValue());
        Integer num = this.originToFlutterId.get(new C2971c(view, m141j));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            num = Integer.valueOf(i);
            cacheVirtualIdMappings(view, m141j, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
            AccessibilityRecord record = obtain.getRecord(i2);
            Long m143h2 = this.reflectionAccessors.m143h(record);
            if (m143h2 == null) {
                return false;
            }
            C2971c c2971c = new C2971c(view, C2970b.m141j(m143h2.longValue()));
            if (!this.originToFlutterId.containsKey(c2971c)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(c2971c).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
