package funcoes

import java.util.*

/*
    Definindo um valor padrão para os argumentos.
*/

fun potencia(base: Int = 2, expoente: Int = 1): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main() {
    println("Valor da potência: ${potencia(2, 3)}")
    println("Valor da Base: ${potencia(10)}")
    println("Valor da Base: ${potencia(base = 4)}")
    println("Valor do Expoente: ${potencia(expoente = 8)}")
}