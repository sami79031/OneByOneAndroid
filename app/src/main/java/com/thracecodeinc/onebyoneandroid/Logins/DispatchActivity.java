package com.thracecodeinc.onebyoneandroid.Logins;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseUser;
import com.thracecodeinc.onebyoneandroid.MainActivity;

/**
 * Activity which starts an intent for either the logged in (MainActivity) or logged out
 * (SignUpOrLoginActivity) activity.
 */
public class DispatchActivity extends Activity {

  public DispatchActivity() {
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Parse.enableLocalDatastore(this);

    Parse.initialize(this);

    // Check if there is current user info
    if (ParseUser.getCurrentUser() != null) {
      // Start an intent for the logged in activity
      startActivity(new Intent(this, MainActivity.class));
    } else {
      // Start and intent for the logged out activity
      //TO BE WORKED ON::
      startActivity(new Intent(this, LoginActivity.class));
    }
  }

}
