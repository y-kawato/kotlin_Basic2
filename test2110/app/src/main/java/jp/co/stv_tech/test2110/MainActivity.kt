package jp.co.stv_tech.test2110

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : FragmentActivity(), TimePickerDialog.OnTimeSetListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {

        val str = String.format(Locale.US, "%d:%d", hourOfDay, minute)

        // use the plug in of Kotlin Android Extensions
        textView.text = str

    }
    fun showTimePickerDialog(v: View) {
        val newFragment = TimePick()
        newFragment.show(supportFragmentManager, "timePicker")

    }
}
