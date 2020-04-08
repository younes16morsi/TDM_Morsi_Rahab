package com.example.activitymain
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val smartphone1 = Smartphone("MT 26 2.4",2700,10,"STARLIGHT",
             "Duel Sim","Rouge",0)
    private val smartphone2 = Smartphone("MT 18 2.4",3200,80,"STARLIGHT",
        "Duel Sim","Rouge",0)
    private val smartphone3 = Smartphone("Galaxy S20",2700,80,"SAMSUNG",
        "J7 ","Rouge",0)

    private val smartphone4 = Smartphone("Samsung",2700,80,"Galaxy S20",
        "J7 Prime","noir",0)

    private val smartphone5 = Smartphone("Samsung",2700,80,"Galaxy S20",
        "J7 Prime","Green",0)



    private val pack1:Pack=Pack(
        "PACK42",
        500000,
        30,
        "MORSI",
        5
    )
    private val pack2:Pack=Pack(
        "PACK50",
        20000,
        20,
        "RAHAB",
        5
    )

    fun loadData():List<Product> {
        val data = mutableListOf<Product>()
        pack1.addSmartphone(smartphone1,2)
        pack1.addSmartphone(smartphone2,3)
        pack2.addSmartphone(smartphone3,8)
        pack2.addSmartphone(smartphone5,3)
        data.add(smartphone1)
        data.add(smartphone2)
        data.add(smartphone3)
        data.add(smartphone4)
        data.add(smartphone5)
        data.add(pack1)
        data.add(pack2)

        return data
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductAdapter(this,loadData())
    }





}

























