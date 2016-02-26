package com.thracecodeinc.onebyoneandroid;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Dima on 2/24/16.
 */
public class ParseIntegration extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // enable the Local Datastore
        Parse.enableLocalDatastore(getApplicationContext());
        Parse.initialize(this, "LYVjRSIROYTKQXgJGU5qgDAaGRoNNqxZBkqDl5EM", "hcozHjlqxxTPeJx6elzlpzsUY2duaXwsOiHsv9R6");

    }

}
