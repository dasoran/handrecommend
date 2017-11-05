package com.atami.handrecommend

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*


fun Route.question() {
    get<Question> {
        val questionId = it.questionId

        // mock implement
        val rawRespondText = "{\n" +
                "\t\"question\": {\n" +
                "\t\t\"question_id\": %d,\n" +
                "\t\t\"user_id\": 2,\n" +
                "\t\t\"title\": \"おすすめの漫画を教えてください\",\n" +
                "\t\t\"description\": \"オススメの麻雀漫画を教えてください\",\n" +
                "\t\t\"recommend_count\": 5,\n" +
                "\t\t\"all_bet_cash\": 100,\n" +
                "\t\t\"rest_bet_cash\": 100,\n" +
                "\t\t\"cash_unit\": \"jpy\",\n" +
                "\t\t\"is_close\": false,\n" +
                "\t\t\"recommend_type\": \"BOOK\"\n" +
                "\t},\n" +
                "\t\"recommends\": [{\n" +
                "\t\t\t\"recommend_id\": 1,\n" +
                "\t\t\t\"user_id\": 1,\n" +
                "\t\t\t\"recommend_url\": \"http://example.com/\",\n" +
                "\t\t\t\"recommend_comment\": \"これおすすめですよ。\",\n" +
                "\t\t\t\"got_cash\": 0\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"recommend_id\": 2,\n" +
                "\t\t\t\"user_id\": 3,\n" +
                "\t\t\t\"recommend_url\": \"http://example.com/\",\n" +
                "\t\t\t\"recommend_comment\": \"これもおすすめですよ。\",\n" +
                "\t\t\t\"got_cash\": 0\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"recommend_id\": 3,\n" +
                "\t\t\t\"user_id\": 4,\n" +
                "\t\t\t\"recommend_url\": \"http://example.com/\",\n" +
                "\t\t\t\"recommend_comment\": \"これこそぜひ読んでほしいです\",\n" +
                "\t\t\t\"got_cash\": 0\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"recommend_id\": 4,\n" +
                "\t\t\t\"user_id\": 5,\n" +
                "\t\t\t\"recommend_url\": \"http://example.com/\",\n" +
                "\t\t\t\"recommend_comment\": \"嶺上開花が素敵です。\",\n" +
                "\t\t\t\"got_cash\": 0\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"recommend_id\": 5,\n" +
                "\t\t\t\"user_id\": 1,\n" +
                "\t\t\t\"recommend_url\": \"http://example.com/\",\n" +
                "\t\t\t\"recommend_comment\": \"これおすすめですよ。\",\n" +
                "\t\t\t\"got_cash\": 0\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}"
        call.respondText(rawRespondText.format(questionId), ContentType.Application.Json)
    }
}