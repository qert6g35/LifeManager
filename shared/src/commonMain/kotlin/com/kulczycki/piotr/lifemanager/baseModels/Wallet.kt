package com.kulczycki.piotr.lifemanager.baseModels

data class Wallet (
    val id: Int,
    val balances: Map<Currency, Long>,
    )