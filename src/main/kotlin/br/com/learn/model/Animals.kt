package br.com.learn.model

import br.com.learn.interfaces.AnimalServiceInterface

open  class Animals() : AnimalServiceInterface {

    private var behavior =""
    private var age = 0
    private var name = ""
    private var breed = ""

    constructor(behavior: String, age: Int, name: String, breed: String): this(){
        this.behavior = behavior
        this.age = age
        this.name=name
        this.breed = breed
    }

    open fun theAnimalBehavior() {}
    open fun theAnimalLikeToo() {}
    open fun thisAnimalWillFightYou(): Boolean {
        return false
    }

    override fun registerAnimal(any: Any?) {}
    override fun getImmutableAnimals(): ArrayList<Any> {
     return java.util.ArrayList()
    }

    override fun toString(): String {
        return "Behavior: " + this.behavior + " Age: " + this.age + " Name: " + this.name + " Breed: $breed"
    }
}