package dev.josegaldamez.firsttest.sintaxis

fun main(){

    val jose = Usuario(
        "Jose",
        32,
        "jose@galdamez.com",
        "DNI7839457")

    val erick = Usuario(
        "Erick",
        32,
        "erick@galdamez.com",
        "DNI78")

    val yenifer = Usuario(
        "Yenifer",
        32,
        "yenifer@galdamez.com",
        "DNI7839457fsaf")

    jose.addFriend(yenifer)
    yenifer.addFriend(erick)
    erick.addFriend(yenifer)
    jose.addFriend(erick)
    yenifer.addFriend(jose)
    erick.addFriend(jose)

    jose.getFriends()
    yenifer.getFriends()
    erick.getFriends()



}