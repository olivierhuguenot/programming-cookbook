fun main() {
    lists()
    sets()
}

//liststart
fun lists() {
    val readOnlyFruits = listOf("Apple", "Banana", "Grape")
    val mutableFruits = mutableListOf("Apple", "Banana", "Grape")

    val size = readOnlyFruits.count()           // Länge der Liste
    val item = readOnlyFruits[0]                // "Apple"
    val first = readOnlyFruits.first()          // Erstes Element
    val last = readOnlyFruits.last()            // Letztes Element
    val contains = "Apple" in readOnlyFruits    // Enthält Liste Element

    mutableFruits.add("Orange")
    mutableFruits.remove("Grape")
}
//listend

//setstart
fun sets() {
    val readOnlyAnimals = setOf("Cat", "Dog", "Elephant")
    val mutableAnimals = mutableSetOf("Cat", "Dog", "Elephant")

    val size = readOnlyAnimals.count()          // Länge der Liste
    val first = readOnlyAnimals.first()         // Erstes Element
    val last = readOnlyAnimals.last()           // Letztes Element
    val contains = "Cat" in readOnlyAnimals     // Enthält Liste Element
}
//setend

//mapstart
fun maps() {
    val readOnlyMenu = mapOf("Pommes" to 5.00, "Red Curry" to 12.00, "Burger" to 14.00)
    val mutableMenu = mutableMapOf("Pommes" to 5.00, "Red Curry" to 12.00, "Bruger" to 14.00)

    mutableMenu["Pizza"] = 15.00                        // Paar hinzufügen
    mutableMenu.remove("Pizza")                   // Paar entfernen
    val count = readOnlyMenu.count()                    // Länge = 3

    val item = readOnlyMenu["Pommes"]                   // Value von Key "Pommes"
    val contains = readOnlyMenu.containsKey("Burger")   // Existiert Key
    val contains2 = "Pommes" in readOnlyMenu            // Existiert Key
    val contains3 = 5.00 in readOnlyMenu.values         // Existiert Value
    val nonExistingItem = readOnlyMenu["Test"]          // Ergibt Null

    val keys = readOnlyMenu.keys                        // ["Pommes", "Red Curry", "Burger"]
    val value = readOnlyMenu.values                     // ["5.00", "12.00", "14.00"]
}
//mapend