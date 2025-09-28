package org.example

//mainstart
fun main() {
    variables()
    stringtemplates()
    basicTypes()
    nullSafety()
    safeCall()
    elvis()
}
//mainend


fun variables() {
    //variablesstart
    val price = 5
    var items = 2
    println("Price for $items items:" + price * items)
    items = 10
    println("Price for $items items:" + price * items)
    //variablesend
}


fun stringtemplates() {
    //stringtemplatesstart
    val number = 5;
    println("The number is: $number")
    println("The number is: ${number + 1}")
    //stringtemplatesend
}

fun basicTypes() {
    //basictypesstart
    var a: Int                  // Deklariert
    a = 5                       // Initialisiert
    val b: String = "Hello"     // Explicitly Typed
    val c = 2.5                 // Infered
    //basictypesend
    //typecheckstart
    if(a is Int) {
        a = a + 1
    }
    //typecheckend
}


fun nullSafety() {
    //nullsafetystart
    var neverNull: String = "Niemals null"
    // neverNull = null würde Compile Error werfen

    var nullable: String? = "Kann null sein"
    nullable = null
    //nullsafetyend

    println(neverNull)
    println(nullable)
}

fun safeCall() {
    //safecallstart
    var nullText: String? = null
    nullText = nullText?.uppercase()
    // Wirft kein Error, sondern nullText bleibt null
    //safecallend

    println(nullText)
}

fun elvis() {
    //elvisstart
    var nullText: String? = null
    nullText = nullText ?: "alternativ Text bei null"
    //elvisend

    println(nullText)
}
