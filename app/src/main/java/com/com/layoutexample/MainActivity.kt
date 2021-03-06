package com.com.layoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutButton.setOnClickListener{
            val intent = Intent(this,LinearLayout::class.java)
            startActivity(intent)
        }

        linearLayoutButton1.setOnClickListener{
            val intent = Intent(this,LinearLayout1::class.java)
            startActivity(intent)
        }

        linearLayoutButton2.setOnClickListener{
            val intent = Intent(this,LinearLayout2::class.java)
            startActivity(intent)
        }

        relativeLayout1.setOnClickListener{
            val intent = Intent(this,RelativeLayout::class.java)
            startActivity(intent)
        }

        relativeLayout2.setOnClickListener{
            val intent = Intent(this,RelativeLayout1::class.java)
            startActivity(intent)
        }

    }
}