package com.ishow.noahark;

import android.app.Application;

import com.ishow.common.utils.http.rest.Http;
import com.ishow.common.utils.image.loader.ImageLoader;

/**
 * Application
 */
public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Http.init(this);
        ImageLoader.init(this);
    }
}
