package fundamentos

fun imprimirConceito(nota: Any) {
    // Operador "?" deixa a entrada de dados opcional, não obrigatório "Int"
    when(nota as? Int) {
        10, 9 -> println("Conceito A")
        8, 7 -> println("Conceito B")
        6, 5 -> println("Conceito C")
        4, 3 -> println("Conceito D")
        2, 1, 0 -> println("Conceito E")
        else -> println("Informe uma nota válida!")
    }
}

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for(nota in notas) {
        // Convertendo os valores Double para Int
        imprimirConceito(nota.toInt())
    }
}