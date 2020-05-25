package jp.co.stv_tech.test2117

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataStore: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)

        buttonWrite.setOnClickListener{

            val stringText = editText.text.toString()

            textWrite.text = stringText
            val editor = dataStore.edit()
            editor.putString("Input", stringText)
            editor.apply()



        }

        buttonRead.setOnClickListener{

            val str = dataStore.getString("Input", "NoData")

            textRead.text = str



        }
    }

}
