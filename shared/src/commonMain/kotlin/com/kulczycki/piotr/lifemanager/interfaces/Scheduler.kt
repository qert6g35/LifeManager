package com.kulczycki.piotr.lifemanager.interfaces

import com.kulczycki.piotr.lifemanager.baseModels.Task
import com.kulczycki.piotr.lifemanager.baseModels.User
import kotlinx.coroutines.flow.Flow

interface Scheduler {

    // User handling
    val users: Flow<User>
    fun addUser(user: User)
    fun removeUser(user: User)

    // TaskHandling
    fun tasks(user: User?): Flow<Task>
    fun addTask(task: Task)
    fun removeTask(task: Task)

}