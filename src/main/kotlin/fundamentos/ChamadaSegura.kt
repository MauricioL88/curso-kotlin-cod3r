package fundamentos

// Chamada de variáveis com valor nulo.

fun main() {
    var a: Int? = null // Safe Call Operator "?" - Atribui valores nulos
    println(a?.dec())

    println()
    // Operador Elvis "?:"
    // Define uma valor padrão caso o valor primário seja nulo.
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão"

    println(obrigatorio)
}