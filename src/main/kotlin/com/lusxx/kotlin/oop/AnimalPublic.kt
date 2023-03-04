package com.lusxx.kotlin.oop

class AnimalPublic  (private var name: String,
                     private val weight: Double,
                     private val age: Int,
                     private val isMammal: Boolean) {
    fun getName(): String {
        return name
    }

    fun setName(newName: String){
        name = newName
    }
}

fun main() {
    val kucing = AnimalPublic("kucing",3.4, 4, true)

    println(kucing.getName())
    println(kucing.setName("cat"))
    println(kucing.getName())
}


