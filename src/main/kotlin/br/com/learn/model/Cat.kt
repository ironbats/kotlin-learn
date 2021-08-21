package br.com.learn.model

import kotlin.collections.ArrayList

open class Cat constructor() : Animals() {

    private val priceOfThisAnimal: Double = 200.0
    private var icmsAnimal: Double = 0.12
    private var listCat : ArrayList<Any?> = ArrayList()

    constructor(behavior: String, age: Int, name: String, breed: String) : this() {
        Animals(behavior, age, name, breed)
    }

    fun priceOfThisAnimal(): Double {
        return this.priceOfThisAnimal * this.icmsAnimal
    }

    override fun theAnimalBehavior() {
        println("This Animal Will do Miaaaal!!")
        println("So is a Cat =) ")
    }

    override fun theAnimalLikeToo() {
        println("This animal Like to Sleep and fun sometimes!")
    }

    override fun thisAnimalWillFightYou(): Boolean {
        if (this.javaClass.isInstance(Cat())) {
            println("Well is a cat iuhsauhsa!!")
            return true
        }
        return false
    }

    override fun registerAnimal(cat: Any?) {
        println("Saving Cat.....")
        var listCat : ArrayList<Any?> = ArrayList()
        listCat.add(cat as Cat)
        this.listCat.addAll(listCat)
    }

     override fun getImmutableAnimals() : ArrayList<Any> {
        if(this.listCat.isEmpty()){
            throw RuntimeException("Nao existe nenhum gato salvo !!")
        }
        return this.listCat.toMutableList() as ArrayList<Any>
    }

}