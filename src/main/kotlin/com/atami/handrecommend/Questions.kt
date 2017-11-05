package com.atami.handrecommend

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*


fun Route.index() {
    get<Questions> {
        call.respondText("[\n" +
                "  {\n" +
                "    \"question_id\": 1,\n" +
                "    \"user_id\": 1,\n" +
                "    \"title\": \"近代・現代日本史の本を教えてください\",\n" +
                "    \"recommend_count\": 5,\n" +
                "    \"bet_cash\": 100,\n" +
                "    \"cash_unit\": \"jpy\",\n" +
                "    \"is_close\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"question_id\": 2,\n" +
                "    \"user_id\": 1,\n" +
                "    \"title\": \"中国の三国志の本を教えてください\",\n" +
                "    \"recommend_count\": 5,\n" +
                "    \"bet_cash\": 100,\n" +
                "    \"cash_unit\": \"jpy\",\n" +
                "    \"is_close\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"question_id\": 3,\n" +
                "    \"user_id\": 2,\n" +
                "    \"title\": \"おすすめの漫画を教えてください\",\n" +
                "    \"recommend_count\": 5,\n" +
                "    \"bet_cash\": 100,\n" +
                "    \"cash_unit\": \"jpy\",\n" +
                "    \"is_close\": false\n" +
                "  }\n" +
                "]", ContentType.Application.Json)
    }
}