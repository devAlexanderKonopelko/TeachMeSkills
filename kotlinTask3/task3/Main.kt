package task3

fun main() {
    println("введите значение рейтинга:")
    var a = readLine()!!.toInt()

    when (a) {
        in 0..19 -> println("Ваша оценка - F")
        in 20..39 -> println("Ваша оценка - E")
        in 40..59 -> println("Ваша оценка - D")
        in 60..74 -> println("Ваша оценка - C")
        in 75..89 -> println("Ваша оценка - B")
        in 90..100 -> println("Ваша оценка - A")
        else -> println("Ошибка ввода")
    }
}