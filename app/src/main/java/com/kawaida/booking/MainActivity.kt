package com.kawaida.booking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayListOf<Fly>(
            Fly(
                R.drawable.ic_fly1,
                        "Indigo airlines",
                        "9:00 - 11:30 PM",
                        "Economy",
                        10,
                        "6h 33 min",
                        "BLR - DEL",
                        1800
            ),
            Fly(
                R.drawable.ic_fly2,
                "Air Asia",
                "9:00 - 11:30 PM",
                "Economy",
                10,
                "6h 33 min",
                "BLR - DEL",
                1800
            ),
            Fly(
                R.drawable.ic_fly3,
                "Air India",
                "9:00 - 11:30 PM",
                "Economy",
                10,
                "6h 33 min",
                "BLR - DEL",
                1800
            ),
            Fly(
                R.drawable.ic_fly4,
                "Go",
                "9:00 - 11:30 PM",
                "Economy",
                10,
                "6h 33 min",
                "BLR - DEL",
                1800
            ),

        )

        val list = findViewById<ListView>(R.id.list)
        var adapter = FlyAdapter(this, data.toMutableList())
        list.adapter = adapter
    }
}