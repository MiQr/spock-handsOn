package com.pb.five

import com.pb.ExceptionThrowingClass
import com.pb.WorkException
import spock.lang.Specification

class ExceptionsSpec extends Specification {

    def "Class throws exception when expected and gives a meaningful message"() {

        given: "An instance of a class"
        def myClass = new ExceptionThrowingClass()

        when: "it does some work"
        myClass.doSomeWork()

        then: "the exception is thrown"
        thrown(WorkException)
    }
    //todo:
    // And check the message is "oops!"

}
