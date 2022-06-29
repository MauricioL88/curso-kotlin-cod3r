package fundamentos

fun main() {
    // Declaracação de variáveis usa-se "var"
    // Constantes usa-se "val"
    // A interabilidade com o Java ao utilizar a biblioteca java.lang

    var name: String
    var lastName = "Lisboa"

    name = "Maurício"

    println("Nome digitado: $name $lastName")

    val raio = 4.5
    val result: Double = raio * raio * Math.PI
    println(result)
}