// Generated by view binder compiler. Do not edit!
package animalVision.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import animalVision.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView startBg;

  @NonNull
  public final ImageView startBgShade;

  @NonNull
  public final FrameLayout startFrame;

  @NonNull
  public final RelativeLayout startLayout;

  @NonNull
  public final ImageView startLogo;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull ImageView startBg,
      @NonNull ImageView startBgShade, @NonNull FrameLayout startFrame,
      @NonNull RelativeLayout startLayout, @NonNull ImageView startLogo) {
    this.rootView = rootView;
    this.startBg = startBg;
    this.startBgShade = startBgShade;
    this.startFrame = startFrame;
    this.startLayout = startLayout;
    this.startLogo = startLogo;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.start_bg;
      ImageView startBg = ViewBindings.findChildViewById(rootView, id);
      if (startBg == null) {
        break missingId;
      }

      id = R.id.start_bg_shade;
      ImageView startBgShade = ViewBindings.findChildViewById(rootView, id);
      if (startBgShade == null) {
        break missingId;
      }

      id = R.id.start_frame;
      FrameLayout startFrame = ViewBindings.findChildViewById(rootView, id);
      if (startFrame == null) {
        break missingId;
      }

      id = R.id.start_layout;
      RelativeLayout startLayout = ViewBindings.findChildViewById(rootView, id);
      if (startLayout == null) {
        break missingId;
      }

      id = R.id.start_logo;
      ImageView startLogo = ViewBindings.findChildViewById(rootView, id);
      if (startLogo == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, startBg, startBgShade, startFrame,
          startLayout, startLogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
