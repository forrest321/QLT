package com.github.forrest321.injection.component

import android.app.Application
import android.content.Context
import dagger.Component
import com.github.forrest321.data.DataManager
import com.github.forrest321.data.remote.PokemonApi
import com.github.forrest321.injection.ApplicationContext
import com.github.forrest321.injection.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun pokemonApi(): PokemonApi
}
