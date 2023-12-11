package com.example.fragments1_wheather_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edtCity : EditText
    private lateinit var btnSetCity : Button
    private lateinit var weatherFragment: WeatherFragment



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initListeners()
    }
    private fun initListeners(){
        btnSetCity.setOnClickListener {
            weatherFragment.city = edtCity.text.toString()
        }
    }
    private fun initViews(){
        edtCity = findViewById(R.id.edtCity)
        btnSetCity = findViewById(R.id.btnSetCity)

        weatherFragment = supportFragmentManager.findFragmentById(R.id.weatherFragment) as WeatherFragment

    }
}