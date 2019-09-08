package com.pb.six

import spock.lang.IgnoreIf
import spock.lang.Shared
import spock.lang.Specification

class IgnoreIfSpec extends Specification {


    @Shared
    def winPath = "C:\\Windows"

    def "test the exception on non windows machine"() {

        given: "A windows path"

        def file = new File(winPath)

        when: "we try to list files in the directory"

        file.listFiles().size()

        then: "throws an exception"

        thrown(NullPointerException)

    }

    @IgnoreIf({ !os.windows })
    def "test the path on windows machine only"() {

        given: "A windows path"

        def file = new File(winPath)

        expect: "it contains some files"

        file.listFiles().size() > 0

    }

}
