package dev.josegaldamez.firsttest.sintaxis

fun main(){

    mylambda("Jose") { fullname ->
        println("Hola $fullname")
    }

}

fun mylambda( name: String, saludar: (fullname: String) -> Unit ){
    println("Estoy entrando a la funcion lambda")
    saludar("$name Galdamez")
    println("Estoy saliendo de la funcion lambda")
}