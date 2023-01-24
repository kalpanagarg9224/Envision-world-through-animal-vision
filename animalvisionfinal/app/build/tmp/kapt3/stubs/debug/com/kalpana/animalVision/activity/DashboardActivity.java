package com.kalpana.animalVision.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020%H\u0016J\b\u0010>\u001a\u000207H\u0014J\b\u0010?\u001a\u000207H\u0002J\b\u0010@\u001a\u000207H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006A"}, d2 = {"Lcom/kalpana/animalVision/activity/DashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getCoordinatorLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "setCoordinatorLayout", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "frameLayout", "Landroid/widget/FrameLayout;", "getFrameLayout", "()Landroid/widget/FrameLayout;", "setFrameLayout", "(Landroid/widget/FrameLayout;)V", "headerTxt1", "Landroid/widget/TextView;", "getHeaderTxt1", "()Landroid/widget/TextView;", "setHeaderTxt1", "(Landroid/widget/TextView;)V", "headerTxt2", "getHeaderTxt2", "setHeaderTxt2", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "getNavigationView", "()Lcom/google/android/material/navigation/NavigationView;", "setNavigationView", "(Lcom/google/android/material/navigation/NavigationView;)V", "previousMenuItemSelected", "Landroid/view/MenuItem;", "getPreviousMenuItemSelected", "()Landroid/view/MenuItem;", "setPreviousMenuItemSelected", "(Landroid/view/MenuItem;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "onResume", "openLiveCamera", "setToolBar", "app_debug"})
public final class DashboardActivity extends androidx.appcompat.app.AppCompatActivity {
    public androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
    public androidx.appcompat.widget.Toolbar toolbar;
    public android.widget.FrameLayout frameLayout;
    public com.google.android.material.navigation.NavigationView navigationView;
    public androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    public android.widget.TextView headerTxt1;
    public android.widget.TextView headerTxt2;
    public android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.Nullable()
    private android.view.MenuItem previousMenuItemSelected;
    private java.util.HashMap _$_findViewCache;
    
    public DashboardActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.coordinatorlayout.widget.CoordinatorLayout getCoordinatorLayout() {
        return null;
    }
    
    public final void setCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getFrameLayout() {
        return null;
    }
    
    public final void setFrameLayout(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.navigation.NavigationView getNavigationView() {
        return null;
    }
    
    public final void setNavigationView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.navigation.NavigationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    public final void setDrawerLayout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHeaderTxt1() {
        return null;
    }
    
    public final void setHeaderTxt1(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHeaderTxt2() {
        return null;
    }
    
    public final void setHeaderTxt2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.MenuItem getPreviousMenuItemSelected() {
        return null;
    }
    
    public final void setPreviousMenuItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setToolBar() {
    }
    
    private final void openLiveCamera() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
}