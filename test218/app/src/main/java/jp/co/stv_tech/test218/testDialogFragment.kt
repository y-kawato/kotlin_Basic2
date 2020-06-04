package jp.co.stv_tech.test218

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class TestDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        builder.setTitle(R.string.dialog_title)
        builder.setMessage(R.string.dialog_msg)
        builder.setPositiveButton(R.string.dialog_btn_ok, DialogButtonClickListener())
        builder.setNegativeButton(R.string.dialog_btn_ng, DialogButtonClickListener())

        return builder.create()
    }
    private inner class DialogButtonClickListener : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface, which: Int) {
            when(which) {
                DialogInterface.BUTTON_POSITIVE ->
                    Log.i("MainActivity", "ok")

                DialogInterface.BUTTON_NEGATIVE ->
                    Log.i("MainActivity", "cancel")
            }
        }
    }
}