package br.com.learn.service

import br.com.learn.interfaces.CreateAnimal
import br.com.learn.model.Cat
import br.com.learn.repository.CatRepository
import br.com.learn.utils.AnimalsType

class AnimalService : CreateAnimal {

    override fun createAnimal(animalsType: AnimalsType) {

        when (animalsType) {

            AnimalsType.CAT -> {

                val catAnimalService = Cat("Miau! ", 4, "Olaff ", "Felino ", AnimalsType.CAT)
                val typeofAnimal = catAnimalService.getAnimalType()
                if (catAnimalService.isACat(typeofAnimal)) {
                    println(catAnimalService)
                    println()
                    println("The price of this animal is : " + catAnimalService.priceOfThisAnimal())

                    val catRepository = CatRepository()
                    catRepository.saveAnimal(catAnimalService)

                    catAnimalService.theAnimalBehavior()
                    catAnimalService.theAnimalLikeToo()
                    catAnimalService.thisAnimalWillFightYou()
                }

            }
            AnimalsType.DOG -> {

            }
            AnimalsType.DUCK -> {

            }
            AnimalsType.COW -> {

            }
            AnimalsType.WOLF -> {

            }
            else -> {
                throw RuntimeException("Animal is not recognized!!! ")
            }
        }
    }

    override fun createAnimals(vararg animalsType: AnimalsType) {

        if (animalsType.isNullOrEmpty()) {
            throw  RuntimeException("Fail to create animals, the types is null or empty !!")
        }

        for (animal in animalsType) {
            this.createAnimal(animal)
        }
    }
}