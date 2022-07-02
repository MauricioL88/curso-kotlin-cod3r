package fundamentos.controle

// Uso do "break"

fun main() {
    for(i in 1..10) {
        if(i == 5) {
            break
        }
        println("Atual: $i")
    }
    // Quando atigido o paramêtro na condicional if logo executado o println abaixo.
    println("Fim do código.")
}