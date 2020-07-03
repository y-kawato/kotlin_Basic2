package jp.co.stv_tech.test2115

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity(private val RESULT_SUBACTIVITY: Int = 1000) : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "com.example.kotlinactivitydatatrans.MESSAGE"
    }

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
}
