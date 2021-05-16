package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// activities define layout which has layout container and views ///

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zipCodeEditText: EditText = findViewById(R.id.zipcodeEditText)
        val enterButton: Button = findViewById(R.id.enterButton)
        enterButton.setOnClickListener{
            val zipCode : String = zipCodeEditText.text.toString()
            if (zipCode.length != 5){
                Toast.makeText(this,"error", Toast.LENGTH_SHORT).show()

            }else {
                Toast.makeText(this,zipCode, Toast.LENGTH_SHORT).show()

            }
        }
    }
}
