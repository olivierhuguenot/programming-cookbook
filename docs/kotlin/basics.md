# Kotlin Basics

### Program Entry Point
Eine Startpunkt einer kotlin Applikation ist die **main()** function
```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//mainstart"
end="//mainend"
%}
```

### Variablen
- **val:** Kann gelesen werden
- **var:** Kann geändert und gelesen werden

Können auch ausserhalb einer Funktion, also auf Top Level deklariert werden. 
Empfohlen ist Variablen standardmässig mit val zu initialisieren. Erst wenn benötitgt zu var ändern.

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//variablesstart"
end="//variablesend"
%}
```

### Null safety
In Kotlin wird null genutzt wenn etwas fehlt oder noch nicht gesetzt wurde. 
Die null safety erkennt Probleme mit null zu Compilezeit. Null safety ermöglicht folgende Punkte

- Deklariere explizit wann null Werte erlaubt sind
- Prüfe ob null Werte enthalten sind
- Deklariere Aktionen für null Werte

#### Nullable Types
Standardmässig sind null Werte nicht erlaubt. 
Mit dem Operator **?** kann ich null Werte erlauben.

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//nullsafetystart"
end="//nullsafetyend"
%}
```

#### Safe Calls
Um Objekte sicher zu nutzen die einen null Wert enthalten, nutzt man den safeCall.
Somit werden Errors beim aufrufen von null Werten vermieden

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//safecallstart"
end="//safecallend"
%}
```

#### Elvis Operator
Mit dem Elvis Operator **?:** kann ein Default Wert zurückgegeben werden, wenn ein Null Wert entdeckt wird.

- **linke Seite ?:** Was muss geprüft werden
- **rechte Seite ?:** Was soll zurückgegeben werden wenn null

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//elvisstart"
end="//elvisend"
%}
```

### String Templates
Erlaubt es die Daten in Variablen und Objekte in Strings auszugeben

- Starten mit einem **$**
- Mit Klammern **{$val + 1}** für Berechnungen

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//stringtemplatesstart"
end="//stringtemplatesend"
%}
```

### Basic Types
In Kotlin hat jede Variable und Datenstruktur einen Typ.
Dieser muss nicht angegeben werden, Kotlin erkennt diesen selbst durch **type inference**.

| Category               | Type                        |
|------------------------|-----------------------------|
| Integers               | Byte, Short, Long, Int      |
| Unsigned Integers      | UByte, UShort, ULong U, Int |
| Floating Point numbers | Float, Double               |
| Booleans               | Boolean                     |
| Characters             | Char                        |
| String                 | String                      |

#### Explicit Typed and Type Inference
Kotlin unterstützt Type Inference und erkennt automatisch den Datentyp einer Variable.
Der Typ einer Variable kann auch explizit angegeben werden

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//basictypesstart"
end="//basictypesend"
%}
```

#### Type check
Prüft ob Wert Instanz eines Typs ist

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Basics.kt"
start="//typecheckstart"
end="//typecheckend"
%}
```
