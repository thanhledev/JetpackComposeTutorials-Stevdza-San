package com.example.navigationparcelableobjectpassingexample.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// read more: https://developer.android.com/kotlin/parcelize
@Parcelize
class Person(
    val firstName: String,
    val lastName: String
): Parcelable