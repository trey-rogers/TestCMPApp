package com.trey.testcmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform