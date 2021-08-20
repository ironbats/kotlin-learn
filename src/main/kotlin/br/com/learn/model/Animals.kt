package br.com.learn.model

open class Animals() {

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
    override fun toString(): String {
        return "Behavior: " + this.behavior + " Age: " + this.age + " Name: " + this.name + " Breed: $breed"
    }
}