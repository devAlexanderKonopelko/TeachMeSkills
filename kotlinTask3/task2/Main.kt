package task2

import kotlin.math.max

fun main() {
    println("введите значение переменной a:")
    var a = readLine()!!.toInt()
    println("введите значение переменной b:")
    var b = readLine()!!.toInt()
    println("введите значение переменной c:")
    var c = readLine()!!.toInt()
    var d = max(a * b * c, a + b + c)
    println("max(a*b*c, a+b+c) = $d")
}