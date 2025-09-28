# Collections
Eine Collection in Kotling kann mutable oder unmutable sein:

- Lists: Sortierte Elemente
- Sets: Unsortierte und Einmalige Elemente
- Maps: Sets aus Key-Value Paaren mit Einmaligem Key

### Lists
Sortiert und erlaubt Duplikate.
Um eine List zu erstellen nutzt man die Methode listOf() oder mutableListOf()

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Collections.kt"
start="//liststart"
end="//listend"
%}
```

### Sets
Unsortiert und enthält **keine** Duplikate.
Um ein Set zu erstellen nutzt man die Methode setOf() oder mutableSetOf().
Da Sets unordered sind, kann ich keine Elements an einem spezifischen Index abrufen.

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Collections.kt"
start="//setstart"
end="//setend"
%}
```

### Maps
Besteht aus Key-Value Paaren.
Der Key ist **einmalig**, da er zur Suche des Value genutzt wird. Values dürfen Duplikate enthalten.
Um ein Map zu erstellen nutzt man die Methode mapOf() oder mutableMapOf().

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Collections.kt"
start="//mapstart"
end="//mapend"
%}
```

