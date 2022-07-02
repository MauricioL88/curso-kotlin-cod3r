package fundamentos.controle

/*
    Operador "continue" pula um comando de uma estrutura de comando.
 */

fun main() {
    for(i in 1..10) {
        if(i == 5){
            continue
        }
        println("Valor de I: $i")
    }
    println("Fim do código.")
}