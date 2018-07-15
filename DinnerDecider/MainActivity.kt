package com.asunanto.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val FoodList = arrayListOf("Chinese","Japanese","Italian","White Food","Thai","Indonesian")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DecideButton.setOnClickListener{
            val Random = Random()
            val RandomFood = Random.nextInt(FoodList.count())
            SelectedFoodText.text = FoodList[RandomFood]
        }
        AddFoodButton.setOnClickListener {
            val NewFood = AddFoodText.text.toString()
            FoodList.add(NewFood)
            AddFoodText.text.clear()
            println(FoodList)
        }
    }
}
