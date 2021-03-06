package com.atami.handrecommend

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

@location("/questions")
class Questions()

@location("/questions/{questionId}")
data class Question(val questionId: Int)

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Locations)
    install(Routing) {
        questions()
        question()
    }
}