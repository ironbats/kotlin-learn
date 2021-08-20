package br.com.learn.model

class Dog constructor() : Animals() {

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
}