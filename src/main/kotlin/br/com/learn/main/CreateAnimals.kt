package br.com.learn.main

import br.com.learn.model.Cat
import br.com.learn.model.Dog
import br.com.learn.service.AnimalService

fun main() {


    val animalService = AnimalService()
    animalService.createAnimal()
    println("Next Animal !!")

    val catAnimalService = Cat("Miau!",4,"Olaff","Felino")
    println(catAnimalService)
    println()

    catAnimalService.theAnimalBehavior()
    catAnimalService.theAnimalLikeToo()
    catAnimalService.thisAnimalWillFightYou()

    println()

    val dogAnimalService = Dog("Au au au !!",
        1,"Charlie","Late!!")

    dogAnimalService.theAnimalBehavior()
    dogAnimalService.theAnimalLikeToo()
    dogAnimalService.thisAnimalWillFightYou()
}