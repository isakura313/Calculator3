package com.example.calculator3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import com.example.calculator3.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNumber = findViewById<EditText>(R.id.firstNum)
        var secondNumber = findViewById<EditText>(R.id.secondNum)

        var plusBtn = findViewById<Button>(R.id.plusBtn)
        var minusBtn = findViewById<Button>(R.id.minusBtn)
        var divBtn = findViewById<Button>(R.id.divBtn)
        var multBtn = findViewById<Button>(R.id.multBtn)
        var resTV = findViewById<TextView>(R.id.resTV)

        plusBtn.setOnClickListener{
            var FN = firstNumber.text.toString().toInt()
            var SN = secondNumber.text.toString().toInt()

            var sum = FN+SN
            resTV.setText(sum.toString())
        }
        minusBtn.setOnClickListener{
            var FN = firstNumber.text.toString().toInt()
            var SN = secondNumber.text.toString().toInt()

            var sum = FN-SN
            resTV.setText(sum.toString())
        }
        divBtn.setOnClickListener{
            var FN = firstNumber.text.toString().toInt()
            var SN = secondNumber.text.toString().toInt()

            var sum = FN/SN
            resTV.setText(sum.toString())
        }
        multBtn.setOnClickListener{
            var FN = firstNumber.text.toString().toInt()
            var SN = secondNumber.text.toString().toInt()

            var sum = FN*SN
            resTV.setText(sum.toString())
        }


    }
}