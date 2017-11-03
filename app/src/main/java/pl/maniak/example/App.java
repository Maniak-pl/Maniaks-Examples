package pl.maniak.example;


import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import pl.maniak.example.util.injection.AppComponent;
import pl.maniak.example.util.injection.AppModule;
import pl.maniak.example.util.injection.DaggerAppComponent;

public class App extends Application {

    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }

    private static App instance = new App();
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(getInstance()))
                .build();
    }

    public static App getInstance() {
        return instance;
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}