package collalab.battery.charger.app;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by VietMac on 2017-05-23.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/UTM Neo Sans Intel.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

    }
}
