package com.facebook.yoga;

import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class YogaNode implements Cloneable {

    /* renamed from: a */
    private YogaNode f5783a;

    /* renamed from: b */
    private List<YogaNode> f5784b;

    /* renamed from: c */
    private YogaMeasureFunction f5785c;

    /* renamed from: d */
    private YogaBaselineFunction f5786d;

    /* renamed from: e */
    private long f5787e;

    /* renamed from: f */
    private Object f5788f;

    /* renamed from: g */
    private boolean f5789g;

    @InterfaceC2039a
    private float mBorderBottom;

    @InterfaceC2039a
    private float mBorderLeft;

    @InterfaceC2039a
    private float mBorderRight;

    @InterfaceC2039a
    private float mBorderTop;

    @InterfaceC2039a
    private boolean mDoesLegacyStretchFlagAffectsLayout;

    @InterfaceC2039a
    private int mEdgeSetFlag;

    @InterfaceC2039a
    private boolean mHasNewLayout;

    @InterfaceC2039a
    private float mHeight;

    @InterfaceC2039a
    private int mLayoutDirection;

    @InterfaceC2039a
    private float mLeft;

    @InterfaceC2039a
    private float mMarginBottom;

    @InterfaceC2039a
    private float mMarginLeft;

    @InterfaceC2039a
    private float mMarginRight;

    @InterfaceC2039a
    private float mMarginTop;

    @InterfaceC2039a
    private float mPaddingBottom;

    @InterfaceC2039a
    private float mPaddingLeft;

    @InterfaceC2039a
    private float mPaddingRight;

    @InterfaceC2039a
    private float mPaddingTop;

    @InterfaceC2039a
    private float mTop;

    @InterfaceC2039a
    private float mWidth;

    static {
        SoLoader.m6388a("yoga");
    }

    public YogaNode() {
        this.mEdgeSetFlag = 0;
        this.f5789g = false;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        this.f5787e = jni_YGNodeNew();
        if (this.f5787e == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNode(YogaConfig yogaConfig) {
        this.mEdgeSetFlag = 0;
        this.f5789g = false;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        this.f5787e = jni_YGNodeNewWithConfig(yogaConfig.f5727a);
        if (this.f5787e == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    private static native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private static native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    private static native void jni_YGNodeCopyStyle(long j, long j2);

    private static native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    private static native void jni_YGNodeInsertChild(long j, long j2, int i);

    private static native boolean jni_YGNodeIsDirty(long j);

    private static native boolean jni_YGNodeIsReferenceBaseline(long j);

    private static native void jni_YGNodeMarkDirty(long j);

    private static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private static native void jni_YGNodePrint(long j);

    private static native void jni_YGNodeRemoveChild(long j, long j2);

    private static native void jni_YGNodeReset(long j);

    private static native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    private static native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    private static native void jni_YGNodeSetIsReferenceBaseline(long j, boolean z);

    private static native void jni_YGNodeSetOwner(long j, long j2);

    private static native int jni_YGNodeStyleGetAlignContent(long j);

    private static native int jni_YGNodeStyleGetAlignItems(long j);

    private static native int jni_YGNodeStyleGetAlignSelf(long j);

    private static native float jni_YGNodeStyleGetAspectRatio(long j);

    private static native float jni_YGNodeStyleGetBorder(long j, int i);

    private static native int jni_YGNodeStyleGetDirection(long j);

    private static native int jni_YGNodeStyleGetDisplay(long j);

    private static native Object jni_YGNodeStyleGetFlexBasis(long j);

    private static native int jni_YGNodeStyleGetFlexDirection(long j);

    private static native float jni_YGNodeStyleGetFlexGrow(long j);

    private static native float jni_YGNodeStyleGetFlexShrink(long j);

    private static native Object jni_YGNodeStyleGetHeight(long j);

    private static native int jni_YGNodeStyleGetJustifyContent(long j);

    private static native Object jni_YGNodeStyleGetMargin(long j, int i);

    private static native Object jni_YGNodeStyleGetMaxHeight(long j);

    private static native Object jni_YGNodeStyleGetMaxWidth(long j);

    private static native Object jni_YGNodeStyleGetMinHeight(long j);

    private static native Object jni_YGNodeStyleGetMinWidth(long j);

    private static native int jni_YGNodeStyleGetOverflow(long j);

    private static native Object jni_YGNodeStyleGetPadding(long j, int i);

    private static native Object jni_YGNodeStyleGetPosition(long j, int i);

    private static native int jni_YGNodeStyleGetPositionType(long j);

    private static native Object jni_YGNodeStyleGetWidth(long j);

    private static native void jni_YGNodeStyleSetAlignContent(long j, int i);

    private static native void jni_YGNodeStyleSetAlignItems(long j, int i);

    private static native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    private static native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    private static native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    private static native void jni_YGNodeStyleSetDirection(long j, int i);

    private static native void jni_YGNodeStyleSetDisplay(long j, int i);

    private static native void jni_YGNodeStyleSetFlex(long j, float f);

    private static native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private static native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    private static native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    private static native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    private static native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    private static native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    private static native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    private static native void jni_YGNodeStyleSetHeight(long j, float f);

    private static native void jni_YGNodeStyleSetHeightAuto(long j);

    private static native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    private static native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    private static native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    private static native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    private static native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    private static native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMinHeight(long j, float f);

    private static native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    private static native void jni_YGNodeStyleSetMinWidth(long j, float f);

    private static native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private static native void jni_YGNodeStyleSetOverflow(long j, int i);

    private static native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    private static native void jni_YGNodeStyleSetPositionType(long j, int i);

    private static native void jni_YGNodeStyleSetWidth(long j, float f);

    private static native void jni_YGNodeStyleSetWidthAuto(long j);

    private static native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    @InterfaceC2039a
    private final long replaceChild(YogaNode yogaNode, int i) {
        List<YogaNode> list = this.f5784b;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.f5784b.add(i, yogaNode);
        yogaNode.f5783a = this;
        return yogaNode.f5787e;
    }

    /* renamed from: a */
    public float m6482a(YogaEdge yogaEdge) {
        switch (C1555c.f5824a[yogaEdge.ordinal()]) {
            case 1:
                return this.mPaddingLeft;
            case 2:
                return this.mPaddingTop;
            case 3:
                return this.mPaddingRight;
            case 4:
                return this.mPaddingBottom;
            case 5:
                return m6504c() == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case 6:
                return m6504c() == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    /* renamed from: a */
    public YogaNode m6483a(int i) {
        List<YogaNode> list = this.f5784b;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNode remove = list.remove(i);
        remove.f5783a = null;
        jni_YGNodeRemoveChild(this.f5787e, remove.f5787e);
        return remove;
    }

    /* renamed from: a */
    public void m6484a() {
        jni_YGNodeMarkDirty(this.f5787e);
    }

    /* renamed from: a */
    public void m6485a(float f) {
        jni_YGNodeStyleSetAspectRatio(this.f5787e, f);
    }

    /* renamed from: a */
    public void m6486a(float f, float f2) {
        jni_YGNodeCalculateLayout(this.f5787e, f, f2);
    }

    /* renamed from: a */
    public void m6487a(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignContent(this.f5787e, yogaAlign.m6471b());
    }

    /* renamed from: a */
    public void m6488a(YogaDirection yogaDirection) {
        jni_YGNodeStyleSetDirection(this.f5787e, yogaDirection.m6475b());
    }

    /* renamed from: a */
    public void m6489a(YogaDisplay yogaDisplay) {
        jni_YGNodeStyleSetDisplay(this.f5787e, yogaDisplay.m6476b());
    }

    /* renamed from: a */
    public void m6490a(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 4;
        jni_YGNodeStyleSetBorder(this.f5787e, yogaEdge.m6478b(), f);
    }

    /* renamed from: a */
    public void m6491a(YogaFlexDirection yogaFlexDirection) {
        jni_YGNodeStyleSetFlexDirection(this.f5787e, yogaFlexDirection.m6479b());
    }

    /* renamed from: a */
    public void m6492a(YogaJustify yogaJustify) {
        jni_YGNodeStyleSetJustifyContent(this.f5787e, yogaJustify.m6480b());
    }

    /* renamed from: a */
    public void m6493a(YogaMeasureFunction yogaMeasureFunction) {
        this.f5785c = yogaMeasureFunction;
        jni_YGNodeSetHasMeasureFunc(this.f5787e, yogaMeasureFunction != null);
    }

    /* renamed from: a */
    public void m6494a(YogaNode yogaNode, int i) {
        if (yogaNode.f5783a != null) {
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if (this.f5784b == null) {
            this.f5784b = new ArrayList(4);
        }
        this.f5784b.add(i, yogaNode);
        yogaNode.f5783a = this;
        jni_YGNodeInsertChild(this.f5787e, yogaNode.f5787e, i);
    }

    /* renamed from: a */
    public void m6495a(YogaOverflow yogaOverflow) {
        jni_YGNodeStyleSetOverflow(this.f5787e, yogaOverflow.m6539b());
    }

    /* renamed from: a */
    public void m6496a(YogaPositionType yogaPositionType) {
        jni_YGNodeStyleSetPositionType(this.f5787e, yogaPositionType.m6540b());
    }

    /* renamed from: a */
    public void m6497a(YogaWrap yogaWrap) {
        jni_YGNodeStyleSetFlexWrap(this.f5787e, yogaWrap.m6543b());
    }

    /* renamed from: a */
    public void m6498a(Object obj) {
        this.f5788f = obj;
    }

    /* renamed from: b */
    public void m6499b() {
        long j = this.f5787e;
        if (j > 0) {
            this.f5787e = 0L;
            jni_YGNodeFree(j);
        }
    }

    /* renamed from: b */
    public void m6500b(float f) {
        jni_YGNodeStyleSetFlex(this.f5787e, f);
    }

    /* renamed from: b */
    public void m6501b(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignItems(this.f5787e, yogaAlign.m6471b());
    }

    /* renamed from: b */
    public void m6502b(YogaEdge yogaEdge) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginAuto(this.f5787e, yogaEdge.m6478b());
    }

    /* renamed from: b */
    public void m6503b(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMargin(this.f5787e, yogaEdge.m6478b(), f);
    }

    @InterfaceC2039a
    public final float baseline(float f, float f2) {
        return this.f5786d.baseline(this, f, f2);
    }

    /* renamed from: c */
    public YogaDirection m6504c() {
        return YogaDirection.m6474a(this.mLayoutDirection);
    }

    /* renamed from: c */
    public void m6505c(float f) {
        jni_YGNodeStyleSetFlexBasis(this.f5787e, f);
    }

    /* renamed from: c */
    public void m6506c(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignSelf(this.f5787e, yogaAlign.m6471b());
    }

    /* renamed from: c */
    public void m6507c(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginPercent(this.f5787e, yogaEdge.m6478b(), f);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: clone */
    public YogaNode m11777clone() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.f5787e, yogaNode);
            if (this.f5784b != null) {
                for (YogaNode yogaNode2 : this.f5784b) {
                    jni_YGNodeSetOwner(yogaNode2.f5787e, 0L);
                    yogaNode2.f5783a = null;
                }
            }
            yogaNode.f5787e = jni_YGNodeClone;
            yogaNode.f5783a = null;
            yogaNode.f5784b = this.f5784b != null ? (List) ((ArrayList) this.f5784b).clone() : null;
            if (yogaNode.f5784b != null) {
                Iterator<YogaNode> it = yogaNode.f5784b.iterator();
                while (it.hasNext()) {
                    it.next().f5783a = null;
                }
            }
            return yogaNode;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    public float m6508d() {
        return this.mHeight;
    }

    /* renamed from: d */
    public void m6509d(float f) {
        jni_YGNodeStyleSetFlexBasisPercent(this.f5787e, f);
    }

    /* renamed from: d */
    public void m6510d(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPadding(this.f5787e, yogaEdge.m6478b(), f);
    }

    /* renamed from: e */
    public float m6511e() {
        return this.mWidth;
    }

    /* renamed from: e */
    public void m6512e(float f) {
        jni_YGNodeStyleSetFlexGrow(this.f5787e, f);
    }

    /* renamed from: e */
    public void m6513e(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPaddingPercent(this.f5787e, yogaEdge.m6478b(), f);
    }

    /* renamed from: f */
    public float m6514f() {
        return this.mLeft;
    }

    /* renamed from: f */
    public void m6515f(float f) {
        jni_YGNodeStyleSetFlexShrink(this.f5787e, f);
    }

    /* renamed from: f */
    public void m6516f(YogaEdge yogaEdge, float f) {
        this.f5789g = true;
        jni_YGNodeStyleSetPosition(this.f5787e, yogaEdge.m6478b(), f);
    }

    protected void finalize() {
        try {
            m6499b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public float m6517g() {
        return this.mTop;
    }

    /* renamed from: g */
    public void m6518g(float f) {
        jni_YGNodeStyleSetHeight(this.f5787e, f);
    }

    /* renamed from: g */
    public void m6519g(YogaEdge yogaEdge, float f) {
        this.f5789g = true;
        jni_YGNodeStyleSetPositionPercent(this.f5787e, yogaEdge.m6478b(), f);
    }

    /* renamed from: h */
    public void m6520h(float f) {
        jni_YGNodeStyleSetHeightPercent(this.f5787e, f);
    }

    /* renamed from: h */
    public boolean m6521h() {
        return this.mHasNewLayout;
    }

    /* renamed from: i */
    public void m6522i(float f) {
        jni_YGNodeStyleSetMaxHeight(this.f5787e, f);
    }

    /* renamed from: i */
    public boolean m6523i() {
        return jni_YGNodeIsDirty(this.f5787e);
    }

    /* renamed from: j */
    public void m6524j(float f) {
        jni_YGNodeStyleSetMaxHeightPercent(this.f5787e, f);
    }

    /* renamed from: j */
    public boolean m6525j() {
        return this.f5785c != null;
    }

    /* renamed from: k */
    public void m6526k() {
        this.mHasNewLayout = false;
    }

    /* renamed from: k */
    public void m6527k(float f) {
        jni_YGNodeStyleSetMaxWidth(this.f5787e, f);
    }

    /* renamed from: l */
    public void m6528l() {
        this.mEdgeSetFlag = 0;
        this.f5789g = false;
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = 0.0f;
        this.mMarginTop = 0.0f;
        this.mMarginRight = 0.0f;
        this.mMarginBottom = 0.0f;
        this.mPaddingLeft = 0.0f;
        this.mPaddingTop = 0.0f;
        this.mPaddingRight = 0.0f;
        this.mPaddingBottom = 0.0f;
        this.mBorderLeft = 0.0f;
        this.mBorderTop = 0.0f;
        this.mBorderRight = 0.0f;
        this.mBorderBottom = 0.0f;
        this.mLayoutDirection = 0;
        this.f5785c = null;
        this.f5786d = null;
        this.f5788f = null;
        this.mDoesLegacyStretchFlagAffectsLayout = false;
        jni_YGNodeReset(this.f5787e);
    }

    /* renamed from: l */
    public void m6529l(float f) {
        jni_YGNodeStyleSetMaxWidthPercent(this.f5787e, f);
    }

    /* renamed from: m */
    public void m6530m() {
        jni_YGNodeStyleSetFlexBasisAuto(this.f5787e);
    }

    /* renamed from: m */
    public void m6531m(float f) {
        jni_YGNodeStyleSetMinHeight(this.f5787e, f);
    }

    @InterfaceC2039a
    public final long measure(float f, int i, float f2, int i2) {
        if (m6525j()) {
            return this.f5785c.measure(this, f, YogaMeasureMode.m6481a(i), f2, YogaMeasureMode.m6481a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    /* renamed from: n */
    public void m6532n() {
        jni_YGNodeStyleSetHeightAuto(this.f5787e);
    }

    /* renamed from: n */
    public void m6533n(float f) {
        jni_YGNodeStyleSetMinHeightPercent(this.f5787e, f);
    }

    /* renamed from: o */
    public void m6534o() {
        jni_YGNodeStyleSetWidthAuto(this.f5787e);
    }

    /* renamed from: o */
    public void m6535o(float f) {
        jni_YGNodeStyleSetMinWidth(this.f5787e, f);
    }

    /* renamed from: p */
    public void m6536p(float f) {
        jni_YGNodeStyleSetMinWidthPercent(this.f5787e, f);
    }

    /* renamed from: q */
    public void m6537q(float f) {
        jni_YGNodeStyleSetWidth(this.f5787e, f);
    }

    /* renamed from: r */
    public void m6538r(float f) {
        jni_YGNodeStyleSetWidthPercent(this.f5787e, f);
    }
}
