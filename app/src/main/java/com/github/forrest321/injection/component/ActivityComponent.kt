package com.github.forrest321.injection.component

import com.github.forrest321.injection.PerActivity
import com.github.forrest321.injection.module.ActivityModule
import com.github.forrest321.features.base.BaseActivity
import com.github.forrest321.features.detail.DetailActivity
import com.github.forrest321.features.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)
}
