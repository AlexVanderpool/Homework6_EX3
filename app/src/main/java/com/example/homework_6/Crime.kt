package com.example.homework_6

import java.util.*

data class Crime(
    val id: UUID,
    var title: String,
    val date: Date,
    var isSolved: Boolean,
    var requirePolice : Boolean = false

)