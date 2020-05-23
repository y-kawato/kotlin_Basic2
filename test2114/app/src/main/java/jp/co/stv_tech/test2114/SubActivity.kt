package jp.co.stv_tech.test2114

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SubActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // to get message from MainActivity
        val intent = getIntent()



        button.setOnClickListener{
            val intentSub = Intent()


            setResult(Activity.RESULT_OK, intentSub)
            finish()
        }

    }
}