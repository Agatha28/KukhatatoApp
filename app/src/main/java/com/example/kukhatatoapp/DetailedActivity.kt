package com.example.kukhatatoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detailed.*
import kotlinx.android.synthetic.main.food_item.*

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val food = intent.getParcelableExtra<Food>("food")
        if (food != null){
           val textView : TextView = findViewById(R.id.detailedactivityTv)
            val textViewDua : TextView = findViewById(R.id.detailedactivityTvDua)
            val imageView: ImageView = findViewById(R.id.detailedactivityIv)

           textView.text = food.name
           textViewDua.text = food.desc
           imageView.setImageResource(food.image)

            buttonNext.setOnClickListener {
                val intentToPageProfile = Intent(this,Profile::class.java)
              startActivity(intentToPageProfile)
         }
            buttonBack.setOnClickListener {
                val intentToPageMainActivity = Intent(this,MainActivity::class.java)
                startActivity(intentToPageMainActivity)
            }
        }
    }
}
