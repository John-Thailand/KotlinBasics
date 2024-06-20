package eu.tutorials.kotlinbasics

fun main() {
    var myResult = add(5, 10)
    println(myResult)
}

fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun makeCoffee(sugarCount: Int) {
    println("Coffee with $sugarCount spoons of sugar")
}