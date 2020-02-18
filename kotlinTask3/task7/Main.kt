package task7

import java.lang.StringBuilder

fun main() {
    println(toBinary(86))
    println(toBinaryEasier(86))
}

fun toBinary(number: Int): String {
    var binary: StringBuilder = StringBuilder("")
    var newNumber = number
    while (newNumber != 0) {
            binary.append(newNumber % 2)
        newNumber /= 2
    }
    binary.reverse()
    return binary.toString()
}
fun toBinaryEasier(number: Int): String {
    return number.toString(2)
}