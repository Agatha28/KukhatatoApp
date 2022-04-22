package com.example.kukhatatoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

            buttonBackProfile.setOnClickListener {
                val intentToPageDetailedActivity = Intent(this, MainActivity::class.java)
                startActivity(intentToPageDetailedActivity)
            }
        }
    }
//}