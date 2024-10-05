package xyz.attacktive.plugins

import io.ktor.http.ContentType
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import io.ktor.server.webjars.Webjars

fun Application.configureRouting() {
	install(Webjars) {
		path = "/webjars" // defaults to /webjars
	}

	routing {
		get("/") {
			call.respondText("Hello World!")
		}
		get("/webjars") {
			call.respondText("<script src='/webjars/jquery/jquery.js'></script>", ContentType.Text.Html)
		}
	}
}
