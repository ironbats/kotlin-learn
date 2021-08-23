package br.com.learn.repository

import br.com.learn.model.Cat
import br.com.learn.repository.interfaces.AnimalRepository

class CatRepository : AnimalRepository {

    override fun saveAnimal(anyAnimal: Any?) {

        anyAnimal as Cat
        //val catAnimalService = Cat("Miau! ", 4, "Olaff ", "Felino", AnimalsType.CAT)
        anyAnimal.registerAnimal(anyAnimal)
        anyAnimal.registerAnimal(anyAnimal)
        anyAnimal.registerAnimal(anyAnimal)
        anyAnimal.registerAnimal(anyAnimal)
        anyAnimal.registerAnimal(anyAnimal)

        println(anyAnimal.getImmutableAnimals().size)
        anyAnimal.getImmutableAnimals().add(anyAnimal) // immutable list
        println(anyAnimal.getImmutableAnimals().size)

        for (cat in anyAnimal.getImmutableAnimals() as ArrayList<Cat>) {
            println("Cat price : ${cat.priceOfThisAnimal()}")
        }
    }
}