package com.insecureshop;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.databinding.ActivityImplicitIntentForNonExportedBindingImpl;
import com.insecureshop.databinding.ActivityLoginBindingImpl;
import com.insecureshop.databinding.ActivityMainBindingImpl;
import com.insecureshop.databinding.ActivityPrivateBindingImpl;
import com.insecureshop.databinding.ActivityWebviewBindingImpl;
import com.insecureshop.databinding.AppLoadingDialogBindingImpl;
import com.insecureshop.databinding.BaseMainBindingImpl;
import com.insecureshop.databinding.CartItemBindingImpl;
import com.insecureshop.databinding.FragmentHomeBindingImpl;
import com.insecureshop.databinding.ProductItemBindingImpl;
import com.insecureshop.databinding.ToolbarBindingImpl;
import com.insecureshop.databinding.UploadSuccessDialogBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYIMPLICITINTENTFORNONEXPORTED = 1;
    private static final int LAYOUT_ACTIVITYLOGIN = 2;
    private static final int LAYOUT_ACTIVITYMAIN = 3;
    private static final int LAYOUT_ACTIVITYPRIVATE = 4;
    private static final int LAYOUT_ACTIVITYWEBVIEW = 5;
    private static final int LAYOUT_APPLOADINGDIALOG = 6;
    private static final int LAYOUT_BASEMAIN = 7;
    private static final int LAYOUT_CARTITEM = 8;
    private static final int LAYOUT_FRAGMENTHOME = 9;
    private static final int LAYOUT_PRODUCTITEM = 10;
    private static final int LAYOUT_TOOLBAR = 11;
    private static final int LAYOUT_UPLOADSUCCESSDIALOG = 12;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(C0893R.layout.activity_implicit_intent_for_non_exported, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.activity_login, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.activity_main, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.activity_private, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.activity_webview, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.app_loading_dialog, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.base_main, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.cart_item, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.fragment_home, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.product_item, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.toolbar, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(C0893R.layout.upload_success_dialog, 12);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
        int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (localizedLayoutId > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (localizedLayoutId) {
                case 1:
                    if ("layout/activity_implicit_intent_for_non_exported_0".equals(tag)) {
                        return new ActivityImplicitIntentForNonExportedBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_implicit_intent_for_non_exported is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_login_0".equals(tag)) {
                        return new ActivityLoginBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_main_0".equals(tag)) {
                        return new ActivityMainBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                case 4:
                    if ("layout/activity_private_0".equals(tag)) {
                        return new ActivityPrivateBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_private is invalid. Received: " + tag);
                case 5:
                    if ("layout/activity_webview_0".equals(tag)) {
                        return new ActivityWebviewBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_webview is invalid. Received: " + tag);
                case 6:
                    if ("layout/app_loading_dialog_0".equals(tag)) {
                        return new AppLoadingDialogBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for app_loading_dialog is invalid. Received: " + tag);
                case 7:
                    if ("layout/base_main_0".equals(tag)) {
                        return new BaseMainBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for base_main is invalid. Received: " + tag);
                case 8:
                    if ("layout/cart_item_0".equals(tag)) {
                        return new CartItemBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for cart_item is invalid. Received: " + tag);
                case 9:
                    if ("layout/fragment_home_0".equals(tag)) {
                        return new FragmentHomeBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
                case 10:
                    if ("layout/product_item_0".equals(tag)) {
                        return new ProductItemBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for product_item is invalid. Received: " + tag);
                case 11:
                    if ("layout/toolbar_0".equals(tag)) {
                        return new ToolbarBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for toolbar is invalid. Received: " + tag);
                case 12:
                    if ("layout/upload_success_dialog_0".equals(tag)) {
                        return new UploadSuccessDialogBindingImpl(component, view);
                    }
                    throw new IllegalArgumentException("The tag for upload_success_dialog is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
        if (views == null || views.length == 0) {
            return null;
        }
        int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
        if (localizedLayoutId > 0) {
            Object tag = views[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String tag) {
        Integer tmpVal;
        if (tag == null || (tmpVal = InnerLayoutIdLookup.sKeys.get(tag)) == null) {
            return 0;
        }
        return tmpVal.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int localId) {
        String tmpVal = InnerBrLookup.sKeys.get(localId);
        return tmpVal;
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList<DataBinderMapper> result = new ArrayList<>(1);
        result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return result;
    }

    /* loaded from: classes.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(12);
            sKeys = hashMap;
            hashMap.put("layout/activity_implicit_intent_for_non_exported_0", Integer.valueOf((int) C0893R.layout.activity_implicit_intent_for_non_exported));
            sKeys.put("layout/activity_login_0", Integer.valueOf((int) C0893R.layout.activity_login));
            sKeys.put("layout/activity_main_0", Integer.valueOf((int) C0893R.layout.activity_main));
            sKeys.put("layout/activity_private_0", Integer.valueOf((int) C0893R.layout.activity_private));
            sKeys.put("layout/activity_webview_0", Integer.valueOf((int) C0893R.layout.activity_webview));
            sKeys.put("layout/app_loading_dialog_0", Integer.valueOf((int) C0893R.layout.app_loading_dialog));
            sKeys.put("layout/base_main_0", Integer.valueOf((int) C0893R.layout.base_main));
            sKeys.put("layout/cart_item_0", Integer.valueOf((int) C0893R.layout.cart_item));
            sKeys.put("layout/fragment_home_0", Integer.valueOf((int) C0893R.layout.fragment_home));
            sKeys.put("layout/product_item_0", Integer.valueOf((int) C0893R.layout.product_item));
            sKeys.put("layout/toolbar_0", Integer.valueOf((int) C0893R.layout.toolbar));
            sKeys.put("layout/upload_success_dialog_0", Integer.valueOf((int) C0893R.layout.upload_success_dialog));
        }
    }
}
