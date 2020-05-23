package jp.co.stv_tech.test2114

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "com.example.kotlinactivitydatatrans.MESSAGE"
    }

    private val RESULT_SUBACTIVITY = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

                val intent = Intent(applicationContext, SubActivity::class.java)



                startActivityForResult(intent, RESULT_SUBACTIVITY)



            }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)

        if (resultCode == Activity.RESULT_OK &&
                requestCode == RESULT_SUBACTIVITY && intent != null) {

            val res = intent.extras?.getString(EXTRA_MESSAGE)?: ""

        }
    }
}
