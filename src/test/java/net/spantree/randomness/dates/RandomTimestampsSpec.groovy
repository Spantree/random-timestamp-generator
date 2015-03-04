package net.spantree.randomness.dates

import spock.lang.Specification

import java.time.Instant
import java.time.temporal.ChronoUnit

class RandomTimestampsSpec extends Specification {

    def "generates a random timestamp between two dates"() {
        given:
        Instant then = Instant.now().minus(25, ChronoUnit.DAYS)

        when:
        Instant randomDate = RandomTimestampGenerator.between(then, 20)

        then:
        randomDate
        randomDate.isAfter(then)
        randomDate.isBefore(then.plus(20, ChronoUnit.DAYS))

    }

    def "generates a random list of timestamps"() {
        given:
        Instant then = Instant.now().minus(60, ChronoUnit.DAYS)

        when:
        List<Instant> randomTimestamps = RandomTimestampGenerator.between(then, 20, 100)

        then:
        randomTimestamps.size() == 100
        !randomTimestamps.contains(then)
    }
}

