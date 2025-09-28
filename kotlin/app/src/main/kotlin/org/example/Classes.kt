package org.example

//attributestart
class Cat (val name: String, val age: Int) {
    val color: String = ""
}
//attributeend

fun main() {
    //instancestart
    val cat = Cat("Luna", 11)
    val name = cat.name
    //instanceend
}

fun dataClasses() {
    //dataclassstart
    data class User(val name: String, val alter: Int)

    val user1 = User("Tom", 34)
    val user2 = User("Mark", 23)

    // Member Functions
    print(user1)
    val same = user1 == user2
    val user3 = user1.copy()
    //dataclassend
}

