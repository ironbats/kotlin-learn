package br.com.learn.main

import br.com.learn.model.Cat
import br.com.learn.service.AnimalService

fun main() {
    val animalService = AnimalService()
    animalService.createAnimal()


    println("Next Animal !!")

    val catAnimalService = Cat()
    catAnimalService.setName("Olaff")
    catAnimalService.setAge(4)
    catAnimalService.setBreed("Felino")
    catAnimalService.setBehavior("Miau!!")
    println(catAnimalService)
    println()

    catAnimalService.theAnimalBehavior()
    catAnimalService.theAnimalLikeToo()
    catAnimalService.thisAnimalWillFightYou()
}