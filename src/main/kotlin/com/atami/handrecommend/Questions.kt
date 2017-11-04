package com.atami.handrecommend

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*


fun Route.index() {
    get<Questions> {
        call.respondText("Hello, World!")
    }
}