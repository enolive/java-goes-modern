# Java goes modern

## going beyond Streaming-API

- <i class="fa fa-user"></i>&nbsp;Christoph Welcz
- <i class="fa fa-calendar" aria-hidden="true"></i>&nbsp;14.06.2018
- <i class="fa fa-twitter" aria-hidden="true"></i>&nbsp;[@ChristophWelcz](https://twitter.com/ChristophWelcz)
- <i class="fa fa-github" aria-hidden="true"></i>&nbsp;[github.com/enolive/java-goes-modern](https://github.com/enolive/java-goes-modern)

<--->

<!-- .slide: data-background-image="resources/fp-club.png" -->

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
```

<--->

## Collect too complicated

* allows converting to Map, List, Group, Set, String
* violates SRP 😞

<-->

```java
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
    ordered reduce/fold
    unfold
    indexed operations
    reverse
    cycle
    range
    append/prepend
    partial application
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

<--->

## Coding

<--->

# Interesting stuff

- <i class="fa fa-github" aria-hidden="true"></i>&nbsp;[My GitHub Repo with slides and code](https://github.com/enolive/java-goes-modern)
- <i class="fa fa-youtube" aria-hidden="true"></i>&nbsp;[Venkat Subramanian: Let's get lazy](https://www.youtube.com/watch?v=F73kB4XZQ4I)
- <i class="fa fa-youtube" aria-hidden="true"></i>&nbsp;[Bodil Stokke: What every Hipster should know about Functional Programming](https://www.youtube.com/watch?v=mGw_M4PN0iY&t=6shttps://www.youtube.com/watch?v=mGw_M4PN0iY&t=6s)