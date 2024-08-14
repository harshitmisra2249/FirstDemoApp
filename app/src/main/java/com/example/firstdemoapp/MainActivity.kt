package com.example.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import com.example.firstdemoapp.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val buttonUpload=findViewById<Button>(R.id.btnUpload)
        val buttonDownload=findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading.. ",Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading..",Toast.LENGTH_SHORT).show()
        }
    }
}