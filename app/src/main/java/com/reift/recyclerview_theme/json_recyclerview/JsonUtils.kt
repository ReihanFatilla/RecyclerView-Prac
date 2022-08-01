package com.reift.recyclerview_theme.json_recyclerview

import org.json.JSONException
import org.json.JSONObject
import java.nio.charset.StandardCharsets

object JsonUtils {
//
    fun getJson(path: String): String {
        val inputStream = JsonUtils::class.java.classLoader.getResourceAsStream(path)
        val s = inputStream.bufferedReader().use { it.readText() }
        return s
    }
}