package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonint:Button
    lateinit var Buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.btn_calc)
        Buttonint=findViewById(R.id.btn_int)
        Buttonweb=findViewById(R.id.btn_web)
        Buttoncalc.setOnClickListener {
            val cal = Intent(this,calculator::class.java)
            startActivity(cal)
        }
        Buttonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
        Buttonint.setOnClickListener {
            val int=Intent(this,IntentActivity::class.java)
            startActivity(int)
        }
    }
}