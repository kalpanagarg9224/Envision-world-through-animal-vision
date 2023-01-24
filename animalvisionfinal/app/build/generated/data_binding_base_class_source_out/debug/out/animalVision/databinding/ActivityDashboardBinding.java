// Generated by view binder compiler. Do not edit!
package animalVision.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import animalVision.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDashboardBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final DrawerLayout dashDrawerLayout;

  @NonNull
  public final FrameLayout dashFrame;

  @NonNull
  public final NavigationView dashNv;

  @NonNull
  public final Toolbar dashTb;

  private ActivityDashboardBinding(@NonNull DrawerLayout rootView,
      @NonNull CoordinatorLayout coordinatorLayout, @NonNull DrawerLayout dashDrawerLayout,
      @NonNull FrameLayout dashFrame, @NonNull NavigationView dashNv, @NonNull Toolbar dashTb) {
    this.rootView = rootView;
    this.coordinatorLayout = coordinatorLayout;
    this.dashDrawerLayout = dashDrawerLayout;
    this.dashFrame = dashFrame;
    this.dashNv = dashNv;
    this.dashTb = dashTb;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.coordinator_layout;
      CoordinatorLayout coordinatorLayout = ViewBindings.findChildViewById(rootView, id);
      if (coordinatorLayout == null) {
        break missingId;
      }

      DrawerLayout dashDrawerLayout = (DrawerLayout) rootView;

      id = R.id.dash_frame;
      FrameLayout dashFrame = ViewBindings.findChildViewById(rootView, id);
      if (dashFrame == null) {
        break missingId;
      }

      id = R.id.dash_nv;
      NavigationView dashNv = ViewBindings.findChildViewById(rootView, id);
      if (dashNv == null) {
        break missingId;
      }

      id = R.id.dash_tb;
      Toolbar dashTb = ViewBindings.findChildViewById(rootView, id);
      if (dashTb == null) {
        break missingId;
      }

      return new ActivityDashboardBinding((DrawerLayout) rootView, coordinatorLayout,
          dashDrawerLayout, dashFrame, dashNv, dashTb);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}