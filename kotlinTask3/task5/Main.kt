package task5

fun main() {
    var sum: Int = 0
    var amount: Int = 0
    for (number in 0..99) {
        if (number % 2 == 0) {
            sum += number
            amount++
        }
    }
    println("sum = $sum")
    println("amount = $amount")
}