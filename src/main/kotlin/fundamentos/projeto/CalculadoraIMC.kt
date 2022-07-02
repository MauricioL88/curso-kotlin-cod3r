package fundamentos.projeto

fun main() {
    print("Digite a sua altura: ")
    val altura = readLine() ?: ""
    print("Digite o seu peso: ")
    val peso = readLine() ?: ""

    // Calculando o IMC
    val resultadoImc: Double = peso.toDouble() / (altura.toDouble() * altura.toDouble())

    // Calculando o limite do peso ideal
    val pesoIdealMin: Double = 18.50 * (altura.toDouble() * altura.toDouble())
    val pesoIdealMax: Double = 24.99 * (altura.toDouble() * altura.toDouble())

    when(resultadoImc) {
        in 0.00..18.49 -> {
            println("\nResultado: Abaixo do peso!\nValor do IMC: %.2f".format(resultadoImc))
            println("Sugestão de peso: %.2f".format(pesoIdealMin) + " a %.2f".format(pesoIdealMax))
        }
        in 18.50..24.99 -> {
            println("\nResultado: Peso normal!\nValor do IMC: %.2f".format(resultadoImc))
            println("Parabéns! Está com o seu peso ideal.")
        }
        in 25.00..29.99 -> {
            println("\nResultado: Acima do peso (Sobrepeso)!\nValor do IMC: %.2f".format(resultadoImc))
            println("Sugestão de peso: %.2f".format(pesoIdealMin) + " a %.2f".format(pesoIdealMax))
        }
        in 30.00..34.99 -> {
            println("\nResultado: Obesidade nível 1!\nValor do IMC: %.2f".format(resultadoImc))
            println("Sugestão de peso: %.2f".format(pesoIdealMin) + " a %.2f".format(pesoIdealMax))
        }
        in 35.00..39.99 -> {
            println("\nResultado: Obesidade nível 2!\nValor do IMC: %.2f".format(resultadoImc))
            println("Sugestão de peso: %.2f".format(pesoIdealMin) + " a %.2f".format(pesoIdealMax))
        }
        in 40.00..99.99 -> {
            println("\nResultado: Obesidade nível 3!\nValor do IMC: %.2f".format(resultadoImc))
            println("Sugestão de peso: %.2f".format(pesoIdealMin) + " a %.2f".format(pesoIdealMax))
        }
    }
}