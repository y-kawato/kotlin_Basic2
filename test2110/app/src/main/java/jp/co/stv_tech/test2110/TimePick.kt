package jp.co.stv_tech.test2110

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.util.*

class TimePick : DialogFragment(), TimePickerDialog.OnTimeSetListener {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = Calendar.getInstance()

        // at the first, to get the system current hour and minute
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(
            activity,

            activity as MainActivity?,
            hour,
            minute,
            true)
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        //
    }
}