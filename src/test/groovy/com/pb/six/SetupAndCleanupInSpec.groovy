package com.pb.six

import com.pb.DateLogger
import spock.lang.Shared
import spock.lang.Specification

class SetupAndCleanupInSpec extends Specification {
    @Shared
    def file = new File("testFile.txt")


    def setupSpec() {
        assert !file.exists()
        DateLogger.logTheDate(file)
    }

    def cleanupSpec() {
        file.delete()
        assert !file.exists()
    }


    def "Test that checks if modifying the file works"() {

        when:
        file.append("\n It's going to be a great day!")

        then:
        file.text == "today is SUNDAY\n It's going to be a great day!"
    }



    def "Test that requires some cleanup"() {

        expect:
        file.text == "today is SUNDAY"
    }
    // TODO : run of them separately, then at the same time
    // TODO: setupSpec -> setup


}