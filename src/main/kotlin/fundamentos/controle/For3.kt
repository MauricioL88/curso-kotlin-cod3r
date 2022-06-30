package fundamentos.controle

/*
    Laço for controlando a progressão utilizando o operador
    "step".
 */

fun main() {
    println("Forma crescente")
    for(i in 0..100 step 5) {
        println(i)
    }

    println("\nForma decrescente")
    for(i in 100 downTo 0 step 5) {
        println(i)
    }
}