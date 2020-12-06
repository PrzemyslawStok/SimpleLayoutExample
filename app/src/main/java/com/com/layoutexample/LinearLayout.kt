package com.com.layoutexample

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
            builder.setTitle("Przykładowe okno")

            val dialog = builder.create()

            Toast.makeText(this,"Tutaj powinno się otworzyć okno",Toast.LENGTH_SHORT).show()
        }


    }
}