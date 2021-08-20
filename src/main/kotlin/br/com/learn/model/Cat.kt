package br.com.learn.model

class Cat  : Animals(){

    override fun theAnimalBehavior() {
        println("This Animal Will do Miaaaal!!")
        println("So is a Cat =) ")
    }
    override fun theAnimalLikeToo() {
        println("This animal Like to Sleep and fun sometimes!")
    }

    override fun thisAnimalWillFightYou(): Boolean {
        if(this.javaClass.isInstance(Cat())){
            println("Well is a cat iuhsauhsa!!")
            return true
        }
        return false
    }

}