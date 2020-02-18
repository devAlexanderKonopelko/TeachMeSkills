package task6

fun main() {
    println(factorial(9))
}

fun factorial(number: Int): Int {
    if (number != 1) return number * factorial(number - 1)
    else return 1
}
