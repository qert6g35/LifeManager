package com.kulczycki.piotr.lifemanager.appModels

data class Task(
    val id: String,
    val tite: String,
    val description: String,
    val reward: List<Int>,
    val type: TaskType,
)
