package com.kulczycki.piotr.lifemanager.baseModels

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlin.time.Duration

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val reward: Pair<Currency,Int>,
    val currentStartDate: Instant, // to hold that moment in time so every other (next start/end/...) can be calculated
    val isDone: Boolean,

    // fields for Task to operate properly
    val repetition: TaskRepetition,
    val lifetime: Duration,
    val editableBy: List<Int> // list of user IDs
){
    val isActive: Boolean get() = !isDone && hasStarted && expired.not()

    val hasStarted: Boolean get() = currentStartDate <= Clock.System.now()

    val expired: Boolean get() = currentStartDate.plus(lifetime) < Clock.System.now()
}


/** TaskRepetition - contains list of Time periods.
 * its designed that way to represent any type of weird repetition:
 *
 *  every month-(4 weeks)? > cycle is 1 element that's: month-(4 weeks) - lifespan
 *  every Monday, every 2 weeks? > 1 element: 2-weeks - lifespan
 *  every Monday and Tuesday : 2 elements
 */
data class TaskRepetition(
    val cycles: List<Duration>
)