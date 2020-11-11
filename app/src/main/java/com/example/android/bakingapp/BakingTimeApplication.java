package com.example.android.bakingapp;

import android.app.Application;


import timber.log.Timber;

public class BakingTimeApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    if (com.example.android.bakingapp.BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }
  }
}
