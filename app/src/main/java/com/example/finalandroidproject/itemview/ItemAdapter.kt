package com.example.finalandroidproject.itemview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.example.finalandroidproject.R

class ItemAdapter (var cantext: Context,
                   var myResource: Int,
                   var items: ArrayList<ItemModel>): ArrayAdapter<ItemModel>(cantext, myResource,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(cantext)
        val itemView = layoutInflater.inflate(myResource, null)

        val name = itemView.findViewById<TextView>(R.id.name_of_item)
        val image = itemView.findViewById<ImageView>(R.id.item_image)
        val price = itemView.findViewById<TextView>(R.id.price_of_item)
        val quantity = itemView.findViewById<TextView>(R.id.quantity_of_item)
        val checkBox = itemView.findViewById<CheckBox>(R.id.item_check)

        name.text = items[position].name
        image.setImageResource(items[position].image)
        price.text = "$" + items[position].price.toString()
        quantity.text = items[position].quantity.toString()
        checkBox.isChecked



        return itemView
    }
}