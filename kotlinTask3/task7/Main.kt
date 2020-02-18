package task7

import java.lang.StringBuilder

fun main() {
    println(toBinary(86))
    println(toBinaryEasier(86))
}

fun toBinary(number: Int) = with( StringBuilder(""))  {
    var newNumber = number
    while (newNumber != 0) {
            this.append(newNumber % 2)
        newNumber /= 2
    }
    this.reverse()
    this.toString()
}
fun toBinaryEasier(number: Int) = number.toString(2)