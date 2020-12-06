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

        openSimpleDialogButton1.setOnClickListener{
            dialog1()
        }

        openSimpleDialogButton2.setOnClickListener{
            dialog3()
        }

    }

    fun dialog1(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Nazwa okna")
        builder.setMessage("Opis okna")

        builder.setPositiveButton("Ok") {
                dialog,id->Toast.makeText(this,"Kliknięto klawisz OK",Toast.LENGTH_SHORT).show()
        }

        builder.setNegativeButton("Zamknij",{dialog,id->
            Toast.makeText(this,"Kliknięto klawisz zamknij",Toast.LENGTH_SHORT).show()
        })

        val dialog = builder.create()


        dialog.show()
    }

    fun dialog2(){
        //Do dokończenia
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Wybierz")

        //Jeżeli włączymy opis nie wyswietli się funkcja poniżej
        //builder.setMessage("Okno z wyborem listy")

        val itemArray = IntArray(5){it*it}.map{"Element $it"}.toTypedArray()
        val checkedArray = BooleanArray(itemArray.size){ it%2!=0}

        //itemArray[0] = arrayOf(1,2,3,4,5,6,7,8,9,10).toString()
        //itemArray[1] = arrayOf(1,2,3,4,5,6,7,8,9,10).asList().toString()


        builder.setMultiChoiceItems(itemArray,checkedArray, {
                dialog,id,clicked->
            })

        builder.setNegativeButton("Zamknij",{dialog,id->
            Toast.makeText(this,"Kliknięto klawisz zamknij",Toast.LENGTH_SHORT).show()
        })

        builder.create();
        builder.show();

        //Toast.makeText(this,"Funkcja dialog2",Toast.LENGTH_SHORT).show()
    }

    fun dialog3(){
        val customDialog = CustomDialog()

        customDialog.show(supportFragmentManager,"customDialog1")
    }


}