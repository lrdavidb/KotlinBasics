package dev.josegaldamez.firsttest.sintaxis

fun main(){

    val listOfPokemos = mutableListOf<String>("Pikachu","Charmander","Squirtle")
    listOfPokemos.add("Bulbasaur")
    listOfPokemos.add("Mew")
    listOfPokemos.add("Pikachu")

    println("Lista de pokemons")
    println(listOfPokemos)

    val setOfPokemos = mutableSetOf<String>("Pikachu","Charmander","Squirtle")
    setOfPokemos.add("Bulbasaur")
    setOfPokemos.add("Mew")
    setOfPokemos.add("Pikachu")

    println("Set de pokemons")
    // println(setOfPokemos[0] )
    // Error, el set contiene valores no ordenados o no indexables



}