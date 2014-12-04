package com.seyekuyinu.swatchat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Seye on 12/4/14.
 */
public class SwatChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "CIfQ3eGbwhmAMxLu6SaOHAtHq81BFj2r4ZppX13b", "qpuAOq2LYLtA4P1g5HNZaDAjzaDxWeyp4pb2xLoc");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
