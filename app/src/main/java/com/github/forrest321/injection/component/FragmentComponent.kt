package com.github.forrest321.injection.component

import com.github.forrest321.injection.PerFragment
import com.github.forrest321.injection.module.FragmentModule
import dagger.Subcomponent

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = arrayOf(FragmentModule::class))
interface FragmentComponent