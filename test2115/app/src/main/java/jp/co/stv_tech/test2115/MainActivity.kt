package jp.co.stv_tech.test2115

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.editText
import kotlinx.android.synthetic.main.activity_sub.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "com.example.kotlinactivitydatatrans.MESSAGE"
    }

    private val RESULT_SUBACTIVITY = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editText.text != null) {
                val intent = Intent(applicationContext, SubActivity::class.java)
                val str = editText.text.toString()
                Log.d("debug",str)

                intent.putExtra(EXTRA_MESSAGE, str)
                startActivityForResult(intent, RESULT_SUBACTIVITY)

                editText.setText("")

            }
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)

        if (resultCode == Activity.RESULT_OK &&
            requestCode == RESULT_SUBACTIVITY && intent != null) {

            val res = intent.extras?.getString(EXTRA_MESSAGE)?: ""
            textView.text = res
        }
    }
}
