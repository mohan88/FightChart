package com.example.fightchart.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fightchart.R
import com.example.fightchart.data.UfcApiService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {
            val request = UfcApiService.service.fighters()
            val response = request.await()
            if (response.isSuccessful) {
                val fighters = response.body()
                fighters?.let {
                    text.text = fighters.count().toString()
                }
            } else {
                text.text = "${response.message()}"
                toast("Failed. :'(")
            }
        }

        text.text = "Fetching data...."
    }
}
