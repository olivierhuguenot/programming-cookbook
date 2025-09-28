# Loops And When

### Loops

#### Ranges
In Kotlin können Ranges definiert werden. Dies funktioniert auch für Chars

- **1..4** steht für 1 bis 4
- **1..<4** steht für 1 bis 3
- **4 downTo 1** steht für 4 bis 1
- **1..5 step 2** steht für 1, 3, 5

#### For
Im For-Loop können Ranges geutzt werden
```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/LoopsAndWhen.kt"
start="//forloopstart"
end="//forloopend"
%}
```

So wird über eine Collection iteriert
```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/LoopsAndWhen.kt"
start="//colitstart"
end="//colitend"
%}
```

### When
When ist ähnlich zum Switch in Java. Dient für Conditions mit mehreren Branches.
Kann ein Statement zurückzugeben oder um ein Expression ausführen.
Die erste Condition die Zutrifft wird ausgeführt
```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/LoopsAndWhen.kt"
start="//whenstart"
end="//whenend"
%}
```