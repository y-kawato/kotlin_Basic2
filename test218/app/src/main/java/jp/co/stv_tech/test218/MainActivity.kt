package jp.co.stv_tech.test218

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvButton = findViewById<Button>(R.id.lvButton)
        val listener = HelloListener()
        lvButton.setOnClickListener(listener)
    }
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(v: View?) {
            val dialogFragment = testDialogFragment()

            dialogFragment.show(supportFragmentManager, "testDialogFragment")
        }
    }
}
