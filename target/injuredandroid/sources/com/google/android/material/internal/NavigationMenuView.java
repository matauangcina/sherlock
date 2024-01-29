package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0524n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n
    /* renamed from: b */
    public void mo2797b(C0507g c0507g) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
