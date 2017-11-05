package com.atami.handrecommend

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*


fun Route.questions() {
    get<Questions> {

        // mock implement
        val respondText = "[\n" +
                "  {\n" +
                "    \"question_id\": 1,\n" +
                "    \"user_id\": 1,\n" +
                "    \"title\": \"近代・現代日本史の本を教えてください\",\n" +
                "    \"recommend_count\": 5,\n" +
                "    \"all_bet_cash\": 100,\n" +
                "    \"rest_bet_cash\": 100,\n" +
                "    \"cash_unit\": \"jpy\",\n" +
                "    \"is_close\": false,\n" +
                "    \"recommend_type\": \"BOOK\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"question_id\": 2,\n" +
                "    \"user_id\": 1,\n" +
                "    \"title\": \"中国の三国志の本を教えてください\",\n" +
                "    \"recommend_count\": 5,\n" +
                "    \"all_bet_cash\": 100,\n" +
                "    \"rest_bet_cash\": 100,\n" +
                "    \"cash_unit\": \"jpy\",\n" +
                "    \"is_close\": false,\n" +
                "    \"recommend_type\": \"BOOK\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"question_id\": 3,\n" +
                "    \"user_id\": 2,\n" +
                "    \"title\": \"おすすめの漫画を教えてください\",\n" +
                "    \"recommend_count\": 5,\n" +
                "    \"all_bet_cash\": 100,\n" +
                "    \"rest_bet_cash\": 100,\n" +
                "    \"cash_unit\": \"jpy\",\n" +
                "    \"is_close\": false,\n" +
                "    \"recommend_type\": \"BOOK\"\n" +
                "  }\n" +
                "]"
        call.respondText(respondText, ContentType.Application.Json)
    }
}