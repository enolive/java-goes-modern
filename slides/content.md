# Java goes modern

## going beyond Streaming-API

- <i class="fa fa-user"></i>&nbsp;Christoph Welcz
- <i class="fa fa-calendar" aria-hidden="true"></i>&nbsp;05.07.2018
- <i class="fa fa-twitter" aria-hidden="true"></i>&nbsp;[@ChristophWelcz](https://twitter.com/ChristophWelcz)
- <i class="fa fa-github" aria-hidden="true"></i>&nbsp;[github.com/enolive/java-goes-modern](https://github.com/enolive/java-goes-modern)

<--->

<!-- .slide: data-background-image="resources/fp-club.png" -->

Note: 
- Image &copy; Fight Club (1999)
- Monad Curse: as soon you understood what a monad is, you lose the ability to explain it to others!

<-->

## Why's FP so popular?

<-->

<section tagcloud large>
    Reactive programming
    Microservices
    Cloud
    Expressiveness
    Parallell computing
    Multithreading
    FP languages
    filter/map/reduce
    Promises/Observables
    Stateless
    Immutability
    Lazy Evaluation
    Avoid Nesting
</section>

Note: readability and easy execution on multiple threads/machines

<--->

## Java 8 allows FP!

* Streaming API
* Functional Interfaces
* Optional Type

<-->

```java
List<String> list = Arrays.asList(
    null, "anna", "bernd", "chris", "");

String result = list
    .stream()
    .filter(word -> word != null)
    .filter(word -> !word.isEmpty())
    .map(String::toUpperCase)
    .collect(Collectors.joining(", "));
// result = "ANNA, BERND, CHRIS";
```

<-->

```java
String input = ...;

String result = Optional
    .ofNullable(input)
    .filter(i -> !i.isEmpty())
    .orElseGet(() -> "default value");
// result = "default value"; when input is null or empty
// result = input; otherwise
```

<--->

## Collect too complicated

* allows converting to Map, List, Group, Set, String
* violates SRP 😞

<-->

```java
String sentence = ...;

Map<Character, Long> countChars = sentence
    .chars()
    .boxed()
    .map(i -> (char)i.intValue())
    .collect(Collectors.groupingBy(
        Function.identity(), Collectors.counting()));
```

<-->

## Streaming-API too limited

<-->

<section tagcloud large>
    Either
    Try
    Lazy
    Future
    Tuple
    ordered reduce/fold
    unfold
    indexed operations
    reverse
    cycle
    range
    append/prepend
    partial application
    function composition
    currying
    zipping
    memoization
</section>

<--->

![noborder-icon](resources/vavr.png)

* pronounce as **"waver"**
* first version 2015
* heavily inspired by Scala
* FP collections & data types

Note: all vavr types are immutable, of course 

<--->

## Let's start coding...

<--->

## Interesting stuff

- <i class="fa fa-link" aria-hidden="true"></i>&nbsp;[Vavr documenation](https://docs.vavr.io)
- <i class="fa fa-youtube" aria-hidden="true"></i>&nbsp;[Venkat Subramanian: Let's get lazy](https://www.youtube.com/watch?v=F73kB4XZQ4I)
- <i class="fa fa-youtube" aria-hidden="true"></i>&nbsp;[Bodil Stokke: What every Hipster should know about Functional Programming](https://www.youtube.com/watch?v=mGw_M4PN0iY)
- <i class="fa fa-link" aria-hidden="true"></i>&nbsp;[Marco Emrich: Loops must die! 🇩🇪](https://www.heise.de/developer/artikel/Weg-mit-den-Schleifen-4009774.html?seite=all)
