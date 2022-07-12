package fundamentos

/*
    Tipo de dado genérico "Any";
    Varificação do tipo de dado utiliza-se a palavra reservada "is";
 */

fun souEsperto(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Tipo de dado errado!")
    }
}

fun main() {
    souEsperto("Oi")
    souEsperto(7)
    souEsperto(true)
}