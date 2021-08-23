package br.com.learn.interfaces

import br.com.learn.utils.AnimalsType

interface CreateAnimal {

    fun createAnimal(animalsType: AnimalsType)
    fun createAnimals(vararg animalsType: AnimalsType)

}
