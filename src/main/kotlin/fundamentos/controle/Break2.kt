package fundamentos.controle

/*
    Break rotulado, utiliza-se o "nomeDoRotulo@" para realizar o desvio de um bloco
    de código

    Por convenção não é recomendado usar esse break por estar equiparado com um
    código sujo, desogarnizado.
 */

fun main() {
    externo@for(i in 1..15) {
        for(j in 1..15) {
            if(i == 2 && j == 9) break@externo
            println("I: $i - J: $j")
        }
    }
    println("Fim do código.")
}