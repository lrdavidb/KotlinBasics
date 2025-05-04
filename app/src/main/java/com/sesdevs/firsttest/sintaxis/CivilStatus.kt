package dev.josegaldamez.firsttest.sintaxis

sealed class CivilStatus {
    object Single : CivilStatus()
    object Comprometed : CivilStatus()
    object Married : CivilStatus()
    object Divorced : CivilStatus()
}