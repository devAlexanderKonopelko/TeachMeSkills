package task4

fun main() {
    println("введите величину стороны a конверта 1:")
    var a = readLine()?.toInt() ?: 0
    println("введите еличину стороны b конверта 1:")
    var b = readLine()?.toInt() ?: 0
    println("введите еличину стороны c конверта 2:")
    var c = readLine()?.toInt() ?: 0
    println("введите еличину стороны d конверта 2:")
    var d = readLine()?.toInt() ?: 0

    if (a < c && b < d || b < c && a < d) println("Конверт 1 можно вложить в конверт 2")
    else if (c < a && d < b || c < b && d < a) println("Конверт 2 можно вложить в конверт 1")
    else println("Ковнерты нельзя вложить друг в друга")

}