package androidx.databinding.adapters;

import android.widget.TabHost;
import androidx.databinding.InverseBindingListener;
/* loaded from: classes.dex */
public class TabHostBindingAdapter {
    public static int getCurrentTab(TabHost view) {
        return view.getCurrentTab();
    }

    public static String getCurrentTabTag(TabHost view) {
        return view.getCurrentTabTag();
    }

    public static void setCurrentTab(TabHost view, int tab) {
        if (view.getCurrentTab() != tab) {
            view.setCurrentTab(tab);
        }
    }

    public static void setCurrentTabTag(TabHost view, String tabTag) {
        if (view.getCurrentTabTag() != tabTag) {
            view.setCurrentTabByTag(tabTag);
        }
    }

    public static void setListeners(TabHost view, final TabHost.OnTabChangeListener listener, final InverseBindingListener attrChange) {
        if (attrChange == null) {
            view.setOnTabChangedListener(listener);
        } else {
            view.setOnTabChangedListener(new TabHost.OnTabChangeListener() { // from class: androidx.databinding.adapters.TabHostBindingAdapter.1
                @Override // android.widget.TabHost.OnTabChangeListener
                public void onTabChanged(String tabId) {
                    TabHost.OnTabChangeListener onTabChangeListener = listener;
                    if (onTabChangeListener != null) {
                        onTabChangeListener.onTabChanged(tabId);
                    }
                    attrChange.onChange();
                }
            });
        }
    }
}
