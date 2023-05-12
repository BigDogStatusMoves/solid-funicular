package com.example.finalandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.indices
import com.example.finalandroidproject.itemview.ItemAdapter
import com.example.finalandroidproject.itemview.ItemModel

class ShopMenu : AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var itemList: ArrayList<ItemModel>
    lateinit var checkoutButton: Button
    lateinit var adapter: ItemAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_menu)

        listView = findViewById(R.id.items_listview)
        itemList = setUpData()
        checkoutButton = findViewById(R.id.checkout_button)

        adapter = ItemAdapter(this, R.layout.item_layout, itemList)
        listView.adapter = adapter

        listView.setOnItemClickListener{parent, view, position, id ->
            listView.isItemChecked(position)
            Toast.makeText(this, "You Clicked: " + listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show()
            adapter.notifyDataSetChanged()

        }

        checkoutButton.setOnClickListener {

        }
    }

    private fun setUpData(): ArrayList<ItemModel> {
        var tempList = ArrayList<ItemModel>()

        val itemNames = arrayOf(
            "PlayStation 5",
            "Xbox Series X",
            "Xbox Series S",
            "RTX 3060",
            "RTX 3070",
            "RTX 3080",
            "RTX 4090",
            "Ryzen 9 5900X",
            "Ryzen 7 3700X",
            "Core i5-11600K",
            "Core i7-10700K",
            "Core i9-10900K"
        )

        val itemPrices = doubleArrayOf(
            499.99,
            499.99,
            299.99,
            403.17,
            699.99,
            849.99,
            1999.99,
            349.99,
            229.99,
            249.99,
            349.99,
            369.99
        )
        val itemQty = intArrayOf(7, 1, 3, 5, 4, 10, 1, 7, 4, 0, 1, 3, 1)

        val itemImages = intArrayOf(
            R.drawable.ps5,
            R.drawable.xboxx,
            R.drawable.xboxs,
            R.drawable.rtx3060,
            R.drawable.rtx3070,
            R.drawable.rtx3080,
            R.drawable.rtx4090,
            R.drawable.ryzen9,
            R.drawable.ryzen7,
            R.drawable.i5,
            R.drawable.i7,
            R.drawable.i9
        )

        for (i in itemNames.indices)
            tempList.add(ItemModel(itemNames[i], itemImages[i], itemPrices[i], itemQty[i]))

        return tempList
    }



}