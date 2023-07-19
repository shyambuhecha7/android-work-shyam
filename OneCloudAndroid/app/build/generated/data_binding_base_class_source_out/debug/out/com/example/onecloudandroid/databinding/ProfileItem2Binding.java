// Generated by data binding compiler. Do not edit!
package com.example.onecloudandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.onecloudandroid.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ProfileItem2Binding extends ViewDataBinding {
  @NonNull
  public final ImageView imgArr;

  @NonNull
  public final ImageView imgRight;

  @NonNull
  public final TextView tvStatus;

  @Bindable
  protected String mTitle;

  protected ProfileItem2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgArr, ImageView imgRight, TextView tvStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgArr = imgArr;
    this.imgRight = imgRight;
    this.tvStatus = tvStatus;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  @NonNull
  public static ProfileItem2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.profile_item2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ProfileItem2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ProfileItem2Binding>inflateInternal(inflater, R.layout.profile_item2, root, attachToRoot, component);
  }

  @NonNull
  public static ProfileItem2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.profile_item2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ProfileItem2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ProfileItem2Binding>inflateInternal(inflater, R.layout.profile_item2, null, false, component);
  }

  public static ProfileItem2Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ProfileItem2Binding bind(@NonNull View view, @Nullable Object component) {
    return (ProfileItem2Binding)bind(component, view, R.layout.profile_item2);
  }
}
