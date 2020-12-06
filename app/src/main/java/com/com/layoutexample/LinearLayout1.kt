package com.com.layoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_linear_layout.*
import kotlinx.android.synthetic.main.activity_linear_layout1.*

class LinearLayout1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout1)

        button1.setOnClickListener{
            Toast.makeText(this,"Nacisnieto klawisz 2",Toast.LENGTH_SHORT).show()
            Snackbar.make(it,"Nacisnięto klawisz 2",Snackbar.LENGTH_SHORT).show()
        }


    }
}