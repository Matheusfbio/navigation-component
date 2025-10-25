package com.br.navigation_component.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonModel(
    val name: String= "",
    val age: Int = 0,
    val street: String = "",
    val houseNumber: Int = 0
): Parcelable