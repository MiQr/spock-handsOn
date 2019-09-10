package com.pb.nine

import spock.lang.IgnoreIf
import spock.lang.Requires
import spock.lang.Shared
import spock.lang.Specification

import java.time.DayOfWeek
import java.time.LocalDate

class IgnoreIfSpec extends Specification {


    @Shared
    def winPath = "C:\\Windows"

    def "test the exception on non windows machine"() {

        given: "A windows path"

        def file = new File(winPath)

        when: "we try to list files in the directory"

        file.listFiles().size()

        then: "NPE is thrown"

        thrown(NullPointerException)

    }

    @IgnoreIf({ !os.windows })
    def "test the path on windows machine only"() {

        given: "A windows path"

        def file = new File(winPath)

        expect: "it contains some files"

        file.listFiles().size() > 0
    }

    //TODO: check spock.util.environment.OperatingSystem






    @Requires({ shouldRunToday() })
    def "run this test only on certain days"() {
        expect: "name of day starts with T"
        LocalDate.now().dayOfWeek.toString().startsWith("T")
    }


    //TODO: change the day and observe




    @Requires({javaVersion > 1.8})
    def "test requires new java"() {
        given: "a string instance"
        String testedString = "someStuff"
        expect: "I can use new string methods"
        testedString.lines()
    }

    static boolean shouldRunToday(){
        LocalDate.now().dayOfWeek == DayOfWeek.TUESDAY
    }
}
