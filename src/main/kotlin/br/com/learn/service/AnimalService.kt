package br.com.learn.service

import br.com.learn.model.Animals

class AnimalService {
    fun createAnimal() {
        var animal = Animals()
        animal.setBehavior("Late")
        animal.setAge(2)
        animal.setName("Charlie")
        animal.setBreed("Cachorro")
        println(animal)
    }
}