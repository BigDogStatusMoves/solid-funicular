package com.example.finalandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(){

lateinit var customerButton: Button


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    customerButton = findViewById(R.id.customer_button)

    customerButton.setOnClickListener {
        Intent(this, ShopMenu::class.java).also {
            startActivity(it)
        }
    }



}

}