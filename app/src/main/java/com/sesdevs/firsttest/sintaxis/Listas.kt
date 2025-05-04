package dev.josegaldamez.firsttest.sintaxis

fun main(){

    val friends = listOf<String>("Jose", "Maria", "Peter")
    val ages = listOf<Int>(20, 23, 30)

    /*
    println( friends )
    println( friends[0] )
    println(ages)
    println(ages[0])
    */

    //println(friends.first())
    //println(friends.last())
    // println(friends.size)

    // GET

    //println(friends[0])
    //println(friends.get(0))

    // SET
    // friends.set(0, "Juan") // no se puede editar una lista

    val newFriends = mutableListOf("Jose", "Maria", "Peter")

    newFriends.set(0, "Erick")

    println(newFriends[0])

    newFriends.add("Mariela")
    println(newFriends)




}