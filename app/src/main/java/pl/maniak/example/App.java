package pl.maniak.example;


import android.app.Application;

import pl.maniak.example.util.injection.AppComponent;
import pl.maniak.example.util.injection.AppModule;
import pl.maniak.example.util.injection.DaggerAppComponent;

public class App extends Application {
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