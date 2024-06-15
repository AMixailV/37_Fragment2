package ru.mixail_akulov.a37_fragment2.contract

import androidx.annotation.StringRes

/**
 * Реализуйте этот интерфейс в своем фрагменте, если вы хотите
 * переопределить заголовок панели инструментов по умолчанию.
 */
interface HasCustomTitle {

    /**
     * @вернуть строковый ресурс, который должен отображаться вместо заголовка по умолчанию
     */
    @StringRes
    fun getTitleRes(): Int

}