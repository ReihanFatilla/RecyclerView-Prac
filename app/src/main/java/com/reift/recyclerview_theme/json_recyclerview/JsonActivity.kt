package com.reift.recyclerview_theme.json_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.reift.recyclerview_theme.R
import com.reift.recyclerview_theme.databinding.ActivityJsonBinding
import com.reift.recyclerview_theme.object_recyclerview.ObjectModel
import org.json.JSONException
import org.json.JSONObject
import java.nio.charset.StandardCharsets

class JsonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJsonBinding

    private var listPahlawan = mutableListOf<JsonModel>()
    private lateinit var mAdapter: JsonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJsonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getListPahlawan()
        setUpRecycler()
    }

    private fun setUpRecycler() {
        binding.rvPahlawan.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = mAdapter
        }
    }

    private fun getListPahlawan(){
        try {
            val inputStream = assets.open("pahlawan_nasional.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)

            inputStream.close()

            val strContent = String(buffer, StandardCharsets.UTF_8)
            try {
                val jsonObject: JSONObject = JSONObject(strContent)
                val jsonArray = jsonObject.getJSONArray("daftar_pahlawan")
                for(i in 0 until jsonArray.length()){
                    val jsonObjectData = jsonArray.getJSONObject(i)
                    val dataApi = JsonModel()
                    dataApi.nama = jsonObjectData.getString("nama")
                    dataApi.namaLengkap = jsonObjectData.getString("nama2")
                    dataApi.image = jsonObjectData.getString("img")
                    listPahlawan.add(dataApi)
                }
                mAdapter = JsonAdapter(listPahlawan)

            } catch (e: JSONException) {
                Toast.makeText(applicationContext, e.toString(), Toast.LENGTH_SHORT).show()
            }

        }catch (e: JSONException){
            Toast.makeText(applicationContext, e.toString(), Toast.LENGTH_SHORT).show()

        }
    }
}