package com.example.desingpatterns.builder

import android.content.Context
import android.util.Log

class FoodOrder private constructor(builder: FoodOrder.Builder) {

    private val bread: String?
    private val condiments: String?
    private val veg: Boolean?
    private val fish: String?

    init {
        this.bread = builder.bread
        this.condiments = builder.condiments
        this.veg = builder.veg
        this.fish = builder.fish
    }

    fun getMealType() {
        if (veg!!)
            Log.e("TAG", "getMealType: meal is veg" )
        else
            Log.e("TAG", "getMealType: meal is non veg" )
    }

    class Builder(context : Context) {
        var bread: String? = null
            private set
        var condiments: String? = null
            private set
        var veg: Boolean? = null
            private set
        var fish: String? = null
            private set

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun isVeg(veg: Boolean) = apply { this.veg = veg }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(this)
    }
}