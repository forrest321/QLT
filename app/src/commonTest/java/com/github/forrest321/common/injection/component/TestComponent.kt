package com.github.forrest321.common.injection.component

import dagger.Component
import com.github.forrest321.common.injection.module.ApplicationTestModule
import com.github.forrest321.injection.component.AppComponent
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationTestModule::class))
interface TestComponent : AppComponent