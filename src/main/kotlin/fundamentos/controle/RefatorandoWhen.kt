package fundamentos.controle

fun main() {
    val nota: Int = 10

    when(nota) {
        10,9 -> print("Nota: $nota\nFantástico!")
        8,7 -> print("Nota: $nota\nParabéns!")
        6,5 -> print("Nota: $nota\nPode Melhorar!")
        in 0..4 -> print("Nota: $nota\nVai repetir o semestre!")
        else -> print("Nota inválida!")
    }
}