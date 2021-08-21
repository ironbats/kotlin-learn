package br.com.learn.model

class Dog constructor() : Animals() {

    private val priceOfThisAnimal : Double = 700.0
    private var icmsAnimal : Double = 0.14
    private var listDog : ArrayList<Any?> = ArrayList()

    constructor(behavior:String,age:Int,name:String,breed:String): this(){
        Animals(behavior,age,name,breed)
    }

    override fun theAnimalLikeToo() {
        println("Like of Humans to run and etc..")
    }
    override fun theAnimalBehavior() {
        println("Au au au au au au !!")
        println("Well is a DOG !!")
    }
    override fun thisAnimalWillFightYou(): Boolean {
        if(this.javaClass.isInstance(Dog())){
            println("A dog ever will love you !!")
            return false
        }
        return true
    }

    fun priceOfThisAnimal(): Double {
        return this.priceOfThisAnimal * this.icmsAnimal
    }

    override fun registerAnimal(dog: Any?) {
        println("Saving Dog.....")
        var listDog : ArrayList<Any?> = ArrayList()
        listDog.add(dog as Dog)
        this.listDog.addAll(listDog)
    }

    override fun getImmutableAnimals() : ArrayList<Any> {
        if(this.listDog.isEmpty()){
            throw RuntimeException("Nao existe nenhum cachorro salvo !!")
        }
        return this.listDog.toMutableList() as ArrayList<Any>
    }
}