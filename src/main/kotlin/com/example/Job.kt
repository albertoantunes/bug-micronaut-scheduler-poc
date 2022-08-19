package com.example

import io.micronaut.scheduling.annotation.Scheduled
import jakarta.inject.Singleton

@Singleton
class Job {
    @Scheduled(fixedRate = "1s")
    internal fun doWork() {
        println("Hello World!")
    }
}