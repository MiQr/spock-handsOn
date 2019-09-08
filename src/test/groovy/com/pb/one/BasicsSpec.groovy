package com.pb.one

import com.pb.SimpleClass
import spock.lang.Specification

class BasicsSpec extends Specification {

    public void oldStyleTestMadeInJUnitOrSomethingElseWhichIsNotEasyToRead() {
        assert 1 == 1
    }
    //TODO: expect, remove assert


    def "I'm the simplest test possible in spock!"() {
        expect: "this test does pass"
    }
    //TODO: LocalDate


    def "Class constructor sets the fields correctly"() {
        given: "An instance of a class"
        def classInstance = new SimpleClass(2019, "BB4IT")

        expect: "values are set up correctly"
        classInstance.getIntValue() == 2019
        classInstance.getStringValue() == "BB4IT"
    }


    def "Simple class setters are working correctly"() {

        given: "An instance of a class"
        def classInstance = new SimpleClass()

        when: "i set the int value"
        classInstance.setIntValue(2019)

        then: "values are saved correctly"

        classInstance.getIntValue() == 2019
    }
    //TODO: AND


    def "test with a defensive checks passes"() {

        given: "A class instance"
        def someInstance = new SimpleClass()

        expect: "Its initialized to default value"
        someInstance.getStringValue() == "initial"

        when: "I set the string value"
        someInstance.setStringValue("BB4IT")

        then: "Its changed properly"
        someInstance.getStringValue() == "BB4IT"
    }
}
