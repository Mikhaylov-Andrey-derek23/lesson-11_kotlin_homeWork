package com.example.lesson11_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnChangeImage)
        val picture = findViewById<ImageView>(R.id.ivPicture)
        val etSearchPicture = findViewById<EditText>(R.id.etSearchPicture)
        val text = findViewById<TextView>(R.id.text)

        button?.setOnClickListener {
            when(etSearchPicture?.text.toString()){

                "Kotlin" -> {
                    picture.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.kotlin))
                    text.text = "Kotlin"
                }

                "C++" -> {
                    picture.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.cplus))
                    text.text = "C++"
                }

                else -> {
                    picture.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.start))
                    text.text = "empty"
                }

            }

        }

    }
}


