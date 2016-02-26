package com.thracecodeinc.onebyoneandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;
import com.parse.ParseUser;
import com.thracecodeinc.onebyoneandroid.Logins.DispatchActivity;
import com.thracecodeinc.onebyoneandroid.Logins.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button signOut_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signOut_button = (Button)findViewById(R.id.signout_button);
        signOut_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });

    }

    public void signOut(){
        ParseUser.logOut();
        startActivity(new Intent(this, DispatchActivity.class));
    }


}
