package eu.tutorials.kotlinbasics

fun main() {
    // val shoppingList = listOf("Processor", "RAM", "Graphics Card")
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card")

    shoppingList.add("Memory")
    shoppingList.remove("Processor")

    println(shoppingList)
}