package eu.tutorials.kotlinbasics

class Dog (val name: String, val breed: String) {
    init {
        bark()
    }

    fun bark() {
        println("$name Woof Woof")
    }
}