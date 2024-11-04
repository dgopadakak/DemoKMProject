package com.dgopadakak.demokmproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform