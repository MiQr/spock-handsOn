package com.pb.three

import com.pb.Calculator
import spock.lang.Specification

class WhereSpec extends Specification {


    def "Calculator adds 1 and 2 correctly" () {

        given : "calculator instance"
        def calc = new Calculator()

        expect: "it adds values correctly"

        calc.add(1, 2) == 3
    }

    //TODO: parametrize
    //TODO: add new values
    //TODO: add unroll
    //TODO: modify the parameters






    def "Calculator adds values correctly and returns proper result" () {

        given : "calculator instance"
        def calc = new Calculator()

        expect: "it adds values correctly"

        calc.add(a, b) == result

        where:

        a | b || result
        1 | 2 || 3
        1 | 2 || 4
    }
    //TODO: add new value and fail
    //TODO: add unroll
    //TODO: modify the parameters

}
