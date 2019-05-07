package com.github.forrest321.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import com.github.forrest321.injection.ApplicationContext

@Module(includes = arrayOf(ApiModule::class))
class AppModule(private val mApplication: Application) {

    @Provides
    internal fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return mApplication
    }
}