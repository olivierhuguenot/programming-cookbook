fun main() {

}

fun forLoop() {
    //forloopstart
    for(number in 1..5) {
        print(number)
    }
    //forloopend

    //colitstart
    val numbers = listOf(1,2,3)
    for(number in numbers) {
        print(number)
    }
    //colitend
}

//whenstart
fun whenSwitch() {
    val obj = 2
    when(obj) {
        1 -> print("One")
        2 -> print("Two")
        else -> print("unknown")
    }
}
//whenend

