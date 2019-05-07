package com.github.forrest321.features.detail

import com.github.forrest321.data.model.Pokemon
import com.github.forrest321.data.model.Statistic
import com.github.forrest321.features.base.MvpView

interface DetailMvpView : MvpView {

    fun showPokemon(pokemon: Pokemon)

    fun showStat(statistic: Statistic)

    fun showProgress(show: Boolean)

    fun showError(error: Throwable)

}