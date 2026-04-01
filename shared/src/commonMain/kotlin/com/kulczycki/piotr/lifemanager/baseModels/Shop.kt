package com.kulczycki.piotr.lifemanager.baseModels

data class Shop(
    val id: Int,
    val usersIds: List<Int>,
    val offers: List<Offer>
)

data class Offer(
    val id: Int,
    val name: String,
    val description: String,
    val currency: Currency,
    val amount: Int,
)
