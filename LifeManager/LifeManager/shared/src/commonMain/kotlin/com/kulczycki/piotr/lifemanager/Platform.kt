package com.kulczycki.piotr.lifemanager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform