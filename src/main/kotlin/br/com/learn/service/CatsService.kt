package br.com.learn.service

import br.com.learn.utils.AnimalsType

fun createCats(numberOfCats:Int) {
    for (i in numberOfCats downTo 0) {
        println()
        val animalService = AnimalService()
        animalService.createAnimal(AnimalsType.CAT)
    }
}