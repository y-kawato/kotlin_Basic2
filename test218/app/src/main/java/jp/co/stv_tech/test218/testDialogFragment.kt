package jp.co.stv_tech.test218

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class testDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)



        builder.setPositiveButton(R.string.dialog_btn_ok, DialogButtonClickLIstener())

        builder.setNegativeButton(R.string.dialog_btn_ng, DialogButtonClickLIstener())



        val dialog = builder.create()
        return dialog
    }
    private inner class DialogButtonClickLIstener : DialogInterface.OnClickListener {
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