package funcoes

/*
    Tem o objetivo de facilitar a identificações dos argumentos e
    não tem a obrigação de ser declarados na ordem original da função.
*/

fun relacaoCasal(marido: String, esposa: String): String {
    return "$marido é marido de $esposa!"
}

fun main() {
    // Power Safe Mode da IDE desligado
    println(relacaoCasal("Evelin", "Maurício"))

    // Realizando a nomeação dos argumentos de uma função
    println("\n" + relacaoCasal(esposa = "Evelin" ,marido = "Mauricio"))
}