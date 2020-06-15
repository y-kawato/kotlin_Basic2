package jp.co.stv_tech.test2115

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.editText

class MainActivity(private val RESULT_SUBACTIVITY: Int = 1000) : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "com.example.kotlinactivitydatatrans.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editText.text != null) {
                //SubActivityからの返しを受け取る
                val intent = Intent(applicationContext, SubActivity::class.java)
                // エディットテキストのテキストを取得
                val str = editText.text.toString()
                Log.d("debug",str)

                intent.putExtra(EXTRA_MESSAGE, str)
                //帰ってくるリクエストコードを設定
                startActivityForResult(intent, RESULT_SUBACTIVITY)

                editText.setText("")
            }
        }
    }

}
