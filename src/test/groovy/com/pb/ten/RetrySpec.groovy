package com.pb.ten

import spock.lang.Specification

class RetrySpec extends Specification {

    def "flaky test that sometimes fails"() {
        given: "a random number"
            def randomNumber = new Random().nextInt(100)
            println randomNumber
        expect: "its value is above 75"
            randomNumber > 90
    }
    //TODO: add Retry()
    //TODO: parametrize retry with count
}
