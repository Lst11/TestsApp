package com.example.data.repositories

import android.content.Context
import com.example.domain.entity.Question
import com.example.domain.repositories.QuestionRepository
import io.reactivex.Observable
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class QuestionRepositoryImpl(val context: Context) : QuestionRepository {

    override fun generateData(): Observable<List<Question>> {

        val list: MutableList<Question> = mutableListOf()
        try {
            val obj = JSONObject(loadJSONFromAsset())
            val m_jArry = obj.getJSONArray("сhristmas_test")
            for (i in 0 until m_jArry.length()) {
                val jo_inside = m_jArry.getJSONObject(i)
                val question = jo_inside.getString("question")
                val answer1 = jo_inside.getString("answer1")
                val answer2 = jo_inside.getString("answer2")
                val answer3 = jo_inside.getString("answer3")
                val answer4 = jo_inside.getString("answer4")

                list.add(Question(question, answer1, answer2, answer3, answer4))
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return Observable.just(list)
    }

    private fun loadJSONFromAsset(): String {
        var json = ""
        try {
            val stream = context.assets.open("test_info.json")
            val size = stream.available()
            val buffer = size.let { ByteArray(it) }
            stream.read(buffer)
            stream.close()
            json = buffer.let { String(it) }.toString()
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        return json
    }
}