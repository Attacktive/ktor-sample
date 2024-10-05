package xyz.attacktive

import io.ktor.server.application.Application
import xyz.attacktive.plugins.configureHTTP
import xyz.attacktive.plugins.configureRouting
import xyz.attacktive.plugins.configureSerialization

fun main(args: Array<String>) {
	io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
	configureHTTP()
	configureSerialization()
	configureRouting()
}
