package fundamentos.controle

/*
    A varificação desse laço fica após o bloco de instrução
 */

fun main() {
    var opcao: Int

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("A opção escolhida foi: $opcao")
    } while (opcao != -1)

    println("Finalizando...")
}