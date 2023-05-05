package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvnum1 : TextInputLayout
    lateinit var tvnum2 : TextInputLayout
    lateinit var etnum1 : TextInputEditText
    lateinit var etnum2 : TextInputEditText
    lateinit var bt1 : Button
    lateinit var bt2 : Button
    lateinit var bt3 : Button
    lateinit var bt4 : Button
    lateinit var tvanswer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()

    }

    override fun onResume() {
        super.onResume()
        bt1.setOnClickListener {
            addition()
        }
        bt2.setOnClickListener {
            subtraction()
        }
        bt3.setOnClickListener {
            division()
        }
        bt4.setOnClickListener {
            multiplication()
        }
    }
    fun castViews(){
        tvnum1 = findViewById(R.id.tvnum1)
        tvnum2 = findViewById(R.id.tvnum2)
        etnum1 = findViewById(R.id.etnum1)
        etnum2 = findViewById(R.id.etnum2)
        bt1 = findViewById(R.id.bt1)
        bt2 = findViewById(R.id.bt2)
        bt3 = findViewById(R.id.bt3)
        bt4 = findViewById(R.id.bt4)
        tvanswer = findViewById(R.id.tvanswer)
    }
    fun addition(){
        val num1 = etnum1.text.toString().toDouble()
        val num2 = etnum2.text.toString().toDouble()
        var answer = num1+num2
        tvanswer.text = answer.toString()

    }
    fun subtraction(){
        val num1 = etnum1.text.toString().toDouble()
        val num2 = etnum2.text.toString().toDouble()
        var answer = num1-num2
        tvanswer.text= answer.toString()

    }
    fun division(){
        val num1 = etnum1.text.toString().toDouble()
        val num2 = etnum2.text.toString().toDouble()
        var answer = num1/num2
        tvanswer.text = answer.toString()

    }
    fun multiplication(){
        val num1 = etnum1.text.toString().toDouble()
        val num2 = etnum2.text.toString().toDouble()
        var answer = num1*num2
        tvanswer.text=answer.toString()

    }
}
