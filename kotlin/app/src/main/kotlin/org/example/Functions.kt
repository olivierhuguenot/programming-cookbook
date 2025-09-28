fun main() {
    sum(5, 2)
    sumShort(3, 6)
    defaultParameter()
    lambdaExpression()

}

//funtypedstart
fun sum(x: Int, y: Int): Int {
    return x + y
}
//funtypedend

//funshortstart
fun sumShort(x: Int, y: Int) = x + y
//funshortend

//fundefaultstart
fun defaultParameter(category: String = "Default") {
    println(category)
}
//fundefaultend

//funlambdastart
fun lambdaExpression() {
    val toUpperCaseString = {text: String -> text.uppercase()}
    println(toUpperCaseString("bitte gross"))
}
//funlambdaend