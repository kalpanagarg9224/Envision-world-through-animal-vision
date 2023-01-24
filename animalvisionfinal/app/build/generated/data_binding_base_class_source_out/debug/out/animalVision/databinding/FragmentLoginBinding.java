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

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView logProg;

  @NonNull
  public final TextView loginForgot;

  @NonNull
  public final Button loginLgnbtn;

  @NonNull
  public final EditText loginPass;

  @NonNull
  public final EditText loginPhno;

  @NonNull
  public final TextView loginTxt1;

  @NonNull
  public final TextView loginTxt2;

  private FragmentLoginBinding(@NonNull RelativeLayout rootView, @NonNull TextView logProg,
      @NonNull TextView loginForgot, @NonNull Button loginLgnbtn, @NonNull EditText loginPass,
      @NonNull EditText loginPhno, @NonNull TextView loginTxt1, @NonNull TextView loginTxt2) {
    this.rootView = rootView;
    this.logProg = logProg;
    this.loginForgot = loginForgot;
    this.loginLgnbtn = loginLgnbtn;
    this.loginPass = loginPass;
    this.loginPhno = loginPhno;
    this.loginTxt1 = loginTxt1;
    this.loginTxt2 = loginTxt2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.log_prog;
      TextView logProg = ViewBindings.findChildViewById(rootView, id);
      if (logProg == null) {
        break missingId;
      }

      id = R.id.login_forgot;
      TextView loginForgot = ViewBindings.findChildViewById(rootView, id);
      if (loginForgot == null) {
        break missingId;
      }

      id = R.id.login_lgnbtn;
      Button loginLgnbtn = ViewBindings.findChildViewById(rootView, id);
      if (loginLgnbtn == null) {
        break missingId;
      }

      id = R.id.login_pass;
      EditText loginPass = ViewBindings.findChildViewById(rootView, id);
      if (loginPass == null) {
        break missingId;
      }

      id = R.id.login_phno;
      EditText loginPhno = ViewBindings.findChildViewById(rootView, id);
      if (loginPhno == null) {
        break missingId;
      }

      id = R.id.login_txt1;
      TextView loginTxt1 = ViewBindings.findChildViewById(rootView, id);
      if (loginTxt1 == null) {
        break missingId;
      }

      id = R.id.login_txt2;
      TextView loginTxt2 = ViewBindings.findChildViewById(rootView, id);
      if (loginTxt2 == null) {
        break missingId;
      }

      return new FragmentLoginBinding((RelativeLayout) rootView, logProg, loginForgot, loginLgnbtn,
          loginPass, loginPhno, loginTxt1, loginTxt2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
