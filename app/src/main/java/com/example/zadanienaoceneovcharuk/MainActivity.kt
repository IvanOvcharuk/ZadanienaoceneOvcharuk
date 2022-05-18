package com.example.zadanienaoceneovcharuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zlicz = 1
        var check = findViewById<CheckBox>(R.id.checkBox)
        var check2 = findViewById<CheckBox>(R.id.checkBox2)
        var przezroczystosc = findViewById<EditText>(R.id.editTextNumber)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = ""
            if(zlicz == 1)
                zlicz = 5
            else
                zlicz = zlicz - 1

            if(zlicz == 1) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car2)
                findViewById<TextView>(R.id.textView).text = "Bmw e92"
            }
            else if (zlicz == 2) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car3)
                findViewById<TextView>(R.id.textView).text = "Bmw e87"
            }
            else if (zlicz == 3) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car4)
                findViewById<TextView>(R.id.textView).text = "Bmw e38"
            }
            else if (zlicz == 4) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car5)
                findViewById<TextView>(R.id.textView).text = "Bmw e60"
            }
            else if (zlicz == 5) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car6)
                findViewById<TextView>(R.id.textView).text = "Bmw e28"
            }
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            if(zlicz == 5)
                zlicz = 1
            else
                zlicz = zlicz + 1

            if(zlicz == 1) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car2)
                findViewById<TextView>(R.id.textView).text = "Bmw e92"
            }
            else if (zlicz == 2) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car3)
                findViewById<TextView>(R.id.textView).text = "Bmw e87"
            }
            else if (zlicz == 3) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car4)
                findViewById<TextView>(R.id.textView).text = "Bmw e38"
            }
            else if (zlicz == 4) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car5)
                findViewById<TextView>(R.id.textView).text = "Bmw e60"
            }
            else if (zlicz == 5) {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.car6)
                findViewById<TextView>(R.id.textView).text = "Bmw e28"
            }
        }
        var obrazek = findViewById<ImageView>(R.id.obrazek)
        findViewById<CheckBox>(R.id.checkBox).setOnClickListener{
            if(check.isChecked == true)
                obrazek.isVisible = true
            else
                obrazek.isVisible = false
        }
        findViewById<CheckBox>(R.id.checkBox2).setOnClickListener {
            if(check2.isChecked == true) {
               var alpha = przezroczystosc.text
                obrazek.alpha = (alpha.toString().toFloat()/100);
            }
            else
                obrazek.alpha = 1F;
        }

    }
}
