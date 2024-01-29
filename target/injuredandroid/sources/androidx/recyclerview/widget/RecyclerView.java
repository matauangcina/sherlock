package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C1017a;
import androidx.recyclerview.widget.C1020b;
import androidx.recyclerview.widget.C1051k;
import androidx.recyclerview.widget.C1058o;
import androidx.recyclerview.widget.C1061p;
import androidx.recyclerview.widget.RunnableC1039e;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p019g.p024g.C0146c;
import p000a.p019g.p027j.C0194i;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0242i;
import p000a.p019g.p028k.C0244k;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0264t;
import p000a.p019g.p028k.InterfaceC0243j;
import p000a.p019g.p028k.p029b0.C0216b;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p032i.p033a.AbstractC0280a;
import p000a.p044n.C0314a;
import p000a.p044n.C0315b;
import p000a.p044n.C0316c;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0243j {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    C1051k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC0977g mAdapter;
    C1017a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0980j mChildDrawingOrderCallback;
    C1020b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0981k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC1039e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0996s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC0982l mItemAnimator;
    private AbstractC0982l.InterfaceC0984b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC0987n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC0988o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1002x mObserver;
    private List<InterfaceC0994q> mOnChildAttachStateListeners;
    private AbstractC0995r mOnFlingListener;
    private final ArrayList<InterfaceC0996s> mOnItemTouchListeners;
    final List<AbstractC0974d0> mPendingAccessibilityImportanceChange;
    private C1003y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    RunnableC1039e.C1041b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1000v mRecycler;
    InterfaceC1001w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0997t mScrollListener;
    private List<AbstractC0997t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0244k mScrollingChildHelper;
    final C0968a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC0972c0 mViewFlinger;
    private final C1061p.InterfaceC1063b mViewInfoProcessCallback;
    final C1061p mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    class RunnableC0967a implements Runnable {
        RunnableC0967a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes.dex */
    public static class C0968a0 {

        /* renamed from: b */
        private SparseArray<Object> f3350b;

        /* renamed from: m */
        int f3361m;

        /* renamed from: n */
        long f3362n;

        /* renamed from: o */
        int f3363o;

        /* renamed from: p */
        int f3364p;

        /* renamed from: q */
        int f3365q;

        /* renamed from: a */
        int f3349a = -1;

        /* renamed from: c */
        int f3351c = 0;

        /* renamed from: d */
        int f3352d = 0;

        /* renamed from: e */
        int f3353e = 1;

        /* renamed from: f */
        int f3354f = 0;

        /* renamed from: g */
        boolean f3355g = false;

        /* renamed from: h */
        boolean f3356h = false;

        /* renamed from: i */
        boolean f3357i = false;

        /* renamed from: j */
        boolean f3358j = false;

        /* renamed from: k */
        boolean f3359k = false;

        /* renamed from: l */
        boolean f3360l = false;

        /* renamed from: a */
        void m5746a(int i) {
            if ((this.f3353e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3353e));
        }

        /* renamed from: b */
        public int m5745b() {
            return this.f3356h ? this.f3351c - this.f3352d : this.f3354f;
        }

        /* renamed from: c */
        public int m5744c() {
            return this.f3349a;
        }

        /* renamed from: d */
        public boolean m5743d() {
            return this.f3349a != -1;
        }

        /* renamed from: e */
        public boolean m5742e() {
            return this.f3356h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m5741f(AbstractC0977g abstractC0977g) {
            this.f3353e = 1;
            this.f3354f = abstractC0977g.mo2957c();
            this.f3356h = false;
            this.f3357i = false;
            this.f3358j = false;
        }

        /* renamed from: g */
        public boolean m5740g() {
            return this.f3360l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3349a + ", mData=" + this.f3350b + ", mItemCount=" + this.f3354f + ", mIsMeasuring=" + this.f3358j + ", mPreviousLayoutItemCount=" + this.f3351c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3352d + ", mStructureChanged=" + this.f3355g + ", mInPreLayout=" + this.f3356h + ", mRunSimpleAnimations=" + this.f3359k + ", mRunPredictiveAnimations=" + this.f3360l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    class RunnableC0969b implements Runnable {
        RunnableC0969b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0982l abstractC0982l = RecyclerView.this.mItemAnimator;
            if (abstractC0982l != null) {
                abstractC0982l.mo5239u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0970b0 {
        /* renamed from: a */
        public abstract View m5739a(C1000v c1000v, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC0971c implements Interpolator {
        animationInterpolatorC0971c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes.dex */
    public class RunnableC0972c0 implements Runnable {

        /* renamed from: f */
        private int f3367f;

        /* renamed from: g */
        private int f3368g;

        /* renamed from: h */
        OverScroller f3369h;

        /* renamed from: i */
        Interpolator f3370i = RecyclerView.sQuinticInterpolator;

        /* renamed from: j */
        private boolean f3371j = false;

        /* renamed from: k */
        private boolean f3372k = false;

        RunnableC0972c0() {
            this.f3369h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* renamed from: a */
        private int m5738a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float m5737b = f2 + (m5737b(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(m5737b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: b */
        private float m5737b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* renamed from: d */
        private void m5735d() {
            RecyclerView.this.removeCallbacks(this);
            C0252s.m8638Y(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void m5736c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3368g = 0;
            this.f3367f = 0;
            Interpolator interpolator = this.f3370i;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3370i = interpolator2;
                this.f3369h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.f3369h.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE);
            m5734e();
        }

        /* renamed from: e */
        void m5734e() {
            if (this.f3371j) {
                this.f3372k = true;
            } else {
                m5735d();
            }
        }

        /* renamed from: f */
        public void m5733f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m5738a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3370i != interpolator) {
                this.f3370i = interpolator;
                this.f3369h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3368g = 0;
            this.f3367f = 0;
            RecyclerView.this.setScrollState(2);
            this.f3369h.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3369h.computeScrollOffset();
            }
            m5734e();
        }

        /* renamed from: g */
        public void m5732g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3369h.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m5732g();
                return;
            }
            this.f3372k = false;
            this.f3371j = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3369h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3367f;
                int i4 = currY - this.f3368g;
                this.f3367f = currX;
                this.f3368g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC1005z abstractC1005z = recyclerView4.mLayout.f3413g;
                    if (abstractC1005z != null && !abstractC1005z.m5481g() && abstractC1005z.m5480h()) {
                        int m5745b = RecyclerView.this.mState.m5745b();
                        if (m5745b == 0) {
                            abstractC1005z.m5474r();
                        } else {
                            if (abstractC1005z.m5482f() >= m5745b) {
                                abstractC1005z.m5476p(m5745b - 1);
                            }
                            abstractC1005z.m5478j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    RecyclerView.this.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC1005z abstractC1005z2 = RecyclerView.this.mLayout.f3413g;
                if ((abstractC1005z2 != null && abstractC1005z2.m5481g()) || !z) {
                    m5734e();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    RunnableC1039e runnableC1039e = recyclerView6.mGapWorker;
                    if (runnableC1039e != null) {
                        runnableC1039e.m5209f(recyclerView6, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m5202b();
                    }
                }
            }
            AbstractC1005z abstractC1005z3 = RecyclerView.this.mLayout.f3413g;
            if (abstractC1005z3 != null && abstractC1005z3.m5481g()) {
                abstractC1005z3.m5478j(0, 0);
            }
            this.f3371j = false;
            if (this.f3372k) {
                m5735d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    class C0973d implements C1061p.InterfaceC1063b {
        C0973d() {
        }

        @Override // androidx.recyclerview.widget.C1061p.InterfaceC1063b
        /* renamed from: a */
        public void mo5067a(AbstractC0974d0 abstractC0974d0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m5579m1(abstractC0974d0.f3376a, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C1061p.InterfaceC1063b
        /* renamed from: b */
        public void mo5066b(AbstractC0974d0 abstractC0974d0, AbstractC0982l.C0985c c0985c, AbstractC0982l.C0985c c0985c2) {
            RecyclerView.this.animateAppearance(abstractC0974d0, c0985c, c0985c2);
        }

        @Override // androidx.recyclerview.widget.C1061p.InterfaceC1063b
        /* renamed from: c */
        public void mo5065c(AbstractC0974d0 abstractC0974d0, AbstractC0982l.C0985c c0985c, AbstractC0982l.C0985c c0985c2) {
            RecyclerView.this.mRecycler.m5523J(abstractC0974d0);
            RecyclerView.this.animateDisappearance(abstractC0974d0, c0985c, c0985c2);
        }

        @Override // androidx.recyclerview.widget.C1061p.InterfaceC1063b
        /* renamed from: d */
        public void mo5064d(AbstractC0974d0 abstractC0974d0, AbstractC0982l.C0985c c0985c, AbstractC0982l.C0985c c0985c2) {
            abstractC0974d0.m5725G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            AbstractC0982l abstractC0982l = recyclerView.mItemAnimator;
            if (z) {
                if (!abstractC0982l.mo5120b(abstractC0974d0, abstractC0974d0, c0985c, c0985c2)) {
                    return;
                }
            } else if (!abstractC0982l.mo5118d(abstractC0974d0, c0985c, c0985c2)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0974d0 {

        /* renamed from: s */
        private static final List<Object> f3375s = Collections.emptyList();

        /* renamed from: a */
        public final View f3376a;

        /* renamed from: b */
        WeakReference<RecyclerView> f3377b;

        /* renamed from: j */
        int f3385j;

        /* renamed from: r */
        RecyclerView f3393r;

        /* renamed from: c */
        int f3378c = -1;

        /* renamed from: d */
        int f3379d = -1;

        /* renamed from: e */
        long f3380e = -1;

        /* renamed from: f */
        int f3381f = -1;

        /* renamed from: g */
        int f3382g = -1;

        /* renamed from: h */
        AbstractC0974d0 f3383h = null;

        /* renamed from: i */
        AbstractC0974d0 f3384i = null;

        /* renamed from: k */
        List<Object> f3386k = null;

        /* renamed from: l */
        List<Object> f3387l = null;

        /* renamed from: m */
        private int f3388m = 0;

        /* renamed from: n */
        C1000v f3389n = null;

        /* renamed from: o */
        boolean f3390o = false;

        /* renamed from: p */
        private int f3391p = 0;

        /* renamed from: q */
        int f3392q = -1;

        public AbstractC0974d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f3376a = view;
        }

        /* renamed from: g */
        private void m5713g() {
            if (this.f3386k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3386k = arrayList;
                this.f3387l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: A */
        void m5731A(int i, boolean z) {
            if (this.f3379d == -1) {
                this.f3379d = this.f3378c;
            }
            if (this.f3382g == -1) {
                this.f3382g = this.f3378c;
            }
            if (z) {
                this.f3382g += i;
            }
            this.f3378c += i;
            if (this.f3376a.getLayoutParams() != null) {
                ((C0993p) this.f3376a.getLayoutParams()).f3433c = true;
            }
        }

        /* renamed from: B */
        void m5730B(RecyclerView recyclerView) {
            int i = this.f3392q;
            if (i == -1) {
                i = C0252s.m8596u(this.f3376a);
            }
            this.f3391p = i;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* renamed from: C */
        void m5729C(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.f3391p);
            this.f3391p = 0;
        }

        /* renamed from: D */
        void m5728D() {
            this.f3385j = 0;
            this.f3378c = -1;
            this.f3379d = -1;
            this.f3380e = -1L;
            this.f3382g = -1;
            this.f3388m = 0;
            this.f3383h = null;
            this.f3384i = null;
            m5716d();
            this.f3391p = 0;
            this.f3392q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* renamed from: E */
        void m5727E() {
            if (this.f3379d == -1) {
                this.f3379d = this.f3378c;
            }
        }

        /* renamed from: F */
        void m5726F(int i, int i2) {
            this.f3385j = (i & i2) | (this.f3385j & (~i2));
        }

        /* renamed from: G */
        public final void m5725G(boolean z) {
            int i;
            int i2 = this.f3388m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f3388m = i3;
            if (i3 < 0) {
                this.f3388m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3385j | 16;
            } else if (!z || this.f3388m != 0) {
                return;
            } else {
                i = this.f3385j & (-17);
            }
            this.f3385j = i;
        }

        /* renamed from: H */
        void m5724H(C1000v c1000v, boolean z) {
            this.f3389n = c1000v;
            this.f3390o = z;
        }

        /* renamed from: I */
        boolean m5723I() {
            return (this.f3385j & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean m5722J() {
            return (this.f3385j & 128) != 0;
        }

        /* renamed from: K */
        void m5721K() {
            this.f3389n.m5523J(this);
        }

        /* renamed from: L */
        boolean m5720L() {
            return (this.f3385j & 32) != 0;
        }

        /* renamed from: a */
        void m5719a(Object obj) {
            if (obj == null) {
                m5718b(1024);
            } else if ((1024 & this.f3385j) == 0) {
                m5713g();
                this.f3386k.add(obj);
            }
        }

        /* renamed from: b */
        void m5718b(int i) {
            this.f3385j = i | this.f3385j;
        }

        /* renamed from: c */
        void m5717c() {
            this.f3379d = -1;
            this.f3382g = -1;
        }

        /* renamed from: d */
        void m5716d() {
            List<Object> list = this.f3386k;
            if (list != null) {
                list.clear();
            }
            this.f3385j &= -1025;
        }

        /* renamed from: e */
        void m5715e() {
            this.f3385j &= -33;
        }

        /* renamed from: f */
        void m5714f() {
            this.f3385j &= -257;
        }

        /* renamed from: h */
        boolean m5712h() {
            return (this.f3385j & 16) == 0 && C0252s.m8653J(this.f3376a);
        }

        /* renamed from: i */
        void m5711i(int i, int i2, boolean z) {
            m5718b(8);
            m5731A(i2, z);
            this.f3378c = i;
        }

        /* renamed from: j */
        public final int m5710j() {
            RecyclerView recyclerView = this.f3393r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: k */
        public final long m5709k() {
            return this.f3380e;
        }

        /* renamed from: l */
        public final int m5708l() {
            return this.f3381f;
        }

        /* renamed from: m */
        public final int m5707m() {
            int i = this.f3382g;
            return i == -1 ? this.f3378c : i;
        }

        /* renamed from: n */
        public final int m5706n() {
            return this.f3379d;
        }

        /* renamed from: o */
        List<Object> m5705o() {
            if ((this.f3385j & 1024) == 0) {
                List<Object> list = this.f3386k;
                return (list == null || list.size() == 0) ? f3375s : this.f3387l;
            }
            return f3375s;
        }

        /* renamed from: p */
        boolean m5704p(int i) {
            return (i & this.f3385j) != 0;
        }

        /* renamed from: q */
        boolean m5703q() {
            return (this.f3385j & 512) != 0 || m5700t();
        }

        /* renamed from: r */
        boolean m5702r() {
            return (this.f3376a.getParent() == null || this.f3376a.getParent() == this.f3393r) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean m5701s() {
            return (this.f3385j & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean m5700t() {
            return (this.f3385j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3378c + " id=" + this.f3380e + ", oldPos=" + this.f3379d + ", pLpos:" + this.f3382g);
            if (m5697w()) {
                sb.append(" scrap ");
                sb.append(this.f3390o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m5700t()) {
                sb.append(" invalid");
            }
            if (!m5701s()) {
                sb.append(" unbound");
            }
            if (m5694z()) {
                sb.append(" update");
            }
            if (m5698v()) {
                sb.append(" removed");
            }
            if (m5722J()) {
                sb.append(" ignored");
            }
            if (m5696x()) {
                sb.append(" tmpDetached");
            }
            if (!m5699u()) {
                sb.append(" not recyclable(" + this.f3388m + ")");
            }
            if (m5703q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3376a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean m5699u() {
            return (this.f3385j & 16) == 0 && !C0252s.m8653J(this.f3376a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean m5698v() {
            return (this.f3385j & 8) != 0;
        }

        /* renamed from: w */
        boolean m5697w() {
            return this.f3389n != null;
        }

        /* renamed from: x */
        boolean m5696x() {
            return (this.f3385j & 256) != 0;
        }

        /* renamed from: y */
        boolean m5695y() {
            return (this.f3385j & 2) != 0;
        }

        /* renamed from: z */
        boolean m5694z() {
            return (this.f3385j & 2) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C0975e implements C1020b.InterfaceC1022b {
        C0975e() {
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: a */
        public int mo5264a() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: b */
        public View mo5263b(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: c */
        public void mo5262c(View view) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.m5730B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: d */
        public AbstractC0974d0 mo5261d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: e */
        public void mo5260e(int i) {
            AbstractC0974d0 childViewHolderInt;
            View mo5263b = mo5263b(i);
            if (mo5263b != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(mo5263b)) != null) {
                if (childViewHolderInt.m5696x() && !childViewHolderInt.m5722J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.m5718b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: f */
        public void mo5259f(View view) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.m5729C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: g */
        public void mo5258g(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: h */
        public void mo5257h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: i */
        public void mo5256i() {
            int mo5264a = mo5264a();
            for (int i = 0; i < mo5264a; i++) {
                View mo5263b = mo5263b(i);
                RecyclerView.this.dispatchChildDetached(mo5263b);
                mo5263b.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: j */
        public void mo5255j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.m5696x() && !childViewHolderInt.m5722J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.m5714f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C1020b.InterfaceC1022b
        /* renamed from: k */
        public int mo5254k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C0976f implements C1017a.InterfaceC1018a {
        C0976f() {
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: a */
        public void mo5301a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: b */
        public void mo5300b(C1017a.C1019b c1019b) {
            m5693i(c1019b);
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: c */
        public AbstractC0974d0 mo5299c(int i) {
            AbstractC0974d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.m5279n(findViewHolderForPosition.f3376a)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: d */
        public void mo5298d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: e */
        public void mo5297e(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: f */
        public void mo5296f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3352d += i2;
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: g */
        public void mo5295g(C1017a.C1019b c1019b) {
            m5693i(c1019b);
        }

        @Override // androidx.recyclerview.widget.C1017a.InterfaceC1018a
        /* renamed from: h */
        public void mo5294h(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: i */
        void m5693i(C1017a.C1019b c1019b) {
            int i = c1019b.f3531a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo5434R0(recyclerView, c1019b.f3532b, c1019b.f3534d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo5427U0(recyclerView2, c1019b.f3532b, c1019b.f3534d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo5424W0(recyclerView3, c1019b.f3532b, c1019b.f3534d, c1019b.f3533c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo5429T0(recyclerView4, c1019b.f3532b, c1019b.f3534d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0977g<VH extends AbstractC0974d0> {

        /* renamed from: a */
        private final C0978h f3396a = new C0978h();

        /* renamed from: b */
        private boolean f3397b = false;

        /* renamed from: a */
        public final void m5692a(VH vh, int i) {
            vh.f3378c = i;
            if (m5688g()) {
                vh.f3380e = mo2984d(i);
            }
            vh.m5726F(1, 519);
            C0146c.m8965a(RecyclerView.TRACE_BIND_VIEW_TAG);
            m5685k(vh, i, vh.m5705o());
            vh.m5716d();
            ViewGroup.LayoutParams layoutParams = vh.f3376a.getLayoutParams();
            if (layoutParams instanceof C0993p) {
                ((C0993p) layoutParams).f3433c = true;
            }
            C0146c.m8964b();
        }

        /* renamed from: b */
        public final VH m5691b(ViewGroup viewGroup, int i) {
            try {
                C0146c.m8965a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH mo2955l = mo2955l(viewGroup, i);
                if (mo2955l.f3376a.getParent() == null) {
                    mo2955l.f3381f = i;
                    return mo2955l;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0146c.m8964b();
            }
        }

        /* renamed from: c */
        public abstract int mo2957c();

        /* renamed from: d */
        public long mo2984d(int i) {
            return -1L;
        }

        /* renamed from: e */
        public int m5690e(int i) {
            return 0;
        }

        /* renamed from: f */
        public final boolean m5689f() {
            return this.f3396a.m5676a();
        }

        /* renamed from: g */
        public final boolean m5688g() {
            return this.f3397b;
        }

        /* renamed from: h */
        public final void m5687h() {
            this.f3396a.m5675b();
        }

        /* renamed from: i */
        public void m5686i(RecyclerView recyclerView) {
        }

        /* renamed from: j */
        public abstract void mo2956j(VH vh, int i);

        /* renamed from: k */
        public void m5685k(VH vh, int i, List<Object> list) {
            mo2956j(vh, i);
        }

        /* renamed from: l */
        public abstract VH mo2955l(ViewGroup viewGroup, int i);

        /* renamed from: m */
        public void m5684m(RecyclerView recyclerView) {
        }

        /* renamed from: n */
        public boolean m5683n(VH vh) {
            return false;
        }

        /* renamed from: o */
        public void m5682o(VH vh) {
        }

        /* renamed from: p */
        public void m5681p(VH vh) {
        }

        /* renamed from: q */
        public void m5680q(VH vh) {
        }

        /* renamed from: r */
        public void m5679r(AbstractC0979i abstractC0979i) {
            this.f3396a.registerObserver(abstractC0979i);
        }

        /* renamed from: s */
        public void m5678s(boolean z) {
            if (m5689f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f3397b = z;
        }

        /* renamed from: t */
        public void m5677t(AbstractC0979i abstractC0979i) {
            this.f3396a.unregisterObserver(abstractC0979i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static class C0978h extends Observable<AbstractC0979i> {
        C0978h() {
        }

        /* renamed from: a */
        public boolean m5676a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m5675b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0979i) ((Observable) this).mObservers.get(size)).mo5492a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0979i {
        /* renamed from: a */
        public void mo5492a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0980j {
        /* renamed from: a */
        int m5674a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public static class C0981k {
        /* renamed from: a */
        protected EdgeEffect m5673a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0982l {

        /* renamed from: a */
        private InterfaceC0984b f3398a = null;

        /* renamed from: b */
        private ArrayList<InterfaceC0983a> f3399b = new ArrayList<>();

        /* renamed from: c */
        private long f3400c = 120;

        /* renamed from: d */
        private long f3401d = 120;

        /* renamed from: e */
        private long f3402e = 250;

        /* renamed from: f */
        private long f3403f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        /* loaded from: classes.dex */
        public interface InterfaceC0983a {
            /* renamed from: a */
            void m5660a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        /* loaded from: classes.dex */
        public interface InterfaceC0984b {
            /* renamed from: a */
            void mo5657a(AbstractC0974d0 abstractC0974d0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        /* loaded from: classes.dex */
        public static class C0985c {

            /* renamed from: a */
            public int f3404a;

            /* renamed from: b */
            public int f3405b;

            /* renamed from: a */
            public C0985c m5659a(AbstractC0974d0 abstractC0974d0) {
                m5658b(abstractC0974d0, 0);
                return this;
            }

            /* renamed from: b */
            public C0985c m5658b(AbstractC0974d0 abstractC0974d0, int i) {
                View view = abstractC0974d0.f3376a;
                this.f3404a = view.getLeft();
                this.f3405b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5672e(AbstractC0974d0 abstractC0974d0) {
            int i = abstractC0974d0.f3385j & 14;
            if (abstractC0974d0.m5700t()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int m5706n = abstractC0974d0.m5706n();
                int m5710j = abstractC0974d0.m5710j();
                return (m5706n == -1 || m5710j == -1 || m5706n == m5710j) ? i : i | 2048;
            }
            return i;
        }

        /* renamed from: a */
        public abstract boolean mo5121a(AbstractC0974d0 abstractC0974d0, C0985c c0985c, C0985c c0985c2);

        /* renamed from: b */
        public abstract boolean mo5120b(AbstractC0974d0 abstractC0974d0, AbstractC0974d0 abstractC0974d02, C0985c c0985c, C0985c c0985c2);

        /* renamed from: c */
        public abstract boolean mo5119c(AbstractC0974d0 abstractC0974d0, C0985c c0985c, C0985c c0985c2);

        /* renamed from: d */
        public abstract boolean mo5118d(AbstractC0974d0 abstractC0974d0, C0985c c0985c, C0985c c0985c2);

        /* renamed from: f */
        public abstract boolean mo5117f(AbstractC0974d0 abstractC0974d0);

        /* renamed from: g */
        public boolean mo5243g(AbstractC0974d0 abstractC0974d0, List<Object> list) {
            return mo5117f(abstractC0974d0);
        }

        /* renamed from: h */
        public final void m5671h(AbstractC0974d0 abstractC0974d0) {
            m5664r(abstractC0974d0);
            InterfaceC0984b interfaceC0984b = this.f3398a;
            if (interfaceC0984b != null) {
                interfaceC0984b.mo5657a(abstractC0974d0);
            }
        }

        /* renamed from: i */
        public final void m5670i() {
            int size = this.f3399b.size();
            for (int i = 0; i < size; i++) {
                this.f3399b.get(i).m5660a();
            }
            this.f3399b.clear();
        }

        /* renamed from: j */
        public abstract void mo5242j(AbstractC0974d0 abstractC0974d0);

        /* renamed from: k */
        public abstract void mo5241k();

        /* renamed from: l */
        public long m5669l() {
            return this.f3400c;
        }

        /* renamed from: m */
        public long m5668m() {
            return this.f3403f;
        }

        /* renamed from: n */
        public long m5667n() {
            return this.f3402e;
        }

        /* renamed from: o */
        public long m5666o() {
            return this.f3401d;
        }

        /* renamed from: p */
        public abstract boolean mo5240p();

        /* renamed from: q */
        public C0985c m5665q() {
            return new C0985c();
        }

        /* renamed from: r */
        public void m5664r(AbstractC0974d0 abstractC0974d0) {
        }

        /* renamed from: s */
        public C0985c m5663s(C0968a0 c0968a0, AbstractC0974d0 abstractC0974d0) {
            C0985c m5665q = m5665q();
            m5665q.m5659a(abstractC0974d0);
            return m5665q;
        }

        /* renamed from: t */
        public C0985c m5662t(C0968a0 c0968a0, AbstractC0974d0 abstractC0974d0, int i, List<Object> list) {
            C0985c m5665q = m5665q();
            m5665q.m5659a(abstractC0974d0);
            return m5665q;
        }

        /* renamed from: u */
        public abstract void mo5239u();

        /* renamed from: v */
        void m5661v(InterfaceC0984b interfaceC0984b) {
            this.f3398a = interfaceC0984b;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    private class C0986m implements AbstractC0982l.InterfaceC0984b {
        C0986m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l.InterfaceC0984b
        /* renamed from: a */
        public void mo5657a(AbstractC0974d0 abstractC0974d0) {
            abstractC0974d0.m5725G(true);
            if (abstractC0974d0.f3383h != null && abstractC0974d0.f3384i == null) {
                abstractC0974d0.f3383h = null;
            }
            abstractC0974d0.f3384i = null;
            if (abstractC0974d0.m5723I() || RecyclerView.this.removeAnimatingView(abstractC0974d0.f3376a) || !abstractC0974d0.m5696x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0974d0.f3376a, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0987n {
        @Deprecated
        /* renamed from: d */
        public void m5656d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void m5655e(Rect rect, View view, RecyclerView recyclerView, C0968a0 c0968a0) {
            m5656d(rect, ((C0993p) view.getLayoutParams()).m5550a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void m5654f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo3038g(Canvas canvas, RecyclerView recyclerView, C0968a0 c0968a0) {
            m5654f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void m5653h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo5232i(Canvas canvas, RecyclerView recyclerView, C0968a0 c0968a0) {
            m5653h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0988o {

        /* renamed from: a */
        C1020b f3407a;

        /* renamed from: b */
        RecyclerView f3408b;

        /* renamed from: g */
        AbstractC1005z f3413g;

        /* renamed from: m */
        int f3419m;

        /* renamed from: n */
        boolean f3420n;

        /* renamed from: o */
        private int f3421o;

        /* renamed from: p */
        private int f3422p;

        /* renamed from: q */
        private int f3423q;

        /* renamed from: r */
        private int f3424r;

        /* renamed from: c */
        private final C1058o.InterfaceC1060b f3409c = new C0989a();

        /* renamed from: d */
        private final C1058o.InterfaceC1060b f3410d = new C0990b();

        /* renamed from: e */
        C1058o f3411e = new C1058o(this.f3409c);

        /* renamed from: f */
        C1058o f3412f = new C1058o(this.f3410d);

        /* renamed from: h */
        boolean f3414h = false;

        /* renamed from: i */
        boolean f3415i = false;

        /* renamed from: j */
        boolean f3416j = false;

        /* renamed from: k */
        private boolean f3417k = true;

        /* renamed from: l */
        private boolean f3418l = true;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        /* loaded from: classes.dex */
        class C0989a implements C1058o.InterfaceC1060b {
            C0989a() {
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: a */
            public int mo5092a() {
                return AbstractC0988o.this.m5575o0() - AbstractC0988o.this.m5596f0();
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: b */
            public View mo5091b(int i) {
                return AbstractC0988o.this.m5634I(i);
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: c */
            public int mo5090c(View view) {
                return AbstractC0988o.this.m5621Q(view) - ((ViewGroup.MarginLayoutParams) ((C0993p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: d */
            public int mo5089d() {
                return AbstractC0988o.this.m5598e0();
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: e */
            public int mo5088e(View view) {
                return AbstractC0988o.this.m5617T(view) + ((ViewGroup.MarginLayoutParams) ((C0993p) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        /* loaded from: classes.dex */
        class C0990b implements C1058o.InterfaceC1060b {
            C0990b() {
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: a */
            public int mo5092a() {
                return AbstractC0988o.this.m5613W() - AbstractC0988o.this.m5600d0();
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: b */
            public View mo5091b(int i) {
                return AbstractC0988o.this.m5634I(i);
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: c */
            public int mo5090c(View view) {
                return AbstractC0988o.this.m5616U(view) - ((ViewGroup.MarginLayoutParams) ((C0993p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: d */
            public int mo5089d() {
                return AbstractC0988o.this.m5594g0();
            }

            @Override // androidx.recyclerview.widget.C1058o.InterfaceC1060b
            /* renamed from: e */
            public int mo5088e(View view) {
                return AbstractC0988o.this.m5624O(view) + ((ViewGroup.MarginLayoutParams) ((C0993p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        /* loaded from: classes.dex */
        public interface InterfaceC0991c {
            /* renamed from: a */
            void mo5203a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        /* loaded from: classes.dex */
        public static class C0992d {

            /* renamed from: a */
            public int f3427a;

            /* renamed from: b */
            public int f3428b;

            /* renamed from: c */
            public boolean f3429c;

            /* renamed from: d */
            public boolean f3430d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m5631K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0988o.m5631K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m5629L(View view, Rect rect) {
            int[] iArr = new int[2];
            int m5598e0 = m5598e0();
            int m5594g0 = m5594g0();
            int m5575o0 = m5575o0() - m5596f0();
            int m5613W = m5613W() - m5600d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - m5598e0;
            int min = Math.min(0, i);
            int i2 = top - m5594g0;
            int min2 = Math.min(0, i2);
            int i3 = width - m5575o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m5613W);
            if (m5610Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m5597f(View view, int i, boolean z) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.m5698v()) {
                this.f3408b.mViewInfoStore.m5086b(childViewHolderInt);
            } else {
                this.f3408b.mViewInfoStore.m5072p(childViewHolderInt);
            }
            C0993p c0993p = (C0993p) view.getLayoutParams();
            if (childViewHolderInt.m5720L() || childViewHolderInt.m5697w()) {
                if (childViewHolderInt.m5697w()) {
                    childViewHolderInt.m5721K();
                } else {
                    childViewHolderInt.m5715e();
                }
                this.f3407a.m5290c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3408b) {
                int m5280m = this.f3407a.m5280m(view);
                if (i == -1) {
                    i = this.f3407a.m5286g();
                }
                if (m5280m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3408b.indexOfChild(view) + this.f3408b.exceptionLabel());
                } else if (m5280m != i) {
                    this.f3408b.mLayout.m5648B0(m5280m, i);
                }
            } else {
                this.f3407a.m5292a(view, i, false);
                c0993p.f3433c = true;
                AbstractC1005z abstractC1005z = this.f3413g;
                if (abstractC1005z != null && abstractC1005z.m5480h()) {
                    this.f3413g.m5477k(view);
                }
            }
            if (c0993p.f3434d) {
                childViewHolderInt.f3376a.invalidate();
                c0993p.f3434d = false;
            }
        }

        /* renamed from: i0 */
        public static C0992d m5588i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C0992d c0992d = new C0992d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0316c.RecyclerView, i, i2);
            c0992d.f3427a = obtainStyledAttributes.getInt(C0316c.RecyclerView_android_orientation, 1);
            c0992d.f3428b = obtainStyledAttributes.getInt(C0316c.RecyclerView_spanCount, 1);
            c0992d.f3429c = obtainStyledAttributes.getBoolean(C0316c.RecyclerView_reverseLayout, false);
            c0992d.f3430d = obtainStyledAttributes.getBoolean(C0316c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return c0992d;
        }

        /* renamed from: n */
        public static int m5578n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: t0 */
        private boolean m5565t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m5598e0 = m5598e0();
            int m5594g0 = m5594g0();
            int m5575o0 = m5575o0() - m5596f0();
            int m5613W = m5613W() - m5600d0();
            Rect rect = this.f3408b.mTempRect;
            m5622P(focusedChild, rect);
            return rect.left - i < m5575o0 && rect.right - i > m5598e0 && rect.top - i2 < m5613W && rect.bottom - i2 > m5594g0;
        }

        /* renamed from: v1 */
        private void m5560v1(C1000v c1000v, int i, View view) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.m5722J()) {
                return;
            }
            if (childViewHolderInt.m5700t() && !childViewHolderInt.m5698v() && !this.f3408b.mAdapter.m5688g()) {
                m5569q1(i);
                c1000v.m5530C(childViewHolderInt);
                return;
            }
            m5557x(i);
            c1000v.m5529D(view);
            this.f3408b.mViewInfoStore.m5077k(childViewHolderInt);
        }

        /* renamed from: w0 */
        private static boolean m5558w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: y */
        private void m5555y(int i, View view) {
            this.f3407a.m5289d(i);
        }

        /* renamed from: A */
        void m5652A(RecyclerView recyclerView, C1000v c1000v) {
            this.f3415i = false;
            mo5454I0(recyclerView, c1000v);
        }

        /* renamed from: A0 */
        public void m5651A0(View view, int i, int i2) {
            C0993p c0993p = (C0993p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f3408b.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int m5631K = m5631K(m5575o0(), m5572p0(), m5598e0() + m5596f0() + ((ViewGroup.MarginLayoutParams) c0993p).leftMargin + ((ViewGroup.MarginLayoutParams) c0993p).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0993p).width, mo5402k());
            int m5631K2 = m5631K(m5613W(), m5612X(), m5594g0() + m5600d0() + ((ViewGroup.MarginLayoutParams) c0993p).topMargin + ((ViewGroup.MarginLayoutParams) c0993p).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0993p).height, mo5399l());
            if (m5641F1(view, m5631K, m5631K2, c0993p)) {
                view.measure(m5631K, m5631K2);
            }
        }

        /* renamed from: A1 */
        void m5650A1(int i, int i2) {
            this.f3423q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3421o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3423q = 0;
            }
            this.f3424r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3422p = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.f3424r = 0;
        }

        /* renamed from: B */
        public View m5649B(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f3407a.m5279n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: B0 */
        public void m5648B0(int i, int i2) {
            View m5634I = m5634I(i);
            if (m5634I != null) {
                m5557x(i);
                m5592h(m5634I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3408b.toString());
        }

        /* renamed from: B1 */
        public void m5647B1(int i, int i2) {
            this.f3408b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo5646C(int i) {
            int m5633J = m5633J();
            for (int i2 = 0; i2 < m5633J; i2++) {
                View m5634I = m5634I(i2);
                AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m5634I);
                if (childViewHolderInt != null && childViewHolderInt.m5707m() == i && !childViewHolderInt.m5722J() && (this.f3408b.mState.m5742e() || !childViewHolderInt.m5698v())) {
                    return m5634I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo5466C0(int i) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: C1 */
        public void mo5465C1(Rect rect, int i, int i2) {
            m5647B1(m5578n(i, rect.width() + m5598e0() + m5596f0(), m5602c0()), m5578n(i2, rect.height() + m5594g0() + m5600d0(), m5605b0()));
        }

        /* renamed from: D */
        public abstract C0993p mo5463D();

        /* renamed from: D0 */
        public void mo5462D0(int i) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: D1 */
        void m5645D1(int i, int i2) {
            int m5633J = m5633J();
            if (m5633J == 0) {
                this.f3408b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = RecyclerView.UNDEFINED_DURATION;
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = Reader.READ_DONE;
            int i6 = Reader.READ_DONE;
            for (int i7 = 0; i7 < m5633J; i7++) {
                View m5634I = m5634I(i7);
                Rect rect = this.f3408b.mTempRect;
                m5622P(m5634I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3408b.mTempRect.set(i5, i6, i3, i4);
            mo5465C1(this.f3408b.mTempRect, i, i2);
        }

        /* renamed from: E */
        public C0993p mo5460E(Context context, AttributeSet attributeSet) {
            return new C0993p(context, attributeSet);
        }

        /* renamed from: E0 */
        public void m5644E0(AbstractC0977g abstractC0977g, AbstractC0977g abstractC0977g2) {
        }

        /* renamed from: E1 */
        void m5643E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3408b = null;
                this.f3407a = null;
                height = 0;
                this.f3423q = 0;
            } else {
                this.f3408b = recyclerView;
                this.f3407a = recyclerView.mChildHelper;
                this.f3423q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3424r = height;
            this.f3421o = 1073741824;
            this.f3422p = 1073741824;
        }

        /* renamed from: F */
        public C0993p mo5458F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0993p ? new C0993p((C0993p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0993p((ViewGroup.MarginLayoutParams) layoutParams) : new C0993p(layoutParams);
        }

        /* renamed from: F0 */
        public boolean m5642F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F1 */
        public boolean m5641F1(View view, int i, int i2, C0993p c0993p) {
            return (!view.isLayoutRequested() && this.f3417k && m5558w0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0993p).width) && m5558w0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0993p).height)) ? false : true;
        }

        /* renamed from: G */
        public int m5640G() {
            return -1;
        }

        /* renamed from: G0 */
        public void m5639G0(RecyclerView recyclerView) {
        }

        /* renamed from: G1 */
        boolean mo5638G1() {
            return false;
        }

        /* renamed from: H */
        public int m5637H(View view) {
            return ((C0993p) view.getLayoutParams()).f3432b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void m5636H0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H1 */
        public boolean m5635H1(View view, int i, int i2, C0993p c0993p) {
            return (this.f3417k && m5558w0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0993p).width) && m5558w0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0993p).height)) ? false : true;
        }

        /* renamed from: I */
        public View m5634I(int i) {
            C1020b c1020b = this.f3407a;
            if (c1020b != null) {
                return c1020b.m5287f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo5454I0(RecyclerView recyclerView, C1000v c1000v) {
            m5636H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo2974I1(RecyclerView recyclerView, C0968a0 c0968a0, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int m5633J() {
            C1020b c1020b = this.f3407a;
            if (c1020b != null) {
                return c1020b.m5286g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo5452J0(View view, int i, C1000v c1000v, C0968a0 c0968a0) {
            return null;
        }

        /* renamed from: J1 */
        public void m5632J1(AbstractC1005z abstractC1005z) {
            AbstractC1005z abstractC1005z2 = this.f3413g;
            if (abstractC1005z2 != null && abstractC1005z != abstractC1005z2 && abstractC1005z2.m5480h()) {
                this.f3413g.m5474r();
            }
            this.f3413g = abstractC1005z;
            abstractC1005z.m5475q(this.f3408b, this);
        }

        /* renamed from: K0 */
        public void mo5450K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3408b;
            m5628L0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* renamed from: K1 */
        void m5630K1() {
            AbstractC1005z abstractC1005z = this.f3413g;
            if (abstractC1005z != null) {
                abstractC1005z.m5474r();
            }
        }

        /* renamed from: L0 */
        public void m5628L0(C1000v c1000v, C0968a0 c0968a0, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3408b.canScrollVertically(-1) && !this.f3408b.canScrollHorizontally(-1) && !this.f3408b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0977g abstractC0977g = this.f3408b.mAdapter;
            if (abstractC0977g != null) {
                accessibilityEvent.setItemCount(abstractC0977g.mo2957c());
            }
        }

        /* renamed from: L1 */
        public boolean mo5448L1() {
            return false;
        }

        /* renamed from: M */
        public boolean m5627M() {
            RecyclerView recyclerView = this.f3408b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M0 */
        public void m5626M0(C0217c c0217c) {
            RecyclerView recyclerView = this.f3408b;
            m5625N0(recyclerView.mRecycler, recyclerView.mState, c0217c);
        }

        /* renamed from: N */
        public int mo5444N(C1000v c1000v, C0968a0 c0968a0) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo5402k()) {
                return 1;
            }
            return this.f3408b.mAdapter.mo2957c();
        }

        /* renamed from: N0 */
        public void m5625N0(C1000v c1000v, C0968a0 c0968a0, C0217c c0217c) {
            if (this.f3408b.canScrollVertically(-1) || this.f3408b.canScrollHorizontally(-1)) {
                c0217c.m8773a(8192);
                c0217c.m8744o0(true);
            }
            if (this.f3408b.canScrollVertically(1) || this.f3408b.canScrollHorizontally(1)) {
                c0217c.m8773a(4096);
                c0217c.m8744o0(true);
            }
            c0217c.m8775Y(C0217c.C0219b.m8721a(mo5401k0(c1000v, c0968a0), mo5444N(c1000v, c0968a0), m5561v0(c1000v, c0968a0), m5582l0(c1000v, c0968a0)));
        }

        /* renamed from: O */
        public int m5624O(View view) {
            return view.getBottom() + m5637H(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void m5623O0(View view, C0217c c0217c) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.m5698v() || this.f3407a.m5279n(childViewHolderInt.f3376a)) {
                return;
            }
            RecyclerView recyclerView = this.f3408b;
            mo5439P0(recyclerView.mRecycler, recyclerView.mState, view, c0217c);
        }

        /* renamed from: P */
        public void m5622P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: P0 */
        public void mo5439P0(C1000v c1000v, C0968a0 c0968a0, View view, C0217c c0217c) {
            c0217c.m8774Z(C0217c.C0220c.m8720a(mo5399l() ? m5591h0(view) : 0, 1, mo5402k() ? m5591h0(view) : 0, 1, false, false));
        }

        /* renamed from: Q */
        public int m5621Q(View view) {
            return view.getLeft() - m5608a0(view);
        }

        /* renamed from: Q0 */
        public View m5620Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int m5619R(View view) {
            Rect rect = ((C0993p) view.getLayoutParams()).f3432b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo5434R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int m5618S(View view) {
            Rect rect = ((C0993p) view.getLayoutParams()).f3432b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo5431S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int m5617T(View view) {
            return view.getRight() + m5585j0(view);
        }

        /* renamed from: T0 */
        public void mo5429T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int m5616U(View view) {
            return view.getTop() - m5580m0(view);
        }

        /* renamed from: U0 */
        public void mo5427U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View m5615V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3407a.m5279n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void m5614V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int m5613W() {
            return this.f3424r;
        }

        /* renamed from: W0 */
        public void mo5424W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            m5614V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int m5612X() {
            return this.f3422p;
        }

        /* renamed from: X0 */
        public void mo5422X0(C1000v c1000v, C0968a0 c0968a0) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int m5611Y() {
            RecyclerView recyclerView = this.f3408b;
            AbstractC0977g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo2957c();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo5420Y0(C0968a0 c0968a0) {
        }

        /* renamed from: Z */
        public int m5610Z() {
            return C0252s.m8592w(this.f3408b);
        }

        /* renamed from: Z0 */
        public void m5609Z0(C1000v c1000v, C0968a0 c0968a0, int i, int i2) {
            this.f3408b.defaultOnMeasure(i, i2);
        }

        /* renamed from: a0 */
        public int m5608a0(View view) {
            return ((C0993p) view.getLayoutParams()).f3432b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean m5607a1(RecyclerView recyclerView, View view, View view2) {
            return m5556x0() || recyclerView.isComputingLayout();
        }

        /* renamed from: b */
        public void m5606b(View view) {
            m5603c(view, -1);
        }

        /* renamed from: b0 */
        public int m5605b0() {
            return C0252s.m8590x(this.f3408b);
        }

        /* renamed from: b1 */
        public boolean m5604b1(RecyclerView recyclerView, C0968a0 c0968a0, View view, View view2) {
            return m5607a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void m5603c(View view, int i) {
            m5597f(view, i, true);
        }

        /* renamed from: c0 */
        public int m5602c0() {
            return C0252s.m8588y(this.f3408b);
        }

        /* renamed from: c1 */
        public void mo5414c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void m5601d(View view) {
            m5599e(view, -1);
        }

        /* renamed from: d0 */
        public int m5600d0() {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo5412d1() {
            return null;
        }

        /* renamed from: e */
        public void m5599e(View view, int i) {
            m5597f(view, i, false);
        }

        /* renamed from: e0 */
        public int m5598e0() {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo5410e1(int i) {
        }

        /* renamed from: f0 */
        public int m5596f0() {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: f1 */
        void m5595f1(AbstractC1005z abstractC1005z) {
            if (this.f3413g == abstractC1005z) {
                this.f3413g = null;
            }
        }

        /* renamed from: g */
        public void mo5407g(String str) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: g0 */
        public int m5594g0() {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g1 */
        public boolean m5593g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3408b;
            return m5590h1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* renamed from: h */
        public void m5592h(View view, int i) {
            m5589i(view, i, (C0993p) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int m5591h0(View view) {
            return ((C0993p) view.getLayoutParams()).m5550a();
        }

        /* renamed from: h1 */
        public boolean m5590h1(C1000v c1000v, C0968a0 c0968a0, int i, Bundle bundle) {
            int m5613W;
            int m5575o0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                m5613W = recyclerView.canScrollVertically(1) ? (m5613W() - m5594g0()) - m5600d0() : 0;
                if (this.f3408b.canScrollHorizontally(1)) {
                    m5575o0 = (m5575o0() - m5598e0()) - m5596f0();
                    i2 = m5613W;
                    i3 = m5575o0;
                }
                i2 = m5613W;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                m5613W = recyclerView.canScrollVertically(-1) ? -((m5613W() - m5594g0()) - m5600d0()) : 0;
                if (this.f3408b.canScrollHorizontally(-1)) {
                    m5575o0 = -((m5575o0() - m5598e0()) - m5596f0());
                    i2 = m5613W;
                    i3 = m5575o0;
                }
                i2 = m5613W;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f3408b.smoothScrollBy(i3, i2, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        /* renamed from: i */
        public void m5589i(View view, int i, C0993p c0993p) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.m5698v()) {
                this.f3408b.mViewInfoStore.m5086b(childViewHolderInt);
            } else {
                this.f3408b.mViewInfoStore.m5072p(childViewHolderInt);
            }
            this.f3407a.m5290c(view, i, c0993p, childViewHolderInt.m5698v());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i1 */
        public boolean m5587i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3408b;
            return m5584j1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: j */
        public void m5586j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: j0 */
        public int m5585j0(View view) {
            return ((C0993p) view.getLayoutParams()).f3432b.right;
        }

        /* renamed from: j1 */
        public boolean m5584j1(C1000v c1000v, C0968a0 c0968a0, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo5402k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo5401k0(C1000v c1000v, C0968a0 c0968a0) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo5399l()) {
                return 1;
            }
            return this.f3408b.mAdapter.mo2957c();
        }

        /* renamed from: k1 */
        public void m5583k1(C1000v c1000v) {
            for (int m5633J = m5633J() - 1; m5633J >= 0; m5633J--) {
                if (!RecyclerView.getChildViewHolderInt(m5634I(m5633J)).m5722J()) {
                    m5576n1(m5633J, c1000v);
                }
            }
        }

        /* renamed from: l */
        public boolean mo5399l() {
            return false;
        }

        /* renamed from: l0 */
        public int m5582l0(C1000v c1000v, C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: l1 */
        void m5581l1(C1000v c1000v) {
            int m5510j = c1000v.m5510j();
            for (int i = m5510j - 1; i >= 0; i--) {
                View m5506n = c1000v.m5506n(i);
                AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m5506n);
                if (!childViewHolderInt.m5722J()) {
                    childViewHolderInt.m5725G(false);
                    if (childViewHolderInt.m5696x()) {
                        this.f3408b.removeDetachedView(m5506n, false);
                    }
                    AbstractC0982l abstractC0982l = this.f3408b.mItemAnimator;
                    if (abstractC0982l != null) {
                        abstractC0982l.mo5242j(childViewHolderInt);
                    }
                    childViewHolderInt.m5725G(true);
                    c1000v.m5495y(m5506n);
                }
            }
            c1000v.m5515e();
            if (m5510j > 0) {
                this.f3408b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo5397m(C0993p c0993p) {
            return c0993p != null;
        }

        /* renamed from: m0 */
        public int m5580m0(View view) {
            return ((C0993p) view.getLayoutParams()).f3432b.top;
        }

        /* renamed from: m1 */
        public void m5579m1(View view, C1000v c1000v) {
            m5571p1(view);
            c1000v.m5531B(view);
        }

        /* renamed from: n0 */
        public void m5577n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0993p) view.getLayoutParams()).f3432b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3408b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3408b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void m5576n1(int i, C1000v c1000v) {
            View m5634I = m5634I(i);
            m5569q1(i);
            c1000v.m5531B(m5634I);
        }

        /* renamed from: o */
        public void mo5394o(int i, int i2, C0968a0 c0968a0, InterfaceC0991c interfaceC0991c) {
        }

        /* renamed from: o0 */
        public int m5575o0() {
            return this.f3423q;
        }

        /* renamed from: o1 */
        public boolean m5574o1(Runnable runnable) {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo5573p(int i, InterfaceC0991c interfaceC0991c) {
        }

        /* renamed from: p0 */
        public int m5572p0() {
            return this.f3421o;
        }

        /* renamed from: p1 */
        public void m5571p1(View view) {
            this.f3407a.m5277p(view);
        }

        /* renamed from: q */
        public int mo5391q(C0968a0 c0968a0) {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q0 */
        public boolean m5570q0() {
            int m5633J = m5633J();
            for (int i = 0; i < m5633J; i++) {
                ViewGroup.LayoutParams layoutParams = m5634I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void m5569q1(int i) {
            if (m5634I(i) != null) {
                this.f3407a.m5276q(i);
            }
        }

        /* renamed from: r */
        public int mo5389r(C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean m5568r0() {
            return this.f3415i;
        }

        /* renamed from: r1 */
        public boolean m5567r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return m5566s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo5387s(C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo5386s0() {
            return this.f3416j;
        }

        /* renamed from: s1 */
        public boolean m5566s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m5629L = m5629L(view, rect);
            int i = m5629L[0];
            int i2 = m5629L[1];
            if ((!z2 || m5565t0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        /* renamed from: t */
        public int mo5384t(C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: t1 */
        public void m5564t1() {
            RecyclerView recyclerView = this.f3408b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo5382u(C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean m5563u0() {
            return this.f3418l;
        }

        /* renamed from: u1 */
        public void m5562u1() {
            this.f3414h = true;
        }

        /* renamed from: v */
        public int mo5380v(C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean m5561v0(C1000v c1000v, C0968a0 c0968a0) {
            return false;
        }

        /* renamed from: w */
        public void m5559w(C1000v c1000v) {
            for (int m5633J = m5633J() - 1; m5633J >= 0; m5633J--) {
                m5560v1(c1000v, m5633J, m5634I(m5633J));
            }
        }

        /* renamed from: w1 */
        public int mo5378w1(int i, C1000v c1000v, C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: x */
        public void m5557x(int i) {
            m5555y(i, m5634I(i));
        }

        /* renamed from: x0 */
        public boolean m5556x0() {
            AbstractC1005z abstractC1005z = this.f3413g;
            return abstractC1005z != null && abstractC1005z.m5480h();
        }

        /* renamed from: x1 */
        public void mo5376x1(int i) {
        }

        /* renamed from: y0 */
        public boolean m5554y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3411e.m5098b(view, 24579) && this.f3412f.m5098b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo5374y1(int i, C1000v c1000v, C0968a0 c0968a0) {
            return 0;
        }

        /* renamed from: z */
        void m5553z(RecyclerView recyclerView) {
            this.f3415i = true;
            m5639G0(recyclerView);
        }

        /* renamed from: z0 */
        public void m5552z0(View view, int i, int i2, int i3, int i4) {
            C0993p c0993p = (C0993p) view.getLayoutParams();
            Rect rect = c0993p.f3432b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0993p).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0993p).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0993p).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0993p).bottomMargin);
        }

        /* renamed from: z1 */
        void m5551z1(RecyclerView recyclerView) {
            m5650A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static class C0993p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0974d0 f3431a;

        /* renamed from: b */
        final Rect f3432b;

        /* renamed from: c */
        boolean f3433c;

        /* renamed from: d */
        boolean f3434d;

        public C0993p(int i, int i2) {
            super(i, i2);
            this.f3432b = new Rect();
            this.f3433c = true;
            this.f3434d = false;
        }

        public C0993p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3432b = new Rect();
            this.f3433c = true;
            this.f3434d = false;
        }

        public C0993p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3432b = new Rect();
            this.f3433c = true;
            this.f3434d = false;
        }

        public C0993p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3432b = new Rect();
            this.f3433c = true;
            this.f3434d = false;
        }

        public C0993p(C0993p c0993p) {
            super((ViewGroup.LayoutParams) c0993p);
            this.f3432b = new Rect();
            this.f3433c = true;
            this.f3434d = false;
        }

        /* renamed from: a */
        public int m5550a() {
            return this.f3431a.m5707m();
        }

        /* renamed from: b */
        public boolean m5549b() {
            return this.f3431a.m5695y();
        }

        /* renamed from: c */
        public boolean m5548c() {
            return this.f3431a.m5698v();
        }

        /* renamed from: d */
        public boolean m5547d() {
            return this.f3431a.m5700t();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public interface InterfaceC0994q {
        /* renamed from: a */
        void m5546a(View view);

        /* renamed from: b */
        void m5545b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0995r {
        /* renamed from: a */
        public abstract boolean mo5112a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public interface InterfaceC0996s {
        /* renamed from: a */
        boolean mo5235a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo5234b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo5233c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0997t {
        /* renamed from: a */
        public void mo3037a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo3036b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static class C0998u {

        /* renamed from: a */
        SparseArray<C0999a> f3435a = new SparseArray<>();

        /* renamed from: b */
        private int f3436b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        /* loaded from: classes.dex */
        public static class C0999a {

            /* renamed from: a */
            final ArrayList<AbstractC0974d0> f3437a = new ArrayList<>();

            /* renamed from: b */
            int f3438b = 5;

            /* renamed from: c */
            long f3439c = 0;

            /* renamed from: d */
            long f3440d = 0;

            C0999a() {
            }
        }

        /* renamed from: g */
        private C0999a m5538g(int i) {
            C0999a c0999a = this.f3435a.get(i);
            if (c0999a == null) {
                C0999a c0999a2 = new C0999a();
                this.f3435a.put(i, c0999a2);
                return c0999a2;
            }
            return c0999a;
        }

        /* renamed from: a */
        void m5544a() {
            this.f3436b++;
        }

        /* renamed from: b */
        public void m5543b() {
            for (int i = 0; i < this.f3435a.size(); i++) {
                this.f3435a.valueAt(i).f3437a.clear();
            }
        }

        /* renamed from: c */
        void m5542c() {
            this.f3436b--;
        }

        /* renamed from: d */
        void m5541d(int i, long j) {
            C0999a m5538g = m5538g(i);
            m5538g.f3440d = m5535j(m5538g.f3440d, j);
        }

        /* renamed from: e */
        void m5540e(int i, long j) {
            C0999a m5538g = m5538g(i);
            m5538g.f3439c = m5535j(m5538g.f3439c, j);
        }

        /* renamed from: f */
        public AbstractC0974d0 m5539f(int i) {
            C0999a c0999a = this.f3435a.get(i);
            if (c0999a == null || c0999a.f3437a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0974d0> arrayList = c0999a.f3437a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m5702r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m5537h(AbstractC0977g abstractC0977g, AbstractC0977g abstractC0977g2, boolean z) {
            if (abstractC0977g != null) {
                m5542c();
            }
            if (!z && this.f3436b == 0) {
                m5543b();
            }
            if (abstractC0977g2 != null) {
                m5544a();
            }
        }

        /* renamed from: i */
        public void m5536i(AbstractC0974d0 abstractC0974d0) {
            int m5708l = abstractC0974d0.m5708l();
            ArrayList<AbstractC0974d0> arrayList = m5538g(m5708l).f3437a;
            if (this.f3435a.get(m5708l).f3438b <= arrayList.size()) {
                return;
            }
            abstractC0974d0.m5728D();
            arrayList.add(abstractC0974d0);
        }

        /* renamed from: j */
        long m5535j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        boolean m5534k(int i, long j, long j2) {
            long j3 = m5538g(i).f3440d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: l */
        boolean m5533l(int i, long j, long j2) {
            long j3 = m5538g(i).f3439c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public final class C1000v {

        /* renamed from: a */
        final ArrayList<AbstractC0974d0> f3441a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<AbstractC0974d0> f3442b = null;

        /* renamed from: c */
        final ArrayList<AbstractC0974d0> f3443c = new ArrayList<>();

        /* renamed from: d */
        private final List<AbstractC0974d0> f3444d = Collections.unmodifiableList(this.f3441a);

        /* renamed from: e */
        private int f3445e = 2;

        /* renamed from: f */
        int f3446f = 2;

        /* renamed from: g */
        C0998u f3447g;

        /* renamed from: h */
        private AbstractC0970b0 f3448h;

        public C1000v() {
        }

        /* renamed from: H */
        private boolean m5525H(AbstractC0974d0 abstractC0974d0, int i, int i2, long j) {
            abstractC0974d0.f3393r = RecyclerView.this;
            int m5708l = abstractC0974d0.m5708l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == RecyclerView.FOREVER_NS || this.f3447g.m5534k(m5708l, nanoTime, j)) {
                RecyclerView.this.mAdapter.m5692a(abstractC0974d0, i);
                this.f3447g.m5541d(abstractC0974d0.m5708l(), RecyclerView.this.getNanoTime() - nanoTime);
                m5518b(abstractC0974d0);
                if (RecyclerView.this.mState.m5742e()) {
                    abstractC0974d0.f3382g = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m5518b(AbstractC0974d0 abstractC0974d0) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC0974d0.f3376a;
                if (C0252s.m8596u(view) == 0) {
                    C0252s.m8605p0(view, 1);
                }
                C1051k c1051k = RecyclerView.this.mAccessibilityDelegate;
                if (c1051k == null) {
                    return;
                }
                C0195a m5149n = c1051k.m5149n();
                if (m5149n instanceof C1051k.C1052a) {
                    ((C1051k.C1052a) m5149n).m5141o(view);
                }
                C0252s.m8625f0(view, m5149n);
            }
        }

        /* renamed from: q */
        private void m5503q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5503q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m5502r(AbstractC0974d0 abstractC0974d0) {
            View view = abstractC0974d0.f3376a;
            if (view instanceof ViewGroup) {
                m5503q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m5532A(int i) {
            m5519a(this.f3443c.get(i), true);
            this.f3443c.remove(i);
        }

        /* renamed from: B */
        public void m5531B(View view) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.m5696x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.m5697w()) {
                childViewHolderInt.m5721K();
            } else if (childViewHolderInt.m5720L()) {
                childViewHolderInt.m5715e();
            }
            m5530C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.m5699u()) {
                return;
            }
            RecyclerView.this.mItemAnimator.mo5242j(childViewHolderInt);
        }

        /* renamed from: C */
        void m5530C(AbstractC0974d0 abstractC0974d0) {
            boolean z;
            boolean z2 = true;
            if (abstractC0974d0.m5697w() || abstractC0974d0.f3376a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC0974d0.m5697w());
                sb.append(" isAttached:");
                sb.append(abstractC0974d0.f3376a.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (abstractC0974d0.m5696x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0974d0 + RecyclerView.this.exceptionLabel());
            } else if (abstractC0974d0.m5722J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            } else {
                boolean m5712h = abstractC0974d0.m5712h();
                AbstractC0977g abstractC0977g = RecyclerView.this.mAdapter;
                if ((abstractC0977g != null && m5712h && abstractC0977g.m5683n(abstractC0974d0)) || abstractC0974d0.m5699u()) {
                    if (this.f3446f <= 0 || abstractC0974d0.m5704p(526)) {
                        z = false;
                    } else {
                        int size = this.f3443c.size();
                        if (size >= this.f3446f && size > 0) {
                            m5532A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m5200d(abstractC0974d0.f3378c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.m5200d(this.f3443c.get(i).f3378c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3443c.add(size, abstractC0974d0);
                        z = true;
                    }
                    if (!z) {
                        m5519a(abstractC0974d0, true);
                        r1 = z;
                        RecyclerView.this.mViewInfoStore.m5071q(abstractC0974d0);
                        if (r1 && !z2 && m5712h) {
                            abstractC0974d0.f3393r = null;
                            return;
                        }
                        return;
                    }
                    r1 = z;
                }
                z2 = false;
                RecyclerView.this.mViewInfoStore.m5071q(abstractC0974d0);
                if (r1) {
                }
            }
        }

        /* renamed from: D */
        void m5529D(View view) {
            ArrayList<AbstractC0974d0> arrayList;
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.m5704p(12) && childViewHolderInt.m5695y() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3442b == null) {
                    this.f3442b = new ArrayList<>();
                }
                childViewHolderInt.m5724H(this, true);
                arrayList = this.f3442b;
            } else if (childViewHolderInt.m5700t() && !childViewHolderInt.m5698v() && !RecyclerView.this.mAdapter.m5688g()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.m5724H(this, false);
                arrayList = this.f3441a;
            }
            arrayList.add(childViewHolderInt);
        }

        /* renamed from: E */
        void m5528E(C0998u c0998u) {
            C0998u c0998u2 = this.f3447g;
            if (c0998u2 != null) {
                c0998u2.m5542c();
            }
            this.f3447g = c0998u;
            if (c0998u == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f3447g.m5544a();
        }

        /* renamed from: F */
        void m5527F(AbstractC0970b0 abstractC0970b0) {
            this.f3448h = abstractC0970b0;
        }

        /* renamed from: G */
        public void m5526G(int i) {
            this.f3445e = i;
            m5522K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0221 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0974d0 m5524I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1000v.m5524I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* renamed from: J */
        void m5523J(AbstractC0974d0 abstractC0974d0) {
            (abstractC0974d0.f3390o ? this.f3442b : this.f3441a).remove(abstractC0974d0);
            abstractC0974d0.f3389n = null;
            abstractC0974d0.f3390o = false;
            abstractC0974d0.m5715e();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K */
        public void m5522K() {
            AbstractC0988o abstractC0988o = RecyclerView.this.mLayout;
            this.f3446f = this.f3445e + (abstractC0988o != null ? abstractC0988o.f3419m : 0);
            for (int size = this.f3443c.size() - 1; size >= 0 && this.f3443c.size() > this.f3446f; size--) {
                m5532A(size);
            }
        }

        /* renamed from: L */
        boolean m5521L(AbstractC0974d0 abstractC0974d0) {
            if (abstractC0974d0.m5698v()) {
                return RecyclerView.this.mState.m5742e();
            }
            int i = abstractC0974d0.f3378c;
            if (i >= 0 && i < RecyclerView.this.mAdapter.mo2957c()) {
                if (RecyclerView.this.mState.m5742e() || RecyclerView.this.mAdapter.m5690e(abstractC0974d0.f3378c) == abstractC0974d0.m5708l()) {
                    return !RecyclerView.this.mAdapter.m5688g() || abstractC0974d0.m5709k() == RecyclerView.this.mAdapter.mo2984d(abstractC0974d0.f3378c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0974d0 + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: M */
        void m5520M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3443c.size() - 1; size >= 0; size--) {
                AbstractC0974d0 abstractC0974d0 = this.f3443c.get(size);
                if (abstractC0974d0 != null && (i3 = abstractC0974d0.f3378c) >= i && i3 < i4) {
                    abstractC0974d0.m5718b(2);
                    m5532A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m5519a(AbstractC0974d0 abstractC0974d0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0974d0);
            View view = abstractC0974d0.f3376a;
            C1051k c1051k = RecyclerView.this.mAccessibilityDelegate;
            if (c1051k != null) {
                C0195a m5149n = c1051k.m5149n();
                C0252s.m8625f0(view, m5149n instanceof C1051k.C1052a ? ((C1051k.C1052a) m5149n).m5142n(view) : null);
            }
            if (z) {
                m5513g(abstractC0974d0);
            }
            abstractC0974d0.f3393r = null;
            m5511i().m5536i(abstractC0974d0);
        }

        /* renamed from: c */
        public void m5517c() {
            this.f3441a.clear();
            m5494z();
        }

        /* renamed from: d */
        void m5516d() {
            int size = this.f3443c.size();
            for (int i = 0; i < size; i++) {
                this.f3443c.get(i).m5717c();
            }
            int size2 = this.f3441a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3441a.get(i2).m5717c();
            }
            ArrayList<AbstractC0974d0> arrayList = this.f3442b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3442b.get(i3).m5717c();
                }
            }
        }

        /* renamed from: e */
        void m5515e() {
            this.f3441a.clear();
            ArrayList<AbstractC0974d0> arrayList = this.f3442b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m5514f(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.m5745b()) {
                return !RecyclerView.this.mState.m5742e() ? i : RecyclerView.this.mAdapterHelper.m5311m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.m5745b() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: g */
        void m5513g(AbstractC0974d0 abstractC0974d0) {
            InterfaceC1001w interfaceC1001w = RecyclerView.this.mRecyclerListener;
            if (interfaceC1001w != null) {
                interfaceC1001w.m5493a(abstractC0974d0);
            }
            AbstractC0977g abstractC0977g = RecyclerView.this.mAdapter;
            if (abstractC0977g != null) {
                abstractC0977g.m5680q(abstractC0974d0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m5071q(abstractC0974d0);
            }
        }

        /* renamed from: h */
        AbstractC0974d0 m5512h(int i) {
            int size;
            int m5311m;
            ArrayList<AbstractC0974d0> arrayList = this.f3442b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0974d0 abstractC0974d0 = this.f3442b.get(i2);
                    if (!abstractC0974d0.m5720L() && abstractC0974d0.m5707m() == i) {
                        abstractC0974d0.m5718b(32);
                        return abstractC0974d0;
                    }
                }
                if (RecyclerView.this.mAdapter.m5688g() && (m5311m = RecyclerView.this.mAdapterHelper.m5311m(i)) > 0 && m5311m < RecyclerView.this.mAdapter.mo2957c()) {
                    long mo2984d = RecyclerView.this.mAdapter.mo2984d(m5311m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0974d0 abstractC0974d02 = this.f3442b.get(i3);
                        if (!abstractC0974d02.m5720L() && abstractC0974d02.m5709k() == mo2984d) {
                            abstractC0974d02.m5718b(32);
                            return abstractC0974d02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C0998u m5511i() {
            if (this.f3447g == null) {
                this.f3447g = new C0998u();
            }
            return this.f3447g;
        }

        /* renamed from: j */
        int m5510j() {
            return this.f3441a.size();
        }

        /* renamed from: k */
        public List<AbstractC0974d0> m5509k() {
            return this.f3444d;
        }

        /* renamed from: l */
        AbstractC0974d0 m5508l(long j, int i, boolean z) {
            for (int size = this.f3441a.size() - 1; size >= 0; size--) {
                AbstractC0974d0 abstractC0974d0 = this.f3441a.get(size);
                if (abstractC0974d0.m5709k() == j && !abstractC0974d0.m5720L()) {
                    if (i == abstractC0974d0.m5708l()) {
                        abstractC0974d0.m5718b(32);
                        if (abstractC0974d0.m5698v() && !RecyclerView.this.mState.m5742e()) {
                            abstractC0974d0.m5726F(2, 14);
                        }
                        return abstractC0974d0;
                    } else if (!z) {
                        this.f3441a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0974d0.f3376a, false);
                        m5495y(abstractC0974d0.f3376a);
                    }
                }
            }
            int size2 = this.f3443c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0974d0 abstractC0974d02 = this.f3443c.get(size2);
                if (abstractC0974d02.m5709k() == j && !abstractC0974d02.m5702r()) {
                    if (i == abstractC0974d02.m5708l()) {
                        if (!z) {
                            this.f3443c.remove(size2);
                        }
                        return abstractC0974d02;
                    } else if (!z) {
                        m5532A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC0974d0 m5507m(int i, boolean z) {
            View m5288e;
            int size = this.f3441a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0974d0 abstractC0974d0 = this.f3441a.get(i2);
                if (!abstractC0974d0.m5720L() && abstractC0974d0.m5707m() == i && !abstractC0974d0.m5700t() && (RecyclerView.this.mState.f3356h || !abstractC0974d0.m5698v())) {
                    abstractC0974d0.m5718b(32);
                    return abstractC0974d0;
                }
            }
            if (z || (m5288e = RecyclerView.this.mChildHelper.m5288e(i)) == null) {
                int size2 = this.f3443c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0974d0 abstractC0974d02 = this.f3443c.get(i3);
                    if (!abstractC0974d02.m5700t() && abstractC0974d02.m5707m() == i && !abstractC0974d02.m5702r()) {
                        if (!z) {
                            this.f3443c.remove(i3);
                        }
                        return abstractC0974d02;
                    }
                }
                return null;
            }
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(m5288e);
            RecyclerView.this.mChildHelper.m5274s(m5288e);
            int m5280m = RecyclerView.this.mChildHelper.m5280m(m5288e);
            if (m5280m != -1) {
                RecyclerView.this.mChildHelper.m5289d(m5280m);
                m5529D(m5288e);
                childViewHolderInt.m5718b(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: n */
        View m5506n(int i) {
            return this.f3441a.get(i).f3376a;
        }

        /* renamed from: o */
        public View m5505o(int i) {
            return m5504p(i, false);
        }

        /* renamed from: p */
        View m5504p(int i, boolean z) {
            return m5524I(i, z, RecyclerView.FOREVER_NS).f3376a;
        }

        /* renamed from: s */
        void m5501s() {
            int size = this.f3443c.size();
            for (int i = 0; i < size; i++) {
                C0993p c0993p = (C0993p) this.f3443c.get(i).f3376a.getLayoutParams();
                if (c0993p != null) {
                    c0993p.f3433c = true;
                }
            }
        }

        /* renamed from: t */
        void m5500t() {
            int size = this.f3443c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0974d0 abstractC0974d0 = this.f3443c.get(i);
                if (abstractC0974d0 != null) {
                    abstractC0974d0.m5718b(6);
                    abstractC0974d0.m5719a(null);
                }
            }
            AbstractC0977g abstractC0977g = RecyclerView.this.mAdapter;
            if (abstractC0977g == null || !abstractC0977g.m5688g()) {
                m5494z();
            }
        }

        /* renamed from: u */
        void m5499u(int i, int i2) {
            int size = this.f3443c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0974d0 abstractC0974d0 = this.f3443c.get(i3);
                if (abstractC0974d0 != null && abstractC0974d0.f3378c >= i) {
                    abstractC0974d0.m5731A(i2, true);
                }
            }
        }

        /* renamed from: v */
        void m5498v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f3443c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0974d0 abstractC0974d0 = this.f3443c.get(i7);
                if (abstractC0974d0 != null && (i6 = abstractC0974d0.f3378c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC0974d0.m5731A(i2 - i, false);
                    } else {
                        abstractC0974d0.m5731A(i3, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m5497w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3443c.size() - 1; size >= 0; size--) {
                AbstractC0974d0 abstractC0974d0 = this.f3443c.get(size);
                if (abstractC0974d0 != null) {
                    int i4 = abstractC0974d0.f3378c;
                    if (i4 >= i3) {
                        abstractC0974d0.m5731A(-i2, z);
                    } else if (i4 >= i) {
                        abstractC0974d0.m5718b(8);
                        m5532A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m5496x(AbstractC0977g abstractC0977g, AbstractC0977g abstractC0977g2, boolean z) {
            m5517c();
            m5511i().m5537h(abstractC0977g, abstractC0977g2, z);
        }

        /* renamed from: y */
        void m5495y(View view) {
            AbstractC0974d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f3389n = null;
            childViewHolderInt.f3390o = false;
            childViewHolderInt.m5715e();
            m5530C(childViewHolderInt);
        }

        /* renamed from: z */
        void m5494z() {
            for (int size = this.f3443c.size() - 1; size >= 0; size--) {
                m5532A(size);
            }
            this.f3443c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m5202b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public interface InterfaceC1001w {
        /* renamed from: a */
        void m5493a(AbstractC0974d0 abstractC0974d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class C1002x extends AbstractC0979i {
        C1002x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0979i
        /* renamed from: a */
        public void mo5492a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3355g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m5308p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public static class C1003y extends AbstractC0280a {
        public static final Parcelable.Creator<C1003y> CREATOR = new C1004a();

        /* renamed from: h */
        Parcelable f3451h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        /* loaded from: classes.dex */
        static class C1004a implements Parcelable.ClassLoaderCreator<C1003y> {
            C1004a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1003y createFromParcel(Parcel parcel) {
                return new C1003y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1003y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1003y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1003y[] newArray(int i) {
                return new C1003y[i];
            }
        }

        C1003y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3451h = parcel.readParcelable(classLoader == null ? AbstractC0988o.class.getClassLoader() : classLoader);
        }

        C1003y(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        void m5491b(C1003y c1003y) {
            this.f3451h = c1003y.f3451h;
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3451h, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1005z {

        /* renamed from: b */
        private RecyclerView f3453b;

        /* renamed from: c */
        private AbstractC0988o f3454c;

        /* renamed from: d */
        private boolean f3455d;

        /* renamed from: e */
        private boolean f3456e;

        /* renamed from: f */
        private View f3457f;

        /* renamed from: h */
        private boolean f3459h;

        /* renamed from: a */
        private int f3452a = -1;

        /* renamed from: g */
        private final C1006a f3458g = new C1006a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        /* loaded from: classes.dex */
        public static class C1006a {

            /* renamed from: a */
            private int f3460a;

            /* renamed from: b */
            private int f3461b;

            /* renamed from: c */
            private int f3462c;

            /* renamed from: d */
            private int f3463d;

            /* renamed from: e */
            private Interpolator f3464e;

            /* renamed from: f */
            private boolean f3465f;

            /* renamed from: g */
            private int f3466g;

            public C1006a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, null);
            }

            public C1006a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3463d = -1;
                this.f3465f = false;
                this.f3466g = 0;
                this.f3460a = i;
                this.f3461b = i2;
                this.f3462c = i3;
                this.f3464e = interpolator;
            }

            /* renamed from: e */
            private void m5469e() {
                if (this.f3464e != null && this.f3462c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3462c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m5473a() {
                return this.f3463d >= 0;
            }

            /* renamed from: b */
            public void m5472b(int i) {
                this.f3463d = i;
            }

            /* renamed from: c */
            void m5471c(RecyclerView recyclerView) {
                int i = this.f3463d;
                if (i >= 0) {
                    this.f3463d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f3465f = false;
                } else if (!this.f3465f) {
                    this.f3466g = 0;
                } else {
                    m5469e();
                    recyclerView.mViewFlinger.m5733f(this.f3460a, this.f3461b, this.f3462c, this.f3464e);
                    int i2 = this.f3466g + 1;
                    this.f3466g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3465f = false;
                }
            }

            /* renamed from: d */
            public void m5470d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3460a = i;
                this.f3461b = i2;
                this.f3462c = i3;
                this.f3464e = interpolator;
                this.f3465f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1007b {
            /* renamed from: a */
            PointF mo5417a(int i);
        }

        /* renamed from: a */
        public PointF m5487a(int i) {
            AbstractC0988o m5483e = m5483e();
            if (m5483e instanceof InterfaceC1007b) {
                return ((InterfaceC1007b) m5483e).mo5417a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1007b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m5486b(int i) {
            return this.f3453b.mLayout.mo5646C(i);
        }

        /* renamed from: c */
        public int m5485c() {
            return this.f3453b.mLayout.m5633J();
        }

        /* renamed from: d */
        public int m5484d(View view) {
            return this.f3453b.getChildLayoutPosition(view);
        }

        /* renamed from: e */
        public AbstractC0988o m5483e() {
            return this.f3454c;
        }

        /* renamed from: f */
        public int m5482f() {
            return this.f3452a;
        }

        /* renamed from: g */
        public boolean m5481g() {
            return this.f3455d;
        }

        /* renamed from: h */
        public boolean m5480h() {
            return this.f3456e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: i */
        public void m5479i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        void m5478j(int i, int i2) {
            PointF m5487a;
            RecyclerView recyclerView = this.f3453b;
            if (this.f3452a == -1 || recyclerView == null) {
                m5474r();
            }
            if (this.f3455d && this.f3457f == null && this.f3454c != null && (m5487a = m5487a(this.f3452a)) != null && (m5487a.x != 0.0f || m5487a.y != 0.0f)) {
                recyclerView.scrollStep((int) Math.signum(m5487a.x), (int) Math.signum(m5487a.y), null);
            }
            this.f3455d = false;
            View view = this.f3457f;
            if (view != null) {
                if (m5484d(view) == this.f3452a) {
                    mo5100o(this.f3457f, recyclerView.mState, this.f3458g);
                    this.f3458g.m5471c(recyclerView);
                    m5474r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f3457f = null;
                }
            }
            if (this.f3456e) {
                mo5192l(i, i2, recyclerView.mState, this.f3458g);
                boolean m5473a = this.f3458g.m5473a();
                this.f3458g.m5471c(recyclerView);
                if (m5473a && this.f3456e) {
                    this.f3455d = true;
                    recyclerView.mViewFlinger.m5734e();
                }
            }
        }

        /* renamed from: k */
        protected void m5477k(View view) {
            if (m5484d(view) == m5482f()) {
                this.f3457f = view;
            }
        }

        /* renamed from: l */
        protected abstract void mo5192l(int i, int i2, C0968a0 c0968a0, C1006a c1006a);

        /* renamed from: m */
        protected abstract void mo5191m();

        /* renamed from: n */
        protected abstract void mo5190n();

        /* renamed from: o */
        protected abstract void mo5100o(View view, C0968a0 c0968a0, C1006a c1006a);

        /* renamed from: p */
        public void m5476p(int i) {
            this.f3452a = i;
        }

        /* renamed from: q */
        void m5475q(RecyclerView recyclerView, AbstractC0988o abstractC0988o) {
            recyclerView.mViewFlinger.m5732g();
            if (this.f3459h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3453b = recyclerView;
            this.f3454c = abstractC0988o;
            int i = this.f3452a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f3349a = i;
            this.f3456e = true;
            this.f3455d = true;
            this.f3457f = m5486b(m5482f());
            mo5191m();
            this.f3453b.mViewFlinger.m5734e();
            this.f3459h = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public final void m5474r() {
            if (this.f3456e) {
                this.f3456e = false;
                mo5190n();
                this.f3453b.mState.f3349a = -1;
                this.f3457f = null;
                this.f3452a = -1;
                this.f3455d = false;
                this.f3454c.m5595f1(this);
                this.f3454c = null;
                this.f3453b = null;
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i == 18 || i == 19 || i == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Build.VERSION.SDK_INT >= 23;
        POST_UPDATES_ON_ANIMATION = Build.VERSION.SDK_INT >= 16;
        ALLOW_THREAD_GAP_WORK = Build.VERSION.SDK_INT >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = Build.VERSION.SDK_INT <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new animationInterpolatorC0971c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0314a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C1002x();
        this.mRecycler = new C1000v();
        this.mViewInfoStore = new C1061p();
        this.mUpdateChildViewsRunnable = new RunnableC0967a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0981k();
        this.mItemAnimator = new C1023c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0972c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC1039e.C1041b() : null;
        this.mState = new C0968a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0986m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0969b();
        this.mViewInfoProcessCallback = new C0973d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0264t.m8550b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0264t.m8548d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m5661v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0252s.m8596u(this) == 0) {
            C0252s.m8605p0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1051k(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0316c.RecyclerView, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0316c.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C0316c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C0316c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C0316c.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C0316c.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C0316c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C0316c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C0316c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C0316c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    private void addAnimatingView(AbstractC0974d0 abstractC0974d0) {
        View view = abstractC0974d0.f3376a;
        boolean z = view.getParent() == this;
        this.mRecycler.m5523J(getChildViewHolder(view));
        if (abstractC0974d0.m5696x()) {
            this.mChildHelper.m5290c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1020b c1020b = this.mChildHelper;
        if (z) {
            c1020b.m5282k(view);
        } else {
            c1020b.m5291b(view, true);
        }
    }

    private void animateChange(AbstractC0974d0 abstractC0974d0, AbstractC0974d0 abstractC0974d02, AbstractC0982l.C0985c c0985c, AbstractC0982l.C0985c c0985c2, boolean z, boolean z2) {
        abstractC0974d0.m5725G(false);
        if (z) {
            addAnimatingView(abstractC0974d0);
        }
        if (abstractC0974d0 != abstractC0974d02) {
            if (z2) {
                addAnimatingView(abstractC0974d02);
            }
            abstractC0974d0.f3383h = abstractC0974d02;
            addAnimatingView(abstractC0974d0);
            this.mRecycler.m5523J(abstractC0974d0);
            abstractC0974d02.m5725G(false);
            abstractC0974d02.f3384i = abstractC0974d0;
        }
        if (this.mItemAnimator.mo5120b(abstractC0974d0, abstractC0974d02, c0985c, c0985c2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(AbstractC0974d0 abstractC0974d0) {
        WeakReference<RecyclerView> weakReference = abstractC0974d0.f3377b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == abstractC0974d0.f3376a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                abstractC0974d0.f3377b = null;
                return;
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0988o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0988o) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C0216b.m8800b(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.m5746a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3358j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m5082f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0968a0 c0968a0 = this.mState;
        c0968a0.f3357i = (c0968a0.f3359k && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        C0968a0 c0968a02 = this.mState;
        c0968a02.f3356h = c0968a02.f3360l;
        c0968a02.f3354f = this.mAdapter.mo2957c();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3359k) {
            int m5286g = this.mChildHelper.m5286g();
            for (int i = 0; i < m5286g; i++) {
                AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5287f(i));
                if (!childViewHolderInt.m5722J() && (!childViewHolderInt.m5700t() || this.mAdapter.m5688g())) {
                    this.mViewInfoStore.m5083e(childViewHolderInt, this.mItemAnimator.m5662t(this.mState, childViewHolderInt, AbstractC0982l.m5672e(childViewHolderInt), childViewHolderInt.m5705o()));
                    if (this.mState.f3357i && childViewHolderInt.m5695y() && !childViewHolderInt.m5698v() && !childViewHolderInt.m5722J() && !childViewHolderInt.m5700t()) {
                        this.mViewInfoStore.m5085c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3360l) {
            saveOldPositions();
            C0968a0 c0968a03 = this.mState;
            boolean z2 = c0968a03.f3355g;
            c0968a03.f3355g = false;
            this.mLayout.mo5422X0(this.mRecycler, c0968a03);
            this.mState.f3355g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.m5286g(); i2++) {
                AbstractC0974d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m5287f(i2));
                if (!childViewHolderInt2.m5722J() && !this.mViewInfoStore.m5079i(childViewHolderInt2)) {
                    int m5672e = AbstractC0982l.m5672e(childViewHolderInt2);
                    boolean m5704p = childViewHolderInt2.m5704p(8192);
                    if (!m5704p) {
                        m5672e |= 4096;
                    }
                    AbstractC0982l.C0985c m5662t = this.mItemAnimator.m5662t(this.mState, childViewHolderInt2, m5672e, childViewHolderInt2.m5705o());
                    if (m5704p) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, m5662t);
                    } else {
                        this.mViewInfoStore.m5087a(childViewHolderInt2, m5662t);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3353e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m5746a(6);
        this.mAdapterHelper.m5314j();
        this.mState.f3354f = this.mAdapter.mo2957c();
        C0968a0 c0968a0 = this.mState;
        c0968a0.f3352d = 0;
        c0968a0.f3356h = false;
        this.mLayout.mo5422X0(this.mRecycler, c0968a0);
        C0968a0 c0968a02 = this.mState;
        c0968a02.f3355g = false;
        this.mPendingSavedState = null;
        c0968a02.f3359k = c0968a02.f3359k && this.mItemAnimator != null;
        this.mState.f3353e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m5746a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0968a0 c0968a0 = this.mState;
        c0968a0.f3353e = 1;
        if (c0968a0.f3359k) {
            for (int m5286g = this.mChildHelper.m5286g() - 1; m5286g >= 0; m5286g--) {
                AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5287f(m5286g));
                if (!childViewHolderInt.m5722J()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    AbstractC0982l.C0985c m5663s = this.mItemAnimator.m5663s(this.mState, childViewHolderInt);
                    AbstractC0974d0 m5081g = this.mViewInfoStore.m5081g(changedHolderKey);
                    if (m5081g != null && !m5081g.m5722J()) {
                        boolean m5080h = this.mViewInfoStore.m5080h(m5081g);
                        boolean m5080h2 = this.mViewInfoStore.m5080h(childViewHolderInt);
                        if (!m5080h || m5081g != childViewHolderInt) {
                            AbstractC0982l.C0985c m5074n = this.mViewInfoStore.m5074n(m5081g);
                            this.mViewInfoStore.m5084d(childViewHolderInt, m5663s);
                            AbstractC0982l.C0985c m5075m = this.mViewInfoStore.m5075m(childViewHolderInt);
                            if (m5074n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, m5081g);
                            } else {
                                animateChange(m5081g, childViewHolderInt, m5074n, m5075m, m5080h, m5080h2);
                            }
                        }
                    }
                    this.mViewInfoStore.m5084d(childViewHolderInt, m5663s);
                }
            }
            this.mViewInfoStore.m5073o(this.mViewInfoProcessCallback);
        }
        this.mLayout.m5581l1(this.mRecycler);
        C0968a0 c0968a02 = this.mState;
        c0968a02.f3351c = c0968a02.f3354f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0968a02.f3359k = false;
        c0968a02.f3360l = false;
        this.mLayout.f3414h = false;
        ArrayList<AbstractC0974d0> arrayList = this.mRecycler.f3442b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o.f3420n) {
            abstractC0988o.f3419m = 0;
            abstractC0988o.f3420n = false;
            this.mRecycler.m5522K();
        }
        this.mLayout.mo5420Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m5082f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0996s interfaceC0996s = this.mInterceptingOnItemTouchListener;
        if (interfaceC0996s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC0996s.mo5234b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0996s interfaceC0996s = this.mOnItemTouchListeners.get(i);
            if (interfaceC0996s.mo5235a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0996s;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int m5286g = this.mChildHelper.m5286g();
        if (m5286g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Reader.READ_DONE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < m5286g; i3++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5287f(i3));
            if (!childViewHolderInt.m5722J()) {
                int m5707m = childViewHolderInt.m5707m();
                if (m5707m < i) {
                    i = m5707m;
                }
                if (m5707m > i2) {
                    i2 = m5707m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC0974d0 findViewHolderForAdapterPosition;
        int i = this.mState.f3361m;
        if (i == -1) {
            i = 0;
        }
        int m5745b = this.mState.m5745b();
        for (int i2 = i; i2 < m5745b; i2++) {
            AbstractC0974d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f3376a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f3376a;
            }
        }
        int min = Math.min(m5745b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.f3376a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f3376a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0974d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0993p) view.getLayoutParams()).f3431a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0993p c0993p = (C0993p) view.getLayoutParams();
        Rect rect2 = c0993p.f3432b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0993p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0993p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0993p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0993p).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private C0244k getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0244k(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC0974d0 abstractC0974d0, AbstractC0974d0 abstractC0974d02) {
        int m5286g = this.mChildHelper.m5286g();
        for (int i = 0; i < m5286g; i++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5287f(i));
            if (childViewHolderInt != abstractC0974d0 && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC0977g abstractC0977g = this.mAdapter;
                if (abstractC0977g == null || !abstractC0977g.m5688g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0974d0 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0974d0 + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0974d02 + " cannot be found but it is necessary for " + abstractC0974d0 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int m5286g = this.mChildHelper.m5286g();
        for (int i = 0; i < m5286g; i++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5287f(i));
            if (childViewHolderInt != null && !childViewHolderInt.m5722J() && childViewHolderInt.m5695y()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (C0252s.m8594v(this) == 0) {
            C0252s.m8603q0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1020b(new C0975e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.m5610Z() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        int i5 = this.mTempRect2.left;
        if ((i4 < i5 || rect.right <= i5) && this.mTempRect.right < this.mTempRect2.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.mTempRect;
            int i6 = rect2.right;
            int i7 = this.mTempRect2.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        Rect rect3 = this.mTempRect;
        int i8 = rect3.top;
        int i9 = this.mTempRect2.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.mTempRect;
            int i10 = rect4.bottom;
            int i11 = this.mTempRect2.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.mTempRect.top <= this.mTempRect2.top) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        } else if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        } else if (i == 17) {
            return i2 < 0;
        } else if (i == 33) {
            return c < 0;
        } else if (i == 66) {
            return i2 > 0;
        } else if (i == 130) {
            return c > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo5448L1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m5303u();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo5431S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m5305s();
        } else {
            this.mAdapterHelper.m5314j();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3359k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f3414h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.m5688g());
        C0968a0 c0968a0 = this.mState;
        if (c0968a0.f3359k && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        c0968a0.f3360l = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.C0774d.m6653a(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0774d.m6653a(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0774d.m6653a(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            p000a.p019g.p028k.C0252s.m8639X(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.m5279n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m5286g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        AbstractC0974d0 findViewHolderForItemId = (this.mState.f3362n == -1 || !this.mAdapter.m5688g()) ? null : findViewHolderForItemId(this.mState.f3362n);
        if (findViewHolderForItemId != null && !this.mChildHelper.m5279n(findViewHolderForItemId.f3376a) && findViewHolderForItemId.f3376a.hasFocusable()) {
            view = findViewHolderForItemId.f3376a;
        } else if (this.mChildHelper.m5286g() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i = this.mState.f3363o;
            if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0252s.m8639X(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0993p) {
            C0993p c0993p = (C0993p) layoutParams;
            if (!c0993p.f3433c) {
                Rect rect = c0993p.f3432b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.m5566s1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0968a0 c0968a0 = this.mState;
        c0968a0.f3362n = -1L;
        c0968a0.f3361m = -1;
        c0968a0.f3363o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC0974d0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3362n = this.mAdapter.m5688g() ? findContainingViewHolder.m5709k() : -1L;
        this.mState.f3361m = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.m5698v() ? findContainingViewHolder.f3379d : findContainingViewHolder.m5710j();
        this.mState.f3363o = getDeepestFocusedViewWithId(findContainingViewHolder.f3376a);
    }

    private void setAdapterInternal(AbstractC0977g abstractC0977g, boolean z, boolean z2) {
        AbstractC0977g abstractC0977g2 = this.mAdapter;
        if (abstractC0977g2 != null) {
            abstractC0977g2.m5677t(this.mObserver);
            this.mAdapter.m5684m(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m5303u();
        AbstractC0977g abstractC0977g3 = this.mAdapter;
        this.mAdapter = abstractC0977g;
        if (abstractC0977g != null) {
            abstractC0977g.m5679r(this.mObserver);
            abstractC0977g.m5686i(this);
        }
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.m5644E0(abstractC0977g3, this.mAdapter);
        }
        this.mRecycler.m5496x(abstractC0977g3, this.mAdapter, z);
        this.mState.f3355g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m5732g();
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.m5630K1();
        }
    }

    void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        C0252s.m8639X(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null || !abstractC0988o.m5642F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(AbstractC0987n abstractC0987n) {
        addItemDecoration(abstractC0987n, -1);
    }

    public void addItemDecoration(AbstractC0987n abstractC0987n, int i) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.mo5407g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC0987n);
        } else {
            this.mItemDecorations.add(i, abstractC0987n);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0994q interfaceC0994q) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0994q);
    }

    public void addOnItemTouchListener(InterfaceC0996s interfaceC0996s) {
        this.mOnItemTouchListeners.add(interfaceC0996s);
    }

    public void addOnScrollListener(AbstractC0997t abstractC0997t) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0997t);
    }

    void animateAppearance(AbstractC0974d0 abstractC0974d0, AbstractC0982l.C0985c c0985c, AbstractC0982l.C0985c c0985c2) {
        abstractC0974d0.m5725G(false);
        if (this.mItemAnimator.mo5121a(abstractC0974d0, c0985c, c0985c2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(AbstractC0974d0 abstractC0974d0, AbstractC0982l.C0985c c0985c, AbstractC0982l.C0985c c0985c2) {
        addAnimatingView(abstractC0974d0);
        abstractC0974d0.m5725G(false);
        if (this.mItemAnimator.mo5119c(abstractC0974d0, c0985c, c0985c2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(AbstractC0974d0 abstractC0974d0) {
        AbstractC0982l abstractC0982l = this.mItemAnimator;
        return abstractC0982l == null || abstractC0982l.mo5243g(abstractC0974d0, abstractC0974d0.m5705o());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0993p) && this.mLayout.mo5397m((C0993p) layoutParams);
    }

    void clearOldPositions() {
        int m5283j = this.mChildHelper.m5283j();
        for (int i = 0; i < m5283j; i++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i));
            if (!childViewHolderInt.m5722J()) {
                childViewHolderInt.m5717c();
            }
        }
        this.mRecycler.m5516d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC0994q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0997t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null && abstractC0988o.mo5402k()) {
            return this.mLayout.mo5391q(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null && abstractC0988o.mo5402k()) {
            return this.mLayout.mo5389r(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null && abstractC0988o.mo5402k()) {
            return this.mLayout.mo5387s(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null && abstractC0988o.mo5399l()) {
            return this.mLayout.mo5384t(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null && abstractC0988o.mo5399l()) {
            return this.mLayout.mo5382u(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null && abstractC0988o.mo5399l()) {
            return this.mLayout.mo5380v(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0252s.m8639X(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0146c.m8965a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0146c.m8964b();
        } else if (this.mAdapterHelper.m5308p()) {
            if (this.mAdapterHelper.m5309o(4) && !this.mAdapterHelper.m5309o(11)) {
                C0146c.m8965a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m5305s();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m5315i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else if (!this.mAdapterHelper.m5308p()) {
                return;
            } else {
                C0146c.m8965a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            }
            C0146c.m8964b();
        }
    }

    void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(AbstractC0988o.m5578n(i, getPaddingLeft() + getPaddingRight(), C0252s.m8588y(this)), AbstractC0988o.m5578n(i2, getPaddingTop() + getPaddingBottom(), C0252s.m8590x(this)));
    }

    void dispatchChildAttached(View view) {
        AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC0977g abstractC0977g = this.mAdapter;
        if (abstractC0977g != null && childViewHolderInt != null) {
            abstractC0977g.m5682o(childViewHolderInt);
        }
        List<InterfaceC0994q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m5546a(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC0977g abstractC0977g = this.mAdapter;
        if (abstractC0977g != null && childViewHolderInt != null) {
            abstractC0977g.m5681p(childViewHolderInt);
        }
        List<InterfaceC0994q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m5545b(view);
            }
        }
    }

    void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout != null) {
            C0968a0 c0968a0 = this.mState;
            c0968a0.f3358j = false;
            if (c0968a0.f3353e == 1) {
                dispatchLayoutStep1();
            } else if (!this.mAdapterHelper.m5307q() && this.mLayout.m5575o0() == getWidth() && this.mLayout.m5613W() == getHeight()) {
                this.mLayout.m5551z1(this);
                dispatchLayoutStep3();
                return;
            }
            this.mLayout.m5551z1(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        } else {
            str = "No layout manager attached; skipping layout";
        }
        Log.e(TAG, str);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m8687a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m8686b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m8685c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m8684d(i, i2, iArr, iArr2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m8683e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m8682f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m8681g(i, i2, i3, i4, iArr, i5);
    }

    void dispatchOnScrollStateChanged(int i) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.mo5410e1(i);
        }
        onScrollStateChanged(i);
        AbstractC0997t abstractC0997t = this.mScrollListener;
        if (abstractC0997t != null) {
            abstractC0997t.mo3037a(this, i);
        }
        List<AbstractC0997t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo3037a(this, i);
            }
        }
    }

    void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC0997t abstractC0997t = this.mScrollListener;
        if (abstractC0997t != null) {
            abstractC0997t.mo3036b(this, i, i2);
        }
        List<AbstractC0997t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo3036b(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC0974d0 abstractC0974d0 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC0974d0.f3376a.getParent() == this && !abstractC0974d0.m5722J() && (i = abstractC0974d0.f3392q) != -1) {
                C0252s.m8605p0(abstractC0974d0.f3376a, i);
                abstractC0974d0.f3392q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        int i;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).mo5232i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f = (-getWidth()) + getPaddingRight();
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = -getWidth();
                i = -getHeight();
            }
            canvas.translate(f, i);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo5240p()) {
            z3 = z;
        }
        if (z3) {
            C0252s.m8639X(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    void ensureBottomGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect m5673a = this.mEdgeEffectFactory.m5673a(this, 3);
        this.mBottomGlow = m5673a;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m5673a.setSize(measuredWidth, measuredHeight);
    }

    void ensureLeftGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect m5673a = this.mEdgeEffectFactory.m5673a(this, 0);
        this.mLeftGlow = m5673a;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m5673a.setSize(measuredHeight, measuredWidth);
    }

    void ensureRightGlow() {
        int measuredHeight;
        int measuredWidth;
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect m5673a = this.mEdgeEffectFactory.m5673a(this, 2);
        this.mRightGlow = m5673a;
        if (this.mClipToPadding) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m5673a.setSize(measuredHeight, measuredWidth);
    }

    void ensureTopGlow() {
        int measuredWidth;
        int measuredHeight;
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect m5673a = this.mEdgeEffectFactory.m5673a(this, 1);
        this.mTopGlow = m5673a;
        if (this.mClipToPadding) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m5673a.setSize(measuredWidth, measuredHeight);
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(C0968a0 c0968a0) {
        if (getScrollState() != 2) {
            c0968a0.f3364p = 0;
            c0968a0.f3365q = 0;
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f3369h;
        c0968a0.f3364p = overScroller.getFinalX() - overScroller.getCurrX();
        c0968a0.f3365q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    public View findChildViewUnder(float f, float f2) {
        for (int m5286g = this.mChildHelper.m5286g() - 1; m5286g >= 0; m5286g--) {
            View m5287f = this.mChildHelper.m5287f(m5286g);
            float translationX = m5287f.getTranslationX();
            float translationY = m5287f.getTranslationY();
            if (f >= m5287f.getLeft() + translationX && f <= m5287f.getRight() + translationX && f2 >= m5287f.getTop() + translationY && f2 <= m5287f.getBottom() + translationY) {
                return m5287f;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public AbstractC0974d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public AbstractC0974d0 findViewHolderForAdapterPosition(int i) {
        AbstractC0974d0 abstractC0974d0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m5283j = this.mChildHelper.m5283j();
        for (int i2 = 0; i2 < m5283j; i2++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.m5698v() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.m5279n(childViewHolderInt.f3376a)) {
                    return childViewHolderInt;
                }
                abstractC0974d0 = childViewHolderInt;
            }
        }
        return abstractC0974d0;
    }

    public AbstractC0974d0 findViewHolderForItemId(long j) {
        AbstractC0977g abstractC0977g = this.mAdapter;
        AbstractC0974d0 abstractC0974d0 = null;
        if (abstractC0977g != null && abstractC0977g.m5688g()) {
            int m5283j = this.mChildHelper.m5283j();
            for (int i = 0; i < m5283j; i++) {
                AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i));
                if (childViewHolderInt != null && !childViewHolderInt.m5698v() && childViewHolderInt.m5709k() == j) {
                    if (!this.mChildHelper.m5279n(childViewHolderInt.f3376a)) {
                        return childViewHolderInt;
                    }
                    abstractC0974d0 = childViewHolderInt;
                }
            }
        }
        return abstractC0974d0;
    }

    public AbstractC0974d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public AbstractC0974d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC0974d0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.m5283j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.m5284i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.m5698v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f3378c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m5707m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.f3376a
            boolean r1 = r1.m5279n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public boolean fling(int i, int i2) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean mo5402k = abstractC0988o.mo5402k();
            boolean mo5399l = this.mLayout.mo5399l();
            i = (!mo5402k || Math.abs(i) < this.mMinFlingVelocity) ? 0 : 0;
            i2 = (!mo5399l || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : 0;
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            float f2 = i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = mo5402k || mo5399l;
                dispatchNestedFling(f, f2, z);
                AbstractC0995r abstractC0995r = this.mOnFlingListener;
                if (abstractC0995r != null && abstractC0995r.mo5112a(i, i2)) {
                    return true;
                }
                if (z) {
                    int i3 = mo5402k ? 1 : 0;
                    if (mo5399l) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 1);
                    int i4 = this.mMaxFlingVelocity;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.mMaxFlingVelocity;
                    this.mViewFlinger.m5736c(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View m5620Q0 = this.mLayout.m5620Q0(view, i);
        if (m5620Q0 != null) {
            return m5620Q0;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.mo5399l()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo5402k()) {
                int i3 = (this.mLayout.m5610Z() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo5452J0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo5452J0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            return abstractC0988o.mo5463D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            return abstractC0988o.mo5460E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            return abstractC0988o.mo5458F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0977g getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(AbstractC0974d0 abstractC0974d0) {
        if (abstractC0974d0.m5704p(524) || !abstractC0974d0.m5701s()) {
            return -1;
        }
        return this.mAdapterHelper.m5319e(abstractC0974d0.f3378c);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0988o abstractC0988o = this.mLayout;
        return abstractC0988o != null ? abstractC0988o.m5640G() : super.getBaseline();
    }

    long getChangedHolderKey(AbstractC0974d0 abstractC0974d0) {
        return this.mAdapter.m5688g() ? abstractC0974d0.m5709k() : abstractC0974d0.f3378c;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m5710j();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        InterfaceC0980j interfaceC0980j = this.mChildDrawingOrderCallback;
        return interfaceC0980j == null ? super.getChildDrawingOrder(i, i2) : interfaceC0980j.m5674a(i, i2);
    }

    public long getChildItemId(View view) {
        AbstractC0974d0 childViewHolderInt;
        AbstractC0977g abstractC0977g = this.mAdapter;
        if (abstractC0977g == null || !abstractC0977g.m5688g() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.m5709k();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.m5707m();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC0974d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C1051k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0981k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC0982l getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        C0993p c0993p = (C0993p) view.getLayoutParams();
        if (c0993p.f3433c) {
            if (this.mState.m5742e() && (c0993p.m5549b() || c0993p.m5547d())) {
                return c0993p.f3432b;
            }
            Rect rect = c0993p.f3432b;
            rect.set(0, 0, 0, 0);
            int size = this.mItemDecorations.size();
            for (int i = 0; i < size; i++) {
                this.mTempRect.set(0, 0, 0, 0);
                this.mItemDecorations.get(i).m5655e(this.mTempRect, view, this, this.mState);
                int i2 = rect.left;
                Rect rect2 = this.mTempRect;
                rect.left = i2 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            c0993p.f3433c = false;
            return rect;
        }
        return c0993p.f3432b;
    }

    public AbstractC0987n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC0988o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0995r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0998u getRecycledViewPool() {
        return this.mRecycler.m5511i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m8677k();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m8676l(i);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m5308p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C1017a(new C0976f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1034d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0315b.fastscroll_default_thickness), resources.getDimensionPixelSize(C0315b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0315b.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.mo5407g("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC0982l abstractC0982l = this.mItemAnimator;
        return abstractC0982l != null && abstractC0982l.mo5240p();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, p000a.p019g.p028k.InterfaceC0243j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m8675m();
    }

    void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.mo5376x1(i);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int m5283j = this.mChildHelper.m5283j();
        for (int i = 0; i < m5283j; i++) {
            ((C0993p) this.mChildHelper.m5284i(i).getLayoutParams()).f3433c = true;
        }
        this.mRecycler.m5501s();
    }

    void markKnownViewsInvalid() {
        int m5283j = this.mChildHelper.m5283j();
        for (int i = 0; i < m5283j; i++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i));
            if (childViewHolderInt != null && !childViewHolderInt.m5722J()) {
                childViewHolderInt.m5718b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m5500t();
    }

    public void offsetChildrenHorizontal(int i) {
        int m5286g = this.mChildHelper.m5286g();
        for (int i2 = 0; i2 < m5286g; i2++) {
            this.mChildHelper.m5287f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int m5286g = this.mChildHelper.m5286g();
        for (int i2 = 0; i2 < m5286g; i2++) {
            this.mChildHelper.m5287f(i2).offsetTopAndBottom(i);
        }
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
        int m5283j = this.mChildHelper.m5283j();
        for (int i3 = 0; i3 < m5283j; i3++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.m5722J() && childViewHolderInt.f3378c >= i) {
                childViewHolderInt.m5731A(i2, false);
                this.mState.f3355g = true;
            }
        }
        this.mRecycler.m5499u(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m5283j = this.mChildHelper.m5283j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m5283j; i7++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.f3378c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.m5731A(i2 - i, false);
                } else {
                    childViewHolderInt.m5731A(i5, false);
                }
                this.mState.f3355g = true;
            }
        }
        this.mRecycler.m5498v(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m5283j = this.mChildHelper.m5283j();
        for (int i4 = 0; i4 < m5283j; i4++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.m5722J()) {
                int i5 = childViewHolderInt.f3378c;
                if (i5 >= i3) {
                    childViewHolderInt.m5731A(-i2, z);
                } else if (i5 >= i) {
                    childViewHolderInt.m5711i(i - 1, -i2, z);
                }
                this.mState.f3355g = true;
            }
        }
        this.mRecycler.m5497w(i, i2, z);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = (!this.mFirstLayoutComplete || isLayoutRequested()) ? false : false;
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.m5553z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            RunnableC1039e runnableC1039e = RunnableC1039e.f3627j.get();
            this.mGapWorker = runnableC1039e;
            if (runnableC1039e == null) {
                this.mGapWorker = new RunnableC1039e();
                Display m8604q = C0252s.m8604q(this);
                float f = 60.0f;
                if (!isInEditMode() && m8604q != null) {
                    float refreshRate = m8604q.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC1039e runnableC1039e2 = this.mGapWorker;
                runnableC1039e2.f3631h = 1.0E9f / f;
                RunnableC1039e.f3627j.set(runnableC1039e2);
            }
            this.mGapWorker.m5214a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC1039e runnableC1039e;
        super.onDetachedFromWindow();
        AbstractC0982l abstractC0982l = this.mItemAnimator;
        if (abstractC0982l != null) {
            abstractC0982l.mo5241k();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.m5652A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m5078j();
        if (!ALLOW_THREAD_GAP_WORK || (runnableC1039e = this.mGapWorker) == null) {
            return;
        }
        runnableC1039e.m5205j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo3038g(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.mo5399l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.mo5402k()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.mo5399l()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.mo5402k()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            return false;
        }
        boolean mo5402k = abstractC0988o.mo5402k();
        boolean mo5399l = this.mLayout.mo5399l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo5402k ? 1 : 0;
            if (mo5399l) {
                i |= 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!mo5402k || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (mo5399l && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0146c.m8965a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0146c.m8964b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0988o.mo5386s0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.m5609Z0(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f3353e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.m5650A1(i, i2);
            this.mState.f3358j = true;
            dispatchLayoutStep2();
            this.mLayout.m5645D1(i, i2);
            if (this.mLayout.mo5638G1()) {
                this.mLayout.m5650A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f3358j = true;
                dispatchLayoutStep2();
                this.mLayout.m5645D1(i, i2);
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.m5609Z0(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C0968a0 c0968a0 = this.mState;
                if (c0968a0.f3360l) {
                    c0968a0.f3356h = true;
                } else {
                    this.mAdapterHelper.m5314j();
                    this.mState.f3356h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f3360l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0977g abstractC0977g = this.mAdapter;
            if (abstractC0977g != null) {
                this.mState.f3354f = abstractC0977g.mo2957c();
            } else {
                this.mState.f3354f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.m5609Z0(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f3356h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1003y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1003y c1003y = (C1003y) parcelable;
        this.mPendingSavedState = c1003y;
        super.onRestoreInstanceState(c1003y.m8522a());
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null || (parcelable2 = this.mPendingSavedState.f3451h) == null) {
            return;
        }
        abstractC0988o.mo5414c1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1003y c1003y = new C1003y(super.onSaveInstanceState());
        C1003y c1003y2 = this.mPendingSavedState;
        if (c1003y2 != null) {
            c1003y.m5491b(c1003y2);
        } else {
            AbstractC0988o abstractC0988o = this.mLayout;
            c1003y.f3451h = abstractC0988o != null ? abstractC0988o.mo5412d1() : null;
        }
        return c1003y;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        C0252s.m8638Y(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(AbstractC0974d0 abstractC0974d0, AbstractC0982l.C0985c c0985c) {
        abstractC0974d0.m5726F(0, 8192);
        if (this.mState.f3357i && abstractC0974d0.m5695y() && !abstractC0974d0.m5698v() && !abstractC0974d0.m5722J()) {
            this.mViewInfoStore.m5085c(getChangedHolderKey(abstractC0974d0), abstractC0974d0);
        }
        this.mViewInfoStore.m5083e(abstractC0974d0, c0985c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        AbstractC0982l abstractC0982l = this.mItemAnimator;
        if (abstractC0982l != null) {
            abstractC0982l.mo5241k();
        }
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.m5583k1(this.mRecycler);
            this.mLayout.m5581l1(this.mRecycler);
        }
        this.mRecycler.m5517c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m5275r = this.mChildHelper.m5275r(view);
        if (m5275r) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m5523J(childViewHolderInt);
            this.mRecycler.m5530C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!m5275r);
        return m5275r;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.m5696x()) {
                childViewHolderInt.m5714f();
            } else if (!childViewHolderInt.m5722J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(AbstractC0987n abstractC0987n) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o != null) {
            abstractC0988o.mo5407g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0987n);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0994q interfaceC0994q) {
        List<InterfaceC0994q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0994q);
    }

    public void removeOnItemTouchListener(InterfaceC0996s interfaceC0996s) {
        this.mOnItemTouchListeners.remove(interfaceC0996s);
        if (this.mInterceptingOnItemTouchListener == interfaceC0996s) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC0997t abstractC0997t) {
        List<AbstractC0997t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0997t);
        }
    }

    void repositionShadowingViews() {
        AbstractC0974d0 abstractC0974d0;
        int m5286g = this.mChildHelper.m5286g();
        for (int i = 0; i < m5286g; i++) {
            View m5287f = this.mChildHelper.m5287f(i);
            AbstractC0974d0 childViewHolder = getChildViewHolder(m5287f);
            if (childViewHolder != null && (abstractC0974d0 = childViewHolder.f3384i) != null) {
                View view = abstractC0974d0.f3376a;
                int left = m5287f.getLeft();
                int top = m5287f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.m5604b1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.m5567r1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo5233c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int m5283j = this.mChildHelper.m5283j();
        for (int i = 0; i < m5283j; i++) {
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m5284i(i));
            if (!childViewHolderInt.m5722J()) {
                childViewHolderInt.m5727E();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean mo5402k = abstractC0988o.mo5402k();
            boolean mo5399l = this.mLayout.mo5399l();
            if (mo5402k || mo5399l) {
                if (!mo5402k) {
                    i = 0;
                }
                if (!mo5399l) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null);
            }
        }
    }

    boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i3, i5, i6, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i9 = i5 - iArr4[0];
        int i10 = i6 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i11 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i11 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0242i.m8688a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i9, motionEvent.getY(), i10);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            dispatchOnScrolled(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0146c.m8965a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int mo5378w1 = i != 0 ? this.mLayout.mo5378w1(i, this.mRecycler, this.mState) : 0;
        int mo5374y1 = i2 != 0 ? this.mLayout.mo5374y1(i2, this.mRecycler, this.mState) : 0;
        C0146c.m8964b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = mo5378w1;
            iArr[1] = mo5374y1;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        abstractC0988o.mo5376x1(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1051k c1051k) {
        this.mAccessibilityDelegate = c1051k;
        C0252s.m8625f0(this, c1051k);
    }

    public void setAdapter(AbstractC0977g abstractC0977g) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0977g, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0980j interfaceC0980j) {
        if (interfaceC0980j == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC0980j;
        setChildrenDrawingOrderEnabled(interfaceC0980j != null);
    }

    boolean setChildImportantForAccessibilityInternal(AbstractC0974d0 abstractC0974d0, int i) {
        if (!isComputingLayout()) {
            C0252s.m8605p0(abstractC0974d0.f3376a, i);
            return true;
        }
        abstractC0974d0.f3392q = i;
        this.mPendingAccessibilityImportanceChange.add(abstractC0974d0);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0981k c0981k) {
        C0194i.m8866c(c0981k);
        this.mEdgeEffectFactory = c0981k;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC0982l abstractC0982l) {
        AbstractC0982l abstractC0982l2 = this.mItemAnimator;
        if (abstractC0982l2 != null) {
            abstractC0982l2.mo5241k();
            this.mItemAnimator.m5661v(null);
        }
        this.mItemAnimator = abstractC0982l;
        if (abstractC0982l != null) {
            abstractC0982l.m5661v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m5526G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0988o abstractC0988o) {
        if (abstractC0988o == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC0982l abstractC0982l = this.mItemAnimator;
            if (abstractC0982l != null) {
                abstractC0982l.mo5241k();
            }
            this.mLayout.m5583k1(this.mRecycler);
            this.mLayout.m5581l1(this.mRecycler);
            this.mRecycler.m5517c();
            if (this.mIsAttached) {
                this.mLayout.m5652A(this, this.mRecycler);
            }
            this.mLayout.m5643E1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m5517c();
        }
        this.mChildHelper.m5278o();
        this.mLayout = abstractC0988o;
        if (abstractC0988o != null) {
            if (abstractC0988o.f3408b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0988o + " is already attached to a RecyclerView:" + abstractC0988o.f3408b.exceptionLabel());
            }
            abstractC0988o.m5643E1(this);
            if (this.mIsAttached) {
                this.mLayout.m5553z(this);
            }
        }
        this.mRecycler.m5522K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m8674n(z);
    }

    public void setOnFlingListener(AbstractC0995r abstractC0995r) {
        this.mOnFlingListener = abstractC0995r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0997t abstractC0997t) {
        this.mScrollListener = abstractC0997t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C0998u c0998u) {
        this.mRecycler.m5528E(c0998u);
    }

    public void setRecyclerListener(InterfaceC1001w interfaceC1001w) {
        this.mRecyclerListener = interfaceC1001w;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = scaledTouchSlop;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0970b0 abstractC0970b0) {
        this.mRecycler.m5527F(abstractC0970b0);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int m8801a = accessibilityEvent != null ? C0216b.m8801a(accessibilityEvent) : 0;
            this.mEatenAccessibilityChangeFlags |= m8801a != 0 ? m8801a : 0;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!abstractC0988o.mo5402k()) {
                i = 0;
            }
            if (!this.mLayout.mo5399l()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
                scrollBy(i, i2);
                return;
            }
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.m5733f(i, i2, i3, interpolator);
        }
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC0988o abstractC0988o = this.mLayout;
        if (abstractC0988o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0988o.mo2974I1(this, this.mState, i);
        }
    }

    void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m8672p(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m8671q(i, i2);
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, p000a.p019g.p028k.InterfaceC0243j
    public void stopNestedScroll() {
        getScrollingChildHelper().m8670r();
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m8669s(i);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(AbstractC0977g abstractC0977g, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0977g, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int m5283j = this.mChildHelper.m5283j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m5283j; i5++) {
            View m5284i = this.mChildHelper.m5284i(i5);
            AbstractC0974d0 childViewHolderInt = getChildViewHolderInt(m5284i);
            if (childViewHolderInt != null && !childViewHolderInt.m5722J() && (i3 = childViewHolderInt.f3378c) >= i && i3 < i4) {
                childViewHolderInt.m5718b(2);
                childViewHolderInt.m5719a(obj);
                ((C0993p) m5284i.getLayoutParams()).f3433c = true;
            }
        }
        this.mRecycler.m5520M(i, i2);
    }
}
