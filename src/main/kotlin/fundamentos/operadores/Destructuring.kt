package fundamentos.operadores

/*
    Elemento que separa e/ou extrai dados de uma estrutura.
 */

data class Carro(val marca: String, val modelo: String)

fun main() {
    // Declarando o Structuring
    val (marca, modelo) = Carro("Fiat","Toro")

    println("Marca: $marca\nModelo: $modelo\n")

    // Destructuring em uma lista
    val (marido, mulher) = listOf("Mauricio", "Evelin")
    println("Casal: $marido e $mulher")
    println()

    // Selecionando um valor determinado numa lista
    // Ignorando a posição da lista com o "_"
    val (_, _, terceiraCor) = listOf("azul", "amarelo", "cinza")
    println("Cor escolhida: $terceiraCor")
}