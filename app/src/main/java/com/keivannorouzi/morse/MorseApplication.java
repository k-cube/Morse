package com.keivannorouzi.morse;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by keivannorouzi on 2015-11-19.
 */
public class MorseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "344DmVd4827S6PGFhZ5lvVUP4aH3cyD5t9MQ4UfO", "ulP5d7I3g4LGCdyefMp3pKsobq1huNXZ91KqCJjU");



    }

}
