package br.com.learn.service

import br.com.learn.model.Dog

 fun savingsDogs() {
    val dogAnimalService = Dog("Au au au !! ", 1, "Charlie ", "Late!! ")
    dogAnimalService.registerAnimal(dogAnimalService)
    dogAnimalService.registerAnimal(dogAnimalService)
    dogAnimalService.registerAnimal(dogAnimalService)
    dogAnimalService.registerAnimal(dogAnimalService)
    dogAnimalService.registerAnimal(dogAnimalService)

    println(dogAnimalService.getImmutableAnimals().size)

    for (dog in dogAnimalService.getImmutableAnimals() as ArrayList<Dog>) {
        println("Dog price : ${dog.priceOfThisAnimal()} ")
    }
}
 fun getDogsInformation() {
    for (i in 8 downTo 1) {
        println()
        val dogAnimalService = Dog(
            "Au au au !! $i",
            1 + i, "Charlie $i", "Late!! $i"
        )

        println(dogAnimalService)
        dogAnimalService.theAnimalBehavior()
        dogAnimalService.theAnimalLikeToo()
        dogAnimalService.thisAnimalWillFightYou()
        println("The price of this animal is : " + dogAnimalService.priceOfThisAnimal())
    }
}