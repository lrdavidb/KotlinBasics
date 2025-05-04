package com.sesdevs.firsttest.sintaxis

fun main(){
    val name ="dl"
    val role = "admin"
    val age = 20
    if(age >50){
        println("$name es un adulto mayor")
    } else if (age >30){
        println("$name es un adulto joven"
    } else if (age >18){
        println("$name es mayor de edad")
    } else {
        println("$name es menor de edad")
    }
}