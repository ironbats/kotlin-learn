package br.com.learn.service

import br.com.learn.model.Animals

class AnimalService {
    fun createAnimal() {
        var animal = Animals("Late",
            2,"Charlie","Cachorro")
        println(animal)
    }
}