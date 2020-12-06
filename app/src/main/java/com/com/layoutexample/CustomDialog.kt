package com.com.layoutexample

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CustomDialog : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Nazwa okna")

        builder.setPositiveButton("Ok") {
                dialog,id->
            Toast.makeText(activity!!,"Kliknięto klawisz OK", Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton("Zamknij",{dialog,id->
            Toast.makeText(activity!!,"Kliknięto klawisz zamknij", Toast.LENGTH_SHORT).show()
        })

        activity?.let {
            val view = it.layoutInflater.inflate(R.layout.custom_dialog,null)

            builder.setView(view)
        }

        val dialog = builder.create()

        return dialog
    }
}