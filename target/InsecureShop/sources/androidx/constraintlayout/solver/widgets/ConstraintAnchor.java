package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    public static final int AUTO_CONSTRAINT_CREATOR = 2;
    public static final int SCOUT_CREATOR = 1;
    private static final int UNSET_GONE_MARGIN = -1;
    public static final int USER_CREATOR = 0;
    final ConstraintWidget mOwner;
    SolverVariable mSolverVariable;
    ConstraintAnchor mTarget;
    final Type mType;
    private ResolutionAnchor mResolutionAnchor = new ResolutionAnchor(this);
    public int mMargin = 0;
    int mGoneMargin = -1;
    private Strength mStrength = Strength.NONE;
    private ConnectionType mConnectionType = ConnectionType.RELAXED;
    private int mConnectionCreator = 0;

    /* loaded from: classes.dex */
    public enum ConnectionType {
        RELAXED,
        STRICT
    }

    /* loaded from: classes.dex */
    public enum Strength {
        NONE,
        STRONG,
        WEAK
    }

    /* loaded from: classes.dex */
    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ResolutionAnchor getResolutionNode() {
        return this.mResolutionAnchor;
    }

    public ConstraintAnchor(ConstraintWidget owner, Type type) {
        this.mOwner = owner;
        this.mType = type;
    }

    public SolverVariable getSolverVariable() {
        return this.mSolverVariable;
    }

    public void resetSolverVariable(Cache cache) {
        SolverVariable solverVariable = this.mSolverVariable;
        if (solverVariable == null) {
            this.mSolverVariable = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.reset();
        }
    }

    public ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public Type getType() {
        return this.mType;
    }

    public int getMargin() {
        ConstraintAnchor constraintAnchor;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        if (this.mGoneMargin > -1 && (constraintAnchor = this.mTarget) != null && constraintAnchor.mOwner.getVisibility() == 8) {
            return this.mGoneMargin;
        }
        return this.mMargin;
    }

    public Strength getStrength() {
        return this.mStrength;
    }

    public ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public ConnectionType getConnectionType() {
        return this.mConnectionType;
    }

    public void setConnectionType(ConnectionType type) {
        this.mConnectionType = type;
    }

    public int getConnectionCreator() {
        return this.mConnectionCreator;
    }

    public void setConnectionCreator(int creator) {
        this.mConnectionCreator = creator;
    }

    public void reset() {
        this.mTarget = null;
        this.mMargin = 0;
        this.mGoneMargin = -1;
        this.mStrength = Strength.STRONG;
        this.mConnectionCreator = 0;
        this.mConnectionType = ConnectionType.RELAXED;
        this.mResolutionAnchor.reset();
    }

    public boolean connect(ConstraintAnchor toAnchor, int margin, Strength strength, int creator) {
        return connect(toAnchor, margin, -1, strength, creator, false);
    }

    public boolean connect(ConstraintAnchor toAnchor, int margin, int goneMargin, Strength strength, int creator, boolean forceConnection) {
        if (toAnchor == null) {
            this.mTarget = null;
            this.mMargin = 0;
            this.mGoneMargin = -1;
            this.mStrength = Strength.NONE;
            this.mConnectionCreator = 2;
            return true;
        } else if (forceConnection || isValidConnection(toAnchor)) {
            this.mTarget = toAnchor;
            if (margin > 0) {
                this.mMargin = margin;
            } else {
                this.mMargin = 0;
            }
            this.mGoneMargin = goneMargin;
            this.mStrength = strength;
            this.mConnectionCreator = creator;
            return true;
        } else {
            return false;
        }
    }

    public boolean connect(ConstraintAnchor toAnchor, int margin, int creator) {
        return connect(toAnchor, margin, -1, Strength.STRONG, creator, false);
    }

    public boolean connect(ConstraintAnchor toAnchor, int margin) {
        return connect(toAnchor, margin, -1, Strength.STRONG, 0, false);
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isValidConnection(ConstraintAnchor anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        Type target = anchor.getType();
        Type type = this.mType;
        if (target == type) {
            return type != Type.BASELINE || (anchor.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
                return (target == Type.BASELINE || target == Type.CENTER_X || target == Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean isCompatible2 = target == Type.LEFT || target == Type.RIGHT;
                if (anchor.getOwner() instanceof Guideline) {
                    boolean isCompatible3 = (isCompatible2 || target == Type.CENTER_X) ? true : true;
                    return isCompatible3;
                }
                return isCompatible2;
            case 4:
            case 5:
                boolean isCompatible4 = target == Type.TOP || target == Type.BOTTOM;
                if (anchor.getOwner() instanceof Guideline) {
                    return (isCompatible4 || target == Type.CENTER_Y) ? true : true;
                }
                return isCompatible4;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C01511 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f14x4c44d048;

        static {
            int[] iArr = new int[Type.values().length];
            f14x4c44d048 = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f14x4c44d048[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f14x4c44d048[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f14x4c44d048[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f14x4c44d048[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f14x4c44d048[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f14x4c44d048[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f14x4c44d048[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f14x4c44d048[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public boolean isSideAnchor() {
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor anchor) {
        Type target = anchor.getType();
        if (target == this.mType) {
            return true;
        }
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
                return target != Type.BASELINE;
            case 2:
            case 3:
            case 7:
                return target == Type.LEFT || target == Type.RIGHT || target == Type.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return target == Type.TOP || target == Type.BOTTOM || target == Type.CENTER_Y || target == Type.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public void setStrength(Strength strength) {
        if (isConnected()) {
            this.mStrength = strength;
        }
    }

    public void setMargin(int margin) {
        if (isConnected()) {
            this.mMargin = margin;
        }
    }

    public void setGoneMargin(int margin) {
        if (isConnected()) {
            this.mGoneMargin = margin;
        }
    }

    public boolean isVerticalAnchor() {
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }

    public int getSnapPriorityLevel() {
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 2;
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 0;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public int getPriorityLevel() {
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
                return 2;
            case 4:
                return 2;
            case 5:
                return 2;
            case 6:
                return 1;
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isSnapCompatibleWith(ConstraintAnchor anchor) {
        if (this.mType == Type.CENTER) {
            return false;
        }
        if (this.mType == anchor.getType()) {
            return true;
        }
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 9:
                return false;
            case 2:
                int i = C01511.f14x4c44d048[anchor.getType().ordinal()];
                return i == 3 || i == 7;
            case 3:
                int i2 = C01511.f14x4c44d048[anchor.getType().ordinal()];
                return i2 == 2 || i2 == 7;
            case 4:
                int i3 = C01511.f14x4c44d048[anchor.getType().ordinal()];
                return i3 == 5 || i3 == 8;
            case 5:
                int i4 = C01511.f14x4c44d048[anchor.getType().ordinal()];
                return i4 == 4 || i4 == 8;
            case 7:
                int i5 = C01511.f14x4c44d048[anchor.getType().ordinal()];
                return i5 == 2 || i5 == 3;
            case 8:
                int i6 = C01511.f14x4c44d048[anchor.getType().ordinal()];
                return i6 == 4 || i6 == 5;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isConnectionAllowed(ConstraintWidget target, ConstraintAnchor anchor) {
        return isConnectionAllowed(target);
    }

    public boolean isConnectionAllowed(ConstraintWidget target) {
        HashSet<ConstraintWidget> checked = new HashSet<>();
        if (isConnectionToMe(target, checked)) {
            return false;
        }
        ConstraintWidget parent = getOwner().getParent();
        return parent == target || target.getParent() == parent;
    }

    private boolean isConnectionToMe(ConstraintWidget target, HashSet<ConstraintWidget> checked) {
        if (checked.contains(target)) {
            return false;
        }
        checked.add(target);
        if (target == getOwner()) {
            return true;
        }
        ArrayList<ConstraintAnchor> targetAnchors = target.getAnchors();
        int targetAnchorsSize = targetAnchors.size();
        for (int i = 0; i < targetAnchorsSize; i++) {
            ConstraintAnchor anchor = targetAnchors.get(i);
            if (anchor.isSimilarDimensionConnection(this) && anchor.isConnected() && isConnectionToMe(anchor.getTarget().getOwner(), checked)) {
                return true;
            }
        }
        return false;
    }

    public final ConstraintAnchor getOpposite() {
        switch (C01511.f14x4c44d048[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.mOwner.mRight;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mBottom;
            case 5:
                return this.mOwner.mTop;
            default:
                throw new AssertionError(this.mType.name());
        }
    }
}
