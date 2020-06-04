package jp.co.stv_tech.test219

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class TestDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        builder.setItems(R.array.SNS) { _, which ->
            val sns = resources.getStringArray(R.array.SNS)
            println(sns[which])

            }
        return builder.create()
    }
}