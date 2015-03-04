# Random Timestamp Generator for Java 8.

We can generate a random timestamp:

```java
Instant then = Instant.now().minus(25, ChronoUnit.DAYS)
Instant randomTimestamp = RandomTimestampGenerator.between(then, 20)
```

And we can also generate a list of random timestamps:
```java
Instant then = Instant.now().minus(60, ChronoUnit.DAYS)
List<Instant> randomTimestamps = RandomTimestampGenerator.between(then, 20, 100)
```

## between(Instant lowerBound, int rangeOfDays)
Generates a random __Instant__ that is between the __lowerBound__ instant and the __rangeOfDays__ after the lowerBound.

## between(Instant lowerBound, int rangeOfDays, int numberOfInstants)
Generates a list of Instants (of size _numberOfInstants) between the __lowerBound__ and the __rangeOfDays__ after the __lowerBound__.