package com.reift.recyclerview_theme.object_recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ObjectModel(
    var title: String,
    var image: String
): Parcelable

