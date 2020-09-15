package com.halftracker.charcuterietracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton

class MainActivity : AppCompatActivity() {

    private val hamCal = 55
    private val salamiCal = 90
    private val roastBeefCal = 70
    private val cornedBeefCal = 70
    private val mozzarellaCal = 35
    private val whiteCheddarCal = 55

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<AppCompatImageButton>(R.id.hamPlus).setOnClickListener {
            addHam()
        }
        findViewById<AppCompatImageButton>(R.id.hamMinus).setOnClickListener {
            minusHam()
        }

        findViewById<AppCompatImageButton>(R.id.salamiPlus).setOnClickListener {
            addSalami()
        }
        findViewById<AppCompatImageButton>(R.id.salamiMinus).setOnClickListener {
            minusSalami()
        }

        findViewById<AppCompatImageButton>(R.id.roastBeefPlus).setOnClickListener {
            addRoastBeef()
        }
        findViewById<AppCompatImageButton>(R.id.roastBeefMinus).setOnClickListener {
            minusRoastBeef()
        }

        findViewById<AppCompatImageButton>(R.id.cornedBeefPlus).setOnClickListener {
            addCornedBeef()
        }
        findViewById<AppCompatImageButton>(R.id.cornedBeefMinus).setOnClickListener {
            minusCornedBeef()
        }

        findViewById<AppCompatImageButton>(R.id.mozzarellaPlus).setOnClickListener {
            addMozzarella()
        }
        findViewById<AppCompatImageButton>(R.id.mozzarellaMinus).setOnClickListener {
            minusMozzarella()
        }

        findViewById<AppCompatImageButton>(R.id.whiteCheddarPlus).setOnClickListener {
            addWhiteCheddar()
        }
        findViewById<AppCompatImageButton>(R.id.whiteCheddarMinus).setOnClickListener {
            minusWhiteCheddar()
        }

    }

    fun addHam() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() + hamCal).toString()

        var count = findViewById<TextView>(R.id.hamCount).text.toString()
        findViewById<TextView>(R.id.hamCount).text = (count.toInt() + 1).toString()
    }

    fun minusHam() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() - hamCal).toString()

        var count = findViewById<TextView>(R.id.hamCount).text.toString()
        findViewById<TextView>(R.id.hamCount).text = (count.toInt() - 1).toString()
    }

    fun addSalami() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() + salamiCal).toString()

        var count = findViewById<TextView>(R.id.salamiCount).text.toString()
        findViewById<TextView>(R.id.salamiCount).text = (count.toInt() + 1).toString()
    }

    fun minusSalami() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() - salamiCal).toString()

        var count = findViewById<TextView>(R.id.salamiCount).text.toString()
        findViewById<TextView>(R.id.salamiCount).text = (count.toInt() - 1).toString()
    }

    fun addRoastBeef() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() + roastBeefCal).toString()

        var count = findViewById<TextView>(R.id.roastBeefCount).text.toString()
        findViewById<TextView>(R.id.roastBeefCount).text = (count.toInt() + 1).toString()
    }

    fun minusRoastBeef() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() - roastBeefCal).toString()

        var count = findViewById<TextView>(R.id.roastBeefCount).text.toString()
        findViewById<TextView>(R.id.roastBeefCount).text = (count.toInt() - 1).toString()
    }

    fun addCornedBeef() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() + cornedBeefCal).toString()

        var count = findViewById<TextView>(R.id.cornedBeefCount).text.toString()
        findViewById<TextView>(R.id.cornedBeefCount).text = (count.toInt() + 1).toString()
    }

    fun minusCornedBeef() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() - cornedBeefCal).toString()

        var count = findViewById<TextView>(R.id.cornedBeefCount).text.toString()
        findViewById<TextView>(R.id.cornedBeefCount).text = (count.toInt() - 1).toString()
    }

    fun addMozzarella() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() + mozzarellaCal).toString()

        var count = findViewById<TextView>(R.id.MozzarellaCount).text.toString()
        findViewById<TextView>(R.id.MozzarellaCount).text = (count.toInt() + 1).toString()
    }

    fun minusMozzarella() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() - mozzarellaCal).toString()

        var count = findViewById<TextView>(R.id.MozzarellaCount).text.toString()
        findViewById<TextView>(R.id.MozzarellaCount).text = (count.toInt() - 1).toString()
    }

    fun addWhiteCheddar() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() + whiteCheddarCal).toString()

        var count = findViewById<TextView>(R.id.whiteCheddarCount).text.toString()
        findViewById<TextView>(R.id.whiteCheddarCount).text = (count.toInt() + 1).toString()
    }

    fun minusWhiteCheddar() {
        var cal = findViewById<TextView>(R.id.textViewCalorieCount).text.toString()
        findViewById<TextView>(R.id.textViewCalorieCount).text = (cal.toInt() - whiteCheddarCal).toString()

        var count = findViewById<TextView>(R.id.whiteCheddarCount).text.toString()
        findViewById<TextView>(R.id.whiteCheddarCount).text = (count.toInt() - 1).toString()
    }

}