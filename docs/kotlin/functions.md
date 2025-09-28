# Functions

### Allgemein

- Funktionen werden mit <span style="color:blue">fun</span> deklariert
- Parameter brauchen einen Typ
- Der Return Type kommt nach den Parentheses ()
- main() ist der Einstiegspunkt eines Programms

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Functions.kt"
start="//funtypedstart"
end="//funtypedend"
%}
```

### Single Expression
Die {} können durch ein = ersetzt werden, um die Funktion zu kürzen. 

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Functions.kt"
start="//funshortstart"
end="//funshortend"
%}
```

### Default Parameter
Sind Fixe Parameter die einer Funktion übergeben werden.
Müssen beim Funktionsaufruf nicht angegeben werden

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Functions.kt"
start="//fundefaultstart"
end="//fundefaultend"
%}
```

### Lambda Expressions
Die Lambda Expression wird in eine Variable gespeichert oder übergeben.
Die Variable kann wie eine Funktion aufgerufen und ausgeführt werden

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Functions.kt"
start="//funlambdastart"
end="//funlambdaend"
%}
```


