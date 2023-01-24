package com.kalpana.animalVision.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0002J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\u0006\u00106\u001a\u000203R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00067"}, d2 = {"Lcom/kalpana/animalVision/fragment/SignupFragment;", "Landroidx/fragment/app/Fragment;", "c", "Landroid/content/Context;", "(Landroid/content/Context;)V", "btnSignup", "Landroid/widget/Button;", "getBtnSignup", "()Landroid/widget/Button;", "setBtnSignup", "(Landroid/widget/Button;)V", "getC", "()Landroid/content/Context;", "etAddress", "Landroid/widget/EditText;", "getEtAddress", "()Landroid/widget/EditText;", "setEtAddress", "(Landroid/widget/EditText;)V", "etConpass", "getEtConpass", "setEtConpass", "etEmail", "getEtEmail", "setEtEmail", "etMobno", "getEtMobno", "setEtMobno", "etName", "getEtName", "setEtName", "etPass", "getEtPass", "setEtPass", "prog", "Landroid/widget/TextView;", "getProg", "()Landroid/widget/TextView;", "setProg", "(Landroid/widget/TextView;)V", "errors", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "openDashBoard", "regBtnClicked", "registrySuccess", "app_debug"})
public final class SignupFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context c = null;
    public android.widget.EditText etName;
    public android.widget.EditText etEmail;
    public android.widget.EditText etMobno;
    public android.widget.EditText etAddress;
    public android.widget.EditText etPass;
    public android.widget.EditText etConpass;
    public android.widget.Button btnSignup;
    public android.widget.TextView prog;
    private java.util.HashMap _$_findViewCache;
    
    public SignupFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtName() {
        return null;
    }
    
    public final void setEtName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtEmail() {
        return null;
    }
    
    public final void setEtEmail(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtMobno() {
        return null;
    }
    
    public final void setEtMobno(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtAddress() {
        return null;
    }
    
    public final void setEtAddress(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtPass() {
        return null;
    }
    
    public final void setEtPass(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtConpass() {
        return null;
    }
    
    public final void setEtConpass(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnSignup() {
        return null;
    }
    
    public final void setBtnSignup(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getProg() {
        return null;
    }
    
    public final void setProg(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void registrySuccess() {
    }
    
    private final void openDashBoard() {
    }
    
    private final void regBtnClicked() {
    }
    
    private final boolean errors() {
        return false;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}