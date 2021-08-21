package br.com.learn.service

import br.com.learn.model.Cat

 fun catsInformations() {
    for (i in 5 downTo 0) {
        println()

        val catAnimalService = Cat("Miau! $i", 4 + i, "Olaff $i", "Felino $i")
        println(catAnimalService)
        println()

        catAnimalService.theAnimalBehavior()
        catAnimalService.theAnimalLikeToo()
        catAnimalService.thisAnimalWillFightYou()

        println("The price of this animal is : " + catAnimalService.priceOfThisAnimal())
    }
}

 fun savingCats() {
    val catAnimalService = Cat("Miau! ", 4, "Olaff ", "Felino")
    catAnimalService.registerAnimal(catAnimalService)
    catAnimalService.registerAnimal(catAnimalService)
    catAnimalService.registerAnimal(catAnimalService)
    catAnimalService.registerAnimal(catAnimalService)
    catAnimalService.registerAnimal(catAnimalService)

    println(catAnimalService.getImmutableAnimals().size)
    catAnimalService.getImmutableAnimals().add(catAnimalService) // immutable list
    println(catAnimalService.getImmutableAnimals().size)

    for (cat in catAnimalService.getImmutableAnimals() as ArrayList<Cat>) {
        println("Cat price : ${cat.priceOfThisAnimal()}")
    }
}
