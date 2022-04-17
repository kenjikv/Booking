package com.kawaida.booking

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FlyAdapter(): BaseAdapter() {

    lateinit var context: Context
    var datos = mutableListOf<Fly>()

    constructor(context: Context, datos: MutableList<Fly>) : this() {
        this.context = context
        this.datos = datos
    }

    override fun getCount(): Int {
        return this.datos.size
    }

    override fun getItem(position: Int): Any {
        return this.datos[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_list_fly, parent, false)

        var image = view.findViewById<ImageView>(R.id.image)
        var airline = view.findViewById<TextView>(R.id.airline)
        var schedule = view.findViewById<TextView>(R.id.schedule)
        var typeAndSeats = view.findViewById<TextView>(R.id.typeAndSeats)
        var time = view.findViewById<TextView>(R.id.time)
        var destine = view.findViewById<TextView>(R.id.destine)
        var price = view.findViewById<TextView>(R.id.price)

        image.setImageResource(datos[position].image)
        airline.text = datos[position].airline
        schedule.text = datos[position].schedule
        typeAndSeats.text = datos[position].type + " | " + datos[position].seats + " seats"
        time.text = datos[position].time
        destine.text = datos[position].destine
        price.text = "$" + datos[position].price

        return view
    }
}