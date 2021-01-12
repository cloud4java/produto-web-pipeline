package com.silva

import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.silva")
		.start()
}



