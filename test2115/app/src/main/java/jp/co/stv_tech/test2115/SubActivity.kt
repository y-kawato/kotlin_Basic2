package jp.co.stv_tech.test2115

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)


        val intent = getIntent()
        val message = intent.extras?.getString(MainActivity.EXTRA_MESSAGE) ?: ""

        textView.text = message

    }
}