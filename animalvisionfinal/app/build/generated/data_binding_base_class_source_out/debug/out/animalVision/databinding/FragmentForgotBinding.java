// Generated by view binder compiler. Do not edit!
package animalVision.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import animalVision.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForgotBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView forProg;

  @NonNull
  public final EditText forgEmail;

  @NonNull
  public final Button forgNexbtn;

  @NonNull
  public final EditText forgPhno;

  @NonNull
  public final TextView forgTxt1;

  @NonNull
  public final TextView forgTxt2;

  private FragmentForgotBinding(@NonNull RelativeLayout rootView, @NonNull TextView forProg,
      @NonNull EditText forgEmail, @NonNull Button forgNexbtn, @NonNull EditText forgPhno,
      @NonNull TextView forgTxt1, @NonNull TextView forgTxt2) {
    this.rootView = rootView;
    this.forProg = forProg;
    this.forgEmail = forgEmail;
    this.forgNexbtn = forgNexbtn;
    this.forgPhno = forgPhno;
    this.forgTxt1 = forgTxt1;
    this.forgTxt2 = forgTxt2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forgot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.for_prog;
      TextView forProg = ViewBindings.findChildViewById(rootView, id);
      if (forProg == null) {
        break missingId;
      }

      id = R.id.forg_email;
      EditText forgEmail = ViewBindings.findChildViewById(rootView, id);
      if (forgEmail == null) {
        break missingId;
      }

      id = R.id.forg_nexbtn;
      Button forgNexbtn = ViewBindings.findChildViewById(rootView, id);
      if (forgNexbtn == null) {
        break missingId;
      }

      id = R.id.forg_phno;
      EditText forgPhno = ViewBindings.findChildViewById(rootView, id);
      if (forgPhno == null) {
        break missingId;
      }

      id = R.id.forg_txt1;
      TextView forgTxt1 = ViewBindings.findChildViewById(rootView, id);
      if (forgTxt1 == null) {
        break missingId;
      }

      id = R.id.forg_txt2;
      TextView forgTxt2 = ViewBindings.findChildViewById(rootView, id);
      if (forgTxt2 == null) {
        break missingId;
      }

      return new FragmentForgotBinding((RelativeLayout) rootView, forProg, forgEmail, forgNexbtn,
          forgPhno, forgTxt1, forgTxt2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}