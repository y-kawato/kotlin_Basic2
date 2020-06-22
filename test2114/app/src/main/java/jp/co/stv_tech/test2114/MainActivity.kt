package jp.co.stv_tech.test2114

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    companion object {

        private const val RESULT_SUBACTIVITY = 1000
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            val intent = Intent(applicationContext, SubActivity::class.java)

            startActivityForResult(intent, RESULT_SUBACTIVITY)
        }
    }
}
