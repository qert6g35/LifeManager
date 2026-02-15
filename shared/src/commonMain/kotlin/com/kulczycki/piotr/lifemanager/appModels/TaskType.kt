package com.kulczycki.piotr.lifemanager.appModels

sealed class TaskType {
    data class OngoingTask(
        val taskId: Int,
    ) : TaskType()
}
