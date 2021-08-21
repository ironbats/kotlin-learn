package br.com.learn.main

import br.com.learn.model.Dog
import br.com.learn.service.catsInformations
import br.com.learn.service.getDogsInformation
import br.com.learn.service.savingCats
import br.com.learn.service.savingsDogs

fun main() {

    catsInformations()
    println()
    getDogsInformation()
    savingCats()
    println("Trying to save the next Animal !!")
    savingsDogs()
}

