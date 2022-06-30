package fundamentos.controle

/*
    Laço for com uma lista.
 */

fun main() {
    val alunos = arrayListOf("Mauricio", "Evelin", "Edna")
    for((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}