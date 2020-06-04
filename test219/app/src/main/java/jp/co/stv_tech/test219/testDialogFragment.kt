package jp.co.stv_tech.test219

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class testDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val strList = arrayOf("Facebook", "Twitter", "Line")
        val builder = AlertDialog.Builder(activity)


        builder.setItems(R.array.SNS) { dialog, which ->
            val sns = resources.getStringArray(R.array.SNS)
            println(sns[which])

            }

        builder.setPositiveButton(R.string.dialog_btn_ok, DialogButtonClickLIstener())





        val dialog = builder.create()
        return dialog
    }
    private inner class DialogButtonClickLIstener : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface, which: Int) {
            when(which) {
                DialogInterface.BUTTON_POSITIVE ->
                    Log.i("MainActivity", "ok")


            }
        }
    }

}