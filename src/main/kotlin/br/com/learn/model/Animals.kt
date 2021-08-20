package br.com.learn.model

open class Animals {

    private var behavior = ""
    private var age = 0
    private var name = ""
    private var breed = ""


    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return this.name
    }

    fun setBreed(breed: String) {
        this.breed = breed
    }

    fun getBreed(): String {
        return this.breed
    }

    fun setBehavior(behavior: String) {
        this.behavior = behavior
    }

    fun getBehavior(): String {
        return this.behavior
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge(): Int {
        return this.age
    }

    open fun theAnimalBehavior() {}
    open fun theAnimalLikeToo(){}
    open fun thisAnimalWillFightYou():Boolean{
        return false
    }

    override fun toString(): String {
        return "Behavior: " + this.behavior + " Age: " + this.age + " Name: " + this.name + " Breed: $breed"
    }
}