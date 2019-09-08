package com.pb.four

import com.pb.Calculator
import com.xlson.groovycsv.CsvParser
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class WhereFromFileSpec extends Specification {

    @Shared
    def inputFile = new File("src/test/resources/calcTestData.csv")


    @Unroll
    def "test using CSV file as provider for values of : #a + #b = #result"() {
        given: "A calculator instance"
        def calc = new Calculator()

        expect: "proper results"

        calc.add(a, b) == result as int

        where:

        [a, b, result] << CsvParser.parseCsv(inputFile.text)

    }
}
