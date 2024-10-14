package com.example.actividad3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogcat = findViewById<Button>(R.id.buttonLogcat)
        val buttonToast  = findViewById<Button>(R.id.buttonToast)

        buttonLogcat.setOnClickListener {
            Log.d("MainActivity","Boton apretado por Logcat")
        }

        buttonToast.setOnClickListener {
            Toast.makeText(this, "Boton apretado por Toast", Toast.LENGTH_SHORT).show()
        }
    }
}