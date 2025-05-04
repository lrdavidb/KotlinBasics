package dev.josegaldamez.firsttest.sintaxis

fun main(){

    val mapOfPokemos = mutableMapOf("pikachu" to "electric", "charmander" to "fire")

    println(mapOfPokemos["pikachu"])

    mapOfPokemos.put( "squirtle", "water")
    mapOfPokemos["Mew"] = "psychic"

    println(mapOfPokemos)

}