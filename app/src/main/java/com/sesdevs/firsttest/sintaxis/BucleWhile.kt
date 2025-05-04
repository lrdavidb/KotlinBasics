package dev.josegaldamez.firsttest.sintaxis

fun main(){
    val listOfGirlFriends = listOf<String>()
    var listOfFriends = listOf("Monica", "Ross", "Rachel", "Jose", "Yenifer", "Mariela", "Erick")
    var index = 0

    while( index < listOfGirlFriends.size ){
        println(listOfGirlFriends[index])
        //index = index + 1
        index += 1
        //index++
    }


    println("--------------------------------")


    index = 0

    do{
        println(listOfGirlFriends[index])
        index += 1
    } while(index < listOfGirlFriends.size)


}