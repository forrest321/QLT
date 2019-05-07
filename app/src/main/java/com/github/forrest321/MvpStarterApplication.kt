package com.github.forrest321

import android.content.Context
import android.support.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.singhajit.sherlock.core.Sherlock
import com.squareup.leakcanary.LeakCanary
import com.tspoon.traceur.Traceur
import com.github.forrest321.injection.component.AppComponent
import com.github.forrest321.injection.component.DaggerAppComponent
import com.github.forrest321.injection.module.AppModule
import com.github.forrest321.injection.module.NetworkModule
import timber.log.Timber

class MvpStarterApplication : MultiDexApplication() {

    internal var mAppComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Stetho.initializeWithDefaults(this)
            LeakCanary.install(this)
            Sherlock.init(this)
            Traceur.enableLogging()
        }
    }

    // Needed to replace the component with a test specific one
    var component: AppComponent
        get() {
            if (mAppComponent == null) {
                mAppComponent = DaggerAppComponent.builder()
                        .appModule(AppModule(this))
                        .networkModule(NetworkModule(this))
                        .build()
            }
            return mAppComponent as AppComponent
        }
        set(appComponent) {
            mAppComponent = appComponent
        }

    companion object {

        operator fun get(context: Context): MvpStarterApplication {
            return context.applicationContext as MvpStarterApplication
        }
    }
}
