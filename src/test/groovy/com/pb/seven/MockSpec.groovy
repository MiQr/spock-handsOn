package com.pb.seven

import com.pb.Publisher
import com.pb.Subscriber
import spock.lang.See
import spock.lang.Specification


class MockSpec extends Specification {

    @See("http://spockframework.org/spock/docs/1.2/interaction_based_testing.html")
    def "events are published to all subscribers"() {
        given:
        def subscriber1 = Mock(Subscriber)
        def subscriber2 = Mock(Subscriber)
        def publisher = new Publisher()

        publisher.add(subscriber1)
        publisher.add(subscriber2)

        when:
        publisher.send("message1")

        then:
        1 * subscriber1.receive("message1")
        1 * subscriber2.receive("message1")

    }

}