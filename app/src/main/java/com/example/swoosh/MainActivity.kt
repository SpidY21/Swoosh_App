package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedBtn =findViewById<Button>(R.id.getStartedBtn)
        getStartedBtn.setOnClickListener{
            Toast.makeText(this@MainActivity,"2nd Page",Toast.LENGTH_LONG).show()
            val leagueIntent=Intent(this,League_Activity::class.java)
            startActivity(leagueIntent)
        }

    }
}