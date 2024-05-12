package com.mekiassen.malibu.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MalibuRestApiApplication

fun main(args: Array<String>) {
	runApplication<MalibuRestApiApplication>(*args)
}
