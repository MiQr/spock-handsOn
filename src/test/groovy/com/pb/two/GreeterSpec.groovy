package com.pb.two

import com.pb.GroovyGreeter
import com.pb.JavaGreeter
import com.pb.KotlinGreeter
import spock.lang.Specification

class GreeterSpec extends Specification {


    def "Java greeter works!"() {

        given: "an instance of JavaClass"

        def testedClass = new JavaGreeter()

        expect: "greeter returns Java response"

        testedClass.greet() == "Hello from Java"

    }





    def "Kotlin greeter works!"() {

        given: "an instance of Kotlin class"

        def testedClass = new KotlinGreeter()

        expect: "greeter returns Kotlin response"

        testedClass.greet() == "Hello from Kotlin"

    }




    def "Groovy greeter works!"() {

        given: "an instance of Groovy Class"

        def testedClass = new GroovyGreeter()

        expect: "greeter returns Groovy response"

        testedClass.greet() == "Hello from Groovy"

    }


}