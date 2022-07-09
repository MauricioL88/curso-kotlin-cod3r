package fundamentos.projeto

/*
    Simulando uma autenticação de login e senha com o laço "Do While".
 */

fun main() {
    val login = "lisboa.sse@email.com"
    val senha = "12345"

    do {
        println("Digite o login:")
        val auth1 = readLine() ?: ""
        println("Digite a senha:")
        val auth2 = readLine() ?: ""

        if(auth1 == login) {
            if(auth2 == senha) {
                println("\nAcesso autorizado!\nBem Vindo $login!")
            } else {
                println("\nSenha Inválida!\n")
            }
        } else {
            println("\nLogin Inválido!\n")
        }

    } while(auth1 != login || auth2 != senha)
}