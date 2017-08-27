package com.tritritri.triston.tribbble;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class TribbbleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
