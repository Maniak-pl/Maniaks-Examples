package pl.maniak.example.util.injection;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lombok.RequiredArgsConstructor;
import pl.maniak.example.App;

@Module
@RequiredArgsConstructor
public class AppModule {

    private final App application;

    @Provides
    @Singleton
    Context provideAppContext() {
        return application;
    }
}
