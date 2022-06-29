package fundamentos

fun soma(a: Int, b: Int = 5): Int {
    return a + b
}

fun main() {
    println(soma(50,35))
    println(soma(100))
}