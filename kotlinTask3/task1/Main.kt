package task1

fun main() {
    println("введите значение переменной a:")
    var a = readLine()!!.toInt()
    println("введите значение переменной b:")
    var b = readLine()!!.toInt()

    if (a % 2 == 0) println("a * b = ${a * b}")
    else println("a + b = ${a + b}")
}