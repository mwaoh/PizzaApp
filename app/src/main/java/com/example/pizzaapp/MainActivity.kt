package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var pizzaList: ArrayList<Pizza>
    private lateinit var pizzaAdapter: PizzaAdapter
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        pizzaList = ArrayList()
        pizzaAdapter = PizzaAdapter(pizzaList)
        pizzaListItems()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = pizzaAdapter
    }
    private fun pizzaListItems() {
        pizzaList.add(Pizza(R.drawable.pizza1, "chicken Pizza"))
        pizzaList.add(Pizza(R.drawable.pizza2, "Beef Chicken"))
        pizzaList.add(Pizza(R.drawable.noodles1, "normal Pizza"))
        pizzaList.add(Pizza(R.drawable.noodles2, "sweet Chicken"))
        pizzaList.add(Pizza(R.drawable.paneer, "Mini Pizza"))
        pizzaList.add(Pizza(R.drawable.pasta, "Extra Chicken"))
        pizzaList.add(Pizza(R.drawable.piza_spagethi, "meat Pizza"))
        pizzaList.add(Pizza(R.drawable.pizza12, "vegez Chicken"))
        pizzaList.add(Pizza(R.drawable.pizza1, "chicken Pizza"))
        pizzaList.add(Pizza(R.drawable.pizza2, "Beef Chicken"))
        pizzaList.add(Pizza(R.drawable.noodles1, "normal Pizza"))
        pizzaList.add(Pizza(R.drawable.noodles2, "sweet Chicken"))
        pizzaList.add(Pizza(R.drawable.paneer, "Mini Pizza"))
        pizzaList.add(Pizza(R.drawable.pasta, "Extra Chicken"))
        pizzaList.add(Pizza(R.drawable.piza_spagethi, "meat Pizza"))
        pizzaList.add(Pizza(R.drawable.pizza12, "vegez Chicken"))
    }
}

