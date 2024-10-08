package xyz.attacktive

import kotlin.test.Test
import kotlin.test.assertEquals
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import xyz.attacktive.plugins.configureRouting

class ApplicationTest {
	@Test
	fun testRoot() = testApplication {
		application {
			configureRouting()
		}

		client.get("/").apply {
			assertEquals(HttpStatusCode.OK, status)
			assertEquals("Hello World!", bodyAsText())
		}
	}
}
