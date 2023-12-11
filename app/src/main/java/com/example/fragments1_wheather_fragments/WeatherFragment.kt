package com.example.fragments1_wheather_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.math.absoluteValue
import kotlin.random.Random

class WeatherFragment: Fragment() {
    private lateinit var txtTemperature : TextView
    private lateinit var btnRefresh : Button
    private lateinit var txtCity : TextView

    var city: String  = "Pune"
        set(value) {
            field = value
            txtCity.text = value
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.wheather_fragment, null)

        txtTemperature = view.findViewById(R.id.txtTemperature)
        btnRefresh = view.findViewById(R.id.btnRefresh)
        txtCity = view.findViewById(R.id.txtCity)

        btnRefresh.setOnClickListener{
            txtTemperature.text = "${Random.nextFloat().absoluteValue}"
        }
        return view
    }
}