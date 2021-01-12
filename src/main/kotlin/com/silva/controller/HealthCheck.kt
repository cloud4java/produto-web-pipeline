package com.silva.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HealthCheck {

    @Get
    fun health():String{
        return "I am health"
    }
}