# Classes

- Attribute einer Klasse können in den Parentheses (Class Header) deklariert werden
- Oder im Class Body {}
- Attribute können ohne val oder var deklariert werden, diese sind aber nicht zugänglich nach Instanzierung

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Classes.kt"
start="//attributestart"
end="//attributeend"
%}
```

### Instanzen

- Per Default müssen die Attribute aus dem Class Header mitgegeben werden
- Zugänglich sind die Attributer der Instant mit instance.attribut

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Classes.kt"
start="//instancestart"
end="//instanceend"
%}
```

### Data Classes
Sind besonders nützlich um Daten zu speichern. 
Sie beinhalten bereits Member Funktionen, die eine Basis Funktionalität bieten:

- toString()
- equals() oder ==
- copy()

Data Classes werden mit dem **data** Keyword deklariert.

```kotlin
{%
include-markdown "../../kotlin/app/src/main/kotlin/org/example/Classes.kt"
start="//dataclassstart"
end="//dataclassend"
%}
```



