package com.com.layoutexample

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_linear_layout.*

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        openSimpleDialogButton.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Nazwa okna")
            builder.setMessage("Opis okna")

            builder.setPositiveButton("Ok",{i,j-> })
            builder.setNegativeButton("Zamknij",{i,j->})

            val dialog = builder.create()

            dialog.show()
        }


    }
}